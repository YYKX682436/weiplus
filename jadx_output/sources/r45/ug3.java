package r45;

/* loaded from: classes2.dex */
public class ug3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387344d;

    /* renamed from: e, reason: collision with root package name */
    public int f387345e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nv3 f387346f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug3)) {
            return false;
        }
        r45.ug3 ug3Var = (r45.ug3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387344d), java.lang.Integer.valueOf(ug3Var.f387344d)) && n51.f.a(java.lang.Integer.valueOf(this.f387345e), java.lang.Integer.valueOf(ug3Var.f387345e)) && n51.f.a(this.f387346f, ug3Var.f387346f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387344d);
            fVar.e(2, this.f387345e);
            r45.nv3 nv3Var = this.f387346f;
            if (nv3Var != null) {
                fVar.i(3, nv3Var.computeSize());
                this.f387346f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387344d) + 0 + b36.f.e(2, this.f387345e);
            r45.nv3 nv3Var2 = this.f387346f;
            return nv3Var2 != null ? e17 + b36.f.i(3, nv3Var2.computeSize()) : e17;
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
        r45.ug3 ug3Var = (r45.ug3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ug3Var.f387344d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ug3Var.f387345e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.nv3 nv3Var3 = new r45.nv3();
            if (bArr != null && bArr.length > 0) {
                nv3Var3.parseFrom(bArr);
            }
            ug3Var.f387346f = nv3Var3;
        }
        return 0;
    }
}
