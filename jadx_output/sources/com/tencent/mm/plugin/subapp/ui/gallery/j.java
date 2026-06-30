package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public g04.h f172383a;

    /* renamed from: b, reason: collision with root package name */
    public g04.j f172384b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f172385c;

    /* renamed from: d, reason: collision with root package name */
    public int f172386d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.gallery.i f172387e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f172388f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.gallery.h f172389g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f172390h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f172391i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f172392j;

    /* renamed from: k, reason: collision with root package name */
    public android.animation.ValueAnimator f172393k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f172394l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f172395m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f172396n;

    /* renamed from: o, reason: collision with root package name */
    public sy3.c f172397o;

    /* renamed from: p, reason: collision with root package name */
    public long f172398p;

    /* renamed from: q, reason: collision with root package name */
    public final sy3.e f172399q;

    public j(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, com.tencent.mm.plugin.subapp.ui.gallery.i iVar, g04.h hVar, com.tencent.mm.plugin.subapp.ui.gallery.h hVar2, boolean z17) {
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$1 gestureGalleryTransAndOcrLogic$1 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$1(this, com.tencent.mm.app.a0.f53288d);
        this.f172395m = gestureGalleryTransAndOcrLogic$1;
        this.f172396n = new com.tencent.mm.plugin.subapp.ui.gallery.c(this);
        this.f172397o = null;
        this.f172398p = 0L;
        this.f172399q = new com.tencent.mm.plugin.subapp.ui.gallery.g(this);
        this.f172383a = hVar;
        this.f172388f = gestureGalleryUI;
        this.f172387e = iVar;
        this.f172394l = z17;
        this.f172389g = hVar2;
        this.f172391i = (android.widget.ImageView) gestureGalleryUI.findViewById(com.tencent.mm.R.id.ma9);
        this.f172392j = (android.widget.ImageView) this.f172388f.findViewById(com.tencent.mm.R.id.ma7);
        this.f172390h = (android.widget.ImageView) this.f172388f.findViewById(com.tencent.mm.R.id.ma_);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f172392j.getLayoutParams();
        layoutParams.bottomMargin += com.tencent.mm.ui.bk.j(this.f172388f);
        this.f172392j.setLayoutParams(layoutParams);
        this.f172392j.setOnClickListener(new com.tencent.mm.plugin.subapp.ui.gallery.d(this));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f172393k = ofFloat;
        ofFloat.setDuration(5000L);
        this.f172393k.addListener(new com.tencent.mm.plugin.subapp.ui.gallery.e(this));
        this.f172393k.addUpdateListener(new com.tencent.mm.plugin.subapp.ui.gallery.f(this, this.f172388f.getWindowManager().getDefaultDisplay().getHeight()));
        gestureGalleryTransAndOcrLogic$1.alive();
    }

    public boolean a() {
        sy3.c cVar = this.f172397o;
        if (cVar == null || ((kz3.l) cVar).c()) {
            return false;
        }
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = this.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).x7();
        }
        sy3.c cVar2 = this.f172397o;
        if (cVar2 == null) {
            return false;
        }
        if (!((kz3.l) cVar2).b(this.f172398p)) {
            return false;
        }
        this.f172398p = 0L;
        return true;
    }

    public void b(android.view.View view, android.view.View view2, java.lang.String str) {
        if (this.f172397o == null) {
            sy3.c Ai = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ai(this.f172388f, 1);
            this.f172397o = Ai;
            ((kz3.l) Ai).f313887e = view;
        }
        ry3.p pVar = new ry3.p();
        pVar.f401533g = 12;
        pVar.f401527a = java.lang.System.currentTimeMillis();
        pVar.f401528b = 3;
        pVar.f401538l = false;
        pVar.f401539m = true;
        pVar.f401540n = 204;
        pVar.f401531e = str;
        this.f172390h.setVisibility(0);
        this.f172391i.setVisibility(0);
        this.f172392j.setVisibility(0);
        this.f172393k.setRepeatMode(1);
        this.f172393k.setRepeatCount(-1);
        this.f172393k.start();
        ((kz3.l) this.f172397o).a(view2);
        ry3.m mVar = new ry3.m();
        mVar.f401525b = true;
        this.f172398p = ((kz3.l) this.f172397o).i(pVar, mVar, this.f172399q);
    }

    public void c() {
        com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f58316d = this.f172386d == 2 ? 1L : 0L;
        galleryTranslateReportStruct.f58317e = 2L;
        galleryTranslateReportStruct.f58318f = this.f172394l ? 6L : 5L;
        galleryTranslateReportStruct.k();
    }

    public void d() {
        java.lang.String str = ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) this.f172387e).f172194g;
        int i17 = this.f172386d;
        if ((i17 == 0 || i17 == 2) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58316d = this.f172386d == 2 ? 1L : 0L;
            galleryTranslateReportStruct.f58317e = 3L;
            galleryTranslateReportStruct.f58318f = this.f172394l ? 6L : 5L;
            galleryTranslateReportStruct.k();
            this.f172385c = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(str);
            if (bj6 != null && com.tencent.mm.vfs.w6.j(bj6.field_resultFile)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", str);
                intent.putExtra("translate_source", this.f172394l ? 6 : 5);
                intent.setClassName(this.f172388f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                com.tencent.mm.ui.MMActivity mMActivity = this.f172388f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mMActivity, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f172388f.finish();
                this.f172388f.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
                return;
            }
            if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
                this.f172386d = 1;
                this.f172390h.setVisibility(0);
                this.f172391i.setVisibility(0);
                this.f172392j.setVisibility(0);
                this.f172393k.setRepeatMode(1);
                this.f172393k.setRepeatCount(-1);
                this.f172393k.start();
            } else {
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f172388f;
                db5.e1.s(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f490500wu), "");
                e();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryTransLogic", "try to translate img %s, sessionId %d", str, java.lang.Integer.valueOf(this.f172385c));
            com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
            am.bt btVar = scanTranslationEvent.f54738g;
            btVar.f6282a = this.f172394l ? 6 : 5;
            btVar.f6284c = str;
            btVar.f6283b = this.f172385c;
            scanTranslationEvent.e();
        }
    }

    public void e() {
        this.f172386d = 0;
        this.f172390h.setVisibility(8);
        this.f172391i.setVisibility(8);
        this.f172392j.setVisibility(8);
        g();
    }

    public void f(java.lang.String str) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f172388f;
        if (mMActivity == null || mMActivity.isFinishing()) {
            return;
        }
        if (this.f172384b == null) {
            kd0.h2 h2Var = (kd0.h2) i95.n0.c(kd0.h2.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f172388f;
            ((jd0.u1) h2Var).getClass();
            this.f172384b = new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine(mMActivity2);
        }
        ((com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine) this.f172384b).b(str, this.f172383a);
    }

    public void g() {
        this.f172393k.setRepeatMode(1);
        this.f172393k.setRepeatCount(0);
        this.f172393k.end();
    }
}
