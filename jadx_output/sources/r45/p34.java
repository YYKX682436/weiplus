package r45;

/* loaded from: classes8.dex */
public class p34 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382697e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382698f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p34)) {
            return false;
        }
        r45.p34 p34Var = (r45.p34) fVar;
        return n51.f.a(this.f382696d, p34Var.f382696d) && n51.f.a(this.f382697e, p34Var.f382697e) && n51.f.a(this.f382698f, p34Var.f382698f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382696d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382697e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382698f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382696d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f382697e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f382698f;
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
        r45.p34 p34Var = (r45.p34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p34Var.f382696d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            p34Var.f382697e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p34Var.f382698f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f382696d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Appid", str, false);
            eVar.d(jSONObject, "Page", this.f382697e, false);
            eVar.d(jSONObject, "Query", this.f382698f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
