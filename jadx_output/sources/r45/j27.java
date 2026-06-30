package r45;

/* loaded from: classes8.dex */
public class j27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377523d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f377524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377525f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j27)) {
            return false;
        }
        r45.j27 j27Var = (r45.j27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377523d), java.lang.Integer.valueOf(j27Var.f377523d)) && n51.f.a(this.f377524e, j27Var.f377524e) && n51.f.a(this.f377525f, j27Var.f377525f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377523d);
            r45.cu5 cu5Var = this.f377524e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f377524e.writeFields(fVar);
            }
            java.lang.String str = this.f377525f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377523d) + 0;
            r45.cu5 cu5Var2 = this.f377524e;
            if (cu5Var2 != null) {
                e17 += b36.f.i(2, cu5Var2.computeSize());
            }
            java.lang.String str2 = this.f377525f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        r45.j27 j27Var = (r45.j27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j27Var.f377523d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            j27Var.f377525f = aVar2.k(intValue);
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
            j27Var.f377524e = cu5Var3;
        }
        return 0;
    }
}
