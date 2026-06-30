package com.tencent.wechat.aff.favorites;

/* loaded from: classes11.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.p f216848m = new com.tencent.wechat.aff.favorites.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216850e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216851f;

    /* renamed from: g, reason: collision with root package name */
    public float f216852g;

    /* renamed from: h, reason: collision with root package name */
    public float f216853h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216854i = new boolean[6];

    public java.lang.String b() {
        return this.f216854i[1] ? this.f216849d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.p)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.p pVar = (com.tencent.wechat.aff.favorites.p) fVar;
        return n51.f.a(this.f216849d, pVar.f216849d) && n51.f.a(this.f216850e, pVar.f216850e) && n51.f.a(this.f216851f, pVar.f216851f) && n51.f.a(java.lang.Float.valueOf(this.f216852g), java.lang.Float.valueOf(pVar.f216852g)) && n51.f.a(java.lang.Float.valueOf(this.f216853h), java.lang.Float.valueOf(pVar.f216853h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216854i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216849d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216850e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216851f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.d(4, this.f216852g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f216853h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f216849d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f216850e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f216851f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f216852g);
            }
            return zArr[5] ? i18 + b36.f.d(5, this.f216853h) : i18;
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
        if (intValue == 1) {
            this.f216849d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216850e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216851f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f216852g = aVar2.f(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f216853h = aVar2.f(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.p) super.parseFrom(bArr);
    }
}
