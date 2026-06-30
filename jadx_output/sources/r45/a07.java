package r45;

/* loaded from: classes15.dex */
public class a07 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public int f369607m;

    /* renamed from: n, reason: collision with root package name */
    public int f369608n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369601d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369602e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369603f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369604g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369605h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f369606i = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f369609o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f369610p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f369611q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f369612r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f369613s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f369614t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f369615u = -1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a07)) {
            return false;
        }
        r45.a07 a07Var = (r45.a07) fVar;
        return n51.f.a(this.f369601d, a07Var.f369601d) && n51.f.a(this.f369602e, a07Var.f369602e) && n51.f.a(this.f369603f, a07Var.f369603f) && n51.f.a(this.f369604g, a07Var.f369604g) && n51.f.a(this.f369605h, a07Var.f369605h) && n51.f.a(java.lang.Integer.valueOf(this.f369606i), java.lang.Integer.valueOf(a07Var.f369606i)) && n51.f.a(java.lang.Integer.valueOf(this.f369607m), java.lang.Integer.valueOf(a07Var.f369607m)) && n51.f.a(java.lang.Integer.valueOf(this.f369608n), java.lang.Integer.valueOf(a07Var.f369608n)) && n51.f.a(java.lang.Long.valueOf(this.f369609o), java.lang.Long.valueOf(a07Var.f369609o)) && n51.f.a(java.lang.Long.valueOf(this.f369610p), java.lang.Long.valueOf(a07Var.f369610p)) && n51.f.a(java.lang.Integer.valueOf(this.f369611q), java.lang.Integer.valueOf(a07Var.f369611q)) && n51.f.a(this.f369612r, a07Var.f369612r) && n51.f.a(this.f369613s, a07Var.f369613s) && n51.f.a(java.lang.Boolean.valueOf(this.f369614t), java.lang.Boolean.valueOf(a07Var.f369614t)) && n51.f.a(java.lang.Integer.valueOf(this.f369615u), java.lang.Integer.valueOf(a07Var.f369615u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369613s;
        java.util.LinkedList linkedList2 = this.f369612r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369601d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369602e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f369603f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f369604g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f369605h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f369606i);
            fVar.e(7, this.f369607m);
            fVar.e(8, this.f369608n);
            fVar.h(9, this.f369609o);
            fVar.h(10, this.f369610p);
            fVar.e(11, this.f369611q);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.a(14, this.f369614t);
            fVar.e(15, this.f369615u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f369601d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f369602e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f369603f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f369604g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f369605h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f369606i) + b36.f.e(7, this.f369607m) + b36.f.e(8, this.f369608n) + b36.f.h(9, this.f369609o) + b36.f.h(10, this.f369610p) + b36.f.e(11, this.f369611q) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.a(14, this.f369614t) + b36.f.e(15, this.f369615u);
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
        r45.a07 a07Var = (r45.a07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a07Var.f369601d = aVar2.k(intValue);
                return 0;
            case 2:
                a07Var.f369602e = aVar2.k(intValue);
                return 0;
            case 3:
                a07Var.f369603f = aVar2.k(intValue);
                return 0;
            case 4:
                a07Var.f369604g = aVar2.k(intValue);
                return 0;
            case 5:
                a07Var.f369605h = aVar2.k(intValue);
                return 0;
            case 6:
                a07Var.f369606i = aVar2.g(intValue);
                return 0;
            case 7:
                a07Var.f369607m = aVar2.g(intValue);
                return 0;
            case 8:
                a07Var.f369608n = aVar2.g(intValue);
                return 0;
            case 9:
                a07Var.f369609o = aVar2.i(intValue);
                return 0;
            case 10:
                a07Var.f369610p = aVar2.i(intValue);
                return 0;
            case 11:
                a07Var.f369611q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ql qlVar = new r45.ql();
                    if (bArr2 != null && bArr2.length > 0) {
                        qlVar.parseFrom(bArr2);
                    }
                    a07Var.f369612r.add(qlVar);
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.k44 k44Var = new r45.k44();
                    if (bArr3 != null && bArr3.length > 0) {
                        k44Var.parseFrom(bArr3);
                    }
                    a07Var.f369613s.add(k44Var);
                }
                return 0;
            case 14:
                a07Var.f369614t = aVar2.c(intValue);
                return 0;
            case 15:
                a07Var.f369615u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
