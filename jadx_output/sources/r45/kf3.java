package r45;

/* loaded from: classes9.dex */
public class kf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378645d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378646e;

    /* renamed from: f, reason: collision with root package name */
    public int f378647f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f378648g;

    /* renamed from: h, reason: collision with root package name */
    public int f378649h;

    /* renamed from: i, reason: collision with root package name */
    public r45.il6 f378650i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f378651m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378652n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf3)) {
            return false;
        }
        r45.kf3 kf3Var = (r45.kf3) fVar;
        return n51.f.a(this.BaseResponse, kf3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378645d), java.lang.Integer.valueOf(kf3Var.f378645d)) && n51.f.a(this.f378646e, kf3Var.f378646e) && n51.f.a(java.lang.Integer.valueOf(this.f378647f), java.lang.Integer.valueOf(kf3Var.f378647f)) && n51.f.a(java.lang.Boolean.valueOf(this.f378648g), java.lang.Boolean.valueOf(kf3Var.f378648g)) && n51.f.a(java.lang.Integer.valueOf(this.f378649h), java.lang.Integer.valueOf(kf3Var.f378649h)) && n51.f.a(this.f378650i, kf3Var.f378650i) && n51.f.a(java.lang.Boolean.valueOf(this.f378651m), java.lang.Boolean.valueOf(kf3Var.f378651m)) && n51.f.a(java.lang.Boolean.valueOf(this.f378652n), java.lang.Boolean.valueOf(kf3Var.f378652n));
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
            fVar.e(2, this.f378645d);
            java.lang.String str = this.f378646e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f378647f);
            fVar.a(5, this.f378648g);
            fVar.e(6, this.f378649h);
            r45.il6 il6Var = this.f378650i;
            if (il6Var != null) {
                fVar.i(7, il6Var.computeSize());
                this.f378650i.writeFields(fVar);
            }
            fVar.a(8, this.f378651m);
            fVar.a(9, this.f378652n);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f378645d);
            java.lang.String str2 = this.f378646e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f378647f) + b36.f.a(5, this.f378648g) + b36.f.e(6, this.f378649h);
            r45.il6 il6Var2 = this.f378650i;
            if (il6Var2 != null) {
                e17 += b36.f.i(7, il6Var2.computeSize());
            }
            return e17 + b36.f.a(8, this.f378651m) + b36.f.a(9, this.f378652n);
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
        r45.kf3 kf3Var = (r45.kf3) objArr[1];
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
                    kf3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                kf3Var.f378645d = aVar2.g(intValue);
                return 0;
            case 3:
                kf3Var.f378646e = aVar2.k(intValue);
                return 0;
            case 4:
                kf3Var.f378647f = aVar2.g(intValue);
                return 0;
            case 5:
                kf3Var.f378648g = aVar2.c(intValue);
                return 0;
            case 6:
                kf3Var.f378649h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.il6 il6Var3 = new r45.il6();
                    if (bArr2 != null && bArr2.length > 0) {
                        il6Var3.parseFrom(bArr2);
                    }
                    kf3Var.f378650i = il6Var3;
                }
                return 0;
            case 8:
                kf3Var.f378651m = aVar2.c(intValue);
                return 0;
            case 9:
                kf3Var.f378652n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
