package r45;

/* loaded from: classes4.dex */
public class oz4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382623d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382625f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382626g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ka5 f382627h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f382628i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f382629m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oz4)) {
            return false;
        }
        r45.oz4 oz4Var = (r45.oz4) fVar;
        return n51.f.a(this.BaseResponse, oz4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382623d), java.lang.Integer.valueOf(oz4Var.f382623d)) && n51.f.a(this.f382624e, oz4Var.f382624e) && n51.f.a(this.f382625f, oz4Var.f382625f) && n51.f.a(this.f382626g, oz4Var.f382626g) && n51.f.a(this.f382627h, oz4Var.f382627h) && n51.f.a(java.lang.Boolean.valueOf(this.f382628i), java.lang.Boolean.valueOf(oz4Var.f382628i)) && n51.f.a(java.lang.Boolean.valueOf(this.f382629m), java.lang.Boolean.valueOf(oz4Var.f382629m));
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
            fVar.e(2, this.f382623d);
            java.lang.String str = this.f382624e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f382625f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f382626g;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ka5 ka5Var = this.f382627h;
            if (ka5Var != null) {
                fVar.i(8, ka5Var.computeSize());
                this.f382627h.writeFields(fVar);
            }
            fVar.a(9, this.f382628i);
            fVar.a(10, this.f382629m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382623d);
            java.lang.String str4 = this.f382624e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f382625f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f382626g;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            r45.ka5 ka5Var2 = this.f382627h;
            if (ka5Var2 != null) {
                i18 += b36.f.i(8, ka5Var2.computeSize());
            }
            return i18 + b36.f.a(9, this.f382628i) + b36.f.a(10, this.f382629m);
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
        r45.oz4 oz4Var = (r45.oz4) objArr[1];
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
                    oz4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                oz4Var.f382623d = aVar2.g(intValue);
                return 0;
            case 3:
                oz4Var.f382624e = aVar2.k(intValue);
                return 0;
            case 4:
                oz4Var.f382625f = aVar2.k(intValue);
                return 0;
            case 5:
            case 6:
            default:
                return -1;
            case 7:
                oz4Var.f382626g = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ka5Var3.parseFrom(bArr2);
                    }
                    oz4Var.f382627h = ka5Var3;
                }
                return 0;
            case 9:
                oz4Var.f382628i = aVar2.c(intValue);
                return 0;
            case 10:
                oz4Var.f382629m = aVar2.c(intValue);
                return 0;
        }
    }
}
