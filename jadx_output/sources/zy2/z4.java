package zy2;

/* loaded from: classes9.dex */
public class z4 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f477634b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f477635c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f477636d;

    /* renamed from: e, reason: collision with root package name */
    public int f477637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f477638f;

    @Override // ot0.h
    public ot0.h a() {
        zy2.z4 z4Var = new zy2.z4();
        z4Var.f477634b = this.f477634b;
        z4Var.f477635c = this.f477635c;
        z4Var.f477636d = this.f477636d;
        z4Var.f477637e = this.f477637e;
        z4Var.f477638f = this.f477638f;
        return z4Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<finderGuarantee>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f477634b)) {
            sb6.append("<title>");
            sb6.append(ot0.q.g(this.f477634b));
            sb6.append("</title>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f477635c)) {
            sb6.append("<desc>");
            sb6.append(ot0.q.g(this.f477635c));
            sb6.append("</desc>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f477636d)) {
            sb6.append("<relativePath>");
            sb6.append(ot0.q.g(this.f477636d));
            sb6.append("</relativePath>");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f477638f)) {
            sb6.append("<appid>");
            sb6.append(ot0.q.g(this.f477638f));
            sb6.append("</appid>");
        }
        sb6.append("<scene>");
        sb6.append(ot0.q.g(java.lang.String.valueOf(this.f477637e)));
        sb6.append("</scene>");
        sb6.append("</finderGuarantee>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f477634b = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.title");
        this.f477635c = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.desc");
        this.f477636d = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.relativePath");
        this.f477638f = (java.lang.String) map.get(".msg.appmsg.finderGuarantee.appid");
        this.f477637e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.finderGuarantee.scene"), 0);
    }
}
