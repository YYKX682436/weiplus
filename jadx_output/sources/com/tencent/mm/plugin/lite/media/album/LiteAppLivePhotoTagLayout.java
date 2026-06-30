package com.tencent.mm.plugin.lite.media.album;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout;", "Landroid/widget/LinearLayout;", "Lea3/d0;", "callback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LiteAppLivePhotoTagLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f144133d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f144134e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f144135f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f144136g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f144137h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem f144138i;

    /* renamed from: m, reason: collision with root package name */
    public long f144139m;

    /* renamed from: n, reason: collision with root package name */
    public int f144140n;

    /* renamed from: o, reason: collision with root package name */
    public ea3.d0 f144141o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteAppLivePhotoTagLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f144140n = -1;
    }

    public final void a(int i17) {
        android.widget.TextView textView;
        if (this.f144139m == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", "showLayoutInState >> " + hashCode() + " mediaId: " + this.f144139m + ", state: " + i17 + " showCurrentState: " + this.f144140n);
        if (this.f144140n == i17) {
            return;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f144138i;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem);
        galleryItem$LivePhotoMediaItem.A = i17;
        this.f144140n = i17;
        setVisibility(0);
        this.f144134e = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.scl);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.scj);
        this.f144135f = viewGroup;
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE;
        kotlin.jvm.internal.o.e(viewGroup, "null cannot be cast to non-null type android.view.View");
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(companion, viewGroup, i65.a.b(getContext(), 6), i65.a.b(getContext(), 8), i65.a.b(getContext(), 8), i65.a.b(getContext(), 4), false, 32, null);
        this.f144136g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.scd);
        this.f144137h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.sce);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f144136g;
        kotlin.jvm.internal.o.d(weImageView);
        if (i17 == 2) {
            weImageView.s(com.tencent.mm.R.raw.livephoto_off_filled, com.tencent.mm.R.color.f478553an);
        } else {
            if (i17 == 0 || i17 == 1) {
                weImageView.s(com.tencent.mm.R.raw.icons_filled_live_photo, com.tencent.mm.R.color.f478511t);
            } else if (i17 == 3) {
                weImageView.s(com.tencent.mm.R.raw.icons_filled_live_photo, com.tencent.mm.R.color.UN_BW_0_Alpha_0_3);
            }
        }
        if (i17 == 0) {
            android.view.ViewGroup viewGroup2 = this.f144134e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            android.view.ViewGroup viewGroup3 = this.f144135f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            android.view.ViewGroup viewGroup4 = this.f144135f;
            if (viewGroup4 != null) {
                viewGroup4.setOnClickListener(null);
            }
            android.view.ViewGroup viewGroup5 = this.f144135f;
            if (viewGroup5 != null) {
                viewGroup5.setEnabled(false);
            }
        } else if (i17 == 1) {
            android.view.ViewGroup viewGroup6 = this.f144134e;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            android.view.ViewGroup viewGroup7 = this.f144135f;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(0);
            }
            android.view.ViewGroup viewGroup8 = this.f144135f;
            if (viewGroup8 != null) {
                viewGroup8.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.d6_));
            }
            android.view.ViewGroup viewGroup9 = this.f144135f;
            if (viewGroup9 != null) {
                viewGroup9.setEnabled(true);
            }
            android.view.ViewGroup viewGroup10 = this.f144135f;
            if (viewGroup10 != null) {
                viewGroup10.setOnClickListener(new ea3.c0(this));
            }
        } else if (i17 == 2) {
            android.view.ViewGroup viewGroup11 = this.f144134e;
            if (viewGroup11 != null) {
                viewGroup11.setVisibility(8);
            }
            android.view.ViewGroup viewGroup12 = this.f144135f;
            if (viewGroup12 != null) {
                viewGroup12.setVisibility(0);
            }
            android.view.ViewGroup viewGroup13 = this.f144135f;
            if (viewGroup13 != null) {
                viewGroup13.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.d69));
            }
            android.view.ViewGroup viewGroup14 = this.f144135f;
            if (viewGroup14 != null) {
                viewGroup14.setEnabled(true);
            }
            android.view.ViewGroup viewGroup15 = this.f144135f;
            if (viewGroup15 != null) {
                viewGroup15.setOnClickListener(new ea3.c0(this));
            }
        } else if (i17 == 3) {
            android.view.ViewGroup viewGroup16 = this.f144134e;
            if (viewGroup16 != null) {
                viewGroup16.setVisibility(8);
            }
            android.view.ViewGroup viewGroup17 = this.f144135f;
            if (viewGroup17 != null) {
                viewGroup17.setVisibility(0);
            }
            android.view.ViewGroup viewGroup18 = this.f144135f;
            if (viewGroup18 != null) {
                viewGroup18.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.d68));
            }
            android.view.ViewGroup viewGroup19 = this.f144135f;
            if (viewGroup19 != null) {
                viewGroup19.setEnabled(false);
            }
            android.view.ViewGroup viewGroup20 = this.f144135f;
            if (viewGroup20 != null) {
                viewGroup20.setOnClickListener(null);
            }
        }
        if (i17 == 0 || i17 == 2) {
            android.widget.TextView textView2 = this.f144137h;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478553an));
                return;
            }
            return;
        }
        if (i17 == 3) {
            android.widget.TextView textView3 = this.f144137h;
            if (textView3 != null) {
                textView3.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        if (i17 != 1 || (textView = this.f144137h) == null) {
            return;
        }
        textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
    }

    public final void b(boolean z17) {
        int i17;
        if (this.f144139m == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayoutSelectState >> ");
        sb6.append(hashCode());
        sb6.append(" mediaId: ");
        sb6.append(this.f144139m);
        sb6.append(", isSelect: ");
        sb6.append(z17);
        sb6.append(" currentLivePhotoState: ");
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = this.f144138i;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem);
        sb6.append(galleryItem$LivePhotoMediaItem.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", sb6.toString());
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem2 = this.f144138i;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem2);
        int i18 = galleryItem$LivePhotoMediaItem2.A;
        if (z17) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem3 = this.f144138i;
            kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem3);
            i17 = 1;
            if (galleryItem$LivePhotoMediaItem3.H != 1) {
                i17 = 3;
            } else if (i18 != 0) {
                return;
            }
        } else {
            i17 = 0;
        }
        a(i17);
    }

    public final void setLivePhotoTagClickCallback(ea3.d0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f144141o = callback;
    }
}
