package r45;

/* loaded from: classes9.dex */
public class i extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376582d;

    /* renamed from: e, reason: collision with root package name */
    public long f376583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376584f;

    /* renamed from: h, reason: collision with root package name */
    public int f376586h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376587i;

    /* renamed from: m, reason: collision with root package name */
    public r45.r1 f376588m;

    /* renamed from: n, reason: collision with root package name */
    public long f376589n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376590o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376591p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376592q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376593r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f376594s;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f376585g = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f376595t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i)) {
            return false;
        }
        r45.i iVar = (r45.i) fVar;
        return n51.f.a(this.BaseRequest, iVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f376582d), java.lang.Integer.valueOf(iVar.f376582d)) && n51.f.a(java.lang.Long.valueOf(this.f376583e), java.lang.Long.valueOf(iVar.f376583e)) && n51.f.a(this.f376584f, iVar.f376584f) && n51.f.a(this.f376585g, iVar.f376585g) && n51.f.a(java.lang.Integer.valueOf(this.f376586h), java.lang.Integer.valueOf(iVar.f376586h)) && n51.f.a(this.f376587i, iVar.f376587i) && n51.f.a(this.f376588m, iVar.f376588m) && n51.f.a(java.lang.Long.valueOf(this.f376589n), java.lang.Long.valueOf(iVar.f376589n)) && n51.f.a(this.f376590o, iVar.f376590o) && n51.f.a(this.f376591p, iVar.f376591p) && n51.f.a(this.f376592q, iVar.f376592q) && n51.f.a(this.f376593r, iVar.f376593r) && n51.f.a(java.lang.Boolean.valueOf(this.f376594s), java.lang.Boolean.valueOf(iVar.f376594s)) && n51.f.a(this.f376595t, iVar.f376595t);
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
            fVar.e(2, this.f376582d);
            fVar.h(3, this.f376583e);
            java.lang.String str = this.f376584f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, this.f376585g);
            fVar.e(6, this.f376586h);
            java.lang.String str2 = this.f376587i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.r1 r1Var = this.f376588m;
            if (r1Var != null) {
                fVar.i(8, r1Var.computeSize());
                this.f376588m.writeFields(fVar);
            }
            fVar.h(9, this.f376589n);
            java.lang.String str3 = this.f376590o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f376591p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f376592q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f376593r;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.a(14, this.f376594s);
            fVar.g(15, 8, this.f376595t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f376582d) + b36.f.h(3, this.f376583e);
            java.lang.String str7 = this.f376584f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int g17 = i18 + b36.f.g(5, 1, this.f376585g) + b36.f.e(6, this.f376586h);
            java.lang.String str8 = this.f376587i;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            r45.r1 r1Var2 = this.f376588m;
            if (r1Var2 != null) {
                g17 += b36.f.i(8, r1Var2.computeSize());
            }
            int h17 = g17 + b36.f.h(9, this.f376589n);
            java.lang.String str9 = this.f376590o;
            if (str9 != null) {
                h17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f376591p;
            if (str10 != null) {
                h17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f376592q;
            if (str11 != null) {
                h17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f376593r;
            if (str12 != null) {
                h17 += b36.f.j(13, str12);
            }
            return h17 + b36.f.a(14, this.f376594s) + b36.f.g(15, 8, this.f376595t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376585g.clear();
            this.f376595t.clear();
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
        r45.i iVar = (r45.i) objArr[1];
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
                    iVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                iVar.f376582d = aVar2.g(intValue);
                return 0;
            case 3:
                iVar.f376583e = aVar2.i(intValue);
                return 0;
            case 4:
                iVar.f376584f = aVar2.k(intValue);
                return 0;
            case 5:
                iVar.f376585g.add(aVar2.k(intValue));
                return 0;
            case 6:
                iVar.f376586h = aVar2.g(intValue);
                return 0;
            case 7:
                iVar.f376587i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr3 != null && bArr3.length > 0) {
                        r1Var3.parseFrom(bArr3);
                    }
                    iVar.f376588m = r1Var3;
                }
                return 0;
            case 9:
                iVar.f376589n = aVar2.i(intValue);
                return 0;
            case 10:
                iVar.f376590o = aVar2.k(intValue);
                return 0;
            case 11:
                iVar.f376591p = aVar2.k(intValue);
                return 0;
            case 12:
                iVar.f376592q = aVar2.k(intValue);
                return 0;
            case 13:
                iVar.f376593r = aVar2.k(intValue);
                return 0;
            case 14:
                iVar.f376594s = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr4 != null && bArr4.length > 0) {
                        bc6Var.parseFrom(bArr4);
                    }
                    iVar.f376595t.add(bc6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
