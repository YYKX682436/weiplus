package r45;

/* loaded from: classes9.dex */
public class l extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379051d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379052e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379053f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379054g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f379055h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f379056i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l)) {
            return false;
        }
        r45.l lVar = (r45.l) fVar;
        return n51.f.a(this.BaseResponse, lVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379051d), java.lang.Integer.valueOf(lVar.f379051d)) && n51.f.a(this.f379052e, lVar.f379052e) && n51.f.a(this.f379053f, lVar.f379053f) && n51.f.a(this.f379054g, lVar.f379054g) && n51.f.a(this.f379055h, lVar.f379055h) && n51.f.a(this.f379056i, lVar.f379056i);
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
            fVar.e(2, this.f379051d);
            java.lang.String str = this.f379052e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379053f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f379054g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g0 g0Var = this.f379055h;
            if (g0Var != null) {
                fVar.i(6, g0Var.computeSize());
                this.f379055h.writeFields(fVar);
            }
            r45.a aVar = this.f379056i;
            if (aVar != null) {
                fVar.i(7, aVar.computeSize());
                this.f379056i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379051d);
            java.lang.String str4 = this.f379052e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f379053f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f379054g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g0 g0Var2 = this.f379055h;
            if (g0Var2 != null) {
                i18 += b36.f.i(6, g0Var2.computeSize());
            }
            r45.a aVar2 = this.f379056i;
            return aVar2 != null ? i18 + b36.f.i(7, aVar2.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.l lVar = (r45.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    lVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lVar.f379051d = aVar4.g(intValue);
                return 0;
            case 3:
                lVar.f379052e = aVar4.k(intValue);
                return 0;
            case 4:
                lVar.f379053f = aVar4.k(intValue);
                return 0;
            case 5:
                lVar.f379054g = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g0 g0Var3 = new r45.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var3.parseFrom(bArr2);
                    }
                    lVar.f379055h = g0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.parseFrom(bArr3);
                    }
                    lVar.f379056i = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
