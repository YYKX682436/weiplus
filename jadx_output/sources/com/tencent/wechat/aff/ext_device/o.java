package com.tencent.wechat.aff.ext_device;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ext_device.o f216711s = new com.tencent.wechat.aff.ext_device.o();

    /* renamed from: d, reason: collision with root package name */
    public int f216712d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216713e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216714f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.ext_device.p f216715g;

    /* renamed from: h, reason: collision with root package name */
    public int f216716h;

    /* renamed from: i, reason: collision with root package name */
    public int f216717i;

    /* renamed from: m, reason: collision with root package name */
    public int f216718m;

    /* renamed from: n, reason: collision with root package name */
    public int f216719n;

    /* renamed from: o, reason: collision with root package name */
    public int f216720o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216721p;

    /* renamed from: q, reason: collision with root package name */
    public int f216722q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f216723r = new boolean[12];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ext_device.o)) {
            return false;
        }
        com.tencent.wechat.aff.ext_device.o oVar = (com.tencent.wechat.aff.ext_device.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216712d), java.lang.Integer.valueOf(oVar.f216712d)) && n51.f.a(this.f216713e, oVar.f216713e) && n51.f.a(this.f216714f, oVar.f216714f) && n51.f.a(this.f216715g, oVar.f216715g) && n51.f.a(java.lang.Integer.valueOf(this.f216716h), java.lang.Integer.valueOf(oVar.f216716h)) && n51.f.a(java.lang.Integer.valueOf(this.f216717i), java.lang.Integer.valueOf(oVar.f216717i)) && n51.f.a(java.lang.Integer.valueOf(this.f216718m), java.lang.Integer.valueOf(oVar.f216718m)) && n51.f.a(java.lang.Integer.valueOf(this.f216719n), java.lang.Integer.valueOf(oVar.f216719n)) && n51.f.a(java.lang.Integer.valueOf(this.f216720o), java.lang.Integer.valueOf(oVar.f216720o)) && n51.f.a(this.f216721p, oVar.f216721p) && n51.f.a(java.lang.Integer.valueOf(this.f216722q), java.lang.Integer.valueOf(oVar.f216722q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ext_device.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216723r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216712d);
            }
            com.tencent.mm.protobuf.g gVar = this.f216713e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f216714f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.tencent.wechat.aff.ext_device.p pVar = this.f216715g;
            if (pVar != null && zArr[4]) {
                fVar.i(4, pVar.computeSize());
                this.f216715g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f216716h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f216717i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f216718m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f216719n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f216720o);
            }
            java.lang.String str2 = this.f216721p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            if (zArr[11]) {
                fVar.e(11, this.f216722q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216712d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f216713e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str3 = this.f216714f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            com.tencent.wechat.aff.ext_device.p pVar2 = this.f216715g;
            if (pVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, pVar2.computeSize());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f216716h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f216717i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f216718m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f216719n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f216720o);
            }
            java.lang.String str4 = this.f216721p;
            if (str4 != null && zArr[10]) {
                e17 += b36.f.j(10, str4);
            }
            return zArr[11] ? e17 + b36.f.e(11, this.f216722q) : e17;
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
                this.f216712d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216713e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216714f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.ext_device.p pVar3 = new com.tencent.wechat.aff.ext_device.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.parseFrom(bArr);
                    }
                    this.f216715g = pVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f216716h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216717i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216718m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216719n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216720o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216721p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216722q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ext_device.o) super.parseFrom(bArr);
    }
}
