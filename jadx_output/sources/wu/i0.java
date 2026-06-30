package wu;

/* loaded from: classes9.dex */
public final class i0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        o15.a aVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.s sVar = new z01.s();
        s15.h hVar = item.f284997e;
        s15.y E = hVar.E();
        if (E != null) {
            aVar = new o15.a();
            aVar.E(E.k());
            aVar.F(E.l());
            aVar.C(E.o());
            aVar.y(E.j());
            aVar.B(E.getPoiName());
            aVar.A(E.n());
            aVar.z("0");
        } else {
            aVar = null;
        }
        sVar.f469158f = aVar;
        sVar.f469156d = java.lang.Long.valueOf(hVar.A());
        s15.i p17 = hVar.p();
        if (p17 == null || (str = p17.j()) == null) {
            str = "";
        }
        sVar.f469157e = str;
        sVar.f469159g = com.tencent.mm.R.drawable.d87;
        mvvmView.setViewModel(sVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        o15.a aVar;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.y E = item.f284997e.E();
        if (E != null) {
            java.text.SimpleDateFormat simpleDateFormat = vu.a.f440046a;
            aVar = new o15.a();
            aVar.E(E.k());
            aVar.F(E.l());
            aVar.C(E.o());
            aVar.y(E.j());
            aVar.B(E.getPoiName());
            aVar.A(E.n());
            aVar.z("0");
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("kwebmap_slat", aVar.u());
        intent.putExtra("kwebmap_lng", aVar.w());
        intent.putExtra("kPoiName", aVar.s());
        intent.putExtra("Kwebmap_locaion", aVar.l());
        intent.putExtra("kShowshare", false);
        intent.putExtra("key_is_forward_preview", true);
        j45.l.j(context, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView l17 = ((bf5.a) Ai).l(context);
        l17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(l17, -2, -2);
    }
}
