package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class a2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216068d;

    /* renamed from: e, reason: collision with root package name */
    public int f216069e;

    /* renamed from: f, reason: collision with root package name */
    public int f216070f;

    /* renamed from: g, reason: collision with root package name */
    public long f216071g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216072h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216073i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216074m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f216075n = new boolean[8];

    static {
        new com.tencent.wechat.aff.chatbot.a2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.a2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.a2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.a2)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.a2 a2Var = (com.tencent.wechat.aff.chatbot.a2) fVar;
        return n51.f.a(this.f216068d, a2Var.f216068d) && n51.f.a(java.lang.Integer.valueOf(this.f216069e), java.lang.Integer.valueOf(a2Var.f216069e)) && n51.f.a(java.lang.Integer.valueOf(this.f216070f), java.lang.Integer.valueOf(a2Var.f216070f)) && n51.f.a(java.lang.Long.valueOf(this.f216071g), java.lang.Long.valueOf(a2Var.f216071g)) && n51.f.a(this.f216072h, a2Var.f216072h) && n51.f.a(this.f216073i, a2Var.f216073i) && n51.f.a(this.f216074m, a2Var.f216074m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.a2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216075n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216068d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f216069e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216070f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f216071g);
            }
            java.lang.String str2 = this.f216072h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f216073i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f216074m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216068d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f216069e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f216070f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f216071g);
            }
            java.lang.String str6 = this.f216072h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f216073i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f216074m;
            return (str8 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str8);
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
        switch (intValue) {
            case 1:
                this.f216068d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216069e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216070f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216071g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216072h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216073i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216074m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
