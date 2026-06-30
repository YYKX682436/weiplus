package com.tencent.wechat.aff.chatbot;

/* loaded from: classes9.dex */
public class b3 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.b3 f216096g = new com.tencent.wechat.aff.chatbot.b3();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216097d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.a3 f216098e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216099f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.b3)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.b3 b3Var = (com.tencent.wechat.aff.chatbot.b3) fVar;
        return n51.f.a(this.f216097d, b3Var.f216097d) && n51.f.a(this.f216098e, b3Var.f216098e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.b3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216099f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216097d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.chatbot.a3 a3Var = this.f216098e;
            if (a3Var != null && zArr[2]) {
                fVar.e(2, a3Var.f216080d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f216097d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.wechat.aff.chatbot.a3 a3Var2 = this.f216098e;
            return (a3Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, a3Var2.f216080d);
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
            this.f216097d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f216098e = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.chatbot.a3.FINISH_REASON_INTERRUPTED : com.tencent.wechat.aff.chatbot.a3.FINISH_REASON_COMPLETED : com.tencent.wechat.aff.chatbot.a3.FINISH_REASON_UNSPECIFIED;
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.b3) super.parseFrom(bArr);
    }
}
