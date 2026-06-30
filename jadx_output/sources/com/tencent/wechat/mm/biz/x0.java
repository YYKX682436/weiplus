package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class x0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218763d;

    /* renamed from: e, reason: collision with root package name */
    public int f218764e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218765f;

    /* renamed from: g, reason: collision with root package name */
    public int f218766g;

    /* renamed from: h, reason: collision with root package name */
    public int f218767h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f218768i = new boolean[6];

    static {
        new com.tencent.wechat.mm.biz.x0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.x0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.x0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.x0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.x0 x0Var = (com.tencent.wechat.mm.biz.x0) fVar;
        return n51.f.a(this.f218763d, x0Var.f218763d) && n51.f.a(java.lang.Integer.valueOf(this.f218764e), java.lang.Integer.valueOf(x0Var.f218764e)) && n51.f.a(this.f218765f, x0Var.f218765f) && n51.f.a(java.lang.Integer.valueOf(this.f218766g), java.lang.Integer.valueOf(x0Var.f218766g)) && n51.f.a(java.lang.Integer.valueOf(this.f218767h), java.lang.Integer.valueOf(x0Var.f218767h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.x0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218768i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218763d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218764e);
            }
            java.lang.String str2 = this.f218765f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218766g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218767h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f218763d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f218764e);
            }
            java.lang.String str4 = this.f218765f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f218766g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f218767h) : i18;
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
            this.f218763d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218764e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218765f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f218766g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f218767h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
