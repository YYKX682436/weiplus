package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class r2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f216447d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f216448e = new boolean[2];

    static {
        new com.tencent.wechat.aff.chatbot.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.r2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.r2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.chatbot.r2) && n51.f.a(this.f216447d, ((com.tencent.wechat.aff.chatbot.r2) fVar).f216447d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f216447d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f216447d) + 0;
        }
        if (i17 == 2) {
            this.f216447d.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.chatbot.q2 q2Var = new com.tencent.wechat.aff.chatbot.q2();
            if (bArr != null && bArr.length > 0) {
                q2Var.parseFrom(bArr);
            }
            this.f216447d.add(q2Var);
        }
        this.f216448e[1] = true;
        return 0;
    }
}
