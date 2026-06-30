package ot0;

/* loaded from: classes9.dex */
public class c extends ot0.h {
    public java.lang.String A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public ot0.j I;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348410c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348413f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348414g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348415h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348416i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348417j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f348418k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f348419l;

    /* renamed from: m, reason: collision with root package name */
    public int f348420m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348421n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f348422o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f348423p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f348424q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f348425r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f348426s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f348427t;

    /* renamed from: u, reason: collision with root package name */
    public int f348428u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f348429v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f348430w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f348431x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f348432y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f348433z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.c();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f348666i == 2001) {
            ot0.j jVar = new ot0.j();
            this.I = jVar;
            jVar.d(map, qVar);
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.locallogoicon");
            if (str == null) {
                str = "";
            }
            this.f348409b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.localbubbleicon");
            if (str2 == null) {
                str2 = "";
            }
            this.f348410c = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.effectresource");
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppContentC2cMsgPiece", "locallogoicon: %s, localbubbleicon: %s, effectResource: %s", this.f348409b, this.f348410c, str3);
            java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.corpname");
            if (str4 == null) {
                str4 = "";
            }
            this.f348411d = str4;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348530b)) {
                java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourceurl");
                if (str5 == null) {
                    str5 = "";
                }
                this.f348412e = str5;
            } else {
                this.f348412e = this.I.f348530b;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348531c)) {
                java.lang.String str6 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourcemd5");
                if (str6 == null) {
                    str6 = "";
                }
                this.f348413f = str6;
            } else {
                this.f348413f = this.I.f348531c;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348532d)) {
                java.lang.String str7 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourceurl");
                if (str7 == null) {
                    str7 = "";
                }
                this.f348414g = str7;
            } else {
                this.f348414g = this.I.f348532d;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348533e)) {
                java.lang.String str8 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourcemd5");
                if (str8 == null) {
                    str8 = "";
                }
                this.f348415h = str8;
            } else {
                this.f348415h = this.I.f348533e;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348534f)) {
                java.lang.String str9 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.recshowsourceurl");
                if (str9 == null) {
                    str9 = "";
                }
                this.f348416i = str9;
            } else {
                this.f348416i = this.I.f348534f;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348535g)) {
                java.lang.String str10 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.recshowsourcemd5");
                if (str10 == null) {
                    str10 = "";
                }
                this.f348417j = str10;
            } else {
                this.f348417j = this.I.f348535g;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348536h)) {
                java.lang.String str11 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.detailshowsourceurl");
                if (str11 == null) {
                    str11 = "";
                }
                this.f348418k = str11;
            } else {
                this.f348418k = this.I.f348536h;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348537i)) {
                java.lang.String str12 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.detailshowsourcemd5");
                if (str12 == null) {
                    str12 = "";
                }
                this.f348419l = str12;
            } else {
                this.f348419l = this.I.f348537i;
            }
            this.f348420m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wcpayinfo.subtype"), 0);
            java.lang.String str13 = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.exclusive_recv_username");
            this.f348421n = str13 != null ? str13 : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348545q)) {
                this.f348422o = this.I.f348545q;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348546r)) {
                this.f348423p = this.I.f348546r;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348547s)) {
                this.f348424q = this.I.f348547s;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348548t)) {
                this.f348425r = this.I.f348548t;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348549u)) {
                this.f348426s = this.I.f348549u;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348550v)) {
                this.f348427t = this.I.f348550v;
            }
            ot0.j jVar2 = this.I;
            this.f348428u = jVar2.f348551w;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar2.f348552x)) {
                this.f348429v = this.I.f348552x;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348553y)) {
                this.f348430w = this.I.f348553y;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348554z)) {
                this.f348431x = this.I.f348554z;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.A)) {
                this.f348432y = this.I.A;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.B)) {
                this.f348433z = this.I.B;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.C)) {
                this.A = this.I.C;
            }
            ot0.j jVar3 = this.I;
            this.B = jVar3.D;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar3.E)) {
                this.C = this.I.E;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.F)) {
                this.D = this.I.F;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.G)) {
                this.E = this.I.G;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.H)) {
                this.F = this.I.H;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.I.I)) {
                this.G = this.I.I;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.I.f348529J)) {
                return;
            }
            this.H = this.I.f348529J;
        }
    }
}
