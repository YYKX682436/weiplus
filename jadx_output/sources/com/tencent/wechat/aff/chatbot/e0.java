package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.protobuf.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.e0 f216171p = new com.tencent.wechat.aff.chatbot.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216172d;

    /* renamed from: e, reason: collision with root package name */
    public long f216173e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216174f;

    /* renamed from: g, reason: collision with root package name */
    public long f216175g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216176h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216177i;

    /* renamed from: m, reason: collision with root package name */
    public long f216178m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f216179n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f216180o = new boolean[9];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.e0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.e0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.e0)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.e0 e0Var = (com.tencent.wechat.aff.chatbot.e0) fVar;
        return n51.f.a(this.f216172d, e0Var.f216172d) && n51.f.a(java.lang.Long.valueOf(this.f216173e), java.lang.Long.valueOf(e0Var.f216173e)) && n51.f.a(this.f216174f, e0Var.f216174f) && n51.f.a(java.lang.Long.valueOf(this.f216175g), java.lang.Long.valueOf(e0Var.f216175g)) && n51.f.a(this.f216176h, e0Var.f216176h) && n51.f.a(this.f216177i, e0Var.f216177i) && n51.f.a(java.lang.Long.valueOf(this.f216178m), java.lang.Long.valueOf(e0Var.f216178m)) && n51.f.a(java.lang.Boolean.valueOf(this.f216179n), java.lang.Boolean.valueOf(e0Var.f216179n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.e0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216180o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216172d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216173e);
            }
            java.lang.String str2 = this.f216174f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f216175g);
            }
            java.lang.String str3 = this.f216176h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f216177i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.h(7, this.f216178m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f216179n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216172d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f216173e);
            }
            java.lang.String str6 = this.f216174f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f216175g);
            }
            java.lang.String str7 = this.f216176h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f216177i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f216178m);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f216179n) : i18;
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
                this.f216172d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216173e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216174f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216175g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216176h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216177i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216178m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216179n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
