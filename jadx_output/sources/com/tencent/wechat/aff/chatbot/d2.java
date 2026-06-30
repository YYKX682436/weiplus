package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class d2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.c2 f216152d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.z1 f216153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216154f = new boolean[3];

    static {
        new com.tencent.wechat.aff.chatbot.d2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.d2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.d2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.d2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.d2 d2Var = (com.tencent.wechat.aff.chatbot.d2) fVar;
        return n51.f.a(this.f216152d, d2Var.f216152d) && n51.f.a(this.f216153e, d2Var.f216153e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.d2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216154f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.c2 c2Var = this.f216152d;
            if (c2Var != null && zArr[1]) {
                fVar.i(1, c2Var.computeSize());
                this.f216152d.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.z1 z1Var = this.f216153e;
            if (z1Var != null && zArr[2]) {
                fVar.i(2, z1Var.computeSize());
                this.f216153e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.c2 c2Var2 = this.f216152d;
            if (c2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, c2Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.z1 z1Var2 = this.f216153e;
            return (z1Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, z1Var2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.chatbot.c2 c2Var3 = new com.tencent.wechat.aff.chatbot.c2();
                if (bArr != null && bArr.length > 0) {
                    c2Var3.parseFrom(bArr);
                }
                this.f216152d = c2Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.aff.chatbot.z1 z1Var3 = new com.tencent.wechat.aff.chatbot.z1();
            if (bArr2 != null && bArr2.length > 0) {
                z1Var3.parseFrom(bArr2);
            }
            this.f216153e = z1Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
