package com.tencent.mm.ui.widget.album;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b \u0010#J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;", "", "Landroid/view/View;", "getFilterItemViews", "", "g", "I", "getGap", "()I", "setGap", "(I)V", "gap", "h", "getAlbumWidth", "setAlbumWidth", "albumWidth", "i", "getAlbumHeight", "setAlbumHeight", "albumHeight", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "m", "Ljava/util/ArrayList;", "getItemViews", "()Ljava/util/ArrayList;", "itemViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public class AlbumContainerViewBase extends com.tencent.mm.ui.widget.RoundedCornerFrameLayout {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int gap;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int albumWidth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int albumHeight;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList itemViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(android.content.Context context, int i17, int i18) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.gap = i65.a.b(getContext(), 1);
        int b17 = i65.a.b(getContext(), 144);
        this.albumWidth = b17;
        this.albumHeight = b17;
        this.itemViews = new java.util.ArrayList();
        this.albumWidth = i17;
        this.albumHeight = i17;
        this.gap = i18;
        c();
    }

    public void c() {
    }

    public final int getAlbumHeight() {
        return this.albumHeight;
    }

    public final int getAlbumWidth() {
        return this.albumWidth;
    }

    public java.util.List<android.view.View> getFilterItemViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.itemViews) {
            if (!(((android.view.View) obj).getVisibility() == 8)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int getGap() {
        return this.gap;
    }

    public final java.util.ArrayList<android.view.View> getItemViews() {
        return this.itemViews;
    }

    public final void setAlbumHeight(int i17) {
        this.albumHeight = i17;
    }

    public final void setAlbumWidth(int i17) {
        this.albumWidth = i17;
    }

    public final void setGap(int i17) {
        this.gap = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.gap = i65.a.b(getContext(), 1);
        int b17 = i65.a.b(getContext(), 144);
        this.albumWidth = b17;
        this.albumHeight = b17;
        this.itemViews = new java.util.ArrayList();
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.gap = i65.a.b(getContext(), 1);
        int b17 = i65.a.b(getContext(), 144);
        this.albumWidth = b17;
        this.albumHeight = b17;
        this.itemViews = new java.util.ArrayList();
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        this.gap = i65.a.b(getContext(), 1);
        int b17 = i65.a.b(getContext(), 144);
        this.albumWidth = b17;
        this.albumHeight = b17;
        this.itemViews = new java.util.ArrayList();
        c();
    }
}
