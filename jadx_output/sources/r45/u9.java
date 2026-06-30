package r45;

/* loaded from: classes8.dex */
public class u9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387146d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387147e;

    /* renamed from: f, reason: collision with root package name */
    public int f387148f;

    /* renamed from: g, reason: collision with root package name */
    public int f387149g;

    /* renamed from: h, reason: collision with root package name */
    public long f387150h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u9)) {
            return false;
        }
        r45.u9 u9Var = (r45.u9) fVar;
        return n51.f.a(this.f387146d, u9Var.f387146d) && n51.f.a(this.f387147e, u9Var.f387147e) && n51.f.a(java.lang.Integer.valueOf(this.f387148f), java.lang.Integer.valueOf(u9Var.f387148f)) && n51.f.a(java.lang.Integer.valueOf(this.f387149g), java.lang.Integer.valueOf(u9Var.f387149g)) && n51.f.a(java.lang.Long.valueOf(this.f387150h), java.lang.Long.valueOf(u9Var.f387150h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387146d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387147e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f387148f);
            fVar.e(4, this.f387149g);
            fVar.h(5, this.f387150h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387146d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f387147e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f387148f) + b36.f.e(4, this.f387149g) + b36.f.h(5, this.f387150h);
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
        r45.u9 u9Var = (r45.u9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u9Var.f387146d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            u9Var.f387147e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            u9Var.f387148f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            u9Var.f387149g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        u9Var.f387150h = aVar2.i(intValue);
        return 0;
    }
}
