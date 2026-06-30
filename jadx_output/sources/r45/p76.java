package r45;

/* loaded from: classes4.dex */
public class p76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382814d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f382816f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p76)) {
            return false;
        }
        r45.p76 p76Var = (r45.p76) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382814d), java.lang.Integer.valueOf(p76Var.f382814d)) && n51.f.a(this.f382815e, p76Var.f382815e) && n51.f.a(java.lang.Boolean.valueOf(this.f382816f), java.lang.Boolean.valueOf(p76Var.f382816f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382814d);
            java.lang.String str = this.f382815e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f382816f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382814d) + 0;
            java.lang.String str2 = this.f382815e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f382816f);
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
        r45.p76 p76Var = (r45.p76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p76Var.f382814d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p76Var.f382815e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p76Var.f382816f = aVar2.c(intValue);
        return 0;
    }
}
