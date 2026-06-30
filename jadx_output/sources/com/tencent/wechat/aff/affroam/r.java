package com.tencent.wechat.aff.affroam;

/* loaded from: classes4.dex */
public class r extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215968d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215969e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f215970f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215971g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f215972h = false;

    static {
        new com.tencent.wechat.aff.affroam.r();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.r)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.r rVar = (com.tencent.wechat.aff.affroam.r) fVar;
        return n51.f.a(this.f215968d, rVar.f215968d) && n51.f.a(this.f215969e, rVar.f215969e) && n51.f.a(java.lang.Long.valueOf(this.f215970f), java.lang.Long.valueOf(rVar.f215970f)) && n51.f.a(java.lang.Long.valueOf(this.f215971g), java.lang.Long.valueOf(rVar.f215971g)) && n51.f.a(java.lang.Boolean.valueOf(this.f215972h), java.lang.Boolean.valueOf(rVar.f215972h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.r();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215968d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f215969e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f215970f);
            fVar.h(4, this.f215971g);
            fVar.a(5, this.f215972h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f215968d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f215969e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f215970f) + b36.f.h(4, this.f215971g) + b36.f.a(5, this.f215972h);
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
            this.f215968d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215969e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f215970f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f215971g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f215972h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.r) super.parseFrom(bArr);
    }
}
