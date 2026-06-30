package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class h2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216245d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.g2 f216246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216247f = new boolean[3];

    static {
        new com.tencent.wechat.aff.chatbot.h2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.h2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.h2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.h2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.h2 h2Var = (com.tencent.wechat.aff.chatbot.h2) fVar;
        return n51.f.a(this.f216245d, h2Var.f216245d) && n51.f.a(this.f216246e, h2Var.f216246e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.h2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216247f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216245d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.chatbot.g2 g2Var = this.f216246e;
            if (g2Var != null && zArr[2]) {
                fVar.e(2, g2Var.f216238d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f216245d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.wechat.aff.chatbot.g2 g2Var2 = this.f216246e;
            return (g2Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, g2Var2.f216238d);
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
            this.f216245d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f216246e = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.chatbot.g2.MEETINGTYPE_IN_PROCESS : com.tencent.wechat.aff.chatbot.g2.MEETINGTYPE_END : com.tencent.wechat.aff.chatbot.g2.MEETINGTYPE_BEGIN;
        zArr[2] = true;
        return 0;
    }
}
