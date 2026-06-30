package com.tencent.wechat.aff.favorites;

/* loaded from: classes12.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.h f216777t = new com.tencent.wechat.aff.favorites.h();

    /* renamed from: d, reason: collision with root package name */
    public int f216778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216782h;

    /* renamed from: i, reason: collision with root package name */
    public int f216783i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f216784m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.g f216785n;

    /* renamed from: o, reason: collision with root package name */
    public int f216786o;

    /* renamed from: p, reason: collision with root package name */
    public int f216787p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216788q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f216789r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f216790s = new boolean[13];

    public java.lang.String b() {
        return this.f216790s[2] ? this.f216779e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.h)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.h hVar = (com.tencent.wechat.aff.favorites.h) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216778d), java.lang.Integer.valueOf(hVar.f216778d)) && n51.f.a(this.f216779e, hVar.f216779e) && n51.f.a(this.f216780f, hVar.f216780f) && n51.f.a(java.lang.Boolean.valueOf(this.f216781g), java.lang.Boolean.valueOf(hVar.f216781g)) && n51.f.a(this.f216782h, hVar.f216782h) && n51.f.a(java.lang.Integer.valueOf(this.f216783i), java.lang.Integer.valueOf(hVar.f216783i)) && n51.f.a(java.lang.Boolean.valueOf(this.f216784m), java.lang.Boolean.valueOf(hVar.f216784m)) && n51.f.a(this.f216785n, hVar.f216785n) && n51.f.a(java.lang.Integer.valueOf(this.f216786o), java.lang.Integer.valueOf(hVar.f216786o)) && n51.f.a(java.lang.Integer.valueOf(this.f216787p), java.lang.Integer.valueOf(hVar.f216787p)) && n51.f.a(this.f216788q, hVar.f216788q) && n51.f.a(this.f216789r, hVar.f216789r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216790s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216778d);
            }
            java.lang.String str = this.f216779e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216780f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f216781g);
            }
            java.lang.String str3 = this.f216782h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f216783i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f216784m);
            }
            com.tencent.wechat.aff.favorites.g gVar = this.f216785n;
            if (gVar != null && zArr[8]) {
                fVar.i(8, gVar.computeSize());
                this.f216785n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f216786o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f216787p);
            }
            java.lang.String str4 = this.f216788q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f216789r;
            if (str5 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216778d) : 0;
            java.lang.String str6 = this.f216779e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f216780f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f216781g);
            }
            java.lang.String str8 = this.f216782h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f216783i);
            }
            if (zArr[7]) {
                e17 += b36.f.a(7, this.f216784m);
            }
            com.tencent.wechat.aff.favorites.g gVar2 = this.f216785n;
            if (gVar2 != null && zArr[8]) {
                e17 += b36.f.i(8, gVar2.computeSize());
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f216786o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f216787p);
            }
            java.lang.String str9 = this.f216788q;
            if (str9 != null && zArr[11]) {
                e17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f216789r;
            return (str10 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str10);
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
                this.f216778d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216779e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216780f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216781g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216782h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216783i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216784m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.favorites.g gVar3 = new com.tencent.wechat.aff.favorites.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.parseFrom(bArr);
                    }
                    this.f216785n = gVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f216786o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216787p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216788q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f216789r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.h) super.parseFrom(bArr);
    }
}
