package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f119267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f119270g;

    public o60(az2.f fVar, int i17, java.lang.String str, re2.h1 h1Var) {
        this.f119267d = fVar;
        this.f119268e = i17;
        this.f119269f = str;
        this.f119270g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119267d.b();
        com.tencent.mars.xlog.Log.e("Finder.FinderStartLiveModeTabWidget", "openCoLiveSettingPanel: create failed, errCode=" + this.f119268e + ", errMsg=" + this.f119269f);
        if (re2.j1.f394438b == this.f119270g) {
            re2.e0 e0Var = re2.j1.f394438b;
            if (e0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
                e0Var.a();
            }
            re2.j1.f394438b = null;
        }
    }
}
