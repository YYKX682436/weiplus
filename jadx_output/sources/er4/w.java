package er4;

/* loaded from: classes14.dex */
public class w extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final er4.w f256186o = new er4.w();

    /* renamed from: d, reason: collision with root package name */
    public long f256187d;

    /* renamed from: e, reason: collision with root package name */
    public long f256188e;

    /* renamed from: f, reason: collision with root package name */
    public double f256189f;

    /* renamed from: g, reason: collision with root package name */
    public double f256190g;

    /* renamed from: h, reason: collision with root package name */
    public double f256191h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f256192i;

    /* renamed from: m, reason: collision with root package name */
    public long f256193m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f256194n = new boolean[8];

    public er4.w b(double d17) {
        this.f256191h = d17;
        this.f256194n[5] = true;
        return this;
    }

    public er4.w c(boolean z17) {
        this.f256192i = z17;
        this.f256194n[6] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.w)) {
            return false;
        }
        er4.w wVar = (er4.w) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f256187d), java.lang.Long.valueOf(wVar.f256187d)) && n51.f.a(java.lang.Long.valueOf(this.f256188e), java.lang.Long.valueOf(wVar.f256188e)) && n51.f.a(java.lang.Double.valueOf(this.f256189f), java.lang.Double.valueOf(wVar.f256189f)) && n51.f.a(java.lang.Double.valueOf(this.f256190g), java.lang.Double.valueOf(wVar.f256190g)) && n51.f.a(java.lang.Double.valueOf(this.f256191h), java.lang.Double.valueOf(wVar.f256191h)) && n51.f.a(java.lang.Boolean.valueOf(this.f256192i), java.lang.Boolean.valueOf(wVar.f256192i)) && n51.f.a(java.lang.Long.valueOf(this.f256193m), java.lang.Long.valueOf(wVar.f256193m));
    }

    public er4.w d(double d17) {
        this.f256189f = d17;
        this.f256194n[3] = true;
        return this;
    }

    public er4.w e(long j17) {
        this.f256188e = j17;
        this.f256194n[2] = true;
        return this;
    }

    public er4.w f(long j17) {
        this.f256187d = j17;
        this.f256194n[1] = true;
        return this;
    }

    public er4.w g(double d17) {
        this.f256190g = d17;
        this.f256194n[4] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.w();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f256194n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f256187d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f256188e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f256189f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f256190g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f256191h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f256192i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f256193m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f256187d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f256188e);
            }
            if (zArr[3]) {
                h17 += b36.f.c(3, this.f256189f);
            }
            if (zArr[4]) {
                h17 += b36.f.c(4, this.f256190g);
            }
            if (zArr[5]) {
                h17 += b36.f.c(5, this.f256191h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f256192i);
            }
            return zArr[7] ? h17 + b36.f.h(7, this.f256193m) : h17;
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
                this.f256187d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f256188e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256189f = aVar2.e(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f256190g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f256191h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f256192i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f256193m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.w) super.parseFrom(bArr);
    }
}
