package r45;

/* loaded from: classes15.dex */
public class w35 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388850o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f388851p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388842d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f388843e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f388844f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f388845g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f388846h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f388847i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388848m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f388849n = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388852q = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w35)) {
            return false;
        }
        r45.w35 w35Var = (r45.w35) fVar;
        return n51.f.a(this.f388842d, w35Var.f388842d) && n51.f.a(java.lang.Boolean.valueOf(this.f388843e), java.lang.Boolean.valueOf(w35Var.f388843e)) && n51.f.a(java.lang.Long.valueOf(this.f388844f), java.lang.Long.valueOf(w35Var.f388844f)) && n51.f.a(java.lang.Long.valueOf(this.f388845g), java.lang.Long.valueOf(w35Var.f388845g)) && n51.f.a(java.lang.Long.valueOf(this.f388846h), java.lang.Long.valueOf(w35Var.f388846h)) && n51.f.a(java.lang.Integer.valueOf(this.f388847i), java.lang.Integer.valueOf(w35Var.f388847i)) && n51.f.a(this.f388848m, w35Var.f388848m) && n51.f.a(java.lang.Integer.valueOf(this.f388849n), java.lang.Integer.valueOf(w35Var.f388849n)) && n51.f.a(this.f388850o, w35Var.f388850o) && n51.f.a(java.lang.Boolean.valueOf(this.f388851p), java.lang.Boolean.valueOf(w35Var.f388851p)) && n51.f.a(this.f388852q, w35Var.f388852q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388842d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f388843e);
            fVar.h(3, this.f388844f);
            fVar.h(4, this.f388845g);
            fVar.h(5, this.f388846h);
            fVar.e(6, this.f388847i);
            java.lang.String str2 = this.f388848m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f388849n);
            java.lang.String str3 = this.f388850o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f388851p);
            java.lang.String str4 = this.f388852q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388842d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.a(2, this.f388843e) + b36.f.h(3, this.f388844f) + b36.f.h(4, this.f388845g) + b36.f.h(5, this.f388846h) + b36.f.e(6, this.f388847i);
            java.lang.String str6 = this.f388848m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            int e17 = j17 + b36.f.e(8, this.f388849n);
            java.lang.String str7 = this.f388850o;
            if (str7 != null) {
                e17 += b36.f.j(9, str7);
            }
            int a17 = e17 + b36.f.a(10, this.f388851p);
            java.lang.String str8 = this.f388852q;
            return str8 != null ? a17 + b36.f.j(11, str8) : a17;
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
        r45.w35 w35Var = (r45.w35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w35Var.f388842d = aVar2.k(intValue);
                return 0;
            case 2:
                w35Var.f388843e = aVar2.c(intValue);
                return 0;
            case 3:
                w35Var.f388844f = aVar2.i(intValue);
                return 0;
            case 4:
                w35Var.f388845g = aVar2.i(intValue);
                return 0;
            case 5:
                w35Var.f388846h = aVar2.i(intValue);
                return 0;
            case 6:
                w35Var.f388847i = aVar2.g(intValue);
                return 0;
            case 7:
                w35Var.f388848m = aVar2.k(intValue);
                return 0;
            case 8:
                w35Var.f388849n = aVar2.g(intValue);
                return 0;
            case 9:
                w35Var.f388850o = aVar2.k(intValue);
                return 0;
            case 10:
                w35Var.f388851p = aVar2.c(intValue);
                return 0;
            case 11:
                w35Var.f388852q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
