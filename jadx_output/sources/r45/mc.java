package r45;

/* loaded from: classes12.dex */
public class mc extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zd f380343d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f380344e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380345f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380346g;

    /* renamed from: h, reason: collision with root package name */
    public int f380347h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380348i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380349m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380350n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380351o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380352p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380353q;

    /* renamed from: r, reason: collision with root package name */
    public int f380354r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f380355s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cu5 f380356t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f380357u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f380358v;

    /* renamed from: w, reason: collision with root package name */
    public r45.ye5 f380359w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mc)) {
            return false;
        }
        r45.mc mcVar = (r45.mc) fVar;
        return n51.f.a(this.BaseRequest, mcVar.BaseRequest) && n51.f.a(this.f380343d, mcVar.f380343d) && n51.f.a(this.f380344e, mcVar.f380344e) && n51.f.a(this.f380345f, mcVar.f380345f) && n51.f.a(this.f380346g, mcVar.f380346g) && n51.f.a(java.lang.Integer.valueOf(this.f380347h), java.lang.Integer.valueOf(mcVar.f380347h)) && n51.f.a(this.f380348i, mcVar.f380348i) && n51.f.a(this.f380349m, mcVar.f380349m) && n51.f.a(this.f380350n, mcVar.f380350n) && n51.f.a(this.f380351o, mcVar.f380351o) && n51.f.a(this.f380352p, mcVar.f380352p) && n51.f.a(this.f380353q, mcVar.f380353q) && n51.f.a(java.lang.Integer.valueOf(this.f380354r), java.lang.Integer.valueOf(mcVar.f380354r)) && n51.f.a(this.f380355s, mcVar.f380355s) && n51.f.a(this.f380356t, mcVar.f380356t) && n51.f.a(this.f380357u, mcVar.f380357u) && n51.f.a(this.f380358v, mcVar.f380358v) && n51.f.a(this.f380359w, mcVar.f380359w);
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
            r45.zd zdVar = this.f380343d;
            if (zdVar != null) {
                fVar.i(2, zdVar.computeSize());
                this.f380343d.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f380344e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f380344e.writeFields(fVar);
            }
            java.lang.String str = this.f380345f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f380346g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f380347h);
            java.lang.String str3 = this.f380348i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f380349m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f380350n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f380351o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f380352p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f380353q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f380354r);
            r45.cu5 cu5Var2 = this.f380355s;
            if (cu5Var2 != null) {
                fVar.i(14, cu5Var2.computeSize());
                this.f380355s.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f380356t;
            if (cu5Var3 != null) {
                fVar.i(15, cu5Var3.computeSize());
                this.f380356t.writeFields(fVar);
            }
            java.lang.String str9 = this.f380357u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f380358v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            r45.ye5 ye5Var = this.f380359w;
            if (ye5Var != null) {
                fVar.i(18, ye5Var.computeSize());
                this.f380359w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.zd zdVar2 = this.f380343d;
            if (zdVar2 != null) {
                i18 += b36.f.i(2, zdVar2.computeSize());
            }
            r45.cu5 cu5Var4 = this.f380344e;
            if (cu5Var4 != null) {
                i18 += b36.f.i(3, cu5Var4.computeSize());
            }
            java.lang.String str11 = this.f380345f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f380346g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            int e17 = i18 + b36.f.e(6, this.f380347h);
            java.lang.String str13 = this.f380348i;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f380349m;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f380350n;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f380351o;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f380352p;
            if (str17 != null) {
                e17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f380353q;
            if (str18 != null) {
                e17 += b36.f.j(12, str18);
            }
            int e18 = e17 + b36.f.e(13, this.f380354r);
            r45.cu5 cu5Var5 = this.f380355s;
            if (cu5Var5 != null) {
                e18 += b36.f.i(14, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f380356t;
            if (cu5Var6 != null) {
                e18 += b36.f.i(15, cu5Var6.computeSize());
            }
            java.lang.String str19 = this.f380357u;
            if (str19 != null) {
                e18 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f380358v;
            if (str20 != null) {
                e18 += b36.f.j(17, str20);
            }
            r45.ye5 ye5Var2 = this.f380359w;
            return ye5Var2 != null ? e18 + b36.f.i(18, ye5Var2.computeSize()) : e18;
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
        r45.mc mcVar = (r45.mc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    mcVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zd zdVar3 = new r45.zd();
                    if (bArr2 != null && bArr2.length > 0) {
                        zdVar3.parseFrom(bArr2);
                    }
                    mcVar.f380343d = zdVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var7.b(bArr3);
                    }
                    mcVar.f380344e = cu5Var7;
                }
                return 0;
            case 4:
                mcVar.f380345f = aVar2.k(intValue);
                return 0;
            case 5:
                mcVar.f380346g = aVar2.k(intValue);
                return 0;
            case 6:
                mcVar.f380347h = aVar2.g(intValue);
                return 0;
            case 7:
                mcVar.f380348i = aVar2.k(intValue);
                return 0;
            case 8:
                mcVar.f380349m = aVar2.k(intValue);
                return 0;
            case 9:
                mcVar.f380350n = aVar2.k(intValue);
                return 0;
            case 10:
                mcVar.f380351o = aVar2.k(intValue);
                return 0;
            case 11:
                mcVar.f380352p = aVar2.k(intValue);
                return 0;
            case 12:
                mcVar.f380353q = aVar2.k(intValue);
                return 0;
            case 13:
                mcVar.f380354r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var8.b(bArr4);
                    }
                    mcVar.f380355s = cu5Var8;
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var9.b(bArr5);
                    }
                    mcVar.f380356t = cu5Var9;
                }
                return 0;
            case 16:
                mcVar.f380357u = aVar2.k(intValue);
                return 0;
            case 17:
                mcVar.f380358v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.ye5 ye5Var3 = new r45.ye5();
                    if (bArr6 != null && bArr6.length > 0) {
                        ye5Var3.parseFrom(bArr6);
                    }
                    mcVar.f380359w = ye5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
