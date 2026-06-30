package r45;

/* loaded from: classes11.dex */
public class tl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.fp4 f386543d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dw6 f386544e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tl3)) {
            return false;
        }
        r45.tl3 tl3Var = (r45.tl3) fVar;
        return n51.f.a(this.BaseResponse, tl3Var.BaseResponse) && n51.f.a(this.f386543d, tl3Var.f386543d) && n51.f.a(this.f386544e, tl3Var.f386544e);
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
            r45.fp4 fp4Var = this.f386543d;
            if (fp4Var != null) {
                fVar.i(2, fp4Var.computeSize());
                this.f386543d.writeFields(fVar);
            }
            r45.dw6 dw6Var = this.f386544e;
            if (dw6Var != null) {
                fVar.i(3, dw6Var.computeSize());
                this.f386544e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.fp4 fp4Var2 = this.f386543d;
            if (fp4Var2 != null) {
                i18 += b36.f.i(2, fp4Var2.computeSize());
            }
            r45.dw6 dw6Var2 = this.f386544e;
            return dw6Var2 != null ? i18 + b36.f.i(3, dw6Var2.computeSize()) : i18;
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
        r45.tl3 tl3Var = (r45.tl3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                tl3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.fp4 fp4Var3 = new r45.fp4();
                if (bArr2 != null && bArr2.length > 0) {
                    fp4Var3.parseFrom(bArr2);
                }
                tl3Var.f386543d = fp4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.dw6 dw6Var3 = new r45.dw6();
            if (bArr3 != null && bArr3.length > 0) {
                dw6Var3.parseFrom(bArr3);
            }
            tl3Var.f386544e = dw6Var3;
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
            eVar.d(jSONObject, "UserInfo", this.f386543d, false);
            eVar.d(jSONObject, "UserInfoExt", this.f386544e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
