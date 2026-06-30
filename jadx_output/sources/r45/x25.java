package r45;

/* loaded from: classes9.dex */
public class x25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389696d;

    /* renamed from: e, reason: collision with root package name */
    public int f389697e;

    /* renamed from: f, reason: collision with root package name */
    public int f389698f;

    /* renamed from: g, reason: collision with root package name */
    public int f389699g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x25)) {
            return false;
        }
        r45.x25 x25Var = (r45.x25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389696d), java.lang.Integer.valueOf(x25Var.f389696d)) && n51.f.a(java.lang.Integer.valueOf(this.f389697e), java.lang.Integer.valueOf(x25Var.f389697e)) && n51.f.a(java.lang.Integer.valueOf(this.f389698f), java.lang.Integer.valueOf(x25Var.f389698f)) && n51.f.a(java.lang.Integer.valueOf(this.f389699g), java.lang.Integer.valueOf(x25Var.f389699g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389696d);
            fVar.e(2, this.f389697e);
            fVar.e(4, this.f389698f);
            fVar.e(5, this.f389699g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f389696d) + 0 + b36.f.e(2, this.f389697e) + b36.f.e(4, this.f389698f) + b36.f.e(5, this.f389699g);
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
        r45.x25 x25Var = (r45.x25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x25Var.f389696d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x25Var.f389697e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            x25Var.f389698f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        x25Var.f389699g = aVar2.g(intValue);
        return 0;
    }
}
