package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class h5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.jdbiz.n f208775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f208776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f208777f;

    public h5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.plugin.subapp.jdbiz.n nVar, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f208777f = findMoreFriendsUI;
        this.f208775d = nVar;
        this.f208776e = appBrandStatObject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        android.app.Activity context = this.f208777f.getContext();
        com.tencent.mm.plugin.subapp.jdbiz.n nVar = this.f208775d;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(context, nVar.f172129a, "", 0, nVar.f172131c, nVar.f172130b, this.f208776e);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
