package r45;

/* loaded from: classes8.dex */
public class gw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375558d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f375559e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f375560f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gw3)) {
            return false;
        }
        r45.gw3 gw3Var = (r45.gw3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375558d), java.lang.Integer.valueOf(gw3Var.f375558d)) && n51.f.a(this.f375559e, gw3Var.f375559e) && n51.f.a(java.lang.Integer.valueOf(this.f375560f), java.lang.Integer.valueOf(gw3Var.f375560f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375559e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375558d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f375560f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f375558d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f375560f);
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
        r45.gw3 gw3Var = (r45.gw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gw3Var.f375558d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            gw3Var.f375560f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.bq4 bq4Var = new r45.bq4();
            if (bArr2 != null && bArr2.length > 0) {
                bq4Var.parseFrom(bArr2);
            }
            gw3Var.f375559e.add(bq4Var);
        }
        return 0;
    }
}
