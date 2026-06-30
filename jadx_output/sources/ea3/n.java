package ea3;

/* loaded from: classes10.dex */
public class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f250628e;

    /* renamed from: h, reason: collision with root package name */
    public final ea3.j f250631h;

    /* renamed from: m, reason: collision with root package name */
    public int f250633m;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f250639s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f250640t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f250641u;

    /* renamed from: v, reason: collision with root package name */
    public ea3.k f250642v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f250643w;

    /* renamed from: d, reason: collision with root package name */
    public int f250627d = 9;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f250629f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f250630g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f250632i = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f250634n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f250635o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f250636p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f250637q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f250638r = true;

    public n(android.content.Context context, ea3.j jVar) {
        this.f250639s = false;
        ea3.b bVar = new ea3.b(this);
        this.f250640t = new ea3.d(this);
        this.f250641u = new ea3.e(this);
        this.f250643w = new ea3.f(this);
        this.f250628e = context;
        this.f250631h = jVar;
        kn5.e.E.a(context, bVar, new ea3.a(this, context));
        this.f250639s = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumItemDebugLabel()) == 1;
        for (int i17 = 0; i17 < 32; i17++) {
            this.f250629f.add(new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem());
        }
        notifyDataSetChanged();
    }

    public int B() {
        return this.f250630g.size();
    }

    public void E(int i17) {
        java.util.Iterator it = this.f250634n.iterator();
        while (it.hasNext()) {
            if (((ea3.i) it.next()).f250626a == i17) {
                it.remove();
            }
        }
    }

    public void I(int i17) {
        if (B() > i17) {
            x();
        } else if ((i17 == 1 || this.f250627d == 1) && !this.f250638r) {
            notifyDataSetChanged();
        }
        this.f250627d = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0124, code lost:
    
        if (r7 >= r11.f250627d) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0131, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012d, code lost:
    
        if (r14.size() >= r11.f250627d) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r12, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r13, android.view.View r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.n.J(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, android.view.View):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return y() + this.f250635o.size() + this.f250629f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f250634n;
        if (i17 < linkedList.size()) {
            return ((ea3.i) linkedList.get(i17)).f250626a;
        }
        int itemCount = getItemCount();
        java.util.LinkedList linkedList2 = this.f250635o;
        if (i17 < itemCount - linkedList2.size()) {
            return 1;
        }
        int itemCount2 = i17 - (getItemCount() - linkedList2.size());
        if (linkedList2.size() <= itemCount2) {
            com.tencent.mars.xlog.Log.e("LiteAppAlbumAdapter", "getItemViewType: pos=%d, get footer type error", java.lang.Integer.valueOf(i17));
            return -1;
        }
        android.support.v4.media.f.a(linkedList2.get(itemCount2));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x048c  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r34, int r35) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.n.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "onCreateViewHolder: viewType=%d", java.lang.Integer.valueOf(i17));
        android.content.Context context = this.f250628e;
        return i17 != 2 ? new ea3.h(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eir, viewGroup, false)) : new ea3.m(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eio, viewGroup, false));
    }

    public void x() {
        this.f250630g.clear();
        notifyDataSetChanged();
        ((ea3.p) this.f250631h).m(B(), 0, 0, 1);
    }

    public int y() {
        return this.f250634n.size();
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z(int i17) {
        java.util.LinkedList linkedList = this.f250634n;
        if (i17 < linkedList.size()) {
            com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int y17 = y();
        java.util.ArrayList arrayList = this.f250629f;
        if (i17 >= y17 + arrayList.size()) {
            com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "get footer, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        if (size < arrayList.size()) {
            return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(size);
        }
        com.tencent.mars.xlog.Log.w("LiteAppAlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }
}
