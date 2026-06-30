package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f136519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136520e;

    public y20(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f136519d = finderJumpInfo;
        this.f136520e = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f136519d;
        r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
        java.lang.String string = lite_app_info != null ? lite_app_info.getString(3) : null;
        boolean z17 = string == null || string.length() == 0;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136520e;
        if (z17) {
            com.tencent.mars.xlog.Log.e("Finder.SelfUIC", "initPosterEntrance creatorCenterJumpInfo.lite_app_info?.default_url is null or empty");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "initPosterEntrance default_url:" + string);
            r45.k74 lite_app_info2 = finderJumpInfo.getLite_app_info();
            if (lite_app_info2 != null) {
                lite_app_info2.set(3, f50Var.Y6(string));
            }
        }
        r45.k74 lite_app_info3 = finderJumpInfo.getLite_app_info();
        if (lite_app_info3 != null) {
            hc2.i0.a(lite_app_info3, kz5.b1.e(new jz5.l("from_page", 1)));
        }
        f50Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "openLiteAppCreatorCenter");
        f50Var.R6();
        xc2.y2.i(xc2.y2.f453343a, f50Var.getContext(), new xc2.p0(finderJumpInfo), 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
