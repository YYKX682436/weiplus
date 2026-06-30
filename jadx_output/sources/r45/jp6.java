package r45;

/* loaded from: classes9.dex */
public class jp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378017d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378018e;

    /* renamed from: f, reason: collision with root package name */
    public int f378019f;

    /* renamed from: g, reason: collision with root package name */
    public r45.po5 f378020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378021h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378022i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378023m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378025o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f378026p;

    /* renamed from: q, reason: collision with root package name */
    public int f378027q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f378028r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378029s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f378030t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f378031u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f378032v;

    /* renamed from: w, reason: collision with root package name */
    public r45.po5 f378033w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp6)) {
            return false;
        }
        r45.jp6 jp6Var = (r45.jp6) fVar;
        return n51.f.a(this.BaseResponse, jp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378017d), java.lang.Integer.valueOf(jp6Var.f378017d)) && n51.f.a(this.f378018e, jp6Var.f378018e) && n51.f.a(java.lang.Integer.valueOf(this.f378019f), java.lang.Integer.valueOf(jp6Var.f378019f)) && n51.f.a(this.f378020g, jp6Var.f378020g) && n51.f.a(this.f378021h, jp6Var.f378021h) && n51.f.a(this.f378022i, jp6Var.f378022i) && n51.f.a(this.f378023m, jp6Var.f378023m) && n51.f.a(this.f378024n, jp6Var.f378024n) && n51.f.a(this.f378025o, jp6Var.f378025o) && n51.f.a(this.f378026p, jp6Var.f378026p) && n51.f.a(java.lang.Integer.valueOf(this.f378027q), java.lang.Integer.valueOf(jp6Var.f378027q)) && n51.f.a(this.f378028r, jp6Var.f378028r) && n51.f.a(this.f378029s, jp6Var.f378029s) && n51.f.a(this.f378030t, jp6Var.f378030t) && n51.f.a(this.f378031u, jp6Var.f378031u) && n51.f.a(this.f378032v, jp6Var.f378032v) && n51.f.a(this.f378033w, jp6Var.f378033w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378028r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f378017d);
            java.lang.String str = this.f378018e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f378019f);
            r45.po5 po5Var = this.f378020g;
            if (po5Var != null) {
                fVar.i(5, po5Var.computeSize());
                this.f378020g.writeFields(fVar);
            }
            java.lang.String str2 = this.f378021h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f378022i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f378023m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f378024n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f378025o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f378026p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f378027q);
            fVar.g(13, 8, linkedList);
            java.lang.String str8 = this.f378029s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f378030t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f378031u;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            java.lang.String str11 = this.f378032v;
            if (str11 != null) {
                fVar.j(17, str11);
            }
            r45.po5 po5Var2 = this.f378033w;
            if (po5Var2 != null) {
                fVar.i(18, po5Var2.computeSize());
                this.f378033w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f378017d);
            java.lang.String str12 = this.f378018e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            int e17 = i18 + b36.f.e(4, this.f378019f);
            r45.po5 po5Var3 = this.f378020g;
            if (po5Var3 != null) {
                e17 += b36.f.i(5, po5Var3.computeSize());
            }
            java.lang.String str13 = this.f378021h;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f378022i;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f378023m;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f378024n;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f378025o;
            if (str17 != null) {
                e17 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f378026p;
            if (str18 != null) {
                e17 += b36.f.j(11, str18);
            }
            int e18 = e17 + b36.f.e(12, this.f378027q) + b36.f.g(13, 8, linkedList);
            java.lang.String str19 = this.f378029s;
            if (str19 != null) {
                e18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f378030t;
            if (str20 != null) {
                e18 += b36.f.j(15, str20);
            }
            java.lang.String str21 = this.f378031u;
            if (str21 != null) {
                e18 += b36.f.j(16, str21);
            }
            java.lang.String str22 = this.f378032v;
            if (str22 != null) {
                e18 += b36.f.j(17, str22);
            }
            r45.po5 po5Var4 = this.f378033w;
            return po5Var4 != null ? e18 + b36.f.i(18, po5Var4.computeSize()) : e18;
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
        r45.jp6 jp6Var = (r45.jp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    jp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                jp6Var.f378017d = aVar2.g(intValue);
                return 0;
            case 3:
                jp6Var.f378018e = aVar2.k(intValue);
                return 0;
            case 4:
                jp6Var.f378019f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.po5 po5Var5 = new r45.po5();
                    if (bArr3 != null && bArr3.length > 0) {
                        po5Var5.parseFrom(bArr3);
                    }
                    jp6Var.f378020g = po5Var5;
                }
                return 0;
            case 6:
                jp6Var.f378021h = aVar2.k(intValue);
                return 0;
            case 7:
                jp6Var.f378022i = aVar2.k(intValue);
                return 0;
            case 8:
                jp6Var.f378023m = aVar2.k(intValue);
                return 0;
            case 9:
                jp6Var.f378024n = aVar2.k(intValue);
                return 0;
            case 10:
                jp6Var.f378025o = aVar2.k(intValue);
                return 0;
            case 11:
                jp6Var.f378026p = aVar2.k(intValue);
                return 0;
            case 12:
                jp6Var.f378027q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bd0 bd0Var = new r45.bd0();
                    if (bArr4 != null && bArr4.length > 0) {
                        bd0Var.parseFrom(bArr4);
                    }
                    jp6Var.f378028r.add(bd0Var);
                }
                return 0;
            case 14:
                jp6Var.f378029s = aVar2.k(intValue);
                return 0;
            case 15:
                jp6Var.f378030t = aVar2.k(intValue);
                return 0;
            case 16:
                jp6Var.f378031u = aVar2.k(intValue);
                return 0;
            case 17:
                jp6Var.f378032v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.po5 po5Var6 = new r45.po5();
                    if (bArr5 != null && bArr5.length > 0) {
                        po5Var6.parseFrom(bArr5);
                    }
                    jp6Var.f378033w = po5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
