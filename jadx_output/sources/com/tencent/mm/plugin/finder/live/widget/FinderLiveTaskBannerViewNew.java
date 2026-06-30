package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerViewNew;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/yl;", "", "str", "Ljz5/f0;", "setMarqueeText", "", "h", "Ljz5/g;", "getEdge13A", "()I", "edge13A", "i", "getEdge2A", "edge2A", "Lkotlin/Function0;", "m", "Lyz5/a;", "getOnSelectedListener", "()Lyz5/a;", "setOnSelectedListener", "(Lyz5/a;)V", "onSelectedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveTaskBannerViewNew extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.live.widget.yl {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f117686d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView f117687e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f117688f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f117689g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge13A;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge2A;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a onSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskBannerViewNew(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.edge13A = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.yw(this));
        this.edge2A = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.zw(this));
        a(context);
    }

    private final int getEdge13A() {
        return ((java.lang.Number) this.edge13A.getValue()).intValue();
    }

    private final int getEdge2A() {
        return ((java.lang.Number) this.edge2A.getValue()).intValue();
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dt9, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f117686d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.rv7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117687e = (com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView) findViewById;
        android.view.View view = this.f117686d;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.rv9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117688f = findViewById2;
        android.view.View view2 = this.f117686d;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.rv8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117689g = findViewById3;
    }

    public final yz5.a getOnSelectedListener() {
        return this.onSelectedListener;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.yl
    public void j(boolean z17) {
        if (!z17) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = this.f117687e;
            if (finderLiveMarqueeTextView != null) {
                finderLiveMarqueeTextView.b();
                return;
            } else {
                kotlin.jvm.internal.o.o("txtView");
                throw null;
            }
        }
        yz5.a aVar = this.onSelectedListener;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView2 = this.f117687e;
        if (finderLiveMarqueeTextView2 != null) {
            finderLiveMarqueeTextView2.c();
        } else {
            kotlin.jvm.internal.o.o("txtView");
            throw null;
        }
    }

    public final void setMarqueeText(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = this.f117687e;
        if (finderLiveMarqueeTextView == null) {
            kotlin.jvm.internal.o.o("txtView");
            throw null;
        }
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView.f116022q;
        finderLiveMarqueeTextView.d(str, true);
    }

    public final void setOnSelectedListener(yz5.a aVar) {
        this.onSelectedListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskBannerViewNew(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.edge13A = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.yw(this));
        this.edge2A = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.zw(this));
        a(context);
    }
}
