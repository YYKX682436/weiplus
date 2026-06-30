package r45;

/* loaded from: classes2.dex */
public class ac6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369922d;

    /* renamed from: e, reason: collision with root package name */
    public int f369923e;

    /* renamed from: f, reason: collision with root package name */
    public int f369924f;

    /* renamed from: g, reason: collision with root package name */
    public int f369925g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac6)) {
            return false;
        }
        r45.ac6 ac6Var = (r45.ac6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369922d), java.lang.Integer.valueOf(ac6Var.f369922d)) && n51.f.a(java.lang.Integer.valueOf(this.f369923e), java.lang.Integer.valueOf(ac6Var.f369923e)) && n51.f.a(java.lang.Integer.valueOf(this.f369924f), java.lang.Integer.valueOf(ac6Var.f369924f)) && n51.f.a(java.lang.Integer.valueOf(this.f369925g), java.lang.Integer.valueOf(ac6Var.f369925g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369922d);
            fVar.e(2, this.f369923e);
            fVar.e(3, this.f369924f);
            fVar.e(4, this.f369925g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f369922d) + 0 + b36.f.e(2, this.f369923e) + b36.f.e(3, this.f369924f) + b36.f.e(4, this.f369925g);
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
        r45.ac6 ac6Var = (r45.ac6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ac6Var.f369922d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ac6Var.f369923e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ac6Var.f369924f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ac6Var.f369925g = aVar2.g(intValue);
        return 0;
    }
}
