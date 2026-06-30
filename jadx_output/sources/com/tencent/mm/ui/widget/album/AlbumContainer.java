package com.tencent.mm.ui.widget.album;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainer;", "Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "Lbl5/a;", "albumFiller", "Lbl5/a;", "getAlbumFiller", "()Lbl5/a;", "setAlbumFiller", "(Lbl5/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public class AlbumContainer extends com.tencent.mm.ui.widget.album.AlbumContainerViewBase {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.album.AlbumContainerView f211518n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlbumContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.widget.album.AlbumContainerViewBase
    public void c() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.album.AlbumContainerView albumContainerView = new com.tencent.mm.ui.widget.album.AlbumContainerView(context, getAlbumWidth(), getGap());
        this.f211518n = albumContainerView;
        albumContainerView.setVisibility(0);
        addView(albumContainerView, new android.widget.FrameLayout.LayoutParams(-2, -2));
        java.util.ArrayList<android.view.View> itemViews = getItemViews();
        android.view.View view = this.f211518n;
        if (view != null) {
            itemViews.add(view);
        } else {
            kotlin.jvm.internal.o.o("chattingAlbumView");
            throw null;
        }
    }

    public final bl5.a getAlbumFiller() {
        return null;
    }

    public final void setAlbumFiller(bl5.a aVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
