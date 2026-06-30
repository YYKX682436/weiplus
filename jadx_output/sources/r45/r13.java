package r45;

/* loaded from: classes2.dex */
public class r13 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384417d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kv0 f384418e;

    /* renamed from: f, reason: collision with root package name */
    public int f384419f;

    /* renamed from: g, reason: collision with root package name */
    public int f384420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384421h;

    /* renamed from: i, reason: collision with root package name */
    public int f384422i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384423m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384424n;

    /* renamed from: o, reason: collision with root package name */
    public long f384425o;

    /* renamed from: p, reason: collision with root package name */
    public r45.y13 f384426p;

    /* renamed from: q, reason: collision with root package name */
    public int f384427q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384428r;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9037;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuserpageheader";
        lVar.f70664a = this;
        lVar.f70665b = new r45.s13();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r13)) {
            return false;
        }
        r45.r13 r13Var = (r45.r13) fVar;
        return n51.f.a(this.BaseRequest, r13Var.BaseRequest) && n51.f.a(this.f384417d, r13Var.f384417d) && n51.f.a(this.f384418e, r13Var.f384418e) && n51.f.a(java.lang.Integer.valueOf(this.f384419f), java.lang.Integer.valueOf(r13Var.f384419f)) && n51.f.a(java.lang.Integer.valueOf(this.f384420g), java.lang.Integer.valueOf(r13Var.f384420g)) && n51.f.a(this.f384421h, r13Var.f384421h) && n51.f.a(java.lang.Integer.valueOf(this.f384422i), java.lang.Integer.valueOf(r13Var.f384422i)) && n51.f.a(this.f384423m, r13Var.f384423m) && n51.f.a(this.f384424n, r13Var.f384424n) && n51.f.a(java.lang.Long.valueOf(this.f384425o), java.lang.Long.valueOf(r13Var.f384425o)) && n51.f.a(this.f384426p, r13Var.f384426p) && n51.f.a(java.lang.Integer.valueOf(this.f384427q), java.lang.Integer.valueOf(r13Var.f384427q)) && n51.f.a(this.f384428r, r13Var.f384428r);
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
            java.lang.String str = this.f384417d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.kv0 kv0Var = this.f384418e;
            if (kv0Var != null) {
                fVar.i(3, kv0Var.computeSize());
                this.f384418e.writeFields(fVar);
            }
            fVar.e(4, this.f384419f);
            fVar.e(5, this.f384420g);
            java.lang.String str2 = this.f384421h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f384422i);
            java.lang.String str3 = this.f384423m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f384424n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.h(10, this.f384425o);
            r45.y13 y13Var = this.f384426p;
            if (y13Var != null) {
                fVar.i(11, y13Var.computeSize());
                this.f384426p.writeFields(fVar);
            }
            fVar.e(12, this.f384427q);
            java.lang.String str5 = this.f384428r;
            if (str5 == null) {
                return 0;
            }
            fVar.j(13, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f384417d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            r45.kv0 kv0Var2 = this.f384418e;
            if (kv0Var2 != null) {
                i18 += b36.f.i(3, kv0Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f384419f) + b36.f.e(5, this.f384420g);
            java.lang.String str7 = this.f384421h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f384422i);
            java.lang.String str8 = this.f384423m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f384424n;
            if (str9 != null) {
                e18 += b36.f.j(9, str9);
            }
            int h17 = e18 + b36.f.h(10, this.f384425o);
            r45.y13 y13Var2 = this.f384426p;
            if (y13Var2 != null) {
                h17 += b36.f.i(11, y13Var2.computeSize());
            }
            int e19 = h17 + b36.f.e(12, this.f384427q);
            java.lang.String str10 = this.f384428r;
            return str10 != null ? e19 + b36.f.j(13, str10) : e19;
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
        r45.r13 r13Var = (r45.r13) objArr[1];
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
                    r13Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                r13Var.f384417d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    r13Var.f384418e = kv0Var3;
                }
                return 0;
            case 4:
                r13Var.f384419f = aVar2.g(intValue);
                return 0;
            case 5:
                r13Var.f384420g = aVar2.g(intValue);
                return 0;
            case 6:
                r13Var.f384421h = aVar2.k(intValue);
                return 0;
            case 7:
                r13Var.f384422i = aVar2.g(intValue);
                return 0;
            case 8:
                r13Var.f384423m = aVar2.k(intValue);
                return 0;
            case 9:
                r13Var.f384424n = aVar2.k(intValue);
                return 0;
            case 10:
                r13Var.f384425o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.y13 y13Var3 = new r45.y13();
                    if (bArr3 != null && bArr3.length > 0) {
                        y13Var3.parseFrom(bArr3);
                    }
                    r13Var.f384426p = y13Var3;
                }
                return 0;
            case 12:
                r13Var.f384427q = aVar2.g(intValue);
                return 0;
            case 13:
                r13Var.f384428r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
