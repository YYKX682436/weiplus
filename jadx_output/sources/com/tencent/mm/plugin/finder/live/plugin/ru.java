package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ru implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114194e;

    public ru(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, java.lang.String str) {
        this.f114193d = ivVar;
        this.f114194e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114193d;
        ivVar.f113023x0.setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(new mn2.q3(this.f114194e, com.tencent.mm.plugin.finder.storage.y90.f128355e), ivVar.f113013p0, g1Var.h(mn2.f1.H));
    }
}
