package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public class i0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191690b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f191691c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191692d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191693e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191694f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f191695g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f191696h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f191697i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f191698j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f191699k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f191700l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f191701m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f191702n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f191703o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f191704p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f191705q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f191706r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f191707s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f191708t;

    public static r45.xs4 f(com.tencent.mm.pluginsdk.ui.tools.i0 i0Var) {
        r45.xs4 xs4Var = new r45.xs4();
        if (i0Var == null) {
            return xs4Var;
        }
        xs4Var.set(0, i0Var.f191692d);
        xs4Var.set(1, i0Var.f191693e);
        xs4Var.set(2, i0Var.f191694f);
        xs4Var.set(3, i0Var.f191695g);
        xs4Var.set(4, i0Var.f191696h);
        xs4Var.set(5, i0Var.f191697i);
        xs4Var.set(7, i0Var.f191698j);
        xs4Var.set(8, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(i0Var.f191699k)));
        xs4Var.set(9, i0Var.f191700l);
        xs4Var.set(10, java.lang.Integer.valueOf(i0Var.f191702n));
        xs4Var.set(6, i0Var.f191701m);
        xs4Var.set(12, i0Var.f191703o);
        xs4Var.set(11, i0Var.f191704p);
        xs4Var.set(16, i0Var.f191690b);
        xs4Var.set(18, java.lang.Integer.valueOf(i0Var.f191706r));
        xs4Var.set(19, i0Var.f191707s);
        xs4Var.set(20, i0Var.f191708t);
        return xs4Var;
    }

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = new com.tencent.mm.pluginsdk.ui.tools.i0();
        i0Var.f191690b = this.f191690b;
        i0Var.f191691c = this.f191691c;
        i0Var.f191692d = this.f191692d;
        i0Var.f191693e = this.f191693e;
        i0Var.f191694f = this.f191694f;
        i0Var.f191695g = this.f191695g;
        i0Var.f191696h = this.f191696h;
        i0Var.f191697i = this.f191697i;
        i0Var.f191698j = this.f191698j;
        i0Var.f191699k = this.f191699k;
        i0Var.f191700l = this.f191700l;
        i0Var.f191701m = this.f191701m;
        i0Var.f191702n = this.f191702n;
        i0Var.f191704p = this.f191704p;
        i0Var.f191705q = this.f191705q;
        i0Var.f191707s = this.f191707s;
        i0Var.f191706r = this.f191706r;
        i0Var.f191708t = this.f191708t;
        return i0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191690b)) {
            sb6.append("<songalbumurl>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191690b));
            sb6.append("</songalbumurl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191691c)) {
            sb6.append("<songlyric>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191691c));
            sb6.append("</songlyric>");
        }
        if (this.f191706r > 0) {
            sb6.append("<tingListenItem>");
            sb6.append("<type>");
            sb6.append(this.f191706r);
            sb6.append("</type>");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191707s)) {
                sb6.append("<listenItem>");
                sb6.append(this.f191707s);
                sb6.append("</listenItem>");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191708t)) {
                sb6.append("<listenId>");
                sb6.append(this.f191708t);
                sb6.append("</listenId>");
            }
            sb6.append("</tingListenItem>");
        }
        sb6.append("<musicShareItem>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191692d)) {
            sb6.append("<mvObjectId>");
            sb6.append(this.f191692d);
            sb6.append("</mvObjectId>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191693e)) {
            sb6.append("<mvNonceId>");
            sb6.append(this.f191693e);
            sb6.append("</mvNonceId>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191694f)) {
            sb6.append("<mvCoverUrl>");
            sb6.append(ot0.q.g(this.f191694f));
            sb6.append("</mvCoverUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191695g)) {
            sb6.append("<mvMakerFinderNickname>");
            sb6.append(ot0.q.g(this.f191695g));
            sb6.append("</mvMakerFinderNickname>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191696h)) {
            sb6.append("<mvSingerName>");
            sb6.append(ot0.q.g(this.f191696h));
            sb6.append("</mvSingerName>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191697i)) {
            sb6.append("<mvAlbumName>");
            sb6.append(ot0.q.g(this.f191697i));
            sb6.append("</mvAlbumName>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191698j)) {
            sb6.append("<mvMusicGenre>");
            sb6.append(ot0.q.g(this.f191698j));
            sb6.append("</mvMusicGenre>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191699k)) {
            sb6.append("<mvIssueDate>");
            sb6.append(ot0.q.g(this.f191699k));
            sb6.append("</mvIssueDate>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191700l)) {
            sb6.append("<mvIdentification>");
            sb6.append(ot0.q.g(this.f191700l));
            sb6.append("</mvIdentification>");
        }
        sb6.append("<musicDuration>");
        sb6.append(this.f191702n);
        sb6.append("</musicDuration>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191701m)) {
            sb6.append("<mvExtInfo>");
            sb6.append(ot0.q.g(this.f191701m));
            sb6.append("</mvExtInfo>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191703o)) {
            sb6.append("<mvOperationUrl>");
            sb6.append(ot0.q.g(this.f191703o));
            sb6.append("</mvOperationUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191704p)) {
            sb6.append("<mid>");
            sb6.append(ot0.q.g(this.f191704p));
            sb6.append("</mid>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191705q)) {
            sb6.append("<appIdForSourceDisplay>");
            sb6.append(ot0.q.g(this.f191705q));
            sb6.append("</appIdForSourceDisplay>");
        }
        sb6.append("</musicShareItem>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f191690b = (java.lang.String) map.get(".msg.appmsg.songalbumurl");
        this.f191691c = (java.lang.String) map.get(".msg.appmsg.songlyric");
        this.f191692d = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvObjectId");
        this.f191693e = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvNonceId");
        this.f191694f = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvCoverUrl");
        this.f191695g = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvMakerFinderNickname");
        this.f191696h = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvSingerName");
        this.f191697i = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvAlbumName");
        this.f191698j = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvMusicGenre");
        this.f191699k = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvIssueDate");
        this.f191700l = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvIdentification");
        this.f191701m = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvExtInfo");
        this.f191702n = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.musicShareItem.musicDuration"), 0);
        this.f191703o = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mvOperationUrl");
        this.f191704p = (java.lang.String) map.get(".msg.appmsg.musicShareItem.mid");
        this.f191705q = (java.lang.String) map.get(".msg.appmsg.musicShareItem.appIdForSourceDisplay");
        this.f191707s = (java.lang.String) map.get(".msg.appmsg.tingListenItem.listenItem");
        this.f191706r = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.tingListenItem.type"), 0);
        this.f191708t = (java.lang.String) map.get(".msg.appmsg.tingListenItem.listenId");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191690b) || this.f191706r <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f191707s)) {
            return;
        }
        bw5.v70 c17 = rk4.l5.c(this.f191707s);
        java.lang.String f17 = c17 != null ? c17.f() : null;
        if (f17 == null) {
            f17 = "";
        }
        this.f191690b = f17;
    }
}
