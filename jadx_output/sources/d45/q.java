package d45;

/* loaded from: classes10.dex */
public final class q extends x35.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f226454d;

    /* renamed from: e, reason: collision with root package name */
    public final d45.c f226455e;

    /* renamed from: f, reason: collision with root package name */
    public int f226456f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f226457g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f226458h;

    /* renamed from: i, reason: collision with root package name */
    public final int f226459i;

    /* renamed from: m, reason: collision with root package name */
    public final java.text.SimpleDateFormat f226460m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f226461n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f226462o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f226463p;

    /* renamed from: q, reason: collision with root package name */
    public d45.d f226464q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f226465r;

    public q(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI mContext, d45.c cVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f226454d = mContext;
        this.f226455e = cVar;
        this.f226456f = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorMaxCount());
        this.f226457g = new java.util.ArrayList();
        this.f226458h = new java.util.ArrayList();
        this.f226459i = 10;
        this.f226460m = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f226461n = new d45.m(this);
        this.f226462o = new d45.p(this);
        this.f226463p = jz5.h.b(d45.l.f226449d);
        this.f226465r = new d45.k(this);
        notifyDataSetChanged();
    }

    public final int B() {
        return this.f226457g.size();
    }

    public final java.util.ArrayList E() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f226458h.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            arrayList.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) next).f138430e);
        }
        return arrayList;
    }

    public final void I(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.util.ArrayList arrayList = this.f226458h;
        if (kz5.n0.O(arrayList, galleryItem$MediaItem)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayList.size();
            for (int c07 = kz5.n0.c0(arrayList, galleryItem$MediaItem); c07 < size; c07++) {
                java.lang.Object obj = arrayList.get(c07);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                int indexOf = this.f226457g.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj);
                if (indexOf != -1) {
                    arrayList2.add(java.lang.Integer.valueOf(indexOf));
                }
            }
            kotlin.jvm.internal.m0.a(arrayList).remove(galleryItem$MediaItem);
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI activity = this.f226454d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i.remove(new com.tencent.mm.pluginsdk.ui.v0(null, galleryItem$MediaItem, null, 5, null));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                notifyItemChanged(((java.lang.Number) next).intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f226457g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 5 == ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f226457g.get(i17)).getType() ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r26, int r27) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d45.q.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f226454d;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(fileSelectorUI).inflate(com.tencent.mm.R.layout.f488770ad0, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new d45.b(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(fileSelectorUI).inflate(com.tencent.mm.R.layout.f488770ad0, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new d45.b(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(fileSelectorUI).inflate(com.tencent.mm.R.layout.f488771ad1, parent, false);
        kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
        return new d45.j(inflate3);
    }

    public final java.util.ArrayList x(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (5 != galleryItem$MediaItem.getType()) {
                    arrayList.add(galleryItem$MediaItem);
                }
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList y(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        java.lang.String str = "";
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) list.get(i17);
            java.lang.String a17 = k35.m1.a(this.f226454d, galleryItem$MediaItem.f138435m);
            kotlin.jvm.internal.o.f(a17, "anotherFormatTimeInList(...)");
            if (!kotlin.jvm.internal.o.b(str, a17)) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem galleryItem$TimeMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem();
                galleryItem$TimeMediaItem.f138436n = a17;
                arrayList.add(galleryItem$TimeMediaItem);
                str = a17;
            }
            galleryItem$MediaItem.f138436n = a17;
            arrayList.add(galleryItem$MediaItem);
        }
        return arrayList;
    }

    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z(int i17) {
        if (i17 < this.f226457g.size()) {
            return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f226457g.get(i17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(this.f226457g.size()), java.lang.Integer.valueOf(i17));
        return null;
    }
}
