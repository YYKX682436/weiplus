package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j9 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f169488g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.model.a f169489h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f169490i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f169491j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ProgressBar f169492k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f169493l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f169494m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f169495n;

    /* renamed from: o, reason: collision with root package name */
    public int f169496o;

    /* renamed from: p, reason: collision with root package name */
    public m34.n f169497p;

    /* renamed from: q, reason: collision with root package name */
    public m21.w f169498q;

    /* renamed from: r, reason: collision with root package name */
    public int f169499r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f169500s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f169501t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.y7 f169502u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f169503v;

    /* renamed from: w, reason: collision with root package name */
    public android.app.ProgressDialog f169504w;

    public j9(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f169488g = null;
        this.f169490i = "";
        this.f169491j = "";
        this.f169493l = "";
        this.f169494m = false;
        this.f169495n = null;
        this.f169497p = null;
        this.f169498q = null;
        this.f169499r = 1;
        this.f169500s = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f169501t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SightSendResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SightWidget$1
            {
                this.__eventId = 2027183784;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
                com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent2 = sightSendResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
                com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "on sight send result callback, type %d", java.lang.Integer.valueOf(sightSendResultEvent2.f54784g.f7936a));
                am.su suVar = sightSendResultEvent2.f54784g;
                if (suVar.f7936a == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "come event done");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    com.tencent.mm.plugin.sns.ui.j9 j9Var = com.tencent.mm.plugin.sns.ui.j9.this;
                    j9Var.f169491j = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    j9Var.f169493l = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    android.app.ProgressDialog progressDialog = j9Var.f169504w;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    if (progressDialog != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                        android.app.ProgressDialog progressDialog2 = j9Var.f169504w;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                        progressDialog2.dismiss();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    com.tencent.mm.plugin.sight.decode.model.a aVar = j9Var.f169489h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    aVar.d(com.tencent.mm.plugin.sns.ui.j9.o(j9Var), false, 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    android.widget.ProgressBar progressBar = j9Var.f169492k;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    progressBar.setVisibility(8);
                    if (suVar.f7937b && j9Var.f169502u != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightWidget");
                        j9Var.q();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    }
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(suVar.f7937b);
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(null));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    java.lang.String str = j9Var.f169493l;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "mux finish %B videoPath %s %d md5 %s", valueOf, null, valueOf2, str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
                return false;
            }
        };
        this.f169502u = null;
        this.f169503v = "";
        this.f169504w = null;
    }

    public static /* synthetic */ java.lang.String o(com.tencent.mm.plugin.sns.ui.j9 j9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightWidget");
        java.lang.String str = j9Var.f169491j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return str;
    }

    public static /* synthetic */ m34.n p(com.tencent.mm.plugin.sns.ui.j9 j9Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightWidget");
        m34.n nVar = j9Var.f169497p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return nVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f489593d32, null);
        this.f169488g = inflate;
        com.tencent.mm.plugin.sight.decode.model.a aVar = (com.tencent.mm.plugin.sight.decode.model.a) inflate.findViewById(com.tencent.mm.R.id.h88);
        this.f169489h = aVar;
        aVar.setDrawableWidth(i65.a.b(mMActivity, 90));
        this.f169492k = (android.widget.ProgressBar) this.f169488g.findViewById(com.tencent.mm.R.id.iln);
        mMActivity.getResources().getDisplayMetrics();
        this.f169488g.findViewById(com.tencent.mm.R.id.bkg).setOnClickListener(new com.tencent.mm.plugin.sns.ui.h9(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "videoPath " + this.f169491j + " thumbPath " + this.f169490i + " " + com.tencent.mm.vfs.w6.k(this.f169491j) + " " + com.tencent.mm.vfs.w6.k(this.f169490i));
        if (com.tencent.mm.vfs.w6.j(this.f169491j)) {
            this.f169489h.d(this.f169491j, false, 0);
            this.f169492k.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", this.f169491j, this.f169493l);
        } else {
            com.tencent.mm.memory.r n17 = ca4.z0.n(this.f169490i);
            if (n17 != null) {
                n17.f68974h = false;
                android.graphics.Bitmap bitmap = n17.f68970d;
                this.f169495n = bitmap;
                if (ca4.z0.f(bitmap)) {
                    this.f169489h.setThumbBmp(this.f169495n);
                }
            }
            this.f169492k.setVisibility(0);
        }
        android.view.View view = this.f169488g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        if (this.f169502u != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return false;
        }
        this.f169503v = str;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list != null) {
            new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str3)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f377690d = str3;
                    linkedList2.add(jb6Var);
                }
            }
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(15, mMActivity);
        this.f169502u = y7Var;
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            this.f169502u.u(1, 3);
        }
        com.tencent.mm.plugin.sns.model.y7 y7Var2 = this.f169502u;
        y7Var2.t(str);
        y7Var2.x(new java.util.LinkedList());
        y7Var2.A(ed4Var);
        y7Var2.W(linkedList2);
        y7Var2.G(i17);
        y7Var2.S(i18);
        y7Var2.y(list2);
        if (z17) {
            this.f169502u.z(1);
        } else {
            this.f169502u.z(0);
        }
        com.tencent.mm.plugin.sns.model.y7 y7Var3 = this.f169502u;
        y7Var3.y(list2);
        y7Var3.G(i17);
        this.f169502u.N(this.f169496o);
        this.f169502u.E(this.f169499r, this.f169500s);
        this.f169502u.O(null, null, null, i27, i28);
        m(this.f169502u);
        if (com.tencent.mm.vfs.w6.j(this.f169491j)) {
            q();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "commit file is not exist " + this.f169491j);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f169957c;
        this.f169504w = db5.e1.Q(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.jeu), false, true, new com.tencent.mm.plugin.sns.ui.i9(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.SightWidget");
        super.e();
        android.app.ProgressDialog progressDialog = this.f169504w;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f169501t.dead();
        if (ca4.z0.f(this.f169495n)) {
            this.f169495n.recycle();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.SightWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.SightWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f169498q = m21.w.f(mMActivity.getIntent());
        this.f169490i = mMActivity.getIntent().getStringExtra("KSightThumbPath");
        this.f169491j = mMActivity.getIntent().getStringExtra("KSightPath");
        this.f169493l = mMActivity.getIntent().getStringExtra("sight_md5");
        this.f169496o = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
        sightSendResultEvent.f54784g.f7936a = 2;
        sightSendResultEvent.e();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f169491j);
        am.tu tuVar = sightSendResultEvent.f54785h;
        if (K0) {
            tuVar.getClass();
            this.f169491j = "";
            com.tencent.mars.xlog.Log.e("MicroMsg.SightWidget", "videoPath is null %s", "");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f169493l)) {
            tuVar.getClass();
            str = "";
        } else {
            str = this.f169493l;
        }
        this.f169493l = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", this.f169490i, this.f169491j, str);
        this.f169501t.alive();
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f169499r = 1;
        } else {
            this.f169499r = 0;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f169500s = stringExtra != null ? stringExtra : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.SightWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return false;
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
        if (this.f169494m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return;
        }
        boolean f17 = this.f169502u.f(this.f169491j, this.f169490i, this.f169503v, this.f169493l);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        if (!f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "videopath " + com.tencent.mm.vfs.w6.k(this.f169491j) + " thumb: " + com.tencent.mm.vfs.w6.k(this.f169490i));
            db5.t7.makeText(mMActivity, com.tencent.mm.R.string.iil, 0).show();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return;
        }
        com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
        am.su suVar = sightSendResultEvent.f54784g;
        suVar.f7936a = 0;
        suVar.f7937b = true;
        sightSendResultEvent.e();
        this.f169494m = true;
        int i17 = this.f169502u.i();
        m21.w wVar = this.f169498q;
        if (wVar != null) {
            wVar.a(i17);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f169498q);
        }
        com.tencent.mm.plugin.sns.model.l4.qj().a();
        fe0.j4 j4Var = new fe0.j4();
        j4Var.f261410g = false;
        j4Var.f261404a = true;
        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ui(mMActivity, null, 4, j4Var);
        mMActivity.setResult(-1);
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
    }
}
