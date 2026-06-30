package ot0;

/* loaded from: classes9.dex */
public final class l extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348567b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348568c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348569d;

    @Override // ot0.h
    public ot0.h a() {
        ot0.l lVar = new ot0.l();
        lVar.f348567b = this.f348567b;
        lVar.f348568c = this.f348568c;
        lVar.f348569d = this.f348569d;
        return lVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q content, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str2 = this.f348569d;
        if (!(str2 == null || r26.n0.N(str2))) {
            sb6.append("<platform_signature>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348569d));
            sb6.append("</platform_signature>");
        }
        java.lang.String str3 = this.f348567b;
        if (!(str3 == null || r26.n0.N(str3))) {
            sb6.append("<thumbdatahash>");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348567b));
            sb6.append("</thumbdatahash>");
        }
        java.lang.String str4 = this.f348568c;
        if (str4 == null || r26.n0.N(str4)) {
            return;
        }
        sb6.append("<hdalbumthumbfilehash>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f348568c));
        sb6.append("</hdalbumthumbfilehash>");
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        this.f348569d = (java.lang.String) values.get(".msg.appmsg.platform_signature");
        this.f348567b = (java.lang.String) values.get(".msg.appmsg.thumbdatahash");
        this.f348568c = (java.lang.String) values.get(".msg.appmsg.hdalbumthumbfilehash");
    }
}
