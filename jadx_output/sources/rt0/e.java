package rt0;

/* loaded from: classes9.dex */
public final class e extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f399377b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f399378c;

    /* renamed from: d, reason: collision with root package name */
    public int f399379d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f399380e;

    @Override // ot0.h
    public ot0.h a() {
        rt0.e eVar = new rt0.e();
        eVar.f399377b = this.f399377b;
        eVar.f399378c = this.f399378c;
        eVar.f399379d = this.f399379d;
        return eVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (this.f399377b != null && sb6 != null) {
            sb6.append("<teenagerModeGuardianTicket>" + this.f399377b + "</teenagerModeGuardianTicket>");
        }
        if (this.f399379d > 0) {
            if (sb6 != null) {
                sb6.append("<teenagerModeTempAccessBizType>" + this.f399379d + "</teenagerModeTempAccessBizType>");
            }
            if (sb6 != null) {
                sb6.append("<teenagerModeTempAccessBizKey>" + this.f399378c + "</teenagerModeTempAccessBizKey>");
            }
            if (sb6 != null) {
                sb6.append("<refermsg>" + this.f399380e + "</refermsg>");
            }
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str;
        this.f399377b = map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeGuardianTicket") : null;
        this.f399379d = com.tencent.mm.sdk.platformtools.t8.P(map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeTempAccessBizType") : null, 0);
        this.f399378c = map != null ? (java.lang.String) map.get(".msg.appmsg.teenagerModeTempAccessBizKey") : null;
        java.lang.String str2 = qVar != null ? qVar.H2 : null;
        try {
            kotlin.jvm.internal.o.d(str2);
            str = str2.substring(r26.n0.L(str2, "<refermsg>", 0, false, 4, null) + 10, r26.n0.P(str2, "</refermsg>", 0, false, 6, null));
            kotlin.jvm.internal.o.f(str, "substring(...)");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        this.f399380e = str;
    }
}
