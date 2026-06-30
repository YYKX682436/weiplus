package r45;

/* loaded from: classes9.dex */
public class co6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371734d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371735e;

    /* renamed from: f, reason: collision with root package name */
    public int f371736f;

    /* renamed from: g, reason: collision with root package name */
    public int f371737g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co6)) {
            return false;
        }
        r45.co6 co6Var = (r45.co6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371734d), java.lang.Integer.valueOf(co6Var.f371734d)) && n51.f.a(this.f371735e, co6Var.f371735e) && n51.f.a(java.lang.Integer.valueOf(this.f371736f), java.lang.Integer.valueOf(co6Var.f371736f)) && n51.f.a(java.lang.Integer.valueOf(this.f371737g), java.lang.Integer.valueOf(co6Var.f371737g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(7, this.f371734d);
            com.tencent.mm.protobuf.g gVar = this.f371735e;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(9, this.f371736f);
            fVar.e(10, this.f371737g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(7, this.f371734d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f371735e;
            if (gVar2 != null) {
                e17 += b36.f.b(8, gVar2);
            }
            return e17 + b36.f.e(9, this.f371736f) + b36.f.e(10, this.f371737g);
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
        r45.co6 co6Var = (r45.co6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 7:
                co6Var.f371734d = aVar2.g(intValue);
                return 0;
            case 8:
                co6Var.f371735e = aVar2.d(intValue);
                return 0;
            case 9:
                co6Var.f371736f = aVar2.g(intValue);
                return 0;
            case 10:
                co6Var.f371737g = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
