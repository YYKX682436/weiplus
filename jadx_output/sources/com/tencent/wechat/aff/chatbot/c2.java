package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class c2 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216121f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216122g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216123h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216124i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216125m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216126n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f216119d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f216120e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f216127o = new boolean[9];

    static {
        new com.tencent.wechat.aff.chatbot.c2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.c2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.c2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.c2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.c2 c2Var = (com.tencent.wechat.aff.chatbot.c2) fVar;
        return n51.f.a(this.f216119d, c2Var.f216119d) && n51.f.a(this.f216120e, c2Var.f216120e) && n51.f.a(this.f216121f, c2Var.f216121f) && n51.f.a(this.f216122g, c2Var.f216122g) && n51.f.a(this.f216123h, c2Var.f216123h) && n51.f.a(this.f216124i, c2Var.f216124i) && n51.f.a(this.f216125m, c2Var.f216125m) && n51.f.a(this.f216126n, c2Var.f216126n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.c2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216120e;
        java.util.LinkedList linkedList2 = this.f216119d;
        boolean[] zArr = this.f216127o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f216121f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f216122g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f216123h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f216124i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f216125m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f216126n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f216121f;
            if (str7 != null && zArr[3]) {
                g17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f216122g;
            if (str8 != null && zArr[4]) {
                g17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f216123h;
            if (str9 != null && zArr[5]) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f216124i;
            if (str10 != null && zArr[6]) {
                g17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f216125m;
            if (str11 != null && zArr[7]) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f216126n;
            return (str12 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str12);
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.chatbot.a2 a2Var = new com.tencent.wechat.aff.chatbot.a2();
                    if (bArr != null && bArr.length > 0) {
                        a2Var.parseFrom(bArr);
                    }
                    linkedList2.add(a2Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.chatbot.b2 b2Var = new com.tencent.wechat.aff.chatbot.b2();
                    if (bArr2 != null && bArr2.length > 0) {
                        b2Var.parseFrom(bArr2);
                    }
                    linkedList.add(b2Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f216121f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216122g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216123h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216124i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216125m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216126n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
