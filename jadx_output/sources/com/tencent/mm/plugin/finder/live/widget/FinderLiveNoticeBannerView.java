package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveNoticeBannerView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/yl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveNoticeBannerView extends android.widget.FrameLayout implements com.tencent.mm.plugin.finder.live.widget.yl {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f117668d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView f117669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f117670f;

    /* renamed from: g, reason: collision with root package name */
    public int f117671g;

    /* renamed from: h, reason: collision with root package name */
    public r45.h32 f117672h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNoticeBannerView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117670f = 1;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.eax, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f117668d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.uay);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117669e = (com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView) findViewById;
    }

    public final void b(r45.h32 h32Var) {
        this.f117672h = h32Var;
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = this.f117669e;
        if (finderLiveMarqueeTextView == null) {
            kotlin.jvm.internal.o.o("noticeItemTxt");
            throw null;
        }
        finderLiveMarqueeTextView.e();
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView2 = this.f117669e;
        if (finderLiveMarqueeTextView2 == null) {
            kotlin.jvm.internal.o.o("noticeItemTxt");
            throw null;
        }
        finderLiveMarqueeTextView2.post(new com.tencent.mm.plugin.finder.live.widget.yp(this, h32Var));
        if (this.f117671g == 0) {
            this.f117671g = this.f117670f;
        } else {
            this.f117671g = 0;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.yl
    public void j(boolean z17) {
        if (z17) {
            b(this.f117672h);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = this.f117669e;
        if (finderLiveMarqueeTextView != null) {
            finderLiveMarqueeTextView.e();
        } else {
            kotlin.jvm.internal.o.o("noticeItemTxt");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNoticeBannerView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117670f = 1;
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveNoticeBannerView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117670f = 1;
        a(context);
    }
}
