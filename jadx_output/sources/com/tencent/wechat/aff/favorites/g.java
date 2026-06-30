package com.tencent.wechat.aff.favorites;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f216766d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216767e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216768f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216769g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216770h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216771i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216772m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216773n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216774o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216775p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f216776q = new boolean[11];

    static {
        new com.tencent.wechat.aff.favorites.g();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.g parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.g) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.g)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.g gVar = (com.tencent.wechat.aff.favorites.g) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f216766d), java.lang.Boolean.valueOf(gVar.f216766d)) && n51.f.a(this.f216767e, gVar.f216767e) && n51.f.a(this.f216768f, gVar.f216768f) && n51.f.a(this.f216769g, gVar.f216769g) && n51.f.a(this.f216770h, gVar.f216770h) && n51.f.a(this.f216771i, gVar.f216771i) && n51.f.a(this.f216772m, gVar.f216772m) && n51.f.a(this.f216773n, gVar.f216773n) && n51.f.a(this.f216774o, gVar.f216774o) && n51.f.a(this.f216775p, gVar.f216775p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216776q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f216766d);
            }
            java.lang.String str = this.f216767e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216768f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f216769g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f216770h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f216771i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f216772m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f216773n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f216774o;
            if (str8 != null && zArr[9]) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f216775p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f216766d) : 0;
            java.lang.String str10 = this.f216767e;
            if (str10 != null && zArr[2]) {
                a17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f216768f;
            if (str11 != null && zArr[3]) {
                a17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f216769g;
            if (str12 != null && zArr[4]) {
                a17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f216770h;
            if (str13 != null && zArr[5]) {
                a17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f216771i;
            if (str14 != null && zArr[6]) {
                a17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f216772m;
            if (str15 != null && zArr[7]) {
                a17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f216773n;
            if (str16 != null && zArr[8]) {
                a17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f216774o;
            if (str17 != null && zArr[9]) {
                a17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f216775p;
            return (str18 == null || !zArr[10]) ? a17 : a17 + b36.f.j(10, str18);
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
                this.f216766d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216767e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216768f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216769g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216770h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216771i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216772m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216773n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216774o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216775p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
