package r45;

/* loaded from: classes4.dex */
public class a14 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369641d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f369642e;

    /* renamed from: f, reason: collision with root package name */
    public int f369643f;

    /* renamed from: g, reason: collision with root package name */
    public int f369644g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a14)) {
            return false;
        }
        r45.a14 a14Var = (r45.a14) fVar;
        return n51.f.a(this.f369641d, a14Var.f369641d) && n51.f.a(java.lang.Boolean.valueOf(this.f369642e), java.lang.Boolean.valueOf(a14Var.f369642e)) && n51.f.a(java.lang.Integer.valueOf(this.f369643f), java.lang.Integer.valueOf(a14Var.f369643f)) && n51.f.a(java.lang.Integer.valueOf(this.f369644g), java.lang.Integer.valueOf(a14Var.f369644g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369641d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f369642e);
            fVar.e(3, this.f369643f);
            fVar.e(4, this.f369644g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f369641d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f369642e) + b36.f.e(3, this.f369643f) + b36.f.e(4, this.f369644g);
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
        r45.a14 a14Var = (r45.a14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a14Var.f369641d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            a14Var.f369642e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            a14Var.f369643f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        a14Var.f369644g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f369641d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "itemKey", str, false);
            eVar.d(jSONObject, "need_report", java.lang.Boolean.valueOf(this.f369642e), false);
            eVar.d(jSONObject, "interval_ms", java.lang.Integer.valueOf(this.f369643f), false);
            eVar.d(jSONObject, "middle_action_type", java.lang.Integer.valueOf(this.f369644g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
