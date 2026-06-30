package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216060h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216061i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f216062m = new boolean[7];

    static {
        new com.tencent.wechat.aff.chatbot.a();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.a parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.a) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.a)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.a aVar = (com.tencent.wechat.aff.chatbot.a) fVar;
        return n51.f.a(this.f216056d, aVar.f216056d) && n51.f.a(this.f216057e, aVar.f216057e) && n51.f.a(this.f216058f, aVar.f216058f) && n51.f.a(this.f216059g, aVar.f216059g) && n51.f.a(this.f216060h, aVar.f216060h) && n51.f.a(this.f216061i, aVar.f216061i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216062m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216056d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216057e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216058f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f216059g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f216060h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f216061i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f216056d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f216057e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f216058f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f216059g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f216060h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f216061i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f216056d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216057e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216058f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216059g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216060h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216061i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
