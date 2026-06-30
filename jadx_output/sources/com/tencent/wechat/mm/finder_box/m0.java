package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.g0 f219639d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219641f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f219640e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219642g = new boolean[7];

    static {
        new com.tencent.wechat.mm.finder_box.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.m0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.m0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.m0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.m0 m0Var = (com.tencent.wechat.mm.finder_box.m0) fVar;
        return n51.f.a(this.f219639d, m0Var.f219639d) && n51.f.a(this.f219640e, m0Var.f219640e) && n51.f.a(this.f219641f, m0Var.f219641f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219640e;
        boolean[] zArr = this.f219642g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.finder_box.g0 g0Var = this.f219639d;
            if (g0Var != null && zArr[1]) {
                fVar.i(1, g0Var.computeSize());
                this.f219639d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f219641f;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.finder_box.g0 g0Var2 = this.f219639d;
            if (g0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, g0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f219641f;
            return (str2 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str2);
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.mm.finder_box.g0 g0Var3 = new com.tencent.wechat.mm.finder_box.g0();
                if (bArr != null && bArr.length > 0) {
                    g0Var3.parseFrom(bArr);
                }
                this.f219639d = g0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 6) {
                return -1;
            }
            this.f219641f = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.mm.finder_box.l0 l0Var = new com.tencent.wechat.mm.finder_box.l0();
            if (bArr2 != null && bArr2.length > 0) {
                l0Var.parseFrom(bArr2);
            }
            linkedList.add(l0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
