package com.tencent.mm.plugin.performance.jectl;

/* loaded from: classes12.dex */
public final /* synthetic */ class a$$a implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String u17 = com.tencent.mm.plugin.performance.jectl.a.f152996a.u("JV_KEY_LAST_JE_VERSION_STRING", "");
        if (android.text.TextUtils.isEmpty(u17)) {
            return "";
        }
        return "jemalloc:" + u17;
    }
}
