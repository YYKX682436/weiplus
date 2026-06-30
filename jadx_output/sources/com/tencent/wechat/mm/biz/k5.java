package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class k5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.h5 f218251d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.i5 f218252e;

    /* renamed from: f, reason: collision with root package name */
    public int f218253f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218254g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.j5 f218255h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f218256i = new boolean[6];

    static {
        new com.tencent.wechat.mm.biz.k5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.k5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.k5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.k5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.k5 k5Var = (com.tencent.wechat.mm.biz.k5) fVar;
        return n51.f.a(this.f218251d, k5Var.f218251d) && n51.f.a(this.f218252e, k5Var.f218252e) && n51.f.a(java.lang.Integer.valueOf(this.f218253f), java.lang.Integer.valueOf(k5Var.f218253f)) && n51.f.a(this.f218254g, k5Var.f218254g) && n51.f.a(this.f218255h, k5Var.f218255h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.k5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218256i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.biz.h5 h5Var = this.f218251d;
            if (h5Var != null && zArr[1]) {
                fVar.i(1, h5Var.computeSize());
                this.f218251d.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.i5 i5Var = this.f218252e;
            if (i5Var != null && zArr[2]) {
                fVar.i(2, i5Var.computeSize());
                this.f218252e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218253f);
            }
            java.lang.String str = this.f218254g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.tencent.wechat.mm.biz.j5 j5Var = this.f218255h;
            if (j5Var != null && zArr[5]) {
                fVar.i(5, j5Var.computeSize());
                this.f218255h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.biz.h5 h5Var2 = this.f218251d;
            if (h5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, h5Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.i5 i5Var2 = this.f218252e;
            if (i5Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, i5Var2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f218253f);
            }
            java.lang.String str2 = this.f218254g;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            com.tencent.wechat.mm.biz.j5 j5Var2 = this.f218255h;
            return (j5Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, j5Var2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.mm.biz.h5 h5Var3 = new com.tencent.wechat.mm.biz.h5();
                if (bArr != null && bArr.length > 0) {
                    h5Var3.parseFrom(bArr);
                }
                this.f218251d = h5Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.mm.biz.i5 i5Var3 = new com.tencent.wechat.mm.biz.i5();
                if (bArr2 != null && bArr2.length > 0) {
                    i5Var3.parseFrom(bArr2);
                }
                this.f218252e = i5Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218253f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f218254g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.wechat.mm.biz.j5 j5Var3 = new com.tencent.wechat.mm.biz.j5();
            if (bArr3 != null && bArr3.length > 0) {
                j5Var3.parseFrom(bArr3);
            }
            this.f218255h = j5Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
