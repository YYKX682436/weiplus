package com.tencent.mm.plugin.lite;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.w f143473d;

    public h0(com.tencent.mm.plugin.lite.w wVar) {
        this.f143473d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.y n17 = gm0.j1.n();
        com.tencent.mm.plugin.lite.w wVar = this.f143473d;
        n17.a(wVar.f144532l);
        if (gm0.j1.n().f273288b.f70764d != null) {
            gm0.j1.n().f273288b.f70764d.h1(wVar.f144533m);
        }
    }
}
