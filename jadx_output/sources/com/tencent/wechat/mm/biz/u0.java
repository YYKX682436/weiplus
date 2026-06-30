package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class u0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218665d;

    /* renamed from: e, reason: collision with root package name */
    public int f218666e;

    /* renamed from: f, reason: collision with root package name */
    public int f218667f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218668g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218669h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218670i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218671m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f218672n = new boolean[8];

    static {
        new com.tencent.wechat.mm.biz.u0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.u0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.u0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.u0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.u0 u0Var = (com.tencent.wechat.mm.biz.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218665d), java.lang.Integer.valueOf(u0Var.f218665d)) && n51.f.a(java.lang.Integer.valueOf(this.f218666e), java.lang.Integer.valueOf(u0Var.f218666e)) && n51.f.a(java.lang.Integer.valueOf(this.f218667f), java.lang.Integer.valueOf(u0Var.f218667f)) && n51.f.a(this.f218668g, u0Var.f218668g) && n51.f.a(this.f218669h, u0Var.f218669h) && n51.f.a(this.f218670i, u0Var.f218670i) && n51.f.a(this.f218671m, u0Var.f218671m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.u0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218672n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218665d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218666e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218667f);
            }
            java.lang.String str = this.f218668g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f218669h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f218670i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f218671m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218665d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f218666e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f218667f);
            }
            java.lang.String str5 = this.f218668g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f218669h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f218670i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f218671m;
            return (str8 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str8);
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
                this.f218665d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218666e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218667f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218668g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218669h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218670i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218671m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
