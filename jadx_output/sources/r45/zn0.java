package r45;

/* loaded from: classes9.dex */
public class zn0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392219d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392220e;

    /* renamed from: f, reason: collision with root package name */
    public int f392221f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392222g;

    /* renamed from: h, reason: collision with root package name */
    public int f392223h;

    /* renamed from: i, reason: collision with root package name */
    public int f392224i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392225m;

    /* renamed from: n, reason: collision with root package name */
    public int f392226n;

    /* renamed from: o, reason: collision with root package name */
    public r45.lj5 f392227o;

    /* renamed from: p, reason: collision with root package name */
    public int f392228p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f392229q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f392230r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f392231s;

    /* renamed from: t, reason: collision with root package name */
    public int f392232t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392233u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f392234v;

    /* renamed from: w, reason: collision with root package name */
    public r45.g04 f392235w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392236x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392237y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zn0)) {
            return false;
        }
        r45.zn0 zn0Var = (r45.zn0) fVar;
        return n51.f.a(this.BaseResponse, zn0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f392219d), java.lang.Integer.valueOf(zn0Var.f392219d)) && n51.f.a(this.f392220e, zn0Var.f392220e) && n51.f.a(java.lang.Integer.valueOf(this.f392221f), java.lang.Integer.valueOf(zn0Var.f392221f)) && n51.f.a(this.f392222g, zn0Var.f392222g) && n51.f.a(java.lang.Integer.valueOf(this.f392223h), java.lang.Integer.valueOf(zn0Var.f392223h)) && n51.f.a(java.lang.Integer.valueOf(this.f392224i), java.lang.Integer.valueOf(zn0Var.f392224i)) && n51.f.a(this.f392225m, zn0Var.f392225m) && n51.f.a(java.lang.Integer.valueOf(this.f392226n), java.lang.Integer.valueOf(zn0Var.f392226n)) && n51.f.a(this.f392227o, zn0Var.f392227o) && n51.f.a(java.lang.Integer.valueOf(this.f392228p), java.lang.Integer.valueOf(zn0Var.f392228p)) && n51.f.a(this.f392229q, zn0Var.f392229q) && n51.f.a(this.f392230r, zn0Var.f392230r) && n51.f.a(this.f392231s, zn0Var.f392231s) && n51.f.a(java.lang.Integer.valueOf(this.f392232t), java.lang.Integer.valueOf(zn0Var.f392232t)) && n51.f.a(this.f392233u, zn0Var.f392233u) && n51.f.a(this.f392234v, zn0Var.f392234v) && n51.f.a(this.f392235w, zn0Var.f392235w) && n51.f.a(this.f392236x, zn0Var.f392236x) && n51.f.a(this.f392237y, zn0Var.f392237y);
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
            fVar.e(2, this.f392219d);
            java.lang.String str = this.f392220e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f392221f);
            java.lang.String str2 = this.f392222g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f392223h);
            fVar.e(7, this.f392224i);
            java.lang.String str3 = this.f392225m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f392226n);
            r45.lj5 lj5Var = this.f392227o;
            if (lj5Var != null) {
                fVar.i(10, lj5Var.computeSize());
                this.f392227o.writeFields(fVar);
            }
            fVar.e(11, this.f392228p);
            java.lang.String str4 = this.f392229q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f392230r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f392231s;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.e(15, this.f392232t);
            java.lang.String str7 = this.f392233u;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f392234v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            r45.g04 g04Var = this.f392235w;
            if (g04Var != null) {
                fVar.i(18, g04Var.computeSize());
                this.f392235w.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f392236x;
            if (gVar != null) {
                fVar.b(19, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f392237y;
            if (gVar2 != null) {
                fVar.b(20, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f392219d);
            java.lang.String str9 = this.f392220e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f392221f);
            java.lang.String str10 = this.f392222g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            int e18 = e17 + b36.f.e(6, this.f392223h) + b36.f.e(7, this.f392224i);
            java.lang.String str11 = this.f392225m;
            if (str11 != null) {
                e18 += b36.f.j(8, str11);
            }
            int e19 = e18 + b36.f.e(9, this.f392226n);
            r45.lj5 lj5Var2 = this.f392227o;
            if (lj5Var2 != null) {
                e19 += b36.f.i(10, lj5Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(11, this.f392228p);
            java.lang.String str12 = this.f392229q;
            if (str12 != null) {
                e27 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f392230r;
            if (str13 != null) {
                e27 += b36.f.j(13, str13);
            }
            java.lang.String str14 = this.f392231s;
            if (str14 != null) {
                e27 += b36.f.j(14, str14);
            }
            int e28 = e27 + b36.f.e(15, this.f392232t);
            java.lang.String str15 = this.f392233u;
            if (str15 != null) {
                e28 += b36.f.j(16, str15);
            }
            java.lang.String str16 = this.f392234v;
            if (str16 != null) {
                e28 += b36.f.j(17, str16);
            }
            r45.g04 g04Var2 = this.f392235w;
            if (g04Var2 != null) {
                e28 += b36.f.i(18, g04Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f392236x;
            if (gVar3 != null) {
                e28 += b36.f.b(19, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f392237y;
            return gVar4 != null ? e28 + b36.f.b(20, gVar4) : e28;
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
        r45.zn0 zn0Var = (r45.zn0) objArr[1];
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
                    zn0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zn0Var.f392219d = aVar2.g(intValue);
                return 0;
            case 3:
                zn0Var.f392220e = aVar2.k(intValue);
                return 0;
            case 4:
                zn0Var.f392221f = aVar2.g(intValue);
                return 0;
            case 5:
                zn0Var.f392222g = aVar2.k(intValue);
                return 0;
            case 6:
                zn0Var.f392223h = aVar2.g(intValue);
                return 0;
            case 7:
                zn0Var.f392224i = aVar2.g(intValue);
                return 0;
            case 8:
                zn0Var.f392225m = aVar2.k(intValue);
                return 0;
            case 9:
                zn0Var.f392226n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr2 != null && bArr2.length > 0) {
                        lj5Var3.parseFrom(bArr2);
                    }
                    zn0Var.f392227o = lj5Var3;
                }
                return 0;
            case 11:
                zn0Var.f392228p = aVar2.g(intValue);
                return 0;
            case 12:
                zn0Var.f392229q = aVar2.k(intValue);
                return 0;
            case 13:
                zn0Var.f392230r = aVar2.k(intValue);
                return 0;
            case 14:
                zn0Var.f392231s = aVar2.k(intValue);
                return 0;
            case 15:
                zn0Var.f392232t = aVar2.g(intValue);
                return 0;
            case 16:
                zn0Var.f392233u = aVar2.k(intValue);
                return 0;
            case 17:
                zn0Var.f392234v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr3 != null && bArr3.length > 0) {
                        g04Var3.parseFrom(bArr3);
                    }
                    zn0Var.f392235w = g04Var3;
                }
                return 0;
            case 19:
                zn0Var.f392236x = aVar2.d(intValue);
                return 0;
            case 20:
                zn0Var.f392237y = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
