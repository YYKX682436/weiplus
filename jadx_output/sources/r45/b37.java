package r45;

/* loaded from: classes8.dex */
public class b37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370499d;

    /* renamed from: e, reason: collision with root package name */
    public int f370500e;

    /* renamed from: f, reason: collision with root package name */
    public int f370501f;

    /* renamed from: g, reason: collision with root package name */
    public int f370502g;

    /* renamed from: h, reason: collision with root package name */
    public int f370503h;

    /* renamed from: i, reason: collision with root package name */
    public int f370504i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b37)) {
            return false;
        }
        r45.b37 b37Var = (r45.b37) fVar;
        return n51.f.a(this.f370499d, b37Var.f370499d) && n51.f.a(java.lang.Integer.valueOf(this.f370500e), java.lang.Integer.valueOf(b37Var.f370500e)) && n51.f.a(java.lang.Integer.valueOf(this.f370501f), java.lang.Integer.valueOf(b37Var.f370501f)) && n51.f.a(java.lang.Integer.valueOf(this.f370502g), java.lang.Integer.valueOf(b37Var.f370502g)) && n51.f.a(java.lang.Integer.valueOf(this.f370503h), java.lang.Integer.valueOf(b37Var.f370503h)) && n51.f.a(java.lang.Integer.valueOf(this.f370504i), java.lang.Integer.valueOf(b37Var.f370504i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370499d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f370500e);
            fVar.e(3, this.f370501f);
            fVar.e(4, this.f370502g);
            fVar.e(5, this.f370503h);
            fVar.e(6, this.f370504i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f370499d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f370500e) + b36.f.e(3, this.f370501f) + b36.f.e(4, this.f370502g) + b36.f.e(5, this.f370503h) + b36.f.e(6, this.f370504i);
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
        r45.b37 b37Var = (r45.b37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b37Var.f370499d = aVar2.k(intValue);
                return 0;
            case 2:
                b37Var.f370500e = aVar2.g(intValue);
                return 0;
            case 3:
                b37Var.f370501f = aVar2.g(intValue);
                return 0;
            case 4:
                b37Var.f370502g = aVar2.g(intValue);
                return 0;
            case 5:
                b37Var.f370503h = aVar2.g(intValue);
                return 0;
            case 6:
                b37Var.f370504i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
