import os

content = """package com.muchen.weiplus.features

import android.app.Activity
import android.util.Log
import io.github.libxposed.api.XposedModule

class ForwardLimitFeature : BaseFeature() {

    companion object {
        private const val TAG = "ForwardLimit"
    }

    override val key = "forward_limit"
    override val name = "RemoveForwardLimit"

    private lateinit var module: XposedModule

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        // Strategy 1: Hook Activity.onCreate to discover ALL forward/select activities
        hookActivityCreate(classLoader)

        // Strategy 2: Observe known target classes
        observeMethods(classLoader, "com.tencent.mm.ui.contact.SelectContactUI")
        observeMethods(classLoader, "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")
        observeMethods(classLoader, "com.tencent.mm.ui.chatting.ChattingUI")
        observeMethods(classLoader, "com.tencent.mm.pluginsdk.ui.MultiSelectContactView")

        // Strategy 3: Broad boolean interceptor on ForwardMsgPreviewUI
        try {
            val clz = classLoader.loadClass("com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI")
            for (m in clz.declaredMethods) {
                if (m.returnType == Boolean::class.javaPrimitiveType) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        val orig = chain.proceed()
                        if (orig as? Boolean == false) {
                            module.log(Log.INFO, TAG, "INTERCEPT: ForwardMsgPreviewUI." + m.name + "() F->T")
                        }
                        return@intercept true
                    }
                }
            }
        } catch (_: Throwable) {}

        // Strategy 4: Also try the chat adapter class for context menu
        try {
            val adapterCls = classLoader.loadClass("com.tencent.mm.ui.chatting.d")
            for (m in adapterCls.declaredMethods) {
                if (m.returnType == Boolean::class.javaPrimitiveType) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        return@intercept true
                    }
                    module.log(Log.INFO, TAG, "ChatAdapter.d." + m.name + "() Hook OK")
                }
            }
        } catch (_: Throwable) {}

        module.log(Log.INFO, TAG, "v3 installed: Activity observer + broad interceptor")
    }

    private fun hookActivityCreate(classLoader: ClassLoader) {
        try {
            val activityClass = classLoader.loadClass("android.app.Activity")
            val onCreateMethod = activityClass.getDeclaredMethod("onCreate", android.os.Bundle::class.java)
            module.hook(onCreateMethod).intercept { chain ->
                chain.proceed()
                val activity = chain.thisObject as? Activity ?: return@intercept null
                val clsName = activity.javaClass.name
                val simpleName = activity.javaClass.simpleName ?: clsName
                val lower = clsName.lowercase()
                if (lower.contains("forward") || lower.contains("transmit") || lower.contains("retrans") ||
                    lower.contains("selectcontact") || lower.contains("selectconv") || lower.contains("multiselect") ||
                    lower.contains("sharehistory") || lower.contains("msgrecord") || lower.contains("chatrecord") ||
                    lower.contains("convbox")) {
                    module.log(Log.INFO, TAG, "ACTIVITY: " + clsName)
                    // Auto-observe this activity's methods
                    try { observeMethods(classLoader, clsName) } catch (_: Throwable) {}
                }
                null
            }
            module.log(Log.INFO, TAG, "Activity.onCreate Hook OK")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Activity hook fail: " + (e.message ?: ""))
        }
    }

    private fun observeMethods(classLoader: ClassLoader, clsName: String) {
        try {
            val clz = classLoader.loadClass(clsName)
            val methods = clz.declaredMethods
            var boolCount = 0
            var intCount = 0
            for (m in methods) {
                val rt = m.returnType
                val ptypes = m.parameterTypes
                val paramStr = ptypes.joinToString(",") { it.simpleName ?: "?" }
                val name = m.name

                // Hook and observe - but also INTERCEPT boolean and int methods
                module.hook(m).intercept { chain ->
                    val result = chain.proceed()
                    if (FeatureConfig.forwardLimit) {
                        val short = when (result) {
                            null -> "null"
                            is Boolean -> if (result) "T" else "F"
                            is Number -> result.toString().take(10)
                            else -> (result.javaClass.simpleName ?: "obj").take(15)
                        }
                        module.log(Log.INFO, TAG, "CALL " + clsName.substringAfterLast('.') + "." + name +
                            "(" + paramStr + ")->" + short)

                        // Auto-intercept: boolean false -> true
                        if (rt == Boolean::class.javaPrimitiveType && result as? Boolean == false) {
                            module.log(Log.INFO, TAG, "  AUTO-INTERCEPT " + name + " F->T")
                            return@intercept true
                        }
                        // Auto-intercept: small int -> MAX
                        if ((rt == Int::class.java || rt == Int::class.javaPrimitiveType) &&
                            (result as? Int ?: 0) in 1..100) {
                            module.log(Log.INFO, TAG, "  AUTO-INTERCEPT " + name + " " + result + "->MAX")
                            return@intercept Int.MAX_VALUE
                        }
                    }
                    result
                }

                if (rt == Boolean::class.javaPrimitiveType) boolCount++
                if (rt == Int::class.javaPrimitiveType) intCount++
            }
            module.log(Log.INFO, TAG, "OBSERVE " + clsName.substringAfterLast('.') +
                " [" + methods.size + "m, " + boolCount + "bool, " + intCount + "int]")
        } catch (e: Throwable) {
            // silently skip classes that fail to hook
        }
    }
}
"""

path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\features\ForwardLimitFeature.kt"
with open(path, "w", encoding="utf-8") as f:
    f.write(content)
print("v3 written OK")
