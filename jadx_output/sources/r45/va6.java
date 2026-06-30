package r45;

/* loaded from: classes15.dex */
public class va6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388043d;

    /* renamed from: e, reason: collision with root package name */
    public long f388044e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f388045f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f388046g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f388047h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388048i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388049m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388050n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388051o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388052p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388053q;

    /* renamed from: r, reason: collision with root package name */
    public int f388054r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f388055s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va6)) {
            return false;
        }
        r45.va6 va6Var = (r45.va6) fVar;
        return n51.f.a(this.f388043d, va6Var.f388043d) && n51.f.a(java.lang.Long.valueOf(this.f388044e), java.lang.Long.valueOf(va6Var.f388044e)) && n51.f.a(java.lang.Long.valueOf(this.f388045f), java.lang.Long.valueOf(va6Var.f388045f)) && n51.f.a(java.lang.Long.valueOf(this.f388046g), java.lang.Long.valueOf(va6Var.f388046g)) && n51.f.a(this.f388047h, va6Var.f388047h) && n51.f.a(this.f388048i, va6Var.f388048i) && n51.f.a(this.f388049m, va6Var.f388049m) && n51.f.a(this.f388050n, va6Var.f388050n) && n51.f.a(this.f388051o, va6Var.f388051o) && n51.f.a(this.f388052p, va6Var.f388052p) && n51.f.a(this.f388053q, va6Var.f388053q) && n51.f.a(java.lang.Integer.valueOf(this.f388054r), java.lang.Integer.valueOf(va6Var.f388054r)) && n51.f.a(this.f388055s, va6Var.f388055s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388047h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388043d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f388044e);
            fVar.h(3, this.f388045f);
            fVar.h(4, this.f388046g);
            fVar.g(5, 8, linkedList);
            java.lang.String str2 = this.f388048i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f388049m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f388050n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f388051o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f388052p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f388053q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f388054r);
            java.lang.String str8 = this.f388055s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f388043d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.h(2, this.f388044e) + b36.f.h(3, this.f388045f) + b36.f.h(4, this.f388046g) + b36.f.g(5, 8, linkedList);
            java.lang.String str10 = this.f388048i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f388049m;
            if (str11 != null) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f388050n;
            if (str12 != null) {
                j17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f388051o;
            if (str13 != null) {
                j17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f388052p;
            if (str14 != null) {
                j17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f388053q;
            if (str15 != null) {
                j17 += b36.f.j(11, str15);
            }
            int e17 = j17 + b36.f.e(12, this.f388054r);
            java.lang.String str16 = this.f388055s;
            return str16 != null ? e17 + b36.f.j(13, str16) : e17;
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
        r45.va6 va6Var = (r45.va6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                va6Var.f388043d = aVar2.k(intValue);
                return 0;
            case 2:
                va6Var.f388044e = aVar2.i(intValue);
                return 0;
            case 3:
                va6Var.f388045f = aVar2.i(intValue);
                return 0;
            case 4:
                va6Var.f388046g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.p86 p86Var = new r45.p86();
                    if (bArr2 != null && bArr2.length > 0) {
                        p86Var.parseFrom(bArr2);
                    }
                    va6Var.f388047h.add(p86Var);
                }
                return 0;
            case 6:
                va6Var.f388048i = aVar2.k(intValue);
                return 0;
            case 7:
                va6Var.f388049m = aVar2.k(intValue);
                return 0;
            case 8:
                va6Var.f388050n = aVar2.k(intValue);
                return 0;
            case 9:
                va6Var.f388051o = aVar2.k(intValue);
                return 0;
            case 10:
                va6Var.f388052p = aVar2.k(intValue);
                return 0;
            case 11:
                va6Var.f388053q = aVar2.k(intValue);
                return 0;
            case 12:
                va6Var.f388054r = aVar2.g(intValue);
                return 0;
            case 13:
                va6Var.f388055s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
