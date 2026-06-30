package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class f2 extends com.tencent.mm.plugin.finder.convert.d {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f129116i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f129117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed currentItem) {
        super(holder, currentItem);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(currentItem, "currentItem");
        this.f129116i = holder.itemView.getContext();
        this.f129117m = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uxd);
    }

    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.s0
    public void b() {
        java.lang.String string;
        jz5.l lVar;
        dy1.r rVar;
        this.f103107h.alive();
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103104e;
        int g17 = n1Var.g(baseFinderFeed.getFeedObject().getFeedObject());
        android.content.Context context = this.f129116i;
        if (g17 != 0) {
            lVar = new jz5.l(java.lang.Boolean.FALSE, null);
        } else {
            kotlin.jvm.internal.o.f(context, "context");
            if (baseFinderFeed.j(context)) {
                string = baseFinderFeed.D(context);
            } else {
                r45.ru2 flow_card_recommand_reason = baseFinderFeed.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                string = flow_card_recommand_reason != null ? flow_card_recommand_reason.getString(0) : null;
            }
            lVar = new jz5.l(java.lang.Boolean.valueOf(((string == null || string.length() == 0) || baseFinderFeed.getFeedObject().isMemberFeed()) ? false : true), string);
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f302834e;
        if (!booleanValue) {
            c(false);
            return;
        }
        c(true);
        android.widget.TextView textView = this.f129117m;
        if (textView != null) {
            android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(textView.getContext(), str, (int) textView.getTextSize(), 1);
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            kotlin.jvm.internal.o.d(Ui);
            textView.setText(zy2.s6.l6((zy2.s6) c17, Ui, (int) textView.getTextSize(), true, null, 0, false, null, 120, null));
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
        }
        kotlin.jvm.internal.o.f(context, "context");
        if (!baseFinderFeed.j(context) || (rVar = (dy1.r) i95.n0.c(dy1.r.class)) == null || textView == null) {
            return;
        }
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(textView, "from_finderuin_sns");
        aVar.ik(textView, 32, 25496);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context2 = textView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context2);
        aVar.Ai(textView, new com.tencent.mm.plugin.finder.ui.e2(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }

    public final void c(boolean z17) {
        android.widget.TextView textView = this.f129117m;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z17 ? 0 : (!((java.lang.Boolean) ((jz5.n) this.f103105f).getValue()).booleanValue() || this.f103104e.getFeedObject().isLive()) ? 4 : 8);
    }
}
