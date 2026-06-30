package wu;

/* loaded from: classes9.dex */
public final class d extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        s05.d dVar;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.c cVar = new z01.c();
        cVar.f468971t = 1096;
        s15.h hVar = item.f284997e;
        s15.e j17 = hVar.j();
        if (j17 != null) {
            dVar = new s05.d();
            dVar.E(j17.getAppId());
            dVar.R(j17.getUsername());
            dVar.Q(2);
            dVar.S(j17.getVersion());
            dVar.T(j17.getIconUrl());
            dVar.O(j17.getSubType());
            dVar.N(j17.n());
            dVar.H(j17.j());
            dVar.J(j17.k());
            s05.e eVar = new s05.e();
            eVar.k(j17.l());
            dVar.K(eVar);
        } else {
            dVar = null;
        }
        cVar.f468961g = dVar;
        cVar.f468963i = new wu.c(item, this);
        cVar.f468964m = com.tencent.mm.R.drawable.d87;
        cVar.f468958d = hVar.getString(hVar.f303422d + 0);
        hu.f fVar = this.f449610e;
        cVar.f468959e = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        s15.e j18 = hVar.j();
        cVar.f468960f = j18 != null ? j18.getUsername() : null;
        cVar.f468966o = k01.d.a(fVar.q());
        cVar.f468967p = fVar.o();
        cVar.f468968q = fVar.q();
        mvvmView.setViewModel(cVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        s15.e j17 = item.f284997e.j();
        if (j17 == null) {
            return;
        }
        hu.f fVar = this.f449610e;
        int a17 = k01.d.a(fVar.q());
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1096;
        int i17 = 0;
        if (fVar.o().length() > 0) {
            b1Var.f317034l = fVar.o();
        }
        b1Var.f317012a = j17.getUsername();
        java.lang.String k17 = j17.k();
        if (k17 == null) {
            k17 = "";
        }
        b1Var.f317022f = k17;
        b1Var.f317016c = j17.l();
        b1Var.f317018d = -1;
        b1Var.f317014b = j17.getAppId();
        b1Var.Q = a17;
        if (!android.text.TextUtils.isEmpty(b1Var.f317034l)) {
            b1Var.f317034l += ':' + a17 + ':' + fVar.q();
        }
        if (a17 == 1 || a17 == 2) {
            i17 = 1;
        } else if (a17 == 3 || a17 == 4) {
            i17 = 2;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        java.lang.String j18 = j17.j();
        appBrandLaunchReferrer.f77326h = j18 != null ? j18 : "";
        b1Var.f317035m = i17;
        b1Var.f317036n = fVar.o() + ':' + fVar.q();
        b1Var.f317041s = appBrandLaunchReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(view.getContext(), b1Var);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView b17 = ((bf5.a) Ai).b(context);
        b17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(b17, -2, -2);
    }
}
