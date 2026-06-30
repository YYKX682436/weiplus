package r45;

/* loaded from: classes4.dex */
public class hb6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376024d;

    /* renamed from: e, reason: collision with root package name */
    public int f376025e;

    /* renamed from: f, reason: collision with root package name */
    public int f376026f;

    /* renamed from: g, reason: collision with root package name */
    public int f376027g;

    /* renamed from: h, reason: collision with root package name */
    public int f376028h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb6)) {
            return false;
        }
        r45.hb6 hb6Var = (r45.hb6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376024d), java.lang.Integer.valueOf(hb6Var.f376024d)) && n51.f.a(java.lang.Integer.valueOf(this.f376025e), java.lang.Integer.valueOf(hb6Var.f376025e)) && n51.f.a(java.lang.Integer.valueOf(this.f376026f), java.lang.Integer.valueOf(hb6Var.f376026f)) && n51.f.a(java.lang.Integer.valueOf(this.f376027g), java.lang.Integer.valueOf(hb6Var.f376027g)) && n51.f.a(java.lang.Integer.valueOf(this.f376028h), java.lang.Integer.valueOf(hb6Var.f376028h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376024d);
            fVar.e(2, this.f376025e);
            fVar.e(3, this.f376026f);
            fVar.e(4, this.f376027g);
            fVar.e(5, this.f376028h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376024d) + 0 + b36.f.e(2, this.f376025e) + b36.f.e(3, this.f376026f) + b36.f.e(4, this.f376027g) + b36.f.e(5, this.f376028h);
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
        r45.hb6 hb6Var = (r45.hb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb6Var.f376024d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb6Var.f376025e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hb6Var.f376026f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hb6Var.f376027g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hb6Var.f376028h = aVar2.g(intValue);
        return 0;
    }
}
