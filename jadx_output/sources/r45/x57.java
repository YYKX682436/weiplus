package r45;

/* loaded from: classes9.dex */
public class x57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389803d;

    /* renamed from: e, reason: collision with root package name */
    public int f389804e;

    /* renamed from: f, reason: collision with root package name */
    public int f389805f;

    /* renamed from: g, reason: collision with root package name */
    public int f389806g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x57)) {
            return false;
        }
        r45.x57 x57Var = (r45.x57) fVar;
        return n51.f.a(this.f389803d, x57Var.f389803d) && n51.f.a(java.lang.Integer.valueOf(this.f389804e), java.lang.Integer.valueOf(x57Var.f389804e)) && n51.f.a(java.lang.Integer.valueOf(this.f389805f), java.lang.Integer.valueOf(x57Var.f389805f)) && n51.f.a(java.lang.Integer.valueOf(this.f389806g), java.lang.Integer.valueOf(x57Var.f389806g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389803d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389804e);
            fVar.e(3, this.f389805f);
            fVar.e(4, this.f389806g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f389803d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f389804e) + b36.f.e(3, this.f389805f) + b36.f.e(4, this.f389806g);
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
        r45.x57 x57Var = (r45.x57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x57Var.f389803d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x57Var.f389804e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            x57Var.f389805f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x57Var.f389806g = aVar2.g(intValue);
        return 0;
    }
}
