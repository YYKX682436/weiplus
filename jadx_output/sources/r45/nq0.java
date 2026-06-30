package r45;

/* loaded from: classes4.dex */
public class nq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381589d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381590e;

    /* renamed from: f, reason: collision with root package name */
    public int f381591f;

    /* renamed from: g, reason: collision with root package name */
    public int f381592g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nq0)) {
            return false;
        }
        r45.nq0 nq0Var = (r45.nq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381589d), java.lang.Integer.valueOf(nq0Var.f381589d)) && n51.f.a(this.f381590e, nq0Var.f381590e) && n51.f.a(java.lang.Integer.valueOf(this.f381591f), java.lang.Integer.valueOf(nq0Var.f381591f)) && n51.f.a(java.lang.Integer.valueOf(this.f381592g), java.lang.Integer.valueOf(nq0Var.f381592g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381589d);
            java.lang.String str = this.f381590e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381591f);
            fVar.e(4, this.f381592g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381589d) + 0;
            java.lang.String str2 = this.f381590e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f381591f) + b36.f.e(4, this.f381592g);
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
        r45.nq0 nq0Var = (r45.nq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nq0Var.f381589d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            nq0Var.f381590e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nq0Var.f381591f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        nq0Var.f381592g = aVar2.g(intValue);
        return 0;
    }
}
