package r45;

/* loaded from: classes9.dex */
public class b25 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370465d;

    /* renamed from: e, reason: collision with root package name */
    public int f370466e;

    /* renamed from: f, reason: collision with root package name */
    public int f370467f;

    /* renamed from: g, reason: collision with root package name */
    public long f370468g;

    /* renamed from: h, reason: collision with root package name */
    public int f370469h;

    /* renamed from: i, reason: collision with root package name */
    public long f370470i;

    /* renamed from: m, reason: collision with root package name */
    public int f370471m;

    /* renamed from: n, reason: collision with root package name */
    public long f370472n;

    /* renamed from: o, reason: collision with root package name */
    public int f370473o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f370474p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370475q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370476r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f370477s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f370478t;

    /* renamed from: u, reason: collision with root package name */
    public int f370479u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f370480v;

    /* renamed from: w, reason: collision with root package name */
    public int f370481w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f370482x;

    /* renamed from: y, reason: collision with root package name */
    public r45.lj5 f370483y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f370484z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b25)) {
            return false;
        }
        r45.b25 b25Var = (r45.b25) fVar;
        return n51.f.a(this.BaseResponse, b25Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370465d), java.lang.Integer.valueOf(b25Var.f370465d)) && n51.f.a(java.lang.Integer.valueOf(this.f370466e), java.lang.Integer.valueOf(b25Var.f370466e)) && n51.f.a(java.lang.Integer.valueOf(this.f370467f), java.lang.Integer.valueOf(b25Var.f370467f)) && n51.f.a(java.lang.Long.valueOf(this.f370468g), java.lang.Long.valueOf(b25Var.f370468g)) && n51.f.a(java.lang.Integer.valueOf(this.f370469h), java.lang.Integer.valueOf(b25Var.f370469h)) && n51.f.a(java.lang.Long.valueOf(this.f370470i), java.lang.Long.valueOf(b25Var.f370470i)) && n51.f.a(java.lang.Integer.valueOf(this.f370471m), java.lang.Integer.valueOf(b25Var.f370471m)) && n51.f.a(java.lang.Long.valueOf(this.f370472n), java.lang.Long.valueOf(b25Var.f370472n)) && n51.f.a(java.lang.Integer.valueOf(this.f370473o), java.lang.Integer.valueOf(b25Var.f370473o)) && n51.f.a(this.f370474p, b25Var.f370474p) && n51.f.a(this.f370475q, b25Var.f370475q) && n51.f.a(this.f370476r, b25Var.f370476r) && n51.f.a(this.f370477s, b25Var.f370477s) && n51.f.a(this.f370478t, b25Var.f370478t) && n51.f.a(java.lang.Integer.valueOf(this.f370479u), java.lang.Integer.valueOf(b25Var.f370479u)) && n51.f.a(this.f370480v, b25Var.f370480v) && n51.f.a(java.lang.Integer.valueOf(this.f370481w), java.lang.Integer.valueOf(b25Var.f370481w)) && n51.f.a(this.f370482x, b25Var.f370482x) && n51.f.a(this.f370483y, b25Var.f370483y) && n51.f.a(this.f370484z, b25Var.f370484z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370474p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370465d);
            fVar.e(3, this.f370466e);
            fVar.e(4, this.f370467f);
            fVar.h(5, this.f370468g);
            fVar.e(6, this.f370469h);
            fVar.h(7, this.f370470i);
            fVar.e(8, this.f370471m);
            fVar.h(9, this.f370472n);
            fVar.e(10, this.f370473o);
            fVar.g(11, 8, linkedList);
            java.lang.String str = this.f370475q;
            if (str != null) {
                fVar.j(12, str);
            }
            java.lang.String str2 = this.f370476r;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f370477s;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            java.lang.String str4 = this.f370478t;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            fVar.e(16, this.f370479u);
            java.lang.String str5 = this.f370480v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            fVar.e(18, this.f370481w);
            java.lang.String str6 = this.f370482x;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            r45.lj5 lj5Var = this.f370483y;
            if (lj5Var != null) {
                fVar.i(20, lj5Var.computeSize());
                this.f370483y.writeFields(fVar);
            }
            java.lang.String str7 = this.f370484z;
            if (str7 != null) {
                fVar.j(21, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f370465d) + b36.f.e(3, this.f370466e) + b36.f.e(4, this.f370467f) + b36.f.h(5, this.f370468g) + b36.f.e(6, this.f370469h) + b36.f.h(7, this.f370470i) + b36.f.e(8, this.f370471m) + b36.f.h(9, this.f370472n) + b36.f.e(10, this.f370473o) + b36.f.g(11, 8, linkedList);
            java.lang.String str8 = this.f370475q;
            if (str8 != null) {
                i18 += b36.f.j(12, str8);
            }
            java.lang.String str9 = this.f370476r;
            if (str9 != null) {
                i18 += b36.f.j(13, str9);
            }
            java.lang.String str10 = this.f370477s;
            if (str10 != null) {
                i18 += b36.f.j(14, str10);
            }
            java.lang.String str11 = this.f370478t;
            if (str11 != null) {
                i18 += b36.f.j(15, str11);
            }
            int e17 = i18 + b36.f.e(16, this.f370479u);
            java.lang.String str12 = this.f370480v;
            if (str12 != null) {
                e17 += b36.f.j(17, str12);
            }
            int e18 = e17 + b36.f.e(18, this.f370481w);
            java.lang.String str13 = this.f370482x;
            if (str13 != null) {
                e18 += b36.f.j(19, str13);
            }
            r45.lj5 lj5Var2 = this.f370483y;
            if (lj5Var2 != null) {
                e18 += b36.f.i(20, lj5Var2.computeSize());
            }
            java.lang.String str14 = this.f370484z;
            return str14 != null ? e18 + b36.f.j(21, str14) : e18;
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
        r45.b25 b25Var = (r45.b25) objArr[1];
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
                    b25Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                b25Var.f370465d = aVar2.g(intValue);
                return 0;
            case 3:
                b25Var.f370466e = aVar2.g(intValue);
                return 0;
            case 4:
                b25Var.f370467f = aVar2.g(intValue);
                return 0;
            case 5:
                b25Var.f370468g = aVar2.i(intValue);
                return 0;
            case 6:
                b25Var.f370469h = aVar2.g(intValue);
                return 0;
            case 7:
                b25Var.f370470i = aVar2.i(intValue);
                return 0;
            case 8:
                b25Var.f370471m = aVar2.g(intValue);
                return 0;
            case 9:
                b25Var.f370472n = aVar2.i(intValue);
                return 0;
            case 10:
                b25Var.f370473o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vu3 vu3Var = new r45.vu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        vu3Var.parseFrom(bArr3);
                    }
                    b25Var.f370474p.add(vu3Var);
                }
                return 0;
            case 12:
                b25Var.f370475q = aVar2.k(intValue);
                return 0;
            case 13:
                b25Var.f370476r = aVar2.k(intValue);
                return 0;
            case 14:
                b25Var.f370477s = aVar2.k(intValue);
                return 0;
            case 15:
                b25Var.f370478t = aVar2.k(intValue);
                return 0;
            case 16:
                b25Var.f370479u = aVar2.g(intValue);
                return 0;
            case 17:
                b25Var.f370480v = aVar2.k(intValue);
                return 0;
            case 18:
                b25Var.f370481w = aVar2.g(intValue);
                return 0;
            case 19:
                b25Var.f370482x = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr4 != null && bArr4.length > 0) {
                        lj5Var3.parseFrom(bArr4);
                    }
                    b25Var.f370483y = lj5Var3;
                }
                return 0;
            case 21:
                b25Var.f370484z = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
