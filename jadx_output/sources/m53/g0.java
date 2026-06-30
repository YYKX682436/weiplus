package m53;

/* loaded from: classes4.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.f6 f323689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323691f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g0)) {
            return false;
        }
        m53.g0 g0Var = (m53.g0) fVar;
        return n51.f.a(this.f323689d, g0Var.f323689d) && n51.f.a(java.lang.Boolean.valueOf(this.f323690e), java.lang.Boolean.valueOf(g0Var.f323690e)) && n51.f.a(java.lang.Boolean.valueOf(this.f323691f), java.lang.Boolean.valueOf(g0Var.f323691f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.f6 f6Var = this.f323689d;
            if (f6Var != null) {
                fVar.i(1, f6Var.computeSize());
                this.f323689d.writeFields(fVar);
            }
            fVar.a(2, this.f323690e);
            fVar.a(4, this.f323691f);
            return 0;
        }
        if (i17 == 1) {
            m53.f6 f6Var2 = this.f323689d;
            return (f6Var2 != null ? 0 + b36.f.i(1, f6Var2.computeSize()) : 0) + b36.f.a(2, this.f323690e) + b36.f.a(4, this.f323691f);
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
        m53.g0 g0Var = (m53.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                g0Var.f323690e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            g0Var.f323691f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.f6 f6Var3 = new m53.f6();
            if (bArr != null && bArr.length > 0) {
                f6Var3.parseFrom(bArr);
            }
            g0Var.f323689d = f6Var3;
        }
        return 0;
    }
}
