package r45;

/* loaded from: classes8.dex */
public class ku4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378959e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378960f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378961g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378962h;

    /* renamed from: i, reason: collision with root package name */
    public int f378963i;

    /* renamed from: m, reason: collision with root package name */
    public int f378964m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378965n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ku4)) {
            return false;
        }
        r45.ku4 ku4Var = (r45.ku4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378958d), java.lang.Integer.valueOf(ku4Var.f378958d)) && n51.f.a(this.f378959e, ku4Var.f378959e) && n51.f.a(this.f378960f, ku4Var.f378960f) && n51.f.a(this.f378961g, ku4Var.f378961g) && n51.f.a(this.f378962h, ku4Var.f378962h) && n51.f.a(java.lang.Integer.valueOf(this.f378963i), java.lang.Integer.valueOf(ku4Var.f378963i)) && n51.f.a(java.lang.Integer.valueOf(this.f378964m), java.lang.Integer.valueOf(ku4Var.f378964m)) && n51.f.a(this.f378965n, ku4Var.f378965n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378958d);
            java.lang.String str = this.f378959e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378960f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378961g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378962h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f378963i);
            fVar.e(7, this.f378964m);
            java.lang.String str5 = this.f378965n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378958d) + 0;
            java.lang.String str6 = this.f378959e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f378960f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f378961g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f378962h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f378963i) + b36.f.e(7, this.f378964m);
            java.lang.String str10 = this.f378965n;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.ku4 ku4Var = (r45.ku4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ku4Var.f378958d = aVar2.g(intValue);
                return 0;
            case 2:
                ku4Var.f378959e = aVar2.k(intValue);
                return 0;
            case 3:
                ku4Var.f378960f = aVar2.k(intValue);
                return 0;
            case 4:
                ku4Var.f378961g = aVar2.k(intValue);
                return 0;
            case 5:
                ku4Var.f378962h = aVar2.k(intValue);
                return 0;
            case 6:
                ku4Var.f378963i = aVar2.g(intValue);
                return 0;
            case 7:
                ku4Var.f378964m = aVar2.g(intValue);
                return 0;
            case 8:
                ku4Var.f378965n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
