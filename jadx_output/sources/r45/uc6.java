package r45;

/* loaded from: classes9.dex */
public class uc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f387226d;

    /* renamed from: e, reason: collision with root package name */
    public int f387227e;

    /* renamed from: f, reason: collision with root package name */
    public int f387228f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f387229g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f387230h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc6)) {
            return false;
        }
        r45.uc6 uc6Var = (r45.uc6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f387226d), java.lang.Long.valueOf(uc6Var.f387226d)) && n51.f.a(java.lang.Integer.valueOf(this.f387227e), java.lang.Integer.valueOf(uc6Var.f387227e)) && n51.f.a(java.lang.Integer.valueOf(this.f387228f), java.lang.Integer.valueOf(uc6Var.f387228f)) && n51.f.a(java.lang.Boolean.valueOf(this.f387229g), java.lang.Boolean.valueOf(uc6Var.f387229g)) && n51.f.a(java.lang.Boolean.valueOf(this.f387230h), java.lang.Boolean.valueOf(uc6Var.f387230h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f387226d);
            fVar.e(2, this.f387227e);
            fVar.e(3, this.f387228f);
            fVar.a(4, this.f387229g);
            fVar.a(5, this.f387230h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f387226d) + 0 + b36.f.e(2, this.f387227e) + b36.f.e(3, this.f387228f) + b36.f.a(4, this.f387229g) + b36.f.a(5, this.f387230h);
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
        r45.uc6 uc6Var = (r45.uc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uc6Var.f387226d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            uc6Var.f387227e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            uc6Var.f387228f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            uc6Var.f387229g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uc6Var.f387230h = aVar2.c(intValue);
        return 0;
    }
}
