package ea3;

/* loaded from: classes10.dex */
public class p extends android.widget.FrameLayout implements t23.m1, ea3.j {
    public boolean A;
    public int B;
    public int C;
    public e60.z0 D;
    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem E;
    public final ea3.z F;
    public java.util.LinkedList G;
    public final java.util.ArrayList H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f250647J;
    public final java.util.LinkedList K;
    public final e60.y0 L;
    public final e60.x0 M;
    public final ea3.k N;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f250648d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f250649e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f250650f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f250651g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f250652h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f250653i;

    /* renamed from: m, reason: collision with root package name */
    public d85.f0 f250654m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f250655n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f250656o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f250657p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f250658q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f250659r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f250660s;

    /* renamed from: t, reason: collision with root package name */
    public ul5.k f250661t;

    /* renamed from: u, reason: collision with root package name */
    public ea3.n f250662u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f250663v;

    /* renamed from: w, reason: collision with root package name */
    public int f250664w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f250665x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f250666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f250667z;

    public p(android.content.Context context, android.app.Activity activity, ea3.z zVar) {
        super(context);
        this.f250648d = "android.permission.WRITE_EXTERNAL_STORAGE";
        this.f250651g = true;
        this.f250652h = false;
        this.f250655n = false;
        this.f250656o = false;
        this.f250664w = 9;
        this.f250665x = "single";
        this.f250666y = "disable";
        this.f250667z = false;
        this.A = false;
        this.B = 3;
        this.C = 3;
        this.H = new java.util.ArrayList();
        this.I = false;
        this.f250647J = new java.util.LinkedList();
        this.K = new java.util.LinkedList();
        this.L = new ea3.p$$a(this);
        this.M = new e60.x0() { // from class: ea3.p$$b
            @Override // e60.x0
            public final boolean a(java.util.LinkedList linkedList, java.lang.Boolean bool) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem;
                ea3.p pVar = ea3.p.this;
                pVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "IonAlbumQueryResultFunction! switch:%B size:%d", bool, java.lang.Integer.valueOf(linkedList.size()));
                if (!linkedList.isEmpty()) {
                    if (pVar.G != null && linkedList.size() != pVar.G.size()) {
                        pVar.f250652h = true;
                    }
                    if (pVar.f250652h || pVar.E == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "first result switch:%B!", bool);
                        pVar.E = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) linkedList.get(0);
                        pVar.f250652h = false;
                    }
                    pVar.G = linkedList;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = pVar.E;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "before refreshCurrentFolder folder:%s %s", galleryItem$AlbumItem2.f138415d, galleryItem$AlbumItem2.f138418g);
                    com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem3 = pVar.E;
                    java.util.Iterator it = pVar.G.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) pVar.G.get(0);
                            break;
                        }
                        galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next();
                        if (galleryItem$AlbumItem3.f138415d.equals(galleryItem$AlbumItem.f138415d) && galleryItem$AlbumItem3.f138418g.equals(galleryItem$AlbumItem.f138418g)) {
                            break;
                        }
                    }
                    pVar.E = galleryItem$AlbumItem;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "after refreshCurrentFolder folder:%s %s", galleryItem$AlbumItem.f138415d, galleryItem$AlbumItem.f138418g);
                    pVar.f250656o = true;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem4 = pVar.E;
                    java.lang.String str = galleryItem$AlbumItem4.f138418g;
                    if (str == null) {
                        str = "";
                    }
                    ((t23.d) pVar.D).c(galleryItem$AlbumItem4.f138415d, bool, str);
                }
                return true;
            }
        };
        this.N = new ea3.p$$c(this);
        this.f250649e = context;
        this.f250650f = activity;
        this.F = zVar;
    }

    public static java.lang.String f(int i17) {
        if (i17 == 1) {
            return "image";
        }
        if (i17 == 2) {
            return "video";
        }
        if (i17 == 6) {
            return "image";
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "can not conver type:%d", java.lang.Integer.valueOf(i17));
        return com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    private void setAdapterMode(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setAdapterMode:%s", str);
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -902265784:
                if (str.equals("single")) {
                    c17 = 0;
                    break;
                }
                break;
            case 104256825:
                if (str.equals("multi")) {
                    c17 = 1;
                    break;
                }
                break;
            case 152731817:
                if (str.equals("exclusive-video-single")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1686617758:
                if (str.equals("exclusive")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                ea3.n nVar = this.f250662u;
                nVar.f250636p = true;
                nVar.I(1);
                ea3.n nVar2 = this.f250662u;
                nVar2.f250637q = true;
                nVar2.f250638r = false;
                nVar2.x();
                return;
            case 1:
                ea3.n nVar3 = this.f250662u;
                nVar3.f250636p = false;
                nVar3.f250637q = false;
                nVar3.I(this.f250664w);
                ea3.n nVar4 = this.f250662u;
                nVar4.f250638r = true;
                nVar4.x();
                return;
            case 2:
                ea3.n nVar5 = this.f250662u;
                nVar5.f250636p = true;
                nVar5.f250637q = true;
                nVar5.I(this.f250664w);
                ea3.n nVar6 = this.f250662u;
                nVar6.f250638r = true;
                nVar6.x();
                return;
            case 3:
                ea3.n nVar7 = this.f250662u;
                nVar7.f250636p = true;
                nVar7.f250637q = false;
                nVar7.I(this.f250664w);
                ea3.n nVar8 = this.f250662u;
                nVar8.f250638r = true;
                nVar8.x();
                return;
            default:
                ea3.n nVar9 = this.f250662u;
                nVar9.f250636p = true;
                nVar9.I(1);
                ea3.n nVar10 = this.f250662u;
                nVar10.f250637q = true;
                nVar10.f250638r = false;
                nVar10.x();
                return;
        }
    }

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "QueryMedia type:%d livePhoto:%b LivePhotoOsSupportLivePhoto:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f250667z), java.lang.Boolean.valueOf(this.A));
        if (this.D != null) {
            if (!this.f250655n || this.f250654m == null || c()) {
                ((t23.d) this.D).b(this.B, java.lang.Boolean.valueOf(this.f250667z && this.A));
            }
        }
    }

    public void b() {
        boolean wi6 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).wi(this.f250649e);
        this.f250651g = wi6;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart needReCheck:%b", java.lang.Boolean.valueOf(wi6));
        if (!this.f250651g) {
            android.view.View view = this.f250659r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f250659r == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "init bottomGuidePermissionTipsView");
            android.view.ViewStub viewStub = (android.view.ViewStub) this.f250657p.findViewById(com.tencent.mm.R.id.s_2);
            if (viewStub != null) {
                viewStub.setLayoutResource(com.tencent.mm.R.layout.eip);
                android.view.View inflate = viewStub.inflate();
                this.f250659r = inflate;
                inflate.setOnClickListener(new ea3.u(this));
            }
        }
        android.view.View view2 = this.f250659r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean c() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, this.f250654m, new ea3.v(this))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getBusinessPermission true!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getBusinessPermission false!");
        this.f250655n = false;
        return true;
    }

    public final boolean d() {
        android.content.Context context;
        int i17;
        boolean Di;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = getContext();
        ((sb0.f) jVar).getClass();
        if (zo.e.b(context2)) {
            Di = true;
        } else {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = this.f250650f;
            java.lang.String[] strArr = {this.f250648d};
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.hht);
            if (android.os.Build.VERSION.SDK_INT < 33) {
                context = getContext();
                i17 = com.tencent.mm.R.string.o7f;
            } else {
                context = getContext();
                i17 = com.tencent.mm.R.string.o7a;
            }
            Di = ((sb0.f) jVar2).Di(activity, strArr, 145, string, context.getString(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkMediaStorageOnCreate: %b", java.lang.Boolean.valueOf(Di));
        return Di;
    }

    public final void e() {
        if (!this.f250655n || this.f250654m == null || c()) {
            if (i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: hadMediaStorage");
                o();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: not hadMediaStorage");
                p(java.lang.Boolean.TRUE);
            }
        }
    }

    public final java.util.Map g(int i17, int i18, long j17, int i19, int i27, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("width", java.lang.Integer.valueOf(i17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        hashMap.put("size", java.lang.Long.valueOf(j17));
        hashMap.put("duration", java.lang.Integer.valueOf(i19));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FRAMERATE, java.lang.Integer.valueOf(i27));
        hashMap.put("isGif", java.lang.Boolean.valueOf(z17));
        return hashMap;
    }

    public final java.util.Map h(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (galleryItem$MediaItem.getType() == 2) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem;
            int round = (int) java.lang.Math.round(galleryItem$VideoMediaItem.f138446x / 1000);
            int i17 = galleryItem$VideoMediaItem.f138448z;
            int i18 = galleryItem$VideoMediaItem.f138447y;
            int i19 = galleryItem$VideoMediaItem.C;
            long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video duration:%d width:%d height:%d framerate:%d size:%d", java.lang.Integer.valueOf(round), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(k17));
            return g(i17, i18, k17, round, i19, false);
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String o17 = galleryItem$MediaItem.getType() == 6 ? galleryItem$MediaItem.o() : galleryItem$MediaItem.f138430e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(o17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "getItemInfo", "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)Ljava/util/Map;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "getItemInfo", "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)Ljava/util/Map;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i27 = options.outWidth;
        int i28 = options.outHeight;
        long k18 = com.tencent.mm.vfs.w6.k(o17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image width:%d height:%d size:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(k18));
        return g(i27, i28, k18, 0, 0, galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif"));
    }

    public boolean i() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, this.f250648d, true);
        this.f250653i = d17;
        return d17;
    }

    public void j() {
        android.view.View view = this.f250658q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f250660s;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.eiq, (android.view.ViewGroup) this, false);
        this.f250657p = inflate;
        addView(inflate, -1, -1);
        this.f250662u = new ea3.n(getContext(), this);
        this.f250658q = this.f250657p.findViewById(com.tencent.mm.R.id.u_p);
        this.f250660s = (androidx.recyclerview.widget.RecyclerView) this.f250657p.findViewById(com.tencent.mm.R.id.u_r);
        this.f250663v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u_q);
        android.content.Context context = this.f250649e;
        this.f250661t = new com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView(context);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f250660s.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f250660s);
        }
        this.f250661t.setView(this.f250660s);
        ((com.tencent.mm.ui.widget.pulldown.WeUIBounceViewV2) this.f250661t).q();
        addView(this.f250661t.getView(), 0);
        this.f250660s.setLayoutManager(new com.tencent.mm.plugin.lite.media.album.LiteAppGridLayoutManager(getContext(), 4));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f250660s;
        e60.c1 c1Var = (e60.c1) i95.n0.c(e60.c1.class);
        android.content.Context context2 = getContext();
        ((d60.y) c1Var).getClass();
        android.content.res.Resources resources = context2.getResources();
        recyclerView.N(new e33.h2(resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a1z), resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a1z), b3.l.getColor(context2, com.tencent.mm.R.color.f479163rn), true, new java.util.ArrayList(), 0, 0, null));
        this.f250662u.f250642v = this.N;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (zo.e.b(context)) {
            ea3.l lVar = new ea3.l(2);
            this.f250662u.E(2);
            java.util.LinkedList linkedList = this.f250662u.f250634n;
            linkedList.remove(lVar);
            linkedList.add(lVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: add selectSystemMediaHeader");
        }
        ea3.n nVar = this.f250662u;
        nVar.f250633m = this.B;
        nVar.I(this.f250664w);
        this.f250662u.f250638r = true;
        setAdapterMode(this.f250665x);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f250660s;
        ea3.n nVar2 = this.f250662u;
        nVar2.getClass();
        recyclerView2.setAdapter(nVar2);
        b();
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.d dVar = new t23.d();
        this.D = dVar;
        e60.x0 x0Var = this.M;
        int i17 = this.B;
        e60.y0 y0Var = this.L;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "setup: queryType=" + i17);
        dVar.f415125a = x0Var;
        dVar.f415126b = i17;
        dVar.f415128d = y0Var;
        this.f250653i = d();
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        this.A = qp.b.f365678e;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "init checkMediaStorage[%b] LivePhotoOsSupportLivePhoto[%b]", java.lang.Boolean.valueOf(this.f250653i), java.lang.Boolean.valueOf(this.A));
        if (this.f250653i) {
            a(this.B);
        } else {
            this.f250660s.setVisibility(8);
        }
    }

    public final boolean l(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e.equals(galleryItem$MediaItem.f138430e)) {
                return false;
            }
        }
        return true;
    }

    public void m(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onSelectItemChanged count:%d, position:%d selectPosition:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.util.ArrayList arrayList = this.f250662u.f250630g;
        if (i27 == 0) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i19);
            if (l(galleryItem$MediaItem)) {
                java.util.ArrayList arrayList2 = this.H;
                arrayList2.add(galleryItem$MediaItem);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList2.size()));
            }
        }
        n(arrayList);
    }

    public final void n(java.util.ArrayList arrayList) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", f(galleryItem$MediaItem.getType()));
            java.lang.String str4 = "";
            if (galleryItem$MediaItem.getType() == 2) {
                zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
                java.lang.String str5 = galleryItem$MediaItem.f138430e;
                ((yg0.u4) r3Var).getClass();
                com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(str5);
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                str = b17.f182736e;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video:%s", str);
            } else {
                boolean z17 = true;
                if (galleryItem$MediaItem.getType() == 1) {
                    str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(galleryItem$MediaItem.f138430e).f182736e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image:%s", str);
                } else if (galleryItem$MediaItem.getType() == 6) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem;
                    if (galleryItem$LivePhotoMediaItem.H == 1 && ((i17 = galleryItem$LivePhotoMediaItem.A) == 1 || i17 == 0)) {
                        if (galleryItem$LivePhotoMediaItem.G != 1) {
                            aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(galleryItem$MediaItem.f138434i, galleryItem$MediaItem.f138430e, galleryItem$MediaItem.f138433h, 0L);
                            boolean z18 = Ai.f12975a.f12960a;
                            galleryItem$LivePhotoMediaItem.G = 1;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z18), Ai.toString());
                            z17 = z18;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "isParsedVideo == 1!");
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getVideoMetaData success");
                            zg0.r3 r3Var2 = (zg0.r3) i95.n0.c(zg0.r3.class);
                            java.lang.String str6 = galleryItem$MediaItem.f138430e;
                            ((yg0.u4) r3Var2).getClass();
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b18 = com.tencent.mm.plugin.webview.model.m4.b(str6);
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b18);
                            str3 = b18.f182736e;
                            str2 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(galleryItem$MediaItem.f138433h).f182736e;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s videolocal id is : %s", galleryItem$MediaItem.f138430e, str2, str3);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getVideoMetaData fail");
                            java.lang.String str7 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(galleryItem$MediaItem.f138433h).f182736e;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s", galleryItem$MediaItem.f138433h, str7);
                            str2 = "";
                            str4 = str7;
                            str3 = str2;
                        }
                        java.lang.String str8 = str4;
                        str4 = str3;
                        str = str8;
                        hashMap.put("info", h(galleryItem$MediaItem));
                        if (!str4.isEmpty() || str2.isEmpty()) {
                            hashMap.put(dm.i4.COL_LOCALID, str);
                        } else {
                            hashMap.put(dm.i4.COL_LOCALID, str2);
                            hashMap.put("videoLocalId", str4);
                        }
                        arrayList2.add(hashMap);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "live photo but not trigger the live state");
                        str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(galleryItem$MediaItem.f138433h).f182736e;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s", galleryItem$MediaItem.f138433h, str);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "onSelectItemChangedEvent item no support type:%d", java.lang.Integer.valueOf(galleryItem$MediaItem.getType()));
                }
            }
            str2 = "";
            hashMap.put("info", h(galleryItem$MediaItem));
            if (str4.isEmpty()) {
            }
            hashMap.put(dm.i4.COL_LOCALID, str);
            arrayList2.add(hashMap);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("selectedItems", arrayList2);
        com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView liteAppAlbumView = (com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView) this.F;
        liteAppAlbumView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onSelectedItemsChanged" + hashMap2);
        io.flutter.plugin.common.MethodChannel methodChannel = liteAppAlbumView.f144121e;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onSelectedItemsChanged", hashMap2);
        }
    }

    public void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "showGalleryAfterPermissionRequestSuccess: ");
        j();
        b();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (zo.e.b(this.f250649e)) {
            ea3.l lVar = new ea3.l(2);
            ea3.n nVar = this.f250662u;
            if (nVar != null) {
                nVar.E(2);
                java.util.LinkedList linkedList = this.f250662u.f250634n;
                linkedList.remove(lVar);
                linkedList.add(lVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: add selectSystemMediaHeader");
        } else {
            ea3.n nVar2 = this.f250662u;
            if (nVar2 != null) {
                nVar2.E(2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: delete selectSystemMediaHeader");
        }
        a(this.B);
    }

    public void p(java.lang.Boolean bool) {
        java.lang.String string;
        if (this.f250658q == null || this.f250660s == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[showNoPermissionView] view found null, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "showNoPermissionView: from sys=%b", bool);
        android.view.View view = this.f250658q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f250660s.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) this.f250658q.findViewById(com.tencent.mm.R.id.f482884qr);
        android.widget.TextView textView2 = (android.widget.TextView) this.f250658q.findViewById(com.tencent.mm.R.id.f482885qs);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (bool.booleanValue()) {
            textView.setText(android.os.Build.VERSION.SDK_INT < 33 ? com.tencent.mm.R.string.o7e : com.tencent.mm.R.string.o7d);
            textView2.setOnClickListener(new ea3.s(this));
            return;
        }
        d85.f0 f0Var = this.f250654m;
        java.lang.String str = f0Var == null ? "" : f0Var.f227176d;
        java.lang.String str2 = null;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            android.content.Context context = getContext();
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            if (str != null && (str2 = (java.lang.String) e85.i.f250318d.get(str)) == null) {
                str2 = "";
            }
            string = context.getString(com.tencent.mm.R.string.o7b, str2 != null ? str2 : "");
        } else {
            android.content.Context context2 = getContext();
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            if (str != null && (str2 = (java.lang.String) e85.i.f250318d.get(str)) == null) {
                str2 = "";
            }
            string = context2.getString(com.tencent.mm.R.string.o7c, str2 != null ? str2 : "");
        }
        textView.setText(string);
        textView2.setOnClickListener(new ea3.t(this));
    }

    public final void q(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2;
        int i17;
        ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
        if (t23.p0.l() != null) {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            arrayList2 = new java.util.ArrayList(t23.p0.l());
        } else {
            arrayList2 = this.f250662u.f250629f;
        }
        if (arrayList == null || this.f250662u == null) {
            return;
        }
        int i18 = 0;
        x.d dVar = new x.d(0);
        for (int i19 = 0; i19 < this.f250662u.f250630g.size(); i19++) {
            int indexOf = this.f250662u.f250629f.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f250662u.f250630g.get(i19));
            if (indexOf != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf));
            }
        }
        java.util.ArrayList arrayList3 = this.f250662u.f250630g;
        arrayList3.clear();
        if (arrayList2 == null) {
            com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "setSelectedMediaPaths but null");
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                int indexOf2 = arrayList2.indexOf(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, "", ""));
                if (indexOf2 >= 0) {
                    arrayList3.add((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(indexOf2));
                } else {
                    if (str != null && arrayList2.size() > 0) {
                        i17 = 0;
                        while (i17 < arrayList2.size()) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(i17);
                            if (galleryItem$MediaItem.getClass() == com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem.class && galleryItem$MediaItem.o().equals(str)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    i17 = -1;
                    if (i17 >= 0) {
                        arrayList3.add((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(i17));
                    } else {
                        java.lang.String c17 = q75.g.c(str);
                        if (str.toLowerCase().endsWith("mp4")) {
                            arrayList3.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, 0L, str, "", ""));
                        } else {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                                c17 = "";
                            }
                            arrayList3.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, str, "", c17));
                        }
                    }
                }
            }
        }
        ea3.n nVar = this.f250662u;
        while (true) {
            java.util.ArrayList arrayList4 = nVar.f250630g;
            if (i18 >= arrayList4.size()) {
                break;
            }
            int indexOf3 = nVar.f250629f.indexOf((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList4.get(i18));
            if (indexOf3 != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf3));
            }
            i18++;
        }
        java.util.Iterator it6 = dVar.iterator();
        while (it6.hasNext()) {
            nVar.notifyItemChanged(((java.lang.Integer) it6.next()).intValue() + nVar.y());
        }
        java.util.ArrayList arrayList5 = this.f250662u.f250630g;
        java.util.Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it7.next();
            if (l(galleryItem$MediaItem2)) {
                java.util.ArrayList arrayList6 = this.H;
                arrayList6.add(galleryItem$MediaItem2);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList6.size()));
            }
        }
        n(arrayList5);
    }

    public void r() {
        java.util.LinkedList linkedList = this.K;
        linkedList.clear();
        java.util.Iterator it = this.f250647J.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            int type = galleryItem$MediaItem.getType();
            int i17 = this.C;
            boolean z17 = true;
            if (i17 != 3 && i17 != type && (i17 != 1 || type != 6)) {
                z17 = false;
            }
            if (z17) {
                linkedList.add(galleryItem$MediaItem);
            }
        }
    }

    public void setBusiness(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setBusiness:%d", java.lang.Integer.valueOf(i17));
        for (d85.f0 f0Var : d85.f0.values()) {
            int i18 = f0Var.f227177e;
            if (i18 == i17) {
                this.f250654m = f0Var;
                this.f250655n = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "business matched! %d %s", java.lang.Integer.valueOf(i18), this.f250654m.f227176d);
                return;
            }
        }
        this.f250655n = false;
    }

    public void setLivePhoto(boolean z17) {
        this.f250667z = z17;
        if (this.f250662u != null) {
            this.f250652h = true;
            this.I = true;
            if (this.f250653i) {
                a(this.B);
            }
        }
    }

    public void setPreview(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setPreview:%s", str);
        this.f250666y = str;
    }

    public void setQueryMode(java.lang.String str) {
        this.f250665x = str;
        if (this.f250662u != null) {
            setAdapterMode(str);
        }
    }

    public void setQueryType(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setQueryType %d", java.lang.Integer.valueOf(i17));
        this.B = i17;
        ea3.n nVar = this.f250662u;
        if (nVar != null) {
            nVar.f250633m = i17;
            this.f250652h = true;
            this.I = true;
            if (this.f250653i) {
                a(i17);
            }
        }
    }

    public void setSelectLimitCount(int i17) {
        if (this.f250662u != null && !"single".equals(this.f250665x)) {
            this.f250662u.I(i17);
        }
        this.f250664w = i17;
    }

    public void setSelectedIds(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(new java.util.LinkedHashSet(arrayList));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).isEmpty()) {
                it.remove();
            }
        }
        java.util.Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            if (((java.lang.String) it6.next()).startsWith("liteappLocalId")) {
                it6.remove();
            }
        }
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            java.lang.String str = (java.lang.String) it7.next();
            int i17 = 0;
            while (true) {
                arrayList2 = this.H;
                if (i17 >= arrayList2.size()) {
                    i17 = -1;
                    break;
                } else if (str.equals(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(i17)).f138430e)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList3.add((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(i17));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setSelectedIds: " + java.util.Arrays.toString(arrayList3.toArray()));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        ea3.n nVar = this.f250662u;
        if (nVar != null) {
            java.util.ArrayList arrayList6 = nVar.f250630g;
            arrayList6.clear();
            arrayList6.addAll(arrayList3);
            nVar.notifyDataSetChanged();
            arrayList5 = this.f250662u.f250630g;
        }
        n(arrayList5);
    }

    public void setShowType(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setShowType:%d", java.lang.Integer.valueOf(i17));
        this.C = i17;
        if (this.f250662u != null) {
            r();
            ea3.n nVar = this.f250662u;
            java.util.LinkedList linkedList = this.K;
            java.util.ArrayList arrayList = nVar.f250629f;
            arrayList.clear();
            arrayList.addAll(linkedList);
            nVar.notifyDataSetChanged();
        }
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onQueryMediaFinished size:%d", java.lang.Integer.valueOf(linkedList.size()));
    }
}
