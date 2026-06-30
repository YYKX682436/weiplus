package r45;

/* loaded from: classes4.dex */
public class cg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371545d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f371546e;

    /* renamed from: f, reason: collision with root package name */
    public int f371547f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cg7)) {
            return false;
        }
        r45.cg7 cg7Var = (r45.cg7) fVar;
        return n51.f.a(this.f371545d, cg7Var.f371545d) && n51.f.a(java.lang.Boolean.valueOf(this.f371546e), java.lang.Boolean.valueOf(cg7Var.f371546e)) && n51.f.a(java.lang.Integer.valueOf(this.f371547f), java.lang.Integer.valueOf(cg7Var.f371547f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371545d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f371546e);
            fVar.e(3, this.f371547f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f371545d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f371546e) + b36.f.e(3, this.f371547f);
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
        r45.cg7 cg7Var = (r45.cg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cg7Var.f371545d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cg7Var.f371546e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cg7Var.f371547f = aVar2.g(intValue);
        return 0;
    }
}
