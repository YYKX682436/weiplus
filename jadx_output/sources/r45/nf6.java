package r45;

/* loaded from: classes9.dex */
public class nf6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381364d;

    /* renamed from: e, reason: collision with root package name */
    public int f381365e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f381366f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf6)) {
            return false;
        }
        r45.nf6 nf6Var = (r45.nf6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381364d), java.lang.Integer.valueOf(nf6Var.f381364d)) && n51.f.a(java.lang.Integer.valueOf(this.f381365e), java.lang.Integer.valueOf(nf6Var.f381365e)) && n51.f.a(this.f381366f, nf6Var.f381366f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381366f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381364d);
            fVar.e(2, this.f381365e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f381364d) + 0 + b36.f.e(2, this.f381365e) + b36.f.g(3, 8, linkedList);
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
        r45.nf6 nf6Var = (r45.nf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nf6Var.f381364d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            nf6Var.f381365e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.cw4 cw4Var = new r45.cw4();
            if (bArr2 != null && bArr2.length > 0) {
                cw4Var.parseFrom(bArr2);
            }
            nf6Var.f381366f.add(cw4Var);
        }
        return 0;
    }
}
