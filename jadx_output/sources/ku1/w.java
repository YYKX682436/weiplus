package ku1;

/* loaded from: classes15.dex */
public class w extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312153b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f312154c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f312155d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f312156e;

    @Override // ku1.m
    public void c() {
        this.f312153b = b(com.tencent.mm.R.id.gfb);
        this.f312154c = (android.widget.ImageView) b(com.tencent.mm.R.id.gf_);
        this.f312155d = (android.widget.TextView) b(com.tencent.mm.R.id.gfd);
        this.f312156e = (android.widget.TextView) b(com.tencent.mm.R.id.gfc);
        android.view.View view = this.f312153b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312153b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        com.tencent.mm.ui.MMActivity mMActivity = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94936e;
        com.tencent.mm.plugin.card.ui.p0 p0Var = ((com.tencent.mm.plugin.card.ui.b0) s4Var).U;
        android.view.View view = this.f312153b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f312155d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String f27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f95106d, true).f2();
        float textSize = this.f312155d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, f27, textSize));
        if (jVar.Y() != null && !android.text.TextUtils.isEmpty(jVar.Y().f377580d)) {
            android.widget.TextView textView2 = this.f312156e;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = jVar.Y().f377580d;
            float textSize2 = this.f312156e.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, str, textSize2));
        } else if (android.text.TextUtils.isEmpty(jVar.s0().f388568y)) {
            if (jVar.m0()) {
                this.f312156e.setText(mMActivity.getString(com.tencent.mm.R.string.atg, ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).H.d()));
            } else {
                this.f312156e.setText(mMActivity.getString(com.tencent.mm.R.string.asm, ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).H.d()));
            }
        } else if (jVar.m0()) {
            this.f312156e.setText(mMActivity.getString(com.tencent.mm.R.string.atg, jVar.s0().f388568y));
        } else {
            this.f312156e.setText(mMActivity.getString(com.tencent.mm.R.string.asm, jVar.s0().f388568y));
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f312154c, p0Var.f95106d, null);
        this.f312154c.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
    }
}
