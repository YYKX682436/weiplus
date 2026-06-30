package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class w3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218752d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.y3 f218753e = new com.tencent.wechat.mm.biz.y3();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.v3 f218754f = new com.tencent.wechat.mm.biz.v3();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.u3 f218755g = new com.tencent.wechat.mm.biz.u3();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.s3 f218756h = new com.tencent.wechat.mm.biz.s3();

    static {
        new com.tencent.wechat.mm.biz.w3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.w3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.w3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.w3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.w3 w3Var = (com.tencent.wechat.mm.biz.w3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218752d), java.lang.Integer.valueOf(w3Var.f218752d)) && n51.f.a(this.f218753e, w3Var.f218753e) && n51.f.a(this.f218754f, w3Var.f218754f) && n51.f.a(this.f218755g, w3Var.f218755g) && n51.f.a(this.f218756h, w3Var.f218756h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.w3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f218752d);
            com.tencent.wechat.mm.biz.y3 y3Var = this.f218753e;
            if (y3Var != null) {
                fVar.i(2, y3Var.computeSize());
                this.f218753e.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.v3 v3Var = this.f218754f;
            if (v3Var != null) {
                fVar.i(3, v3Var.computeSize());
                this.f218754f.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.u3 u3Var = this.f218755g;
            if (u3Var != null) {
                fVar.i(4, u3Var.computeSize());
                this.f218755g.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.s3 s3Var = this.f218756h;
            if (s3Var != null) {
                fVar.i(5, s3Var.computeSize());
                this.f218756h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f218752d) + 0;
            com.tencent.wechat.mm.biz.y3 y3Var2 = this.f218753e;
            if (y3Var2 != null) {
                e17 += b36.f.i(2, y3Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.v3 v3Var2 = this.f218754f;
            if (v3Var2 != null) {
                e17 += b36.f.i(3, v3Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.u3 u3Var2 = this.f218755g;
            if (u3Var2 != null) {
                e17 += b36.f.i(4, u3Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.s3 s3Var2 = this.f218756h;
            return s3Var2 != null ? e17 + b36.f.i(5, s3Var2.computeSize()) : e17;
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
            this.f218752d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.biz.y3 y3Var3 = new com.tencent.wechat.mm.biz.y3();
                if (bArr != null && bArr.length > 0) {
                    y3Var3.parseFrom(bArr);
                }
                this.f218753e = y3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.biz.v3 v3Var3 = new com.tencent.wechat.mm.biz.v3();
                if (bArr2 != null && bArr2.length > 0) {
                    v3Var3.parseFrom(bArr2);
                }
                this.f218754f = v3Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.tencent.wechat.mm.biz.u3 u3Var3 = new com.tencent.wechat.mm.biz.u3();
                if (bArr3 != null && bArr3.length > 0) {
                    u3Var3.parseFrom(bArr3);
                }
                this.f218755g = u3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            com.tencent.wechat.mm.biz.s3 s3Var3 = new com.tencent.wechat.mm.biz.s3();
            if (bArr4 != null && bArr4.length > 0) {
                s3Var3.parseFrom(bArr4);
            }
            this.f218756h = s3Var3;
        }
        return 0;
    }
}
