package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class fo implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.go f134416d;

    public fo(com.tencent.mm.plugin.finder.viewmodel.component.go goVar) {
        this.f134416d = goVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppBackground activity: ");
        sb6.append(str);
        sb6.append(" isCurActDestroy: ");
        com.tencent.mm.plugin.finder.viewmodel.component.go goVar = this.f134416d;
        sb6.append(goVar.f134541d.isDestroyed());
        com.tencent.mars.xlog.Log.i("FinderLiveNotificationUIC", sb6.toString());
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a) || goVar.f134541d.isDestroyed()) {
            return;
        }
        fo0.o oVar = fo0.o.f264833a;
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492396ge5);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String r18 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.ge6);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        java.lang.String r19 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492396ge5);
        kotlin.jvm.internal.o.f(r19, "getString(...)");
        oVar.a(r17, r18, r19, goVar.f134541d.getClass().getName());
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveNotificationUIC", "onAppForeground activity:" + str);
        fo0.o.f264833a.b();
    }
}
