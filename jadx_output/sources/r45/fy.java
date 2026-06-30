package r45;

/* loaded from: classes9.dex */
public class fy extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374720d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374721e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yr6 f374722f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374723g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g04 f374724h;

    /* renamed from: i, reason: collision with root package name */
    public r45.g04 f374725i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fy)) {
            return false;
        }
        r45.fy fyVar = (r45.fy) fVar;
        return n51.f.a(this.BaseResponse, fyVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374720d), java.lang.Integer.valueOf(fyVar.f374720d)) && n51.f.a(this.f374721e, fyVar.f374721e) && n51.f.a(this.f374722f, fyVar.f374722f) && n51.f.a(this.f374723g, fyVar.f374723g) && n51.f.a(this.f374724h, fyVar.f374724h) && n51.f.a(this.f374725i, fyVar.f374725i);
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
            fVar.e(2, this.f374720d);
            java.lang.String str = this.f374721e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.yr6 yr6Var = this.f374722f;
            if (yr6Var != null) {
                fVar.i(4, yr6Var.computeSize());
                this.f374722f.writeFields(fVar);
            }
            java.lang.String str2 = this.f374723g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.g04 g04Var = this.f374724h;
            if (g04Var != null) {
                fVar.i(6, g04Var.computeSize());
                this.f374724h.writeFields(fVar);
            }
            r45.g04 g04Var2 = this.f374725i;
            if (g04Var2 != null) {
                fVar.i(7, g04Var2.computeSize());
                this.f374725i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374720d);
            java.lang.String str3 = this.f374721e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.yr6 yr6Var2 = this.f374722f;
            if (yr6Var2 != null) {
                i18 += b36.f.i(4, yr6Var2.computeSize());
            }
            java.lang.String str4 = this.f374723g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            r45.g04 g04Var3 = this.f374724h;
            if (g04Var3 != null) {
                i18 += b36.f.i(6, g04Var3.computeSize());
            }
            r45.g04 g04Var4 = this.f374725i;
            return g04Var4 != null ? i18 + b36.f.i(7, g04Var4.computeSize()) : i18;
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
        r45.fy fyVar = (r45.fy) objArr[1];
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
                    fyVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fyVar.f374720d = aVar2.g(intValue);
                return 0;
            case 3:
                fyVar.f374721e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.yr6 yr6Var3 = new r45.yr6();
                    if (bArr2 != null && bArr2.length > 0) {
                        yr6Var3.parseFrom(bArr2);
                    }
                    fyVar.f374722f = yr6Var3;
                }
                return 0;
            case 5:
                fyVar.f374723g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.g04 g04Var5 = new r45.g04();
                    if (bArr3 != null && bArr3.length > 0) {
                        g04Var5.parseFrom(bArr3);
                    }
                    fyVar.f374724h = g04Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.g04 g04Var6 = new r45.g04();
                    if (bArr4 != null && bArr4.length > 0) {
                        g04Var6.parseFrom(bArr4);
                    }
                    fyVar.f374725i = g04Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
