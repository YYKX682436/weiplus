package r45;

/* loaded from: classes9.dex */
public class tt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386766e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386767f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386768g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386769h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386770i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f386771m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f386772n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386773o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386774p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386775q;

    /* renamed from: r, reason: collision with root package name */
    public int f386776r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f386777s;

    /* renamed from: t, reason: collision with root package name */
    public int f386778t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386779u;

    /* renamed from: v, reason: collision with root package name */
    public int f386780v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f386781w;

    /* renamed from: x, reason: collision with root package name */
    public r45.iu f386782x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f386783y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f386784z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tt)) {
            return false;
        }
        r45.tt ttVar = (r45.tt) fVar;
        return n51.f.a(this.f386765d, ttVar.f386765d) && n51.f.a(this.f386766e, ttVar.f386766e) && n51.f.a(this.f386767f, ttVar.f386767f) && n51.f.a(this.f386768g, ttVar.f386768g) && n51.f.a(this.f386769h, ttVar.f386769h) && n51.f.a(this.f386770i, ttVar.f386770i) && n51.f.a(this.f386771m, ttVar.f386771m) && n51.f.a(java.lang.Integer.valueOf(this.f386772n), java.lang.Integer.valueOf(ttVar.f386772n)) && n51.f.a(this.f386773o, ttVar.f386773o) && n51.f.a(this.f386774p, ttVar.f386774p) && n51.f.a(this.f386775q, ttVar.f386775q) && n51.f.a(java.lang.Integer.valueOf(this.f386776r), java.lang.Integer.valueOf(ttVar.f386776r)) && n51.f.a(this.f386777s, ttVar.f386777s) && n51.f.a(java.lang.Integer.valueOf(this.f386778t), java.lang.Integer.valueOf(ttVar.f386778t)) && n51.f.a(this.f386779u, ttVar.f386779u) && n51.f.a(java.lang.Integer.valueOf(this.f386780v), java.lang.Integer.valueOf(ttVar.f386780v)) && n51.f.a(this.f386781w, ttVar.f386781w) && n51.f.a(this.f386782x, ttVar.f386782x) && n51.f.a(this.f386783y, ttVar.f386783y) && n51.f.a(this.f386784z, ttVar.f386784z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386771m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386765d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386766e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386767f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f386768g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f386769h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f386770i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f386772n);
            java.lang.String str7 = this.f386773o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f386774p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f386775q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            fVar.e(12, this.f386776r);
            java.lang.String str10 = this.f386777s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(14, this.f386778t);
            java.lang.String str11 = this.f386779u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            fVar.e(16, this.f386780v);
            java.lang.String str12 = this.f386781w;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            r45.iu iuVar = this.f386782x;
            if (iuVar != null) {
                fVar.i(18, iuVar.computeSize());
                this.f386782x.writeFields(fVar);
            }
            java.lang.String str13 = this.f386783y;
            if (str13 != null) {
                fVar.j(19, str13);
            }
            java.lang.String str14 = this.f386784z;
            if (str14 != null) {
                fVar.j(20, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f386765d;
            int j17 = str15 != null ? b36.f.j(1, str15) + 0 : 0;
            java.lang.String str16 = this.f386766e;
            if (str16 != null) {
                j17 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f386767f;
            if (str17 != null) {
                j17 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f386768g;
            if (str18 != null) {
                j17 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f386769h;
            if (str19 != null) {
                j17 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f386770i;
            if (str20 != null) {
                j17 += b36.f.j(6, str20);
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f386772n);
            java.lang.String str21 = this.f386773o;
            if (str21 != null) {
                g17 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f386774p;
            if (str22 != null) {
                g17 += b36.f.j(10, str22);
            }
            java.lang.String str23 = this.f386775q;
            if (str23 != null) {
                g17 += b36.f.j(11, str23);
            }
            int e17 = g17 + b36.f.e(12, this.f386776r);
            java.lang.String str24 = this.f386777s;
            if (str24 != null) {
                e17 += b36.f.j(13, str24);
            }
            int e18 = e17 + b36.f.e(14, this.f386778t);
            java.lang.String str25 = this.f386779u;
            if (str25 != null) {
                e18 += b36.f.j(15, str25);
            }
            int e19 = e18 + b36.f.e(16, this.f386780v);
            java.lang.String str26 = this.f386781w;
            if (str26 != null) {
                e19 += b36.f.j(17, str26);
            }
            r45.iu iuVar2 = this.f386782x;
            if (iuVar2 != null) {
                e19 += b36.f.i(18, iuVar2.computeSize());
            }
            java.lang.String str27 = this.f386783y;
            if (str27 != null) {
                e19 += b36.f.j(19, str27);
            }
            java.lang.String str28 = this.f386784z;
            return str28 != null ? e19 + b36.f.j(20, str28) : e19;
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
        r45.tt ttVar = (r45.tt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ttVar.f386765d = aVar2.k(intValue);
                return 0;
            case 2:
                ttVar.f386766e = aVar2.k(intValue);
                return 0;
            case 3:
                ttVar.f386767f = aVar2.k(intValue);
                return 0;
            case 4:
                ttVar.f386768g = aVar2.k(intValue);
                return 0;
            case 5:
                ttVar.f386769h = aVar2.k(intValue);
                return 0;
            case 6:
                ttVar.f386770i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.st stVar = new r45.st();
                    if (bArr2 != null && bArr2.length > 0) {
                        stVar.parseFrom(bArr2);
                    }
                    ttVar.f386771m.add(stVar);
                }
                return 0;
            case 8:
                ttVar.f386772n = aVar2.g(intValue);
                return 0;
            case 9:
                ttVar.f386773o = aVar2.k(intValue);
                return 0;
            case 10:
                ttVar.f386774p = aVar2.k(intValue);
                return 0;
            case 11:
                ttVar.f386775q = aVar2.k(intValue);
                return 0;
            case 12:
                ttVar.f386776r = aVar2.g(intValue);
                return 0;
            case 13:
                ttVar.f386777s = aVar2.k(intValue);
                return 0;
            case 14:
                ttVar.f386778t = aVar2.g(intValue);
                return 0;
            case 15:
                ttVar.f386779u = aVar2.k(intValue);
                return 0;
            case 16:
                ttVar.f386780v = aVar2.g(intValue);
                return 0;
            case 17:
                ttVar.f386781w = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr3 != null && bArr3.length > 0) {
                        iuVar3.parseFrom(bArr3);
                    }
                    ttVar.f386782x = iuVar3;
                }
                return 0;
            case 19:
                ttVar.f386783y = aVar2.k(intValue);
                return 0;
            case 20:
                ttVar.f386784z = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
