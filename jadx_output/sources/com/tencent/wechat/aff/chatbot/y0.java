package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216554d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216556f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f216555e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216557g = new boolean[4];

    static {
        new com.tencent.wechat.aff.chatbot.y0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.y0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.y0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.y0)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.y0 y0Var = (com.tencent.wechat.aff.chatbot.y0) fVar;
        return n51.f.a(this.f216554d, y0Var.f216554d) && n51.f.a(this.f216555e, y0Var.f216555e) && n51.f.a(this.f216556f, y0Var.f216556f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.y0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216555e;
        boolean[] zArr = this.f216557g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216554d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f216556f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f216554d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f216556f;
            return (str4 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str4);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f216554d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f216556f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.chatbot.x0 x0Var = new com.tencent.wechat.aff.chatbot.x0();
            if (bArr != null && bArr.length > 0) {
                x0Var.parseFrom(bArr);
            }
            linkedList.add(x0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
