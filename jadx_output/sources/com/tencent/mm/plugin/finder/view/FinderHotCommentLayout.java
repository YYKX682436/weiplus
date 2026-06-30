package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001b\u001a\n \u0007*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHotCommentLayout;", "Landroid/widget/FrameLayout;", "", "content", "Ljz5/f0;", "setMargin", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getHotCommentTagTv", "()Landroid/widget/TextView;", "hotCommentTagTv", "Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "e", "getHotCommentContentTv", "()Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "hotCommentContentTv", "Landroid/view/View;", "f", "getHotCommentLikeFrame", "()Landroid/view/View;", "hotCommentLikeFrame", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "g", "getHotCommentLikeCountIv", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "hotCommentLikeCountIv", "h", "getHotCommentLikeCountTv", "hotCommentLikeCountTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHotCommentLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g hotCommentTagTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g hotCommentContentTv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g hotCommentLikeFrame;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g hotCommentLikeCountIv;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g hotCommentLikeCountTv;

    /* renamed from: i, reason: collision with root package name */
    public int f131157i;

    /* renamed from: m, reason: collision with root package name */
    public int f131158m;

    /* renamed from: n, reason: collision with root package name */
    public long f131159n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.xb f131160o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHotCommentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.hotCommentTagTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.cc(this));
        this.hotCommentContentTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.yb(this));
        this.hotCommentLikeFrame = jz5.h.b(new com.tencent.mm.plugin.finder.view.bc(this));
        this.hotCommentLikeCountIv = jz5.h.b(new com.tencent.mm.plugin.finder.view.zb(this));
        this.hotCommentLikeCountTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.ac(this));
        this.f131160o = new com.tencent.mm.plugin.finder.view.xb(kz5.c0.i(new com.tencent.mm.plugin.finder.view.lo(), new com.tencent.mm.plugin.finder.view.n(), new com.tencent.mm.plugin.finder.view.lp(), new com.tencent.mm.plugin.finder.view.r0()), kz5.c0.i(new com.tencent.mm.plugin.finder.view.mo(), new com.tencent.mm.plugin.finder.view.q(), new com.tencent.mm.plugin.finder.view.p(), new com.tencent.mm.plugin.finder.view.o(), new com.tencent.mm.plugin.finder.view.bs(), new com.tencent.mm.plugin.finder.view.rp(), new com.tencent.mm.plugin.finder.view.t1()));
    }

    private final com.tencent.mm.plugin.finder.view.HotCommentSpacingTextView getHotCommentContentTv() {
        return (com.tencent.mm.plugin.finder.view.HotCommentSpacingTextView) this.hotCommentContentTv.getValue();
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getHotCommentLikeCountIv() {
        return (com.tencent.mm.ui.widget.imageview.WeImageView) this.hotCommentLikeCountIv.getValue();
    }

    private final android.widget.TextView getHotCommentLikeCountTv() {
        return (android.widget.TextView) this.hotCommentLikeCountTv.getValue();
    }

    private final android.view.View getHotCommentLikeFrame() {
        return (android.view.View) this.hotCommentLikeFrame.getValue();
    }

    private final android.widget.TextView getHotCommentTagTv() {
        return (android.widget.TextView) this.hotCommentTagTv.getValue();
    }

    private final void setMargin(java.lang.CharSequence charSequence) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        android.text.style.LeadingMarginSpan.Standard standard = new android.text.style.LeadingMarginSpan.Standard(this.f131157i + getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), 0);
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        if (charSequence.length() > 0) {
            spannableString.setSpan(standard, 0, 1, 17);
        }
        getHotCommentContentTv().setText(spannableString);
        android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), getHotCommentContentTv().getPaint(), getWidth()).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        int lineBottom = build.getLineBottom(0) - build.getLineTop(0);
        kotlin.jvm.internal.o.f(getHotCommentTagTv(), "<get-hotCommentTagTv>(...)");
        float n17 = (lineBottom - hc2.f1.n(r5)) / 2.0f;
        com.tencent.mars.xlog.Log.i("Finder.HotCommentLayout", "tag margin %f", java.lang.Float.valueOf(ym5.x.b(getContext(), n17)));
        if (n17 <= 0.0f || lineBottom == 0 || (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getHotCommentTagTv().getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.topMargin = (int) n17;
    }

    public final void a(java.lang.CharSequence content, com.tencent.mm.protocal.protobuf.FinderCommentInfo comment) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(comment, "comment");
        this.f131159n = comment.getCommentId();
        android.widget.TextView hotCommentTagTv = getHotCommentTagTv();
        kotlin.jvm.internal.o.f(hotCommentTagTv, "<get-hotCommentTagTv>(...)");
        com.tencent.mm.plugin.finder.view.xb xbVar = this.f131160o;
        xbVar.getClass();
        java.util.Iterator it = xbVar.f133323a.iterator();
        while (it.hasNext() && !((com.tencent.mm.plugin.finder.view.vb) it.next()).a(comment, hotCommentTagTv)) {
        }
        android.widget.TextView hotCommentTagTv2 = getHotCommentTagTv();
        kotlin.jvm.internal.o.f(hotCommentTagTv2, "<get-hotCommentTagTv>(...)");
        this.f131157i = b(hotCommentTagTv2);
        setMargin(content);
        android.widget.TextView hotCommentLikeCountTv = getHotCommentLikeCountTv();
        kotlin.jvm.internal.o.f(hotCommentLikeCountTv, "<get-hotCommentLikeCountTv>(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView hotCommentLikeCountIv = getHotCommentLikeCountIv();
        kotlin.jvm.internal.o.f(hotCommentLikeCountIv, "<get-hotCommentLikeCountIv>(...)");
        xbVar.getClass();
        java.util.Iterator it6 = xbVar.f133324b.iterator();
        while (it6.hasNext() && !((com.tencent.mm.plugin.finder.view.wb) it6.next()).a(comment, hotCommentLikeCountTv, hotCommentLikeCountIv)) {
        }
        android.view.View hotCommentLikeFrame = getHotCommentLikeFrame();
        kotlin.jvm.internal.o.f(hotCommentLikeFrame, "<get-hotCommentLikeFrame>(...)");
        int b17 = b(hotCommentLikeFrame);
        if (b17 != 0) {
            b17 += i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv);
        }
        this.f131158m = b17;
        com.tencent.mars.xlog.Log.i("Finder.HotCommentLayout", "bindData likeFrameWidth = " + this.f131158m + " tagWidth = " + this.f131157i);
        getHotCommentContentTv().setExtraEllipsizeWidth(this.f131158m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) getHotCommentContentTv().getF131525i());
        sb6.append(' ');
        sb6.append((java.lang.Object) getHotCommentLikeCountTv().getText());
        setTag(com.tencent.mm.R.id.f484406pw0, sb6.toString());
    }

    public final int b(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 == null) {
            return view.getMeasuredWidth();
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), android.view.View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 1073741824));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight()).x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHotCommentLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.hotCommentTagTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.cc(this));
        this.hotCommentContentTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.yb(this));
        this.hotCommentLikeFrame = jz5.h.b(new com.tencent.mm.plugin.finder.view.bc(this));
        this.hotCommentLikeCountIv = jz5.h.b(new com.tencent.mm.plugin.finder.view.zb(this));
        this.hotCommentLikeCountTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.ac(this));
        this.f131160o = new com.tencent.mm.plugin.finder.view.xb(kz5.c0.i(new com.tencent.mm.plugin.finder.view.lo(), new com.tencent.mm.plugin.finder.view.n(), new com.tencent.mm.plugin.finder.view.lp(), new com.tencent.mm.plugin.finder.view.r0()), kz5.c0.i(new com.tencent.mm.plugin.finder.view.mo(), new com.tencent.mm.plugin.finder.view.q(), new com.tencent.mm.plugin.finder.view.p(), new com.tencent.mm.plugin.finder.view.o(), new com.tencent.mm.plugin.finder.view.bs(), new com.tencent.mm.plugin.finder.view.rp(), new com.tencent.mm.plugin.finder.view.t1()));
    }
}
