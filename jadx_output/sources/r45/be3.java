package r45;

/* loaded from: classes4.dex */
public class be3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370687d;

    /* renamed from: e, reason: collision with root package name */
    public int f370688e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f370689f;

    /* renamed from: g, reason: collision with root package name */
    public int f370690g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370691h;

    /* renamed from: i, reason: collision with root package name */
    public int f370692i;

    /* renamed from: m, reason: collision with root package name */
    public long f370693m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370694n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370695o;

    static {
        new r45.be3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.be3)) {
            return false;
        }
        r45.be3 be3Var = (r45.be3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370687d), java.lang.Integer.valueOf(be3Var.f370687d)) && n51.f.a(java.lang.Integer.valueOf(this.f370688e), java.lang.Integer.valueOf(be3Var.f370688e)) && n51.f.a(this.f370689f, be3Var.f370689f) && n51.f.a(java.lang.Integer.valueOf(this.f370690g), java.lang.Integer.valueOf(be3Var.f370690g)) && n51.f.a(this.f370691h, be3Var.f370691h) && n51.f.a(java.lang.Integer.valueOf(this.f370692i), java.lang.Integer.valueOf(be3Var.f370692i)) && n51.f.a(java.lang.Long.valueOf(this.f370693m), java.lang.Long.valueOf(be3Var.f370693m)) && n51.f.a(java.lang.Boolean.valueOf(this.f370694n), java.lang.Boolean.valueOf(be3Var.f370694n)) && n51.f.a(this.f370695o, be3Var.f370695o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.be3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370687d);
            fVar.e(2, this.f370688e);
            r45.cu5 cu5Var = this.f370689f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f370689f.writeFields(fVar);
            }
            fVar.e(4, this.f370690g);
            java.lang.String str = this.f370691h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f370692i);
            fVar.h(7, this.f370693m);
            fVar.a(8, this.f370694n);
            com.tencent.mm.protobuf.g gVar = this.f370695o;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370687d) + 0 + b36.f.e(2, this.f370688e);
            r45.cu5 cu5Var2 = this.f370689f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f370690g);
            java.lang.String str2 = this.f370691h;
            if (str2 != null) {
                e18 += b36.f.j(5, str2);
            }
            int e19 = e18 + b36.f.e(6, this.f370692i) + b36.f.h(7, this.f370693m) + b36.f.a(8, this.f370694n);
            com.tencent.mm.protobuf.g gVar2 = this.f370695o;
            return gVar2 != null ? e19 + b36.f.b(9, gVar2) : e19;
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
                this.f370687d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f370688e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f370689f = cu5Var3;
                }
                return 0;
            case 4:
                this.f370690g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f370691h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f370692i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f370693m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f370694n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f370695o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.be3) super.parseFrom(bArr);
    }
}
