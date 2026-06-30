package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
public class v1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216489d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.u1 f216490e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216491f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216492g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216493h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216494i = new boolean[6];

    static {
        new com.tencent.wechat.aff.chatbot.v1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.v1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.v1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.v1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.v1 v1Var = (com.tencent.wechat.aff.chatbot.v1) fVar;
        return n51.f.a(this.f216489d, v1Var.f216489d) && n51.f.a(this.f216490e, v1Var.f216490e) && n51.f.a(this.f216491f, v1Var.f216491f) && n51.f.a(this.f216492g, v1Var.f216492g) && n51.f.a(this.f216493h, v1Var.f216493h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.v1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216494i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216489d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.chatbot.u1 u1Var = this.f216490e;
            if (u1Var != null && zArr[2]) {
                fVar.e(2, u1Var.f216482d);
            }
            java.lang.String str2 = this.f216491f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f216492g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f216493h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216489d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            com.tencent.wechat.aff.chatbot.u1 u1Var2 = this.f216490e;
            if (u1Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, u1Var2.f216482d);
            }
            java.lang.String str6 = this.f216491f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f216492g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f216493h;
            return (str8 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str8);
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
            this.f216489d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            int g17 = aVar2.g(intValue);
            this.f216490e = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.aff.chatbot.u1.APPMSG_COMMENT : com.tencent.wechat.aff.chatbot.u1.PROFILE : com.tencent.wechat.aff.chatbot.u1.PREVIED;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216491f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f216492g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f216493h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
