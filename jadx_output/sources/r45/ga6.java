package r45;

/* loaded from: classes4.dex */
public class ga6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375045d;

    /* renamed from: e, reason: collision with root package name */
    public int f375046e;

    /* renamed from: f, reason: collision with root package name */
    public int f375047f;

    /* renamed from: g, reason: collision with root package name */
    public int f375048g;

    /* renamed from: h, reason: collision with root package name */
    public r45.hb6 f375049h;

    /* renamed from: i, reason: collision with root package name */
    public int f375050i;

    /* renamed from: m, reason: collision with root package name */
    public int f375051m;

    /* renamed from: n, reason: collision with root package name */
    public int f375052n;

    /* renamed from: o, reason: collision with root package name */
    public int f375053o;

    /* renamed from: p, reason: collision with root package name */
    public int f375054p;

    /* renamed from: q, reason: collision with root package name */
    public int f375055q;

    /* renamed from: r, reason: collision with root package name */
    public int f375056r;

    /* renamed from: s, reason: collision with root package name */
    public int f375057s;

    /* renamed from: t, reason: collision with root package name */
    public r45.gd6 f375058t;

    /* renamed from: u, reason: collision with root package name */
    public int f375059u;

    /* renamed from: v, reason: collision with root package name */
    public int f375060v;

    /* renamed from: w, reason: collision with root package name */
    public int f375061w;

    /* renamed from: x, reason: collision with root package name */
    public r45.gx3 f375062x;

    /* renamed from: y, reason: collision with root package name */
    public int f375063y;

    /* renamed from: z, reason: collision with root package name */
    public int f375064z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ga6)) {
            return false;
        }
        r45.ga6 ga6Var = (r45.ga6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375045d), java.lang.Integer.valueOf(ga6Var.f375045d)) && n51.f.a(java.lang.Integer.valueOf(this.f375046e), java.lang.Integer.valueOf(ga6Var.f375046e)) && n51.f.a(java.lang.Integer.valueOf(this.f375047f), java.lang.Integer.valueOf(ga6Var.f375047f)) && n51.f.a(java.lang.Integer.valueOf(this.f375048g), java.lang.Integer.valueOf(ga6Var.f375048g)) && n51.f.a(this.f375049h, ga6Var.f375049h) && n51.f.a(java.lang.Integer.valueOf(this.f375050i), java.lang.Integer.valueOf(ga6Var.f375050i)) && n51.f.a(java.lang.Integer.valueOf(this.f375051m), java.lang.Integer.valueOf(ga6Var.f375051m)) && n51.f.a(java.lang.Integer.valueOf(this.f375052n), java.lang.Integer.valueOf(ga6Var.f375052n)) && n51.f.a(java.lang.Integer.valueOf(this.f375053o), java.lang.Integer.valueOf(ga6Var.f375053o)) && n51.f.a(java.lang.Integer.valueOf(this.f375054p), java.lang.Integer.valueOf(ga6Var.f375054p)) && n51.f.a(java.lang.Integer.valueOf(this.f375055q), java.lang.Integer.valueOf(ga6Var.f375055q)) && n51.f.a(java.lang.Integer.valueOf(this.f375056r), java.lang.Integer.valueOf(ga6Var.f375056r)) && n51.f.a(java.lang.Integer.valueOf(this.f375057s), java.lang.Integer.valueOf(ga6Var.f375057s)) && n51.f.a(this.f375058t, ga6Var.f375058t) && n51.f.a(java.lang.Integer.valueOf(this.f375059u), java.lang.Integer.valueOf(ga6Var.f375059u)) && n51.f.a(java.lang.Integer.valueOf(this.f375060v), java.lang.Integer.valueOf(ga6Var.f375060v)) && n51.f.a(java.lang.Integer.valueOf(this.f375061w), java.lang.Integer.valueOf(ga6Var.f375061w)) && n51.f.a(this.f375062x, ga6Var.f375062x) && n51.f.a(java.lang.Integer.valueOf(this.f375063y), java.lang.Integer.valueOf(ga6Var.f375063y)) && n51.f.a(java.lang.Integer.valueOf(this.f375064z), java.lang.Integer.valueOf(ga6Var.f375064z));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375045d);
            fVar.e(2, this.f375046e);
            fVar.e(4, this.f375047f);
            fVar.e(5, this.f375048g);
            r45.hb6 hb6Var = this.f375049h;
            if (hb6Var != null) {
                fVar.i(6, hb6Var.computeSize());
                this.f375049h.writeFields(fVar);
            }
            fVar.e(8, this.f375050i);
            fVar.e(9, this.f375051m);
            fVar.e(10, this.f375052n);
            fVar.e(11, this.f375053o);
            fVar.e(13, this.f375054p);
            fVar.e(14, this.f375055q);
            fVar.e(15, this.f375056r);
            fVar.e(16, this.f375057s);
            r45.gd6 gd6Var = this.f375058t;
            if (gd6Var != null) {
                fVar.i(17, gd6Var.computeSize());
                this.f375058t.writeFields(fVar);
            }
            fVar.e(18, this.f375059u);
            fVar.e(19, this.f375060v);
            fVar.e(20, this.f375061w);
            r45.gx3 gx3Var = this.f375062x;
            if (gx3Var != null) {
                fVar.i(21, gx3Var.computeSize());
                this.f375062x.writeFields(fVar);
            }
            fVar.e(22, this.f375063y);
            fVar.e(23, this.f375064z);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375045d) + 0 + b36.f.e(2, this.f375046e) + b36.f.e(4, this.f375047f) + b36.f.e(5, this.f375048g);
            r45.hb6 hb6Var2 = this.f375049h;
            if (hb6Var2 != null) {
                e17 += b36.f.i(6, hb6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f375050i) + b36.f.e(9, this.f375051m) + b36.f.e(10, this.f375052n) + b36.f.e(11, this.f375053o) + b36.f.e(13, this.f375054p) + b36.f.e(14, this.f375055q) + b36.f.e(15, this.f375056r) + b36.f.e(16, this.f375057s);
            r45.gd6 gd6Var2 = this.f375058t;
            if (gd6Var2 != null) {
                e18 += b36.f.i(17, gd6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(18, this.f375059u) + b36.f.e(19, this.f375060v) + b36.f.e(20, this.f375061w);
            r45.gx3 gx3Var2 = this.f375062x;
            if (gx3Var2 != null) {
                e19 += b36.f.i(21, gx3Var2.computeSize());
            }
            return e19 + b36.f.e(22, this.f375063y) + b36.f.e(23, this.f375064z);
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
        r45.ga6 ga6Var = (r45.ga6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ga6Var.f375045d = aVar2.g(intValue);
                return 0;
            case 2:
                ga6Var.f375046e = aVar2.g(intValue);
                return 0;
            case 3:
            case 7:
            case 12:
            default:
                return -1;
            case 4:
                ga6Var.f375047f = aVar2.g(intValue);
                return 0;
            case 5:
                ga6Var.f375048g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.hb6 hb6Var3 = new r45.hb6();
                    if (bArr != null && bArr.length > 0) {
                        hb6Var3.parseFrom(bArr);
                    }
                    ga6Var.f375049h = hb6Var3;
                }
                return 0;
            case 8:
                ga6Var.f375050i = aVar2.g(intValue);
                return 0;
            case 9:
                ga6Var.f375051m = aVar2.g(intValue);
                return 0;
            case 10:
                ga6Var.f375052n = aVar2.g(intValue);
                return 0;
            case 11:
                ga6Var.f375053o = aVar2.g(intValue);
                return 0;
            case 13:
                ga6Var.f375054p = aVar2.g(intValue);
                return 0;
            case 14:
                ga6Var.f375055q = aVar2.g(intValue);
                return 0;
            case 15:
                ga6Var.f375056r = aVar2.g(intValue);
                return 0;
            case 16:
                ga6Var.f375057s = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.gd6 gd6Var3 = new r45.gd6();
                    if (bArr2 != null && bArr2.length > 0) {
                        gd6Var3.parseFrom(bArr2);
                    }
                    ga6Var.f375058t = gd6Var3;
                }
                return 0;
            case 18:
                ga6Var.f375059u = aVar2.g(intValue);
                return 0;
            case 19:
                ga6Var.f375060v = aVar2.g(intValue);
                return 0;
            case 20:
                ga6Var.f375061w = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.gx3 gx3Var3 = new r45.gx3();
                    if (bArr3 != null && bArr3.length > 0) {
                        gx3Var3.parseFrom(bArr3);
                    }
                    ga6Var.f375062x = gx3Var3;
                }
                return 0;
            case 22:
                ga6Var.f375063y = aVar2.g(intValue);
                return 0;
            case 23:
                ga6Var.f375064z = aVar2.g(intValue);
                return 0;
        }
    }
}
