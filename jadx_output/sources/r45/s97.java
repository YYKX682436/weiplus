package r45;

/* loaded from: classes2.dex */
public class s97 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385585d;

    /* renamed from: e, reason: collision with root package name */
    public int f385586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385587f;

    /* renamed from: g, reason: collision with root package name */
    public r45.dk5 f385588g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bk5 f385589h;

    /* renamed from: i, reason: collision with root package name */
    public int f385590i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s97)) {
            return false;
        }
        r45.s97 s97Var = (r45.s97) fVar;
        return n51.f.a(this.BaseResponse, s97Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385585d), java.lang.Integer.valueOf(s97Var.f385585d)) && n51.f.a(java.lang.Integer.valueOf(this.f385586e), java.lang.Integer.valueOf(s97Var.f385586e)) && n51.f.a(this.f385587f, s97Var.f385587f) && n51.f.a(this.f385588g, s97Var.f385588g) && n51.f.a(this.f385589h, s97Var.f385589h) && n51.f.a(java.lang.Integer.valueOf(this.f385590i), java.lang.Integer.valueOf(s97Var.f385590i));
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
            fVar.e(2, this.f385585d);
            fVar.e(3, this.f385586e);
            java.lang.String str = this.f385587f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.dk5 dk5Var = this.f385588g;
            if (dk5Var != null) {
                fVar.i(5, dk5Var.computeSize());
                this.f385588g.writeFields(fVar);
            }
            r45.bk5 bk5Var = this.f385589h;
            if (bk5Var != null) {
                fVar.i(6, bk5Var.computeSize());
                this.f385589h.writeFields(fVar);
            }
            fVar.e(7, this.f385590i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385585d) + b36.f.e(3, this.f385586e);
            java.lang.String str2 = this.f385587f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.dk5 dk5Var2 = this.f385588g;
            if (dk5Var2 != null) {
                i18 += b36.f.i(5, dk5Var2.computeSize());
            }
            r45.bk5 bk5Var2 = this.f385589h;
            if (bk5Var2 != null) {
                i18 += b36.f.i(6, bk5Var2.computeSize());
            }
            return i18 + b36.f.e(7, this.f385590i);
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
        r45.s97 s97Var = (r45.s97) objArr[1];
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
                    s97Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                s97Var.f385585d = aVar2.g(intValue);
                return 0;
            case 3:
                s97Var.f385586e = aVar2.g(intValue);
                return 0;
            case 4:
                s97Var.f385587f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.dk5 dk5Var3 = new r45.dk5();
                    if (bArr2 != null && bArr2.length > 0) {
                        dk5Var3.parseFrom(bArr2);
                    }
                    s97Var.f385588g = dk5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bk5 bk5Var3 = new r45.bk5();
                    if (bArr3 != null && bArr3.length > 0) {
                        bk5Var3.parseFrom(bArr3);
                    }
                    s97Var.f385589h = bk5Var3;
                }
                return 0;
            case 7:
                s97Var.f385590i = aVar2.g(intValue);
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
            eVar.d(jSONObject, "UpdateCode", java.lang.Integer.valueOf(this.f385585d), false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f385586e), false);
            eVar.d(jSONObject, "Json", this.f385587f, false);
            eVar.d(jSONObject, "Plugin", this.f385588g, false);
            eVar.d(jSONObject, "ClientCache", this.f385589h, false);
            eVar.d(jSONObject, "RedDotTimeStamp", java.lang.Integer.valueOf(this.f385590i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
