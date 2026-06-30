package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes7.dex */
public class f0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191617b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f191618c;

    /* renamed from: d, reason: collision with root package name */
    public int f191619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f191620e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191621f;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.f0 f0Var = new com.tencent.mm.pluginsdk.ui.tools.f0();
        f0Var.f191617b = this.f191617b;
        f0Var.f191618c = this.f191618c;
        f0Var.f191619d = this.f191619d;
        f0Var.f191620e = this.f191620e;
        f0Var.f191621f = this.f191621f;
        return f0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<ecskfcard>");
        sb6.append("<framesetname>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191618c));
        sb6.append("</framesetname>");
        sb6.append("<mbcarddata>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191617b));
        sb6.append("</mbcarddata>");
        sb6.append("<minupdateunixtimestamp>");
        sb6.append(this.f191619d);
        sb6.append("</minupdateunixtimestamp>");
        sb6.append("<needheader>");
        sb6.append(this.f191620e);
        sb6.append("</needheader>");
        sb6.append("<summary>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f191621f));
        sb6.append("</summary>");
        sb6.append("</ecskfcard>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f191617b = (java.lang.String) map.get(".msg.appmsg.ecskfcard.mbcarddata");
        this.f191618c = (java.lang.String) map.get(".msg.appmsg.ecskfcard.framesetname");
        this.f191619d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.ecskfcard.minupdateunixtimestamp"), 0);
        this.f191620e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.ecskfcard.needheader"), 0) == 1;
        this.f191621f = (java.lang.String) map.get(".msg.appmsg.ecskfcard.summary");
    }
}
