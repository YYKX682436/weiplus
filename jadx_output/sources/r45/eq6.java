package r45;

/* loaded from: classes11.dex */
public class eq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373678d;

    /* renamed from: e, reason: collision with root package name */
    public int f373679e;

    /* renamed from: f, reason: collision with root package name */
    public int f373680f;

    /* renamed from: g, reason: collision with root package name */
    public int f373681g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373682h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373683i;

    /* renamed from: m, reason: collision with root package name */
    public int f373684m;

    /* renamed from: n, reason: collision with root package name */
    public int f373685n;

    /* renamed from: o, reason: collision with root package name */
    public int f373686o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eq6)) {
            return false;
        }
        r45.eq6 eq6Var = (r45.eq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373678d), java.lang.Integer.valueOf(eq6Var.f373678d)) && n51.f.a(java.lang.Integer.valueOf(this.f373679e), java.lang.Integer.valueOf(eq6Var.f373679e)) && n51.f.a(java.lang.Integer.valueOf(this.f373680f), java.lang.Integer.valueOf(eq6Var.f373680f)) && n51.f.a(java.lang.Integer.valueOf(this.f373681g), java.lang.Integer.valueOf(eq6Var.f373681g)) && n51.f.a(this.f373682h, eq6Var.f373682h) && n51.f.a(this.f373683i, eq6Var.f373683i) && n51.f.a(java.lang.Integer.valueOf(this.f373684m), java.lang.Integer.valueOf(eq6Var.f373684m)) && n51.f.a(java.lang.Integer.valueOf(this.f373685n), java.lang.Integer.valueOf(eq6Var.f373685n)) && n51.f.a(java.lang.Integer.valueOf(this.f373686o), java.lang.Integer.valueOf(eq6Var.f373686o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373678d);
            fVar.e(2, this.f373679e);
            fVar.e(3, this.f373680f);
            fVar.e(4, this.f373681g);
            java.lang.String str = this.f373682h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f373683i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f373684m);
            fVar.e(8, this.f373685n);
            fVar.e(9, this.f373686o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373678d) + 0 + b36.f.e(2, this.f373679e) + b36.f.e(3, this.f373680f) + b36.f.e(4, this.f373681g);
            java.lang.String str3 = this.f373682h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f373683i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f373684m) + b36.f.e(8, this.f373685n) + b36.f.e(9, this.f373686o);
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
        r45.eq6 eq6Var = (r45.eq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eq6Var.f373678d = aVar2.g(intValue);
                return 0;
            case 2:
                eq6Var.f373679e = aVar2.g(intValue);
                return 0;
            case 3:
                eq6Var.f373680f = aVar2.g(intValue);
                return 0;
            case 4:
                eq6Var.f373681g = aVar2.g(intValue);
                return 0;
            case 5:
                eq6Var.f373682h = aVar2.k(intValue);
                return 0;
            case 6:
                eq6Var.f373683i = aVar2.k(intValue);
                return 0;
            case 7:
                eq6Var.f373684m = aVar2.g(intValue);
                return 0;
            case 8:
                eq6Var.f373685n = aVar2.g(intValue);
                return 0;
            case 9:
                eq6Var.f373686o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
