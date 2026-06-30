package hb2;

/* loaded from: classes8.dex */
public final class n0 implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f280074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280075c;

    public n0(java.lang.String str, zy2.gc gcVar, java.lang.String str2) {
        this.f280073a = str;
        this.f280074b = gcVar;
        this.f280075c = str2;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        zy2.gc gcVar = this.f280074b;
        java.lang.String str = this.f280075c;
        hb2.s0 s0Var = hb2.s0.f280090e;
        s0Var.getClass();
        java.lang.String str2 = hb2.s0.f280091f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload head img action cdn ");
        com.tencent.mm.modelcdntran.m1 m1Var = event.f71103a;
        sb6.append(m1Var);
        sb6.append(" ret ");
        sb6.append(event.f71105c);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (m1Var == com.tencent.mm.modelcdntran.m1.f71079h) {
            dn.h hVar = event.f71108f;
            java.lang.String str3 = hVar != null ? hVar.field_fileUrl : null;
            boolean z17 = str3 == null || str3.length() == 0;
            java.lang.String str4 = this.f280073a;
            if (z17 || str4 == null) {
                s0Var.getClass();
                hb2.r0 r0Var = new hb2.r0(gcVar);
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                cq.j1.j((cq.k) c17, str, 2, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new hb2.p0(str4, r0Var, gcVar), (r18 & 64) != 0 ? null : new hb2.q0(r0Var));
                return;
            }
            r45.ri2 ri2Var = new r45.ri2();
            dn.h hVar2 = event.f71108f;
            kotlin.jvm.internal.o.d(hVar2);
            ri2Var.set(3, hVar2.field_fileUrl);
            pm0.v.X(hb2.m0.f280071d);
            hb2.w0.a(s0Var, str4, ri2Var, gcVar, false, false, null, 56, null);
        }
    }
}
