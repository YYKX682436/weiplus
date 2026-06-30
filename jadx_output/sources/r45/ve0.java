package r45;

/* loaded from: classes11.dex */
public class ve0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388148d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f388149e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve0)) {
            return false;
        }
        r45.ve0 ve0Var = (r45.ve0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388148d), java.lang.Integer.valueOf(ve0Var.f388148d)) && n51.f.a(this.f388149e, ve0Var.f388149e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388148d);
            fVar.g(2, 8, this.f388149e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f388148d) + 0 + b36.f.g(2, 8, this.f388149e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388149e.clear();
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
        r45.ve0 ve0Var = (r45.ve0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ve0Var.f388148d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ue0 ue0Var = new r45.ue0();
            if (bArr2 != null && bArr2.length > 0) {
                ue0Var.parseFrom(bArr2);
            }
            ve0Var.f388149e.add(ue0Var);
        }
        return 0;
    }
}
