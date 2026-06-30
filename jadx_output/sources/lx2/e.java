package lx2;

/* loaded from: classes2.dex */
public final class e extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f322060k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f322061l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f322062m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView tipsLayout) {
        super(tipsLayout);
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        this.f322060k = "followtab_tl_bubble";
        this.f322061l = "TLFollow";
        this.f322062m = "FollowTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((jz5.n) this.f322054e).getValue()).W6(3);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f322061l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f322060k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f322062m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.tencent.mm.plugin.finder.view.gb gbVar = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131137h;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131138i = true;
        com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent = new com.tencent.mm.autogen.events.FinderTabSelectedEvent();
        finderTabSelectedEvent.f54329g.f6938a = 3;
        finderTabSelectedEvent.e();
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        kotlin.jvm.internal.o.g(arrow, "arrow");
        kotlin.jvm.internal.o.g(arrowParams, "arrowParams");
        kotlin.jvm.internal.o.g(tipsParams, "tipsParams");
        int width = this.f322050a.getWidth();
        android.content.Context context = this.f322051b;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.gi X6 = ((com.tencent.mm.plugin.finder.viewmodel.component.bl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class)).X6(3);
        android.widget.TextView textView = X6 != null ? X6.f134528e : null;
        int[] iArr = new int[2];
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        android.content.res.Resources resources = this.f322052c;
        int dimension = (int) resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
        int i17 = iArr[0];
        int dimension2 = i17 > 0 ? i17 + dimension : (int) resources.getDimension(com.tencent.mm.R.dimen.f479667c4);
        int i18 = width / 2;
        int i19 = dimension2 - i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustTipsBubbleLayout] width=");
        sb6.append(width);
        sb6.append(" startPadding=");
        sb6.append(i19);
        sb6.append(" values=");
        sb6.append(iArr[0]);
        sb6.append(" followTitleView is null?=");
        sb6.append(textView == null);
        com.tencent.mars.xlog.Log.i(this.f322062m, sb6.toString());
        if (i18 > dimension2) {
            arrowParams.gravity = 51;
            arrowParams.leftMargin = dimension2 - (dimension * 2);
        }
        tipsParams.gravity = 8388659;
        tipsParams.leftMargin = java.lang.Math.max(i19, dimension);
        super.i(arrow, arrowParams, tipsParams);
    }
}
