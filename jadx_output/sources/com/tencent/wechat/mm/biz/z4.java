package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class z4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218840d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218841e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f218842f = new boolean[3];

    static {
        new com.tencent.wechat.mm.biz.z4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.z4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.z4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.z4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.z4 z4Var = (com.tencent.wechat.mm.biz.z4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218840d), java.lang.Integer.valueOf(z4Var.f218840d)) && n51.f.a(this.f218841e, z4Var.f218841e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.z4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218842f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218840d);
            }
            java.lang.String str = this.f218841e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218840d) : 0;
            java.lang.String str2 = this.f218841e;
            return (str2 == null || !zArr[2]) ? e17 : e17 + b36.f.j(2, str2);
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
            this.f218840d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f218841e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
