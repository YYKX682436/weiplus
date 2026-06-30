package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class n3 implements zb5.f, com.tencent.mm.ui.chatting.gallery.q4, k70.w, wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public zb5.g f202356d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f202357e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f202358f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f202359g;

    /* renamed from: h, reason: collision with root package name */
    public long f202360h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.adapter.a0 f202361i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f202362m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f202363n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f202364o;

    /* renamed from: p, reason: collision with root package name */
    public int f202365p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f202366q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f202367r;

    /* renamed from: s, reason: collision with root package name */
    public int f202368s;

    /* renamed from: t, reason: collision with root package name */
    public int f202369t;

    public n3(android.content.Context context) {
        this.f202357e = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f202363n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GalleryPhotoInfoEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$3
            {
                this.__eventId = 1036677180;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent) {
                com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent2 = galleryPhotoInfoEvent;
                long j17 = galleryPhotoInfoEvent2.f54355g.f6947c;
                com.tencent.mm.ui.chatting.presenter.n3 n3Var = com.tencent.mm.ui.chatting.presenter.n3.this;
                java.util.Iterator it = n3Var.f202361i.f198386f.iterator();
                int i17 = -1;
                int i18 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i18++;
                    com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.ui.chatting.adapter.w) it.next()).f198447b;
                    if (f9Var != null && f9Var.getMsgId() == j17) {
                        i17 = i18;
                        break;
                    }
                }
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) n3Var.d(n3Var.f202358f);
                int w17 = gridLayoutManager.w();
                int y17 = gridLayoutManager.y();
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
                if (i17 >= w17 && i17 <= y17) {
                    android.view.View childAt = ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) n3Var.f202356d).f200745f.getChildAt(i17 - w17);
                    if (childAt != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        int i19 = iArr[0];
                        am.je jeVar = galleryPhotoInfoEvent2.f54356h;
                        jeVar.f7027a = i19;
                        jeVar.f7028b = iArr[1];
                        jeVar.f7029c = childAt.getWidth();
                        jeVar.f7030d = childAt.getHeight();
                    }
                }
                return false;
            }
        };
        this.f202364o = false;
        this.f202365p = 0;
        this.f202366q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f202367r = false;
        this.f202368s = 0;
        this.f202369t = 0;
        this.f202358f = context;
        this.f202357e = new java.util.ArrayList();
    }

    public final void c(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent) {
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6327m = 45;
        c4Var.f6323i = (android.app.Activity) this.f202358f;
        doFavoriteEvent.e();
        int i17 = doFavoriteEvent.f54091h.f6433a;
        if (i17 == -2 || i17 > 0 || i17 > 0) {
            return;
        }
        am.c4 c4Var2 = doFavoriteEvent.f54090g;
        if (14 != c4Var2.f6317c) {
            return;
        }
        r45.sq0 sq0Var = c4Var2.f6316b;
        if (sq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f385906d), java.lang.Integer.valueOf(c4Var2.f6316b.f385907e), java.lang.Integer.valueOf(c4Var2.f6316b.f385908f), java.lang.Integer.valueOf(c4Var2.f6316b.f385909g), java.lang.Integer.valueOf(c4Var2.f6316b.f385910h), java.lang.Integer.valueOf(c4Var2.f6316b.f385911i), java.lang.Integer.valueOf(c4Var2.f6316b.f385912m), java.lang.Integer.valueOf(c4Var2.f6316b.f385913n), java.lang.Integer.valueOf(c4Var2.f6316b.f385914o), java.lang.Integer.valueOf(c4Var2.f6316b.f385915p), java.lang.Integer.valueOf(c4Var2.f6316b.f385916q), java.lang.Integer.valueOf(c4Var2.f6316b.f385917r), java.lang.Integer.valueOf(c4Var2.f6316b.f385918s), java.lang.Integer.valueOf(c4Var2.f6316b.f385919t), java.lang.Integer.valueOf(c4Var2.f6316b.f385920u));
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.q4
    public void clear() {
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        if (this.f202362m == null) {
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 4);
            this.f202362m = gridLayoutManager;
            gridLayoutManager.B = new com.tencent.mm.ui.chatting.presenter.e3(this);
        }
        return this.f202362m;
    }

    public final boolean e() {
        return this.f202365p == 0;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", java.lang.Integer.valueOf(this.f202365p), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str2);
        if (((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) this.f202356d).f200753q) {
            this.f202365p--;
            if (!com.tencent.mm.ui.chatting.gallery.k1.j(this.f202358f, pt0.f0.Li(this.f202359g, j18), false)) {
                this.f202367r = true;
            }
            if (e()) {
                boolean z17 = this.f202367r;
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f202366q;
                if (z17) {
                    n3Var.post(new com.tencent.mm.ui.chatting.presenter.i3(this));
                } else {
                    n3Var.post(new com.tencent.mm.ui.chatting.presenter.h3(this));
                }
            }
        }
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        zb5.g gVar = this.f202356d;
        if (gVar == null || !((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).f200753q) {
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = r1Var.f445529a;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
            k();
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) this.f202356d).U6(0);
        } else if (h17.i()) {
            this.f202365p--;
            com.tencent.mm.ui.chatting.gallery.k1.l(this.f202358f, pt0.f0.Li(h17.h(), h17.f415016n), false);
        }
        if (e()) {
            boolean z17 = this.f202367r;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f202366q;
            if (z17) {
                n3Var.post(new com.tencent.mm.ui.chatting.presenter.j3(this));
            } else {
                n3Var.post(new com.tencent.mm.ui.chatting.presenter.k3(this));
            }
        }
    }

    public void j(boolean z17, int i17) {
        if (!z17 && this.f202369t + this.f202368s == this.f202357e.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", java.lang.Integer.valueOf(this.f202369t), java.lang.Integer.valueOf(i17));
            return;
        }
        this.f202361i.f198392o = true;
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) this.f202356d;
        if (z17) {
            mediaHistoryGalleryUI.W6(true, null);
        } else {
            mediaHistoryGalleryUI.f200760x = ((androidx.recyclerview.widget.GridLayoutManager) mediaHistoryGalleryUI.f200745f.getLayoutManager()).y();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading mLastVisibleItemPosition:%s", java.lang.Integer.valueOf(mediaHistoryGalleryUI.f200760x));
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.d3(this, z17, i17), "MediaHistoryLoadData");
    }

    public void k() {
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) this.f202356d;
        mediaHistoryGalleryUI.X6();
        mediaHistoryGalleryUI.f200753q = false;
        mediaHistoryGalleryUI.W6(false, "");
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.chatting.gallery.q4
    public void l0(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.f202364o = true;
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202363n.dead();
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) this.f202356d;
        mediaHistoryGalleryUI.getClass();
        mediaHistoryGalleryUI.f200743d = null;
        this.f202356d = null;
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        r4Var.f201335c.clear();
        r4Var.b();
        r4Var.f201334b = false;
        com.tencent.mm.ui.chatting.x3.a();
    }
}
