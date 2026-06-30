package r45;

/* loaded from: classes15.dex */
public class c45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371270d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371273g;

    /* renamed from: n, reason: collision with root package name */
    public r45.x35 f371277n;

    /* renamed from: e, reason: collision with root package name */
    public long f371271e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f371272f = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f371274h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f371275i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f371276m = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371278o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f371279p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371280q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371281r = "";

    /* renamed from: s, reason: collision with root package name */
    public int f371282s = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f371283t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f371284u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f371285v = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c45)) {
            return false;
        }
        r45.c45 c45Var = (r45.c45) fVar;
        return n51.f.a(this.f371270d, c45Var.f371270d) && n51.f.a(java.lang.Long.valueOf(this.f371271e), java.lang.Long.valueOf(c45Var.f371271e)) && n51.f.a(java.lang.Integer.valueOf(this.f371272f), java.lang.Integer.valueOf(c45Var.f371272f)) && n51.f.a(this.f371273g, c45Var.f371273g) && n51.f.a(java.lang.Integer.valueOf(this.f371274h), java.lang.Integer.valueOf(c45Var.f371274h)) && n51.f.a(java.lang.Long.valueOf(this.f371275i), java.lang.Long.valueOf(c45Var.f371275i)) && n51.f.a(java.lang.Long.valueOf(this.f371276m), java.lang.Long.valueOf(c45Var.f371276m)) && n51.f.a(this.f371277n, c45Var.f371277n) && n51.f.a(this.f371278o, c45Var.f371278o) && n51.f.a(java.lang.Boolean.valueOf(this.f371279p), java.lang.Boolean.valueOf(c45Var.f371279p)) && n51.f.a(this.f371280q, c45Var.f371280q) && n51.f.a(this.f371281r, c45Var.f371281r) && n51.f.a(java.lang.Integer.valueOf(this.f371282s), java.lang.Integer.valueOf(c45Var.f371282s)) && n51.f.a(java.lang.Boolean.valueOf(this.f371283t), java.lang.Boolean.valueOf(c45Var.f371283t)) && n51.f.a(java.lang.Integer.valueOf(this.f371284u), java.lang.Integer.valueOf(c45Var.f371284u)) && n51.f.a(this.f371285v, c45Var.f371285v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371270d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f371271e);
            fVar.e(3, this.f371272f);
            java.lang.String str2 = this.f371273g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f371274h);
            fVar.h(6, this.f371275i);
            fVar.h(7, this.f371276m);
            r45.x35 x35Var = this.f371277n;
            if (x35Var != null) {
                fVar.i(8, x35Var.computeSize());
                this.f371277n.writeFields(fVar);
            }
            java.lang.String str3 = this.f371278o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f371279p);
            java.lang.String str4 = this.f371280q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f371281r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(13, this.f371282s);
            fVar.a(14, this.f371283t);
            fVar.e(15, this.f371284u);
            java.lang.String str6 = this.f371285v;
            if (str6 != null) {
                fVar.j(16, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f371270d;
            int j17 = (str7 != null ? b36.f.j(1, str7) + 0 : 0) + b36.f.h(2, this.f371271e) + b36.f.e(3, this.f371272f);
            java.lang.String str8 = this.f371273g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f371274h) + b36.f.h(6, this.f371275i) + b36.f.h(7, this.f371276m);
            r45.x35 x35Var2 = this.f371277n;
            if (x35Var2 != null) {
                e17 += b36.f.i(8, x35Var2.computeSize());
            }
            java.lang.String str9 = this.f371278o;
            if (str9 != null) {
                e17 += b36.f.j(9, str9);
            }
            int a17 = e17 + b36.f.a(10, this.f371279p);
            java.lang.String str10 = this.f371280q;
            if (str10 != null) {
                a17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f371281r;
            if (str11 != null) {
                a17 += b36.f.j(12, str11);
            }
            int e18 = a17 + b36.f.e(13, this.f371282s) + b36.f.a(14, this.f371283t) + b36.f.e(15, this.f371284u);
            java.lang.String str12 = this.f371285v;
            return str12 != null ? e18 + b36.f.j(16, str12) : e18;
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
        r45.c45 c45Var = (r45.c45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c45Var.f371270d = aVar2.k(intValue);
                return 0;
            case 2:
                c45Var.f371271e = aVar2.i(intValue);
                return 0;
            case 3:
                c45Var.f371272f = aVar2.g(intValue);
                return 0;
            case 4:
                c45Var.f371273g = aVar2.k(intValue);
                return 0;
            case 5:
                c45Var.f371274h = aVar2.g(intValue);
                return 0;
            case 6:
                c45Var.f371275i = aVar2.i(intValue);
                return 0;
            case 7:
                c45Var.f371276m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.x35 x35Var3 = new r45.x35();
                    if (bArr != null && bArr.length > 0) {
                        x35Var3.parseFrom(bArr);
                    }
                    c45Var.f371277n = x35Var3;
                }
                return 0;
            case 9:
                c45Var.f371278o = aVar2.k(intValue);
                return 0;
            case 10:
                c45Var.f371279p = aVar2.c(intValue);
                return 0;
            case 11:
                c45Var.f371280q = aVar2.k(intValue);
                return 0;
            case 12:
                c45Var.f371281r = aVar2.k(intValue);
                return 0;
            case 13:
                c45Var.f371282s = aVar2.g(intValue);
                return 0;
            case 14:
                c45Var.f371283t = aVar2.c(intValue);
                return 0;
            case 15:
                c45Var.f371284u = aVar2.g(intValue);
                return 0;
            case 16:
                c45Var.f371285v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
