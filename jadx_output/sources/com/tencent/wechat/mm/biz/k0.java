package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class k0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f218236d;

    /* renamed from: e, reason: collision with root package name */
    public long f218237e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218238f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f218239g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218240h = new boolean[5];

    static {
        new com.tencent.wechat.mm.biz.k0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.k0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.k0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.k0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.k0 k0Var = (com.tencent.wechat.mm.biz.k0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218236d), java.lang.Long.valueOf(k0Var.f218236d)) && n51.f.a(java.lang.Long.valueOf(this.f218237e), java.lang.Long.valueOf(k0Var.f218237e)) && n51.f.a(this.f218238f, k0Var.f218238f) && n51.f.a(this.f218239g, k0Var.f218239g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.k0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218239g;
        boolean[] zArr = this.f218240h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218236d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218237e);
            }
            java.lang.String str = this.f218238f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f218236d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f218237e);
            }
            java.lang.String str2 = this.f218238f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 8, linkedList);
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
            this.f218236d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218237e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218238f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.l0 l0Var = new com.tencent.wechat.mm.biz.l0();
            if (bArr != null && bArr.length > 0) {
                l0Var.parseFrom(bArr);
            }
            linkedList.add(l0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
