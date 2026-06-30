package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f120150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f120153g;

    public w60(az2.f fVar, int i17, java.lang.String str, re2.h1 h1Var) {
        this.f120150d = fVar;
        this.f120151e = i17;
        this.f120152f = str;
        this.f120153g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f120150d.b();
        com.tencent.mars.xlog.Log.e("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: create failed, errCode=" + this.f120151e + ", errMsg=" + this.f120152f);
        if (re2.j1.f394438b == this.f120153g) {
            re2.e0 e0Var = re2.j1.f394438b;
            if (e0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
                e0Var.a();
            }
            re2.j1.f394438b = null;
        }
    }
}
