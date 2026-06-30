package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class p5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f218474d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218475e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218476f = "";

    static {
        new com.tencent.wechat.mm.biz.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.p5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.p5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.p5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.p5 p5Var = (com.tencent.wechat.mm.biz.p5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f218474d), java.lang.Boolean.valueOf(p5Var.f218474d)) && n51.f.a(this.f218475e, p5Var.f218475e) && n51.f.a(this.f218476f, p5Var.f218476f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f218474d);
            java.lang.String str = this.f218475e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218476f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f218474d) + 0;
            java.lang.String str3 = this.f218475e;
            if (str3 != null) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f218476f;
            return str4 != null ? a17 + b36.f.j(3, str4) : a17;
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
            this.f218474d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218475e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218476f = aVar2.k(intValue);
        return 0;
    }
}
