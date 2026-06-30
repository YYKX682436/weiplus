package r45;

/* loaded from: classes12.dex */
public class l37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379116d;

    /* renamed from: e, reason: collision with root package name */
    public int f379117e;

    /* renamed from: f, reason: collision with root package name */
    public int f379118f;

    /* renamed from: g, reason: collision with root package name */
    public int f379119g;

    /* renamed from: h, reason: collision with root package name */
    public int f379120h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l37)) {
            return false;
        }
        r45.l37 l37Var = (r45.l37) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379116d), java.lang.Integer.valueOf(l37Var.f379116d)) && n51.f.a(java.lang.Integer.valueOf(this.f379117e), java.lang.Integer.valueOf(l37Var.f379117e)) && n51.f.a(java.lang.Integer.valueOf(this.f379118f), java.lang.Integer.valueOf(l37Var.f379118f)) && n51.f.a(java.lang.Integer.valueOf(this.f379119g), java.lang.Integer.valueOf(l37Var.f379119g)) && n51.f.a(java.lang.Integer.valueOf(this.f379120h), java.lang.Integer.valueOf(l37Var.f379120h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379116d);
            fVar.e(2, this.f379117e);
            fVar.e(3, this.f379118f);
            fVar.e(4, this.f379119g);
            fVar.e(5, this.f379120h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379116d) + 0 + b36.f.e(2, this.f379117e) + b36.f.e(3, this.f379118f) + b36.f.e(4, this.f379119g) + b36.f.e(5, this.f379120h);
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
        r45.l37 l37Var = (r45.l37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l37Var.f379116d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            l37Var.f379117e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            l37Var.f379118f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            l37Var.f379119g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l37Var.f379120h = aVar2.g(intValue);
        return 0;
    }
}
