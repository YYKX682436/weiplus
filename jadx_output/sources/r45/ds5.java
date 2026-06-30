package r45;

/* loaded from: classes9.dex */
public class ds5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372732d;

    /* renamed from: e, reason: collision with root package name */
    public int f372733e;

    /* renamed from: f, reason: collision with root package name */
    public int f372734f;

    /* renamed from: g, reason: collision with root package name */
    public int f372735g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ds5)) {
            return false;
        }
        r45.ds5 ds5Var = (r45.ds5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372732d), java.lang.Integer.valueOf(ds5Var.f372732d)) && n51.f.a(java.lang.Integer.valueOf(this.f372733e), java.lang.Integer.valueOf(ds5Var.f372733e)) && n51.f.a(java.lang.Integer.valueOf(this.f372734f), java.lang.Integer.valueOf(ds5Var.f372734f)) && n51.f.a(java.lang.Integer.valueOf(this.f372735g), java.lang.Integer.valueOf(ds5Var.f372735g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372732d);
            fVar.e(2, this.f372733e);
            fVar.e(3, this.f372734f);
            fVar.e(4, this.f372735g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372732d) + 0 + b36.f.e(2, this.f372733e) + b36.f.e(3, this.f372734f) + b36.f.e(4, this.f372735g);
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
        r45.ds5 ds5Var = (r45.ds5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ds5Var.f372732d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ds5Var.f372733e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ds5Var.f372734f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ds5Var.f372735g = aVar2.g(intValue);
        return 0;
    }
}
