package r45;

/* loaded from: classes8.dex */
public class e85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.d64 f373124d;

    /* renamed from: e, reason: collision with root package name */
    public int f373125e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e85)) {
            return false;
        }
        r45.e85 e85Var = (r45.e85) fVar;
        return n51.f.a(this.f373124d, e85Var.f373124d) && n51.f.a(java.lang.Integer.valueOf(this.f373125e), java.lang.Integer.valueOf(e85Var.f373125e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.d64 d64Var = this.f373124d;
            if (d64Var != null) {
                fVar.i(1, d64Var.computeSize());
                this.f373124d.writeFields(fVar);
            }
            fVar.e(2, this.f373125e);
            return 0;
        }
        if (i17 == 1) {
            r45.d64 d64Var2 = this.f373124d;
            return (d64Var2 != null ? 0 + b36.f.i(1, d64Var2.computeSize()) : 0) + b36.f.e(2, this.f373125e);
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
        r45.e85 e85Var = (r45.e85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            e85Var.f373125e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.d64 d64Var3 = new r45.d64();
            if (bArr != null && bArr.length > 0) {
                d64Var3.parseFrom(bArr);
            }
            e85Var.f373124d = d64Var3;
        }
        return 0;
    }
}
