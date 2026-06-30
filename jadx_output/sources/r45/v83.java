package r45;

/* loaded from: classes8.dex */
public class v83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387984d;

    /* renamed from: e, reason: collision with root package name */
    public int f387985e;

    /* renamed from: f, reason: collision with root package name */
    public int f387986f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387987g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387988h;

    /* renamed from: i, reason: collision with root package name */
    public int f387989i;

    /* renamed from: m, reason: collision with root package name */
    public int f387990m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v83)) {
            return false;
        }
        r45.v83 v83Var = (r45.v83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387984d), java.lang.Integer.valueOf(v83Var.f387984d)) && n51.f.a(java.lang.Integer.valueOf(this.f387985e), java.lang.Integer.valueOf(v83Var.f387985e)) && n51.f.a(java.lang.Integer.valueOf(this.f387986f), java.lang.Integer.valueOf(v83Var.f387986f)) && n51.f.a(this.f387987g, v83Var.f387987g) && n51.f.a(this.f387988h, v83Var.f387988h) && n51.f.a(java.lang.Integer.valueOf(this.f387989i), java.lang.Integer.valueOf(v83Var.f387989i)) && n51.f.a(java.lang.Integer.valueOf(this.f387990m), java.lang.Integer.valueOf(v83Var.f387990m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387984d);
            fVar.e(2, this.f387985e);
            fVar.e(3, this.f387986f);
            java.lang.String str = this.f387987g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f387988h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(10, this.f387989i);
            fVar.e(11, this.f387990m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387984d) + 0 + b36.f.e(2, this.f387985e) + b36.f.e(3, this.f387986f);
            java.lang.String str3 = this.f387987g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f387988h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(10, this.f387989i) + b36.f.e(11, this.f387990m);
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
        r45.v83 v83Var = (r45.v83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v83Var.f387984d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            v83Var.f387985e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            v83Var.f387986f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            v83Var.f387987g = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            v83Var.f387988h = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 10) {
            v83Var.f387989i = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 11) {
            return -1;
        }
        v83Var.f387990m = aVar2.g(intValue);
        return 0;
    }
}
