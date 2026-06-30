package zx1;

/* loaded from: classes7.dex */
public class a implements vx1.e {
    @Override // vx1.f
    public boolean a(int i17) {
        if (i17 != 24 && i17 != 25) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "api " + i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weakglobal_fix, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "Expt : " + Ni);
        if (Ni == 0) {
            return false;
        }
        if (Ni == 2) {
            com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix");
            R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_END_BOOLEAN", false);
            R.putBoolean("SYSTEM_CRASH_PROTECT_WEAK_GLOBAL_REF_START_BOOLEAN", false);
        }
        return true;
    }

    @Override // vx1.f
    public boolean b() {
        com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook.init();
        try {
            com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook.calculateOffset();
            new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "init finish");
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.view.RenderNode").getDeclaredMethod("nCreate", java.lang.String.class);
            java.lang.reflect.Method method = com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook.class.getMethod("calculateOffset", new java.lang.Class[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "reflect finish");
            com.tencent.mm.plugin.crashfix.jni.JNIEnvNewWeakGlobalRefHook.hook(declaredMethod, method);
            new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeakGlobalRefFix", "succ");
        } catch (java.lang.Exception unused) {
            com.tencent.mm.sdk.platformtools.o4.R("weakglobal_fix").putInt("SYSTEM_CRASH_PROTECT_WEAKGLOBALREF_HOOK_RESULT", -5);
        }
        return true;
    }
}
