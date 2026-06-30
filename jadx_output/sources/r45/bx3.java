package r45;

/* loaded from: classes9.dex */
public class bx3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371120e;

    /* renamed from: f, reason: collision with root package name */
    public long f371121f;

    /* renamed from: g, reason: collision with root package name */
    public int f371122g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371123h;

    /* renamed from: i, reason: collision with root package name */
    public int f371124i;

    /* renamed from: m, reason: collision with root package name */
    public r45.n75 f371125m;

    /* renamed from: n, reason: collision with root package name */
    public int f371126n;

    /* renamed from: o, reason: collision with root package name */
    public int f371127o;

    /* renamed from: p, reason: collision with root package name */
    public int f371128p;

    /* renamed from: q, reason: collision with root package name */
    public int f371129q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371130r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f371131s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx3)) {
            return false;
        }
        r45.bx3 bx3Var = (r45.bx3) fVar;
        return n51.f.a(this.f371119d, bx3Var.f371119d) && n51.f.a(this.f371120e, bx3Var.f371120e) && n51.f.a(java.lang.Long.valueOf(this.f371121f), java.lang.Long.valueOf(bx3Var.f371121f)) && n51.f.a(java.lang.Integer.valueOf(this.f371122g), java.lang.Integer.valueOf(bx3Var.f371122g)) && n51.f.a(this.f371123h, bx3Var.f371123h) && n51.f.a(java.lang.Integer.valueOf(this.f371124i), java.lang.Integer.valueOf(bx3Var.f371124i)) && n51.f.a(this.f371125m, bx3Var.f371125m) && n51.f.a(java.lang.Integer.valueOf(this.f371126n), java.lang.Integer.valueOf(bx3Var.f371126n)) && n51.f.a(java.lang.Integer.valueOf(this.f371127o), java.lang.Integer.valueOf(bx3Var.f371127o)) && n51.f.a(java.lang.Integer.valueOf(this.f371128p), java.lang.Integer.valueOf(bx3Var.f371128p)) && n51.f.a(java.lang.Integer.valueOf(this.f371129q), java.lang.Integer.valueOf(bx3Var.f371129q)) && n51.f.a(this.f371130r, bx3Var.f371130r) && n51.f.a(this.f371131s, bx3Var.f371131s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371119d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371120e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f371121f);
            fVar.e(4, this.f371122g);
            java.lang.String str3 = this.f371123h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f371124i);
            r45.n75 n75Var = this.f371125m;
            if (n75Var != null) {
                fVar.i(7, n75Var.computeSize());
                this.f371125m.writeFields(fVar);
            }
            fVar.e(8, this.f371126n);
            fVar.e(9, this.f371127o);
            fVar.e(10, this.f371128p);
            fVar.e(11, this.f371129q);
            java.lang.String str4 = this.f371130r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f371131s;
            if (str5 == null) {
                return 0;
            }
            fVar.j(13, str5);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f371119d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f371120e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int h17 = j17 + b36.f.h(3, this.f371121f) + b36.f.e(4, this.f371122g);
            java.lang.String str8 = this.f371123h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            int e17 = h17 + b36.f.e(6, this.f371124i);
            r45.n75 n75Var2 = this.f371125m;
            if (n75Var2 != null) {
                e17 += b36.f.i(7, n75Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f371126n) + b36.f.e(9, this.f371127o) + b36.f.e(10, this.f371128p) + b36.f.e(11, this.f371129q);
            java.lang.String str9 = this.f371130r;
            if (str9 != null) {
                e18 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f371131s;
            return str10 != null ? e18 + b36.f.j(13, str10) : e18;
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
        r45.bx3 bx3Var = (r45.bx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bx3Var.f371119d = aVar2.k(intValue);
                return 0;
            case 2:
                bx3Var.f371120e = aVar2.k(intValue);
                return 0;
            case 3:
                bx3Var.f371121f = aVar2.i(intValue);
                return 0;
            case 4:
                bx3Var.f371122g = aVar2.g(intValue);
                return 0;
            case 5:
                bx3Var.f371123h = aVar2.k(intValue);
                return 0;
            case 6:
                bx3Var.f371124i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n75 n75Var3 = new r45.n75();
                    if (bArr != null && bArr.length > 0) {
                        n75Var3.parseFrom(bArr);
                    }
                    bx3Var.f371125m = n75Var3;
                }
                return 0;
            case 8:
                bx3Var.f371126n = aVar2.g(intValue);
                return 0;
            case 9:
                bx3Var.f371127o = aVar2.g(intValue);
                return 0;
            case 10:
                bx3Var.f371128p = aVar2.g(intValue);
                return 0;
            case 11:
                bx3Var.f371129q = aVar2.g(intValue);
                return 0;
            case 12:
                bx3Var.f371130r = aVar2.k(intValue);
                return 0;
            case 13:
                bx3Var.f371131s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
