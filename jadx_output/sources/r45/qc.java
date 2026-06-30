package r45;

/* loaded from: classes12.dex */
public class qc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383819e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383820f;

    /* renamed from: g, reason: collision with root package name */
    public int f383821g;

    /* renamed from: h, reason: collision with root package name */
    public long f383822h;

    /* renamed from: i, reason: collision with root package name */
    public int f383823i;

    /* renamed from: m, reason: collision with root package name */
    public int f383824m;

    /* renamed from: n, reason: collision with root package name */
    public long f383825n;

    /* renamed from: o, reason: collision with root package name */
    public long f383826o;

    /* renamed from: p, reason: collision with root package name */
    public long f383827p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383828q;

    /* renamed from: r, reason: collision with root package name */
    public long f383829r;

    /* renamed from: s, reason: collision with root package name */
    public double f383830s;

    /* renamed from: t, reason: collision with root package name */
    public int f383831t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f383832u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qc)) {
            return false;
        }
        r45.qc qcVar = (r45.qc) fVar;
        return n51.f.a(this.f383818d, qcVar.f383818d) && n51.f.a(this.f383819e, qcVar.f383819e) && n51.f.a(this.f383820f, qcVar.f383820f) && n51.f.a(java.lang.Integer.valueOf(this.f383821g), java.lang.Integer.valueOf(qcVar.f383821g)) && n51.f.a(java.lang.Long.valueOf(this.f383822h), java.lang.Long.valueOf(qcVar.f383822h)) && n51.f.a(java.lang.Integer.valueOf(this.f383823i), java.lang.Integer.valueOf(qcVar.f383823i)) && n51.f.a(java.lang.Integer.valueOf(this.f383824m), java.lang.Integer.valueOf(qcVar.f383824m)) && n51.f.a(java.lang.Long.valueOf(this.f383825n), java.lang.Long.valueOf(qcVar.f383825n)) && n51.f.a(java.lang.Long.valueOf(this.f383826o), java.lang.Long.valueOf(qcVar.f383826o)) && n51.f.a(java.lang.Long.valueOf(this.f383827p), java.lang.Long.valueOf(qcVar.f383827p)) && n51.f.a(this.f383828q, qcVar.f383828q) && n51.f.a(java.lang.Long.valueOf(this.f383829r), java.lang.Long.valueOf(qcVar.f383829r)) && n51.f.a(java.lang.Double.valueOf(this.f383830s), java.lang.Double.valueOf(qcVar.f383830s)) && n51.f.a(java.lang.Integer.valueOf(this.f383831t), java.lang.Integer.valueOf(qcVar.f383831t)) && n51.f.a(this.f383832u, qcVar.f383832u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383818d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383819e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383820f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f383821g);
            fVar.h(5, this.f383822h);
            fVar.e(6, this.f383823i);
            fVar.e(7, this.f383824m);
            fVar.h(8, this.f383825n);
            fVar.h(9, this.f383826o);
            fVar.h(10, this.f383827p);
            java.lang.String str4 = this.f383828q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.h(12, this.f383829r);
            fVar.c(13, this.f383830s);
            fVar.e(14, this.f383831t);
            java.lang.String str5 = this.f383832u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f383818d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f383819e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f383820f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f383821g) + b36.f.h(5, this.f383822h) + b36.f.e(6, this.f383823i) + b36.f.e(7, this.f383824m) + b36.f.h(8, this.f383825n) + b36.f.h(9, this.f383826o) + b36.f.h(10, this.f383827p);
            java.lang.String str9 = this.f383828q;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            int h17 = e17 + b36.f.h(12, this.f383829r) + b36.f.c(13, this.f383830s) + b36.f.e(14, this.f383831t);
            java.lang.String str10 = this.f383832u;
            return str10 != null ? h17 + b36.f.j(15, str10) : h17;
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
        r45.qc qcVar = (r45.qc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qcVar.f383818d = aVar2.k(intValue);
                return 0;
            case 2:
                qcVar.f383819e = aVar2.k(intValue);
                return 0;
            case 3:
                qcVar.f383820f = aVar2.k(intValue);
                return 0;
            case 4:
                qcVar.f383821g = aVar2.g(intValue);
                return 0;
            case 5:
                qcVar.f383822h = aVar2.i(intValue);
                return 0;
            case 6:
                qcVar.f383823i = aVar2.g(intValue);
                return 0;
            case 7:
                qcVar.f383824m = aVar2.g(intValue);
                return 0;
            case 8:
                qcVar.f383825n = aVar2.i(intValue);
                return 0;
            case 9:
                qcVar.f383826o = aVar2.i(intValue);
                return 0;
            case 10:
                qcVar.f383827p = aVar2.i(intValue);
                return 0;
            case 11:
                qcVar.f383828q = aVar2.k(intValue);
                return 0;
            case 12:
                qcVar.f383829r = aVar2.i(intValue);
                return 0;
            case 13:
                qcVar.f383830s = aVar2.e(intValue);
                return 0;
            case 14:
                qcVar.f383831t = aVar2.g(intValue);
                return 0;
            case 15:
                qcVar.f383832u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
