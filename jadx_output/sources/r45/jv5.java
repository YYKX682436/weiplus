package r45;

/* loaded from: classes7.dex */
public class jv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378132e;

    /* renamed from: f, reason: collision with root package name */
    public int f378133f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378134g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378135h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378136i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378137m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jv5)) {
            return false;
        }
        r45.jv5 jv5Var = (r45.jv5) fVar;
        return n51.f.a(this.f378131d, jv5Var.f378131d) && n51.f.a(this.f378132e, jv5Var.f378132e) && n51.f.a(java.lang.Integer.valueOf(this.f378133f), java.lang.Integer.valueOf(jv5Var.f378133f)) && n51.f.a(this.f378134g, jv5Var.f378134g) && n51.f.a(this.f378135h, jv5Var.f378135h) && n51.f.a(this.f378136i, jv5Var.f378136i) && n51.f.a(this.f378137m, jv5Var.f378137m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378131d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378132e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f378133f);
            java.lang.String str3 = this.f378134g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378135h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f378136i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f378137m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f378131d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f378132e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f378133f);
            java.lang.String str9 = this.f378134g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f378135h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f378136i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f378137m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.jv5 jv5Var = (r45.jv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jv5Var.f378131d = aVar2.k(intValue);
                return 0;
            case 2:
                jv5Var.f378132e = aVar2.k(intValue);
                return 0;
            case 3:
                jv5Var.f378133f = aVar2.g(intValue);
                return 0;
            case 4:
                jv5Var.f378134g = aVar2.k(intValue);
                return 0;
            case 5:
                jv5Var.f378135h = aVar2.k(intValue);
                return 0;
            case 6:
                jv5Var.f378136i = aVar2.k(intValue);
                return 0;
            case 7:
                jv5Var.f378137m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
