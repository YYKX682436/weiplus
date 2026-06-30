package r45;

/* loaded from: classes9.dex */
public class k6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378415e;

    /* renamed from: f, reason: collision with root package name */
    public int f378416f;

    /* renamed from: g, reason: collision with root package name */
    public int f378417g;

    /* renamed from: h, reason: collision with root package name */
    public int f378418h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378419i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uq0 f378420m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378421n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378422o;

    /* renamed from: p, reason: collision with root package name */
    public int f378423p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f378424q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k6)) {
            return false;
        }
        r45.k6 k6Var = (r45.k6) fVar;
        return n51.f.a(this.f378414d, k6Var.f378414d) && n51.f.a(this.f378415e, k6Var.f378415e) && n51.f.a(java.lang.Integer.valueOf(this.f378416f), java.lang.Integer.valueOf(k6Var.f378416f)) && n51.f.a(java.lang.Integer.valueOf(this.f378417g), java.lang.Integer.valueOf(k6Var.f378417g)) && n51.f.a(java.lang.Integer.valueOf(this.f378418h), java.lang.Integer.valueOf(k6Var.f378418h)) && n51.f.a(this.f378419i, k6Var.f378419i) && n51.f.a(this.f378420m, k6Var.f378420m) && n51.f.a(this.f378421n, k6Var.f378421n) && n51.f.a(this.f378422o, k6Var.f378422o) && n51.f.a(java.lang.Integer.valueOf(this.f378423p), java.lang.Integer.valueOf(k6Var.f378423p)) && n51.f.a(this.f378424q, k6Var.f378424q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378414d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378415e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f378416f);
            fVar.e(4, this.f378417g);
            fVar.e(5, this.f378418h);
            java.lang.String str3 = this.f378419i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.uq0 uq0Var = this.f378420m;
            if (uq0Var != null) {
                fVar.i(7, uq0Var.computeSize());
                this.f378420m.writeFields(fVar);
            }
            java.lang.String str4 = this.f378421n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f378422o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f378423p);
            fVar.g(11, 8, this.f378424q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378414d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f378415e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f378416f) + b36.f.e(4, this.f378417g) + b36.f.e(5, this.f378418h);
            java.lang.String str8 = this.f378419i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            r45.uq0 uq0Var2 = this.f378420m;
            if (uq0Var2 != null) {
                e17 += b36.f.i(7, uq0Var2.computeSize());
            }
            java.lang.String str9 = this.f378421n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f378422o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f378423p) + b36.f.g(11, 8, this.f378424q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378424q.clear();
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
        r45.k6 k6Var = (r45.k6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k6Var.f378414d = aVar2.k(intValue);
                return 0;
            case 2:
                k6Var.f378415e = aVar2.k(intValue);
                return 0;
            case 3:
                k6Var.f378416f = aVar2.g(intValue);
                return 0;
            case 4:
                k6Var.f378417g = aVar2.g(intValue);
                return 0;
            case 5:
                k6Var.f378418h = aVar2.g(intValue);
                return 0;
            case 6:
                k6Var.f378419i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.uq0 uq0Var3 = new r45.uq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        uq0Var3.parseFrom(bArr2);
                    }
                    k6Var.f378420m = uq0Var3;
                }
                return 0;
            case 8:
                k6Var.f378421n = aVar2.k(intValue);
                return 0;
            case 9:
                k6Var.f378422o = aVar2.k(intValue);
                return 0;
            case 10:
                k6Var.f378423p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.ln0 ln0Var = new r45.ln0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ln0Var.parseFrom(bArr3);
                    }
                    k6Var.f378424q.add(ln0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
