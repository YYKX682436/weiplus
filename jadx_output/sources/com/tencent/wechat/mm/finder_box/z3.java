package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class z3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.w3 f220025d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.x3 f220026e;

    /* renamed from: f, reason: collision with root package name */
    public int f220027f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220028g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.y3 f220029h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f220030i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.z3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.z3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.z3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.z3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.z3 z3Var = (com.tencent.wechat.mm.finder_box.z3) fVar;
        return n51.f.a(this.f220025d, z3Var.f220025d) && n51.f.a(this.f220026e, z3Var.f220026e) && n51.f.a(java.lang.Integer.valueOf(this.f220027f), java.lang.Integer.valueOf(z3Var.f220027f)) && n51.f.a(this.f220028g, z3Var.f220028g) && n51.f.a(this.f220029h, z3Var.f220029h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.z3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f220030i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.finder_box.w3 w3Var = this.f220025d;
            if (w3Var != null && zArr[1]) {
                fVar.i(1, w3Var.computeSize());
                this.f220025d.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.x3 x3Var = this.f220026e;
            if (x3Var != null && zArr[2]) {
                fVar.i(2, x3Var.computeSize());
                this.f220026e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f220027f);
            }
            java.lang.String str = this.f220028g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.tencent.wechat.mm.finder_box.y3 y3Var = this.f220029h;
            if (y3Var != null && zArr[5]) {
                fVar.i(5, y3Var.computeSize());
                this.f220029h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.finder_box.w3 w3Var2 = this.f220025d;
            if (w3Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, w3Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.x3 x3Var2 = this.f220026e;
            if (x3Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, x3Var2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f220027f);
            }
            java.lang.String str2 = this.f220028g;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            com.tencent.wechat.mm.finder_box.y3 y3Var2 = this.f220029h;
            return (y3Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, y3Var2.computeSize());
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
                com.tencent.wechat.mm.finder_box.w3 w3Var3 = new com.tencent.wechat.mm.finder_box.w3();
                if (bArr != null && bArr.length > 0) {
                    w3Var3.parseFrom(bArr);
                }
                this.f220025d = w3Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.mm.finder_box.x3 x3Var3 = new com.tencent.wechat.mm.finder_box.x3();
                if (bArr2 != null && bArr2.length > 0) {
                    x3Var3.parseFrom(bArr2);
                }
                this.f220026e = x3Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f220027f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f220028g = aVar2.k(intValue);
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
            com.tencent.wechat.mm.finder_box.y3 y3Var3 = new com.tencent.wechat.mm.finder_box.y3();
            if (bArr3 != null && bArr3.length > 0) {
                y3Var3.parseFrom(bArr3);
            }
            this.f220029h = y3Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
