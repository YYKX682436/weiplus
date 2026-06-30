package r45;

/* loaded from: classes4.dex */
public class wl5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389258d;

    /* renamed from: e, reason: collision with root package name */
    public int f389259e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389260f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wl5)) {
            return false;
        }
        r45.wl5 wl5Var = (r45.wl5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389258d), java.lang.Integer.valueOf(wl5Var.f389258d)) && n51.f.a(java.lang.Integer.valueOf(this.f389259e), java.lang.Integer.valueOf(wl5Var.f389259e)) && n51.f.a(this.f389260f, wl5Var.f389260f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389258d);
            fVar.e(2, this.f389259e);
            com.tencent.mm.protobuf.g gVar = this.f389260f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389258d) + 0 + b36.f.e(2, this.f389259e);
            com.tencent.mm.protobuf.g gVar2 = this.f389260f;
            return gVar2 != null ? e17 + b36.f.b(3, gVar2) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.wl5 wl5Var = (r45.wl5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wl5Var.f389258d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wl5Var.f389259e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wl5Var.f389260f = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f389258d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, valueOf, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f389259e), false);
            eVar.d(jSONObject, "sender", this.f389260f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
