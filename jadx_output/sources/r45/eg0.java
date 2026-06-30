package r45;

/* loaded from: classes9.dex */
public class eg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f373426d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373428f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eg0)) {
            return false;
        }
        r45.eg0 eg0Var = (r45.eg0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f373426d), java.lang.Boolean.valueOf(eg0Var.f373426d)) && n51.f.a(java.lang.Boolean.valueOf(this.f373427e), java.lang.Boolean.valueOf(eg0Var.f373427e)) && n51.f.a(this.f373428f, eg0Var.f373428f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f373426d);
            fVar.a(2, this.f373427e);
            java.lang.String str = this.f373428f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f373426d) + 0 + b36.f.a(2, this.f373427e);
            java.lang.String str2 = this.f373428f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
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
        r45.eg0 eg0Var = (r45.eg0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eg0Var.f373426d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            eg0Var.f373427e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        eg0Var.f373428f = aVar2.k(intValue);
        return 0;
    }
}
