package r45;

/* loaded from: classes2.dex */
public class u95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f387154d;

    /* renamed from: e, reason: collision with root package name */
    public float f387155e;

    /* renamed from: f, reason: collision with root package name */
    public float f387156f;

    /* renamed from: g, reason: collision with root package name */
    public float f387157g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u95)) {
            return false;
        }
        r45.u95 u95Var = (r45.u95) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f387154d), java.lang.Float.valueOf(u95Var.f387154d)) && n51.f.a(java.lang.Float.valueOf(this.f387155e), java.lang.Float.valueOf(u95Var.f387155e)) && n51.f.a(java.lang.Float.valueOf(this.f387156f), java.lang.Float.valueOf(u95Var.f387156f)) && n51.f.a(java.lang.Float.valueOf(this.f387157g), java.lang.Float.valueOf(u95Var.f387157g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f387154d);
            fVar.d(2, this.f387155e);
            fVar.d(3, this.f387156f);
            fVar.d(4, this.f387157g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f387154d) + 0 + b36.f.d(2, this.f387155e) + b36.f.d(3, this.f387156f) + b36.f.d(4, this.f387157g);
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
        r45.u95 u95Var = (r45.u95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u95Var.f387154d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            u95Var.f387155e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            u95Var.f387156f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        u95Var.f387157g = aVar2.f(intValue);
        return 0;
    }
}
