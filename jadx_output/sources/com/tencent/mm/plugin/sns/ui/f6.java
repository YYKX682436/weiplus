package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f6 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f168292g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f168293h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f168294i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f168295j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f168296k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f168297l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f168298m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f168299n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f168300o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f168301p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f168302q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f168303r;

    /* renamed from: s, reason: collision with root package name */
    public m21.w f168304s;

    /* renamed from: t, reason: collision with root package name */
    public int f168305t;

    /* renamed from: u, reason: collision with root package name */
    public int f168306u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f168307v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168308w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f168309x;

    public f6(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f168292g = null;
        this.f168294i = null;
        this.f168295j = null;
        this.f168296k = null;
        this.f168299n = "";
        this.f168300o = "";
        this.f168301p = false;
        this.f168302q = false;
        this.f168303r = false;
        this.f168304s = null;
        this.f168306u = 1;
        this.f168307v = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.MusicWidget$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                int i17 = musicPlayerEvent.f54512g.f7036b;
                com.tencent.mm.plugin.sns.ui.f6 f6Var = com.tencent.mm.plugin.sns.ui.f6.this;
                if (i17 == 0 || i17 == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    android.widget.ImageView imageView = f6Var.f168297l;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    imageView.setImageResource(com.tencent.mm.R.drawable.as6);
                } else if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    android.widget.ImageView imageView2 = f6Var.f168297l;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    imageView2.setImageResource(com.tencent.mm.R.drawable.as8);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                return false;
            }
        };
        this.f168308w = iListener;
        iListener.alive();
    }

    public static /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage o(com.tencent.mm.plugin.sns.ui.f6 f6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = f6Var.f168292g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return wXMediaMessage;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d2x, (android.view.ViewGroup) null);
        this.f168293h = inflate;
        this.f168294i = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h9t);
        this.f168295j = (android.widget.TextView) this.f168293h.findViewById(com.tencent.mm.R.id.odj);
        this.f168296k = (android.widget.TextView) this.f168293h.findViewById(com.tencent.mm.R.id.m4o);
        android.view.View findViewById = this.f168293h.findViewById(com.tencent.mm.R.id.nh7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/MusicWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/MusicWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f168295j.setText(this.f168292g.title);
        byte[] bArr = this.f168292g.thumbData;
        if (bArr != null) {
            this.f168309x = com.tencent.mm.sdk.platformtools.x.G(bArr);
        }
        this.f168294i.setImageBitmap(this.f168309x);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f168292g.description)) {
            this.f168296k.setVisibility(8);
        } else {
            this.f168296k.setText(this.f168292g.description);
            this.f168296k.setVisibility(0);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f168293h.findViewById(com.tencent.mm.R.id.nh7);
        this.f168297l = imageView;
        imageView.setVisibility(0);
        if (q() && this.f168303r) {
            this.f168297l.setImageResource(com.tencent.mm.R.drawable.as6);
        } else {
            this.f168297l.setImageResource(com.tencent.mm.R.drawable.as8);
        }
        this.f168297l.setOnClickListener(new com.tencent.mm.plugin.sns.ui.e6(this));
        ca4.z0.A0(this.f168294i, mMActivity);
        android.view.View view = this.f168293h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.model.y7 s17 = com.tencent.mm.plugin.sns.model.l4.Nj().s(this.f168292g, str, this.f168299n, this.f168300o);
        if (s17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", this.f168299n, this.f168300o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            return false;
        }
        pInt.value = s17.l();
        if (i19 > q94.a.f360928a) {
            s17.u(1, 4);
        }
        s17.N(this.f168305t);
        if (this.f168301p) {
            s17.N(5);
        }
        s17.x(linkedList);
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
        s17.W(linkedList2);
        if (iVar != null) {
            s17.U(iVar.f316692d, iVar.f316693e);
        }
        s17.A(ed4Var);
        if (z17) {
            s17.z(1);
        } else {
            s17.z(0);
        }
        s17.y(list2);
        s17.G(i17);
        s17.O(null, null, null, i27, i28);
        s17.E(this.f168306u, this.f168307v);
        if (this.f168302q && (wXMediaMessage = this.f168292g) != null) {
            s17.R(wXMediaMessage.mediaTagName);
            java.lang.String str4 = this.f168299n;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f168292g;
            s17.T(str4, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
        }
        m(s17);
        int i29 = s17.i();
        m21.w wVar = this.f168304s;
        if (wVar != null) {
            wVar.a(i29);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f168304s);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        this.f169957c.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        super.e();
        android.graphics.Bitmap bitmap = this.f168309x;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f168309x.recycle();
        }
        this.f168308w.dead();
        if (q() && this.f168303r) {
            p();
        }
        boolean q17 = q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return q17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f168292g = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(mMActivity.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        this.f168298m = mMActivity.getIntent().getStringExtra("Ksnsupload_musicid");
        this.f168304s = m21.w.f(mMActivity.getIntent());
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f168299n = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f168300o = stringExtra2;
        this.f168301p = mMActivity.getIntent().getBooleanExtra("KThrid_app", false);
        this.f168302q = mMActivity.getIntent().getBooleanExtra("KSnsAction", false);
        this.f168305t = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f168306u = 1;
        } else {
            this.f168306u = 0;
        }
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f168307v = stringExtra3 != null ? stringExtra3 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return false;
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStopPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        new com.tencent.mm.sdk.platformtools.n3(this.f169957c.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.c6(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStopPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    public boolean q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlay", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        boolean c17 = b21.m.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlay", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return c17;
    }
}
