package r45;

/* loaded from: classes4.dex */
public class bp4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370944d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370945e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370946f;

    /* renamed from: g, reason: collision with root package name */
    public int f370947g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp4)) {
            return false;
        }
        r45.bp4 bp4Var = (r45.bp4) fVar;
        return n51.f.a(this.f370944d, bp4Var.f370944d) && n51.f.a(this.f370945e, bp4Var.f370945e) && n51.f.a(this.f370946f, bp4Var.f370946f) && n51.f.a(java.lang.Integer.valueOf(this.f370947g), java.lang.Integer.valueOf(bp4Var.f370947g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370944d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370945e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370946f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f370947g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f370944d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f370945e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f370946f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f370947g);
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
        r45.bp4 bp4Var = (r45.bp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bp4Var.f370944d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bp4Var.f370945e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bp4Var.f370946f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bp4Var.f370947g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f370944d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "plugin_appid", this.f370945e, false);
            eVar.d(jSONObject, "scope", this.f370946f, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f370947g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
