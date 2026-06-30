package t45;

/* loaded from: classes2.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.n0 f415663d;

    /* renamed from: e, reason: collision with root package name */
    public int f415664e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.y0)) {
            return false;
        }
        t45.y0 y0Var = (t45.y0) fVar;
        return n51.f.a(this.f415663d, y0Var.f415663d) && n51.f.a(java.lang.Integer.valueOf(this.f415664e), java.lang.Integer.valueOf(y0Var.f415664e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.n0 n0Var = this.f415663d;
            if (n0Var != null) {
                fVar.i(1, n0Var.computeSize());
                this.f415663d.writeFields(fVar);
            }
            fVar.e(2, this.f415664e);
            return 0;
        }
        if (i17 == 1) {
            t45.n0 n0Var2 = this.f415663d;
            return (n0Var2 != null ? 0 + b36.f.i(1, n0Var2.computeSize()) : 0) + b36.f.e(2, this.f415664e);
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
        t45.y0 y0Var = (t45.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            y0Var.f415664e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr != null && bArr.length > 0) {
                n0Var3.parseFrom(bArr);
            }
            y0Var.f415663d = n0Var3;
        }
        return 0;
    }
}
