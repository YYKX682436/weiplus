package f21;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258888d;

    /* renamed from: e, reason: collision with root package name */
    public int f258889e;

    /* renamed from: f, reason: collision with root package name */
    public int f258890f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.e0)) {
            return false;
        }
        f21.e0 e0Var = (f21.e0) fVar;
        return n51.f.a(this.f258888d, e0Var.f258888d) && n51.f.a(java.lang.Integer.valueOf(this.f258889e), java.lang.Integer.valueOf(e0Var.f258889e)) && n51.f.a(java.lang.Integer.valueOf(this.f258890f), java.lang.Integer.valueOf(e0Var.f258890f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f258888d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f258889e);
            fVar.e(4, this.f258890f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f258888d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f258889e) + b36.f.e(4, this.f258890f);
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
        f21.e0 e0Var = (f21.e0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e0Var.f258888d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e0Var.f258889e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e0Var.f258890f = aVar2.g(intValue);
        return 0;
    }
}
