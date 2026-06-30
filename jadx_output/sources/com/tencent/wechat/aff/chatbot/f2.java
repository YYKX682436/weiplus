package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class f2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216204e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216205f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f216206g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216207h = new boolean[5];

    static {
        new com.tencent.wechat.aff.chatbot.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.f2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.f2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.f2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.f2 f2Var = (com.tencent.wechat.aff.chatbot.f2) fVar;
        return n51.f.a(this.f216203d, f2Var.f216203d) && n51.f.a(this.f216204e, f2Var.f216204e) && n51.f.a(this.f216205f, f2Var.f216205f) && n51.f.a(this.f216206g, f2Var.f216206g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216206g;
        java.util.LinkedList linkedList2 = this.f216205f;
        boolean[] zArr = this.f216207h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216203d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216204e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f216203d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f216204e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
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
            this.f216203d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216204e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.chatbot.e2 e2Var = new com.tencent.wechat.aff.chatbot.e2();
            if (bArr != null && bArr.length > 0) {
                e2Var.parseFrom(bArr);
            }
            linkedList.add(e2Var);
        }
        zArr[4] = true;
        return 0;
    }
}
