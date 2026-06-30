package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class r1 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.r1 f216440m = new com.tencent.wechat.aff.chatbot.r1();

    /* renamed from: d, reason: collision with root package name */
    public int f216441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216442e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216443f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f216444g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f216445h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216446i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.r1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.r1 r1Var = (com.tencent.wechat.aff.chatbot.r1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216441d), java.lang.Integer.valueOf(r1Var.f216441d)) && n51.f.a(this.f216442e, r1Var.f216442e) && n51.f.a(this.f216443f, r1Var.f216443f) && n51.f.a(this.f216444g, r1Var.f216444g) && n51.f.a(this.f216445h, r1Var.f216445h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.r1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216445h;
        java.util.LinkedList linkedList2 = this.f216444g;
        java.util.LinkedList linkedList3 = this.f216443f;
        boolean[] zArr = this.f216446i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216441d);
            }
            java.lang.String str = this.f216442e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216441d) : 0;
            java.lang.String str2 = this.f216442e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
            this.f216441d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216442e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.chatbot.m1 m1Var = new com.tencent.wechat.aff.chatbot.m1();
                if (bArr != null && bArr.length > 0) {
                    m1Var.parseFrom(bArr);
                }
                linkedList3.add(m1Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.aff.chatbot.q1 q1Var = new com.tencent.wechat.aff.chatbot.q1();
                if (bArr2 != null && bArr2.length > 0) {
                    q1Var.parseFrom(bArr2);
                }
                linkedList2.add(q1Var);
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.tencent.wechat.aff.chatbot.q1 q1Var2 = new com.tencent.wechat.aff.chatbot.q1();
            if (bArr3 != null && bArr3.length > 0) {
                q1Var2.parseFrom(bArr3);
            }
            linkedList.add(q1Var2);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.r1) super.parseFrom(bArr);
    }
}
