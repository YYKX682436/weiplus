package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class j0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.j0 f218208m = new com.tencent.wechat.mm.biz.j0();

    /* renamed from: d, reason: collision with root package name */
    public int f218209d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218210e;

    /* renamed from: f, reason: collision with root package name */
    public long f218211f;

    /* renamed from: g, reason: collision with root package name */
    public long f218212g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f218213h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f218214i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.j0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.j0 j0Var = (com.tencent.wechat.mm.biz.j0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218209d), java.lang.Integer.valueOf(j0Var.f218209d)) && n51.f.a(this.f218210e, j0Var.f218210e) && n51.f.a(java.lang.Long.valueOf(this.f218211f), java.lang.Long.valueOf(j0Var.f218211f)) && n51.f.a(java.lang.Long.valueOf(this.f218212g), java.lang.Long.valueOf(j0Var.f218212g)) && n51.f.a(this.f218213h, j0Var.f218213h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.j0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218213h;
        boolean[] zArr = this.f218214i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218209d);
            }
            java.lang.String str = this.f218210e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f218211f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f218212g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f218209d) : 0;
            java.lang.String str2 = this.f218210e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f218211f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f218212g);
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
            this.f218209d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f218210e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f218211f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f218212g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.k0 k0Var = new com.tencent.wechat.mm.biz.k0();
            if (bArr != null && bArr.length > 0) {
                k0Var.parseFrom(bArr);
            }
            linkedList.add(k0Var);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.j0) super.parseFrom(bArr);
    }
}
