package er4;

/* loaded from: classes14.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final er4.a f256035y = new er4.a();

    /* renamed from: d, reason: collision with root package name */
    public int f256036d;

    /* renamed from: e, reason: collision with root package name */
    public int f256037e;

    /* renamed from: f, reason: collision with root package name */
    public int f256038f;

    /* renamed from: g, reason: collision with root package name */
    public int f256039g;

    /* renamed from: h, reason: collision with root package name */
    public int f256040h;

    /* renamed from: i, reason: collision with root package name */
    public int f256041i;

    /* renamed from: m, reason: collision with root package name */
    public int f256042m;

    /* renamed from: n, reason: collision with root package name */
    public int f256043n;

    /* renamed from: o, reason: collision with root package name */
    public int f256044o;

    /* renamed from: p, reason: collision with root package name */
    public int f256045p;

    /* renamed from: q, reason: collision with root package name */
    public int f256046q;

    /* renamed from: r, reason: collision with root package name */
    public int f256047r;

    /* renamed from: s, reason: collision with root package name */
    public int f256048s;

    /* renamed from: t, reason: collision with root package name */
    public long f256049t;

    /* renamed from: u, reason: collision with root package name */
    public long f256050u;

    /* renamed from: v, reason: collision with root package name */
    public int f256051v;

    /* renamed from: w, reason: collision with root package name */
    public int f256052w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f256053x = new boolean[18];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.a)) {
            return false;
        }
        er4.a aVar = (er4.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f256036d), java.lang.Integer.valueOf(aVar.f256036d)) && n51.f.a(java.lang.Integer.valueOf(this.f256037e), java.lang.Integer.valueOf(aVar.f256037e)) && n51.f.a(java.lang.Integer.valueOf(this.f256038f), java.lang.Integer.valueOf(aVar.f256038f)) && n51.f.a(java.lang.Integer.valueOf(this.f256039g), java.lang.Integer.valueOf(aVar.f256039g)) && n51.f.a(java.lang.Integer.valueOf(this.f256040h), java.lang.Integer.valueOf(aVar.f256040h)) && n51.f.a(java.lang.Integer.valueOf(this.f256041i), java.lang.Integer.valueOf(aVar.f256041i)) && n51.f.a(java.lang.Integer.valueOf(this.f256042m), java.lang.Integer.valueOf(aVar.f256042m)) && n51.f.a(java.lang.Integer.valueOf(this.f256043n), java.lang.Integer.valueOf(aVar.f256043n)) && n51.f.a(java.lang.Integer.valueOf(this.f256044o), java.lang.Integer.valueOf(aVar.f256044o)) && n51.f.a(java.lang.Integer.valueOf(this.f256045p), java.lang.Integer.valueOf(aVar.f256045p)) && n51.f.a(java.lang.Integer.valueOf(this.f256046q), java.lang.Integer.valueOf(aVar.f256046q)) && n51.f.a(java.lang.Integer.valueOf(this.f256047r), java.lang.Integer.valueOf(aVar.f256047r)) && n51.f.a(java.lang.Integer.valueOf(this.f256048s), java.lang.Integer.valueOf(aVar.f256048s)) && n51.f.a(java.lang.Long.valueOf(this.f256049t), java.lang.Long.valueOf(aVar.f256049t)) && n51.f.a(java.lang.Long.valueOf(this.f256050u), java.lang.Long.valueOf(aVar.f256050u)) && n51.f.a(java.lang.Integer.valueOf(this.f256051v), java.lang.Integer.valueOf(aVar.f256051v)) && n51.f.a(java.lang.Integer.valueOf(this.f256052w), java.lang.Integer.valueOf(aVar.f256052w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f256053x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f256036d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f256037e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f256038f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f256039g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f256040h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f256041i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f256042m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f256043n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f256044o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f256045p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f256046q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f256047r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f256048s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f256049t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f256050u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f256051v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f256052w);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f256036d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f256037e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f256038f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f256039g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f256040h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f256041i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f256042m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f256043n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f256044o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f256045p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f256046q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f256047r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f256048s);
            }
            if (zArr[14]) {
                e17 += b36.f.h(14, this.f256049t);
            }
            if (zArr[15]) {
                e17 += b36.f.h(15, this.f256050u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f256051v);
            }
            return zArr[17] ? e17 + b36.f.e(17, this.f256052w) : e17;
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
                this.f256036d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f256037e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256038f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f256039g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f256040h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f256041i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f256042m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f256043n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f256044o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f256045p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f256046q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f256047r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f256048s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f256049t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f256050u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f256051v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f256052w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.a) super.parseFrom(bArr);
    }
}
