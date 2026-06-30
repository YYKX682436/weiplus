package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class fa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f193938d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f193939e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.fa)) {
            return false;
        }
        com.tencent.mm.storage.fa faVar = (com.tencent.mm.storage.fa) fVar;
        return n51.f.a(this.f193938d, faVar.f193938d) && n51.f.a(java.lang.Long.valueOf(this.f193939e), java.lang.Long.valueOf(faVar.f193939e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f193938d);
            fVar.h(2, this.f193939e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f193938d) + 0 + b36.f.h(2, this.f193939e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f193938d.clear();
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
        com.tencent.mm.storage.fa faVar = (com.tencent.mm.storage.fa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            faVar.f193939e = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.storage.ea eaVar = new com.tencent.mm.storage.ea();
            if (bArr2 != null && bArr2.length > 0) {
                eaVar.parseFrom(bArr2);
            }
            faVar.f193938d.add(eaVar);
        }
        return 0;
    }
}
