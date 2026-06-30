import os

content = """package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

class ForwardLimitFeature : BaseFeature() {

    companion object {
        private const val TAG = "ForwardLimit"
        // 观察模式：Hook所有方法但只记日志，不修改行为
        // 用户操作后从日志中找到真正触发的方法，再切换为拦截模式
        private val DISCOVERY_MODE = true
    }

    override val key = "forward_limit"
    override val name = "RemoveForwardLimit"

    private lateinit var module: XposedModule

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        // Phase A: Observe SelectContactUI and related for 9-limit discovery
        observeAll(classLoader, "com.tencent.mm.ui.contact.SelectContactUI")
        observeAll(classLoader, "com.tencent.mm.pluginsdk.ui.MultiSelectContactView")
        observeAll(classLoader, "com.tencent.mm.ui.contact.MMBaseSelectContactUI")

        // Phase B: Observe forward preview and chat for type-check discovery
        observeAll(classLoader, "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")
        observeAll(classLoader, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
        observeAll(classLoader, "com.tencent.mm.ui.chatting.ChattingUI")

        // Phase C: Also try to observe message item views (context menu origin)
        tryObserveViewItems(classLoader)

        // Phase D: Broad interceptors for common patterns (active even in discovery mode)
        broadInterceptBoolean(classLoader, "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")

        module.log(Log.INFO, TAG, "All observers installed. DISCOVERY_MODE=" + DISCOVERY_MODE)
    }

    private fun observeAll(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            val methods = clz.declaredMethods
            module.log(Log.INFO, TAG, "OBSERVE: " + clsName.substringAfterLast('.') + " [" + methods.size + " methods]")
            for (m in methods) {
                val rt = m.returnType
                val ptypes = m.parameterTypes
                val paramStr = ptypes.joinToString(",") { it.simpleName ?: "?" }
                module.hook(m).intercept { chain ->
                    val result = chain.proceed()
                    // Only log in discovery mode or when feature is on
                    if (DISCOVERY_MODE || FeatureConfig.forwardLimit) {
                        val shortResult = when (result) {
                            null -> "null"
                            is Boolean -> if (result) "T" else "F"
                            is Number -> result.toString()
                            is String -> if (result.length > 20) result.substring(0, 20) + ".." else result
                            else -> result.javaClass.simpleName ?: "obj"
                        }
                        module.log(Log.INFO, TAG, "CALL: " + clsName.substringAfterLast('.') +
                            "." + m.name + "(" + paramStr + ") -> " + shortResult)
                    }
                    // In discovery mode, don't modify. Otherwise, override boolean/int
                    if (!DISCOVERY_MODE && FeatureConfig.forwardLimit) {
                        if (rt == Boolean::class.javaPrimitiveType && result as? Boolean == false) {
                            return@intercept true
                        }
                        if ((rt == Int::class.java || rt == Int::class.javaPrimitiveType) &&
                            (result as? Int ?: 0) in 1..100) {
                            return@intercept Int.MAX_VALUE
                        }
                    }
                    result
                }
            }
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, clsName.substringAfterLast('.') + " NOT FOUND: " + (e.message ?: ""))
        }
    }

    private fun tryObserveViewItems(classLoader: ClassLoader) {
        // Try common chat view item classes that control context menu
        val candidates = listOf(
            "com.tencent.mm.ui.chatting.d",
            "com.tencent.mm.ui.chatting.e",
            "com.tencent.mm.ui.chatting.f",
            "com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsg",
        )
        for (cls in candidates) {
            try {
                observeAll(classLoader, cls)
            } catch (_: Throwable) {}
        }
    }

    private fun broadInterceptBoolean(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            for (m in clz.declaredMethods) {
                if (m.returnType == Boolean::class.javaPrimitiveType) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        val orig = chain.proceed()
                        if (!DISCOVERY_MODE && orig as? Boolean == false) {
                            module.log(Log.INFO, TAG, "INTERCEPT: " + clsName.substringAfterLast('.') + "." + m.name + "() false->true")
                            return@intercept true
                        }
                        orig
                    }
                }
            }
        } catch (_: Throwable) {}
    }
}
"""

path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\features\ForwardLimitFeature.kt"
with open(path, "w", encoding="utf-8") as f:
    f.write(content)
print("ForwardLimitFeature.kt rewritten OK")
