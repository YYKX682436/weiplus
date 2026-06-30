package r45;

/* loaded from: classes9.dex */
public class ku3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f378954d;

    /* renamed from: e, reason: collision with root package name */
    public float f378955e;

    /* renamed from: f, reason: collision with root package name */
    public float f378956f;

    /* renamed from: g, reason: collision with root package name */
    public long f378957g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku3)) {
            return false;
        }
        r45.ku3 ku3Var = (r45.ku3) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f378954d), java.lang.Float.valueOf(ku3Var.f378954d)) && n51.f.a(java.lang.Float.valueOf(this.f378955e), java.lang.Float.valueOf(ku3Var.f378955e)) && n51.f.a(java.lang.Float.valueOf(this.f378956f), java.lang.Float.valueOf(ku3Var.f378956f)) && n51.f.a(java.lang.Long.valueOf(this.f378957g), java.lang.Long.valueOf(ku3Var.f378957g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f378954d);
            fVar.d(2, this.f378955e);
            fVar.d(3, this.f378956f);
            fVar.h(4, this.f378957g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f378954d) + 0 + b36.f.d(2, this.f378955e) + b36.f.d(3, this.f378956f) + b36.f.h(4, this.f378957g);
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
        r45.ku3 ku3Var = (r45.ku3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ku3Var.f378954d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            ku3Var.f378955e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            ku3Var.f378956f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ku3Var.f378957g = aVar2.i(intValue);
        return 0;
    }
}
