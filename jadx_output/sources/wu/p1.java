package wu;

/* loaded from: classes9.dex */
public final class p1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        ot0.q v17;
        java.lang.String d17;
        bw5.g60 e17;
        bw5.mc0 b17;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null || (P = item.f284997e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(P);
        if (cVar.k() == null || (v17 = ot0.q.v(P)) == null) {
            return;
        }
        il4.a aVar = (il4.a) v17.y(il4.a.class);
        bw5.o50 o50Var = aVar != null ? aVar.f292095e : null;
        z01.f0 f0Var = new z01.f0();
        f0Var.f469008d = containerView.getContext().getResources().getString(com.tencent.mm.R.string.piq);
        android.content.res.Resources resources = containerView.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String nickname = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        objArr[0] = nickname;
        java.lang.String name = o50Var != null ? o50Var.getName() : null;
        objArr[1] = name != null ? name : "";
        f0Var.f469009e = resources.getString(com.tencent.mm.R.string.pir, objArr);
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f27701e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            java.lang.String str = d17.length() > 0 ? d17 : null;
            if (str != null) {
                ((lz5.e) b18).add(str);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        kotlin.jvm.internal.o.g(a17, "<set-?>");
        f0Var.f469011g = a17;
        f0Var.f469010f = com.tencent.mm.R.drawable.d87;
        f0Var.f469012h = new wu.o1(this, item);
        mvvmView.setViewModel(f0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String j17;
        bw5.o50 v17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        s15.f0 V = item.f284997e.V();
        if (V == null || (j17 = V.j()) == null || (v17 = il4.d.v(j17)) == null) {
            return;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((rk4.k8) aj6).E(context, v17);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        int i18 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView o17 = ((bf5.a) Ai).o(context);
        o17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(o17, -2, -2);
    }
}
