package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class f7 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f200488a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f200489b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.ChatFooterCustom f200490c;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f200492e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f200493f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f200494g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f200495h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f200498k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f200499l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f200500m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f200501n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f200504q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f200491d = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.e7 f200496i = com.tencent.mm.ui.chatting.e7.DEFAULT;

    /* renamed from: j, reason: collision with root package name */
    public int f200497j = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f200502o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f200503p = -1;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f200505r = new com.tencent.mm.ui.chatting.u6(this);

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f200506s = new com.tencent.mm.ui.chatting.v6(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.u6 f200507t = new com.tencent.mm.ui.chatting.d7(this);

    public f7(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f200489b = chatFooterCustom.getContext();
        this.f200490c = chatFooterCustom;
    }

    public static void a(com.tencent.mm.ui.chatting.f7 f7Var) {
        f7Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[handleNoUrl]");
        android.content.Context context = f7Var.f200489b;
        db5.e1.y(context, i65.a.r(context, com.tencent.mm.R.string.azm), "", i65.a.r(context, com.tencent.mm.R.string.azi), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r9.f200499l) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r9.f200499l) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r9.f200499l) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f200489b
            java.lang.String r1 = "com.tencent.androidqqmail"
            boolean r1 = com.tencent.mm.pluginsdk.model.app.j1.f(r0, r1)
            com.tencent.mm.ui.chatting.e7 r2 = com.tencent.mm.ui.chatting.e7.INSTALLED
            r3 = 3
            r4 = 1
            r5 = 4
            if (r1 == 0) goto L11
            r1 = r2
            goto L76
        L11:
            java.lang.String r1 = "QQMAIL"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r5)
            r9.f200488a = r0
            java.lang.String r1 = "qqmail_downloadid"
            r6 = -1
            long r0 = r0.getLong(r1, r6)
            r9.f200503p = r0
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            com.tencent.mm.ui.chatting.e7 r1 = com.tencent.mm.ui.chatting.e7.NO_URL
            com.tencent.mm.ui.chatting.e7 r6 = com.tencent.mm.ui.chatting.e7.NEED_DOWNLOAD
            if (r0 >= 0) goto L36
            java.lang.String r0 = r9.f200499l
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L36:
            java.lang.Class<vz.v1> r0 = vz.v1.class
            i95.m r0 = i95.n0.c(r0)
            vz.v1 r0 = (vz.v1) r0
            uz.v1 r0 = (uz.v1) r0
            r0.getClass()
            com.tencent.mm.plugin.downloader.model.r0 r0 = com.tencent.mm.plugin.downloader.model.r0.i()
            long r7 = r9.f200503p
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r0 = r0.p(r7)
            int r7 = r0.f96963f
            java.lang.String r0 = r0.f96964g
            r9.f200502o = r0
            if (r7 == r4) goto L74
            if (r7 == r3) goto L60
            java.lang.String r0 = r9.f200499l
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L60:
            boolean r0 = com.tencent.mm.vfs.w6.j(r0)
            if (r0 == 0) goto L69
            com.tencent.mm.ui.chatting.e7 r1 = com.tencent.mm.ui.chatting.e7.NEED_INSTALL
            goto L76
        L69:
            java.lang.String r0 = r9.f200499l
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L72
            goto L76
        L72:
            r1 = r6
            goto L76
        L74:
            com.tencent.mm.ui.chatting.e7 r1 = com.tencent.mm.ui.chatting.e7.DOWNLOADING
        L76:
            r9.f200496i = r1
            if (r1 != r2) goto L83
            android.widget.ImageView r0 = r9.f200495h
            r1 = 2131692054(0x7f0f0a16, float:1.9013197E38)
            r0.setImageResource(r1)
            goto L8b
        L83:
            android.widget.ImageView r0 = r9.f200495h
            r1 = 2131692055(0x7f0f0a17, float:1.90132E38)
            r0.setImageResource(r1)
        L8b:
            com.tencent.mm.ui.chatting.e7 r0 = r9.f200496i
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.ChattingQQMailFooterHandler"
            java.lang.String r2 = "dz[initRightBtnTv: status:%s]"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.ui.chatting.e7 r0 = r9.f200496i
            int r0 = r0.ordinal()
            com.tencent.mm.pluginsdk.ui.tools.u6 r1 = r9.f200507t
            java.lang.String r2 = "QQMailUnreadHelper"
            if (r0 == r4) goto Ld1
            r4 = 2
            if (r0 == r4) goto Lc8
            if (r0 == r3) goto Lbf
            if (r0 == r5) goto Ld1
            r3 = 5
            if (r0 == r3) goto Ld1
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.pluginsdk.ui.tools.t6$$a r3 = new com.tencent.mm.pluginsdk.ui.tools.t6$$a
            r3.<init>(r1)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r3, r2)
            goto Ldd
        Lbf:
            android.widget.TextView r0 = r9.f200494g
            r1 = 2131758221(0x7f100c8d, float:1.91474E38)
            r0.setText(r1)
            goto Ldd
        Lc8:
            android.widget.TextView r0 = r9.f200494g
            r1 = 2131758219(0x7f100c8b, float:1.9147396E38)
            r0.setText(r1)
            goto Ldd
        Ld1:
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.pluginsdk.ui.tools.t6$$a r3 = new com.tencent.mm.pluginsdk.ui.tools.t6$$a
            r3.<init>(r1)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r3, r2)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.f7.b():void");
    }

    public final void c() {
        int i17 = this.f200497j;
        if (i17 == 0 || this.f200496i != com.tencent.mm.ui.chatting.e7.INSTALLED) {
            this.f200494g.setText(com.tencent.mm.R.string.azq);
        } else if (i17 > 99) {
            this.f200494g.setText(com.tencent.mm.R.string.azp);
        } else {
            this.f200494g.setText(java.lang.String.format(i65.a.r(this.f200489b, com.tencent.mm.R.string.azo), java.lang.Integer.valueOf(this.f200497j)));
        }
    }
}
