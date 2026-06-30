package r45;

/* loaded from: classes15.dex */
public class t30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386083e;

    /* renamed from: f, reason: collision with root package name */
    public int f386084f;

    /* renamed from: g, reason: collision with root package name */
    public int f386085g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f386086h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386087i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386088m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386089n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386090o;

    /* renamed from: p, reason: collision with root package name */
    public int f386091p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t30)) {
            return false;
        }
        r45.t30 t30Var = (r45.t30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386082d), java.lang.Integer.valueOf(t30Var.f386082d)) && n51.f.a(this.f386083e, t30Var.f386083e) && n51.f.a(java.lang.Integer.valueOf(this.f386084f), java.lang.Integer.valueOf(t30Var.f386084f)) && n51.f.a(java.lang.Integer.valueOf(this.f386085g), java.lang.Integer.valueOf(t30Var.f386085g)) && n51.f.a(this.f386086h, t30Var.f386086h) && n51.f.a(this.f386087i, t30Var.f386087i) && n51.f.a(this.f386088m, t30Var.f386088m) && n51.f.a(this.f386089n, t30Var.f386089n) && n51.f.a(this.f386090o, t30Var.f386090o) && n51.f.a(java.lang.Integer.valueOf(this.f386091p), java.lang.Integer.valueOf(t30Var.f386091p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386086h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386082d);
            java.lang.String str = this.f386083e;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(2, this.f386084f);
            fVar.e(3, this.f386085g);
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f386087i;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f386088m;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f386089n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f386090o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f386091p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386082d) + 0;
            java.lang.String str6 = this.f386083e;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            int e18 = e17 + b36.f.e(2, this.f386084f) + b36.f.e(3, this.f386085g) + b36.f.g(4, 8, linkedList);
            java.lang.String str7 = this.f386087i;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f386088m;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f386089n;
            if (str9 != null) {
                e18 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f386090o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            return e18 + b36.f.e(10, this.f386091p);
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
        r45.t30 t30Var = (r45.t30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                t30Var.f386082d = aVar2.g(intValue);
                return 0;
            case 2:
                t30Var.f386084f = aVar2.g(intValue);
                return 0;
            case 3:
                t30Var.f386085g = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    if (bArr2 != null && bArr2.length > 0) {
                        b44Var.parseFrom(bArr2);
                    }
                    t30Var.f386086h.add(b44Var);
                }
                return 0;
            case 5:
                t30Var.f386087i = aVar2.k(intValue);
                return 0;
            case 6:
                t30Var.f386088m = aVar2.k(intValue);
                return 0;
            case 7:
                t30Var.f386083e = aVar2.k(intValue);
                return 0;
            case 8:
                t30Var.f386089n = aVar2.k(intValue);
                return 0;
            case 9:
                t30Var.f386090o = aVar2.k(intValue);
                return 0;
            case 10:
                t30Var.f386091p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
