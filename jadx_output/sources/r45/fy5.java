package r45;

/* loaded from: classes12.dex */
public class fy5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374731d;

    /* renamed from: e, reason: collision with root package name */
    public int f374732e;

    /* renamed from: f, reason: collision with root package name */
    public int f374733f;

    /* renamed from: g, reason: collision with root package name */
    public int f374734g;

    /* renamed from: h, reason: collision with root package name */
    public int f374735h;

    /* renamed from: i, reason: collision with root package name */
    public int f374736i;

    /* renamed from: m, reason: collision with root package name */
    public int f374737m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374738n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fy5)) {
            return false;
        }
        r45.fy5 fy5Var = (r45.fy5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374731d), java.lang.Integer.valueOf(fy5Var.f374731d)) && n51.f.a(java.lang.Integer.valueOf(this.f374732e), java.lang.Integer.valueOf(fy5Var.f374732e)) && n51.f.a(java.lang.Integer.valueOf(this.f374733f), java.lang.Integer.valueOf(fy5Var.f374733f)) && n51.f.a(java.lang.Integer.valueOf(this.f374734g), java.lang.Integer.valueOf(fy5Var.f374734g)) && n51.f.a(java.lang.Integer.valueOf(this.f374735h), java.lang.Integer.valueOf(fy5Var.f374735h)) && n51.f.a(java.lang.Integer.valueOf(this.f374736i), java.lang.Integer.valueOf(fy5Var.f374736i)) && n51.f.a(java.lang.Integer.valueOf(this.f374737m), java.lang.Integer.valueOf(fy5Var.f374737m)) && n51.f.a(this.f374738n, fy5Var.f374738n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374731d);
            fVar.e(2, this.f374732e);
            fVar.e(3, this.f374733f);
            fVar.e(4, this.f374734g);
            fVar.e(5, this.f374735h);
            fVar.e(6, this.f374736i);
            fVar.e(7, this.f374737m);
            com.tencent.mm.protobuf.g gVar = this.f374738n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374731d) + 0 + b36.f.e(2, this.f374732e) + b36.f.e(3, this.f374733f) + b36.f.e(4, this.f374734g) + b36.f.e(5, this.f374735h) + b36.f.e(6, this.f374736i) + b36.f.e(7, this.f374737m);
            com.tencent.mm.protobuf.g gVar2 = this.f374738n;
            return gVar2 != null ? e17 + b36.f.b(8, gVar2) : e17;
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
        r45.fy5 fy5Var = (r45.fy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fy5Var.f374731d = aVar2.g(intValue);
                return 0;
            case 2:
                fy5Var.f374732e = aVar2.g(intValue);
                return 0;
            case 3:
                fy5Var.f374733f = aVar2.g(intValue);
                return 0;
            case 4:
                fy5Var.f374734g = aVar2.g(intValue);
                return 0;
            case 5:
                fy5Var.f374735h = aVar2.g(intValue);
                return 0;
            case 6:
                fy5Var.f374736i = aVar2.g(intValue);
                return 0;
            case 7:
                fy5Var.f374737m = aVar2.g(intValue);
                return 0;
            case 8:
                fy5Var.f374738n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
