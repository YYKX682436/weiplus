package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.a1 f217852h = new com.tencent.wechat.mm.biz.a1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217854e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.z0 f217855f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217856g = new boolean[4];

    public java.lang.String b() {
        return this.f217856g[2] ? this.f217854e : "";
    }

    public com.tencent.wechat.mm.biz.z0 c() {
        return this.f217856g[3] ? this.f217855f : com.tencent.wechat.mm.biz.z0.ModeHide;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.a1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.a1 a1Var = (com.tencent.wechat.mm.biz.a1) fVar;
        return n51.f.a(this.f217853d, a1Var.f217853d) && n51.f.a(this.f217854e, a1Var.f217854e) && n51.f.a(this.f217855f, a1Var.f217855f);
    }

    public java.lang.String getNickname() {
        return this.f217856g[1] ? this.f217853d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217856g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217853d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217854e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.tencent.wechat.mm.biz.z0 z0Var = this.f217855f;
            if (z0Var != null && zArr[3]) {
                fVar.e(3, z0Var.f218824d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217853d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f217854e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.wechat.mm.biz.z0 z0Var2 = this.f217855f;
            return (z0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, z0Var2.f218824d);
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
            this.f217853d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217854e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f217855f = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.biz.z0.ModeLiving : com.tencent.wechat.mm.biz.z0.ModeLiveEnd : com.tencent.wechat.mm.biz.z0.ModeHide;
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.a1) super.parseFrom(bArr);
    }
}
