package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.i4 f219264e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219263d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f219265f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219266g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.a1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.a1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.a1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.a1 a1Var = (com.tencent.wechat.mm.finder_box.a1) fVar;
        return n51.f.a(this.f219263d, a1Var.f219263d) && n51.f.a(this.f219264e, a1Var.f219264e) && n51.f.a(this.f219265f, a1Var.f219265f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219265f;
        java.util.LinkedList linkedList2 = this.f219263d;
        boolean[] zArr = this.f219266g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            com.tencent.wechat.mm.finder_box.i4 i4Var = this.f219264e;
            if (i4Var != null && zArr[2]) {
                fVar.i(2, i4Var.computeSize());
                this.f219264e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            com.tencent.wechat.mm.finder_box.i4 i4Var2 = this.f219264e;
            if (i4Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, i4Var2.computeSize());
            }
            return g17 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                com.tencent.wechat.mm.finder_box.z0 z0Var = new com.tencent.wechat.mm.finder_box.z0();
                if (bArr != null && bArr.length > 0) {
                    z0Var.parseFrom(bArr);
                }
                linkedList2.add(z0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.finder_box.i4 i4Var3 = new com.tencent.wechat.mm.finder_box.i4();
                if (bArr2 != null && bArr2.length > 0) {
                    i4Var3.parseFrom(bArr2);
                }
                this.f219264e = i4Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.tencent.wechat.mm.finder_box.i4 i4Var4 = new com.tencent.wechat.mm.finder_box.i4();
            if (bArr3 != null && bArr3.length > 0) {
                i4Var4.parseFrom(bArr3);
            }
            linkedList.add(i4Var4);
        }
        zArr[3] = true;
        return 0;
    }
}
