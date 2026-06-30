package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.y0 f219976i = new com.tencent.wechat.mm.finder_box.y0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f219978e;

    /* renamed from: f, reason: collision with root package name */
    public int f219979f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.d4 f219980g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219977d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f219981h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.y0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.y0 y0Var = (com.tencent.wechat.mm.finder_box.y0) fVar;
        return n51.f.a(this.f219977d, y0Var.f219977d) && n51.f.a(java.lang.Boolean.valueOf(this.f219978e), java.lang.Boolean.valueOf(y0Var.f219978e)) && n51.f.a(java.lang.Integer.valueOf(this.f219979f), java.lang.Integer.valueOf(y0Var.f219979f)) && n51.f.a(this.f219980g, y0Var.f219980g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.y0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219977d;
        boolean[] zArr = this.f219981h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f219978e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219979f);
            }
            com.tencent.wechat.mm.finder_box.d4 d4Var = this.f219980g;
            if (d4Var != null && zArr[4]) {
                fVar.i(4, d4Var.computeSize());
                this.f219980g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.a(2, this.f219978e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f219979f);
            }
            com.tencent.wechat.mm.finder_box.d4 d4Var2 = this.f219980g;
            return (d4Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, d4Var2.computeSize());
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
                com.tencent.wechat.mm.finder_box.x0 x0Var = new com.tencent.wechat.mm.finder_box.x0();
                if (bArr != null && bArr.length > 0) {
                    x0Var.parseFrom(bArr);
                }
                linkedList.add(x0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219978e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219979f = aVar2.g(intValue);
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
            com.tencent.wechat.mm.finder_box.d4 d4Var3 = new com.tencent.wechat.mm.finder_box.d4();
            if (bArr2 != null && bArr2.length > 0) {
                d4Var3.parseFrom(bArr2);
            }
            this.f219980g = d4Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.y0) super.parseFrom(bArr);
    }
}
