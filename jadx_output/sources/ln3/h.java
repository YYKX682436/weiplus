package ln3;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f319900a = jz5.h.b(ln3.g.f319899d);

    public final java.lang.String a(r45.vs2 vs2Var, r45.f03 f03Var) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "createBase64CoverRedDotInfo() called with: ctrlInfo = " + vs2Var + ", showInfo = " + f03Var);
            kn3.a aVar = new kn3.a();
            java.lang.String str = vs2Var != null ? vs2Var.f388490h : null;
            if (str == null) {
                str = "";
            }
            aVar.s(str);
            aVar.k(vs2Var != null ? vs2Var.f388487e : 0);
            aVar.n(f03Var.f373888e);
            if (vs2Var != null) {
                r45.xs2 xs2Var = new r45.xs2();
                com.tencent.mm.protobuf.g gVar = vs2Var.f388488f;
                xs2Var.parseFrom(gVar != null ? gVar.f192156a : null);
                aVar.o(pm0.v.u(xs2Var.getLong(3)));
            }
            java.lang.String str2 = vs2Var != null ? vs2Var.f388499t : null;
            if (str2 == null) {
                str2 = "";
            }
            aVar.l(str2);
            java.lang.String str3 = f03Var.f373893m;
            if (str3 == null) {
                str3 = "";
            }
            aVar.p(str3);
            java.lang.String str4 = f03Var.f373892i;
            if (str4 == null) {
                str4 = "";
            }
            aVar.q(str4);
            aVar.r(f03Var.f373887d);
            aVar.j(vs2Var != null ? vs2Var.f388505z : 0);
            java.lang.String jSONObject = aVar.toJson().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeSyncHandler", "createBase64CoverRedDotInfo: ".concat(jSONObject));
            byte[] bytes = jSONObject.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewLife.NewLifeSyncHandler", e17, "createBase64CoverRedDotInfo exception", new java.lang.Object[0]);
            return "";
        }
    }
}
