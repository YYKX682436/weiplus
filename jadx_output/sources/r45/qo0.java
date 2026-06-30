package r45;

/* loaded from: classes9.dex */
public class qo0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384130d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zd5 f384131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384133g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384134h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384135i;

    /* renamed from: m, reason: collision with root package name */
    public float f384136m;

    /* renamed from: n, reason: collision with root package name */
    public int f384137n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384138o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f384139p;

    /* renamed from: q, reason: collision with root package name */
    public float f384140q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384141r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f384142s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384143t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f384144u;

    /* renamed from: v, reason: collision with root package name */
    public r45.zd5 f384145v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f384146w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qo0)) {
            return false;
        }
        r45.qo0 qo0Var = (r45.qo0) fVar;
        return n51.f.a(this.BaseResponse, qo0Var.BaseResponse) && n51.f.a(this.f384130d, qo0Var.f384130d) && n51.f.a(this.f384131e, qo0Var.f384131e) && n51.f.a(this.f384132f, qo0Var.f384132f) && n51.f.a(this.f384133g, qo0Var.f384133g) && n51.f.a(this.f384134h, qo0Var.f384134h) && n51.f.a(this.f384135i, qo0Var.f384135i) && n51.f.a(java.lang.Float.valueOf(this.f384136m), java.lang.Float.valueOf(qo0Var.f384136m)) && n51.f.a(java.lang.Integer.valueOf(this.f384137n), java.lang.Integer.valueOf(qo0Var.f384137n)) && n51.f.a(this.f384138o, qo0Var.f384138o) && n51.f.a(this.f384139p, qo0Var.f384139p) && n51.f.a(java.lang.Float.valueOf(this.f384140q), java.lang.Float.valueOf(qo0Var.f384140q)) && n51.f.a(this.f384141r, qo0Var.f384141r) && n51.f.a(this.f384142s, qo0Var.f384142s) && n51.f.a(this.f384143t, qo0Var.f384143t) && n51.f.a(this.f384144u, qo0Var.f384144u) && n51.f.a(this.f384145v, qo0Var.f384145v) && n51.f.a(this.f384146w, qo0Var.f384146w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384130d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.zd5 zd5Var = this.f384131e;
            if (zd5Var != null) {
                fVar.i(3, zd5Var.computeSize());
                this.f384131e.writeFields(fVar);
            }
            java.lang.String str = this.f384132f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f384133g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f384134h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f384135i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.d(8, this.f384136m);
            fVar.e(9, this.f384137n);
            java.lang.String str5 = this.f384138o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f384139p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.d(12, this.f384140q);
            java.lang.String str7 = this.f384141r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f384142s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f384143t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f384144u;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            r45.zd5 zd5Var2 = this.f384145v;
            if (zd5Var2 != null) {
                fVar.i(17, zd5Var2.computeSize());
                this.f384145v.writeFields(fVar);
            }
            java.lang.String str11 = this.f384146w;
            if (str11 != null) {
                fVar.j(18, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList);
            r45.zd5 zd5Var3 = this.f384131e;
            if (zd5Var3 != null) {
                i18 += b36.f.i(3, zd5Var3.computeSize());
            }
            java.lang.String str12 = this.f384132f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f384133g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f384134h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f384135i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            int d17 = i18 + b36.f.d(8, this.f384136m) + b36.f.e(9, this.f384137n);
            java.lang.String str16 = this.f384138o;
            if (str16 != null) {
                d17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f384139p;
            if (str17 != null) {
                d17 += b36.f.j(11, str17);
            }
            int d18 = d17 + b36.f.d(12, this.f384140q);
            java.lang.String str18 = this.f384141r;
            if (str18 != null) {
                d18 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f384142s;
            if (str19 != null) {
                d18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f384143t;
            if (str20 != null) {
                d18 += b36.f.j(15, str20);
            }
            java.lang.String str21 = this.f384144u;
            if (str21 != null) {
                d18 += b36.f.j(16, str21);
            }
            r45.zd5 zd5Var4 = this.f384145v;
            if (zd5Var4 != null) {
                d18 += b36.f.i(17, zd5Var4.computeSize());
            }
            java.lang.String str22 = this.f384146w;
            return str22 != null ? d18 + b36.f.j(18, str22) : d18;
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
        r45.qo0 qo0Var = (r45.qo0) objArr[1];
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
                    qo0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q44 q44Var = new r45.q44();
                    if (bArr3 != null && bArr3.length > 0) {
                        q44Var.parseFrom(bArr3);
                    }
                    qo0Var.f384130d.add(q44Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.zd5 zd5Var5 = new r45.zd5();
                    if (bArr4 != null && bArr4.length > 0) {
                        zd5Var5.parseFrom(bArr4);
                    }
                    qo0Var.f384131e = zd5Var5;
                }
                return 0;
            case 4:
                qo0Var.f384132f = aVar2.k(intValue);
                return 0;
            case 5:
                qo0Var.f384133g = aVar2.k(intValue);
                return 0;
            case 6:
                qo0Var.f384134h = aVar2.k(intValue);
                return 0;
            case 7:
                qo0Var.f384135i = aVar2.k(intValue);
                return 0;
            case 8:
                qo0Var.f384136m = aVar2.f(intValue);
                return 0;
            case 9:
                qo0Var.f384137n = aVar2.g(intValue);
                return 0;
            case 10:
                qo0Var.f384138o = aVar2.k(intValue);
                return 0;
            case 11:
                qo0Var.f384139p = aVar2.k(intValue);
                return 0;
            case 12:
                qo0Var.f384140q = aVar2.f(intValue);
                return 0;
            case 13:
                qo0Var.f384141r = aVar2.k(intValue);
                return 0;
            case 14:
                qo0Var.f384142s = aVar2.k(intValue);
                return 0;
            case 15:
                qo0Var.f384143t = aVar2.k(intValue);
                return 0;
            case 16:
                qo0Var.f384144u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.zd5 zd5Var6 = new r45.zd5();
                    if (bArr5 != null && bArr5.length > 0) {
                        zd5Var6.parseFrom(bArr5);
                    }
                    qo0Var.f384145v = zd5Var6;
                }
                return 0;
            case 18:
                qo0Var.f384146w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
