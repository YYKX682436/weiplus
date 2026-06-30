package com.tencent.wechat.aff.favorites;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216730f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216731g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216732h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.wcrte.g f216733i;

    /* renamed from: m, reason: collision with root package name */
    public int f216734m;

    /* renamed from: n, reason: collision with root package name */
    public int f216735n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f216736o = new boolean[9];

    static {
        new com.tencent.wechat.aff.favorites.a();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.a parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.a) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.a)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.a aVar = (com.tencent.wechat.aff.favorites.a) fVar;
        return n51.f.a(this.f216728d, aVar.f216728d) && n51.f.a(this.f216729e, aVar.f216729e) && n51.f.a(this.f216730f, aVar.f216730f) && n51.f.a(java.lang.Boolean.valueOf(this.f216731g), java.lang.Boolean.valueOf(aVar.f216731g)) && n51.f.a(this.f216732h, aVar.f216732h) && n51.f.a(this.f216733i, aVar.f216733i) && n51.f.a(java.lang.Integer.valueOf(this.f216734m), java.lang.Integer.valueOf(aVar.f216734m)) && n51.f.a(java.lang.Integer.valueOf(this.f216735n), java.lang.Integer.valueOf(aVar.f216735n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216736o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216728d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216729e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216730f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f216731g);
            }
            java.lang.String str4 = this.f216732h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            com.tencent.wechat.aff.wcrte.g gVar = this.f216733i;
            if (gVar != null && zArr[6]) {
                fVar.e(6, gVar.f217659d);
            }
            if (zArr[7]) {
                fVar.e(7, this.f216734m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f216735n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216728d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f216729e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f216730f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f216731g);
            }
            java.lang.String str8 = this.f216732h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            com.tencent.wechat.aff.wcrte.g gVar2 = this.f216733i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, gVar2.f217659d);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f216734m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f216735n) : i18;
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
                this.f216728d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216729e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216730f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216731g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216732h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f216733i = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.aff.wcrte.g.FavNoteFrom_Anno : com.tencent.wechat.aff.wcrte.g.FavNoteFrom_Fav : com.tencent.wechat.aff.wcrte.g.FavNoteFrom_Chat : com.tencent.wechat.aff.wcrte.g.FavNoteFrom_Unknow;
                zArr[6] = true;
                return 0;
            case 7:
                this.f216734m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216735n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
