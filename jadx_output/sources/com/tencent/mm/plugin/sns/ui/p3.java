package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p3 extends android.widget.LinearLayout implements com.tencent.mm.plugin.sns.ui.s4, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.b4 f170138d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f170139e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170141g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.a4 f170142h;

    /* renamed from: i, reason: collision with root package name */
    public int f170143i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f170144m;

    /* renamed from: n, reason: collision with root package name */
    public int f170145n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f170146o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f170147p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f170148q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f170149r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f170150s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f170151t;

    /* renamed from: u, reason: collision with root package name */
    public int f170152u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f170153v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f170154w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f170155x;

    public p3(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f170138d = new com.tencent.mm.plugin.sns.ui.b4(this);
        this.f170140f = null;
        this.f170141g = false;
        this.f170143i = 0;
        this.f170144m = "";
        this.f170146o = false;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f170147p = "";
        this.f170148q = true;
        this.f170149r = false;
        this.f170150s = "";
        this.f170151t = false;
        this.f170152u = 0;
        this.f170153v = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f170154w = new com.tencent.mm.plugin.sns.ui.r3(this);
        this.f170155x = new com.tencent.mm.plugin.sns.ui.s3(this);
        this.f170143i = i17;
        this.f170146o = z17;
        e(context);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo c(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = p3Var.f170140f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return snsInfo;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.a4 d(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mm.plugin.sns.ui.a4 a4Var = p3Var.f170142h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return a4Var;
    }

    private int getLayoutInflateId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutInflateId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_GALLERY_FOOTER_V3_INT_SYNC, 0);
        if (r17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutInflateId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return com.tencent.mm.R.layout.cru;
        }
        if (r17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutInflateId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return com.tencent.mm.R.layout.ddj;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_gallery_footer_v3, true)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutInflateId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return com.tencent.mm.R.layout.ddj;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutInflateId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return com.tencent.mm.R.layout.cru;
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        setFooter(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public void b(final dd4.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170138d.f167831n.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.p3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.sns.ui.p3 p3Var = com.tencent.mm.plugin.sns.ui.p3.this;
                p3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getFooterH$0", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(p3Var.f170139e);
                int[] iArr = new int[2];
                com.tencent.mm.plugin.sns.ui.b4 b4Var = p3Var.f170138d;
                if (b4Var.f167836s.getVisibility() == 0) {
                    b4Var.f167830m.getLocationOnScreen(iArr);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "dec tv location: x: %d, y: %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
                } else {
                    b4Var.f167819b.getLocationOnScreen(iArr);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "stateLL location: x: %d, y: %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
                }
                ((dd4.q) x0Var).a((a17.f197136b - iArr[1]) - com.tencent.mm.ui.bl.c(p3Var.getContext()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getFooterH$0", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void e(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170139e = context;
        if (this.f170143i == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        this.f170147p = c01.z1.r();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(getLayoutInflateId(), (android.view.ViewGroup) this, true);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.nh_);
        com.tencent.mm.plugin.sns.ui.b4 b4Var = this.f170138d;
        b4Var.f167819b = linearLayout;
        b4Var.f167831n = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.p1m);
        b4Var.f167822e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i1v);
        b4Var.f167823f = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.haj);
        b4Var.f167828k = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485214gx5);
        b4Var.f167822e.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.t3(this, context));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.n7z)).setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        b4Var.f167826i = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.c7h);
        b4Var.f167825h = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.hai);
        b4Var.f167825h.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        b4Var.f167829l = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485210gx1);
        b4Var.f167826i.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.u3(this, context));
        b4Var.f167827j = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.chc);
        b4Var.f167820c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mnb);
        b4Var.f167821d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.mnd);
        b4Var.f167830m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7v);
        b4Var.f167836s = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.hcs);
        b4Var.f167832o = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_r);
        b4Var.f167833p = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f485694io3);
        b4Var.f167833p.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        b4Var.f167834q = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dhf);
        b4Var.f167835r = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cs6);
        b4Var.f167837t = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.csd);
        int i17 = this.f170143i;
        if (i17 == 2) {
            b4Var.f167831n.setVisibility(8);
            b4Var.f167835r.setVisibility(8);
            b4Var.f167821d.setVisibility(0);
        } else if (i17 == 3) {
            b4Var.f167831n.setVisibility(8);
            b4Var.f167821d.setVisibility(8);
            b4Var.f167835r.setVisibility(0);
        } else {
            b4Var.f167831n.setVisibility(0);
            b4Var.f167821d.setVisibility(8);
            b4Var.f167835r.setVisibility(8);
        }
        b4Var.f167822e.setOnClickListener(new com.tencent.mm.plugin.sns.ui.v3(this));
        b4Var.f167826i.setOnClickListener(new com.tencent.mm.plugin.sns.ui.w3(this, context));
        b4Var.f167827j.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.x3(this, context));
        b4Var.f167827j.setOnClickListener(this.f170155x);
        b4Var.f167820c.setOnClickListener(new com.tencent.mm.plugin.sns.ui.y3(this));
        b4Var.f167837t.setOnClickListener(new com.tencent.mm.plugin.sns.ui.z3(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p3.f():void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public android.view.View.OnClickListener getJumpToDetailCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpToDetailCallback", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        android.view.View.OnClickListener onClickListener = this.f170155x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpToDetailCallback", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return onClickListener;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        if (m1Var.getType() == 213 || m1Var.getType() == 682) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "onSceneEnd, errType:%d, errCode:%d, scene:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.getType()));
            gm0.j1.i();
            gm0.j1.n().f273288b.q(213, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX, this);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f170153v;
            java.lang.Runnable runnable = this.f170154w;
            n3Var.removeCallbacks(runnable);
            n3Var.post(runnable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setAlbumScene(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlbumScene", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170152u = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlbumScene", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setAlbumSessionId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlbumSessionId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlbumSessionId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        } else {
            this.f170150s = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlbumSessionId", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        }
    }

    public void setCallBack(com.tencent.mm.plugin.sns.ui.a4 a4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170142h = a4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setFooter(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "setFooter:" + str);
        this.f170144m = str;
        f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setIsFromStarList(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFromStarList", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170149r = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFromStarList", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setSnsSource(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170145n = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170143i = i17;
        e(this.f170139e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setUseNewInteraction(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f170151t = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i18 = this.f170143i;
        if (i18 == 2 || i18 == 3) {
            super.setVisibility(i17);
            this.f170148q = i17 != 8;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170140f;
        if (snsInfo != null && !ca4.f1.f39897a.k(snsInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "setVisibility: non bidir friend");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFooterNew", "setVisibility: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.b4 b4Var = this.f170138d;
        if (i17 == 8) {
            b4Var.f167819b.setVisibility(8);
            this.f170148q = false;
        } else if (i17 == 0) {
            b4Var.f167819b.setVisibility(0);
            this.f170148q = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }
}
