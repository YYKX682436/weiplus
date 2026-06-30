package r45;

/* loaded from: classes4.dex */
public class if6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376997f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376999h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377000i;

    /* renamed from: m, reason: collision with root package name */
    public int f377001m;

    /* renamed from: n, reason: collision with root package name */
    public int f377002n;

    /* renamed from: o, reason: collision with root package name */
    public int f377003o;

    /* renamed from: p, reason: collision with root package name */
    public int f377004p;

    /* renamed from: q, reason: collision with root package name */
    public int f377005q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f377006r;

    /* renamed from: s, reason: collision with root package name */
    public r45.df6 f377007s;

    /* renamed from: t, reason: collision with root package name */
    public int f377008t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.if6)) {
            return false;
        }
        r45.if6 if6Var = (r45.if6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376995d), java.lang.Long.valueOf(if6Var.f376995d)) && n51.f.a(this.f376996e, if6Var.f376996e) && n51.f.a(this.f376997f, if6Var.f376997f) && n51.f.a(this.f376998g, if6Var.f376998g) && n51.f.a(this.f376999h, if6Var.f376999h) && n51.f.a(this.f377000i, if6Var.f377000i) && n51.f.a(java.lang.Integer.valueOf(this.f377001m), java.lang.Integer.valueOf(if6Var.f377001m)) && n51.f.a(java.lang.Integer.valueOf(this.f377002n), java.lang.Integer.valueOf(if6Var.f377002n)) && n51.f.a(java.lang.Integer.valueOf(this.f377003o), java.lang.Integer.valueOf(if6Var.f377003o)) && n51.f.a(java.lang.Integer.valueOf(this.f377004p), java.lang.Integer.valueOf(if6Var.f377004p)) && n51.f.a(java.lang.Integer.valueOf(this.f377005q), java.lang.Integer.valueOf(if6Var.f377005q)) && n51.f.a(this.f377006r, if6Var.f377006r) && n51.f.a(this.f377007s, if6Var.f377007s) && n51.f.a(java.lang.Integer.valueOf(this.f377008t), java.lang.Integer.valueOf(if6Var.f377008t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376995d);
            java.lang.String str = this.f376996e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376997f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376998g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f376999h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f377000i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f377001m);
            fVar.e(8, this.f377002n);
            fVar.e(9, this.f377003o);
            fVar.e(10, this.f377004p);
            fVar.e(11, this.f377005q);
            java.lang.String str6 = this.f377006r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.df6 df6Var = this.f377007s;
            if (df6Var != null) {
                fVar.i(13, df6Var.computeSize());
                this.f377007s.writeFields(fVar);
            }
            fVar.e(14, this.f377008t);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f376995d) + 0;
            java.lang.String str7 = this.f376996e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f376997f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f376998g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f376999h;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f377000i;
            if (str11 != null) {
                h17 += b36.f.j(6, str11);
            }
            int e17 = h17 + b36.f.e(7, this.f377001m) + b36.f.e(8, this.f377002n) + b36.f.e(9, this.f377003o) + b36.f.e(10, this.f377004p) + b36.f.e(11, this.f377005q);
            java.lang.String str12 = this.f377006r;
            if (str12 != null) {
                e17 += b36.f.j(12, str12);
            }
            r45.df6 df6Var2 = this.f377007s;
            if (df6Var2 != null) {
                e17 += b36.f.i(13, df6Var2.computeSize());
            }
            return e17 + b36.f.e(14, this.f377008t);
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
        r45.if6 if6Var = (r45.if6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                if6Var.f376995d = aVar2.i(intValue);
                return 0;
            case 2:
                if6Var.f376996e = aVar2.k(intValue);
                return 0;
            case 3:
                if6Var.f376997f = aVar2.k(intValue);
                return 0;
            case 4:
                if6Var.f376998g = aVar2.k(intValue);
                return 0;
            case 5:
                if6Var.f376999h = aVar2.k(intValue);
                return 0;
            case 6:
                if6Var.f377000i = aVar2.k(intValue);
                return 0;
            case 7:
                if6Var.f377001m = aVar2.g(intValue);
                return 0;
            case 8:
                if6Var.f377002n = aVar2.g(intValue);
                return 0;
            case 9:
                if6Var.f377003o = aVar2.g(intValue);
                return 0;
            case 10:
                if6Var.f377004p = aVar2.g(intValue);
                return 0;
            case 11:
                if6Var.f377005q = aVar2.g(intValue);
                return 0;
            case 12:
                if6Var.f377006r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.df6 df6Var3 = new r45.df6();
                    if (bArr != null && bArr.length > 0) {
                        df6Var3.parseFrom(bArr);
                    }
                    if6Var.f377007s = df6Var3;
                }
                return 0;
            case 14:
                if6Var.f377008t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
