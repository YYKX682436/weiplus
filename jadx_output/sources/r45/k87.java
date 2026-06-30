package r45;

/* loaded from: classes7.dex */
public class k87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378496e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378497f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k87)) {
            return false;
        }
        r45.k87 k87Var = (r45.k87) fVar;
        return n51.f.a(this.f378495d, k87Var.f378495d) && n51.f.a(this.f378496e, k87Var.f378496e) && n51.f.a(this.f378497f, k87Var.f378497f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378495d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378496e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378497f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378495d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f378496e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378497f;
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
        r45.k87 k87Var = (r45.k87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k87Var.f378495d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k87Var.f378496e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k87Var.f378497f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f378495d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "user_name", str, false);
            eVar.d(jSONObject, "nick_name", this.f378496e, false);
            eVar.d(jSONObject, "head_url", this.f378497f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
