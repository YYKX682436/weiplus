package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0017R\"\u0010\f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderVideoBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;", "", "getContentDescription", "Lcom/tencent/mm/plugin/finder/view/qr;", "n", "Lcom/tencent/mm/plugin/finder/view/qr;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/qr;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/qr;)V", "mediaType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderVideoBanner extends com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner<com.tencent.mm.plugin.finder.video.FinderVideoLayout> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.qr mediaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132907f;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b2j, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) inflate;
        addView(finderVideoLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public android.view.View b() {
        return getMediaView();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        cw2.h8 playInfo;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) getMediaView().findViewById(com.tencent.mm.R.id.e_k);
        boolean z17 = false;
        if (finderVideoLayout != null && (playInfo = finderVideoLayout.getPlayInfo()) != null && playInfo.f223752h) {
            z17 = true;
        }
        if (z17) {
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490519xf);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.f490511x5);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public com.tencent.mm.plugin.finder.view.qr getMediaType() {
        return this.mediaType;
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public void setMediaType(com.tencent.mm.plugin.finder.view.qr qrVar) {
        kotlin.jvm.internal.o.g(qrVar, "<set-?>");
        this.mediaType = qrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132907f;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b2j, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) inflate;
        addView(finderVideoLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132907f;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b2j, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) inflate;
        addView(finderVideoLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }
}
