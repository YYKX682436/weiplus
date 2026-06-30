package r45;

/* loaded from: classes4.dex */
public class lj4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f379520d;

    /* renamed from: e, reason: collision with root package name */
    public float f379521e;

    /* renamed from: f, reason: collision with root package name */
    public float f379522f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj4)) {
            return false;
        }
        r45.lj4 lj4Var = (r45.lj4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f379520d), java.lang.Float.valueOf(lj4Var.f379520d)) && n51.f.a(java.lang.Float.valueOf(this.f379521e), java.lang.Float.valueOf(lj4Var.f379521e)) && n51.f.a(java.lang.Float.valueOf(this.f379522f), java.lang.Float.valueOf(lj4Var.f379522f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f379520d);
            fVar.d(2, this.f379521e);
            fVar.d(3, this.f379522f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f379520d) + 0 + b36.f.d(2, this.f379521e) + b36.f.d(3, this.f379522f);
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
        r45.lj4 lj4Var = (r45.lj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lj4Var.f379520d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            lj4Var.f379521e = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        lj4Var.f379522f = aVar2.f(intValue);
        return 0;
    }
}
