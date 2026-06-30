package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes4.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ee f185783d;

    public i0(r45.ee eeVar) {
        this.f185783d = eeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("MpShareVideoImage", 2, null);
        r45.ee eeVar = this.f185783d;
        byte[] j17 = N.j(eeVar.f373341f);
        java.lang.String b17 = tv.a.b(eeVar.f373343h);
        if (j17 != null) {
            com.tencent.mm.vfs.w6.S(b17, j17, 0, j17.length);
        }
        N.d();
    }
}
