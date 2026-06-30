package su4;

/* loaded from: classes4.dex */
public class l2 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f412983b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f412984c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412986e;

    /* renamed from: f, reason: collision with root package name */
    public long f412987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412988g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412989h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f412990i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f412991j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f412992k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f412993l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f412994m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f412995n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f412996o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f412997p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f412998q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f412999r;

    /* renamed from: s, reason: collision with root package name */
    public long f413000s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f413001t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f413002u;

    @Override // ot0.h
    public ot0.h a() {
        su4.l2 l2Var = new su4.l2();
        l2Var.f412983b = this.f412983b;
        l2Var.f412984c = this.f412984c;
        l2Var.f412985d = this.f412985d;
        l2Var.f412986e = this.f412986e;
        l2Var.f412987f = this.f412987f;
        l2Var.f412988g = this.f412988g;
        l2Var.f412989h = this.f412989h;
        l2Var.f412990i = this.f412990i;
        l2Var.f412991j = this.f412991j;
        l2Var.f412992k = this.f412992k;
        l2Var.f412993l = this.f412993l;
        l2Var.f412994m = this.f412994m;
        l2Var.f412995n = this.f412995n;
        l2Var.f412996o = this.f412996o;
        l2Var.f412997p = this.f412997p;
        l2Var.f412998q = this.f412998q;
        l2Var.f412999r = this.f412999r;
        l2Var.f413000s = this.f413000s;
        l2Var.f413001t = this.f413001t;
        l2Var.f413002u = this.f413002u;
        return l2Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<websearch>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412983b)) {
            sb6.append("<relevant_vid>");
            sb6.append(ot0.q.g(this.f412983b));
            sb6.append("</relevant_vid>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412984c)) {
            sb6.append("<relevant_expand>");
            sb6.append(ot0.q.g(this.f412984c));
            sb6.append("</relevant_expand>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412984c)) {
            sb6.append("<relevant_expand>");
            sb6.append(ot0.q.g(this.f412984c));
            sb6.append("</relevant_expand>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412985d)) {
            sb6.append("<relevant_pre_searchid>");
            sb6.append(ot0.q.g(this.f412985d));
            sb6.append("</relevant_pre_searchid>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412986e)) {
            sb6.append("<relevant_shared_openid>");
            sb6.append(ot0.q.g(this.f412986e));
            sb6.append("</relevant_shared_openid>");
        }
        if (this.f412987f >= 0) {
            sb6.append("<rec_category>");
            sb6.append(this.f412987f);
            sb6.append("</rec_category>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412988g)) {
            sb6.append("<shareUrl>");
            sb6.append(ot0.q.g(this.f412988g));
            sb6.append("</shareUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412989h)) {
            sb6.append("<shareTitle>");
            sb6.append(ot0.q.g(this.f412989h));
            sb6.append("</shareTitle>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412990i)) {
            sb6.append("<shareDesc>");
            sb6.append(ot0.q.g(this.f412990i));
            sb6.append("</shareDesc>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412991j)) {
            sb6.append("<shareImgUrl>");
            sb6.append(ot0.q.g(this.f412991j));
            sb6.append("</shareImgUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412992k)) {
            sb6.append("<shareString>");
            sb6.append(ot0.q.g(this.f412992k));
            sb6.append("</shareString>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412993l)) {
            sb6.append("<shareStringUrl>");
            sb6.append(ot0.q.g(this.f412993l));
            sb6.append("</shareStringUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412994m)) {
            sb6.append("<source>");
            sb6.append(ot0.q.g(this.f412994m));
            sb6.append("</source>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412995n)) {
            sb6.append("<sourceUrl>");
            sb6.append(ot0.q.g(this.f412995n));
            sb6.append("</sourceUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412996o)) {
            sb6.append("<strPlayCount>");
            sb6.append(ot0.q.g(this.f412996o));
            sb6.append("</strPlayCount>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412997p)) {
            sb6.append("<titleUrl>");
            sb6.append(ot0.q.g(this.f412997p));
            sb6.append("</titleUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412998q)) {
            sb6.append("<extReqParams>");
            sb6.append(ot0.q.g(this.f412998q));
            sb6.append("</extReqParams>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412999r)) {
            sb6.append("<tagList>");
            sb6.append(ot0.q.g(this.f412999r));
            sb6.append("</tagList>");
        }
        if (this.f413000s >= 0) {
            sb6.append("<channelId>");
            sb6.append(this.f413000s);
            sb6.append("</channelId>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f413001t)) {
            sb6.append("<thumbUrl>");
            sb6.append(ot0.q.g(this.f413001t));
            sb6.append("</thumbUrl>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f413002u)) {
            sb6.append("<shareTag>");
            sb6.append(ot0.q.g(this.f413002u));
            sb6.append("</shareTag>");
        }
        sb6.append("</websearch>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f412983b = (java.lang.String) map.get(".msg.appmsg.websearch.relevant_vid");
        this.f412984c = (java.lang.String) map.get(".msg.appmsg.websearch.relevant_expand");
        this.f412985d = (java.lang.String) map.get(".msg.appmsg.websearch.relevant_pre_searchid");
        this.f412986e = (java.lang.String) map.get(".msg.appmsg.websearch.relevant_shared_openid");
        this.f412987f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.websearch.rec_category"), -1);
        this.f412988g = (java.lang.String) map.get(".msg.appmsg.websearch.shareUrl");
        this.f412989h = (java.lang.String) map.get(".msg.appmsg.websearch.shareTitle");
        this.f412990i = (java.lang.String) map.get(".msg.appmsg.websearch.shareDesc");
        this.f412991j = (java.lang.String) map.get(".msg.appmsg.websearch.shareImgUrl");
        this.f412992k = (java.lang.String) map.get(".msg.appmsg.websearch.shareString");
        this.f412993l = (java.lang.String) map.get(".msg.appmsg.websearch.shareStringUrl");
        this.f412994m = (java.lang.String) map.get(".msg.appmsg.websearch.source");
        this.f412995n = (java.lang.String) map.get(".msg.appmsg.websearch.sourceUrl");
        this.f412996o = (java.lang.String) map.get(".msg.appmsg.websearch.strPlayCount");
        this.f412997p = (java.lang.String) map.get(".msg.appmsg.websearch.titleUrl");
        this.f412998q = (java.lang.String) map.get(".msg.appmsg.websearch.extReqParams");
        this.f412999r = (java.lang.String) map.get(".msg.appmsg.websearch.tagList");
        this.f413000s = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.websearch.channelId"), -1L);
        this.f413001t = (java.lang.String) map.get(".msg.appmsg.websearch.thumbUrl");
        this.f413002u = (java.lang.String) map.get(".msg.appmsg.websearch.shareTag");
    }
}
