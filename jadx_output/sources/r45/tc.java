package r45;

/* loaded from: classes12.dex */
public class tc extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386283d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f386284e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386288i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386289m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386290n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386291o;

    /* renamed from: p, reason: collision with root package name */
    public int f386292p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f386293q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f386294r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tc)) {
            return false;
        }
        r45.tc tcVar = (r45.tc) fVar;
        return n51.f.a(this.BaseRequest, tcVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386283d), java.lang.Integer.valueOf(tcVar.f386283d)) && n51.f.a(this.f386284e, tcVar.f386284e) && n51.f.a(this.f386285f, tcVar.f386285f) && n51.f.a(this.f386286g, tcVar.f386286g) && n51.f.a(this.f386287h, tcVar.f386287h) && n51.f.a(this.f386288i, tcVar.f386288i) && n51.f.a(this.f386289m, tcVar.f386289m) && n51.f.a(this.f386290n, tcVar.f386290n) && n51.f.a(this.f386291o, tcVar.f386291o) && n51.f.a(java.lang.Integer.valueOf(this.f386292p), java.lang.Integer.valueOf(tcVar.f386292p)) && n51.f.a(this.f386293q, tcVar.f386293q) && n51.f.a(this.f386294r, tcVar.f386294r);
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
            fVar.e(2, this.f386283d);
            r45.cu5 cu5Var = this.f386284e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f386284e.writeFields(fVar);
            }
            java.lang.String str = this.f386285f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f386286g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f386287h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f386288i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f386289m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f386290n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f386291o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f386292p);
            r45.cu5 cu5Var2 = this.f386293q;
            if (cu5Var2 != null) {
                fVar.i(12, cu5Var2.computeSize());
                this.f386293q.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f386294r;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(13, cu5Var3.computeSize());
            this.f386294r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386283d);
            r45.cu5 cu5Var4 = this.f386284e;
            if (cu5Var4 != null) {
                i18 += b36.f.i(3, cu5Var4.computeSize());
            }
            java.lang.String str8 = this.f386285f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f386286g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f386287h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f386288i;
            if (str11 != null) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f386289m;
            if (str12 != null) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f386290n;
            if (str13 != null) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f386291o;
            if (str14 != null) {
                i18 += b36.f.j(10, str14);
            }
            int e17 = i18 + b36.f.e(11, this.f386292p);
            r45.cu5 cu5Var5 = this.f386293q;
            if (cu5Var5 != null) {
                e17 += b36.f.i(12, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f386294r;
            return cu5Var6 != null ? e17 + b36.f.i(13, cu5Var6.computeSize()) : e17;
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
        r45.tc tcVar = (r45.tc) objArr[1];
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
                    tcVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                tcVar.f386283d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var7.b(bArr2);
                    }
                    tcVar.f386284e = cu5Var7;
                }
                return 0;
            case 4:
                tcVar.f386285f = aVar2.k(intValue);
                return 0;
            case 5:
                tcVar.f386286g = aVar2.k(intValue);
                return 0;
            case 6:
                tcVar.f386287h = aVar2.k(intValue);
                return 0;
            case 7:
                tcVar.f386288i = aVar2.k(intValue);
                return 0;
            case 8:
                tcVar.f386289m = aVar2.k(intValue);
                return 0;
            case 9:
                tcVar.f386290n = aVar2.k(intValue);
                return 0;
            case 10:
                tcVar.f386291o = aVar2.k(intValue);
                return 0;
            case 11:
                tcVar.f386292p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var8.b(bArr3);
                    }
                    tcVar.f386293q = cu5Var8;
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var9.b(bArr4);
                    }
                    tcVar.f386294r = cu5Var9;
                }
                return 0;
            default:
                return -1;
        }
    }
}
