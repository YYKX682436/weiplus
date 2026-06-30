package r45;

/* loaded from: classes8.dex */
public class g27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374845f;

    /* renamed from: g, reason: collision with root package name */
    public int f374846g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g27)) {
            return false;
        }
        r45.g27 g27Var = (r45.g27) fVar;
        return n51.f.a(this.f374843d, g27Var.f374843d) && n51.f.a(this.f374844e, g27Var.f374844e) && n51.f.a(this.f374845f, g27Var.f374845f) && n51.f.a(java.lang.Integer.valueOf(this.f374846g), java.lang.Integer.valueOf(g27Var.f374846g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374843d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374844e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374845f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f374846g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374843d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f374844e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f374845f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f374846g);
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
        r45.g27 g27Var = (r45.g27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g27Var.f374843d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g27Var.f374844e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g27Var.f374845f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g27Var.f374846g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374843d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "template_id", str, false);
            eVar.d(jSONObject, "template_theme_name", this.f374844e, false);
            eVar.d(jSONObject, "template_calling_role", this.f374845f, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f374846g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
