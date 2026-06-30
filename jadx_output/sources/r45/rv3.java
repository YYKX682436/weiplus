package r45;

/* loaded from: classes8.dex */
public class rv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f385224d;

    /* renamed from: e, reason: collision with root package name */
    public int f385225e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f385226f;

    /* renamed from: g, reason: collision with root package name */
    public int f385227g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rv3)) {
            return false;
        }
        r45.rv3 rv3Var = (r45.rv3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f385224d), java.lang.Long.valueOf(rv3Var.f385224d)) && n51.f.a(java.lang.Integer.valueOf(this.f385225e), java.lang.Integer.valueOf(rv3Var.f385225e)) && n51.f.a(this.f385226f, rv3Var.f385226f) && n51.f.a(java.lang.Integer.valueOf(this.f385227g), java.lang.Integer.valueOf(rv3Var.f385227g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f385224d);
            fVar.e(2, this.f385225e);
            r45.cu5 cu5Var = this.f385226f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f385226f.writeFields(fVar);
            }
            fVar.e(4, this.f385227g);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f385224d) + 0 + b36.f.e(2, this.f385225e);
            r45.cu5 cu5Var2 = this.f385226f;
            if (cu5Var2 != null) {
                h17 += b36.f.i(3, cu5Var2.computeSize());
            }
            return h17 + b36.f.e(4, this.f385227g);
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
        r45.rv3 rv3Var = (r45.rv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rv3Var.f385224d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rv3Var.f385225e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            rv3Var.f385227g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            rv3Var.f385226f = cu5Var3;
        }
        return 0;
    }
}
