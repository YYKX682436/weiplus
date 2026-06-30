package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class w0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f219897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219898f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.k1 f219899g;

    /* renamed from: i, reason: collision with root package name */
    public int f219901i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f219896d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f219900h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f219902m = new boolean[8];

    static {
        new com.tencent.wechat.mm.finder_box.w0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.w0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.w0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.w0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.w0 w0Var = (com.tencent.wechat.mm.finder_box.w0) fVar;
        return n51.f.a(this.f219896d, w0Var.f219896d) && n51.f.a(java.lang.Integer.valueOf(this.f219897e), java.lang.Integer.valueOf(w0Var.f219897e)) && n51.f.a(this.f219898f, w0Var.f219898f) && n51.f.a(this.f219899g, w0Var.f219899g) && n51.f.a(this.f219900h, w0Var.f219900h) && n51.f.a(java.lang.Integer.valueOf(this.f219901i), java.lang.Integer.valueOf(w0Var.f219901i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.w0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219900h;
        java.util.LinkedList linkedList2 = this.f219896d;
        boolean[] zArr = this.f219902m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f219897e);
            }
            java.lang.String str = this.f219898f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            com.tencent.wechat.mm.finder_box.k1 k1Var = this.f219899g;
            if (k1Var != null && zArr[5]) {
                fVar.i(5, k1Var.computeSize());
                this.f219899g.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f219901i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f219897e);
            }
            java.lang.String str2 = this.f219898f;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            com.tencent.wechat.mm.finder_box.k1 k1Var2 = this.f219899g;
            if (k1Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, k1Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            return zArr[7] ? g18 + b36.f.e(7, this.f219901i) : g18;
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
                com.tencent.wechat.mm.finder_box.v0 v0Var = new com.tencent.wechat.mm.finder_box.v0();
                if (bArr != null && bArr.length > 0) {
                    v0Var.parseFrom(bArr);
                }
                linkedList2.add(v0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219897e = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f219898f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.finder_box.k1 k1Var3 = new com.tencent.wechat.mm.finder_box.k1();
                if (bArr2 != null && bArr2.length > 0) {
                    k1Var3.parseFrom(bArr2);
                }
                this.f219899g = k1Var3;
            }
            zArr[5] = true;
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            this.f219901i = aVar2.g(intValue);
            zArr[7] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.tencent.wechat.mm.finder_box.v0 v0Var2 = new com.tencent.wechat.mm.finder_box.v0();
            if (bArr3 != null && bArr3.length > 0) {
                v0Var2.parseFrom(bArr3);
            }
            linkedList.add(v0Var2);
        }
        zArr[6] = true;
        return 0;
    }
}
