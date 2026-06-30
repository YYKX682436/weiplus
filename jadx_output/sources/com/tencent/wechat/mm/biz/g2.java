package com.tencent.wechat.mm.biz;

/* loaded from: classes4.dex */
public class g2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218071d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218072e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218073f;

    /* renamed from: g, reason: collision with root package name */
    public float f218074g;

    /* renamed from: h, reason: collision with root package name */
    public float f218075h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218076i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218077m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f218078n = new boolean[8];

    static {
        new com.tencent.wechat.mm.biz.g2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.g2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.g2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.g2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.g2 g2Var = (com.tencent.wechat.mm.biz.g2) fVar;
        return n51.f.a(this.f218071d, g2Var.f218071d) && n51.f.a(this.f218072e, g2Var.f218072e) && n51.f.a(this.f218073f, g2Var.f218073f) && n51.f.a(java.lang.Float.valueOf(this.f218074g), java.lang.Float.valueOf(g2Var.f218074g)) && n51.f.a(java.lang.Float.valueOf(this.f218075h), java.lang.Float.valueOf(g2Var.f218075h)) && n51.f.a(this.f218076i, g2Var.f218076i) && n51.f.a(this.f218077m, g2Var.f218077m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.g2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218078n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218071d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218072e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218073f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.d(4, this.f218074g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f218075h);
            }
            java.lang.String str4 = this.f218076i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f218077m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f218071d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f218072e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f218073f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f218074g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f218075h);
            }
            java.lang.String str9 = this.f218076i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f218077m;
            return (str10 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str10);
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
                this.f218071d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218072e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218073f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218074g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218075h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218076i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218077m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
