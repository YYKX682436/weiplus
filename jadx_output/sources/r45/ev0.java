package r45;

/* loaded from: classes9.dex */
public class ev0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373737d;

    /* renamed from: e, reason: collision with root package name */
    public int f373738e;

    /* renamed from: f, reason: collision with root package name */
    public int f373739f;

    /* renamed from: g, reason: collision with root package name */
    public int f373740g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev0)) {
            return false;
        }
        r45.ev0 ev0Var = (r45.ev0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373737d), java.lang.Integer.valueOf(ev0Var.f373737d)) && n51.f.a(java.lang.Integer.valueOf(this.f373738e), java.lang.Integer.valueOf(ev0Var.f373738e)) && n51.f.a(java.lang.Integer.valueOf(this.f373739f), java.lang.Integer.valueOf(ev0Var.f373739f)) && n51.f.a(java.lang.Integer.valueOf(this.f373740g), java.lang.Integer.valueOf(ev0Var.f373740g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373737d);
            fVar.e(2, this.f373738e);
            fVar.e(3, this.f373739f);
            fVar.e(4, this.f373740g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373737d) + 0 + b36.f.e(2, this.f373738e) + b36.f.e(3, this.f373739f) + b36.f.e(4, this.f373740g);
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
        r45.ev0 ev0Var = (r45.ev0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ev0Var.f373737d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ev0Var.f373738e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ev0Var.f373739f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ev0Var.f373740g = aVar2.g(intValue);
        return 0;
    }
}
