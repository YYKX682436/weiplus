package wu;

/* loaded from: classes9.dex */
public final class l1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        hu.f fVar = this.f449610e;
        java.lang.String d17 = vu.a.d(item, fVar.q(), fVar.n(), fVar.p());
        bw5.o50 q17 = q(item);
        if (q17 == null) {
            return;
        }
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.h hVar = item.f284997e;
        r45.lm6 b17 = il4.d.b(context, hVar.getString(hVar.f303422d + 0), q17, d17);
        android.content.Context context2 = mvvmView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView tingCategoryMvvmView = new com.tencent.mm.plugin.ting.widget.TingCategoryMvvmView(context2);
        tingCategoryMvvmView.c();
        tingCategoryMvvmView.setBackgroundResource(com.tencent.mm.R.drawable.d87);
        tingCategoryMvvmView.g(b17, null);
        z01.e0 e0Var = new z01.e0();
        java.lang.String str = b17.f379637d;
        if (str == null) {
            str = "";
        }
        e0Var.f469000e = str;
        java.lang.String str2 = b17.f379638e;
        e0Var.f469001f = str2 != null ? str2 : "";
        e0Var.f468999d = tingCategoryMvvmView;
        e0Var.f469002g = com.tencent.mm.R.drawable.d87;
        e0Var.f469003h = new wu.k1(this, item);
        mvvmView.setViewModel(e0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        java.lang.Integer k17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        bw5.o50 q17 = q(item);
        if (q17 == null) {
            return;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        hu.f fVar = this.f449610e;
        eVar.f292106c = (fVar.l() == 1 ? bw5.ar0.TingScene_Fav : bw5.ar0.TingScene_ChatHistory).f25422d;
        java.lang.String q18 = fVar.q();
        if ((q18 == null || q18.length() == 0) && ((k17 = fVar.k()) == null || (q18 = k17.toString()) == null)) {
            q18 = "";
        }
        eVar.f292114k = q18;
        boolean z17 = !r26.n0.N(fVar.q());
        il4.f fVar2 = eVar.f292122s;
        if (z17) {
            java.lang.Long p17 = fVar.p();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(p17 != null ? p17.toString() : null)) {
                java.util.Map map = fVar2.f292132d;
                java.lang.Long p18 = fVar.p();
                if (p18 == null || (str = p18.toString()) == null) {
                    str = "";
                }
                map.put("msgid", str);
            }
            java.util.Map map2 = fVar2.f292132d;
            java.lang.String str2 = eVar.f292114k;
            map2.put("chat", str2 != null ? str2 : "");
        } else {
            java.util.Map map3 = fVar2.f292132d;
            java.lang.String str3 = eVar.f292114k;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            map3.put("favid", str3 != null ? str3 : "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.o())) {
            fVar2.f292132d.put("sourceuser", fVar.o());
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((rk4.k8) aj6).o(context, q17, fVar.l() == 1 ? bw5.ar0.TingScene_Fav : bw5.ar0.TingScene_ChatHistory, eVar, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView n17 = ((bf5.a) Ai).n(context);
        n17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(n17, -2, -2);
    }

    public final bw5.o50 q(hu.b bVar) {
        java.lang.String j17;
        bw5.o50 v17;
        kotlin.jvm.internal.o.g(bVar, "<this>");
        s15.f0 V = bVar.f284997e.V();
        if (V == null || (j17 = V.j()) == null || (v17 = il4.d.v(j17)) == null) {
            return null;
        }
        return v17;
    }
}
