package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class i7 extends android.database.ContentObserver {
    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        super.onChange(z17, uri);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenShotUtil", "contentObserver onChange, not in main process, skip, check if there is any mistakes?");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, uri: " + uri);
        if (uri == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "contentObserver onChange, uri is null, skip");
            return;
        }
        r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.o.f(uri2, "toString(...)");
        if (!tVar.a(uri2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, return: uri not matched");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, removePreviousTask: " + ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.ScreenShotUtil"));
        ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.sdk.platformtools.h7(uri), 300L, "MicroMsg.ScreenShotUtil");
    }
}
