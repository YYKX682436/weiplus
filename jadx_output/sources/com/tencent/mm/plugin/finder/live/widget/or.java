package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class or extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pr f119313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qc6 f119315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.tencent.mm.plugin.finder.live.widget.pr prVar, int i17, r45.qc6 qc6Var, java.lang.String str) {
        super(0);
        this.f119313d = prVar;
        this.f119314e = i17;
        this.f119315f = qc6Var;
        this.f119316g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.pr prVar = this.f119313d;
        int i17 = this.f119314e;
        prVar.f119408f = i17;
        r45.qc6 qc6Var = this.f119315f;
        java.lang.String string = qc6Var.getString(0);
        if (string == null) {
            string = "";
        }
        prVar.f119409g = string;
        java.lang.String str = this.f119316g;
        prVar.f119410h = str == null ? "" : str;
        java.lang.String string2 = qc6Var.getString(1);
        prVar.f119411i = string2 != null ? string2 : "";
        android.view.ViewGroup viewGroup = prVar.f119406d;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.l2d);
        prVar.f119414o = button;
        if (button != null) {
            button.setOnClickListener(prVar);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.ofa);
        if (weImageView != null) {
            weImageView.setOnClickListener(prVar);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.l2m);
        prVar.f119415p = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(prVar);
        }
        android.widget.TextView textView3 = prVar.f119415p;
        if (textView3 != null) {
            textView3.post(new com.tencent.mm.plugin.finder.live.widget.nr(textView3));
        }
        android.widget.TextView textView4 = prVar.f119415p;
        com.tencent.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.l2k);
        prVar.f119416q = weImageView2;
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(prVar);
        }
        android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.l2b);
        prVar.f119417r = textView5;
        if (textView5 != null) {
            textView5.setOnClickListener(prVar);
        }
        android.widget.TextView textView6 = prVar.f119417r;
        if (textView6 != null) {
            textView6.post(new com.tencent.mm.plugin.finder.live.widget.nr(textView6));
        }
        android.widget.TextView textView7 = prVar.f119417r;
        com.tencent.mm.ui.bk.r0(textView7 != null ? textView7.getPaint() : null, 0.8f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.l2_);
        prVar.f119418s = weImageView3;
        if (weImageView3 != null) {
            weImageView3.setOnClickListener(prVar);
        }
        prVar.f119419t = viewGroup.findViewById(com.tencent.mm.R.id.l2e);
        prVar.f119420u = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.l2i);
        android.widget.TextView textView8 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.l2h);
        prVar.f119421v = textView8;
        if (textView8 != null) {
            textView8.setOnClickListener(prVar);
        }
        android.widget.TextView textView9 = prVar.f119421v;
        if (textView9 != null) {
            textView9.post(new com.tencent.mm.plugin.finder.live.widget.nr(textView9));
        }
        android.widget.TextView textView10 = prVar.f119421v;
        com.tencent.mm.ui.bk.r0(textView10 != null ? textView10.getPaint() : null, 0.8f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.l2f);
        prVar.f119422w = weImageView4;
        if (weImageView4 != null) {
            weImageView4.setOnClickListener(prVar);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        prVar.f119423x = ((java.lang.Boolean) m17).booleanValue();
        prVar.c();
        prVar.b();
        viewGroup.setVisibility(0);
        if (prVar.D != 0 && prVar.E != 0) {
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).ij(6, prVar.D, prVar.E, kz5.c1.k(new jz5.l("name_certification", java.lang.Integer.valueOf(!prVar.f119424y ? 1 : 0)), new jz5.l("age_certification", java.lang.Integer.valueOf(!prVar.B ? 1 : 0)), new jz5.l("other_certification", java.lang.Integer.valueOf(!prVar.C ? 1 : 0))));
        }
        com.tencent.mars.xlog.Log.i(prVar.f119407e, "showPrecheckPage userFlag:" + i17 + ", realnameAuthUrl:" + str + ", spamRisk:" + pm0.b0.g(qc6Var) + ", hasShowLicense:" + prVar.f119423x + ", realnameCheckFail:" + prVar.f119424y + ", finderRealNameCheckFail:" + prVar.f119425z + ", finderRealNameNewCheckFail:" + prVar.A + ", ageCheckFail:" + prVar.B + ", othersCheckFail:" + prVar.C);
        return jz5.f0.f302826a;
    }
}
