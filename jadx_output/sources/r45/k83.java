package r45;

/* loaded from: classes7.dex */
public class k83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378486d;

    /* renamed from: e, reason: collision with root package name */
    public int f378487e;

    /* renamed from: f, reason: collision with root package name */
    public int f378488f;

    /* renamed from: g, reason: collision with root package name */
    public long f378489g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k83)) {
            return false;
        }
        r45.k83 k83Var = (r45.k83) fVar;
        return n51.f.a(this.f378486d, k83Var.f378486d) && n51.f.a(java.lang.Integer.valueOf(this.f378487e), java.lang.Integer.valueOf(k83Var.f378487e)) && n51.f.a(java.lang.Integer.valueOf(this.f378488f), java.lang.Integer.valueOf(k83Var.f378488f)) && n51.f.a(java.lang.Long.valueOf(this.f378489g), java.lang.Long.valueOf(k83Var.f378489g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378486d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378487e);
            fVar.e(3, this.f378488f);
            fVar.h(99, this.f378489g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f378486d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f378487e) + b36.f.e(3, this.f378488f) + b36.f.h(99, this.f378489g);
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
        r45.k83 k83Var = (r45.k83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k83Var.f378486d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k83Var.f378487e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            k83Var.f378488f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 99) {
            return -1;
        }
        k83Var.f378489g = aVar2.i(intValue);
        return 0;
    }
}
