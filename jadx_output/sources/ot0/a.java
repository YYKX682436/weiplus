package ot0;

/* loaded from: classes9.dex */
public class a extends ot0.h {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public p15.x P;
    public boolean Q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f348346b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348347c;

    /* renamed from: d, reason: collision with root package name */
    public int f348348d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f348349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348351g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348352h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348353i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348354j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f348355k;

    /* renamed from: l, reason: collision with root package name */
    public int f348356l;

    /* renamed from: m, reason: collision with root package name */
    public int f348357m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f348361q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f348364t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f348365u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f348367w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f348368x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f348369y;

    /* renamed from: z, reason: collision with root package name */
    public int f348370z;

    /* renamed from: n, reason: collision with root package name */
    public int f348358n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f348359o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f348360p = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f348362r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f348363s = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f348366v = 0;
    public int D = 0;
    public java.lang.String E = "";
    public java.lang.String F = "";
    public java.lang.String G = "";
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f348345J = "";
    public boolean K = false;
    public int L = -1;
    public java.lang.String M = "";
    public int N = 0;
    public int O = 0;
    public java.lang.String R = "";
    public java.lang.String S = "";
    public java.lang.String T = "";

    @Override // ot0.h
    public ot0.h a() {
        ot0.a aVar = new ot0.a();
        aVar.f348346b = this.f348346b;
        aVar.f348347c = this.f348347c;
        aVar.f348348d = this.f348348d;
        aVar.f348349e = this.f348349e;
        aVar.f348350f = this.f348350f;
        aVar.f348351g = this.f348351g;
        aVar.f348352h = this.f348352h;
        aVar.f348353i = this.f348353i;
        aVar.f348354j = this.f348354j;
        aVar.f348356l = this.f348356l;
        aVar.f348357m = this.f348357m;
        aVar.f348358n = this.f348358n;
        aVar.f348365u = this.f348365u;
        aVar.f348366v = this.f348366v;
        aVar.A = this.A;
        aVar.f348370z = this.f348370z;
        aVar.B = this.B;
        aVar.C = this.C;
        aVar.D = this.D;
        aVar.E = this.E;
        aVar.G = this.G;
        aVar.H = this.H;
        aVar.I = this.I;
        aVar.f348345J = this.f348345J;
        aVar.f348359o = this.f348359o;
        aVar.f348360p = this.f348360p;
        aVar.f348361q = this.f348361q;
        aVar.f348362r = this.f348362r;
        aVar.f348363s = this.f348363s;
        aVar.K = this.K;
        aVar.f348368x = this.f348368x;
        aVar.L = this.L;
        aVar.M = this.M;
        aVar.N = this.N;
        aVar.P = this.P;
        aVar.R = this.R;
        aVar.Q = this.Q;
        aVar.O = this.O;
        aVar.S = this.S;
        aVar.T = this.T;
        return aVar;
    }

    @Override // ot0.h
    public void b(dn.m mVar, ot0.q qVar) {
        if (qVar.f348666i == 48 && com.tencent.mm.sdk.platformtools.t8.K0(this.I) && !com.tencent.mm.sdk.platformtools.t8.K0(this.E)) {
            mVar.field_appType = 213;
            mVar.field_fullpath = this.E;
            mVar.field_filemd5 = this.F;
            mVar.field_fileType = 20302;
            mVar.field_totalLen = (int) com.tencent.mm.vfs.w6.k(r4);
            mVar.field_needStorage = true;
            mVar.field_isStreamMedia = false;
            mVar.field_force_aeskeycdn = false;
            mVar.field_trysafecdn = true;
            mVar.field_bzScene = 2;
        }
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<weappinfo>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348669i2)) {
            sb6.append("<pagepath>" + ot0.q.g(qVar.f348669i2) + "</pagepath>");
        }
        sb6.append("<username>" + com.tencent.mm.sdk.platformtools.t8.p(qVar.f348673j2) + "</username>");
        sb6.append("<appid>" + com.tencent.mm.sdk.platformtools.t8.p(qVar.f348677k2) + "</appid>");
        if (qVar.A2 != 0) {
            sb6.append("<version>" + qVar.A2 + "</version>");
        }
        if (qVar.f348681l2 != 0) {
            sb6.append("<type>" + qVar.f348681l2 + "</type>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.B2)) {
            sb6.append("<weappiconurl>" + ot0.q.g(qVar.B2) + "</weappiconurl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f348368x)) {
            sb6.append("<weapppagethumbrawurl>" + ot0.q.g(this.f348368x) + "</weapppagethumbrawurl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348689n2)) {
            sb6.append("<shareId>" + ot0.q.g(qVar.f348689n2) + "</shareId>");
        }
        int i19 = qVar.f348737z2;
        if (i19 == 1 || i19 == 2) {
            sb6.append("<pkginfo>");
            sb6.append("<type>");
            sb6.append(qVar.f348737z2);
            sb6.append("</type>");
            sb6.append("<md5>");
            sb6.append(qVar.f348685m2);
            sb6.append("</md5>");
            sb6.append("</pkginfo>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348693o2)) {
            sb6.append("<sharekey>" + ot0.q.g(qVar.f348693o2) + "</sharekey>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f348365u)) {
            sb6.append("<messageextradata>");
            sb6.append(ot0.q.g(this.f348365u));
            sb6.append("</messageextradata>");
        }
        if (this.f348346b) {
            sb6.append("<wadynamicpageinfo>");
            sb6.append("<shouldUseDynamicPage>1</shouldUseDynamicPage>");
            sb6.append("<cacheKey>");
            sb6.append(ot0.q.g(this.f348347c));
            sb6.append("</cacheKey>");
            sb6.append("</wadynamicpageinfo>");
        }
        if (this.f348349e || this.Q) {
            sb6.append("<waupdatablemsginfov3>");
            if (this.f348349e) {
                sb6.append("<shoulduseupdatablemsg>1</shoulduseupdatablemsg>");
            } else {
                sb6.append("<shoulduseupdatablemsg>0</shoulduseupdatablemsg>");
            }
            if (this.Q) {
                sb6.append("<shouldusechattoolmsg>1</shouldusechattoolmsg>");
            } else {
                sb6.append("<shouldusechattoolmsg>0</shouldusechattoolmsg>");
            }
            sb6.append("<updatablemsgperiod>");
            sb6.append(this.f348356l);
            sb6.append("</updatablemsgperiod>");
            sb6.append("<updatablemsgstate>");
            sb6.append(this.f348357m);
            sb6.append("</updatablemsgstate>");
            sb6.append("<updatablemsgcontent>");
            sb6.append(ot0.q.g(this.f348350f));
            sb6.append("</updatablemsgcontent>");
            sb6.append("<updatablemsgcontentcolor>");
            sb6.append(ot0.q.g(this.f348351g));
            sb6.append("</updatablemsgcontentcolor>");
            sb6.append("<subscribeentrycontent>");
            sb6.append(ot0.q.g(this.f348352h));
            sb6.append("</subscribeentrycontent>");
            sb6.append("<subscribeentrybuttonwording>");
            sb6.append(ot0.q.g(this.f348353i));
            sb6.append("</subscribeentrybuttonwording>");
            sb6.append("<subscribeconfirmedcontent>");
            sb6.append(ot0.q.g(this.f348354j));
            sb6.append("</subscribeconfirmedcontent>");
            sb6.append("<expiredsubscribewording>");
            sb6.append(ot0.q.g(this.f348355k));
            sb6.append("</expiredsubscribewording>");
            sb6.append("<updatablemsgtype>");
            sb6.append(this.f348358n);
            sb6.append("</updatablemsgtype>");
            sb6.append("</waupdatablemsginfov3>");
        }
        sb6.append("<appservicetype>" + this.f348348d + "</appservicetype>");
        if (qVar.f348705r2 != 0) {
            sb6.append("<disableforward>" + qVar.f348705r2 + "</disableforward>");
        }
        sb6.append("<secflagforsinglepagemode>" + qVar.f348717u2 + "</secflagforsinglepagemode>");
        if (qVar.s(true)) {
            sb6.append("<nativeappinfo>");
            sb6.append("<type>" + qVar.f348697p2 + "</type>");
            sb6.append("<appnamemultilanguagekey>" + ot0.q.g(qVar.f348701q2) + "</appnamemultilanguagekey>");
            sb6.append("<sourcename>" + ot0.q.g(qVar.f348709s2) + "</sourcename>");
            sb6.append("<sourceiconurl>" + ot0.q.g(qVar.f348713t2) + "</sourceiconurl>");
            sb6.append("</nativeappinfo>");
        }
        sb6.append("<videopageinfo>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<thumbwidth>");
        if (i17 == 0) {
            i17 = this.f348370z;
        }
        sb7.append(i17);
        sb7.append("</thumbwidth>");
        sb6.append(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<thumbheight>");
        if (i18 == 0) {
            i18 = this.A;
        }
        sb8.append(i18);
        sb8.append("</thumbheight>");
        sb6.append(sb8.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            sb6.append("<videosource>" + ot0.q.g(this.B) + "</videosource>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            sb6.append("<appthumburl>" + ot0.q.g(this.C) + "</appthumburl>");
        }
        sb6.append("<fromopensdk>" + this.D + "</fromopensdk>");
        sb6.append("</videopageinfo>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G) || !com.tencent.mm.sdk.platformtools.t8.K0(this.E)) {
            sb6.append("<screenvideoinfo>");
            sb6.append("<videobuttontext>");
            sb6.append(ot0.q.g(this.H));
            sb6.append("</videobuttontext>");
            if (hVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_fileUrl)) {
                com.tencent.mm.vfs.w6.h(this.E);
                this.G = hVar.field_fileUrl;
                this.F = hVar.field_filemd5;
                this.I = hVar.field_thumbUrl;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
                sb6.append("<videotemplocalpath>");
                sb6.append(ot0.q.g(this.E));
                sb6.append("</videotemplocalpath>");
            }
            sb6.append("<videomd5>");
            sb6.append(ot0.q.g(this.F));
            sb6.append("</videomd5>");
            sb6.append("<videoremoteurl>");
            sb6.append(ot0.q.g(this.G));
            sb6.append("</videoremoteurl>");
            sb6.append("<videothumburl>");
            sb6.append(ot0.q.g(this.I));
            sb6.append("</videothumburl>");
            sb6.append("<videoplaydesc>");
            sb6.append(ot0.q.g(this.f348345J));
            sb6.append("</videoplaydesc>");
            sb6.append("</screenvideoinfo>");
        }
        if (this.f348359o != 0) {
            sb6.append("<tradingguaranteeflag>");
            sb6.append(this.f348359o);
            sb6.append("</tradingguaranteeflag>");
        }
        if (this.f348360p != 0) {
            sb6.append("<showRelievedBuyFlag>");
            sb6.append(this.f348360p);
            sb6.append("</showRelievedBuyFlag>");
        }
        if (this.f348361q) {
            sb6.append("<hasRelievedBuyPlugin>1</hasRelievedBuyPlugin>");
        }
        if (this.f348362r != 0) {
            sb6.append("<showFlagshipFlag>");
            sb6.append(this.f348362r);
            sb6.append("</showFlagshipFlag>");
        }
        if (this.f348363s != 0) {
            sb6.append("<showFinancialLicenseFlag>");
            sb6.append(this.f348363s);
            sb6.append("</showFinancialLicenseFlag>");
        }
        if (this.f348366v != 0) {
            sb6.append("<subType>");
            sb6.append(this.f348366v);
            sb6.append("</subType>");
        }
        if (this.L >= 0) {
            sb6.append("<wxaTradeCommentScore>");
            sb6.append(this.L);
            sb6.append("</wxaTradeCommentScore>");
        }
        if (!android.text.TextUtils.isEmpty(this.M)) {
            sb6.append("<registerBody>");
            sb6.append(ot0.q.g(this.M));
            sb6.append("</registerBody>");
        }
        if (this.N > 0) {
            sb6.append("<certificationImageType>");
            sb6.append(this.N);
            sb6.append("</certificationImageType>");
        }
        if (this.O > 0) {
            sb6.append("<launchscene>");
            sb6.append(this.O);
            sb6.append("</launchscene>");
        }
        if (!android.text.TextUtils.isEmpty(this.f348364t)) {
            sb6.append("<todoactivityid>");
            sb6.append(ot0.q.g(this.f348364t));
            sb6.append("</todoactivityid>");
        }
        sb6.append("</weappinfo>");
        if (this.K) {
            sb6.append("<roomtoolsflag>1</roomtoolsflag>");
        }
        if (this.f348367w) {
            sb6.append("<isprivatemessage>1</isprivatemessage>");
        }
        p15.x xVar = this.P;
        if (xVar != null) {
            sb6.append(xVar.toXml(true));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.S) || com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
            return;
        }
        sb6.append("<wxchatbot>");
        sb6.append("<wxapplite>");
        sb6.append("<litepage>");
        sb6.append("<cdninfo>");
        sb6.append("<aeskey>");
        sb6.append(this.T);
        sb6.append("</aeskey>");
        sb6.append("<fileid>");
        sb6.append(this.S);
        sb6.append("</fileid>");
        sb6.append("</cdninfo>");
        sb6.append("</litepage>");
        sb6.append("</wxapplite>");
        sb6.append("</wxchatbot>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f348346b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.shouldUseDynamicPage"), 0) == 1;
        this.f348347c = (java.lang.String) map.get(".msg.appmsg.weappinfo.wadynamicpageinfo.cacheKey");
        this.f348348d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.appservicetype"), this.f348348d);
        this.f348365u = (java.lang.String) map.get(".msg.appmsg.weappinfo.messageextradata");
        this.f348366v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.subType"), this.f348366v);
        this.f348349e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shoulduseupdatablemsg"), 0) == 1;
        this.Q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.shouldusechattoolmsg"), 0) == 1;
        this.f348350f = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontent");
        this.f348351g = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgcontentcolor");
        this.f348352h = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrycontent");
        this.f348353i = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeentrybuttonwording");
        this.f348354j = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.subscribeconfirmedcontent");
        this.f348355k = (java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.expiredsubscribewording");
        this.f348357m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgstate"), 1);
        this.f348356l = (int) com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgperiod"), 10L);
        this.f348358n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.waupdatablemsginfov3.updatablemsgtype"), 0);
        this.f348370z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.thumbwidth"), 0);
        this.A = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.thumbheight"), 0);
        this.B = (java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.videosource");
        this.C = (java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.appthumburl");
        this.D = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.videopageinfo.fromopensdk"), 0);
        this.E = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videotemplocalpath");
        this.F = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videomd5");
        this.G = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoremoteurl");
        this.H = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videobuttontext");
        this.I = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videothumburl");
        this.f348345J = (java.lang.String) map.get(".msg.appmsg.weappinfo.screenvideoinfo.videoplaydesc");
        this.f348359o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.tradingguaranteeflag"), 0);
        this.f348360p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showRelievedBuyFlag"), 0);
        this.f348361q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.hasRelievedBuyPlugin"), 0) == 1;
        this.f348362r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showFlagshipFlag"), 0);
        this.f348363s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.showFinancialLicenseFlag"), 0);
        this.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.wxaTradeCommentScore"), -1);
        this.M = (java.lang.String) map.get(".msg.appmsg.weappinfo.registerBody");
        this.N = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.certificationImageType"), -1);
        this.f348364t = (java.lang.String) map.get(".msg.appmsg.weappinfo.todoactivityid");
        this.K = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.roomtoolsflag"), 0) == 1;
        this.f348367w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.isprivatemessage"), 0) == 1;
        this.f348368x = (java.lang.String) map.get(".msg.appmsg.weappinfo.weapppagethumbrawurl");
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wxaInfo.appId");
        this.O = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.weappinfo.launchscene"), 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            p15.x xVar = new p15.x();
            this.P = xVar;
            xVar.p(str);
            this.P.u((java.lang.String) map.get(".msg.appmsg.wxaInfo.nickname"));
            this.P.t((java.lang.String) map.get(".msg.appmsg.wxaInfo.iconUrl"));
            this.P.q((java.lang.String) map.get(".msg.appmsg.wxaInfo.enterPath"));
            this.P.s((java.lang.String) map.get(".msg.appmsg.wxaInfo.forwardSceneNote"));
            this.P.w(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wxaInfo.showSourceView"), 0));
            this.P.x(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wxaInfo.versionType"), 0));
        }
        this.T = (java.lang.String) map.get(".msg.appmsg.wxchatbot.wxapplite.litepage.cdninfo.aeskey");
        this.S = (java.lang.String) map.get(".msg.appmsg.wxchatbot.wxapplite.litepage.cdninfo.fileid");
    }

    @Override // ot0.h
    public void e(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar == null || qVar.f348666i != 48) {
            return;
        }
        java.lang.String str2 = qVar.f348677k2;
        if (hVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_fileUrl) || com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_thumbUrl)) {
            return;
        }
        try {
            java.lang.String str3 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/minigame/video/index.html?url=%s&cover=%s&appid=%s&extWording=%s&btnWording=%s&shareTitle=%s";
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = fp.s0.b(hVar.field_fileUrl, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            objArr[1] = fp.s0.b(hVar.field_thumbUrl, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            objArr[2] = fp.s0.b(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            objArr[3] = !com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348658g) ? fp.s0.b(qVar.f348658g, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) : "";
            objArr[4] = !com.tencent.mm.sdk.platformtools.t8.K0(this.H) ? fp.s0.b(this.H, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) : "";
            objArr[5] = com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348654f) ? "" : fp.s0.b(qVar.f348654f, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String format = java.lang.String.format(str3, objArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppContentAppBrandPiece", "hy: formatted url is %s", format);
            qVar.f348674k = format;
            java.lang.String str4 = hVar.field_thumbUrl;
            qVar.f348734z = str4;
            qVar.M = str4;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppContentAppBrandPiece", e17, "hy: not support utf-8!", new java.lang.Object[0]);
        }
    }
}
