package km3;

/* loaded from: classes10.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f309260d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f309261e;

    /* renamed from: f, reason: collision with root package name */
    public int f309262f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309263g;

    /* renamed from: h, reason: collision with root package name */
    public final java.text.SimpleDateFormat f309264h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f309265i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f309266m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f309267n;

    /* renamed from: o, reason: collision with root package name */
    public km3.k f309268o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f309269p;

    public t(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f309260d = mContext;
        this.f309261e = new java.util.ArrayList();
        this.f309262f = 2000;
        this.f309263g = Integer.MAX_VALUE;
        this.f309264h = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f309265i = new java.util.LinkedList();
        this.f309266m = new km3.s(this);
        this.f309267n = new km3.r(this);
        this.f309269p = new km3.q(this);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f309265i.size() + this.f309261e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f309265i;
        if (i17 < linkedList.size()) {
            return ((km3.j) linkedList.get(i17)).f309246a;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof km3.h;
        android.view.View.OnClickListener onClickListener = this.f309269p;
        if (z17) {
            holder.itemView.setTag(com.tencent.mm.R.id.f485389hj2, java.lang.Integer.valueOf(i17));
            holder.itemView.setTag(com.tencent.mm.R.id.hjv, 2);
            holder.itemView.setOnClickListener(onClickListener);
            return;
        }
        if (holder instanceof km3.g) {
            holder.itemView.setTag(com.tencent.mm.R.id.f485389hj2, java.lang.Integer.valueOf(i17));
            holder.itemView.setTag(com.tencent.mm.R.id.hjv, 1);
            holder.itemView.setOnClickListener(onClickListener);
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = x(i17);
            if (x17 == null) {
                com.tencent.mars.xlog.Log.e("Music.MusicMvAlbumAdapter", "get item failed");
                return;
            }
            java.lang.String o17 = x17.o();
            kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
            java.lang.String str2 = x17.f138430e;
            kotlin.jvm.internal.o.f(str2, "getOriginalPath(...)");
            if (com.tencent.mm.sdk.platformtools.t8.K0(o17) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("Music.MusicMvAlbumAdapter", "null or nil filepath, poi: %s.", java.lang.Integer.valueOf(i17));
                return;
            }
            km3.g gVar = (km3.g) holder;
            gVar.f309243d.setAlpha(1.0f);
            boolean z18 = z();
            android.widget.TextView textView = gVar.f309244e;
            android.widget.ImageView imageView = gVar.f309243d;
            android.widget.CheckBox delegate = gVar.f309245f;
            if (z18) {
                delegate.setChecked(x17.f138442t);
                if (x17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                    textView.setVisibility(0);
                    km3.p.f309250i.a(gVar.f309244e, gVar.f309243d, (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17, this.f309262f, this.f309263g);
                } else {
                    textView.setVisibility(8);
                    if (x17.f138442t) {
                        imageView.setAlpha(0.1f);
                    } else {
                        imageView.setAlpha(1.0f);
                    }
                }
            } else {
                textView.setVisibility(8);
                if (x17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                    textView.setVisibility(0);
                    com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17;
                    km3.p.f309250i.a(gVar.f309244e, gVar.f309243d, galleryItem$VideoMediaItem, this.f309262f, this.f309263g);
                    if (lm3.d0.a(galleryItem$VideoMediaItem.f138446x) < lm3.d0.c(this.f309262f) || lm3.d0.a(galleryItem$VideoMediaItem.f138446x) > lm3.d0.c(this.f309263g)) {
                        imageView.setAlpha(0.1f);
                    } else {
                        imageView.setAlpha(1.0f);
                    }
                }
            }
            java.lang.String format = this.f309264h.format(new java.util.Date(x17.f138435m));
            kotlin.jvm.internal.o.f(format, "format(...)");
            java.lang.String str3 = (i17 + 1) + ", " + format;
            if (2 == x17.getType()) {
                str = "视频 " + str3;
            } else {
                str = "图片" + str3;
            }
            imageView.setContentDescription(str);
            ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Ai(gVar.f309243d, x17.getType(), o17, str2, x17.f138434i, x17.f138435m);
            gVar.itemView.setOnLongClickListener(this.f309267n);
            if (z()) {
                delegate.setVisibility(0);
            } else {
                delegate.setVisibility(8);
            }
            if (delegate.getVisibility() == 0) {
                kotlin.jvm.internal.o.g(delegate, "delegate");
                java.lang.Object parent = delegate.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view = (android.view.View) parent;
                view.post(new km3.f(delegate, view));
            } else {
                kotlin.jvm.internal.o.g(delegate, "delegate");
                java.lang.Object parent2 = delegate.getParent();
                kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.View");
                ((android.view.View) parent2).setTouchDelegate(null);
            }
            delegate.setTag(com.tencent.mm.R.id.f485389hj2, java.lang.Integer.valueOf(i17));
            delegate.setOnClickListener(this.f309266m);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f309260d;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c49, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new km3.g(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c49, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new km3.g(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c4x, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new km3.h(inflate3);
    }

    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x(int i17) {
        java.util.LinkedList linkedList = this.f309265i;
        if (i17 < linkedList.size()) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvAlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        java.util.ArrayList arrayList = this.f309261e;
        if (size < arrayList.size()) {
            return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(size);
        }
        com.tencent.mars.xlog.Log.w("Music.MusicMvAlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }

    public final int y() {
        return this.f309261e.size();
    }

    public final boolean z() {
        android.content.Context context = this.f309260d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.mv.ui.uic.c3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.c3.class)).P6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
