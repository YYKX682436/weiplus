package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218307d;

    /* renamed from: e, reason: collision with root package name */
    public int f218308e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218309f;

    /* renamed from: g, reason: collision with root package name */
    public int f218310g;

    /* renamed from: h, reason: collision with root package name */
    public int f218311h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f218312i = new boolean[6];

    static {
        new com.tencent.wechat.mm.biz.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.m0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.m0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.m0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.m0 m0Var = (com.tencent.wechat.mm.biz.m0) fVar;
        return n51.f.a(this.f218307d, m0Var.f218307d) && n51.f.a(java.lang.Integer.valueOf(this.f218308e), java.lang.Integer.valueOf(m0Var.f218308e)) && n51.f.a(this.f218309f, m0Var.f218309f) && n51.f.a(java.lang.Integer.valueOf(this.f218310g), java.lang.Integer.valueOf(m0Var.f218310g)) && n51.f.a(java.lang.Integer.valueOf(this.f218311h), java.lang.Integer.valueOf(m0Var.f218311h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218312i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218307d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218308e);
            }
            java.lang.String str2 = this.f218309f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218310g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218311h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f218307d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f218308e);
            }
            java.lang.String str4 = this.f218309f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f218310g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f218311h) : i18;
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
            this.f218307d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218308e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218309f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f218310g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f218311h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
