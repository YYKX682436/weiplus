package com.tencent.wechat.aff.favorites;

/* loaded from: classes11.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.f f216758n = new com.tencent.wechat.aff.favorites.f();

    /* renamed from: d, reason: collision with root package name */
    public float f216759d;

    /* renamed from: e, reason: collision with root package name */
    public float f216760e;

    /* renamed from: f, reason: collision with root package name */
    public int f216761f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216762g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216763h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216764i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f216765m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.f)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.f fVar2 = (com.tencent.wechat.aff.favorites.f) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f216759d), java.lang.Float.valueOf(fVar2.f216759d)) && n51.f.a(java.lang.Float.valueOf(this.f216760e), java.lang.Float.valueOf(fVar2.f216760e)) && n51.f.a(java.lang.Integer.valueOf(this.f216761f), java.lang.Integer.valueOf(fVar2.f216761f)) && n51.f.a(this.f216762g, fVar2.f216762g) && n51.f.a(this.f216763h, fVar2.f216763h) && n51.f.a(this.f216764i, fVar2.f216764i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216765m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f216759d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f216760e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216761f);
            }
            java.lang.String str = this.f216762g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f216763h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f216764i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f216759d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f216760e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f216761f);
            }
            java.lang.String str4 = this.f216762g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f216763h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f216764i;
            return (str6 == null || !zArr[6]) ? d17 : d17 + b36.f.j(6, str6);
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
                this.f216759d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216760e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216761f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216762g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216763h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216764i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.f) super.parseFrom(bArr);
    }
}
