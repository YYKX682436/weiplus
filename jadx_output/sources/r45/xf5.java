package r45;

/* loaded from: classes7.dex */
public class xf5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f390053d;

    /* renamed from: e, reason: collision with root package name */
    public float f390054e;

    /* renamed from: f, reason: collision with root package name */
    public float f390055f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xf5)) {
            return false;
        }
        r45.xf5 xf5Var = (r45.xf5) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f390053d), java.lang.Float.valueOf(xf5Var.f390053d)) && n51.f.a(java.lang.Float.valueOf(this.f390054e), java.lang.Float.valueOf(xf5Var.f390054e)) && n51.f.a(java.lang.Float.valueOf(this.f390055f), java.lang.Float.valueOf(xf5Var.f390055f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f390053d);
            fVar.d(2, this.f390054e);
            fVar.d(3, this.f390055f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f390053d) + 0 + b36.f.d(2, this.f390054e) + b36.f.d(3, this.f390055f);
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
        r45.xf5 xf5Var = (r45.xf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xf5Var.f390053d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            xf5Var.f390054e = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xf5Var.f390055f = aVar2.f(intValue);
        return 0;
    }
}
