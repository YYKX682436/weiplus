package dw5;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f244299d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f244300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f244301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f244302g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f244304i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f244305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f244306n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f244307o;

    /* renamed from: p, reason: collision with root package name */
    public int f244308p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f244309q = new boolean[11];

    static {
        new dw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.a)) {
            return false;
        }
        dw5.a aVar = (dw5.a) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f244299d), java.lang.Boolean.valueOf(aVar.f244299d)) && n51.f.a(java.lang.Boolean.valueOf(this.f244300e), java.lang.Boolean.valueOf(aVar.f244300e)) && n51.f.a(java.lang.Boolean.valueOf(this.f244301f), java.lang.Boolean.valueOf(aVar.f244301f)) && n51.f.a(java.lang.Boolean.valueOf(this.f244302g), java.lang.Boolean.valueOf(aVar.f244302g)) && n51.f.a(java.lang.Boolean.valueOf(this.f244303h), java.lang.Boolean.valueOf(aVar.f244303h)) && n51.f.a(java.lang.Boolean.valueOf(this.f244304i), java.lang.Boolean.valueOf(aVar.f244304i)) && n51.f.a(java.lang.Boolean.valueOf(this.f244305m), java.lang.Boolean.valueOf(aVar.f244305m)) && n51.f.a(java.lang.Boolean.valueOf(this.f244306n), java.lang.Boolean.valueOf(aVar.f244306n)) && n51.f.a(java.lang.Boolean.valueOf(this.f244307o), java.lang.Boolean.valueOf(aVar.f244307o)) && n51.f.a(java.lang.Integer.valueOf(this.f244308p), java.lang.Integer.valueOf(aVar.f244308p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f244309q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f244299d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f244300e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f244301f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f244302g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f244303h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f244304i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f244305m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f244306n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f244307o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f244308p);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f244299d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f244300e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f244301f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f244302g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f244303h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f244304i);
            }
            if (zArr[7]) {
                a17 += b36.f.a(7, this.f244305m);
            }
            if (zArr[8]) {
                a17 += b36.f.a(8, this.f244306n);
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f244307o);
            }
            return zArr[10] ? a17 + b36.f.e(10, this.f244308p) : a17;
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
                this.f244299d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f244300e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f244301f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f244302g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f244303h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f244304i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f244305m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f244306n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f244307o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f244308p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (dw5.a) super.parseFrom(bArr);
    }
}
