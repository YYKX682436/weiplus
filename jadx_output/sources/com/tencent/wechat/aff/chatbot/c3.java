package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class c3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216129e;

    /* renamed from: f, reason: collision with root package name */
    public int f216130f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216131g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216132h = new boolean[5];

    static {
        new com.tencent.wechat.aff.chatbot.c3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.c3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.c3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.c3)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.c3 c3Var = (com.tencent.wechat.aff.chatbot.c3) fVar;
        return n51.f.a(this.f216128d, c3Var.f216128d) && n51.f.a(this.f216129e, c3Var.f216129e) && n51.f.a(java.lang.Integer.valueOf(this.f216130f), java.lang.Integer.valueOf(c3Var.f216130f)) && n51.f.a(this.f216131g, c3Var.f216131g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.c3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216132h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216128d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216129e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216130f);
            }
            com.tencent.mm.protobuf.g gVar = this.f216131g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f216128d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f216129e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f216130f);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f216131g;
            return (gVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.b(4, gVar2);
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
            this.f216128d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216129e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216130f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f216131g = aVar2.d(intValue);
        zArr[4] = true;
        return 0;
    }
}
