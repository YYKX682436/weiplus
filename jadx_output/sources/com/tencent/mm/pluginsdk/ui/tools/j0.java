package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes7.dex */
public class j0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191721b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f191722c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191724e;

    /* renamed from: f, reason: collision with root package name */
    public int f191725f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f191726g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f191727h = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.j0 j0Var = new com.tencent.mm.pluginsdk.ui.tools.j0();
        j0Var.f191721b = this.f191721b;
        j0Var.f191722c = this.f191722c;
        j0Var.f191723d = this.f191723d;
        j0Var.f191724e = this.f191724e;
        j0Var.f191725f = this.f191725f;
        j0Var.f191726g = this.f191726g;
        j0Var.f191727h = this.f191727h;
        return j0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<wxgamecard>");
        sb6.append("<framesetname>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191722c));
        sb6.append("</framesetname>");
        sb6.append("<mbcarddata>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191721b));
        sb6.append("</mbcarddata>");
        sb6.append("<minpkgversion>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191723d));
        sb6.append("</minpkgversion>");
        sb6.append("<clientextinfo>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191724e));
        sb6.append("</clientextinfo>");
        sb6.append("<mbcardheight>");
        sb6.append(this.f191725f);
        sb6.append("</mbcardheight>");
        sb6.append("<isoldversion>");
        sb6.append(this.f191726g);
        sb6.append("</isoldversion>");
        sb6.append("</wxgamecard>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f191721b = (java.lang.String) map.get(".msg.appmsg.wxgamecard.mbcarddata");
        this.f191722c = (java.lang.String) map.get(".msg.appmsg.wxgamecard.framesetname");
        this.f191723d = (java.lang.String) map.get(".msg.appmsg.wxgamecard.minpkgversion");
        this.f191724e = (java.lang.String) map.get(".msg.appmsg.wxgamecard.clientextinfo");
        this.f191725f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wxgamecard.mbcardheight"), 0);
        this.f191726g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.wxgamecard.isoldversion"), 0);
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191724e)) {
                return;
            }
            this.f191727h = new org.json.JSONObject(this.f191724e).optInt("msgtype", 0);
        } catch (org.json.JSONException unused) {
        }
    }
}
