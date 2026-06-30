package com.tencent.mm.plugin.taskbar.ui.dynamicbackground;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl;", "Llq/c;", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "", "getSleepTimeInMsPerFrame", "Ljz5/f0;", "loadDynamicBgLibrary", "", "isEnableNativeDynamicBackground", "isInitCrash", "markDrawEndPoint", "markDrawStartPoint", "markWillCrash", "needMarkDrawPoint", "onInitCrash", "onInitStart", "onInitEnd", "enable", "setEnableNativeDynamicBackground", "willCrash", "<init>", "()V", "Companion", "jh4/g", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DynamicBgServiceImpl implements lq.c {
    public static final jh4.g Companion = new jh4.g(null);
    private static final java.lang.String TAG = "MicroMsg.DynamicBgServiceImpl";
    private byte _hellAccFlag_;

    @Override // lq.c
    public android.graphics.Point getDisplayRealSize(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.ui.bk.h(context);
    }

    @Override // lq.c
    public float getSleepTimeInMsPerFrame() {
        return jh4.c.f299848c;
    }

    @Override // lq.c
    /* renamed from: isEnableNativeDynamicBackground */
    public boolean getIsEnable() {
        return gh4.j0.b();
    }

    @Override // lq.b
    public boolean isInitCrash() {
        return jh4.e.f299855c;
    }

    @Override // lq.c
    public void loadDynamicBgLibrary() {
        com.tencent.mars.xlog.Log.i(TAG, "loadDynamicBgLibrary");
        if (gh4.j0.b()) {
            jh4.e.c();
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("dynamicBg");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "DynamicBackgroundNative exception", new java.lang.Object[0]);
            jh4.e.b();
        }
    }

    @Override // lq.b
    public void markDrawEndPoint() {
        jh4.e.a();
    }

    @Override // lq.b
    public void markDrawStartPoint() {
        if (jh4.e.f299853a == null) {
            jh4.e.f299853a = com.tencent.mm.sdk.platformtools.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = jh4.e.f299853a;
        if (sharedPreferences != null) {
            int i17 = sharedPreferences.getInt("dynamic_bg_draw_start_point_count", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markDrawStartPoint current: %d", java.lang.Integer.valueOf(i17));
            if (i17 > 2) {
                gh4.j0.c(false);
                jh4.e.f299853a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            jh4.e.f299853a.edit().putInt("dynamic_bg_draw_start_point_count", i17 + 1).apply();
        }
    }

    @Override // lq.b
    public void markWillCrash() {
        android.content.SharedPreferences sharedPreferences = jh4.e.f299853a;
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markWillCrash");
        if (jh4.e.f299853a == null) {
            jh4.e.f299853a = com.tencent.mm.sdk.platformtools.x2.d();
        }
        if (jh4.e.f299853a != null) {
            gh4.j0.c(false);
            jh4.e.f299853a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
        }
        jh4.e.f299854b = true;
    }

    @Override // lq.b
    public boolean needMarkDrawPoint() {
        return jh4.e.f299856d;
    }

    @Override // lq.b
    public void onInitCrash() {
        jh4.e.b();
    }

    @Override // lq.b
    public void onInitEnd() {
        android.content.SharedPreferences sharedPreferences = jh4.e.f299853a;
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitEndPoint");
        jh4.e.f299853a.edit().putInt("dynamic_bg_init_start_point_count", 0).apply();
        jh4.e.f299853a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
        jh4.e.f299853a.edit().putBoolean("dynamic_bg_init_crash", false).apply();
        jh4.e.f299854b = false;
        jh4.e.f299855c = false;
        gh4.j0.c(true);
    }

    public void onInitStart() {
        jh4.e.c();
    }

    @Override // lq.c
    public void setEnableNativeDynamicBackground(boolean z17) {
        gh4.j0.c(z17);
    }

    @Override // lq.b
    public boolean willCrash() {
        return jh4.e.f299854b;
    }
}
