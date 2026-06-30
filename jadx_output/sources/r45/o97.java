package r45;

/* loaded from: classes7.dex */
public class o97 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382054d;

    /* renamed from: e, reason: collision with root package name */
    public long f382055e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f382056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382057g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382058h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382059i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382060m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f382061n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f382062o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f382063p;

    /* renamed from: q, reason: collision with root package name */
    public int f382064q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f382065r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f382066s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382067t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f382068u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382069v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f382070w;

    /* renamed from: x, reason: collision with root package name */
    public int f382071x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f382072y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o97)) {
            return false;
        }
        r45.o97 o97Var = (r45.o97) fVar;
        return n51.f.a(this.f382054d, o97Var.f382054d) && n51.f.a(java.lang.Long.valueOf(this.f382055e), java.lang.Long.valueOf(o97Var.f382055e)) && n51.f.a(java.lang.Boolean.valueOf(this.f382056f), java.lang.Boolean.valueOf(o97Var.f382056f)) && n51.f.a(java.lang.Boolean.valueOf(this.f382057g), java.lang.Boolean.valueOf(o97Var.f382057g)) && n51.f.a(this.f382058h, o97Var.f382058h) && n51.f.a(this.f382059i, o97Var.f382059i) && n51.f.a(this.f382060m, o97Var.f382060m) && n51.f.a(java.lang.Boolean.valueOf(this.f382061n), java.lang.Boolean.valueOf(o97Var.f382061n)) && n51.f.a(this.f382062o, o97Var.f382062o) && n51.f.a(java.lang.Integer.valueOf(this.f382063p), java.lang.Integer.valueOf(o97Var.f382063p)) && n51.f.a(java.lang.Integer.valueOf(this.f382064q), java.lang.Integer.valueOf(o97Var.f382064q)) && n51.f.a(this.f382065r, o97Var.f382065r) && n51.f.a(java.lang.Boolean.valueOf(this.f382066s), java.lang.Boolean.valueOf(o97Var.f382066s)) && n51.f.a(this.f382067t, o97Var.f382067t) && n51.f.a(this.f382068u, o97Var.f382068u) && n51.f.a(this.f382069v, o97Var.f382069v) && n51.f.a(this.f382070w, o97Var.f382070w) && n51.f.a(java.lang.Integer.valueOf(this.f382071x), java.lang.Integer.valueOf(o97Var.f382071x)) && n51.f.a(this.f382072y, o97Var.f382072y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382062o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382054d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f382055e);
            fVar.a(3, this.f382056f);
            fVar.a(4, this.f382057g);
            java.lang.String str2 = this.f382058h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f382059i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f382060m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f382061n);
            fVar.g(9, 8, linkedList);
            fVar.e(10, this.f382063p);
            fVar.e(11, this.f382064q);
            java.lang.String str5 = this.f382065r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.a(13, this.f382066s);
            com.tencent.mm.protobuf.g gVar = this.f382067t;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            java.lang.String str6 = this.f382068u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f382069v;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            java.lang.String str7 = this.f382070w;
            if (str7 != null) {
                fVar.j(17, str7);
            }
            fVar.e(18, this.f382071x);
            java.lang.String str8 = this.f382072y;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f382054d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.h(2, this.f382055e) + b36.f.a(3, this.f382056f) + b36.f.a(4, this.f382057g);
            java.lang.String str10 = this.f382058h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f382059i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f382060m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            int a17 = j17 + b36.f.a(8, this.f382061n) + b36.f.g(9, 8, linkedList) + b36.f.e(10, this.f382063p) + b36.f.e(11, this.f382064q);
            java.lang.String str13 = this.f382065r;
            if (str13 != null) {
                a17 += b36.f.j(12, str13);
            }
            int a18 = a17 + b36.f.a(13, this.f382066s);
            com.tencent.mm.protobuf.g gVar3 = this.f382067t;
            if (gVar3 != null) {
                a18 += b36.f.b(14, gVar3);
            }
            java.lang.String str14 = this.f382068u;
            if (str14 != null) {
                a18 += b36.f.j(15, str14);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f382069v;
            if (gVar4 != null) {
                a18 += b36.f.b(16, gVar4);
            }
            java.lang.String str15 = this.f382070w;
            if (str15 != null) {
                a18 += b36.f.j(17, str15);
            }
            int e17 = a18 + b36.f.e(18, this.f382071x);
            java.lang.String str16 = this.f382072y;
            return str16 != null ? e17 + b36.f.j(19, str16) : e17;
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
        r45.o97 o97Var = (r45.o97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o97Var.f382054d = aVar2.k(intValue);
                return 0;
            case 2:
                o97Var.f382055e = aVar2.i(intValue);
                return 0;
            case 3:
                o97Var.f382056f = aVar2.c(intValue);
                return 0;
            case 4:
                o97Var.f382057g = aVar2.c(intValue);
                return 0;
            case 5:
                o97Var.f382058h = aVar2.k(intValue);
                return 0;
            case 6:
                o97Var.f382059i = aVar2.k(intValue);
                return 0;
            case 7:
                o97Var.f382060m = aVar2.k(intValue);
                return 0;
            case 8:
                o97Var.f382061n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.m97 m97Var = new r45.m97();
                    if (bArr2 != null && bArr2.length > 0) {
                        m97Var.parseFrom(bArr2);
                    }
                    o97Var.f382062o.add(m97Var);
                }
                return 0;
            case 10:
                o97Var.f382063p = aVar2.g(intValue);
                return 0;
            case 11:
                o97Var.f382064q = aVar2.g(intValue);
                return 0;
            case 12:
                o97Var.f382065r = aVar2.k(intValue);
                return 0;
            case 13:
                o97Var.f382066s = aVar2.c(intValue);
                return 0;
            case 14:
                o97Var.f382067t = aVar2.d(intValue);
                return 0;
            case 15:
                o97Var.f382068u = aVar2.k(intValue);
                return 0;
            case 16:
                o97Var.f382069v = aVar2.d(intValue);
                return 0;
            case 17:
                o97Var.f382070w = aVar2.k(intValue);
                return 0;
            case 18:
                o97Var.f382071x = aVar2.g(intValue);
                return 0;
            case 19:
                o97Var.f382072y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
