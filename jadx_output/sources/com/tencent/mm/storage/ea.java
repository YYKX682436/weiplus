package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class ea extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f193885d;

    /* renamed from: e, reason: collision with root package name */
    public long f193886e;

    /* renamed from: f, reason: collision with root package name */
    public int f193887f;

    /* renamed from: g, reason: collision with root package name */
    public int f193888g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f193889h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.ea)) {
            return false;
        }
        com.tencent.mm.storage.ea eaVar = (com.tencent.mm.storage.ea) fVar;
        return n51.f.a(this.f193885d, eaVar.f193885d) && n51.f.a(java.lang.Long.valueOf(this.f193886e), java.lang.Long.valueOf(eaVar.f193886e)) && n51.f.a(java.lang.Integer.valueOf(this.f193887f), java.lang.Integer.valueOf(eaVar.f193887f)) && n51.f.a(java.lang.Integer.valueOf(this.f193888g), java.lang.Integer.valueOf(eaVar.f193888g)) && n51.f.a(this.f193889h, eaVar.f193889h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f193889h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f193885d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f193886e);
            fVar.e(3, this.f193887f);
            fVar.e(4, this.f193888g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f193885d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f193886e) + b36.f.e(3, this.f193887f) + b36.f.e(4, this.f193888g) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.storage.ea eaVar = (com.tencent.mm.storage.ea) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eaVar.f193885d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eaVar.f193886e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            eaVar.f193887f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            eaVar.f193888g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.storage.t7 t7Var = new com.tencent.mm.storage.t7();
            if (bArr2 != null && bArr2.length > 0) {
                t7Var.parseFrom(bArr2);
            }
            eaVar.f193889h.add(t7Var);
        }
        return 0;
    }
}
