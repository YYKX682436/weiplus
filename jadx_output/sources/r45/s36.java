package r45;

/* loaded from: classes9.dex */
public class s36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f385475d;

    /* renamed from: e, reason: collision with root package name */
    public int f385476e;

    /* renamed from: f, reason: collision with root package name */
    public int f385477f;

    /* renamed from: g, reason: collision with root package name */
    public float f385478g;

    /* renamed from: h, reason: collision with root package name */
    public int f385479h;

    /* renamed from: i, reason: collision with root package name */
    public int f385480i;

    /* renamed from: m, reason: collision with root package name */
    public float f385481m;

    /* renamed from: n, reason: collision with root package name */
    public float f385482n;

    /* renamed from: o, reason: collision with root package name */
    public int f385483o;

    /* renamed from: p, reason: collision with root package name */
    public int f385484p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s36)) {
            return false;
        }
        r45.s36 s36Var = (r45.s36) fVar;
        return n51.f.a(this.BaseRequest, s36Var.BaseRequest) && n51.f.a(this.f385475d, s36Var.f385475d) && n51.f.a(java.lang.Integer.valueOf(this.f385476e), java.lang.Integer.valueOf(s36Var.f385476e)) && n51.f.a(java.lang.Integer.valueOf(this.f385477f), java.lang.Integer.valueOf(s36Var.f385477f)) && n51.f.a(java.lang.Float.valueOf(this.f385478g), java.lang.Float.valueOf(s36Var.f385478g)) && n51.f.a(java.lang.Integer.valueOf(this.f385479h), java.lang.Integer.valueOf(s36Var.f385479h)) && n51.f.a(java.lang.Integer.valueOf(this.f385480i), java.lang.Integer.valueOf(s36Var.f385480i)) && n51.f.a(java.lang.Float.valueOf(this.f385481m), java.lang.Float.valueOf(s36Var.f385481m)) && n51.f.a(java.lang.Float.valueOf(this.f385482n), java.lang.Float.valueOf(s36Var.f385482n)) && n51.f.a(java.lang.Integer.valueOf(this.f385483o), java.lang.Integer.valueOf(s36Var.f385483o)) && n51.f.a(java.lang.Integer.valueOf(this.f385484p), java.lang.Integer.valueOf(s36Var.f385484p));
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
            r45.cu5 cu5Var = this.f385475d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f385475d.writeFields(fVar);
            }
            fVar.e(3, this.f385476e);
            fVar.e(4, this.f385477f);
            fVar.d(5, this.f385478g);
            fVar.e(6, this.f385479h);
            fVar.e(7, this.f385480i);
            fVar.d(8, this.f385481m);
            fVar.d(9, this.f385482n);
            fVar.e(10, this.f385483o);
            fVar.e(11, this.f385484p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f385475d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f385476e) + b36.f.e(4, this.f385477f) + b36.f.d(5, this.f385478g) + b36.f.e(6, this.f385479h) + b36.f.e(7, this.f385480i) + b36.f.d(8, this.f385481m) + b36.f.d(9, this.f385482n) + b36.f.e(10, this.f385483o) + b36.f.e(11, this.f385484p);
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
        r45.s36 s36Var = (r45.s36) objArr[1];
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
                    s36Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    s36Var.f385475d = cu5Var3;
                }
                return 0;
            case 3:
                s36Var.f385476e = aVar2.g(intValue);
                return 0;
            case 4:
                s36Var.f385477f = aVar2.g(intValue);
                return 0;
            case 5:
                s36Var.f385478g = aVar2.f(intValue);
                return 0;
            case 6:
                s36Var.f385479h = aVar2.g(intValue);
                return 0;
            case 7:
                s36Var.f385480i = aVar2.g(intValue);
                return 0;
            case 8:
                s36Var.f385481m = aVar2.f(intValue);
                return 0;
            case 9:
                s36Var.f385482n = aVar2.f(intValue);
                return 0;
            case 10:
                s36Var.f385483o = aVar2.g(intValue);
                return 0;
            case 11:
                s36Var.f385484p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
