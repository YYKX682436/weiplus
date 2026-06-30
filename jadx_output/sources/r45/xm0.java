package r45;

/* loaded from: classes9.dex */
public class xm0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.an0 f390223d;

    /* renamed from: e, reason: collision with root package name */
    public r45.um0 f390224e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vm0 f390225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390226g;

    /* renamed from: h, reason: collision with root package name */
    public int f390227h;

    /* renamed from: i, reason: collision with root package name */
    public int f390228i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390229m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390230n;

    static {
        new r45.xm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm0)) {
            return false;
        }
        r45.xm0 xm0Var = (r45.xm0) fVar;
        return n51.f.a(this.BaseResponse, xm0Var.BaseResponse) && n51.f.a(this.f390223d, xm0Var.f390223d) && n51.f.a(this.f390224e, xm0Var.f390224e) && n51.f.a(this.f390225f, xm0Var.f390225f) && n51.f.a(this.f390226g, xm0Var.f390226g) && n51.f.a(java.lang.Integer.valueOf(this.f390227h), java.lang.Integer.valueOf(xm0Var.f390227h)) && n51.f.a(java.lang.Integer.valueOf(this.f390228i), java.lang.Integer.valueOf(xm0Var.f390228i)) && n51.f.a(this.f390229m, xm0Var.f390229m) && n51.f.a(java.lang.Boolean.valueOf(this.f390230n), java.lang.Boolean.valueOf(xm0Var.f390230n));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.xm0();
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
            r45.an0 an0Var = this.f390223d;
            if (an0Var != null) {
                fVar.i(2, an0Var.computeSize());
                this.f390223d.writeFields(fVar);
            }
            r45.um0 um0Var = this.f390224e;
            if (um0Var != null) {
                fVar.i(3, um0Var.computeSize());
                this.f390224e.writeFields(fVar);
            }
            r45.vm0 vm0Var = this.f390225f;
            if (vm0Var != null) {
                fVar.i(4, vm0Var.computeSize());
                this.f390225f.writeFields(fVar);
            }
            java.lang.String str = this.f390226g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f390227h);
            fVar.e(7, this.f390228i);
            java.lang.String str2 = this.f390229m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.a(9, this.f390230n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.an0 an0Var2 = this.f390223d;
            if (an0Var2 != null) {
                i18 += b36.f.i(2, an0Var2.computeSize());
            }
            r45.um0 um0Var2 = this.f390224e;
            if (um0Var2 != null) {
                i18 += b36.f.i(3, um0Var2.computeSize());
            }
            r45.vm0 vm0Var2 = this.f390225f;
            if (vm0Var2 != null) {
                i18 += b36.f.i(4, vm0Var2.computeSize());
            }
            java.lang.String str3 = this.f390226g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            int e17 = i18 + b36.f.e(6, this.f390227h) + b36.f.e(7, this.f390228i);
            java.lang.String str4 = this.f390229m;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            return e17 + b36.f.a(9, this.f390230n);
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
                    this.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.an0 an0Var3 = new r45.an0();
                    if (bArr2 != null && bArr2.length > 0) {
                        an0Var3.parseFrom(bArr2);
                    }
                    this.f390223d = an0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.um0 um0Var3 = new r45.um0();
                    if (bArr3 != null && bArr3.length > 0) {
                        um0Var3.parseFrom(bArr3);
                    }
                    this.f390224e = um0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vm0 vm0Var3 = new r45.vm0();
                    if (bArr4 != null && bArr4.length > 0) {
                        vm0Var3.parseFrom(bArr4);
                    }
                    this.f390225f = vm0Var3;
                }
                return 0;
            case 5:
                this.f390226g = aVar2.k(intValue);
                return 0;
            case 6:
                this.f390227h = aVar2.g(intValue);
                return 0;
            case 7:
                this.f390228i = aVar2.g(intValue);
                return 0;
            case 8:
                this.f390229m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f390230n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.xm0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
