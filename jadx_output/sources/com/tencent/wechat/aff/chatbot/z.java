package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class z extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216569f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f216567d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f216568e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216570g = new boolean[4];

    static {
        new com.tencent.wechat.aff.chatbot.z();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.z parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.z) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.z)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.z zVar = (com.tencent.wechat.aff.chatbot.z) fVar;
        return n51.f.a(this.f216567d, zVar.f216567d) && n51.f.a(this.f216568e, zVar.f216568e) && n51.f.a(this.f216569f, zVar.f216569f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.z();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216568e;
        java.util.LinkedList linkedList2 = this.f216567d;
        boolean[] zArr = this.f216570g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f216569f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f216569f;
            return (str2 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str2);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.chatbot.s1 s1Var = new com.tencent.wechat.aff.chatbot.s1();
                if (bArr != null && bArr.length > 0) {
                    s1Var.parseFrom(bArr);
                }
                linkedList2.add(s1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f216569f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.chatbot.x xVar = new com.tencent.wechat.aff.chatbot.x();
            if (bArr2 != null && bArr2.length > 0) {
                xVar.parseFrom(bArr2);
            }
            linkedList.add(xVar);
        }
        zArr[2] = true;
        return 0;
    }
}
