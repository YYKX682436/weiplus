package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class t3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218639d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218640e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218641f = "";

    static {
        new com.tencent.wechat.mm.biz.t3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.t3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.t3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.t3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.t3 t3Var = (com.tencent.wechat.mm.biz.t3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218639d), java.lang.Long.valueOf(t3Var.f218639d)) && n51.f.a(this.f218640e, t3Var.f218640e) && n51.f.a(this.f218641f, t3Var.f218641f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.t3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f218639d);
            java.lang.String str = this.f218640e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218641f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f218639d) + 0;
            java.lang.String str3 = this.f218640e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f218641f;
            return str4 != null ? h17 + b36.f.j(3, str4) : h17;
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
            this.f218639d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218640e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f218641f = aVar2.k(intValue);
        return 0;
    }
}
