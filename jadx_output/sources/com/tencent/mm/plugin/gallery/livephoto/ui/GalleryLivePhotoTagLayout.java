package com.tencent.mm.plugin.gallery.livephoto.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout;", "Landroid/widget/LinearLayout;", "Lq23/g;", "callback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GalleryLivePhotoTagLayout extends android.widget.LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f138406n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f138407d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f138408e;

    /* renamed from: f, reason: collision with root package name */
    public q23.f f138409f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem f138410g;

    /* renamed from: h, reason: collision with root package name */
    public long f138411h;

    /* renamed from: i, reason: collision with root package name */
    public int f138412i;

    /* renamed from: m, reason: collision with root package name */
    public q23.g f138413m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryLivePhotoTagLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f138412i = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o23.o.f342453a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f138407d = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "init " + hashCode() + ", mediaId: " + mediaItem.f138434i);
        if (!this.f138408e) {
            int i17 = this.f138407d;
            if (i17 == 0) {
                this.f138409f = new q23.a(this);
            } else if (i17 == 1) {
                q23.j jVar = new q23.j(this);
                this.f138409f = jVar;
                jVar.b(new q23.b(this));
            } else if (i17 == 2) {
                this.f138409f = new q23.h(this);
            }
            this.f138408e = true;
        }
        this.f138410g = mediaItem;
        this.f138411h = mediaItem.f138434i;
    }

    public final void b(int i17) {
        java.lang.String str;
        if (this.f138411h == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "showLayoutInState >> " + hashCode() + " mediaId: " + this.f138411h + ", state: " + i17 + " showCurrentState: " + this.f138412i);
        if (this.f138412i == i17) {
            return;
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f138410g;
            int i18 = galleryItem$LivePhotoMediaItem != null ? galleryItem$LivePhotoMediaItem.I : 1;
            com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent = new com.tencent.mm.autogen.events.LivePhotoUseStateEvent();
            am.zi ziVar = livePhotoUseStateEvent.f54476g;
            ziVar.f8567b = true;
            if (i18 != 1) {
                ziVar.f8567b = false;
                i17 = 2;
            } else {
                i17 = 1;
            }
            ziVar.f8566a = this.f138411h;
            ziVar.f8568c = this.f138407d;
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem2 = this.f138410g;
            if (galleryItem$LivePhotoMediaItem2 == null || (str = galleryItem$LivePhotoMediaItem2.f138430e) == null) {
                str = "";
            }
            ziVar.f8569d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "pickDefaultState >> " + hashCode() + " mediaId: " + this.f138411h + ", isUseLivePhoto: " + ziVar.f8567b + " showCurrentState: " + this.f138412i);
            livePhotoUseStateEvent.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "pickDefaultState >> " + hashCode() + " mediaId: " + this.f138411h + ", state: " + i17 + " showCurrentState: " + this.f138412i);
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem3 = this.f138410g;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem3);
        galleryItem$LivePhotoMediaItem3.A = i17;
        this.f138412i = i17;
        setVisibility(0);
        q23.f fVar = this.f138409f;
        if (fVar != null) {
            fVar.a(i17);
        }
    }

    public final void c(boolean z17) {
        if (this.f138411h == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayoutSelectState >> ");
        sb6.append(hashCode());
        sb6.append(" mediaId: ");
        sb6.append(this.f138411h);
        sb6.append(", isSelect: ");
        sb6.append(z17);
        sb6.append(" currentLivePhotoState: ");
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f138410g;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem);
        sb6.append(galleryItem$LivePhotoMediaItem.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", sb6.toString());
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem2 = this.f138410g;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem2);
        if (galleryItem$LivePhotoMediaItem2.H != 1) {
            b(3);
        }
    }

    public final void setLivePhotoTagClickCallback(q23.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f138413m = callback;
    }
}
