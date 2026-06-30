package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCreateNoticeCommonRowView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "e", "getDetailView", "detailView", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "f", "getImageView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "imageView", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCreateNoticeCommonRowView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g titleView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g detailView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g imageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveCreateNoticeCommonRowView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final android.widget.TextView getDetailView() {
        java.lang.Object value = ((jz5.n) this.detailView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getImageView() {
        java.lang.Object value = ((jz5.n) this.imageView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.widget.TextView getTitleView() {
        java.lang.Object value = ((jz5.n) this.titleView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveCreateNoticeCommonRowView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderLiveCreateNoticeCommonRowView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.live.view.u3 r3 = new com.tencent.mm.plugin.finder.live.view.u3
            r3.<init>(r1)
            jz5.g r3 = jz5.h.b(r3)
            r1.titleView = r3
            com.tencent.mm.plugin.finder.live.view.s3 r3 = new com.tencent.mm.plugin.finder.live.view.s3
            r3.<init>(r1)
            jz5.g r3 = jz5.h.b(r3)
            r1.detailView = r3
            com.tencent.mm.plugin.finder.live.view.t3 r3 = new com.tencent.mm.plugin.finder.live.view.t3
            r3.<init>(r1)
            jz5.g r3 = jz5.h.b(r3)
            r1.imageView = r3
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131495532(0x7f0c0a6c, float:1.8614603E38)
            r4 = 1
            r2.inflate(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveCreateNoticeCommonRowView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
