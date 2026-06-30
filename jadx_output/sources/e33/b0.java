package e33;

/* loaded from: classes10.dex */
public class b0 extends androidx.recyclerview.widget.f2 implements e33.j2 {
    public boolean A;
    public boolean B;
    public f60.a C;
    public boolean D;
    public boolean E;
    public final kn5.e F;
    public final kn5.g G;
    public final android.view.View.OnLongClickListener H;
    public final android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f247127J;
    public long K;
    public e33.r L;
    public final android.view.View.OnClickListener M;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f247129e;

    /* renamed from: h, reason: collision with root package name */
    public final e33.i2 f247132h;

    /* renamed from: m, reason: collision with root package name */
    public int f247134m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f247135n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f247137p;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f247143v;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f247145x;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f247147z;

    /* renamed from: d, reason: collision with root package name */
    public int f247128d = 9;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f247130f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f247131g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f247133i = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());

    /* renamed from: o, reason: collision with root package name */
    public int f247136o = 10;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f247138q = "";

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f247139r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f247140s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f247141t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f247142u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f247144w = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f247146y = false;

    public b0(boolean z17, android.content.Context context, e33.i2 i2Var) {
        this.f247143v = false;
        this.f247145x = false;
        this.f247147z = t23.p0.k().f415297f == 3 && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi();
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = false;
        this.E = false;
        e33.d dVar = new e33.d(this);
        this.G = new e33.g(this);
        this.H = new e33.h(this);
        this.I = new e33.i(this);
        this.M = new e33.b(this);
        this.f247129e = context;
        this.f247132h = i2Var;
        this.f247143v = z17;
        this.F = kn5.e.E.a(context, dVar, new e33.c(this, context));
        this.f247145x = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumItemDebugLabel()) == 1;
        for (int i17 = 0; i17 < 32; i17++) {
            this.f247130f.add(new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem());
        }
        notifyDataSetChanged();
    }

    public static void x(e33.b0 b0Var, android.view.View view) {
        b0Var.getClass();
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) tag).intValue();
            b0Var.E = b0Var.f247131g.contains(b0Var.E(intValue));
            b0Var.F.f(true, intValue);
        }
    }

    public java.lang.String B(int i17) {
        java.util.LinkedList linkedList = this.f247139r;
        if (i17 < linkedList.size()) {
            i17 = linkedList.size();
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = E(i17);
        if (E == null) {
            return "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(E.f138441s)) {
            return E.f138441s;
        }
        return com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(E.f138435m), this.f247129e);
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E(int i17) {
        java.util.LinkedList linkedList = this.f247139r;
        if (i17 < linkedList.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (i17 >= z() + I()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "get footer, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        java.util.ArrayList arrayList = this.f247130f;
        if (size < arrayList.size()) {
            return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(size);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }

    public int I() {
        return this.f247130f.size();
    }

    public int J() {
        return this.f247131g.size();
    }

    public java.util.ArrayList K() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f247131g.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e);
        }
        return arrayList;
    }

    public java.util.ArrayList L(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f247130f.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (i17 == 2) {
                if (galleryItem$MediaItem.getType() == i17) {
                    arrayList.add(galleryItem$MediaItem);
                }
            } else if (galleryItem$MediaItem.r()) {
                arrayList.add(galleryItem$MediaItem);
            }
        }
        return arrayList;
    }

    public void M(x.d dVar) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f247131g;
            if (i17 >= arrayList.size()) {
                break;
            }
            int indexOf = this.f247130f.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17));
            if (indexOf != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf));
            }
            i17++;
        }
        java.util.Iterator it = dVar.iterator();
        while (it.hasNext()) {
            notifyItemChanged(((java.lang.Integer) it.next()).intValue() + z());
        }
    }

    public void N(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.util.ArrayList arrayList = this.f247131g;
        if (arrayList.contains(galleryItem$MediaItem)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int indexOf = arrayList.indexOf(galleryItem$MediaItem); indexOf < arrayList.size(); indexOf++) {
                int indexOf2 = this.f247130f.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(indexOf));
                if (indexOf2 != -1) {
                    arrayList2.add(java.lang.Integer.valueOf(indexOf2));
                }
            }
            arrayList.remove(galleryItem$MediaItem);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                notifyItemChanged(((java.lang.Integer) it.next()).intValue() + z());
            }
        }
    }

    public void O(java.util.ArrayList arrayList, java.util.List list) {
        java.util.ArrayList arrayList2 = this.f247131g;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s].", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        arrayList2.clear();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, "", "");
                if (list != null) {
                    int indexOf = list.indexOf(b17);
                    if (indexOf >= 0) {
                        arrayList2.add((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) list.get(indexOf));
                    } else {
                        java.lang.String c17 = q75.g.c(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
                        int indexOf2 = arrayList3.indexOf(b17);
                        if (indexOf2 >= 0) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList3.get(indexOf2);
                            if (galleryItem$MediaItem.getType() == 6) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "setSelectedMediaPaths >> previewList is no exist in other folder mediaId: %d", java.lang.Long.valueOf(galleryItem$MediaItem.f138434i));
                                arrayList2.add(galleryItem$MediaItem);
                            }
                        }
                        if (str.toLowerCase().endsWith("mp4")) {
                            arrayList2.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, 0L, str, "", ""));
                        } else {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                                c17 = "";
                            }
                            arrayList2.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, str, "", c17));
                        }
                    }
                }
            }
        }
    }

    public final void P(java.lang.String str) {
        android.content.Context context = this.f247129e;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(str);
        u1Var.n(context.getString(com.tencent.mm.R.string.fil));
        u1Var.l(new com.tencent.mm.plugin.fav.ui.gallery.u0$$a());
        u1Var.q(false);
        if (this.D) {
            com.tencent.mm.sdk.platformtools.u3.i(new e33.a(this), 200L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02fc, code lost:
    
        if (r2 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0371, code lost:
    
        if (((r5 != null ? r5.f138446x : 0) / 1000) > r4) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0297, code lost:
    
        if ((r2 != null && r2.a() == r5) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0275, code lost:
    
        if (r2.d() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0277, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(int r23, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.b0.Q(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, android.view.View):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return z() + this.f247140s.size() + I();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f247139r;
        if (i17 < linkedList.size()) {
            return ((e33.q) linkedList.get(i17)).f247437a;
        }
        int itemCount = getItemCount();
        java.util.LinkedList linkedList2 = this.f247140s;
        if (i17 < itemCount - linkedList2.size()) {
            return 1;
        }
        int itemCount2 = i17 - (getItemCount() - linkedList2.size());
        if (linkedList2.size() > itemCount2) {
            return ((e33.p) linkedList2.get(itemCount2)).f247428a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumAdapter", "getItemViewType: pos=%d, get footer type error", java.lang.Integer.valueOf(i17));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06a0  */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r44, int r45) {
        /*
            Method dump skipped, instructions count: 2105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.b0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f247129e;
        return i17 != 0 ? (i17 == 2 || i17 == 3) ? new e33.u(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bdk, viewGroup, false)) : i17 != 4 ? new e33.m(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cie, viewGroup, false)) : new e33.w(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.an_, viewGroup, false)) : new e33.o(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.o_, viewGroup, false));
    }

    public void y(e33.q qVar) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
            return;
        }
        java.util.LinkedList linkedList = this.f247139r;
        linkedList.remove(qVar);
        linkedList.add(qVar);
    }

    public int z() {
        return this.f247139r.size();
    }
}
