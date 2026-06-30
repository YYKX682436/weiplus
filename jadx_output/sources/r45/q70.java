package r45;

/* loaded from: classes8.dex */
public class q70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383719d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383720e;

    /* renamed from: f, reason: collision with root package name */
    public int f383721f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383722g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f383723h;

    /* renamed from: i, reason: collision with root package name */
    public int f383724i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q70)) {
            return false;
        }
        r45.q70 q70Var = (r45.q70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383719d), java.lang.Integer.valueOf(q70Var.f383719d)) && n51.f.a(this.f383720e, q70Var.f383720e) && n51.f.a(java.lang.Integer.valueOf(this.f383721f), java.lang.Integer.valueOf(q70Var.f383721f)) && n51.f.a(this.f383722g, q70Var.f383722g) && n51.f.a(java.lang.Boolean.valueOf(this.f383723h), java.lang.Boolean.valueOf(q70Var.f383723h)) && n51.f.a(java.lang.Integer.valueOf(this.f383724i), java.lang.Integer.valueOf(q70Var.f383724i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383719d);
            com.tencent.mm.protobuf.g gVar = this.f383720e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f383721f);
            java.lang.String str = this.f383722g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f383723h);
            fVar.e(6, this.f383724i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383719d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f383720e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f383721f);
            java.lang.String str2 = this.f383722g;
            if (str2 != null) {
                e18 += b36.f.j(4, str2);
            }
            return e18 + b36.f.a(5, this.f383723h) + b36.f.e(6, this.f383724i);
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
        r45.q70 q70Var = (r45.q70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q70Var.f383719d = aVar2.g(intValue);
                return 0;
            case 2:
                q70Var.f383720e = aVar2.d(intValue);
                return 0;
            case 3:
                q70Var.f383721f = aVar2.g(intValue);
                return 0;
            case 4:
                q70Var.f383722g = aVar2.k(intValue);
                return 0;
            case 5:
                q70Var.f383723h = aVar2.c(intValue);
                return 0;
            case 6:
                q70Var.f383724i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
