package com.tencent.wechat.aff.magicbrush;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217363e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217364f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217365g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217367i;

    /* renamed from: m, reason: collision with root package name */
    public long f217368m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f217369n = new boolean[8];

    static {
        new com.tencent.wechat.aff.magicbrush.a();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.magicbrush.a parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.magicbrush.a) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.magicbrush.a)) {
            return false;
        }
        com.tencent.wechat.aff.magicbrush.a aVar = (com.tencent.wechat.aff.magicbrush.a) fVar;
        return n51.f.a(this.f217362d, aVar.f217362d) && n51.f.a(this.f217363e, aVar.f217363e) && n51.f.a(this.f217364f, aVar.f217364f) && n51.f.a(this.f217365g, aVar.f217365g) && n51.f.a(this.f217366h, aVar.f217366h) && n51.f.a(this.f217367i, aVar.f217367i) && n51.f.a(java.lang.Long.valueOf(this.f217368m), java.lang.Long.valueOf(aVar.f217368m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.magicbrush.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217369n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217362d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217363e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f217364f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f217365g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f217366h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f217367i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            if (zArr[7]) {
                fVar.h(7, this.f217368m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f217362d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f217363e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f217364f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f217365g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f217366h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f217367i;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f217368m) : i18;
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
                this.f217362d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217363e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217364f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217365g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217366h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217367i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217368m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
