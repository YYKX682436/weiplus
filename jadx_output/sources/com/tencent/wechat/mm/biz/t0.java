package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class t0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.n0 f218630d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218632f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218631e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218633g = new boolean[7];

    static {
        new com.tencent.wechat.mm.biz.t0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.t0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.t0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.t0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.t0 t0Var = (com.tencent.wechat.mm.biz.t0) fVar;
        return n51.f.a(this.f218630d, t0Var.f218630d) && n51.f.a(this.f218631e, t0Var.f218631e) && n51.f.a(this.f218632f, t0Var.f218632f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.t0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218631e;
        boolean[] zArr = this.f218633g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.biz.n0 n0Var = this.f218630d;
            if (n0Var != null && zArr[1]) {
                fVar.i(1, n0Var.computeSize());
                this.f218630d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f218632f;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.biz.n0 n0Var2 = this.f218630d;
            if (n0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, n0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f218632f;
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
                com.tencent.wechat.mm.biz.n0 n0Var3 = new com.tencent.wechat.mm.biz.n0();
                if (bArr != null && bArr.length > 0) {
                    n0Var3.parseFrom(bArr);
                }
                this.f218630d = n0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 6) {
                return -1;
            }
            this.f218632f = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.mm.biz.s0 s0Var = new com.tencent.wechat.mm.biz.s0();
            if (bArr2 != null && bArr2.length > 0) {
                s0Var.parseFrom(bArr2);
            }
            linkedList.add(s0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
