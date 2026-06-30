package r45;

/* loaded from: classes9.dex */
public class n extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380960d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380961e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380962f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380963g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g0 f380964h;

    /* renamed from: i, reason: collision with root package name */
    public r45.a f380965i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n)) {
            return false;
        }
        r45.n nVar = (r45.n) fVar;
        return n51.f.a(this.BaseResponse, nVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f380960d), java.lang.Integer.valueOf(nVar.f380960d)) && n51.f.a(this.f380961e, nVar.f380961e) && n51.f.a(this.f380962f, nVar.f380962f) && n51.f.a(this.f380963g, nVar.f380963g) && n51.f.a(this.f380964h, nVar.f380964h) && n51.f.a(this.f380965i, nVar.f380965i);
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
            fVar.e(2, this.f380960d);
            java.lang.String str = this.f380961e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380962f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f380963g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.g0 g0Var = this.f380964h;
            if (g0Var != null) {
                fVar.i(7, g0Var.computeSize());
                this.f380964h.writeFields(fVar);
            }
            r45.a aVar = this.f380965i;
            if (aVar != null) {
                fVar.i(8, aVar.computeSize());
                this.f380965i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f380960d);
            java.lang.String str4 = this.f380961e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f380962f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f380963g;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.g0 g0Var2 = this.f380964h;
            if (g0Var2 != null) {
                i18 += b36.f.i(7, g0Var2.computeSize());
            }
            r45.a aVar2 = this.f380965i;
            return aVar2 != null ? i18 + b36.f.i(8, aVar2.computeSize()) : i18;
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
        r45.n nVar = (r45.n) objArr[1];
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
                    nVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                nVar.f380960d = aVar4.g(intValue);
                return 0;
            case 3:
                nVar.f380961e = aVar4.k(intValue);
                return 0;
            case 4:
                nVar.f380962f = aVar4.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                nVar.f380963g = aVar4.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g0 g0Var3 = new r45.g0();
                    if (bArr2 != null && bArr2.length > 0) {
                        g0Var3.parseFrom(bArr2);
                    }
                    nVar.f380964h = g0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.parseFrom(bArr3);
                    }
                    nVar.f380965i = aVar5;
                }
                return 0;
        }
    }
}
