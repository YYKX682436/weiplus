package ku1;

/* loaded from: classes15.dex */
public class a extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312062b;

    @Override // ku1.m
    public void c() {
        this.f312062b = b(com.tencent.mm.R.id.b7d);
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312062b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        hu1.g gVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94937f;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        com.tencent.mm.ui.MMActivity mMActivity = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94936e;
        com.tencent.mm.plugin.card.ui.p0 p0Var = ((com.tencent.mm.plugin.card.ui.b0) s4Var).U;
        wt1.k kVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).H;
        if (!gVar.i()) {
            if (!gVar.j()) {
                d(8);
                return;
            }
            if (android.text.TextUtils.isEmpty(jVar.s0().V)) {
                android.view.View view = this.f312062b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = this.f312062b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b17 = b(com.tencent.mm.R.id.f482340bu);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) b(com.tencent.mm.R.id.f482346c1)).setText(jVar.s0().V);
            return;
        }
        android.view.View view3 = this.f312062b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View b18 = b(com.tencent.mm.R.id.f482340bu);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(b18, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(b18, "com/tencent/mm/plugin/card/ui/view/CardAcceptHeaderView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) b(com.tencent.mm.R.id.f482339bt);
        android.widget.TextView textView = (android.widget.TextView) b(com.tencent.mm.R.id.f482341bv);
        android.widget.TextView textView2 = (android.widget.TextView) b(com.tencent.mm.R.id.f482346c1);
        if (p0Var.f95106d != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String f27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f95106d, true).f2();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, f27, textSize));
        }
        if (p0Var.f95103a == 23) {
            if (!android.text.TextUtils.isEmpty(jVar.s0().V)) {
                textView2.setText(jVar.s0().V);
            } else if (android.text.TextUtils.isEmpty(jVar.s0().f388568y)) {
                textView2.setText(mMActivity.getString(com.tencent.mm.R.string.aul, kVar.d()));
            } else {
                textView2.setText(mMActivity.getString(com.tencent.mm.R.string.aul, jVar.s0().f388568y));
            }
        } else if (jVar.Y() != null && !android.text.TextUtils.isEmpty(jVar.Y().f377580d)) {
            textView2.setText(jVar.Y().f377580d);
        } else if (android.text.TextUtils.isEmpty(jVar.s0().f388568y)) {
            if (jVar.m0()) {
                textView2.setText(mMActivity.getString(com.tencent.mm.R.string.atg, kVar.d()));
            } else {
                textView2.setText(mMActivity.getString(com.tencent.mm.R.string.asm, kVar.d()));
            }
        } else if (jVar.m0()) {
            textView2.setText(mMActivity.getString(com.tencent.mm.R.string.atg, jVar.s0().f388568y));
        } else {
            textView2.setText(mMActivity.getString(com.tencent.mm.R.string.asm, jVar.s0().f388568y));
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, p0Var.f95106d, 0.15f);
        imageView.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
    }
}
