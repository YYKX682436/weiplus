package r45;

/* loaded from: classes7.dex */
public class t1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f386053d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f386054e;

    /* renamed from: f, reason: collision with root package name */
    public int f386055f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f386056g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386057h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t1)) {
            return false;
        }
        r45.t1 t1Var = (r45.t1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f386053d), java.lang.Boolean.valueOf(t1Var.f386053d)) && n51.f.a(java.lang.Boolean.valueOf(this.f386054e), java.lang.Boolean.valueOf(t1Var.f386054e)) && n51.f.a(java.lang.Integer.valueOf(this.f386055f), java.lang.Integer.valueOf(t1Var.f386055f)) && n51.f.a(java.lang.Boolean.valueOf(this.f386056g), java.lang.Boolean.valueOf(t1Var.f386056g)) && n51.f.a(this.f386057h, t1Var.f386057h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f386053d);
            fVar.a(2, this.f386054e);
            fVar.e(3, this.f386055f);
            fVar.a(4, this.f386056g);
            com.tencent.mm.protobuf.g gVar = this.f386057h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f386053d) + 0 + b36.f.a(2, this.f386054e) + b36.f.e(3, this.f386055f) + b36.f.a(4, this.f386056g);
            com.tencent.mm.protobuf.g gVar2 = this.f386057h;
            return gVar2 != null ? a17 + b36.f.b(5, gVar2) : a17;
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
        r45.t1 t1Var = (r45.t1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t1Var.f386053d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            t1Var.f386054e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            t1Var.f386055f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            t1Var.f386056g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        t1Var.f386057h = aVar2.d(intValue);
        return 0;
    }
}
