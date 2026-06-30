package r45;

/* loaded from: classes10.dex */
public class ho6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376333d;

    /* renamed from: e, reason: collision with root package name */
    public int f376334e;

    /* renamed from: f, reason: collision with root package name */
    public long f376335f;

    /* renamed from: g, reason: collision with root package name */
    public long f376336g;

    /* renamed from: h, reason: collision with root package name */
    public long f376337h;

    /* renamed from: i, reason: collision with root package name */
    public long f376338i;

    /* renamed from: m, reason: collision with root package name */
    public long f376339m;

    /* renamed from: n, reason: collision with root package name */
    public int f376340n;

    /* renamed from: o, reason: collision with root package name */
    public int f376341o;

    /* renamed from: p, reason: collision with root package name */
    public float f376342p;

    /* renamed from: q, reason: collision with root package name */
    public float f376343q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ka0 f376344r;

    /* renamed from: s, reason: collision with root package name */
    public int f376345s;

    /* renamed from: t, reason: collision with root package name */
    public r45.wp6 f376346t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ho6)) {
            return false;
        }
        r45.ho6 ho6Var = (r45.ho6) fVar;
        return n51.f.a(this.f376333d, ho6Var.f376333d) && n51.f.a(java.lang.Integer.valueOf(this.f376334e), java.lang.Integer.valueOf(ho6Var.f376334e)) && n51.f.a(java.lang.Long.valueOf(this.f376335f), java.lang.Long.valueOf(ho6Var.f376335f)) && n51.f.a(java.lang.Long.valueOf(this.f376336g), java.lang.Long.valueOf(ho6Var.f376336g)) && n51.f.a(java.lang.Long.valueOf(this.f376337h), java.lang.Long.valueOf(ho6Var.f376337h)) && n51.f.a(java.lang.Long.valueOf(this.f376338i), java.lang.Long.valueOf(ho6Var.f376338i)) && n51.f.a(java.lang.Long.valueOf(this.f376339m), java.lang.Long.valueOf(ho6Var.f376339m)) && n51.f.a(java.lang.Integer.valueOf(this.f376340n), java.lang.Integer.valueOf(ho6Var.f376340n)) && n51.f.a(java.lang.Integer.valueOf(this.f376341o), java.lang.Integer.valueOf(ho6Var.f376341o)) && n51.f.a(java.lang.Float.valueOf(this.f376342p), java.lang.Float.valueOf(ho6Var.f376342p)) && n51.f.a(java.lang.Float.valueOf(this.f376343q), java.lang.Float.valueOf(ho6Var.f376343q)) && n51.f.a(this.f376344r, ho6Var.f376344r) && n51.f.a(java.lang.Integer.valueOf(this.f376345s), java.lang.Integer.valueOf(ho6Var.f376345s)) && n51.f.a(this.f376346t, ho6Var.f376346t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376333d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376334e);
            fVar.h(3, this.f376335f);
            fVar.h(4, this.f376336g);
            fVar.h(5, this.f376337h);
            fVar.h(6, this.f376338i);
            fVar.h(7, this.f376339m);
            fVar.e(8, this.f376340n);
            fVar.e(9, this.f376341o);
            fVar.d(10, this.f376342p);
            fVar.d(11, this.f376343q);
            r45.ka0 ka0Var = this.f376344r;
            if (ka0Var != null) {
                fVar.i(12, ka0Var.computeSize());
                this.f376344r.writeFields(fVar);
            }
            fVar.e(13, this.f376345s);
            r45.wp6 wp6Var = this.f376346t;
            if (wp6Var != null) {
                fVar.i(14, wp6Var.computeSize());
                this.f376346t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376333d;
            int j17 = (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.e(2, this.f376334e) + b36.f.h(3, this.f376335f) + b36.f.h(4, this.f376336g) + b36.f.h(5, this.f376337h) + b36.f.h(6, this.f376338i) + b36.f.h(7, this.f376339m) + b36.f.e(8, this.f376340n) + b36.f.e(9, this.f376341o) + b36.f.d(10, this.f376342p) + b36.f.d(11, this.f376343q);
            r45.ka0 ka0Var2 = this.f376344r;
            if (ka0Var2 != null) {
                j17 += b36.f.i(12, ka0Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(13, this.f376345s);
            r45.wp6 wp6Var2 = this.f376346t;
            return wp6Var2 != null ? e17 + b36.f.i(14, wp6Var2.computeSize()) : e17;
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
        r45.ho6 ho6Var = (r45.ho6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ho6Var.f376333d = aVar2.k(intValue);
                return 0;
            case 2:
                ho6Var.f376334e = aVar2.g(intValue);
                return 0;
            case 3:
                ho6Var.f376335f = aVar2.i(intValue);
                return 0;
            case 4:
                ho6Var.f376336g = aVar2.i(intValue);
                return 0;
            case 5:
                ho6Var.f376337h = aVar2.i(intValue);
                return 0;
            case 6:
                ho6Var.f376338i = aVar2.i(intValue);
                return 0;
            case 7:
                ho6Var.f376339m = aVar2.i(intValue);
                return 0;
            case 8:
                ho6Var.f376340n = aVar2.g(intValue);
                return 0;
            case 9:
                ho6Var.f376341o = aVar2.g(intValue);
                return 0;
            case 10:
                ho6Var.f376342p = aVar2.f(intValue);
                return 0;
            case 11:
                ho6Var.f376343q = aVar2.f(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ka0 ka0Var3 = new r45.ka0();
                    if (bArr != null && bArr.length > 0) {
                        ka0Var3.parseFrom(bArr);
                    }
                    ho6Var.f376344r = ka0Var3;
                }
                return 0;
            case 13:
                ho6Var.f376345s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.wp6 wp6Var3 = new r45.wp6();
                    if (bArr2 != null && bArr2.length > 0) {
                        wp6Var3.parseFrom(bArr2);
                    }
                    ho6Var.f376346t = wp6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
