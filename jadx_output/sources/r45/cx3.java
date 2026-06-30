package r45;

/* loaded from: classes9.dex */
public class cx3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371883d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371884e;

    /* renamed from: f, reason: collision with root package name */
    public long f371885f;

    /* renamed from: g, reason: collision with root package name */
    public int f371886g;

    /* renamed from: h, reason: collision with root package name */
    public int f371887h;

    /* renamed from: i, reason: collision with root package name */
    public int f371888i;

    /* renamed from: m, reason: collision with root package name */
    public int f371889m;

    /* renamed from: n, reason: collision with root package name */
    public int f371890n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371891o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371892p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371893q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371894r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f371895s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f371896t;

    /* renamed from: u, reason: collision with root package name */
    public int f371897u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx3)) {
            return false;
        }
        r45.cx3 cx3Var = (r45.cx3) fVar;
        return n51.f.a(this.f371883d, cx3Var.f371883d) && n51.f.a(this.f371884e, cx3Var.f371884e) && n51.f.a(java.lang.Long.valueOf(this.f371885f), java.lang.Long.valueOf(cx3Var.f371885f)) && n51.f.a(java.lang.Integer.valueOf(this.f371886g), java.lang.Integer.valueOf(cx3Var.f371886g)) && n51.f.a(java.lang.Integer.valueOf(this.f371887h), java.lang.Integer.valueOf(cx3Var.f371887h)) && n51.f.a(java.lang.Integer.valueOf(this.f371888i), java.lang.Integer.valueOf(cx3Var.f371888i)) && n51.f.a(java.lang.Integer.valueOf(this.f371889m), java.lang.Integer.valueOf(cx3Var.f371889m)) && n51.f.a(java.lang.Integer.valueOf(this.f371890n), java.lang.Integer.valueOf(cx3Var.f371890n)) && n51.f.a(this.f371891o, cx3Var.f371891o) && n51.f.a(this.f371892p, cx3Var.f371892p) && n51.f.a(this.f371893q, cx3Var.f371893q) && n51.f.a(this.f371894r, cx3Var.f371894r) && n51.f.a(this.f371895s, cx3Var.f371895s) && n51.f.a(this.f371896t, cx3Var.f371896t) && n51.f.a(java.lang.Integer.valueOf(this.f371897u), java.lang.Integer.valueOf(cx3Var.f371897u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371883d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371884e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f371885f);
            fVar.e(4, this.f371886g);
            fVar.e(5, this.f371887h);
            fVar.e(6, this.f371888i);
            fVar.e(7, this.f371889m);
            fVar.e(8, this.f371890n);
            java.lang.String str3 = this.f371891o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f371892p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f371893q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f371894r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f371895s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f371896t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.e(15, this.f371897u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f371883d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f371884e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int h17 = j17 + b36.f.h(3, this.f371885f) + b36.f.e(4, this.f371886g) + b36.f.e(5, this.f371887h) + b36.f.e(6, this.f371888i) + b36.f.e(7, this.f371889m) + b36.f.e(8, this.f371890n);
            java.lang.String str11 = this.f371891o;
            if (str11 != null) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f371892p;
            if (str12 != null) {
                h17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f371893q;
            if (str13 != null) {
                h17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f371894r;
            if (str14 != null) {
                h17 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f371895s;
            if (str15 != null) {
                h17 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f371896t;
            if (str16 != null) {
                h17 += b36.f.j(14, str16);
            }
            return h17 + b36.f.e(15, this.f371897u);
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
        r45.cx3 cx3Var = (r45.cx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cx3Var.f371883d = aVar2.k(intValue);
                return 0;
            case 2:
                cx3Var.f371884e = aVar2.k(intValue);
                return 0;
            case 3:
                cx3Var.f371885f = aVar2.i(intValue);
                return 0;
            case 4:
                cx3Var.f371886g = aVar2.g(intValue);
                return 0;
            case 5:
                cx3Var.f371887h = aVar2.g(intValue);
                return 0;
            case 6:
                cx3Var.f371888i = aVar2.g(intValue);
                return 0;
            case 7:
                cx3Var.f371889m = aVar2.g(intValue);
                return 0;
            case 8:
                cx3Var.f371890n = aVar2.g(intValue);
                return 0;
            case 9:
                cx3Var.f371891o = aVar2.k(intValue);
                return 0;
            case 10:
                cx3Var.f371892p = aVar2.k(intValue);
                return 0;
            case 11:
                cx3Var.f371893q = aVar2.k(intValue);
                return 0;
            case 12:
                cx3Var.f371894r = aVar2.k(intValue);
                return 0;
            case 13:
                cx3Var.f371895s = aVar2.k(intValue);
                return 0;
            case 14:
                cx3Var.f371896t = aVar2.k(intValue);
                return 0;
            case 15:
                cx3Var.f371897u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
