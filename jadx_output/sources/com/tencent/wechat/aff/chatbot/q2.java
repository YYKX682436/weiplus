package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class q2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.p2 f216434d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.n2 f216435e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216436f;

    /* renamed from: g, reason: collision with root package name */
    public long f216437g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.o2 f216438h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216439i = new boolean[6];

    static {
        new com.tencent.wechat.aff.chatbot.q2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.q2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.q2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.q2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.q2 q2Var = (com.tencent.wechat.aff.chatbot.q2) fVar;
        return n51.f.a(this.f216434d, q2Var.f216434d) && n51.f.a(this.f216435e, q2Var.f216435e) && n51.f.a(this.f216436f, q2Var.f216436f) && n51.f.a(java.lang.Long.valueOf(this.f216437g), java.lang.Long.valueOf(q2Var.f216437g)) && n51.f.a(this.f216438h, q2Var.f216438h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.q2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216439i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.p2 p2Var = this.f216434d;
            if (p2Var != null && zArr[1]) {
                fVar.e(1, p2Var.f216426d);
            }
            com.tencent.wechat.aff.chatbot.n2 n2Var = this.f216435e;
            if (n2Var != null && zArr[2]) {
                fVar.e(2, n2Var.f216404d);
            }
            java.lang.String str = this.f216436f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f216437g);
            }
            com.tencent.wechat.aff.chatbot.o2 o2Var = this.f216438h;
            if (o2Var != null && zArr[5]) {
                fVar.i(5, o2Var.computeSize());
                this.f216438h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.p2 p2Var2 = this.f216434d;
            if (p2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, p2Var2.f216426d);
            }
            com.tencent.wechat.aff.chatbot.n2 n2Var2 = this.f216435e;
            if (n2Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, n2Var2.f216404d);
            }
            java.lang.String str2 = this.f216436f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f216437g);
            }
            com.tencent.wechat.aff.chatbot.o2 o2Var2 = this.f216438h;
            return (o2Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, o2Var2.computeSize());
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
        com.tencent.wechat.aff.chatbot.p2 p2Var3 = null;
        com.tencent.wechat.aff.chatbot.n2 n2Var3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                p2Var3 = com.tencent.wechat.aff.chatbot.p2.TYPE_TEXT;
            } else if (g17 == 1) {
                p2Var3 = com.tencent.wechat.aff.chatbot.p2.TYPE_WEBPAGE;
            } else if (g17 == 2) {
                p2Var3 = com.tencent.wechat.aff.chatbot.p2.TYPE_IMAGE;
            } else if (g17 == 3) {
                p2Var3 = com.tencent.wechat.aff.chatbot.p2.TYPE_FINDER;
            } else if (g17 == 4) {
                p2Var3 = com.tencent.wechat.aff.chatbot.p2.TYPE_TODO;
            }
            this.f216434d = p2Var3;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            int g18 = aVar2.g(intValue);
            if (g18 == 0) {
                n2Var3 = com.tencent.wechat.aff.chatbot.n2.USER;
            } else if (g18 == 1) {
                n2Var3 = com.tencent.wechat.aff.chatbot.n2.ASSISTANT;
            }
            this.f216435e = n2Var3;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216436f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f216437g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.chatbot.o2 o2Var3 = new com.tencent.wechat.aff.chatbot.o2();
            if (bArr != null && bArr.length > 0) {
                o2Var3.parseFrom(bArr);
            }
            this.f216438h = o2Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
