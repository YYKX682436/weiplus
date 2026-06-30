package r45;

/* loaded from: classes9.dex */
public class xt6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390407e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f390408f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390410h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390411i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390412m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390413n;

    /* renamed from: o, reason: collision with root package name */
    public int f390414o;

    /* renamed from: q, reason: collision with root package name */
    public int f390416q;

    /* renamed from: r, reason: collision with root package name */
    public r45.uu6 f390417r;

    /* renamed from: t, reason: collision with root package name */
    public r45.sj0 f390419t;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f390409g = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f390415p = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f390418s = new java.util.LinkedList();

    static {
        new r45.xt6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt6)) {
            return false;
        }
        r45.xt6 xt6Var = (r45.xt6) fVar;
        return n51.f.a(this.BaseRequest, xt6Var.BaseRequest) && n51.f.a(this.f390406d, xt6Var.f390406d) && n51.f.a(java.lang.Boolean.valueOf(this.f390407e), java.lang.Boolean.valueOf(xt6Var.f390407e)) && n51.f.a(java.lang.Boolean.valueOf(this.f390408f), java.lang.Boolean.valueOf(xt6Var.f390408f)) && n51.f.a(this.f390409g, xt6Var.f390409g) && n51.f.a(this.f390410h, xt6Var.f390410h) && n51.f.a(this.f390411i, xt6Var.f390411i) && n51.f.a(this.f390412m, xt6Var.f390412m) && n51.f.a(this.f390413n, xt6Var.f390413n) && n51.f.a(java.lang.Integer.valueOf(this.f390414o), java.lang.Integer.valueOf(xt6Var.f390414o)) && n51.f.a(this.f390415p, xt6Var.f390415p) && n51.f.a(java.lang.Integer.valueOf(this.f390416q), java.lang.Integer.valueOf(xt6Var.f390416q)) && n51.f.a(this.f390417r, xt6Var.f390417r) && n51.f.a(this.f390418s, xt6Var.f390418s) && n51.f.a(this.f390419t, xt6Var.f390419t);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.xt6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390409g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f390406d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f390407e);
            fVar.a(4, this.f390408f);
            fVar.g(5, 1, linkedList);
            java.lang.String str2 = this.f390410h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f390411i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f390412m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390413n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f390414o);
            fVar.g(11, 1, this.f390415p);
            fVar.e(12, this.f390416q);
            r45.uu6 uu6Var = this.f390417r;
            if (uu6Var != null) {
                fVar.i(13, uu6Var.computeSize());
                this.f390417r.writeFields(fVar);
            }
            fVar.g(14, 1, this.f390418s);
            r45.sj0 sj0Var = this.f390419t;
            if (sj0Var != null) {
                fVar.i(15, sj0Var.computeSize());
                this.f390419t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f390406d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int a17 = i18 + b36.f.a(3, this.f390407e) + b36.f.a(4, this.f390408f) + b36.f.g(5, 1, linkedList);
            java.lang.String str7 = this.f390410h;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f390411i;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f390412m;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f390413n;
            if (str10 != null) {
                a17 += b36.f.j(9, str10);
            }
            int e17 = a17 + b36.f.e(10, this.f390414o) + b36.f.g(11, 1, this.f390415p) + b36.f.e(12, this.f390416q);
            r45.uu6 uu6Var2 = this.f390417r;
            if (uu6Var2 != null) {
                e17 += b36.f.i(13, uu6Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(14, 1, this.f390418s);
            r45.sj0 sj0Var2 = this.f390419t;
            return sj0Var2 != null ? g17 + b36.f.i(15, sj0Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
            this.f390415p.clear();
            this.f390418s.clear();
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
                    this.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                this.f390406d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f390407e = aVar2.c(intValue);
                return 0;
            case 4:
                this.f390408f = aVar2.c(intValue);
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 6:
                this.f390410h = aVar2.k(intValue);
                return 0;
            case 7:
                this.f390411i = aVar2.k(intValue);
                return 0;
            case 8:
                this.f390412m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f390413n = aVar2.k(intValue);
                return 0;
            case 10:
                this.f390414o = aVar2.g(intValue);
                return 0;
            case 11:
                this.f390415p.add(aVar2.k(intValue));
                return 0;
            case 12:
                this.f390416q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.uu6 uu6Var3 = new r45.uu6();
                    if (bArr2 != null && bArr2.length > 0) {
                        uu6Var3.parseFrom(bArr2);
                    }
                    this.f390417r = uu6Var3;
                }
                return 0;
            case 14:
                this.f390418s.add(aVar2.k(intValue));
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.sj0 sj0Var3 = new r45.sj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sj0Var3.parseFrom(bArr3);
                    }
                    this.f390419t = sj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.xt6) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
