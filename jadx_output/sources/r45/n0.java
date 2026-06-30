package r45;

/* loaded from: classes2.dex */
public class n0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380966d;

    /* renamed from: e, reason: collision with root package name */
    public int f380967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380968f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380969g;

    /* renamed from: h, reason: collision with root package name */
    public int f380970h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n0)) {
            return false;
        }
        r45.n0 n0Var = (r45.n0) fVar;
        return n51.f.a(this.BaseResponse, n0Var.BaseResponse) && n51.f.a(this.f380966d, n0Var.f380966d) && n51.f.a(java.lang.Integer.valueOf(this.f380967e), java.lang.Integer.valueOf(n0Var.f380967e)) && n51.f.a(this.f380968f, n0Var.f380968f) && n51.f.a(this.f380969g, n0Var.f380969g) && n51.f.a(java.lang.Integer.valueOf(this.f380970h), java.lang.Integer.valueOf(n0Var.f380970h));
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
            java.lang.String str = this.f380966d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380967e);
            java.lang.String str2 = this.f380968f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f380969g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f380970h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f380966d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f380967e);
            java.lang.String str5 = this.f380968f;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f380969g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f380970h);
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
        r45.n0 n0Var = (r45.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    n0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                n0Var.f380966d = aVar2.k(intValue);
                return 0;
            case 3:
                n0Var.f380967e = aVar2.g(intValue);
                return 0;
            case 4:
                n0Var.f380968f = aVar2.k(intValue);
                return 0;
            case 5:
                n0Var.f380969g = aVar2.k(intValue);
                return 0;
            case 6:
                n0Var.f380970h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "Json", this.f380966d, false);
            eVar.d(jSONObject, "TimevalSec", java.lang.Integer.valueOf(this.f380967e), false);
            eVar.d(jSONObject, "SearchID", this.f380968f, false);
            eVar.d(jSONObject, "PassKey", this.f380969g, false);
            eVar.d(jSONObject, "PassKeyValidTime", java.lang.Integer.valueOf(this.f380970h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
