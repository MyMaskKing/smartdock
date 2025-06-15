package cu.axel.smartdock

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import java.util.*

class SmartDockApplication : Application() {
    override fun attachBaseContext(base: Context) {
        // 创建配置对象
        val config = Configuration(base.resources.configuration)
        
        // 设置默认语言为中文
        config.setLocale(Locale.SIMPLIFIED_CHINESE)
        
        // 使用新的配置创建上下文
        val context = base.createConfigurationContext(config)
        super.attachBaseContext(context)
    }

    override fun onCreate() {
        super.onCreate()
        // 设置默认语言为中文
        val locale = Locale.SIMPLIFIED_CHINESE
        Locale.setDefault(locale)
        
        val config = resources.configuration
        config.setLocale(locale)
        createConfigurationContext(config)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
} 