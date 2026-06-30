package r45;

/* loaded from: classes11.dex */
public class xv4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390497d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390498e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390499f;

    /* renamed from: g, reason: collision with root package name */
    public float f390500g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390501h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390502i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390503m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390504n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390505o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390506p;

    /* renamed from: q, reason: collision with root package name */
    public int f390507q;

    /* renamed from: r, reason: collision with root package name */
    public float f390508r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390509s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390510t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390511u;

    /* renamed from: v, reason: collision with root package name */
    public int f390512v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv4)) {
            return false;
        }
        r45.xv4 xv4Var = (r45.xv4) fVar;
        return n51.f.a(this.BaseResponse, xv4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390497d), java.lang.Integer.valueOf(xv4Var.f390497d)) && n51.f.a(this.f390498e, xv4Var.f390498e) && n51.f.a(this.f390499f, xv4Var.f390499f) && n51.f.a(java.lang.Float.valueOf(this.f390500g), java.lang.Float.valueOf(xv4Var.f390500g)) && n51.f.a(this.f390501h, xv4Var.f390501h) && n51.f.a(this.f390502i, xv4Var.f390502i) && n51.f.a(this.f390503m, xv4Var.f390503m) && n51.f.a(java.lang.Boolean.valueOf(this.f390504n), java.lang.Boolean.valueOf(xv4Var.f390504n)) && n51.f.a(this.f390505o, xv4Var.f390505o) && n51.f.a(this.f390506p, xv4Var.f390506p) && n51.f.a(java.lang.Integer.valueOf(this.f390507q), java.lang.Integer.valueOf(xv4Var.f390507q)) && n51.f.a(java.lang.Float.valueOf(this.f390508r), java.lang.Float.valueOf(xv4Var.f390508r)) && n51.f.a(this.f390509s, xv4Var.f390509s) && n51.f.a(this.f390510t, xv4Var.f390510t) && n51.f.a(this.f390511u, xv4Var.f390511u) && n51.f.a(java.lang.Integer.valueOf(this.f390512v), java.lang.Integer.valueOf(xv4Var.f390512v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390498e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f390497d);
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f390499f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(5, this.f390500g);
            java.lang.String str = this.f390501h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f390502i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f390503m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.a(9, this.f390504n);
            com.tencent.mm.protobuf.g gVar2 = this.f390505o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f390506p;
            if (gVar3 != null) {
                fVar.b(11, gVar3);
            }
            fVar.e(12, this.f390507q);
            fVar.d(13, this.f390508r);
            com.tencent.mm.protobuf.g gVar4 = this.f390509s;
            if (gVar4 != null) {
                fVar.b(14, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f390510t;
            if (gVar5 != null) {
                fVar.b(15, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f390511u;
            if (gVar6 != null) {
                fVar.b(16, gVar6);
            }
            fVar.e(17, this.f390512v);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f390497d) + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar7 = this.f390499f;
            if (gVar7 != null) {
                i18 += b36.f.b(4, gVar7);
            }
            int d17 = i18 + b36.f.d(5, this.f390500g);
            java.lang.String str4 = this.f390501h;
            if (str4 != null) {
                d17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f390502i;
            if (str5 != null) {
                d17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f390503m;
            if (str6 != null) {
                d17 += b36.f.j(8, str6);
            }
            int a17 = d17 + b36.f.a(9, this.f390504n);
            com.tencent.mm.protobuf.g gVar8 = this.f390505o;
            if (gVar8 != null) {
                a17 += b36.f.b(10, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.f390506p;
            if (gVar9 != null) {
                a17 += b36.f.b(11, gVar9);
            }
            int e17 = a17 + b36.f.e(12, this.f390507q) + b36.f.d(13, this.f390508r);
            com.tencent.mm.protobuf.g gVar10 = this.f390509s;
            if (gVar10 != null) {
                e17 += b36.f.b(14, gVar10);
            }
            com.tencent.mm.protobuf.g gVar11 = this.f390510t;
            if (gVar11 != null) {
                e17 += b36.f.b(15, gVar11);
            }
            com.tencent.mm.protobuf.g gVar12 = this.f390511u;
            if (gVar12 != null) {
                e17 += b36.f.b(16, gVar12);
            }
            return e17 + b36.f.e(17, this.f390512v);
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
        r45.xv4 xv4Var = (r45.xv4) objArr[1];
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
                    xv4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xv4Var.f390497d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.eq6 eq6Var = new r45.eq6();
                    if (bArr3 != null && bArr3.length > 0) {
                        eq6Var.parseFrom(bArr3);
                    }
                    xv4Var.f390498e.add(eq6Var);
                }
                return 0;
            case 4:
                xv4Var.f390499f = aVar2.d(intValue);
                return 0;
            case 5:
                xv4Var.f390500g = aVar2.f(intValue);
                return 0;
            case 6:
                xv4Var.f390501h = aVar2.k(intValue);
                return 0;
            case 7:
                xv4Var.f390502i = aVar2.k(intValue);
                return 0;
            case 8:
                xv4Var.f390503m = aVar2.k(intValue);
                return 0;
            case 9:
                xv4Var.f390504n = aVar2.c(intValue);
                return 0;
            case 10:
                xv4Var.f390505o = aVar2.d(intValue);
                return 0;
            case 11:
                xv4Var.f390506p = aVar2.d(intValue);
                return 0;
            case 12:
                xv4Var.f390507q = aVar2.g(intValue);
                return 0;
            case 13:
                xv4Var.f390508r = aVar2.f(intValue);
                return 0;
            case 14:
                xv4Var.f390509s = aVar2.d(intValue);
                return 0;
            case 15:
                xv4Var.f390510t = aVar2.d(intValue);
                return 0;
            case 16:
                xv4Var.f390511u = aVar2.d(intValue);
                return 0;
            case 17:
                xv4Var.f390512v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
