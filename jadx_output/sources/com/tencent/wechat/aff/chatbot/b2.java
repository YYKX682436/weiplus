package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class b2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216091f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216092g;

    /* renamed from: i, reason: collision with root package name */
    public int f216094i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f216093h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f216095m = new boolean[7];

    static {
        new com.tencent.wechat.aff.chatbot.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.b2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.b2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.b2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.b2 b2Var = (com.tencent.wechat.aff.chatbot.b2) fVar;
        return n51.f.a(this.f216089d, b2Var.f216089d) && n51.f.a(this.f216090e, b2Var.f216090e) && n51.f.a(this.f216091f, b2Var.f216091f) && n51.f.a(this.f216092g, b2Var.f216092g) && n51.f.a(this.f216093h, b2Var.f216093h) && n51.f.a(java.lang.Integer.valueOf(this.f216094i), java.lang.Integer.valueOf(b2Var.f216094i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216093h;
        int i18 = 0;
        boolean[] zArr = this.f216095m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216089d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216090e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216091f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f216092g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            fVar.g(5, 1, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f216094i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216089d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f216090e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f216091f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f216092g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            int g17 = i18 + b36.f.g(5, 1, linkedList);
            return zArr[6] ? g17 + b36.f.e(6, this.f216094i) : g17;
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
        switch (intValue) {
            case 1:
                this.f216089d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216090e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216091f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216092g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f216094i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
