package r45;

/* loaded from: classes2.dex */
public class x65 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389817d;

    /* renamed from: e, reason: collision with root package name */
    public int f389818e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389819f;

    /* renamed from: g, reason: collision with root package name */
    public int f389820g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389821h;

    /* renamed from: i, reason: collision with root package name */
    public int f389822i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389823m;

    /* renamed from: n, reason: collision with root package name */
    public int f389824n;

    /* renamed from: o, reason: collision with root package name */
    public int f389825o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389826p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389827q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f389828r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f389829s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f389830t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389831u;

    /* renamed from: v, reason: collision with root package name */
    public int f389832v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f389833w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x65)) {
            return false;
        }
        r45.x65 x65Var = (r45.x65) fVar;
        return n51.f.a(this.f389817d, x65Var.f389817d) && n51.f.a(java.lang.Integer.valueOf(this.f389818e), java.lang.Integer.valueOf(x65Var.f389818e)) && n51.f.a(this.f389819f, x65Var.f389819f) && n51.f.a(java.lang.Integer.valueOf(this.f389820g), java.lang.Integer.valueOf(x65Var.f389820g)) && n51.f.a(this.f389821h, x65Var.f389821h) && n51.f.a(java.lang.Integer.valueOf(this.f389822i), java.lang.Integer.valueOf(x65Var.f389822i)) && n51.f.a(this.f389823m, x65Var.f389823m) && n51.f.a(java.lang.Integer.valueOf(this.f389824n), java.lang.Integer.valueOf(x65Var.f389824n)) && n51.f.a(java.lang.Integer.valueOf(this.f389825o), java.lang.Integer.valueOf(x65Var.f389825o)) && n51.f.a(this.f389826p, x65Var.f389826p) && n51.f.a(this.f389827q, x65Var.f389827q) && n51.f.a(this.f389828r, x65Var.f389828r) && n51.f.a(this.f389829s, x65Var.f389829s) && n51.f.a(this.f389830t, x65Var.f389830t) && n51.f.a(this.f389831u, x65Var.f389831u) && n51.f.a(java.lang.Integer.valueOf(this.f389832v), java.lang.Integer.valueOf(x65Var.f389832v)) && n51.f.a(this.f389833w, x65Var.f389833w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389833w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389817d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389818e);
            java.lang.String str2 = this.f389819f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f389820g);
            java.lang.String str3 = this.f389821h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f389822i);
            java.lang.String str4 = this.f389823m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f389824n);
            fVar.e(9, this.f389825o);
            java.lang.String str5 = this.f389826p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f389827q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f389828r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f389829s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f389830t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f389831u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            fVar.e(16, this.f389832v);
            fVar.g(17, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f389817d;
            int j17 = (str11 != null ? b36.f.j(1, str11) + 0 : 0) + b36.f.e(2, this.f389818e);
            java.lang.String str12 = this.f389819f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            int e17 = j17 + b36.f.e(4, this.f389820g);
            java.lang.String str13 = this.f389821h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            int e18 = e17 + b36.f.e(6, this.f389822i);
            java.lang.String str14 = this.f389823m;
            if (str14 != null) {
                e18 += b36.f.j(7, str14);
            }
            int e19 = e18 + b36.f.e(8, this.f389824n) + b36.f.e(9, this.f389825o);
            java.lang.String str15 = this.f389826p;
            if (str15 != null) {
                e19 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f389827q;
            if (str16 != null) {
                e19 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f389828r;
            if (str17 != null) {
                e19 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f389829s;
            if (str18 != null) {
                e19 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f389830t;
            if (str19 != null) {
                e19 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f389831u;
            if (str20 != null) {
                e19 += b36.f.j(15, str20);
            }
            return e19 + b36.f.e(16, this.f389832v) + b36.f.g(17, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.x65 x65Var = (r45.x65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x65Var.f389817d = aVar2.k(intValue);
                return 0;
            case 2:
                x65Var.f389818e = aVar2.g(intValue);
                return 0;
            case 3:
                x65Var.f389819f = aVar2.k(intValue);
                return 0;
            case 4:
                x65Var.f389820g = aVar2.g(intValue);
                return 0;
            case 5:
                x65Var.f389821h = aVar2.k(intValue);
                return 0;
            case 6:
                x65Var.f389822i = aVar2.g(intValue);
                return 0;
            case 7:
                x65Var.f389823m = aVar2.k(intValue);
                return 0;
            case 8:
                x65Var.f389824n = aVar2.g(intValue);
                return 0;
            case 9:
                x65Var.f389825o = aVar2.g(intValue);
                return 0;
            case 10:
                x65Var.f389826p = aVar2.k(intValue);
                return 0;
            case 11:
                x65Var.f389827q = aVar2.k(intValue);
                return 0;
            case 12:
                x65Var.f389828r = aVar2.k(intValue);
                return 0;
            case 13:
                x65Var.f389829s = aVar2.k(intValue);
                return 0;
            case 14:
                x65Var.f389830t = aVar2.k(intValue);
                return 0;
            case 15:
                x65Var.f389831u = aVar2.k(intValue);
                return 0;
            case 16:
                x65Var.f389832v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.j66 j66Var = new r45.j66();
                    if (bArr2 != null && bArr2.length > 0) {
                        j66Var.parseFrom(bArr2);
                    }
                    x65Var.f389833w.add(j66Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
