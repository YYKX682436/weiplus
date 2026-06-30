package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveRoomBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Landroid/view/ViewGroup;", "", "getContentDescription", "Luc2/d;", "controller", "Ljz5/f0;", "setLiveRoomController", "getLiveRoomController", "Lcom/tencent/mm/plugin/finder/view/qr;", "n", "Lcom/tencent/mm/plugin/finder/view/qr;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/qr;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/qr;)V", "mediaType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveRoomBanner extends com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner<android.view.ViewGroup> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.qr mediaType;

    /* renamed from: o, reason: collision with root package name */
    public uc2.d f131220o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveRoomBanner(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132909h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.tencent.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(frameLayout);
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public android.view.View b() {
        return getMediaView();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        return "";
    }

    /* renamed from: getLiveRoomController, reason: from getter */
    public final uc2.d getF131220o() {
        return this.f131220o;
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public com.tencent.mm.plugin.finder.view.qr getMediaType() {
        return this.mediaType;
    }

    public final void setLiveRoomController(uc2.d dVar) {
        this.f131220o = dVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner
    public void setMediaType(com.tencent.mm.plugin.finder.view.qr qrVar) {
        kotlin.jvm.internal.o.g(qrVar, "<set-?>");
        this.mediaType = qrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveRoomBanner(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132909h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.tencent.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(frameLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveRoomBanner(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.mediaType = com.tencent.mm.plugin.finder.view.qr.f132909h;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.tencent.mm.R.id.toe);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setMediaView(frameLayout);
    }
}
