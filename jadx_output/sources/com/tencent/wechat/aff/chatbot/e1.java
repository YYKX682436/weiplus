package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class e1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.d1 f216181d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.c1 f216182e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216183f = new boolean[3];

    static {
        new com.tencent.wechat.aff.chatbot.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.e1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.e1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.e1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.e1 e1Var = (com.tencent.wechat.aff.chatbot.e1) fVar;
        return n51.f.a(this.f216181d, e1Var.f216181d) && n51.f.a(this.f216182e, e1Var.f216182e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216183f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.d1 d1Var = this.f216181d;
            if (d1Var != null && zArr[1]) {
                fVar.e(1, d1Var.f216151d);
            }
            com.tencent.wechat.aff.chatbot.c1 c1Var = this.f216182e;
            if (c1Var != null && zArr[2]) {
                fVar.i(2, c1Var.computeSize());
                this.f216182e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.d1 d1Var2 = this.f216181d;
            if (d1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, d1Var2.f216151d);
            }
            com.tencent.wechat.aff.chatbot.c1 c1Var2 = this.f216182e;
            return (c1Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, c1Var2.computeSize());
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
            int g17 = aVar2.g(intValue);
            this.f216181d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 99 ? null : com.tencent.wechat.aff.chatbot.d1.MSG_TYPE_ERROR : com.tencent.wechat.aff.chatbot.d1.MSG_TYPE_EOF : com.tencent.wechat.aff.chatbot.d1.MSG_TYPE_START : com.tencent.wechat.aff.chatbot.d1.MSG_TYPE_DATA : com.tencent.wechat.aff.chatbot.d1.MSG_TYPE_INVALID;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.chatbot.c1 c1Var3 = new com.tencent.wechat.aff.chatbot.c1();
            if (bArr != null && bArr.length > 0) {
                c1Var3.parseFrom(bArr);
            }
            this.f216182e = c1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
