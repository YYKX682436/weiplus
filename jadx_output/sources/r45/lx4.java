package r45;

/* loaded from: classes7.dex */
public class lx4 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379935e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379936f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379937g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f379938h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379939i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f379940m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379942o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f379943p;

    /* renamed from: q, reason: collision with root package name */
    public int f379944q;

    /* renamed from: r, reason: collision with root package name */
    public int f379945r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379946s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f379947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f379948u;

    /* renamed from: v, reason: collision with root package name */
    public r45.qx4 f379949v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f379934d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f379941n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx4)) {
            return false;
        }
        r45.lx4 lx4Var = (r45.lx4) fVar;
        return n51.f.a(this.BaseResponse, lx4Var.BaseResponse) && n51.f.a(this.f379934d, lx4Var.f379934d) && n51.f.a(this.f379935e, lx4Var.f379935e) && n51.f.a(this.f379936f, lx4Var.f379936f) && n51.f.a(this.f379937g, lx4Var.f379937g) && n51.f.a(java.lang.Boolean.valueOf(this.f379938h), java.lang.Boolean.valueOf(lx4Var.f379938h)) && n51.f.a(java.lang.Boolean.valueOf(this.f379939i), java.lang.Boolean.valueOf(lx4Var.f379939i)) && n51.f.a(java.lang.Boolean.valueOf(this.f379940m), java.lang.Boolean.valueOf(lx4Var.f379940m)) && n51.f.a(this.f379941n, lx4Var.f379941n) && n51.f.a(java.lang.Boolean.valueOf(this.f379942o), java.lang.Boolean.valueOf(lx4Var.f379942o)) && n51.f.a(java.lang.Boolean.valueOf(this.f379943p), java.lang.Boolean.valueOf(lx4Var.f379943p)) && n51.f.a(java.lang.Integer.valueOf(this.f379944q), java.lang.Integer.valueOf(lx4Var.f379944q)) && n51.f.a(java.lang.Integer.valueOf(this.f379945r), java.lang.Integer.valueOf(lx4Var.f379945r)) && n51.f.a(this.f379946s, lx4Var.f379946s) && n51.f.a(this.f379947t, lx4Var.f379947t) && n51.f.a(java.lang.Boolean.valueOf(this.f379948u), java.lang.Boolean.valueOf(lx4Var.f379948u)) && n51.f.a(this.f379949v, lx4Var.f379949v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379941n;
        java.util.LinkedList linkedList2 = this.f379934d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f379935e;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f379936f;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f379937g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(8, this.f379938h);
            fVar.a(9, this.f379939i);
            fVar.a(10, this.f379940m);
            fVar.g(11, 8, linkedList);
            fVar.a(12, this.f379942o);
            fVar.a(13, this.f379943p);
            fVar.e(14, this.f379944q);
            fVar.e(15, this.f379945r);
            java.lang.String str4 = this.f379946s;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f379947t;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            fVar.a(18, this.f379948u);
            r45.qx4 qx4Var = this.f379949v;
            if (qx4Var != null) {
                fVar.i(19, qx4Var.computeSize());
                this.f379949v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(3, 8, linkedList2);
            java.lang.String str6 = this.f379935e;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f379936f;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f379937g;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            int a17 = i18 + b36.f.a(8, this.f379938h) + b36.f.a(9, this.f379939i) + b36.f.a(10, this.f379940m) + b36.f.g(11, 8, linkedList) + b36.f.a(12, this.f379942o) + b36.f.a(13, this.f379943p) + b36.f.e(14, this.f379944q) + b36.f.e(15, this.f379945r);
            java.lang.String str9 = this.f379946s;
            if (str9 != null) {
                a17 += b36.f.j(16, str9);
            }
            java.lang.String str10 = this.f379947t;
            if (str10 != null) {
                a17 += b36.f.j(17, str10);
            }
            int a18 = a17 + b36.f.a(18, this.f379948u);
            r45.qx4 qx4Var2 = this.f379949v;
            return qx4Var2 != null ? a18 + b36.f.i(19, qx4Var2.computeSize()) : a18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.lx4 lx4Var = (r45.lx4) objArr[1];
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
                    lx4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
            case 7:
            default:
                return -1;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.parseFrom(bArr3);
                    }
                    lx4Var.f379934d.add(px4Var);
                }
                return 0;
            case 4:
                lx4Var.f379935e = aVar2.k(intValue);
                return 0;
            case 5:
                lx4Var.f379936f = aVar2.k(intValue);
                return 0;
            case 6:
                lx4Var.f379937g = aVar2.k(intValue);
                return 0;
            case 8:
                lx4Var.f379938h = aVar2.c(intValue);
                return 0;
            case 9:
                lx4Var.f379939i = aVar2.c(intValue);
                return 0;
            case 10:
                lx4Var.f379940m = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.parseFrom(bArr4);
                    }
                    lx4Var.f379941n.add(mx4Var);
                }
                return 0;
            case 12:
                lx4Var.f379942o = aVar2.c(intValue);
                return 0;
            case 13:
                lx4Var.f379943p = aVar2.c(intValue);
                return 0;
            case 14:
                lx4Var.f379944q = aVar2.g(intValue);
                return 0;
            case 15:
                lx4Var.f379945r = aVar2.g(intValue);
                return 0;
            case 16:
                lx4Var.f379946s = aVar2.k(intValue);
                return 0;
            case 17:
                lx4Var.f379947t = aVar2.k(intValue);
                return 0;
            case 18:
                lx4Var.f379948u = aVar2.c(intValue);
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.parseFrom(bArr5);
                    }
                    lx4Var.f379949v = qx4Var3;
                }
                return 0;
        }
    }
}
