package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113434e;

    public lr(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str) {
        this.f113433d = etVar;
        this.f113434e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um2.x5 startUIC;
        com.tencent.mm.plugin.finder.live.view.k0 R0 = this.f113433d.R0();
        fm2.c cVar = R0 instanceof fm2.c ? (fm2.c) R0 : null;
        if (cVar == null || (startUIC = cVar.getStartUIC()) == null) {
            return;
        }
        startUIC.a0(this.f113434e);
    }
}
