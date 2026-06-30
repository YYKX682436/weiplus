package r45;

/* loaded from: classes9.dex */
public class ck extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371600d;

    /* renamed from: e, reason: collision with root package name */
    public int f371601e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371602f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371603g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371604h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371605i;

    /* renamed from: m, reason: collision with root package name */
    public int f371606m;

    /* renamed from: n, reason: collision with root package name */
    public int f371607n;

    /* renamed from: o, reason: collision with root package name */
    public int f371608o;

    /* renamed from: p, reason: collision with root package name */
    public int f371609p;

    /* renamed from: q, reason: collision with root package name */
    public r45.r60 f371610q;

    /* renamed from: r, reason: collision with root package name */
    public int f371611r;

    /* renamed from: s, reason: collision with root package name */
    public int f371612s;

    /* renamed from: t, reason: collision with root package name */
    public int f371613t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f371614u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ck)) {
            return false;
        }
        r45.ck ckVar = (r45.ck) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371600d), java.lang.Integer.valueOf(ckVar.f371600d)) && n51.f.a(java.lang.Integer.valueOf(this.f371601e), java.lang.Integer.valueOf(ckVar.f371601e)) && n51.f.a(this.f371602f, ckVar.f371602f) && n51.f.a(this.f371603g, ckVar.f371603g) && n51.f.a(this.f371604h, ckVar.f371604h) && n51.f.a(this.f371605i, ckVar.f371605i) && n51.f.a(java.lang.Integer.valueOf(this.f371606m), java.lang.Integer.valueOf(ckVar.f371606m)) && n51.f.a(java.lang.Integer.valueOf(this.f371607n), java.lang.Integer.valueOf(ckVar.f371607n)) && n51.f.a(java.lang.Integer.valueOf(this.f371608o), java.lang.Integer.valueOf(ckVar.f371608o)) && n51.f.a(java.lang.Integer.valueOf(this.f371609p), java.lang.Integer.valueOf(ckVar.f371609p)) && n51.f.a(this.f371610q, ckVar.f371610q) && n51.f.a(java.lang.Integer.valueOf(this.f371611r), java.lang.Integer.valueOf(ckVar.f371611r)) && n51.f.a(java.lang.Integer.valueOf(this.f371612s), java.lang.Integer.valueOf(ckVar.f371612s)) && n51.f.a(java.lang.Integer.valueOf(this.f371613t), java.lang.Integer.valueOf(ckVar.f371613t)) && n51.f.a(java.lang.Integer.valueOf(this.f371614u), java.lang.Integer.valueOf(ckVar.f371614u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371600d);
            fVar.e(2, this.f371601e);
            java.lang.String str = this.f371602f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371603g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371604h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f371605i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f371606m);
            fVar.e(8, this.f371607n);
            fVar.e(9, this.f371608o);
            fVar.e(10, this.f371609p);
            r45.r60 r60Var = this.f371610q;
            if (r60Var != null) {
                fVar.i(11, r60Var.computeSize());
                this.f371610q.writeFields(fVar);
            }
            fVar.e(12, this.f371611r);
            fVar.e(13, this.f371612s);
            fVar.e(14, this.f371613t);
            fVar.e(15, this.f371614u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371600d) + 0 + b36.f.e(2, this.f371601e);
            java.lang.String str5 = this.f371602f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f371603g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f371604h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f371605i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f371606m) + b36.f.e(8, this.f371607n) + b36.f.e(9, this.f371608o) + b36.f.e(10, this.f371609p);
            r45.r60 r60Var2 = this.f371610q;
            if (r60Var2 != null) {
                e18 += b36.f.i(11, r60Var2.computeSize());
            }
            return e18 + b36.f.e(12, this.f371611r) + b36.f.e(13, this.f371612s) + b36.f.e(14, this.f371613t) + b36.f.e(15, this.f371614u);
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
        r45.ck ckVar = (r45.ck) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ckVar.f371600d = aVar2.g(intValue);
                return 0;
            case 2:
                ckVar.f371601e = aVar2.g(intValue);
                return 0;
            case 3:
                ckVar.f371602f = aVar2.k(intValue);
                return 0;
            case 4:
                ckVar.f371603g = aVar2.k(intValue);
                return 0;
            case 5:
                ckVar.f371604h = aVar2.k(intValue);
                return 0;
            case 6:
                ckVar.f371605i = aVar2.k(intValue);
                return 0;
            case 7:
                ckVar.f371606m = aVar2.g(intValue);
                return 0;
            case 8:
                ckVar.f371607n = aVar2.g(intValue);
                return 0;
            case 9:
                ckVar.f371608o = aVar2.g(intValue);
                return 0;
            case 10:
                ckVar.f371609p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.r60 r60Var3 = new r45.r60();
                    if (bArr != null && bArr.length > 0) {
                        r60Var3.parseFrom(bArr);
                    }
                    ckVar.f371610q = r60Var3;
                }
                return 0;
            case 12:
                ckVar.f371611r = aVar2.g(intValue);
                return 0;
            case 13:
                ckVar.f371612s = aVar2.g(intValue);
                return 0;
            case 14:
                ckVar.f371613t = aVar2.g(intValue);
                return 0;
            case 15:
                ckVar.f371614u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
