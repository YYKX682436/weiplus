package r45;

/* loaded from: classes4.dex */
public class b43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f370511d;

    /* renamed from: e, reason: collision with root package name */
    public float f370512e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b43)) {
            return false;
        }
        r45.b43 b43Var = (r45.b43) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f370511d), java.lang.Float.valueOf(b43Var.f370511d)) && n51.f.a(java.lang.Float.valueOf(this.f370512e), java.lang.Float.valueOf(b43Var.f370512e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f370511d);
            fVar.d(2, this.f370512e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f370511d) + 0 + b36.f.d(2, this.f370512e);
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
        r45.b43 b43Var = (r45.b43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b43Var.f370511d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        b43Var.f370512e = aVar2.f(intValue);
        return 0;
    }
}
