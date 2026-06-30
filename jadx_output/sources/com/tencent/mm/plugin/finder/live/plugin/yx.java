package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f115240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115241e;

    public yx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, java.lang.String str) {
        this.f115240d = tyVar;
        this.f115241e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f115240d;
        tyVar.U.setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(new mn2.q3(this.f115241e, com.tencent.mm.plugin.finder.storage.y90.f128355e), tyVar.T, g1Var.h(mn2.f1.H));
    }
}
