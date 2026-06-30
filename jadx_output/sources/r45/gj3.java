package r45;

/* loaded from: classes4.dex */
public class gj3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375298d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f375299e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f375300f;

    /* renamed from: g, reason: collision with root package name */
    public int f375301g;

    /* renamed from: h, reason: collision with root package name */
    public int f375302h;

    /* renamed from: i, reason: collision with root package name */
    public int f375303i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f375304m;

    /* renamed from: n, reason: collision with root package name */
    public long f375305n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gj3)) {
            return false;
        }
        r45.gj3 gj3Var = (r45.gj3) fVar;
        return n51.f.a(this.BaseResponse, gj3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f375298d), java.lang.Integer.valueOf(gj3Var.f375298d)) && n51.f.a(this.f375299e, gj3Var.f375299e) && n51.f.a(this.f375300f, gj3Var.f375300f) && n51.f.a(java.lang.Integer.valueOf(this.f375301g), java.lang.Integer.valueOf(gj3Var.f375301g)) && n51.f.a(java.lang.Integer.valueOf(this.f375302h), java.lang.Integer.valueOf(gj3Var.f375302h)) && n51.f.a(java.lang.Integer.valueOf(this.f375303i), java.lang.Integer.valueOf(gj3Var.f375303i)) && n51.f.a(this.f375304m, gj3Var.f375304m) && n51.f.a(java.lang.Long.valueOf(this.f375305n), java.lang.Long.valueOf(gj3Var.f375305n));
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
            fVar.e(2, this.f375298d);
            r45.du5 du5Var = this.f375299e;
            if (du5Var != null) {
                fVar.i(3, du5Var.computeSize());
                this.f375299e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f375300f;
            if (du5Var2 != null) {
                fVar.i(4, du5Var2.computeSize());
                this.f375300f.writeFields(fVar);
            }
            fVar.e(5, this.f375301g);
            fVar.e(6, this.f375302h);
            fVar.e(7, this.f375303i);
            r45.cu5 cu5Var = this.f375304m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f375304m.writeFields(fVar);
            }
            fVar.h(9, this.f375305n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f375298d);
            r45.du5 du5Var3 = this.f375299e;
            if (du5Var3 != null) {
                i18 += b36.f.i(3, du5Var3.computeSize());
            }
            r45.du5 du5Var4 = this.f375300f;
            if (du5Var4 != null) {
                i18 += b36.f.i(4, du5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f375301g) + b36.f.e(6, this.f375302h) + b36.f.e(7, this.f375303i);
            r45.cu5 cu5Var2 = this.f375304m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(8, cu5Var2.computeSize());
            }
            return e17 + b36.f.h(9, this.f375305n);
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
        r45.gj3 gj3Var = (r45.gj3) objArr[1];
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
                    gj3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gj3Var.f375298d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    gj3Var.f375299e = du5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    gj3Var.f375300f = du5Var6;
                }
                return 0;
            case 5:
                gj3Var.f375301g = aVar2.g(intValue);
                return 0;
            case 6:
                gj3Var.f375302h = aVar2.g(intValue);
                return 0;
            case 7:
                gj3Var.f375303i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    gj3Var.f375304m = cu5Var3;
                }
                return 0;
            case 9:
                gj3Var.f375305n = aVar2.i(intValue);
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
            eVar.d(jSONObject, "MsgId", java.lang.Integer.valueOf(this.f375298d), false);
            eVar.d(jSONObject, "FromUserName", this.f375299e, false);
            eVar.d(jSONObject, "ToUserName", this.f375300f, false);
            eVar.d(jSONObject, "TotalLen", java.lang.Integer.valueOf(this.f375301g), false);
            eVar.d(jSONObject, "StartPos", java.lang.Integer.valueOf(this.f375302h), false);
            eVar.d(jSONObject, "DataLen", java.lang.Integer.valueOf(this.f375303i), false);
            eVar.d(jSONObject, "Data", this.f375304m, false);
            eVar.d(jSONObject, "NewMsgId", java.lang.Long.valueOf(this.f375305n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
