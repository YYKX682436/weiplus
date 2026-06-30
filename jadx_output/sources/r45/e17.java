package r45;

/* loaded from: classes9.dex */
public class e17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372916d;

    /* renamed from: e, reason: collision with root package name */
    public int f372917e;

    /* renamed from: f, reason: collision with root package name */
    public int f372918f;

    /* renamed from: g, reason: collision with root package name */
    public int f372919g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e17)) {
            return false;
        }
        r45.e17 e17Var = (r45.e17) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372916d), java.lang.Integer.valueOf(e17Var.f372916d)) && n51.f.a(java.lang.Integer.valueOf(this.f372917e), java.lang.Integer.valueOf(e17Var.f372917e)) && n51.f.a(java.lang.Integer.valueOf(this.f372918f), java.lang.Integer.valueOf(e17Var.f372918f)) && n51.f.a(java.lang.Integer.valueOf(this.f372919g), java.lang.Integer.valueOf(e17Var.f372919g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372916d);
            fVar.e(2, this.f372917e);
            fVar.e(3, this.f372918f);
            fVar.e(4, this.f372919g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372916d) + 0 + b36.f.e(2, this.f372917e) + b36.f.e(3, this.f372918f) + b36.f.e(4, this.f372919g);
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
        r45.e17 e17Var = (r45.e17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e17Var.f372916d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e17Var.f372917e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            e17Var.f372918f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e17Var.f372919g = aVar2.g(intValue);
        return 0;
    }
}
