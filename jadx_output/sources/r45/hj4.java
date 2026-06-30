package r45;

/* loaded from: classes4.dex */
public class hj4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376215d;

    /* renamed from: e, reason: collision with root package name */
    public int f376216e;

    /* renamed from: f, reason: collision with root package name */
    public int f376217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376218g;

    /* renamed from: h, reason: collision with root package name */
    public int f376219h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hj4)) {
            return false;
        }
        r45.hj4 hj4Var = (r45.hj4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376215d), java.lang.Integer.valueOf(hj4Var.f376215d)) && n51.f.a(java.lang.Integer.valueOf(this.f376216e), java.lang.Integer.valueOf(hj4Var.f376216e)) && n51.f.a(java.lang.Integer.valueOf(this.f376217f), java.lang.Integer.valueOf(hj4Var.f376217f)) && n51.f.a(this.f376218g, hj4Var.f376218g) && n51.f.a(java.lang.Integer.valueOf(this.f376219h), java.lang.Integer.valueOf(hj4Var.f376219h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376215d);
            fVar.e(2, this.f376216e);
            fVar.e(3, this.f376217f);
            java.lang.String str = this.f376218g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376219h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376215d) + 0 + b36.f.e(2, this.f376216e) + b36.f.e(3, this.f376217f);
            java.lang.String str2 = this.f376218g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f376219h);
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
        r45.hj4 hj4Var = (r45.hj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hj4Var.f376215d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hj4Var.f376216e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hj4Var.f376217f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hj4Var.f376218g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hj4Var.f376219h = aVar2.g(intValue);
        return 0;
    }
}
