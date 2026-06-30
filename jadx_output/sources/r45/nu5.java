package r45;

/* loaded from: classes8.dex */
public class nu5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f381686d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uk4 f381687e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nu5)) {
            return false;
        }
        r45.nu5 nu5Var = (r45.nu5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f381686d), java.lang.Boolean.valueOf(nu5Var.f381686d)) && n51.f.a(this.f381687e, nu5Var.f381687e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f381686d);
            r45.uk4 uk4Var = this.f381687e;
            if (uk4Var != null) {
                fVar.i(2, uk4Var.computeSize());
                this.f381687e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f381686d) + 0;
            r45.uk4 uk4Var2 = this.f381687e;
            return uk4Var2 != null ? a17 + b36.f.i(2, uk4Var2.computeSize()) : a17;
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
        r45.nu5 nu5Var = (r45.nu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nu5Var.f381686d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.uk4 uk4Var3 = new r45.uk4();
            if (bArr != null && bArr.length > 0) {
                uk4Var3.parseFrom(bArr);
            }
            nu5Var.f381687e = uk4Var3;
        }
        return 0;
    }
}
