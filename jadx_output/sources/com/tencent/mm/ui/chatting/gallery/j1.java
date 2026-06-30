package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public abstract class j1 extends com.tencent.mm.ui.chatting.gallery.e implements fk4.t {

    /* renamed from: i, reason: collision with root package name */
    public static ot0.m1 f201041i;

    /* renamed from: e, reason: collision with root package name */
    public yd5.p f201042e;

    /* renamed from: f, reason: collision with root package name */
    public yd5.p f201043f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f201044g;

    /* renamed from: h, reason: collision with root package name */
    public int f201045h;

    public j1(com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        super(k1Var);
        this.f201042e = null;
        this.f201043f = null;
        this.f201044g = new java.util.HashMap();
        this.f201045h = 0;
        f201041i = null;
    }

    public static com.tencent.mm.storage.f9 q(java.lang.String str, android.app.Activity activity) {
        ot0.m1 m1Var;
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(486539313);
        f9Var.u1(str);
        f9Var.f193931k2 = true;
        if (f201041i == null) {
            byte[] byteArrayExtra = activity.getIntent().getByteArrayExtra("img_gallery_mp_share_video_info");
            if (com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo data is null");
                activity.finish();
                m1Var = null;
                f9Var.f193930j2 = m1Var;
                f9Var.i1(activity.getIntent().getStringExtra("img_gallery_path"));
                return f9Var;
            }
            try {
                ot0.m1 m1Var2 = new ot0.m1();
                m1Var2.parseFrom(byteArrayExtra);
                f201041i = m1Var2;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "initMPShareVideoInfo ex %s", e17.getMessage());
                activity.finish();
            }
        }
        m1Var = f201041i;
        f9Var.f193930j2 = m1Var;
        f9Var.i1(activity.getIntent().getStringExtra("img_gallery_path"));
        return f9Var;
    }

    public static ot0.m1 r(com.tencent.mm.storage.f9 f9Var) {
        ot0.m1 m1Var;
        if (f9Var.D2()) {
            return new ot0.m1().b(f9Var.f193930j2);
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video", "getVideoInfo content is null");
            return null;
        }
        ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
        if (fVar == null || (m1Var = fVar.f348465l) == null) {
            return null;
        }
        return m1Var;
    }

    public static t21.v2 s(com.tencent.mm.storage.f9 f9Var) {
        if (!com.tencent.mm.ui.chatting.gallery.k1.N(f9Var)) {
            return null;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        return t21.d3.h(z07);
    }

    public static t21.v2 t(com.tencent.mm.storage.f9 f9Var) {
        t21.v2 s17 = s(f9Var);
        if (s17 != null) {
            return s17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "insert video info:" + f9Var.toString());
        t21.v2 v2Var = new t21.v2();
        v2Var.f415019q = f9Var.Q0();
        v2Var.f415000a = f9Var.z0();
        v2Var.f415012j = f9Var.getCreateTime() <= 0 ? java.lang.System.currentTimeMillis() : f9Var.getCreateTime();
        v2Var.f415004c = f9Var.I0();
        v2Var.f415025w = f9Var.j();
        v2Var.f415016n = f9Var.getMsgId();
        v2Var.n(f9Var.Q0());
        ot0.m1 r17 = r(f9Var);
        if (r17 != null) {
            if (android.text.TextUtils.isEmpty(f9Var.z0())) {
                java.lang.String Q0 = f9Var.Q0();
                kk.l lVar = t21.w2.f415056c;
                java.lang.String a17 = t21.c3.a(Q0);
                if (!pt0.f0.f358209b1.i()) {
                    f9Var.i1(a17);
                }
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
            }
            v2Var.f415000a = f9Var.z0();
            java.lang.String a18 = com.tencent.mm.ui.chatting.gallery.eb.f200902a.a(r17.c(f9Var.z0()));
            java.lang.String str = r17.f373340e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            v2Var.p(a18 == null ? str : a18, r17.f373344i, r17.f373342g, r17.f373339d, "", "", "");
            v2Var.f415011i = 111;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().x(v2Var, true);
        return v2Var;
    }

    public abstract void A(com.tencent.mm.storage.f9 f9Var, int i17);

    public abstract void B(com.tencent.mm.storage.f9 f9Var, int i17, boolean z17);

    @Override // fk4.t
    public void a(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            return;
        }
        if (com.tencent.mm.ui.chatting.gallery.l.f201163a.a(l17.longValue()) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var == null || k1Var.f201092g == null || this.f201045h != 0) {
            return;
        }
        if (l17.longValue() == k1Var.w().getMsgId() && j18 > 0) {
            int round = java.lang.Math.round((((float) j17) * 100.0f) / ((float) j18));
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200886d.f201092g;
            imageGalleryUI.getClass();
            t23.p0.n().c(new com.tencent.mm.ui.chatting.gallery.b8(imageGalleryUI, round));
        }
    }

    @Override // fk4.t
    public void b(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onDataAvailable, it's not origin video task, return");
    }

    @Override // fk4.t
    public void c(java.lang.Long l17, int i17, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.ta v17;
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, it's not origin video task, return");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
        boolean b17 = lVar.b(l17.longValue());
        fk4.k d17 = lVar.d(l17.longValue());
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        d17.f263624l = null;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var == null || k1Var.f201092g == null) {
            return;
        }
        com.tencent.mm.storage.f9 w17 = k1Var.w();
        if (l17.longValue() != w17.getMsgId() || (v17 = this.f200886d.v()) == null || v17.f201438p == null) {
            return;
        }
        yd5.p pVar = this.f201043f;
        if (pVar != null) {
            pVar.f461135g.f61602l = a06.d.c(((float) (java.lang.System.currentTimeMillis() - pVar.f461134f)) / 1000.0f);
            this.f201043f.a();
            this.f201043f = null;
        }
        v17.f201423a.post(new com.tencent.mm.ui.chatting.gallery.h1(this, i17, b17, v17, w17));
    }

    @Override // fk4.t
    public void d(java.lang.Long l17, boolean z17) {
        if (l17 == null || z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onStopDownload, it's not origin video task, return");
    }

    @Override // fk4.t
    public void e(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onMoovReady, it's not origin video task, return");
    }

    @Override // fk4.t
    public void g(java.lang.Long l17, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "onStartDownload, it's not origin video task, return");
    }

    public abstract void n(com.tencent.mm.storage.f9 f9Var);

    public abstract void p();

    public void u(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        if (taVar != null) {
            taVar.d();
            taVar.d();
            taVar.f201441s.setVisibility(8);
        }
    }

    public abstract void v(int i17, int i18);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void w(int i17);

    public void x(com.tencent.mm.ui.chatting.gallery.ta taVar, java.lang.String str) {
        if (taVar != null) {
            taVar.d();
            if (this.f200886d == null) {
                return;
            }
            taVar.d();
            taVar.f201441s.setVisibility(0);
            taVar.d();
            android.widget.TextView textView = taVar.f201442t;
            java.lang.String string = this.f200886d.f201092g.getString(com.tencent.mm.R.string.k7w);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = string;
            }
            textView.setText(str);
            taVar.d();
            taVar.f201436n.setVisibility(0);
            taVar.d();
            taVar.f201437o.setVisibility(8);
            y(taVar);
        }
    }

    public abstract void y(com.tencent.mm.ui.chatting.gallery.ta taVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void z();
}
