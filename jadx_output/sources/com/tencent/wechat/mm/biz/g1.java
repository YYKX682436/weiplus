package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.g1 f218065i = new com.tencent.wechat.mm.biz.g1();

    /* renamed from: e, reason: collision with root package name */
    public boolean f218067e;

    /* renamed from: f, reason: collision with root package name */
    public int f218068f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.o5 f218069g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218066d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218070h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.g1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.g1 g1Var = (com.tencent.wechat.mm.biz.g1) fVar;
        return n51.f.a(this.f218066d, g1Var.f218066d) && n51.f.a(java.lang.Boolean.valueOf(this.f218067e), java.lang.Boolean.valueOf(g1Var.f218067e)) && n51.f.a(java.lang.Integer.valueOf(this.f218068f), java.lang.Integer.valueOf(g1Var.f218068f)) && n51.f.a(this.f218069g, g1Var.f218069g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218066d;
        boolean[] zArr = this.f218070h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f218067e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218068f);
            }
            com.tencent.wechat.mm.biz.o5 o5Var = this.f218069g;
            if (o5Var != null && zArr[4]) {
                fVar.i(4, o5Var.computeSize());
                this.f218069g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.a(2, this.f218067e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f218068f);
            }
            com.tencent.wechat.mm.biz.o5 o5Var2 = this.f218069g;
            return (o5Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, o5Var2.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.biz.f1 f1Var = new com.tencent.wechat.mm.biz.f1();
                if (bArr != null && bArr.length > 0) {
                    f1Var.parseFrom(bArr);
                }
                linkedList.add(f1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218067e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218068f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.biz.o5 o5Var3 = new com.tencent.wechat.mm.biz.o5();
            if (bArr2 != null && bArr2.length > 0) {
                o5Var3.parseFrom(bArr2);
            }
            this.f218069g = o5Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.g1) super.parseFrom(bArr);
    }
}
