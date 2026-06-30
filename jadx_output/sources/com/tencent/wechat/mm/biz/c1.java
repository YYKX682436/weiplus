package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class c1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217928d;

    /* renamed from: e, reason: collision with root package name */
    public int f217929e;

    /* renamed from: f, reason: collision with root package name */
    public long f217930f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217931g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217932h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f217933i = new boolean[6];

    static {
        new com.tencent.wechat.mm.biz.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.c1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.c1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.c1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.c1 c1Var = (com.tencent.wechat.mm.biz.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217928d), java.lang.Integer.valueOf(c1Var.f217928d)) && n51.f.a(java.lang.Integer.valueOf(this.f217929e), java.lang.Integer.valueOf(c1Var.f217929e)) && n51.f.a(java.lang.Long.valueOf(this.f217930f), java.lang.Long.valueOf(c1Var.f217930f)) && n51.f.a(this.f217931g, c1Var.f217931g) && n51.f.a(this.f217932h, c1Var.f217932h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217933i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217928d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f217929e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f217930f);
            }
            java.lang.String str = this.f217931g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f217932h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f217928d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f217929e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f217930f);
            }
            java.lang.String str3 = this.f217931g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f217932h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f217928d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217929e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217930f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f217931g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f217932h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
