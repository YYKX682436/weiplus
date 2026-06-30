package r45;

/* loaded from: classes2.dex */
public class hb7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376029d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f376030e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f376031f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb7)) {
            return false;
        }
        r45.hb7 hb7Var = (r45.hb7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376029d), java.lang.Integer.valueOf(hb7Var.f376029d)) && n51.f.a(this.f376030e, hb7Var.f376030e) && n51.f.a(this.f376031f, hb7Var.f376031f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376031f;
        java.util.LinkedList linkedList2 = this.f376030e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376029d);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376029d) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 8, linkedList);
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
        r45.hb7 hb7Var = (r45.hb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb7Var.f376029d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb7Var.f376030e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.gb7 gb7Var = new r45.gb7();
            if (bArr2 != null && bArr2.length > 0) {
                gb7Var.parseFrom(bArr2);
            }
            hb7Var.f376031f.add(gb7Var);
        }
        return 0;
    }
}
