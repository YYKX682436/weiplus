package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class w1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218730d;

    /* renamed from: e, reason: collision with root package name */
    public long f218731e;

    /* renamed from: f, reason: collision with root package name */
    public int f218732f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218733g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218734h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218735i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218736m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f218737n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218738o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f218739p = new boolean[10];

    static {
        new com.tencent.wechat.mm.biz.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.w1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.w1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.w1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.w1 w1Var = (com.tencent.wechat.mm.biz.w1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218730d), java.lang.Long.valueOf(w1Var.f218730d)) && n51.f.a(java.lang.Long.valueOf(this.f218731e), java.lang.Long.valueOf(w1Var.f218731e)) && n51.f.a(java.lang.Integer.valueOf(this.f218732f), java.lang.Integer.valueOf(w1Var.f218732f)) && n51.f.a(this.f218733g, w1Var.f218733g) && n51.f.a(this.f218734h, w1Var.f218734h) && n51.f.a(this.f218735i, w1Var.f218735i) && n51.f.a(this.f218736m, w1Var.f218736m) && n51.f.a(this.f218737n, w1Var.f218737n) && n51.f.a(this.f218738o, w1Var.f218738o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218739p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218730d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218731e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218732f);
            }
            java.lang.String str = this.f218733g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f218734h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f218735i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f218736m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f218737n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f218738o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218730d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f218731e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f218732f);
            }
            java.lang.String str7 = this.f218733g;
            if (str7 != null && zArr[4]) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f218734h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f218735i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f218736m;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f218737n;
            if (str11 != null && zArr[8]) {
                h17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f218738o;
            return (str12 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str12);
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
                this.f218730d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218731e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218732f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218733g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218734h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218735i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218736m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218737n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218738o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
