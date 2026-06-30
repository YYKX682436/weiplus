package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class z1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216576d;

    /* renamed from: e, reason: collision with root package name */
    public long f216577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216578f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216580h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216581i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f216582m = new boolean[9];

    static {
        new com.tencent.wechat.aff.chatbot.z1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.z1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.z1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.z1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.z1 z1Var = (com.tencent.wechat.aff.chatbot.z1) fVar;
        return n51.f.a(this.f216576d, z1Var.f216576d) && n51.f.a(java.lang.Long.valueOf(this.f216577e), java.lang.Long.valueOf(z1Var.f216577e)) && n51.f.a(this.f216578f, z1Var.f216578f) && n51.f.a(this.f216579g, z1Var.f216579g) && n51.f.a(this.f216580h, z1Var.f216580h) && n51.f.a(this.f216581i, z1Var.f216581i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.z1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216582m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216576d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216577e);
            }
            java.lang.String str2 = this.f216578f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f216579g;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f216580h;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f216581i;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f216576d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f216577e);
            }
            java.lang.String str7 = this.f216578f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f216579g;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f216580h;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f216581i;
            return (str10 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str10);
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
            this.f216576d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216577e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216578f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 6) {
            this.f216579g = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        if (intValue == 7) {
            this.f216580h = aVar2.k(intValue);
            zArr[7] = true;
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        this.f216581i = aVar2.k(intValue);
        zArr[8] = true;
        return 0;
    }
}
