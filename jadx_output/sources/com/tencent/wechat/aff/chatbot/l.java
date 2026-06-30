package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f216341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216342e;

    /* renamed from: f, reason: collision with root package name */
    public long f216343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216344g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216345h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f216346i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f216347m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216348n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f216349o = new boolean[9];

    static {
        new com.tencent.wechat.aff.chatbot.l();
    }

    public java.lang.String b() {
        return this.f216349o[8] ? this.f216348n : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.l parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.l) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.l)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.l lVar = (com.tencent.wechat.aff.chatbot.l) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f216341d), java.lang.Long.valueOf(lVar.f216341d)) && n51.f.a(this.f216342e, lVar.f216342e) && n51.f.a(java.lang.Long.valueOf(this.f216343f), java.lang.Long.valueOf(lVar.f216343f)) && n51.f.a(this.f216344g, lVar.f216344g) && n51.f.a(this.f216345h, lVar.f216345h) && n51.f.a(java.lang.Boolean.valueOf(this.f216346i), java.lang.Boolean.valueOf(lVar.f216346i)) && n51.f.a(java.lang.Boolean.valueOf(this.f216347m), java.lang.Boolean.valueOf(lVar.f216347m)) && n51.f.a(this.f216348n, lVar.f216348n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.l();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216349o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f216341d);
            }
            java.lang.String str = this.f216342e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f216343f);
            }
            java.lang.String str2 = this.f216344g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f216345h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.a(6, this.f216346i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f216347m);
            }
            java.lang.String str4 = this.f216348n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f216341d) : 0;
            java.lang.String str5 = this.f216342e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f216343f);
            }
            java.lang.String str6 = this.f216344g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f216345h;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f216346i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f216347m);
            }
            java.lang.String str8 = this.f216348n;
            return (str8 == null || !zArr[8]) ? h17 : h17 + b36.f.j(8, str8);
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
                this.f216341d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216342e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216343f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216344g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216345h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216346i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216347m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216348n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
