package r45;

/* loaded from: classes8.dex */
public class f64 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374037d;

    /* renamed from: e, reason: collision with root package name */
    public float f374038e;

    /* renamed from: f, reason: collision with root package name */
    public float f374039f;

    /* renamed from: g, reason: collision with root package name */
    public int f374040g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374041h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374042i;

    /* renamed from: m, reason: collision with root package name */
    public int f374043m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f374044n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f374045o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f64)) {
            return false;
        }
        r45.f64 f64Var = (r45.f64) fVar;
        return n51.f.a(this.BaseRequest, f64Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374037d), java.lang.Integer.valueOf(f64Var.f374037d)) && n51.f.a(java.lang.Float.valueOf(this.f374038e), java.lang.Float.valueOf(f64Var.f374038e)) && n51.f.a(java.lang.Float.valueOf(this.f374039f), java.lang.Float.valueOf(f64Var.f374039f)) && n51.f.a(java.lang.Integer.valueOf(this.f374040g), java.lang.Integer.valueOf(f64Var.f374040g)) && n51.f.a(this.f374041h, f64Var.f374041h) && n51.f.a(this.f374042i, f64Var.f374042i) && n51.f.a(java.lang.Integer.valueOf(this.f374043m), java.lang.Integer.valueOf(f64Var.f374043m)) && n51.f.a(this.f374044n, f64Var.f374044n) && n51.f.a(this.f374045o, f64Var.f374045o);
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
            fVar.e(2, this.f374037d);
            fVar.d(3, this.f374038e);
            fVar.d(4, this.f374039f);
            fVar.e(5, this.f374040g);
            java.lang.String str = this.f374041h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f374042i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f374043m);
            r45.cu5 cu5Var = this.f374044n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.computeSize());
                this.f374044n.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f374045o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.computeSize());
                this.f374045o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374037d) + b36.f.d(3, this.f374038e) + b36.f.d(4, this.f374039f) + b36.f.e(5, this.f374040g);
            java.lang.String str3 = this.f374041h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f374042i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            int e17 = i18 + b36.f.e(8, this.f374043m);
            r45.cu5 cu5Var3 = this.f374044n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(9, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f374045o;
            return cu5Var4 != null ? e17 + b36.f.i(10, cu5Var4.computeSize()) : e17;
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
        r45.f64 f64Var = (r45.f64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    f64Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f64Var.f374037d = aVar2.g(intValue);
                return 0;
            case 3:
                f64Var.f374038e = aVar2.f(intValue);
                return 0;
            case 4:
                f64Var.f374039f = aVar2.f(intValue);
                return 0;
            case 5:
                f64Var.f374040g = aVar2.g(intValue);
                return 0;
            case 6:
                f64Var.f374041h = aVar2.k(intValue);
                return 0;
            case 7:
                f64Var.f374042i = aVar2.k(intValue);
                return 0;
            case 8:
                f64Var.f374043m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    f64Var.f374044n = cu5Var5;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    f64Var.f374045o = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
