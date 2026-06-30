package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f215801d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f215802e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215803f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f215804g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f215805h = 0;

    static {
        new com.tencent.wechat.aff.affroam.c0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.c0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.c0 c0Var = (com.tencent.wechat.aff.affroam.c0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f215801d), java.lang.Integer.valueOf(c0Var.f215801d)) && n51.f.a(java.lang.Boolean.valueOf(this.f215802e), java.lang.Boolean.valueOf(c0Var.f215802e)) && n51.f.a(this.f215803f, c0Var.f215803f) && n51.f.a(java.lang.Boolean.valueOf(this.f215804g), java.lang.Boolean.valueOf(c0Var.f215804g)) && n51.f.a(java.lang.Integer.valueOf(this.f215805h), java.lang.Integer.valueOf(c0Var.f215805h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.c0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f215801d);
            fVar.a(2, this.f215802e);
            java.lang.String str = this.f215803f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f215804g);
            fVar.e(5, this.f215805h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f215801d) + 0 + b36.f.a(2, this.f215802e);
            java.lang.String str2 = this.f215803f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.a(4, this.f215804g) + b36.f.e(5, this.f215805h);
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
            this.f215801d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215802e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f215803f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f215804g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f215805h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.c0) super.parseFrom(bArr);
    }
}
