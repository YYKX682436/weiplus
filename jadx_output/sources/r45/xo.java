package r45;

/* loaded from: classes9.dex */
public class xo extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390276d;

    /* renamed from: e, reason: collision with root package name */
    public int f390277e;

    /* renamed from: f, reason: collision with root package name */
    public int f390278f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390279g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390280h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390281i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390282m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390283n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390284o;

    /* renamed from: p, reason: collision with root package name */
    public int f390285p;

    /* renamed from: q, reason: collision with root package name */
    public int f390286q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f390287r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xo)) {
            return false;
        }
        r45.xo xoVar = (r45.xo) fVar;
        return n51.f.a(this.BaseRequest, xoVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f390276d), java.lang.Integer.valueOf(xoVar.f390276d)) && n51.f.a(java.lang.Integer.valueOf(this.f390277e), java.lang.Integer.valueOf(xoVar.f390277e)) && n51.f.a(java.lang.Integer.valueOf(this.f390278f), java.lang.Integer.valueOf(xoVar.f390278f)) && n51.f.a(this.f390279g, xoVar.f390279g) && n51.f.a(this.f390280h, xoVar.f390280h) && n51.f.a(this.f390281i, xoVar.f390281i) && n51.f.a(this.f390282m, xoVar.f390282m) && n51.f.a(this.f390283n, xoVar.f390283n) && n51.f.a(this.f390284o, xoVar.f390284o) && n51.f.a(java.lang.Integer.valueOf(this.f390285p), java.lang.Integer.valueOf(xoVar.f390285p)) && n51.f.a(java.lang.Integer.valueOf(this.f390286q), java.lang.Integer.valueOf(xoVar.f390286q)) && n51.f.a(this.f390287r, xoVar.f390287r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f390276d);
            fVar.e(3, this.f390277e);
            fVar.e(4, this.f390278f);
            java.lang.String str = this.f390279g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f390280h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f390281i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f390282m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390283n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f390284o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f390285p);
            fVar.e(12, this.f390286q);
            fVar.g(13, 8, this.f390287r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f390276d) + b36.f.e(3, this.f390277e) + b36.f.e(4, this.f390278f);
            java.lang.String str7 = this.f390279g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f390280h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f390281i;
            if (str9 != null) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f390282m;
            if (str10 != null) {
                i18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f390283n;
            if (str11 != null) {
                i18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f390284o;
            if (str12 != null) {
                i18 += b36.f.j(10, str12);
            }
            return i18 + b36.f.e(11, this.f390285p) + b36.f.e(12, this.f390286q) + b36.f.g(13, 8, this.f390287r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f390287r.clear();
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
        r45.xo xoVar = (r45.xo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    xoVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                xoVar.f390276d = aVar2.g(intValue);
                return 0;
            case 3:
                xoVar.f390277e = aVar2.g(intValue);
                return 0;
            case 4:
                xoVar.f390278f = aVar2.g(intValue);
                return 0;
            case 5:
                xoVar.f390279g = aVar2.k(intValue);
                return 0;
            case 6:
                xoVar.f390280h = aVar2.k(intValue);
                return 0;
            case 7:
                xoVar.f390281i = aVar2.k(intValue);
                return 0;
            case 8:
                xoVar.f390282m = aVar2.k(intValue);
                return 0;
            case 9:
                xoVar.f390283n = aVar2.k(intValue);
                return 0;
            case 10:
                xoVar.f390284o = aVar2.k(intValue);
                return 0;
            case 11:
                xoVar.f390285p = aVar2.g(intValue);
                return 0;
            case 12:
                xoVar.f390286q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ln0 ln0Var = new r45.ln0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ln0Var.parseFrom(bArr3);
                    }
                    xoVar.f390287r.add(ln0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
