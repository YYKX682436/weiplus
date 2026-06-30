package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class l3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219629d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.d3 f219631f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219632g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.k3 f219633h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f219630e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f219634i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.l3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.l3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.l3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.l3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.l3 l3Var = (com.tencent.wechat.mm.finder_box.l3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219629d), java.lang.Integer.valueOf(l3Var.f219629d)) && n51.f.a(this.f219630e, l3Var.f219630e) && n51.f.a(this.f219631f, l3Var.f219631f) && n51.f.a(this.f219632g, l3Var.f219632g) && n51.f.a(this.f219633h, l3Var.f219633h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.l3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219630e;
        boolean[] zArr = this.f219634i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219629d);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.wechat.mm.finder_box.d3 d3Var = this.f219631f;
            if (d3Var != null && zArr[3]) {
                fVar.i(3, d3Var.computeSize());
                this.f219631f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f219632g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            com.tencent.wechat.mm.finder_box.k3 k3Var = this.f219633h;
            if (k3Var != null && zArr[5]) {
                fVar.e(5, k3Var.f219588d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f219629d) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.wechat.mm.finder_box.d3 d3Var2 = this.f219631f;
            if (d3Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, d3Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219632g;
            if (gVar2 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            com.tencent.wechat.mm.finder_box.k3 k3Var2 = this.f219633h;
            return (k3Var2 == null || !zArr[5]) ? e17 : e17 + b36.f.e(5, k3Var2.f219588d);
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
            this.f219629d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.finder_box.a3 a3Var = new com.tencent.wechat.mm.finder_box.a3();
                if (bArr != null && bArr.length > 0) {
                    a3Var.parseFrom(bArr);
                }
                linkedList.add(a3Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f219632g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            int g17 = aVar2.g(intValue);
            this.f219633h = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.finder_box.k3.BoxFinderShowType_FINDER_RECOMMEND_HORIZON : com.tencent.wechat.mm.finder_box.k3.BoxFinderShowType_FINDER_NORMAL : com.tencent.wechat.mm.finder_box.k3.BoxFinderShowType_DEFAULT;
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.finder_box.d3 d3Var3 = new com.tencent.wechat.mm.finder_box.d3();
            if (bArr2 != null && bArr2.length > 0) {
                d3Var3.parseFrom(bArr2);
            }
            this.f219631f = d3Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
