package ot0;

/* loaded from: classes9.dex */
public class f extends ot0.h {

    /* renamed from: l, reason: collision with root package name */
    public ot0.m1 f348465l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348467n;

    /* renamed from: o, reason: collision with root package name */
    public int f348468o;

    /* renamed from: p, reason: collision with root package name */
    public int f348469p;

    /* renamed from: b, reason: collision with root package name */
    public int f348455b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f348456c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f348457d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f348458e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f348459f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f348460g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f348461h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f348462i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348463j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f348464k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f348466m = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f348470q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f348471r = "0";

    public static boolean f(int i17) {
        return i17 == 5 || i17 == 16;
    }

    @Override // ot0.h
    public ot0.h a() {
        int i17 = this.f348455b;
        if (i17 == -1 && !this.f348464k && this.f348466m != 1) {
            return null;
        }
        ot0.f fVar = new ot0.f();
        fVar.f348455b = i17;
        fVar.f348456c = this.f348456c;
        fVar.f348457d = this.f348457d;
        fVar.f348458e = this.f348458e;
        fVar.f348459f = this.f348459f;
        fVar.f348460g = this.f348460g;
        fVar.f348463j = this.f348463j;
        fVar.f348462i = this.f348462i;
        fVar.f348464k = this.f348464k;
        fVar.f348465l = this.f348465l;
        fVar.f348461h = this.f348461h;
        fVar.f348466m = this.f348466m;
        fVar.f348467n = this.f348467n;
        fVar.f348468o = this.f348468o;
        fVar.f348469p = this.f348469p;
        fVar.f348470q = this.f348470q;
        fVar.f348471r = this.f348471r;
        return fVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        java.lang.String str2;
        if (this.f348455b != -1 || this.f348466m == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f348463j)) {
                this.f348460g = 1;
            }
            sb6.append("<mmreadershare>");
            sb6.append("<itemshowtype>");
            sb6.append(this.f348455b);
            sb6.append("</itemshowtype>");
            sb6.append("<ispaysubscribe>");
            sb6.append(this.f348461h);
            sb6.append("</ispaysubscribe>");
            if (this.f348466m == 1) {
                sb6.append("<showsourceinfo>");
                sb6.append(this.f348466m);
                sb6.append("</showsourceinfo>");
            }
            if (f(this.f348455b)) {
                sb6.append("<pubtime>");
                sb6.append(this.f348456c);
                sb6.append("</pubtime>");
                sb6.append("<duration>");
                sb6.append(this.f348457d);
                sb6.append("</duration>");
                sb6.append("<width>");
                sb6.append(this.f348458e);
                sb6.append("</width>");
                sb6.append("<height>");
                sb6.append(this.f348459f);
                sb6.append("</height>");
                sb6.append("<nativepage>");
                sb6.append(this.f348460g);
                sb6.append("</nativepage>");
                sb6.append("<funcflag>");
                sb6.append(this.f348462i);
                sb6.append("</funcflag>");
                sb6.append("<vid>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348463j));
                sb6.append("</vid>");
                java.lang.String str3 = this.f348467n;
                if (str3 != null && !str3.isEmpty() && this.f348468o > 0 && this.f348469p > 0) {
                    sb6.append("<coverpicimageurl>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348467n));
                    sb6.append("</coverpicimageurl>");
                    sb6.append("<coverpicwidth>");
                    sb6.append(this.f348468o);
                    sb6.append("</coverpicwidth>");
                    sb6.append("<coverpicheight>");
                    sb6.append(this.f348469p);
                    sb6.append("</coverpicheight>");
                    sb6.append("<isfindercontact>");
                    sb6.append(this.f348471r);
                    sb6.append("</isfindercontact>");
                }
            }
            if (this.f348455b == 8 && (str2 = this.f348467n) != null && !str2.isEmpty() && this.f348468o > 0 && this.f348469p > 0 && this.f348470q > 0) {
                sb6.append("<coverpicimageurl>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348467n));
                sb6.append("</coverpicimageurl>");
                sb6.append("<coverpicwidth>");
                sb6.append(this.f348468o);
                sb6.append("</coverpicwidth>");
                sb6.append("<coverpicheight>");
                sb6.append(this.f348469p);
                sb6.append("</coverpicheight>");
                sb6.append("<piccount>");
                sb6.append(this.f348470q);
                sb6.append("</piccount>");
                sb6.append("<isfindercontact>");
                sb6.append(this.f348471r);
                sb6.append("</isfindercontact>");
            }
            sb6.append("</mmreadershare>");
        }
        if (!this.f348464k || this.f348465l == null) {
            return;
        }
        sb6.append("<mmbrandmpvideo>");
        sb6.append("<vid>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348465l.f373341f));
        sb6.append("</vid>");
        sb6.append("<videourl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348465l.f373340e));
        sb6.append("</videourl>");
        sb6.append("<mpurl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348465l.f373339d));
        sb6.append("</mpurl>");
        sb6.append("<thumbwidth>");
        sb6.append(this.f348465l.f373345m);
        sb6.append("</thumbwidth>");
        sb6.append("<thumbheight>");
        sb6.append(this.f348465l.f373346n);
        sb6.append("</thumbheight>");
        sb6.append("<duration>");
        sb6.append(this.f348465l.f373344i);
        sb6.append("</duration>");
        sb6.append("</mmbrandmpvideo>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f348461h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.ispaysubscribe"), 0);
        this.f348455b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.itemshowtype"), -1);
        this.f348466m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.showsourceinfo"), 0);
        int i17 = this.f348455b;
        if (i17 == 5 || i17 == 16) {
            this.f348456c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.pubtime"), 0);
            this.f348457d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.duration"), 0);
            this.f348458e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.width"), 0);
            this.f348459f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.height"), 0);
            this.f348460g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.nativepage"), 0);
            this.f348462i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.funcflag"), 0);
            this.f348463j = (java.lang.String) map.get(".msg.appmsg.mmreadershare.vid");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.mpurl")) && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.videourl"))) {
            this.f348464k = true;
            ot0.m1 m1Var = new ot0.m1();
            this.f348465l = m1Var;
            m1Var.f373341f = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.vid");
            this.f348465l.f373340e = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.videourl");
            this.f348465l.f373339d = (java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.mpurl");
            this.f348465l.f373343h = (java.lang.String) map.get(".msg.appmsg.thumburl");
            this.f348465l.f373342g = (java.lang.String) map.get(".msg.appmsg.title");
            this.f348465l.f373347o = (java.lang.String) map.get(".msg.appmsg.url");
            this.f348465l.f373348p = (java.lang.String) map.get(".msg.appmsg.sourceusername");
            this.f348465l.f373349q = (java.lang.String) map.get(".msg.appmsg.sourcedisplayname");
            this.f348465l.f373344i = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.duration"), 0.0f);
            this.f348465l.f373345m = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.thumbwidth"), 0.0f);
            this.f348465l.f373346n = (int) com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(".msg.appmsg.mmbrandmpvideo.thumbheight"), 0.0f);
        }
        if (this.f348455b == 8 && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl")) && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth")) && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight")) && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.piccount"))) {
            this.f348467n = (java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl");
            this.f348468o = com.tencent.mm.sdk.platformtools.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth"), 0);
            this.f348469p = com.tencent.mm.sdk.platformtools.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"), 0);
            this.f348470q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreadershare.piccount"), 0);
            this.f348471r = (java.lang.String) map.get(".msg.appmsg.mmreadershare.isfindercontact");
        }
        if (!f(this.f348455b) || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl")) || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth")) || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"))) {
            return;
        }
        this.f348467n = (java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicimageurl");
        this.f348468o = com.tencent.mm.sdk.platformtools.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicwidth"), 0);
        this.f348469p = com.tencent.mm.sdk.platformtools.t8.Q((java.lang.String) map.get(".msg.appmsg.mmreadershare.coverpicheight"), 0);
        this.f348471r = (java.lang.String) map.get(".msg.appmsg.mmreadershare.isfindercontact");
    }
}
