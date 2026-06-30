package com.tencent.mm.plugin.record.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes12.dex */
public class RecordMsgImageUI extends com.tencent.mm.ui.MMActivity implements zs3.t, g04.h, o72.e5, com.tencent.mm.plugin.fav.ui.l1 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f155309J = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.m1 f155313g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f155314h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.f2 f155315i;

    /* renamed from: q, reason: collision with root package name */
    public bt3.b2 f155320q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f155321r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f155323t;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.nc f155325v;

    /* renamed from: w, reason: collision with root package name */
    public kd0.p2 f155326w;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f155310d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f155311e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f155312f = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public int f155316m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f155317n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155318o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155319p = null;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f155322s = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final boolean f155324u = com.tencent.mm.plugin.scanner.k1.f158750b;

    /* renamed from: x, reason: collision with root package name */
    public int f155327x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f155328y = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155329z = false;
    public int A = 0;
    public com.tencent.mm.plugin.fav.ui.widget.FavVideoView B = null;
    public final android.widget.AdapterView.OnItemSelectedListener C = new com.tencent.mm.plugin.record.ui.z1(this);
    public final db5.t4 D = new com.tencent.mm.plugin.record.ui.n1(this);
    public final db5.t4 E = new com.tencent.mm.plugin.record.ui.o1(this);
    public final java.lang.Runnable F = new com.tencent.mm.plugin.record.ui.t1(this);
    public final com.tencent.mm.sdk.event.IListener G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.record.ui.RecordMsgImageUI.17
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
            com.tencent.mm.plugin.record.ui.g2 g2Var = new com.tencent.mm.plugin.record.ui.g2(null);
            g2Var.f155395a = recogQBarOfImageFileResultEvent2;
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.this;
            ((java.util.HashMap) recordMsgImageUI.f155322s).put(str, g2Var);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = recordMsgImageUI.f155321r;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            recordMsgImageUI.Y6(false);
            return true;
        }
    };
    public final com.tencent.mm.modelcdntran.c1 H = new com.tencent.mm.modelcdntran.c1() { // from class: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$a
        @Override // com.tencent.mm.modelcdntran.c1
        public final void a(int i17, com.tencent.mm.modelcdntran.d1 d1Var) {
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = com.tencent.mm.plugin.record.ui.RecordMsgImageUI.this;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "CdnMediaListener %s %s %s", java.lang.Long.valueOf(recordMsgImageUI.f155317n), java.lang.Integer.valueOf(i17), d1Var.f70908d);
            if (recordMsgImageUI.f155317n == d1Var.f70919o) {
                boolean z17 = true;
                if (i17 != 1) {
                    return;
                }
                int k17 = recordMsgImageUI.V6().k();
                if (k17 != 15 && k17 != 4) {
                    z17 = false;
                }
                if (z17) {
                    return;
                }
                java.util.Iterator it = recordMsgImageUI.f155310d.iterator();
                while (it.hasNext()) {
                    if (((com.tencent.mm.plugin.fav.ui.gallery.r) it.next()).i().equals(d1Var.f70907c)) {
                        com.tencent.mm.sdk.platformtools.u3.h(recordMsgImageUI.F);
                        return;
                    }
                }
            }
        }
    };
    public int I = -1;

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        int k17 = V6().k();
        if (k17 == 15 || k17 == 4) {
            return;
        }
        java.util.Iterator it = this.f155310d.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.fav.ui.gallery.r) it.next()).i().equals(yVar.field_dataId)) {
                com.tencent.mm.sdk.platformtools.u3.h(this.F);
                return;
            }
        }
    }

    @Override // o72.e5
    public void L0() {
    }

    public void T6() {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, getIntent().getIntExtra("key_favorite_source_type", 1), W6());
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6327m = 10;
        c4Var.f6323i = this;
        doFavoriteEvent.e();
    }

    public final void U6() {
        if (this.f155313g == null || !X6()) {
            finish();
        } else {
            this.f155313g.a(false);
        }
    }

    public com.tencent.mm.plugin.fav.ui.gallery.r V6() {
        return this.f155315i.getItem(this.f155314h.getSelectedItemPosition());
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public com.tencent.mm.ui.base.MultiTouchImageView W() {
        int selectedItemPosition = this.f155314h.getSelectedItemPosition();
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f155314h;
        android.view.View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f155314h.getFirstVisiblePosition()));
            return null;
        }
        if (childAt instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            return (com.tencent.mm.ui.base.MultiTouchImageView) childAt;
        }
        android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.h9o);
        if (findViewById instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            return (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
        }
        return null;
    }

    public final java.lang.String W6() {
        int selectedItemPosition = this.f155314h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return bt3.g2.t(this.f155315i.getItem(selectedItemPosition).n(), this.f155318o, this.f155317n, 1);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShowImageUI", "error position");
        return null;
    }

    public final boolean X6() {
        com.tencent.mm.plugin.fav.ui.gallery.r item = this.f155315i.getItem(this.f155314h.getSelectedItemPosition());
        return item != null && item.k() == 2;
    }

    @Override // com.tencent.mm.plugin.fav.ui.l1
    public java.lang.String Y5() {
        return this.f155315i.getItem(this.f155314h.getSelectedItemPosition()).i();
    }

    public final void Y6(boolean z17) {
        db5.o4 b2Var;
        db5.t4 t4Var;
        com.tencent.mm.plugin.record.ui.g2 g2Var;
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (X6()) {
            arrayList.add(0);
            arrayList2.add(getString(com.tencent.mm.R.string.i29));
            arrayList.add(1);
            arrayList2.add(getString(com.tencent.mm.R.string.hjg));
            arrayList.add(2);
            arrayList2.add(getString(com.tencent.mm.R.string.i89));
            java.lang.String W6 = W6();
            boolean z18 = this.f155324u;
            if ((z18 || this.f155323t) && !com.tencent.mm.sdk.platformtools.t8.K0(W6)) {
                arrayList.add(4);
                arrayList2.add(getString(com.tencent.mm.R.string.b2e));
            }
            arrayList.add(5);
            arrayList2.add(getString(com.tencent.mm.R.string.b2d));
            g2Var = (com.tencent.mm.plugin.record.ui.g2) ((java.util.HashMap) this.f155322s).get(W6);
            if (g2Var == null || (recogQBarOfImageFileResultEvent = g2Var.f155395a) == null) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
                aqVar.f6174a = currentTimeMillis;
                aqVar.f6175b = W6;
                recogQBarOfImageFileEvent.e();
            } else if (!com.tencent.mm.sdk.platformtools.t8.L0(recogQBarOfImageFileResultEvent.f54661g.f6369b)) {
                arrayList.add(3);
                arrayList2.add("");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(W6)) {
                gm0.j1.i();
                if (gm0.j1.n().f273288b.n() != 0 && z17 && !z18) {
                    this.f155325v.d(W6);
                }
            }
            b2Var = new com.tencent.mm.plugin.record.ui.a2(this, arrayList, g2Var, arrayList2);
            t4Var = this.D;
        } else {
            if (com.tencent.mm.vfs.w6.j(V6().j())) {
                if (V6().b()) {
                    arrayList.add(0);
                    arrayList2.add(getString(com.tencent.mm.R.string.ccw));
                }
                arrayList.add(2);
                arrayList2.add(getString(com.tencent.mm.R.string.i8d));
            }
            b2Var = new com.tencent.mm.plugin.record.ui.b2(this, arrayList, arrayList2);
            t4Var = this.E;
            g2Var = null;
        }
        if (isFinishing()) {
            return;
        }
        if (this.f155321r == null) {
            this.f155321r = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f155321r;
        k0Var.f211872n = b2Var;
        k0Var.f211881s = t4Var;
        k0Var.p(new com.tencent.mm.plugin.record.ui.c2(this, g2Var));
        if (getContext().isFinishing()) {
            return;
        }
        this.f155321r.v();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        com.tencent.mm.ui.bk.l0(com.tencent.mm.ui.bk.b(getWindow(), null), getBodyView());
        ((android.view.ViewGroup) getBodyView().getParent()).removeView(getBodyView());
        ((android.view.ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_VIEW_PIC_CNT", this.A);
        setResult(0, intent);
        super.finish();
    }

    @Override // o72.e5
    public java.lang.String getAesKey() {
        int selectedItemPosition = this.f155314h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return this.f155315i.getItem(selectedItemPosition).e();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489388em4;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        g04.l lVar = (g04.l) obj2;
        java.lang.String W6 = W6();
        int b17 = com.tencent.mm.plugin.scanner.k1.b(lVar.f267469a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "local translate, img %s, result %s, ratio %d", W6, lVar.f267469a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(W6) && com.tencent.mm.plugin.scanner.k1.f(b17)) {
            this.f155323t = true;
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58317e = 2L;
            galleryTranslateReportStruct.f58318f = 5L;
            int selectedItemPosition = this.f155314h.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                com.tencent.mm.plugin.fav.ui.gallery.r item = this.f155315i.getItem(selectedItemPosition);
                galleryTranslateReportStruct.q(item.f());
                galleryTranslateReportStruct.p(item.e());
            }
            galleryTranslateReportStruct.k();
            Y6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1001 == i17 && -1 == i18) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShowImageUI", "want to send record msg, but toUser is null");
                return;
            } else {
                gm0.j1.e().j(new com.tencent.mm.plugin.record.ui.r1(this, P1, stringExtra2, new com.tencent.mm.plugin.record.ui.q1(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null))));
                return;
            }
        }
        if (1 != i17 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra3 = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra4 = intent == null ? null : intent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.record.ui.s1 s1Var = new com.tencent.mm.plugin.record.ui.s1(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null));
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            return;
        }
        java.util.ArrayList P12 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra3.split(","));
        com.tencent.mm.plugin.fav.ui.gallery.r V6 = V6();
        java.lang.String j17 = V6.j();
        java.lang.String w17 = V6.w();
        java.util.Iterator it = P12.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.fav.ui.x5.j(getContext(), str, j17, w17, V6.m(), "", s1Var, V6.t());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra4, c01.e2.C(str), 0);
            }
        }
        com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, this, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[EDGE_INSN: B:59:0x0157->B:60:0x0157 BREAK  A[LOOP:0: B:20:0x00d3->B:38:0x00d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.RecordMsgImageUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.H);
        this.f155320q.g();
        java.util.Iterator it = ((java.util.ArrayList) this.f155311e).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) it.next();
            if (favVideoView != null) {
                favVideoView.e();
            }
        }
        com.tencent.mm.plugin.fav.ui.nc ncVar = this.f155325v;
        if (ncVar != null) {
            ncVar.c();
        }
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f155313g;
        if (m1Var != null) {
            m1Var.f101254b = null;
            m1Var.f101253a = null;
            m1Var.f101257e = null;
        }
        this.G.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(gk5.c1.class);
    }

    @Override // o72.e5
    public java.lang.String x2() {
        return W6();
    }

    @Override // o72.e5
    public java.lang.String y3() {
        int selectedItemPosition = this.f155314h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return this.f155315i.getItem(selectedItemPosition).f();
        }
        return null;
    }
}
