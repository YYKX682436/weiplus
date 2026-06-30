package e45;

/* loaded from: classes10.dex */
public final class h implements t23.m1 {
    public static long C;
    public final e45.g A;
    public final d45.d B;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f249382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f249383e;

    /* renamed from: f, reason: collision with root package name */
    public final int f249384f;

    /* renamed from: g, reason: collision with root package name */
    public final int f249385g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f249386h;

    /* renamed from: i, reason: collision with root package name */
    public int f249387i;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f249388m;

    /* renamed from: n, reason: collision with root package name */
    public final int f249389n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView f249390o;

    /* renamed from: p, reason: collision with root package name */
    public d45.q f249391p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f249392q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f249393r;

    /* renamed from: s, reason: collision with root package name */
    public long f249394s;

    /* renamed from: t, reason: collision with root package name */
    public t23.p1 f249395t;

    /* renamed from: u, reason: collision with root package name */
    public int f249396u;

    /* renamed from: v, reason: collision with root package name */
    public int f249397v;

    /* renamed from: w, reason: collision with root package name */
    public int f249398w;

    /* renamed from: x, reason: collision with root package name */
    public volatile e45.a f249399x;

    /* renamed from: y, reason: collision with root package name */
    public d45.d f249400y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f249401z;

    public h(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f249382d = activity;
        this.f249384f = 26;
        this.f249385g = 3;
        this.f249387i = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigFileSelectorMaxCount());
        this.f249388m = -1L;
        this.f249389n = 3;
        this.f249395t = t23.p1.f415247d;
        this.f249396u = -1;
        this.f249397v = -1;
        this.A = new e45.g(this);
        this.B = new e45.e(this);
    }

    public final void a(java.util.List list) {
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (!com.tencent.mm.vfs.w6.j(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "filter non exist media: %s.", galleryItem$MediaItem.f138430e);
                linkedList.add(galleryItem$MediaItem);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    public final void b(int i17, boolean z17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        long j17;
        d45.q qVar = this.f249391p;
        if (qVar != null) {
            java.lang.Object obj = qVar.f226457g.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
        } else {
            galleryItem$MediaItem = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f249392q) && !kotlin.jvm.internal.o.b("medianote", this.f249393r)) {
            if (android.os.SystemClock.elapsedRealtime() - this.f249394s < 1000) {
                com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "sendImg btn event frequency limit");
                return;
            }
            com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "notifyMM switch to SendImgProxyUI");
            boolean z18 = false;
            if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 2) {
                z18 = true;
            }
            if (!z18) {
                if (galleryItem$MediaItem != null) {
                    try {
                        j17 = galleryItem$MediaItem.f138434i;
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    j17 = 0;
                }
                j33.d0.k(j17, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null, this.f249393r, false, 0, z17, galleryItem$MediaItem);
            }
        }
        j33.d0.p(this.f249382d, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138434i : 0L, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null, this.f249393r, false, 0, z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
    
        if (zo.e.b(r2) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e45.h.c():void");
    }

    public final void d(int i17) {
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f249382d;
        int b76 = i17 + fileSelectorUI.b7();
        fileSelectorUI.o7();
        if (b76 == 0) {
            fileSelectorUI.enableOptionMenu(false);
            fileSelectorUI.updateOptionMenuText(1, fileSelectorUI.getString(com.tencent.mm.R.string.f490551ya));
            return;
        }
        fileSelectorUI.enableOptionMenu(true);
        fileSelectorUI.updateOptionMenuText(1, fileSelectorUI.getString(com.tencent.mm.R.string.f490551ya) + '(' + b76 + "/9)");
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (j17 != this.f249388m) {
            com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f249388m));
            com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            return;
        }
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("FS.AlbumFileUIC", "onQueryMediaFinished, null == mediaItems");
            return;
        }
        d45.q qVar = this.f249391p;
        if (qVar != null) {
            qVar.B();
        }
        linkedList.size();
        d45.q qVar2 = this.f249391p;
        if (qVar2 != null) {
            if (z17 || qVar2.B() > linkedList.size()) {
                a(linkedList);
            } else {
                java.util.List subList = linkedList.subList(qVar2.B(), linkedList.size());
                kotlin.jvm.internal.o.f(subList, "subList(...)");
                a(subList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(this.f249391p == null);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = com.tencent.mm.sdk.platformtools.z3.b(true);
            com.tencent.mars.xlog.Log.i("FS.AlbumFileUIC", "[onQueryMediaFinished] adapter is null?:%s %s", objArr);
            if (this.f249391p != null) {
                e45.b bVar = new e45.b();
                bVar.f249371d = new java.lang.ref.WeakReference(this.f249391p);
                bVar.f249372e = new java.lang.ref.WeakReference(this.f249386h);
                bVar.f249373f = new java.lang.ref.WeakReference(this.f249390o);
                bVar.f249374g = linkedList2;
                bVar.f249375h = z17;
                if (e45.a.f249368d == this.f249399x) {
                    this.f249399x = e45.a.f249369e;
                }
                t23.p0.n().c(bVar);
            }
        }
    }
}
