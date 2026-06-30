package r45;

/* loaded from: classes2.dex */
public class c55 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371297e;

    /* renamed from: f, reason: collision with root package name */
    public int f371298f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c55)) {
            return false;
        }
        r45.c55 c55Var = (r45.c55) fVar;
        return n51.f.a(this.BaseResponse, c55Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371296d), java.lang.Integer.valueOf(c55Var.f371296d)) && n51.f.a(this.f371297e, c55Var.f371297e) && n51.f.a(java.lang.Integer.valueOf(this.f371298f), java.lang.Integer.valueOf(c55Var.f371298f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f371296d);
            java.lang.String str = this.f371297e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371298f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f371296d);
            java.lang.String str2 = this.f371297e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f371298f);
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
        r45.c55 c55Var = (r45.c55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c55Var.f371296d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                c55Var.f371297e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            c55Var.f371298f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            c55Var.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "CacheExpireTime", java.lang.Integer.valueOf(this.f371296d), false);
            eVar.d(jSONObject, "PassKey", this.f371297e, false);
            eVar.d(jSONObject, "PassKeyValidTime", java.lang.Integer.valueOf(this.f371298f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
