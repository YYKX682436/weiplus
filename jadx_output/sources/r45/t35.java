package r45;

/* loaded from: classes9.dex */
public class t35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f386094d;

    /* renamed from: e, reason: collision with root package name */
    public float f386095e;

    /* renamed from: f, reason: collision with root package name */
    public float f386096f;

    /* renamed from: g, reason: collision with root package name */
    public float f386097g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t35)) {
            return false;
        }
        r45.t35 t35Var = (r45.t35) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f386094d), java.lang.Float.valueOf(t35Var.f386094d)) && n51.f.a(java.lang.Float.valueOf(this.f386095e), java.lang.Float.valueOf(t35Var.f386095e)) && n51.f.a(java.lang.Float.valueOf(this.f386096f), java.lang.Float.valueOf(t35Var.f386096f)) && n51.f.a(java.lang.Float.valueOf(this.f386097g), java.lang.Float.valueOf(t35Var.f386097g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f386094d);
            fVar.d(2, this.f386095e);
            fVar.d(3, this.f386096f);
            fVar.d(4, this.f386097g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f386094d) + 0 + b36.f.d(2, this.f386095e) + b36.f.d(3, this.f386096f) + b36.f.d(4, this.f386097g);
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
        r45.t35 t35Var = (r45.t35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t35Var.f386094d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            t35Var.f386095e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            t35Var.f386096f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        t35Var.f386097g = aVar2.f(intValue);
        return 0;
    }
}
