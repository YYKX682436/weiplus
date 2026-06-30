package r45;

/* loaded from: classes4.dex */
public class vl1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f388343d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f388344e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl1)) {
            return false;
        }
        r45.vl1 vl1Var = (r45.vl1) fVar;
        return n51.f.a(this.f388343d, vl1Var.f388343d) && n51.f.a(java.lang.Long.valueOf(this.f388344e), java.lang.Long.valueOf(vl1Var.f388344e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388343d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.h(2, this.f388344e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.h(2, this.f388344e);
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
        r45.vl1 vl1Var = (r45.vl1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            vl1Var.f388344e = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.wl1 wl1Var = new r45.wl1();
            if (bArr2 != null && bArr2.length > 0) {
                wl1Var.parseFrom(bArr2);
            }
            vl1Var.f388343d.add(wl1Var);
        }
        return 0;
    }
}
