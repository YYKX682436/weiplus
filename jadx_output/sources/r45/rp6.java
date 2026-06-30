package r45;

/* loaded from: classes9.dex */
public class rp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385080d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385081e;

    /* renamed from: f, reason: collision with root package name */
    public int f385082f;

    /* renamed from: g, reason: collision with root package name */
    public r45.po5 f385083g;

    /* renamed from: h, reason: collision with root package name */
    public int f385084h;

    /* renamed from: i, reason: collision with root package name */
    public r45.po5 f385085i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e30 f385086m;

    /* renamed from: n, reason: collision with root package name */
    public r45.oo5 f385087n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385088o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f385089p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f385090q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f385091r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385092s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f385093t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f385094u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rp6)) {
            return false;
        }
        r45.rp6 rp6Var = (r45.rp6) fVar;
        return n51.f.a(this.BaseResponse, rp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385080d), java.lang.Integer.valueOf(rp6Var.f385080d)) && n51.f.a(this.f385081e, rp6Var.f385081e) && n51.f.a(java.lang.Integer.valueOf(this.f385082f), java.lang.Integer.valueOf(rp6Var.f385082f)) && n51.f.a(this.f385083g, rp6Var.f385083g) && n51.f.a(java.lang.Integer.valueOf(this.f385084h), java.lang.Integer.valueOf(rp6Var.f385084h)) && n51.f.a(this.f385085i, rp6Var.f385085i) && n51.f.a(this.f385086m, rp6Var.f385086m) && n51.f.a(this.f385087n, rp6Var.f385087n) && n51.f.a(this.f385088o, rp6Var.f385088o) && n51.f.a(this.f385089p, rp6Var.f385089p) && n51.f.a(this.f385090q, rp6Var.f385090q) && n51.f.a(this.f385091r, rp6Var.f385091r) && n51.f.a(this.f385092s, rp6Var.f385092s) && n51.f.a(this.f385093t, rp6Var.f385093t) && n51.f.a(this.f385094u, rp6Var.f385094u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385080d);
            java.lang.String str = this.f385081e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f385082f);
            r45.po5 po5Var = this.f385083g;
            if (po5Var != null) {
                fVar.i(5, po5Var.computeSize());
                this.f385083g.writeFields(fVar);
            }
            fVar.e(6, this.f385084h);
            r45.po5 po5Var2 = this.f385085i;
            if (po5Var2 != null) {
                fVar.i(7, po5Var2.computeSize());
                this.f385085i.writeFields(fVar);
            }
            r45.e30 e30Var = this.f385086m;
            if (e30Var != null) {
                fVar.i(8, e30Var.computeSize());
                this.f385086m.writeFields(fVar);
            }
            r45.oo5 oo5Var = this.f385087n;
            if (oo5Var != null) {
                fVar.i(9, oo5Var.computeSize());
                this.f385087n.writeFields(fVar);
            }
            java.lang.String str2 = this.f385088o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f385089p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f385090q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f385091r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f385092s;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f385093t;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            java.lang.String str8 = this.f385094u;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f385080d);
            java.lang.String str9 = this.f385081e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f385082f);
            r45.po5 po5Var3 = this.f385083g;
            if (po5Var3 != null) {
                e17 += b36.f.i(5, po5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f385084h);
            r45.po5 po5Var4 = this.f385085i;
            if (po5Var4 != null) {
                e18 += b36.f.i(7, po5Var4.computeSize());
            }
            r45.e30 e30Var2 = this.f385086m;
            if (e30Var2 != null) {
                e18 += b36.f.i(8, e30Var2.computeSize());
            }
            r45.oo5 oo5Var2 = this.f385087n;
            if (oo5Var2 != null) {
                e18 += b36.f.i(9, oo5Var2.computeSize());
            }
            java.lang.String str10 = this.f385088o;
            if (str10 != null) {
                e18 += b36.f.j(10, str10);
            }
            java.lang.String str11 = this.f385089p;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f385090q;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f385091r;
            if (str13 != null) {
                e18 += b36.f.j(13, str13);
            }
            java.lang.String str14 = this.f385092s;
            if (str14 != null) {
                e18 += b36.f.j(14, str14);
            }
            java.lang.String str15 = this.f385093t;
            if (str15 != null) {
                e18 += b36.f.j(15, str15);
            }
            java.lang.String str16 = this.f385094u;
            return str16 != null ? e18 + b36.f.j(16, str16) : e18;
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
        r45.rp6 rp6Var = (r45.rp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    rp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rp6Var.f385080d = aVar2.g(intValue);
                return 0;
            case 3:
                rp6Var.f385081e = aVar2.k(intValue);
                return 0;
            case 4:
                rp6Var.f385082f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.po5 po5Var5 = new r45.po5();
                    if (bArr2 != null && bArr2.length > 0) {
                        po5Var5.parseFrom(bArr2);
                    }
                    rp6Var.f385083g = po5Var5;
                }
                return 0;
            case 6:
                rp6Var.f385084h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.po5 po5Var6 = new r45.po5();
                    if (bArr3 != null && bArr3.length > 0) {
                        po5Var6.parseFrom(bArr3);
                    }
                    rp6Var.f385085i = po5Var6;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.e30 e30Var3 = new r45.e30();
                    if (bArr4 != null && bArr4.length > 0) {
                        e30Var3.parseFrom(bArr4);
                    }
                    rp6Var.f385086m = e30Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.oo5 oo5Var3 = new r45.oo5();
                    if (bArr5 != null && bArr5.length > 0) {
                        oo5Var3.parseFrom(bArr5);
                    }
                    rp6Var.f385087n = oo5Var3;
                }
                return 0;
            case 10:
                rp6Var.f385088o = aVar2.k(intValue);
                return 0;
            case 11:
                rp6Var.f385089p = aVar2.k(intValue);
                return 0;
            case 12:
                rp6Var.f385090q = aVar2.k(intValue);
                return 0;
            case 13:
                rp6Var.f385091r = aVar2.k(intValue);
                return 0;
            case 14:
                rp6Var.f385092s = aVar2.k(intValue);
                return 0;
            case 15:
                rp6Var.f385093t = aVar2.k(intValue);
                return 0;
            case 16:
                rp6Var.f385094u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
