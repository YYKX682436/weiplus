package my2;

/* loaded from: classes3.dex */
public final class i0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f332738e;

    public i0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f332737d = k0Var;
        this.f332738e = me2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        my2.k0 k0Var = this.f332737d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(k0Var.f365323d.getContext());
        u1Var.g(k0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.ejy));
        u1Var.a(true);
        u1Var.n(k0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.ejz));
        u1Var.b(new my2.h0(k0Var, this.f332738e));
        u1Var.r(true);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f332737d.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.aki));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
