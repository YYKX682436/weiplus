package com.tencent.mm.plugin.radar.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "", "Lqs3/v;", "i", "Lqs3/v;", "getOnItemClickListener", "()Lqs3/v;", "setOnItemClickListener", "(Lqs3/v;)V", "onItemClickListener", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "m", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "getMTable", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "setMTable", "(Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;)V", "mTable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RadarSpecialGridView extends com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView implements xn5.a0 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public qs3.v onItemClickListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout mTable;

    /* renamed from: n, reason: collision with root package name */
    public int f154998n;

    /* renamed from: o, reason: collision with root package name */
    public int f154999o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarSpecialGridView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        setMTable(new com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout(context2));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        getMTable().setLayoutParams(layoutParams);
        getMTable().setStretchAllColumns(true);
        getMTable().setShrinkAllColumns(true);
        getMTable().setGravity(80);
        addView(getMTable());
    }

    public final com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout getMTable() {
        com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout = this.mTable;
        if (radarSpecialTableLayout != null) {
            return radarSpecialTableLayout;
        }
        kotlin.jvm.internal.o.o("mTable");
        throw null;
    }

    public final qs3.v getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int scrollX;
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = 0;
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            scrollX = (getScrollX() + childAt.getWidth()) - this.f154999o;
            this.f154999o = childAt.getWidth();
            if (scrollX <= 0) {
                scrollX = 0;
            }
        } else {
            scrollX = getScrollX();
        }
        if (getChildCount() > 0) {
            android.view.View childAt2 = getChildAt(0);
            int scrollY = (getScrollY() + childAt2.getHeight()) - this.f154998n;
            this.f154998n = childAt2.getHeight();
            if (scrollY > 0) {
                i28 = scrollY;
            }
        } else {
            i28 = getScrollY();
        }
        scrollTo(scrollX, i28);
    }

    public final void setMTable(com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout radarSpecialTableLayout) {
        kotlin.jvm.internal.o.g(radarSpecialTableLayout, "<set-?>");
        this.mTable = radarSpecialTableLayout;
    }

    public final void setOnItemClickListener(qs3.v vVar) {
        this.onItemClickListener = vVar;
    }
}
