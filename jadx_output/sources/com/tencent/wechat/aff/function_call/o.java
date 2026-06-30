package com.tencent.wechat.aff.function_call;

/* loaded from: classes11.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.function_call.o f216905i = new com.tencent.wechat.aff.function_call.o();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216906d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216907e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216908f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216909g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216910h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.function_call.o)) {
            return false;
        }
        com.tencent.wechat.aff.function_call.o oVar = (com.tencent.wechat.aff.function_call.o) fVar;
        return n51.f.a(this.f216906d, oVar.f216906d) && n51.f.a(this.f216907e, oVar.f216907e) && n51.f.a(this.f216908f, oVar.f216908f) && n51.f.a(this.f216909g, oVar.f216909g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.function_call.o();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216910h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216906d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216907e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216908f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f216909g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216906d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f216907e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f216908f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f216909g;
            return (str8 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str8);
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
            this.f216906d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216907e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216908f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f216909g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.function_call.o) super.parseFrom(bArr);
    }
}
