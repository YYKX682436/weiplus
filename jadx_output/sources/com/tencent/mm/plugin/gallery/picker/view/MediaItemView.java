package com.tencent.mm.plugin.gallery.picker.view;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;B#\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010<\u001a\u00020\u0004¢\u0006\u0004\b:\u0010=J\b\u0010\u0005\u001a\u00020\u0004H&R(\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u001ej\b\u0012\u0004\u0012\u00028\u0000`\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006>"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/FrameLayout;", "", "getLayoutId", "Ld33/s0;", "d", "Ld33/s0;", "getOnItemMediaSelectedListener", "()Ld33/s0;", "setOnItemMediaSelectedListener", "(Ld33/s0;)V", "onItemMediaSelectedListener", "Leb5/e;", "e", "Leb5/e;", "getHolder", "()Leb5/e;", "setHolder", "(Leb5/e;)V", "holder", "Ljava/util/HashSet;", "f", "Ljava/util/HashSet;", "getSelectedSet", "()Ljava/util/HashSet;", "setSelectedSet", "(Ljava/util/HashSet;)V", "selectedSet", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "getSelectedList", "()Ljava/util/ArrayList;", "setSelectedList", "(Ljava/util/ArrayList;)V", "selectedList", "Lvo0/d;", "h", "Lvo0/d;", "getLoader", "()Lvo0/d;", "setLoader", "(Lvo0/d;)V", com.tencent.shadow.core.common.HostConstants.LOADER_APPID, "Lx23/a;", "adapter", "Lx23/a;", "getAdapter", "()Lx23/a;", "setAdapter", "(Lx23/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class MediaItemView<T extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public d33.s0 onItemMediaSelectedListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public eb5.e holder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.util.HashSet selectedSet;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.util.ArrayList selectedList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public vo0.d loader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final x23.a getAdapter() {
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public final eb5.e getHolder() {
        eb5.e eVar = this.holder;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public abstract int getLayoutId();

    public final vo0.d getLoader() {
        vo0.d dVar = this.loader;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
        throw null;
    }

    public final d33.s0 getOnItemMediaSelectedListener() {
        return this.onItemMediaSelectedListener;
    }

    public final java.util.ArrayList<T> getSelectedList() {
        java.util.ArrayList<T> arrayList = this.selectedList;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.o.o("selectedList");
        throw null;
    }

    public final java.util.HashSet<T> getSelectedSet() {
        java.util.HashSet<T> hashSet = this.selectedSet;
        if (hashSet != null) {
            return hashSet;
        }
        kotlin.jvm.internal.o.o("selectedSet");
        throw null;
    }

    public final void setAdapter(x23.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
    }

    public final void setHolder(eb5.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.holder = eVar;
    }

    public final void setLoader(vo0.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<set-?>");
        this.loader = dVar;
    }

    public final void setOnItemMediaSelectedListener(d33.s0 s0Var) {
        this.onItemMediaSelectedListener = s0Var;
    }

    public final void setSelectedList(java.util.ArrayList<T> arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<set-?>");
        this.selectedList = arrayList;
    }

    public final void setSelectedSet(java.util.HashSet<T> hashSet) {
        kotlin.jvm.internal.o.g(hashSet, "<set-?>");
        this.selectedSet = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
