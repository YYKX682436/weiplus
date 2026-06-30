package com.tencent.wechat.mm.biz;

/* loaded from: classes4.dex */
public class k2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218243d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218244e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218245f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218246g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218247h = new boolean[5];

    static {
        new com.tencent.wechat.mm.biz.k2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.k2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.k2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.k2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.k2 k2Var = (com.tencent.wechat.mm.biz.k2) fVar;
        return n51.f.a(this.f218243d, k2Var.f218243d) && n51.f.a(this.f218244e, k2Var.f218244e) && n51.f.a(this.f218245f, k2Var.f218245f) && n51.f.a(this.f218246g, k2Var.f218246g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.k2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218247h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218243d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218244e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218245f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218246g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f218243d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f218244e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f218245f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f218246g;
            return (str8 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str8);
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
            this.f218243d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218244e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218245f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f218246g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
