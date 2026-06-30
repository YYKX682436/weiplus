package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h51 f151044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151045f;

    public b2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, r45.h51 h51Var, fm3.u uVar) {
        this.f151043d = musicMvMainUIC;
        this.f151044e = h51Var;
        this.f151045f = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.P6(this.f151043d, this.f151044e, this.f151045f.hashCode());
    }
}
