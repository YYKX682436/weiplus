package r45;

/* loaded from: classes8.dex */
public class l50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379146f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l50)) {
            return false;
        }
        r45.l50 l50Var = (r45.l50) fVar;
        return n51.f.a(this.f379144d, l50Var.f379144d) && n51.f.a(this.f379145e, l50Var.f379145e) && n51.f.a(this.f379146f, l50Var.f379146f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379144d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379145e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379146f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f379144d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f379145e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f379146f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.l50 l50Var = (r45.l50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l50Var.f379144d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l50Var.f379145e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l50Var.f379146f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f379144d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "appId", str, false);
            eVar.d(jSONObject, "appName", this.f379145e, false);
            eVar.d(jSONObject, "version", this.f379146f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
