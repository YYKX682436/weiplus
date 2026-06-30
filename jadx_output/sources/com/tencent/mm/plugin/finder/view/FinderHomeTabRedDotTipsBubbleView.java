package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\r\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "", "value", "e", "Z", "setShowing", "(Z)V", "isShowing", "Lcom/tencent/mm/plugin/finder/view/ib;", "f", "Lcom/tencent/mm/plugin/finder/view/ib;", "getVisibilityListener", "()Lcom/tencent/mm/plugin/finder/view/ib;", "setVisibilityListener", "(Lcom/tencent/mm/plugin/finder/view/ib;)V", "visibilityListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/gb", "com/tencent/mm/plugin/finder/view/hb", "com/tencent/mm/plugin/finder/view/jb", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHomeTabRedDotTipsBubbleView extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f131138i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f131139m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f131140n;

    /* renamed from: d, reason: collision with root package name */
    public lx2.d f131143d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.ib visibilityListener;

    /* renamed from: g, reason: collision with root package name */
    public r45.px2 f131146g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.gb f131137h = new com.tencent.mm.plugin.finder.view.gb(null);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f131141o = jz5.h.b(com.tencent.mm.plugin.finder.view.db.f131885d);

    /* renamed from: p, reason: collision with root package name */
    public static float f131142p = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.B1().r()).floatValue();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setVisibility(8);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488821aj5, (android.view.ViewGroup) this, true);
        setOnClickListener(new com.tencent.mm.plugin.finder.view.cb(this));
        f131142p = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.B1().r()).floatValue();
    }

    private final void setShowing(boolean z17) {
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257490e;
        lx2.d dVar = this.f131143d;
        java.lang.String d17 = dVar != null ? dVar.d() : null;
        if (z17) {
            if (!(d17 == null || d17.length() == 0)) {
                concurrentSkipListSet.add(d17);
            }
        }
        this.isShowing = z17;
    }

    public final boolean a(boolean z17) {
        if (getVisibility() != 0) {
            return false;
        }
        if (z17) {
            animate().cancel();
            animate().alpha(0.0f).setDuration(250L).setListener(new com.tencent.mm.plugin.finder.view.kb(this)).start();
        } else {
            setVisibility(8);
        }
        lx2.d dVar = this.f131143d;
        if (dVar != null) {
            dVar.b();
            r45.qt2 c17 = dVar.c();
            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, c17, dVar.e(), 5, dVar.f322057h, false, null, 48, null);
            java.lang.Object value = ((jz5.n) dVar.f322055f).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((cy1.a) ((dy1.r) value)).yj("view_unexp", null, dVar.g(c17 != null ? java.lang.Integer.valueOf(c17.getInteger(5)) : null), 1, false);
        }
        com.tencent.mm.plugin.finder.view.ib ibVar = this.visibilityListener;
        if (ibVar == null) {
            return true;
        }
        ((com.tencent.mm.plugin.finder.convert.bg) ibVar).f102971b.getClass();
        return true;
    }

    public final com.tencent.mm.plugin.finder.view.ib getVisibilityListener() {
        return this.visibilityListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.finder.view.ib ibVar;
        super.onDetachedFromWindow();
        boolean z17 = this.isShowing;
        setShowing(false);
        if (this.isShowing == z17 || (ibVar = this.visibilityListener) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.convert.bg bgVar = (com.tencent.mm.plugin.finder.convert.bg) ibVar;
        bgVar.f102970a.post(new com.tencent.mm.plugin.finder.convert.ag(false, bgVar.f102971b, bgVar.f102972c));
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.finder.view.ib ibVar;
        super.setVisibility(i17);
        boolean z17 = this.isShowing;
        setShowing(i17 == 0);
        boolean z18 = this.isShowing;
        if (z18 == z17 || (ibVar = this.visibilityListener) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.convert.bg bgVar = (com.tencent.mm.plugin.finder.convert.bg) ibVar;
        bgVar.f102970a.post(new com.tencent.mm.plugin.finder.convert.ag(z18, bgVar.f102971b, bgVar.f102972c));
    }

    public final void setVisibilityListener(com.tencent.mm.plugin.finder.view.ib ibVar) {
        this.visibilityListener = ibVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setVisibility(8);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488821aj5, (android.view.ViewGroup) this, true);
        setOnClickListener(new com.tencent.mm.plugin.finder.view.cb(this));
        f131142p = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.B1().r()).floatValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabRedDotTipsBubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setVisibility(8);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488821aj5, (android.view.ViewGroup) this, true);
        setOnClickListener(new com.tencent.mm.plugin.finder.view.cb(this));
        f131142p = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.B1().r()).floatValue();
    }
}
