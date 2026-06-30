package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class e3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217996d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217997e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217998f = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f217999g = false;

    static {
        new com.tencent.wechat.mm.biz.e3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.e3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.e3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.e3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.e3 e3Var = (com.tencent.wechat.mm.biz.e3) fVar;
        return n51.f.a(this.f217996d, e3Var.f217996d) && n51.f.a(this.f217997e, e3Var.f217997e) && n51.f.a(this.f217998f, e3Var.f217998f) && n51.f.a(java.lang.Boolean.valueOf(this.f217999g), java.lang.Boolean.valueOf(e3Var.f217999g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.e3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217996d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217997e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f217998f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f217999g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217996d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f217997e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f217998f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.a(4, this.f217999g);
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
            this.f217996d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f217997e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f217998f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f217999g = aVar2.c(intValue);
        return 0;
    }
}
