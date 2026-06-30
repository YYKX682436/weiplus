package r45;

/* loaded from: classes4.dex */
public class kz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379048d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379049e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379050f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kz6)) {
            return false;
        }
        r45.kz6 kz6Var = (r45.kz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379048d), java.lang.Integer.valueOf(kz6Var.f379048d)) && n51.f.a(this.f379049e, kz6Var.f379049e) && n51.f.a(this.f379050f, kz6Var.f379050f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379048d);
            java.lang.String str = this.f379049e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379050f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379048d) + 0;
            java.lang.String str3 = this.f379049e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f379050f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.kz6 kz6Var = (r45.kz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kz6Var.f379048d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            kz6Var.f379049e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        kz6Var.f379050f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f379048d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "duration", valueOf, false);
            eVar.d(jSONObject, "thumbPath", this.f379049e, false);
            eVar.d(jSONObject, "remuxPath", this.f379050f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
