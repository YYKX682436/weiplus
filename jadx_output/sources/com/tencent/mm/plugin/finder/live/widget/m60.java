package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f119047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f119048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f119049f;

    public m60(az2.f fVar, re2.h1 h1Var, com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f119047d = fVar;
        this.f119048e = h1Var;
        this.f119049f = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119047d.b();
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "openCoLiveSettingPanel: task created, invitationId=" + this.f119048e.f394390c);
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f119049f;
        com.tencent.mm.plugin.finder.live.widget.z60.b(z60Var);
        z60Var.o();
    }
}
