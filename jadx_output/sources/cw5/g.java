package cw5;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f224357d;

    /* renamed from: e, reason: collision with root package name */
    public int f224358e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224359f;

    /* renamed from: g, reason: collision with root package name */
    public long f224360g;

    /* renamed from: h, reason: collision with root package name */
    public int f224361h;

    /* renamed from: i, reason: collision with root package name */
    public int f224362i;

    /* renamed from: m, reason: collision with root package name */
    public int f224363m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224364n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f224365o = new boolean[9];

    static {
        new cw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.g)) {
            return false;
        }
        cw5.g gVar = (cw5.g) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f224357d), java.lang.Integer.valueOf(gVar.f224357d)) && n51.f.a(java.lang.Integer.valueOf(this.f224358e), java.lang.Integer.valueOf(gVar.f224358e)) && n51.f.a(this.f224359f, gVar.f224359f) && n51.f.a(java.lang.Long.valueOf(this.f224360g), java.lang.Long.valueOf(gVar.f224360g)) && n51.f.a(java.lang.Integer.valueOf(this.f224361h), java.lang.Integer.valueOf(gVar.f224361h)) && n51.f.a(java.lang.Integer.valueOf(this.f224362i), java.lang.Integer.valueOf(gVar.f224362i)) && n51.f.a(java.lang.Integer.valueOf(this.f224363m), java.lang.Integer.valueOf(gVar.f224363m)) && n51.f.a(java.lang.Boolean.valueOf(this.f224364n), java.lang.Boolean.valueOf(gVar.f224364n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new cw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f224365o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f224357d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f224358e);
            }
            java.lang.String str = this.f224359f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f224360g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f224361h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f224362i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f224363m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f224364n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f224357d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f224358e);
            }
            java.lang.String str2 = this.f224359f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f224360g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f224361h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f224362i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f224363m);
            }
            return zArr[8] ? e17 + b36.f.a(8, this.f224364n) : e17;
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
                this.f224357d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f224358e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f224359f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f224360g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f224361h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f224362i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f224363m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f224364n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (cw5.g) super.parseFrom(bArr);
    }
}
