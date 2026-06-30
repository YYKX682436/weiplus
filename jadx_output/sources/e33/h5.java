package e33;

/* loaded from: classes10.dex */
public class h5 extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public e33.v2 f247256d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f247257e;

    /* renamed from: f, reason: collision with root package name */
    public final int f247258f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f247259g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f247260h;

    /* renamed from: i, reason: collision with root package name */
    public e33.g5 f247261i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f247262m;

    /* renamed from: n, reason: collision with root package name */
    public final int f247263n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f247264o;

    /* renamed from: p, reason: collision with root package name */
    public int f247265p;

    /* renamed from: q, reason: collision with root package name */
    public int f247266q;

    /* renamed from: r, reason: collision with root package name */
    public int f247267r;

    /* renamed from: s, reason: collision with root package name */
    public int f247268s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f247269t;

    /* renamed from: u, reason: collision with root package name */
    public final java.text.SimpleDateFormat f247270u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f247271v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f247272w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f247273x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.recyclerview.widget.g1 f247274y;

    public h5(android.content.Context context, java.util.ArrayList arrayList, int i17, boolean z17, int i18, boolean z18) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f247260h = arrayList2;
        this.f247265p = -1;
        this.f247266q = -1;
        this.f247270u = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        boolean z19 = false;
        this.f247273x = false;
        this.f247274y = new androidx.recyclerview.widget.g1(new e33.d5(this));
        this.f247257e = context;
        this.f247259g = arrayList;
        arrayList2.addAll(arrayList);
        this.f247258f = i17;
        this.f247262m = z17;
        this.f247263n = i18;
        if (t23.p0.k().f415297f == 15) {
            this.f247269t = context.getResources().getDrawable(com.tencent.mm.R.drawable.f481858af0);
        } else {
            this.f247269t = context.getResources().getDrawable(com.tencent.mm.R.drawable.f481360re);
        }
        this.f247271v = z18;
        if (context instanceof android.app.Activity) {
            this.f247272w = ((android.app.Activity) context).getIntent().getStringExtra("GalleryUI_ToUser");
        }
        if (t23.p0.k().f415297f == 3 && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi()) {
            z19 = true;
        }
        this.f247273x = z19;
    }

    public final void B(android.widget.ImageView imageView, java.lang.String str, int i17) {
        boolean z17;
        boolean contains = this.f247259g.contains(str);
        android.graphics.drawable.Drawable drawable = this.f247269t;
        if (contains) {
            imageView.setBackground(null);
            imageView.setImageDrawable(drawable);
            z17 = false;
        } else {
            imageView.setBackgroundColor(-1090519041);
            imageView.setImageDrawable(null);
            z17 = true;
        }
        imageView.setVisibility(0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f247256d.i(this.f247267r)) && this.f247256d.i(this.f247267r).equals(str)) {
            imageView.setVisibility(0);
            if (z17 && i17 == this.f247268s) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f247256d.i(this.f247267r)) || this.f247256d.i(this.f247267r).equals(str)) {
            return;
        }
        int i18 = this.f247268s;
        if (i17 != i18 && !z17) {
            imageView.setVisibility(8);
        } else {
            if (i17 != i18 || z17) {
                return;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f247260h.size();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.g5 g5Var = this.f247261i;
        if (g5Var != null) {
            if (this.f247262m) {
                ((e33.v3) g5Var).a(view, ((java.lang.Integer) view.getTag()).intValue());
            } else {
                ((e33.v3) g5Var).a(view, this.f247260h.indexOf(view.getTag()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new e33.f5(android.view.LayoutInflater.from(this.f247257e).inflate(com.tencent.mm.R.layout.c_w, viewGroup, false));
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x(int i17, e33.f5 f5Var) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2;
        java.util.ArrayList arrayList = this.f247260h;
        if (i17 < 0 || i17 >= arrayList.size()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreviewSelectedImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return null;
        }
        java.lang.String str = (java.lang.String) arrayList.get(i17);
        if (!this.f247262m) {
            if (t23.p0.l() == null) {
                return com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, str, str, "");
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, str, "");
            int indexOf = t23.p0.l().indexOf(b17);
            if (indexOf >= 0) {
                galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) t23.p0.l().get(indexOf);
                return galleryItem$MediaItem2;
            }
            java.util.Iterator it = t23.p0.m().iterator();
            while (it.hasNext()) {
                galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem.equals(b17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", galleryItem$MediaItem.f138430e);
                    return galleryItem$MediaItem;
                }
            }
            return null;
        }
        if (this.f247256d.f247502m == null) {
            return null;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b18 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, str, "");
        int indexOf2 = this.f247256d.f247502m.indexOf(b18);
        if (indexOf2 >= 0) {
            f5Var.f247228o = indexOf2;
            galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f247256d.f247502m.get(indexOf2);
            return galleryItem$MediaItem2;
        }
        java.util.Iterator it6 = t23.p0.m().iterator();
        while (it6.hasNext()) {
            galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next();
            if (galleryItem$MediaItem.equals(b18)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", galleryItem$MediaItem.f138430e);
                return galleryItem$MediaItem;
            }
        }
        return null;
    }

    public final long y() {
        return this.f247273x ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : j33.d0.h();
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e33.f5 f5Var, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        int i18;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = x(i17, f5Var);
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreviewSelectedImageAdapter", "get item failed");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewSelectedImageAdapter", "onBindViewHolder position: %d item: %s", java.lang.Integer.valueOf(i17), x17);
        android.view.ViewGroup.LayoutParams layoutParams = f5Var.f247227n.getLayoutParams();
        int i19 = this.f247258f;
        layoutParams.width = i19;
        layoutParams.height = i19;
        B(f5Var.f247220d, x17.f138430e, i17);
        com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout = f5Var.f247231r;
        q23.f fVar = galleryLivePhotoTagLayout.f138409f;
        if (fVar != null) {
            fVar.reset();
        }
        galleryLivePhotoTagLayout.setVisibility(8);
        galleryLivePhotoTagLayout.f138411h = 0L;
        galleryLivePhotoTagLayout.f138410g = null;
        galleryLivePhotoTagLayout.f138412i = -1;
        android.view.View view = f5Var.f247227n;
        view.setOnClickListener(this);
        int type = x17.getType();
        android.content.Context context = this.f247257e;
        if (2 == type) {
            str = context.getResources().getString(com.tencent.mm.R.string.fjt) + (i17 + 1);
        } else if (1 == x17.getType()) {
            str = context.getResources().getString(com.tencent.mm.R.string.fjo) + (i17 + 1);
        } else {
            str = context.getResources().getString(com.tencent.mm.R.string.o4z) + (i17 + 1);
        }
        view.setContentDescription(str + ", " + this.f247270u.format(new java.util.Date(x17.f138435m)));
        if (this.f247262m) {
            view.setTag(java.lang.Integer.valueOf(f5Var.f247228o));
        } else {
            view.setTag(x17.f138430e);
        }
        java.lang.String o17 = x17.o();
        java.lang.String str2 = x17.f138430e;
        int type2 = x17.getType();
        int i27 = this.f247263n;
        android.widget.ImageView imageView = f5Var.f247225i;
        android.widget.RelativeLayout relativeLayout = f5Var.f247222f;
        android.widget.ImageView imageView2 = f5Var.f247229p;
        android.widget.TextView textView = f5Var.f247223g;
        android.widget.TextView textView2 = f5Var.f247230q;
        if (type2 == 2) {
            relativeLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479930ja));
            long k17 = com.tencent.mm.vfs.w6.k(x17.f138430e);
            if (this.f247273x && k17 > j33.d0.h() && k17 <= y()) {
                e33.a0.c(textView, ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x);
                imageView2.setVisibility(8);
                textView2.setVisibility(8);
            } else {
                qc0.d1 b17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.b(x17.f138430e);
                e33.a0.c(textView, b17 != null ? (int) b17.f361366d : ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x);
                if (t21.d3.s() && this.f247264o && i27 == 3 && com.tencent.mm.vfs.w6.k(str2) > y()) {
                    imageView2.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(context.getString(com.tencent.mm.R.string.fhu, j33.d0.e(y())));
                } else {
                    imageView2.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
        } else if (x17.getType() == 1) {
            relativeLayout.setVisibility(8);
            textView.setVisibility(4);
        } else {
            relativeLayout.setVisibility(0);
            imageView.setVisibility(4);
            textView.setVisibility(4);
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
            galleryLivePhotoTagLayout.setVisibility(0);
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) x17;
            galleryLivePhotoTagLayout.a(galleryItem$LivePhotoMediaItem);
            galleryLivePhotoTagLayout.b(galleryItem$LivePhotoMediaItem.A);
        }
        if (x17.getType() == 1) {
            if (!t21.d3.s() || !this.f247264o) {
                galleryItem$MediaItem = x17;
            } else if (i27 == 3) {
                long k18 = com.tencent.mm.vfs.w6.k(str2);
                o23.i iVar = (o23.i) ((e60.b1) i95.n0.c(e60.b1.class));
                java.lang.String str3 = this.f247272w;
                galleryItem$MediaItem = x17;
                if (k18 > iVar.Bi(str3)) {
                    i18 = 0;
                    imageView2.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(context.getString(com.tencent.mm.R.string.fht, j33.d0.e(((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(str3))));
                }
            } else {
                galleryItem$MediaItem = x17;
            }
            i18 = 0;
            imageView2.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            galleryItem$MediaItem = x17;
            i18 = 0;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreviewSelectedImageAdapter", "null or nil filepath: " + i17);
            return;
        }
        e33.m6.b(f5Var.f247221e, galleryItem$MediaItem.getType(), o17, str2, galleryItem$MediaItem.f138434i, -1, new e33.e5(this, f5Var), galleryItem$MediaItem.f138435m);
        int i28 = t23.p0.k().f415297f;
        android.widget.ImageView imageView3 = f5Var.f247224h;
        if ((i28 == 3 || t23.p0.k().f415297f == 11) && galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")) {
            imageView3.setVisibility(i18);
        } else {
            imageView3.setVisibility(8);
        }
        if (galleryItem$MediaItem.f138438p.equalsIgnoreCase("edit") || galleryItem$MediaItem.f138438p.equals("video_edit")) {
            java.lang.Object obj = java.lang.Boolean.FALSE;
            java.lang.Object obj2 = galleryItem$MediaItem.f138443u.get("key_media_item_extra_is_remux");
            if (obj2 != null) {
                obj = obj2;
            }
            if (((java.lang.Boolean) obj).booleanValue() && !this.f247271v) {
                relativeLayout.setVisibility(i18);
                imageView.setVisibility(i18);
                f5Var.f247226m.setVisibility(8);
            }
        }
        imageView.setVisibility(4);
        f5Var.f247226m.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        e33.f5 f5Var = (e33.f5) k3Var;
        if (list.isEmpty()) {
            onBindViewHolder(f5Var, i17);
            return;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = x(i17, f5Var);
        if (x17 == null) {
            return;
        }
        B(f5Var.f247220d, x17.f138430e, i17);
    }
}
