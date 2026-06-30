package r45;

/* loaded from: classes7.dex */
public class p83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382820d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382821e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382822f;

    /* renamed from: g, reason: collision with root package name */
    public int f382823g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382824h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382825i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382826m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382827n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382828o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382829p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f382830q;

    /* renamed from: r, reason: collision with root package name */
    public int f382831r;

    /* renamed from: s, reason: collision with root package name */
    public int f382832s;

    /* renamed from: t, reason: collision with root package name */
    public int f382833t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382834u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f382835v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382836w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p83)) {
            return false;
        }
        r45.p83 p83Var = (r45.p83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382820d), java.lang.Integer.valueOf(p83Var.f382820d)) && n51.f.a(this.f382821e, p83Var.f382821e) && n51.f.a(this.f382822f, p83Var.f382822f) && n51.f.a(java.lang.Integer.valueOf(this.f382823g), java.lang.Integer.valueOf(p83Var.f382823g)) && n51.f.a(this.f382824h, p83Var.f382824h) && n51.f.a(this.f382825i, p83Var.f382825i) && n51.f.a(this.f382826m, p83Var.f382826m) && n51.f.a(this.f382827n, p83Var.f382827n) && n51.f.a(this.f382828o, p83Var.f382828o) && n51.f.a(this.f382829p, p83Var.f382829p) && n51.f.a(this.f382830q, p83Var.f382830q) && n51.f.a(java.lang.Integer.valueOf(this.f382831r), java.lang.Integer.valueOf(p83Var.f382831r)) && n51.f.a(java.lang.Integer.valueOf(this.f382832s), java.lang.Integer.valueOf(p83Var.f382832s)) && n51.f.a(java.lang.Integer.valueOf(this.f382833t), java.lang.Integer.valueOf(p83Var.f382833t)) && n51.f.a(this.f382834u, p83Var.f382834u) && n51.f.a(this.f382835v, p83Var.f382835v) && n51.f.a(this.f382836w, p83Var.f382836w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382835v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382820d);
            java.lang.String str = this.f382821e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382822f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f382823g);
            java.lang.String str3 = this.f382824h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f382825i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f382826m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f382827n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f382828o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f382829p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f382830q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f382831r);
            fVar.e(14, this.f382832s);
            fVar.e(15, this.f382833t);
            com.tencent.mm.protobuf.g gVar = this.f382834u;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.g(17, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f382836w;
            if (gVar2 != null) {
                fVar.b(18, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382820d) + 0;
            java.lang.String str10 = this.f382821e;
            if (str10 != null) {
                e17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f382822f;
            if (str11 != null) {
                e17 += b36.f.j(3, str11);
            }
            int e18 = e17 + b36.f.e(4, this.f382823g);
            java.lang.String str12 = this.f382824h;
            if (str12 != null) {
                e18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f382825i;
            if (str13 != null) {
                e18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f382826m;
            if (str14 != null) {
                e18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f382827n;
            if (str15 != null) {
                e18 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f382828o;
            if (str16 != null) {
                e18 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f382829p;
            if (str17 != null) {
                e18 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f382830q;
            if (str18 != null) {
                e18 += b36.f.j(12, str18);
            }
            int e19 = e18 + b36.f.e(13, this.f382831r) + b36.f.e(14, this.f382832s) + b36.f.e(15, this.f382833t);
            com.tencent.mm.protobuf.g gVar3 = this.f382834u;
            if (gVar3 != null) {
                e19 += b36.f.b(16, gVar3);
            }
            int g17 = e19 + b36.f.g(17, 8, linkedList);
            com.tencent.mm.protobuf.g gVar4 = this.f382836w;
            return gVar4 != null ? g17 + b36.f.b(18, gVar4) : g17;
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
        r45.p83 p83Var = (r45.p83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p83Var.f382820d = aVar2.g(intValue);
                return 0;
            case 2:
                p83Var.f382821e = aVar2.k(intValue);
                return 0;
            case 3:
                p83Var.f382822f = aVar2.k(intValue);
                return 0;
            case 4:
                p83Var.f382823g = aVar2.g(intValue);
                return 0;
            case 5:
                p83Var.f382824h = aVar2.k(intValue);
                return 0;
            case 6:
                p83Var.f382825i = aVar2.k(intValue);
                return 0;
            case 7:
                p83Var.f382826m = aVar2.k(intValue);
                return 0;
            case 8:
                p83Var.f382827n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                p83Var.f382828o = aVar2.k(intValue);
                return 0;
            case 11:
                p83Var.f382829p = aVar2.k(intValue);
                return 0;
            case 12:
                p83Var.f382830q = aVar2.k(intValue);
                return 0;
            case 13:
                p83Var.f382831r = aVar2.g(intValue);
                return 0;
            case 14:
                p83Var.f382832s = aVar2.g(intValue);
                return 0;
            case 15:
                p83Var.f382833t = aVar2.g(intValue);
                return 0;
            case 16:
                p83Var.f382834u = aVar2.d(intValue);
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.rx3 rx3Var = new r45.rx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rx3Var.parseFrom(bArr2);
                    }
                    p83Var.f382835v.add(rx3Var);
                }
                return 0;
            case 18:
                p83Var.f382836w = aVar2.d(intValue);
                return 0;
        }
    }
}
