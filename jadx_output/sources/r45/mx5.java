package r45;

/* loaded from: classes4.dex */
public class mx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380898e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r44 f380899f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx5)) {
            return false;
        }
        r45.mx5 mx5Var = (r45.mx5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380897d), java.lang.Integer.valueOf(mx5Var.f380897d)) && n51.f.a(this.f380898e, mx5Var.f380898e) && n51.f.a(this.f380899f, mx5Var.f380899f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380897d);
            java.lang.String str = this.f380898e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.r44 r44Var = this.f380899f;
            if (r44Var != null) {
                fVar.i(4, r44Var.computeSize());
                this.f380899f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380897d) + 0;
            java.lang.String str2 = this.f380898e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.r44 r44Var2 = this.f380899f;
            return r44Var2 != null ? e17 + b36.f.i(4, r44Var2.computeSize()) : e17;
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
        r45.mx5 mx5Var = (r45.mx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mx5Var.f380897d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mx5Var.f380898e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.r44 r44Var3 = new r45.r44();
            if (bArr != null && bArr.length > 0) {
                r44Var3.parseFrom(bArr);
            }
            mx5Var.f380899f = r44Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f380897d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "Query", this.f380898e, false);
            eVar.d(jSONObject, "kv_list", this.f380899f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
