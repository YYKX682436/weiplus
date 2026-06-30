package r45;

/* loaded from: classes8.dex */
public class xe5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390014d;

    /* renamed from: e, reason: collision with root package name */
    public int f390015e;

    /* renamed from: f, reason: collision with root package name */
    public int f390016f;

    /* renamed from: g, reason: collision with root package name */
    public int f390017g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390018h;

    /* renamed from: i, reason: collision with root package name */
    public int f390019i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390020m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe5)) {
            return false;
        }
        r45.xe5 xe5Var = (r45.xe5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390014d), java.lang.Integer.valueOf(xe5Var.f390014d)) && n51.f.a(java.lang.Integer.valueOf(this.f390015e), java.lang.Integer.valueOf(xe5Var.f390015e)) && n51.f.a(java.lang.Integer.valueOf(this.f390016f), java.lang.Integer.valueOf(xe5Var.f390016f)) && n51.f.a(java.lang.Integer.valueOf(this.f390017g), java.lang.Integer.valueOf(xe5Var.f390017g)) && n51.f.a(this.f390018h, xe5Var.f390018h) && n51.f.a(java.lang.Integer.valueOf(this.f390019i), java.lang.Integer.valueOf(xe5Var.f390019i)) && n51.f.a(this.f390020m, xe5Var.f390020m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390014d);
            fVar.e(2, this.f390015e);
            fVar.e(3, this.f390016f);
            fVar.e(4, this.f390017g);
            java.lang.String str = this.f390018h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f390019i);
            java.lang.String str2 = this.f390020m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390014d) + 0 + b36.f.e(2, this.f390015e) + b36.f.e(3, this.f390016f) + b36.f.e(4, this.f390017g);
            java.lang.String str3 = this.f390018h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            int e18 = e17 + b36.f.e(6, this.f390019i);
            java.lang.String str4 = this.f390020m;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.xe5 xe5Var = (r45.xe5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xe5Var.f390014d = aVar2.g(intValue);
                return 0;
            case 2:
                xe5Var.f390015e = aVar2.g(intValue);
                return 0;
            case 3:
                xe5Var.f390016f = aVar2.g(intValue);
                return 0;
            case 4:
                xe5Var.f390017g = aVar2.g(intValue);
                return 0;
            case 5:
                xe5Var.f390018h = aVar2.k(intValue);
                return 0;
            case 6:
                xe5Var.f390019i = aVar2.g(intValue);
                return 0;
            case 7:
                xe5Var.f390020m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
