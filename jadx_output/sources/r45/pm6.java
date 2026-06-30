package r45;

/* loaded from: classes8.dex */
public class pm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383187e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383188f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f383189g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383190h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383191i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383192m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383193n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f383194o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383195p;

    /* renamed from: q, reason: collision with root package name */
    public int f383196q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f383197r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f383198s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f383199t;

    /* renamed from: u, reason: collision with root package name */
    public int f383200u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f383201v;

    /* renamed from: w, reason: collision with root package name */
    public int f383202w;

    /* renamed from: x, reason: collision with root package name */
    public r45.om6 f383203x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm6)) {
            return false;
        }
        r45.pm6 pm6Var = (r45.pm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383186d), java.lang.Integer.valueOf(pm6Var.f383186d)) && n51.f.a(this.f383187e, pm6Var.f383187e) && n51.f.a(this.f383188f, pm6Var.f383188f) && n51.f.a(this.f383189g, pm6Var.f383189g) && n51.f.a(this.f383190h, pm6Var.f383190h) && n51.f.a(this.f383191i, pm6Var.f383191i) && n51.f.a(this.f383192m, pm6Var.f383192m) && n51.f.a(this.f383193n, pm6Var.f383193n) && n51.f.a(java.lang.Boolean.valueOf(this.f383194o), java.lang.Boolean.valueOf(pm6Var.f383194o)) && n51.f.a(this.f383195p, pm6Var.f383195p) && n51.f.a(java.lang.Integer.valueOf(this.f383196q), java.lang.Integer.valueOf(pm6Var.f383196q)) && n51.f.a(this.f383197r, pm6Var.f383197r) && n51.f.a(this.f383198s, pm6Var.f383198s) && n51.f.a(this.f383199t, pm6Var.f383199t) && n51.f.a(java.lang.Integer.valueOf(this.f383200u), java.lang.Integer.valueOf(pm6Var.f383200u)) && n51.f.a(this.f383201v, pm6Var.f383201v) && n51.f.a(java.lang.Integer.valueOf(this.f383202w), java.lang.Integer.valueOf(pm6Var.f383202w)) && n51.f.a(this.f383203x, pm6Var.f383203x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383186d);
            java.lang.String str = this.f383187e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383188f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f383189g);
            java.lang.String str3 = this.f383190h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f383191i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f383192m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f383193n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.a(9, this.f383194o);
            java.lang.String str7 = this.f383195p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f383196q);
            java.lang.String str8 = this.f383197r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f383198s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f383199t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            fVar.e(15, this.f383200u);
            java.lang.String str11 = this.f383201v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.e(17, this.f383202w);
            r45.om6 om6Var = this.f383203x;
            if (om6Var != null) {
                fVar.i(18, om6Var.computeSize());
                this.f383203x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383186d) + 0;
            java.lang.String str12 = this.f383187e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f383188f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            int g17 = e17 + b36.f.g(4, 1, this.f383189g);
            java.lang.String str14 = this.f383190h;
            if (str14 != null) {
                g17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f383191i;
            if (str15 != null) {
                g17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f383192m;
            if (str16 != null) {
                g17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f383193n;
            if (str17 != null) {
                g17 += b36.f.j(8, str17);
            }
            int a17 = g17 + b36.f.a(9, this.f383194o);
            java.lang.String str18 = this.f383195p;
            if (str18 != null) {
                a17 += b36.f.j(10, str18);
            }
            int e18 = a17 + b36.f.e(11, this.f383196q);
            java.lang.String str19 = this.f383197r;
            if (str19 != null) {
                e18 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f383198s;
            if (str20 != null) {
                e18 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f383199t;
            if (str21 != null) {
                e18 += b36.f.j(14, str21);
            }
            int e19 = e18 + b36.f.e(15, this.f383200u);
            java.lang.String str22 = this.f383201v;
            if (str22 != null) {
                e19 += b36.f.j(16, str22);
            }
            int e27 = e19 + b36.f.e(17, this.f383202w);
            r45.om6 om6Var2 = this.f383203x;
            return om6Var2 != null ? e27 + b36.f.i(18, om6Var2.computeSize()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383189g.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.pm6 pm6Var = (r45.pm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pm6Var.f383186d = aVar2.g(intValue);
                return 0;
            case 2:
                pm6Var.f383187e = aVar2.k(intValue);
                return 0;
            case 3:
                pm6Var.f383188f = aVar2.k(intValue);
                return 0;
            case 4:
                pm6Var.f383189g.add(aVar2.k(intValue));
                return 0;
            case 5:
                pm6Var.f383190h = aVar2.k(intValue);
                return 0;
            case 6:
                pm6Var.f383191i = aVar2.k(intValue);
                return 0;
            case 7:
                pm6Var.f383192m = aVar2.k(intValue);
                return 0;
            case 8:
                pm6Var.f383193n = aVar2.k(intValue);
                return 0;
            case 9:
                pm6Var.f383194o = aVar2.c(intValue);
                return 0;
            case 10:
                pm6Var.f383195p = aVar2.k(intValue);
                return 0;
            case 11:
                pm6Var.f383196q = aVar2.g(intValue);
                return 0;
            case 12:
                pm6Var.f383197r = aVar2.k(intValue);
                return 0;
            case 13:
                pm6Var.f383198s = aVar2.k(intValue);
                return 0;
            case 14:
                pm6Var.f383199t = aVar2.k(intValue);
                return 0;
            case 15:
                pm6Var.f383200u = aVar2.g(intValue);
                return 0;
            case 16:
                pm6Var.f383201v = aVar2.k(intValue);
                return 0;
            case 17:
                pm6Var.f383202w = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.om6 om6Var3 = new r45.om6();
                    if (bArr2 != null && bArr2.length > 0) {
                        om6Var3.parseFrom(bArr2);
                    }
                    pm6Var.f383203x = om6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
