package r45;

/* loaded from: classes2.dex */
public class vx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388646d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e90 f388647e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx5)) {
            return false;
        }
        r45.vx5 vx5Var = (r45.vx5) fVar;
        return n51.f.a(this.f388646d, vx5Var.f388646d) && n51.f.a(this.f388647e, vx5Var.f388647e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388646d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.e90 e90Var = this.f388647e;
            if (e90Var != null) {
                fVar.i(2, e90Var.computeSize());
                this.f388647e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388646d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.e90 e90Var2 = this.f388647e;
            return e90Var2 != null ? j17 + b36.f.i(2, e90Var2.computeSize()) : j17;
        }
        if (i17 == 2) {
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
        r45.vx5 vx5Var = (r45.vx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vx5Var.f388646d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.e90 e90Var3 = new r45.e90();
            if (bArr != null && bArr.length > 0) {
                e90Var3.parseFrom(bArr);
            }
            vx5Var.f388647e = e90Var3;
        }
        return 0;
    }
}
