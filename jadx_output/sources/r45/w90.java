package r45;

/* loaded from: classes4.dex */
public class w90 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f388978d;

    /* renamed from: e, reason: collision with root package name */
    public int f388979e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f388980f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f388981g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f388982h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388983i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388984m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w90)) {
            return false;
        }
        r45.w90 w90Var = (r45.w90) fVar;
        return n51.f.a(this.BaseRequest, w90Var.BaseRequest) && n51.f.a(this.f388978d, w90Var.f388978d) && n51.f.a(java.lang.Integer.valueOf(this.f388979e), java.lang.Integer.valueOf(w90Var.f388979e)) && n51.f.a(this.f388980f, w90Var.f388980f) && n51.f.a(java.lang.Integer.valueOf(this.f388981g), java.lang.Integer.valueOf(w90Var.f388981g)) && n51.f.a(this.f388982h, w90Var.f388982h) && n51.f.a(this.f388983i, w90Var.f388983i) && n51.f.a(this.f388984m, w90Var.f388984m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.du5 du5Var = this.f388978d;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f388978d.writeFields(fVar);
            }
            fVar.e(3, this.f388979e);
            fVar.g(4, 8, this.f388980f);
            fVar.e(5, this.f388981g);
            r45.cu5 cu5Var = this.f388982h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f388982h.writeFields(fVar);
            }
            java.lang.String str = this.f388983i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f388984m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.du5 du5Var2 = this.f388978d;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f388979e) + b36.f.g(4, 8, this.f388980f) + b36.f.e(5, this.f388981g);
            r45.cu5 cu5Var2 = this.f388982h;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.computeSize());
            }
            java.lang.String str3 = this.f388983i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f388984m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388980f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.w90 w90Var = (r45.w90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    w90Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    w90Var.f388978d = du5Var3;
                }
                return 0;
            case 3:
                w90Var.f388979e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.kk4 kk4Var = new r45.kk4();
                    if (bArr4 != null && bArr4.length > 0) {
                        kk4Var.parseFrom(bArr4);
                    }
                    w90Var.f388980f.add(kk4Var);
                }
                return 0;
            case 5:
                w90Var.f388981g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var3.b(bArr5);
                    }
                    w90Var.f388982h = cu5Var3;
                }
                return 0;
            case 7:
                w90Var.f388983i = aVar2.k(intValue);
                return 0;
            case 8:
                w90Var.f388984m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
