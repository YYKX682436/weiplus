package r45;

/* loaded from: classes4.dex */
public class oi6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382289d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f382290e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382291f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382292g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oi6)) {
            return false;
        }
        r45.oi6 oi6Var = (r45.oi6) fVar;
        return n51.f.a(this.f382289d, oi6Var.f382289d) && n51.f.a(java.lang.Boolean.valueOf(this.f382290e), java.lang.Boolean.valueOf(oi6Var.f382290e)) && n51.f.a(this.f382291f, oi6Var.f382291f) && n51.f.a(this.f382292g, oi6Var.f382292g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382289d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f382290e);
            java.lang.String str2 = this.f382291f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f382292g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f382289d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.a(2, this.f382290e);
            java.lang.String str4 = this.f382291f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f382292g;
            return gVar2 != null ? j17 + b36.f.b(4, gVar2) : j17;
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
        r45.oi6 oi6Var = (r45.oi6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oi6Var.f382289d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            oi6Var.f382290e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            oi6Var.f382291f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        oi6Var.f382292g = aVar2.d(intValue);
        return 0;
    }
}
