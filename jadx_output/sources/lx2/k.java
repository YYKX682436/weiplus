package lx2;

/* loaded from: classes2.dex */
public final class k extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f322075k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f322076l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f322077m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView tipsLayout) {
        super(tipsLayout);
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        this.f322075k = "localtab_tl_bubble";
        this.f322076l = "finder_tl_city_tab";
        this.f322077m = "SameCityTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((jz5.n) this.f322054e).getValue()).W6(35);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f322076l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f322075k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f322077m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.tencent.mm.plugin.finder.view.gb gbVar = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131137h;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131140n = true;
        com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent = new com.tencent.mm.autogen.events.FinderTabSelectedEvent();
        am.id idVar = finderTabSelectedEvent.f54329g;
        if (idVar != null) {
            idVar.f6938a = 35;
        }
        if (idVar != null) {
            idVar.f6943f = true;
        }
        if (idVar != null) {
            idVar.f6944g = 11;
        }
        finderTabSelectedEvent.e();
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        kotlin.jvm.internal.o.g(arrow, "arrow");
        kotlin.jvm.internal.o.g(arrowParams, "arrowParams");
        kotlin.jvm.internal.o.g(tipsParams, "tipsParams");
        arrowParams.leftMargin = 0;
        arrowParams.gravity = 49;
        a(this.f322051b, this.f322050a, tipsParams, 35);
        super.i(arrow, arrowParams, tipsParams);
    }
}
