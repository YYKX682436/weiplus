package rx2;

/* loaded from: classes10.dex */
public final class p implements com.tencent.mm.ui.tools.c5, ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f400983d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f400984e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f400985f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f400986g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f400987h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f400988i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f400989m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f400990n;

    public p(com.tencent.mm.ui.MMActivity activity, yz5.l changeEditViewCallback, yz5.p doVerify) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(changeEditViewCallback, "changeEditViewCallback");
        kotlin.jvm.internal.o.g(doVerify, "doVerify");
        this.f400983d = activity;
        this.f400984e = changeEditViewCallback;
        this.f400985f = doVerify;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(activity);
        this.f400987h = f5Var;
        this.f400988i = true;
        ya2.h.f460484a.b(xy2.c.e(activity));
        f5Var.f210400e = this;
        com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = new com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView(activity);
        this.f400986g = finderExtendReadingEditView;
        rx2.f fVar = new rx2.f(this);
        rx2.g gVar = new rx2.g(this);
        finderExtendReadingEditView.f131036d = fVar;
        finderExtendReadingEditView.f131037e = gVar;
        sr2.o1 o1Var = (sr2.o1) pf5.z.f353948a.a(activity).a(sr2.o1.class);
        o1Var.getClass();
        o1Var.f411653d = finderExtendReadingEditView;
        o1Var.Q6();
        rx2.h hVar = new rx2.h(this);
        rx2.i iVar = new rx2.i(this);
        rx2.j jVar = new rx2.j(this);
        o1Var.f411658i = hVar;
        o1Var.f411656g = iVar;
        o1Var.f411657h = jVar;
        activity.getWindow().getDecorView().post(new rx2.k(this));
    }

    public final void a() {
        this.f400984e.invoke(java.lang.Boolean.FALSE);
        this.f400989m = false;
        this.f400987h.d();
        this.f400983d.hideVKB();
        boolean z17 = this.f400990n;
        com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = this.f400986g;
        if (z17) {
            finderExtendReadingEditView.f131045p.setVisibility(0);
            finderExtendReadingEditView.f131044o.setVisibility(8);
            finderExtendReadingEditView.f131041i.setVisibility(8);
            finderExtendReadingEditView.f131042m.setVisibility(8);
            finderExtendReadingEditView.f131039g.setVisibility(8);
            finderExtendReadingEditView.f131040h.setText(finderExtendReadingEditView.getContext().getResources().getString(com.tencent.mm.R.string.f491356li2));
        }
        finderExtendReadingEditView.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = finderExtendReadingEditView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        finderExtendReadingEditView.setLayoutParams(layoutParams2);
    }

    public final void b() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f400983d;
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.f1n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = mMActivity.getResources().getString(com.tencent.mm.R.string.oxn);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        c(string, "", string2);
    }

    public final void c(java.lang.String title, java.lang.String titleTips, java.lang.String hint) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(titleTips, "titleTips");
        kotlin.jvm.internal.o.g(hint, "hint");
        this.f400990n = true;
        com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = this.f400986g;
        finderExtendReadingEditView.getClass();
        finderExtendReadingEditView.f131045p.setVisibility(8);
        android.widget.TextView textView = finderExtendReadingEditView.f131044o;
        textView.setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderExtendReadingEditView.f131041i;
        mMEditText.setVisibility(0);
        finderExtendReadingEditView.f131039g.setVisibility(0);
        finderExtendReadingEditView.f131040h.setText(title);
        textView.setText(titleTips);
        mMEditText.setText("");
        mMEditText.setHint(hint);
        textView.setTextColor(finderExtendReadingEditView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        if (this.f400988i) {
            finderExtendReadingEditView.post(new rx2.n(this));
        }
        this.f400987h.f();
        mMEditText.requestFocus();
        this.f400983d.showVKB();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = this.f400986g;
        android.view.ViewGroup.LayoutParams layoutParams = finderExtendReadingEditView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        if (((android.widget.FrameLayout.LayoutParams) layoutParams).bottomMargin != i17) {
            rx2.o oVar = new rx2.o(this, i17);
            if (i17 != 0) {
                oVar.setDuration(200L);
            } else {
                oVar.setDuration(300L);
            }
            finderExtendReadingEditView.startAnimation(oVar);
        }
        finderExtendReadingEditView.setVisibility(0);
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        ya2.h.f460484a.b(xy2.c.e(this.f400983d));
    }
}
