package r45;

/* loaded from: classes4.dex */
public class vh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f388234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f388235e;

    /* renamed from: f, reason: collision with root package name */
    public int f388236f;

    /* renamed from: g, reason: collision with root package name */
    public int f388237g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388238h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f388239i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f388241n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388242o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f388243p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh4)) {
            return false;
        }
        r45.vh4 vh4Var = (r45.vh4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f388234d), java.lang.Boolean.valueOf(vh4Var.f388234d)) && n51.f.a(java.lang.Boolean.valueOf(this.f388235e), java.lang.Boolean.valueOf(vh4Var.f388235e)) && n51.f.a(java.lang.Integer.valueOf(this.f388236f), java.lang.Integer.valueOf(vh4Var.f388236f)) && n51.f.a(java.lang.Integer.valueOf(this.f388237g), java.lang.Integer.valueOf(vh4Var.f388237g)) && n51.f.a(this.f388238h, vh4Var.f388238h) && n51.f.a(java.lang.Boolean.valueOf(this.f388239i), java.lang.Boolean.valueOf(vh4Var.f388239i)) && n51.f.a(this.f388240m, vh4Var.f388240m) && n51.f.a(java.lang.Boolean.valueOf(this.f388241n), java.lang.Boolean.valueOf(vh4Var.f388241n)) && n51.f.a(this.f388242o, vh4Var.f388242o) && n51.f.a(java.lang.Boolean.valueOf(this.f388243p), java.lang.Boolean.valueOf(vh4Var.f388243p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f388234d);
            fVar.a(2, this.f388235e);
            fVar.e(3, this.f388236f);
            fVar.e(4, this.f388237g);
            java.lang.String str = this.f388238h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.a(6, this.f388239i);
            java.lang.String str2 = this.f388240m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.a(8, this.f388241n);
            java.lang.String str3 = this.f388242o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f388243p);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f388234d) + 0 + b36.f.a(2, this.f388235e) + b36.f.e(3, this.f388236f) + b36.f.e(4, this.f388237g);
            java.lang.String str4 = this.f388238h;
            if (str4 != null) {
                a17 += b36.f.j(5, str4);
            }
            int a18 = a17 + b36.f.a(6, this.f388239i);
            java.lang.String str5 = this.f388240m;
            if (str5 != null) {
                a18 += b36.f.j(7, str5);
            }
            int a19 = a18 + b36.f.a(8, this.f388241n);
            java.lang.String str6 = this.f388242o;
            if (str6 != null) {
                a19 += b36.f.j(9, str6);
            }
            return a19 + b36.f.a(10, this.f388243p);
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
        r45.vh4 vh4Var = (r45.vh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vh4Var.f388234d = aVar2.c(intValue);
                return 0;
            case 2:
                vh4Var.f388235e = aVar2.c(intValue);
                return 0;
            case 3:
                vh4Var.f388236f = aVar2.g(intValue);
                return 0;
            case 4:
                vh4Var.f388237g = aVar2.g(intValue);
                return 0;
            case 5:
                vh4Var.f388238h = aVar2.k(intValue);
                return 0;
            case 6:
                vh4Var.f388239i = aVar2.c(intValue);
                return 0;
            case 7:
                vh4Var.f388240m = aVar2.k(intValue);
                return 0;
            case 8:
                vh4Var.f388241n = aVar2.c(intValue);
                return 0;
            case 9:
                vh4Var.f388242o = aVar2.k(intValue);
                return 0;
            case 10:
                vh4Var.f388243p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
