package r45;

/* loaded from: classes8.dex */
public class zr3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392321h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392322i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392323m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392324n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392325o;

    /* renamed from: p, reason: collision with root package name */
    public r45.u57 f392326p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f392327q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f392328r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f392329s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f392330t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392331u;

    /* renamed from: v, reason: collision with root package name */
    public int f392332v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f392333w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zr3)) {
            return false;
        }
        r45.zr3 zr3Var = (r45.zr3) fVar;
        return n51.f.a(this.BaseResponse, zr3Var.BaseResponse) && n51.f.a(this.f392317d, zr3Var.f392317d) && n51.f.a(this.f392318e, zr3Var.f392318e) && n51.f.a(this.f392319f, zr3Var.f392319f) && n51.f.a(this.f392320g, zr3Var.f392320g) && n51.f.a(this.f392321h, zr3Var.f392321h) && n51.f.a(this.f392322i, zr3Var.f392322i) && n51.f.a(this.f392323m, zr3Var.f392323m) && n51.f.a(this.f392324n, zr3Var.f392324n) && n51.f.a(this.f392325o, zr3Var.f392325o) && n51.f.a(this.f392326p, zr3Var.f392326p) && n51.f.a(this.f392327q, zr3Var.f392327q) && n51.f.a(this.f392328r, zr3Var.f392328r) && n51.f.a(this.f392329s, zr3Var.f392329s) && n51.f.a(this.f392330t, zr3Var.f392330t) && n51.f.a(this.f392331u, zr3Var.f392331u) && n51.f.a(java.lang.Integer.valueOf(this.f392332v), java.lang.Integer.valueOf(zr3Var.f392332v)) && n51.f.a(this.f392333w, zr3Var.f392333w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392333w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f392317d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f392318e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f392319f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f392320g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f392321h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f392322i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f392323m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f392324n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f392325o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            r45.u57 u57Var = this.f392326p;
            if (u57Var != null) {
                fVar.i(11, u57Var.computeSize());
                this.f392326p.writeFields(fVar);
            }
            java.lang.String str10 = this.f392327q;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f392328r;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            java.lang.String str12 = this.f392329s;
            if (str12 != null) {
                fVar.j(14, str12);
            }
            java.lang.String str13 = this.f392330t;
            if (str13 != null) {
                fVar.j(15, str13);
            }
            java.lang.String str14 = this.f392331u;
            if (str14 != null) {
                fVar.j(16, str14);
            }
            fVar.e(17, this.f392332v);
            fVar.g(18, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str15 = this.f392317d;
            if (str15 != null) {
                i18 += b36.f.j(2, str15);
            }
            java.lang.String str16 = this.f392318e;
            if (str16 != null) {
                i18 += b36.f.j(3, str16);
            }
            java.lang.String str17 = this.f392319f;
            if (str17 != null) {
                i18 += b36.f.j(4, str17);
            }
            java.lang.String str18 = this.f392320g;
            if (str18 != null) {
                i18 += b36.f.j(5, str18);
            }
            java.lang.String str19 = this.f392321h;
            if (str19 != null) {
                i18 += b36.f.j(6, str19);
            }
            java.lang.String str20 = this.f392322i;
            if (str20 != null) {
                i18 += b36.f.j(7, str20);
            }
            java.lang.String str21 = this.f392323m;
            if (str21 != null) {
                i18 += b36.f.j(8, str21);
            }
            java.lang.String str22 = this.f392324n;
            if (str22 != null) {
                i18 += b36.f.j(9, str22);
            }
            java.lang.String str23 = this.f392325o;
            if (str23 != null) {
                i18 += b36.f.j(10, str23);
            }
            r45.u57 u57Var2 = this.f392326p;
            if (u57Var2 != null) {
                i18 += b36.f.i(11, u57Var2.computeSize());
            }
            java.lang.String str24 = this.f392327q;
            if (str24 != null) {
                i18 += b36.f.j(12, str24);
            }
            java.lang.String str25 = this.f392328r;
            if (str25 != null) {
                i18 += b36.f.j(13, str25);
            }
            java.lang.String str26 = this.f392329s;
            if (str26 != null) {
                i18 += b36.f.j(14, str26);
            }
            java.lang.String str27 = this.f392330t;
            if (str27 != null) {
                i18 += b36.f.j(15, str27);
            }
            java.lang.String str28 = this.f392331u;
            if (str28 != null) {
                i18 += b36.f.j(16, str28);
            }
            return i18 + b36.f.e(17, this.f392332v) + b36.f.g(18, 8, linkedList);
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
        r45.zr3 zr3Var = (r45.zr3) objArr[1];
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
                    zr3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zr3Var.f392317d = aVar2.k(intValue);
                return 0;
            case 3:
                zr3Var.f392318e = aVar2.k(intValue);
                return 0;
            case 4:
                zr3Var.f392319f = aVar2.k(intValue);
                return 0;
            case 5:
                zr3Var.f392320g = aVar2.k(intValue);
                return 0;
            case 6:
                zr3Var.f392321h = aVar2.k(intValue);
                return 0;
            case 7:
                zr3Var.f392322i = aVar2.k(intValue);
                return 0;
            case 8:
                zr3Var.f392323m = aVar2.k(intValue);
                return 0;
            case 9:
                zr3Var.f392324n = aVar2.k(intValue);
                return 0;
            case 10:
                zr3Var.f392325o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.u57 u57Var3 = new r45.u57();
                    if (bArr3 != null && bArr3.length > 0) {
                        u57Var3.parseFrom(bArr3);
                    }
                    zr3Var.f392326p = u57Var3;
                }
                return 0;
            case 12:
                zr3Var.f392327q = aVar2.k(intValue);
                return 0;
            case 13:
                zr3Var.f392328r = aVar2.k(intValue);
                return 0;
            case 14:
                zr3Var.f392329s = aVar2.k(intValue);
                return 0;
            case 15:
                zr3Var.f392330t = aVar2.k(intValue);
                return 0;
            case 16:
                zr3Var.f392331u = aVar2.k(intValue);
                return 0;
            case 17:
                zr3Var.f392332v = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.o57 o57Var = new r45.o57();
                    if (bArr4 != null && bArr4.length > 0) {
                        o57Var.parseFrom(bArr4);
                    }
                    zr3Var.f392333w.add(o57Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
