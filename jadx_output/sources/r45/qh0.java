package r45;

/* loaded from: classes9.dex */
public class qh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383987d;

    /* renamed from: e, reason: collision with root package name */
    public long f383988e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383989f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh0)) {
            return false;
        }
        r45.qh0 qh0Var = (r45.qh0) fVar;
        return n51.f.a(this.f383987d, qh0Var.f383987d) && n51.f.a(java.lang.Long.valueOf(this.f383988e), java.lang.Long.valueOf(qh0Var.f383988e)) && n51.f.a(this.f383989f, qh0Var.f383989f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383987d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f383988e);
            java.lang.String str2 = this.f383989f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383987d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f383988e);
            java.lang.String str4 = this.f383989f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.qh0 qh0Var = (r45.qh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qh0Var.f383987d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qh0Var.f383988e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        qh0Var.f383989f = aVar2.k(intValue);
        return 0;
    }
}
