package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public class h0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191665b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f191666c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191667d;

    /* renamed from: e, reason: collision with root package name */
    public int f191668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191669f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f191670g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191671h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f191672i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f191673j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f191674k = false;

    /* renamed from: l, reason: collision with root package name */
    public z05.e f191675l = null;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
        h0Var.f191665b = this.f191665b;
        h0Var.f191666c = this.f191666c;
        h0Var.f191667d = this.f191667d;
        h0Var.f191668e = this.f191668e;
        h0Var.f191669f = this.f191669f;
        h0Var.f191670g = this.f191670g;
        h0Var.f191671h = this.f191671h;
        h0Var.f191672i = this.f191672i;
        h0Var.f191674k = this.f191674k;
        h0Var.f191673j = this.f191673j;
        h0Var.f191675l = this.f191675l;
        ot0.q qVar = this.f348481a;
        if (qVar != null) {
            qVar.E2 = this.f191672i ? 1 : 0;
        }
        return h0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<liteapp>");
        sb6.append("<id>");
        sb6.append(this.f191665b);
        sb6.append("</id>");
        sb6.append("<path>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191666c));
        sb6.append("</path>");
        sb6.append("<query>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191667d));
        sb6.append("</query>");
        if (this.f191668e > 0) {
            sb6.append("<source>");
            sb6.append(this.f191668e);
            sb6.append("</source>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191669f)) {
            sb6.append("<minversion>");
            sb6.append(this.f191669f);
            sb6.append("</minversion>");
        }
        sb6.append("<istransparent>");
        sb6.append(this.f191670g ? 1 : 0);
        sb6.append("</istransparent>");
        sb6.append("<hideicon>");
        sb6.append(this.f191671h ? 1 : 0);
        sb6.append("</hideicon>");
        sb6.append("<forbidforward>");
        sb6.append(this.f191672i ? 1 : 0);
        sb6.append("</forbidforward>");
        if (this.f191675l != null) {
            sb6.append("<oldImageCDNInfo>");
            sb6.append("<cdnthumburl>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191675l.o()));
            sb6.append("</cdnthumburl>");
            sb6.append("<cdnthumbmd5>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191675l.n()));
            sb6.append("</cdnthumbmd5>");
            sb6.append("<cdnthumblength>");
            sb6.append(this.f191675l.l());
            sb6.append("</cdnthumblength>");
            sb6.append("<cdnthumbwidth>");
            sb6.append(this.f191675l.p());
            sb6.append("</cdnthumbwidth>");
            sb6.append("<cdnthumbheight>");
            sb6.append(this.f191675l.k());
            sb6.append("</cdnthumbheight>");
            sb6.append("<cdnthumbaeskey>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191675l.j()));
            sb6.append("</cdnthumbaeskey>");
            sb6.append("</oldImageCDNInfo>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191673j)) {
            sb6.append("<imageConf>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191673j));
            sb6.append("</imageConf>");
        }
        sb6.append("</liteapp>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map.get(".msg.appmsg.liteapp") != null) {
            this.f191665b = (java.lang.String) map.get(".msg.appmsg.liteapp.id");
            this.f191666c = (java.lang.String) map.get(".msg.appmsg.liteapp.path");
            this.f191667d = (java.lang.String) map.get(".msg.appmsg.liteapp.query");
            this.f191668e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.source"), 0);
            this.f191669f = (java.lang.String) map.get(".msg.appmsg.liteapp.minversion");
            this.f191670g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.istransparent"), 0) == 1;
            this.f191671h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.hideicon"), 0) == 1;
            this.f191672i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.forbidforward"), 0) == 1;
            if (map.containsKey(".msg.appmsg.liteapp.oldImageCDNInfo")) {
                z05.e eVar = new z05.e();
                this.f191675l = eVar;
                eVar.u((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumburl"));
                this.f191675l.t((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbmd5"));
                this.f191675l.s(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumblength"), 0));
                this.f191675l.w(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbwidth"), 0));
                this.f191675l.r(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbheight"), 0));
                this.f191675l.q((java.lang.String) map.get(".msg.appmsg.liteapp.oldImageCDNInfo.cdnthumbaeskey"));
            }
            this.f191673j = (java.lang.String) map.get(".msg.appmsg.liteapp.imageConf");
            this.f191674k = !com.tencent.mm.sdk.platformtools.t8.K0(r5);
            qVar.E2 = this.f191672i ? 1 : 0;
        }
    }
}
