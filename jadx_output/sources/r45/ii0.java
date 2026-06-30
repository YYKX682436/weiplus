package r45;

/* loaded from: classes10.dex */
public class ii0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377059d;

    /* renamed from: e, reason: collision with root package name */
    public int f377060e;

    /* renamed from: f, reason: collision with root package name */
    public int f377061f;

    /* renamed from: g, reason: collision with root package name */
    public int f377062g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ii0)) {
            return false;
        }
        r45.ii0 ii0Var = (r45.ii0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377059d), java.lang.Integer.valueOf(ii0Var.f377059d)) && n51.f.a(java.lang.Integer.valueOf(this.f377060e), java.lang.Integer.valueOf(ii0Var.f377060e)) && n51.f.a(java.lang.Integer.valueOf(this.f377061f), java.lang.Integer.valueOf(ii0Var.f377061f)) && n51.f.a(java.lang.Integer.valueOf(this.f377062g), java.lang.Integer.valueOf(ii0Var.f377062g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377059d);
            fVar.e(2, this.f377060e);
            fVar.e(3, this.f377061f);
            fVar.e(4, this.f377062g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377059d) + 0 + b36.f.e(2, this.f377060e) + b36.f.e(3, this.f377061f) + b36.f.e(4, this.f377062g);
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
        r45.ii0 ii0Var = (r45.ii0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ii0Var.f377059d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ii0Var.f377060e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ii0Var.f377061f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ii0Var.f377062g = aVar2.g(intValue);
        return 0;
    }
}
