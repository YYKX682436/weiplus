package r45;

/* loaded from: classes4.dex */
public class pq1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f383302d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383303e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f383304f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq1)) {
            return false;
        }
        r45.pq1 pq1Var = (r45.pq1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f383302d), java.lang.Long.valueOf(pq1Var.f383302d)) && n51.f.a(this.f383303e, pq1Var.f383303e) && n51.f.a(this.f383304f, pq1Var.f383304f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383304f;
        java.util.LinkedList linkedList2 = this.f383303e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f383302d);
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f383302d) + 0 + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.pq1 pq1Var = (r45.pq1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pq1Var.f383302d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.oq1 oq1Var = new r45.oq1();
                if (bArr2 != null && bArr2.length > 0) {
                    oq1Var.parseFrom(bArr2);
                }
                pq1Var.f383303e.add(oq1Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.kv1 kv1Var = new r45.kv1();
            if (bArr3 != null && bArr3.length > 0) {
                kv1Var.parseFrom(bArr3);
            }
            pq1Var.f383304f.add(kv1Var);
        }
        return 0;
    }
}
