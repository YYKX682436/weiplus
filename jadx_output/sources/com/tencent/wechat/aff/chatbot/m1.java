package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class m1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216378d;

    /* renamed from: e, reason: collision with root package name */
    public long f216379e;

    /* renamed from: f, reason: collision with root package name */
    public long f216380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216381g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216382h = new boolean[5];

    static {
        new com.tencent.wechat.aff.chatbot.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.m1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.m1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.m1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.m1 m1Var = (com.tencent.wechat.aff.chatbot.m1) fVar;
        return n51.f.a(this.f216378d, m1Var.f216378d) && n51.f.a(java.lang.Long.valueOf(this.f216379e), java.lang.Long.valueOf(m1Var.f216379e)) && n51.f.a(java.lang.Long.valueOf(this.f216380f), java.lang.Long.valueOf(m1Var.f216380f)) && n51.f.a(this.f216381g, m1Var.f216381g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216382h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216378d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216379e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f216380f);
            }
            java.lang.String str2 = this.f216381g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f216378d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f216379e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f216380f);
            }
            java.lang.String str4 = this.f216381g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
            this.f216378d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216379e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216380f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f216381g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
