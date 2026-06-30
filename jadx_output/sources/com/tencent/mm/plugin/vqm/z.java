package com.tencent.mm.plugin.vqm;

/* loaded from: classes2.dex */
public class z extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.z f177524y = new com.tencent.mm.plugin.vqm.z();

    /* renamed from: d, reason: collision with root package name */
    public long f177525d;

    /* renamed from: e, reason: collision with root package name */
    public long f177526e;

    /* renamed from: f, reason: collision with root package name */
    public long f177527f;

    /* renamed from: g, reason: collision with root package name */
    public long f177528g;

    /* renamed from: h, reason: collision with root package name */
    public int f177529h;

    /* renamed from: i, reason: collision with root package name */
    public long f177530i;

    /* renamed from: m, reason: collision with root package name */
    public long f177531m;

    /* renamed from: n, reason: collision with root package name */
    public int f177532n;

    /* renamed from: o, reason: collision with root package name */
    public int f177533o;

    /* renamed from: p, reason: collision with root package name */
    public long f177534p;

    /* renamed from: q, reason: collision with root package name */
    public long f177535q;

    /* renamed from: r, reason: collision with root package name */
    public long f177536r;

    /* renamed from: s, reason: collision with root package name */
    public long f177537s;

    /* renamed from: t, reason: collision with root package name */
    public long f177538t;

    /* renamed from: u, reason: collision with root package name */
    public int f177539u;

    /* renamed from: v, reason: collision with root package name */
    public int f177540v;

    /* renamed from: w, reason: collision with root package name */
    public int f177541w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f177542x = new boolean[18];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.z)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.z zVar = (com.tencent.mm.plugin.vqm.z) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f177525d), java.lang.Long.valueOf(zVar.f177525d)) && n51.f.a(java.lang.Long.valueOf(this.f177526e), java.lang.Long.valueOf(zVar.f177526e)) && n51.f.a(java.lang.Long.valueOf(this.f177527f), java.lang.Long.valueOf(zVar.f177527f)) && n51.f.a(java.lang.Long.valueOf(this.f177528g), java.lang.Long.valueOf(zVar.f177528g)) && n51.f.a(java.lang.Integer.valueOf(this.f177529h), java.lang.Integer.valueOf(zVar.f177529h)) && n51.f.a(java.lang.Long.valueOf(this.f177530i), java.lang.Long.valueOf(zVar.f177530i)) && n51.f.a(java.lang.Long.valueOf(this.f177531m), java.lang.Long.valueOf(zVar.f177531m)) && n51.f.a(java.lang.Integer.valueOf(this.f177532n), java.lang.Integer.valueOf(zVar.f177532n)) && n51.f.a(java.lang.Integer.valueOf(this.f177533o), java.lang.Integer.valueOf(zVar.f177533o)) && n51.f.a(java.lang.Long.valueOf(this.f177534p), java.lang.Long.valueOf(zVar.f177534p)) && n51.f.a(java.lang.Long.valueOf(this.f177535q), java.lang.Long.valueOf(zVar.f177535q)) && n51.f.a(java.lang.Long.valueOf(this.f177536r), java.lang.Long.valueOf(zVar.f177536r)) && n51.f.a(java.lang.Long.valueOf(this.f177537s), java.lang.Long.valueOf(zVar.f177537s)) && n51.f.a(java.lang.Long.valueOf(this.f177538t), java.lang.Long.valueOf(zVar.f177538t)) && n51.f.a(java.lang.Integer.valueOf(this.f177539u), java.lang.Integer.valueOf(zVar.f177539u)) && n51.f.a(java.lang.Integer.valueOf(this.f177540v), java.lang.Integer.valueOf(zVar.f177540v)) && n51.f.a(java.lang.Integer.valueOf(this.f177541w), java.lang.Integer.valueOf(zVar.f177541w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.z();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f177542x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f177525d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f177526e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f177527f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f177528g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f177529h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f177530i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f177531m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f177532n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f177533o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f177534p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f177535q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f177536r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f177537s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f177538t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f177539u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f177540v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f177541w);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f177525d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f177526e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f177527f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f177528g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f177529h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f177530i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f177531m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f177532n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f177533o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f177534p);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f177535q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f177536r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f177537s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f177538t);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f177539u);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f177540v);
            }
            return zArr[17] ? h17 + b36.f.e(17, this.f177541w) : h17;
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
                this.f177525d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177526e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177527f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f177528g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177529h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177530i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f177531m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f177532n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177533o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f177534p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f177535q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f177536r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f177537s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f177538t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f177539u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f177540v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f177541w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.z) super.parseFrom(bArr);
    }
}
