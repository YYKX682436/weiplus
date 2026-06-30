package r45;

/* loaded from: classes4.dex */
public class ch0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371550e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f371551f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371552g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ch0)) {
            return false;
        }
        r45.ch0 ch0Var = (r45.ch0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371549d), java.lang.Integer.valueOf(ch0Var.f371549d)) && n51.f.a(this.f371550e, ch0Var.f371550e) && n51.f.a(java.lang.Boolean.valueOf(this.f371551f), java.lang.Boolean.valueOf(ch0Var.f371551f)) && n51.f.a(this.f371552g, ch0Var.f371552g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371549d);
            java.lang.String str = this.f371550e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f371551f);
            java.lang.String str2 = this.f371552g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371549d) + 0;
            java.lang.String str3 = this.f371550e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int a17 = e17 + b36.f.a(3, this.f371551f);
            java.lang.String str4 = this.f371552g;
            return str4 != null ? a17 + b36.f.j(4, str4) : a17;
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
        r45.ch0 ch0Var = (r45.ch0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ch0Var.f371549d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ch0Var.f371550e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ch0Var.f371551f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ch0Var.f371552g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371549d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "live_status", valueOf, false);
            eVar.d(jSONObject, "description", this.f371550e, false);
            eVar.d(jSONObject, "is_violation", java.lang.Boolean.valueOf(this.f371551f), false);
            eVar.d(jSONObject, "export_id", this.f371552g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
