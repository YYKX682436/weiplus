package r45;

/* loaded from: classes8.dex */
public class b24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370454e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370455f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370456g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370457h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370458i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370459m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370460n;

    /* renamed from: o, reason: collision with root package name */
    public int f370461o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f370462p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370463q;

    /* renamed from: r, reason: collision with root package name */
    public int f370464r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b24)) {
            return false;
        }
        r45.b24 b24Var = (r45.b24) fVar;
        return n51.f.a(this.BaseRequest, b24Var.BaseRequest) && n51.f.a(this.f370453d, b24Var.f370453d) && n51.f.a(this.f370454e, b24Var.f370454e) && n51.f.a(this.f370455f, b24Var.f370455f) && n51.f.a(this.f370456g, b24Var.f370456g) && n51.f.a(this.f370457h, b24Var.f370457h) && n51.f.a(this.f370458i, b24Var.f370458i) && n51.f.a(this.f370459m, b24Var.f370459m) && n51.f.a(this.f370460n, b24Var.f370460n) && n51.f.a(java.lang.Integer.valueOf(this.f370461o), java.lang.Integer.valueOf(b24Var.f370461o)) && n51.f.a(this.f370462p, b24Var.f370462p) && n51.f.a(this.f370463q, b24Var.f370463q) && n51.f.a(java.lang.Integer.valueOf(this.f370464r), java.lang.Integer.valueOf(b24Var.f370464r));
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
            java.lang.String str = this.f370453d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370454e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f370455f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f370456g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f370457h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f370458i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f370459m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f370460n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.e(10, this.f370461o);
            fVar.g(11, 8, this.f370462p);
            java.lang.String str8 = this.f370463q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f370464r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f370453d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f370454e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f370455f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f370456g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f370457h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f370458i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f370459m;
            if (str15 != null) {
                i18 += b36.f.j(8, str15);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370460n;
            if (gVar2 != null) {
                i18 += b36.f.b(9, gVar2);
            }
            int e17 = i18 + b36.f.e(10, this.f370461o) + b36.f.g(11, 8, this.f370462p);
            java.lang.String str16 = this.f370463q;
            if (str16 != null) {
                e17 += b36.f.j(12, str16);
            }
            return e17 + b36.f.e(13, this.f370464r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370462p.clear();
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
        r45.b24 b24Var = (r45.b24) objArr[1];
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
                    b24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                b24Var.f370453d = aVar2.k(intValue);
                return 0;
            case 3:
                b24Var.f370454e = aVar2.k(intValue);
                return 0;
            case 4:
                b24Var.f370455f = aVar2.k(intValue);
                return 0;
            case 5:
                b24Var.f370456g = aVar2.k(intValue);
                return 0;
            case 6:
                b24Var.f370457h = aVar2.k(intValue);
                return 0;
            case 7:
                b24Var.f370458i = aVar2.k(intValue);
                return 0;
            case 8:
                b24Var.f370459m = aVar2.k(intValue);
                return 0;
            case 9:
                b24Var.f370460n = aVar2.d(intValue);
                return 0;
            case 10:
                b24Var.f370461o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q24 q24Var = new r45.q24();
                    if (bArr3 != null && bArr3.length > 0) {
                        q24Var.parseFrom(bArr3);
                    }
                    b24Var.f370462p.add(q24Var);
                }
                return 0;
            case 12:
                b24Var.f370463q = aVar2.k(intValue);
                return 0;
            case 13:
                b24Var.f370464r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
