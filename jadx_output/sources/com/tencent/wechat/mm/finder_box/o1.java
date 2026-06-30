package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class o1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f219692d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.w0 f219693e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.d2 f219694f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219695g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.o1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.o1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.o1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.o1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.o1 o1Var = (com.tencent.wechat.mm.finder_box.o1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f219692d), java.lang.Boolean.valueOf(o1Var.f219692d)) && n51.f.a(this.f219693e, o1Var.f219693e) && n51.f.a(this.f219694f, o1Var.f219694f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.o1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219695g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f219692d);
            }
            com.tencent.wechat.mm.finder_box.w0 w0Var = this.f219693e;
            if (w0Var != null && zArr[2]) {
                fVar.i(2, w0Var.computeSize());
                this.f219693e.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.d2 d2Var = this.f219694f;
            if (d2Var != null && zArr[3]) {
                fVar.i(3, d2Var.computeSize());
                this.f219694f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f219692d) : 0;
            com.tencent.wechat.mm.finder_box.w0 w0Var2 = this.f219693e;
            if (w0Var2 != null && zArr[2]) {
                a17 += b36.f.i(2, w0Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.d2 d2Var2 = this.f219694f;
            return (d2Var2 == null || !zArr[3]) ? a17 : a17 + b36.f.i(3, d2Var2.computeSize());
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
            this.f219692d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.finder_box.w0 w0Var3 = new com.tencent.wechat.mm.finder_box.w0();
                if (bArr != null && bArr.length > 0) {
                    w0Var3.parseFrom(bArr);
                }
                this.f219693e = w0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.finder_box.d2 d2Var3 = new com.tencent.wechat.mm.finder_box.d2();
            if (bArr2 != null && bArr2.length > 0) {
                d2Var3.parseFrom(bArr2);
            }
            this.f219694f = d2Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
