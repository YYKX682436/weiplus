package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class n1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f216396d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216397e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216398f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.o1 f216399g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216400h = new boolean[5];

    static {
        new com.tencent.wechat.aff.chatbot.n1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.n1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.n1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.n1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.n1 n1Var = (com.tencent.wechat.aff.chatbot.n1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216396d), java.lang.Integer.valueOf(n1Var.f216396d)) && n51.f.a(this.f216397e, n1Var.f216397e) && n51.f.a(this.f216398f, n1Var.f216398f) && n51.f.a(this.f216399g, n1Var.f216399g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.n1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216400h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216396d);
            }
            java.lang.String str = this.f216397e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216398f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.aff.chatbot.o1 o1Var = this.f216399g;
            if (o1Var != null && zArr[4]) {
                fVar.e(4, o1Var.f216412d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216396d) : 0;
            java.lang.String str3 = this.f216397e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f216398f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.aff.chatbot.o1 o1Var2 = this.f216399g;
            return (o1Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.e(4, o1Var2.f216412d);
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
            this.f216396d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216397e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216398f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f216399g = g17 != 0 ? g17 != 1 ? null : com.tencent.wechat.aff.chatbot.o1.IMAGE : com.tencent.wechat.aff.chatbot.o1.TEXT;
        zArr[4] = true;
        return 0;
    }
}
