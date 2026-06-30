package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class q1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219752f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219753g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f219754h = new boolean[5];

    static {
        new com.tencent.wechat.mm.finder_box.q1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.q1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.q1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.q1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.q1 q1Var = (com.tencent.wechat.mm.finder_box.q1) fVar;
        return n51.f.a(this.f219750d, q1Var.f219750d) && n51.f.a(this.f219751e, q1Var.f219751e) && n51.f.a(this.f219752f, q1Var.f219752f) && n51.f.a(this.f219753g, q1Var.f219753g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.q1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219754h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219750d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219751e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f219752f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f219753g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f219750d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f219751e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f219752f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f219753g;
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
            this.f219750d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219751e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219752f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f219753g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
