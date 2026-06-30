package r45;

/* loaded from: classes8.dex */
public class wz5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389603d;

    /* renamed from: e, reason: collision with root package name */
    public int f389604e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389605f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389606g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz5)) {
            return false;
        }
        r45.wz5 wz5Var = (r45.wz5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389603d), java.lang.Integer.valueOf(wz5Var.f389603d)) && n51.f.a(java.lang.Integer.valueOf(this.f389604e), java.lang.Integer.valueOf(wz5Var.f389604e)) && n51.f.a(this.f389605f, wz5Var.f389605f) && n51.f.a(this.f389606g, wz5Var.f389606g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389603d);
            fVar.e(2, this.f389604e);
            com.tencent.mm.protobuf.g gVar = this.f389605f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389606g;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389603d) + 0 + b36.f.e(2, this.f389604e);
            com.tencent.mm.protobuf.g gVar3 = this.f389605f;
            if (gVar3 != null) {
                e17 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f389606g;
            return gVar4 != null ? e17 + b36.f.b(4, gVar4) : e17;
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
        r45.wz5 wz5Var = (r45.wz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wz5Var.f389603d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wz5Var.f389604e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wz5Var.f389605f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wz5Var.f389606g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f389603d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, valueOf, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f389604e), false);
            eVar.d(jSONObject, "receiver", this.f389605f, false);
            eVar.d(jSONObject, "ticket", this.f389606g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
