package r45;

/* loaded from: classes7.dex */
public class y50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390798e;

    /* renamed from: f, reason: collision with root package name */
    public int f390799f;

    /* renamed from: g, reason: collision with root package name */
    public int f390800g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y50)) {
            return false;
        }
        r45.y50 y50Var = (r45.y50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390797d), java.lang.Integer.valueOf(y50Var.f390797d)) && n51.f.a(java.lang.Boolean.valueOf(this.f390798e), java.lang.Boolean.valueOf(y50Var.f390798e)) && n51.f.a(java.lang.Integer.valueOf(this.f390799f), java.lang.Integer.valueOf(y50Var.f390799f)) && n51.f.a(java.lang.Integer.valueOf(this.f390800g), java.lang.Integer.valueOf(y50Var.f390800g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390797d);
            fVar.a(2, this.f390798e);
            fVar.e(3, this.f390799f);
            fVar.e(4, this.f390800g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390797d) + 0 + b36.f.a(2, this.f390798e) + b36.f.e(3, this.f390799f) + b36.f.e(4, this.f390800g);
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
        r45.y50 y50Var = (r45.y50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y50Var.f390797d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            y50Var.f390798e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            y50Var.f390799f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y50Var.f390800g = aVar2.g(intValue);
        return 0;
    }
}
