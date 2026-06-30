package r45;

/* loaded from: classes8.dex */
public class j83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377638d;

    /* renamed from: e, reason: collision with root package name */
    public int f377639e;

    /* renamed from: f, reason: collision with root package name */
    public int f377640f;

    /* renamed from: g, reason: collision with root package name */
    public int f377641g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377642h;

    /* renamed from: i, reason: collision with root package name */
    public int f377643i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377644m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377645n;

    /* renamed from: o, reason: collision with root package name */
    public long f377646o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f377647p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j83)) {
            return false;
        }
        r45.j83 j83Var = (r45.j83) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377638d), java.lang.Long.valueOf(j83Var.f377638d)) && n51.f.a(java.lang.Integer.valueOf(this.f377639e), java.lang.Integer.valueOf(j83Var.f377639e)) && n51.f.a(java.lang.Integer.valueOf(this.f377640f), java.lang.Integer.valueOf(j83Var.f377640f)) && n51.f.a(java.lang.Integer.valueOf(this.f377641g), java.lang.Integer.valueOf(j83Var.f377641g)) && n51.f.a(this.f377642h, j83Var.f377642h) && n51.f.a(java.lang.Integer.valueOf(this.f377643i), java.lang.Integer.valueOf(j83Var.f377643i)) && n51.f.a(this.f377644m, j83Var.f377644m) && n51.f.a(this.f377645n, j83Var.f377645n) && n51.f.a(java.lang.Long.valueOf(this.f377646o), java.lang.Long.valueOf(j83Var.f377646o)) && n51.f.a(this.f377647p, j83Var.f377647p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f377638d);
            fVar.e(2, this.f377639e);
            fVar.e(5, this.f377640f);
            fVar.e(6, this.f377641g);
            java.lang.String str = this.f377642h;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f377643i);
            java.lang.String str2 = this.f377644m;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f377645n;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.h(11, this.f377646o);
            java.lang.String str4 = this.f377647p;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f377638d) + 0 + b36.f.e(2, this.f377639e) + b36.f.e(5, this.f377640f) + b36.f.e(6, this.f377641g);
            java.lang.String str5 = this.f377642h;
            if (str5 != null) {
                h17 += b36.f.j(7, str5);
            }
            int e17 = h17 + b36.f.e(8, this.f377643i);
            java.lang.String str6 = this.f377644m;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            java.lang.String str7 = this.f377645n;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            int h18 = e17 + b36.f.h(11, this.f377646o);
            java.lang.String str8 = this.f377647p;
            return str8 != null ? h18 + b36.f.j(12, str8) : h18;
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
        r45.j83 j83Var = (r45.j83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j83Var.f377638d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            j83Var.f377639e = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                j83Var.f377640f = aVar2.g(intValue);
                return 0;
            case 6:
                j83Var.f377641g = aVar2.g(intValue);
                return 0;
            case 7:
                j83Var.f377642h = aVar2.k(intValue);
                return 0;
            case 8:
                j83Var.f377643i = aVar2.g(intValue);
                return 0;
            case 9:
                j83Var.f377644m = aVar2.k(intValue);
                return 0;
            case 10:
                j83Var.f377645n = aVar2.k(intValue);
                return 0;
            case 11:
                j83Var.f377646o = aVar2.i(intValue);
                return 0;
            case 12:
                j83Var.f377647p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
