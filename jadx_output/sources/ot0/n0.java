package ot0;

/* loaded from: classes8.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f348596d;

    /* renamed from: e, reason: collision with root package name */
    public long f348597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348598f;

    /* renamed from: g, reason: collision with root package name */
    public int f348599g;

    /* renamed from: h, reason: collision with root package name */
    public int f348600h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348601i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348602m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348603n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f348604o;

    /* renamed from: p, reason: collision with root package name */
    public int f348605p;

    /* renamed from: q, reason: collision with root package name */
    public ot0.s0 f348606q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f348607r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.n0)) {
            return false;
        }
        ot0.n0 n0Var = (ot0.n0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f348596d), java.lang.Long.valueOf(n0Var.f348596d)) && n51.f.a(java.lang.Long.valueOf(this.f348597e), java.lang.Long.valueOf(n0Var.f348597e)) && n51.f.a(this.f348598f, n0Var.f348598f) && n51.f.a(java.lang.Integer.valueOf(this.f348599g), java.lang.Integer.valueOf(n0Var.f348599g)) && n51.f.a(java.lang.Integer.valueOf(this.f348600h), java.lang.Integer.valueOf(n0Var.f348600h)) && n51.f.a(this.f348601i, n0Var.f348601i) && n51.f.a(this.f348602m, n0Var.f348602m) && n51.f.a(this.f348603n, n0Var.f348603n) && n51.f.a(this.f348604o, n0Var.f348604o) && n51.f.a(java.lang.Integer.valueOf(this.f348605p), java.lang.Integer.valueOf(n0Var.f348605p)) && n51.f.a(this.f348606q, n0Var.f348606q) && n51.f.a(this.f348607r, n0Var.f348607r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f348607r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f348596d);
            fVar.h(2, this.f348597e);
            java.lang.String str = this.f348598f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f348599g);
            fVar.e(5, this.f348600h);
            java.lang.String str2 = this.f348601i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f348602m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f348603n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f348604o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f348605p);
            ot0.s0 s0Var = this.f348606q;
            if (s0Var != null) {
                fVar.i(11, s0Var.computeSize());
                this.f348606q.writeFields(fVar);
            }
            fVar.g(12, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f348596d) + 0 + b36.f.h(2, this.f348597e);
            java.lang.String str6 = this.f348598f;
            if (str6 != null) {
                h17 += b36.f.j(3, str6);
            }
            int e17 = h17 + b36.f.e(4, this.f348599g) + b36.f.e(5, this.f348600h);
            java.lang.String str7 = this.f348601i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f348602m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f348603n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f348604o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f348605p);
            ot0.s0 s0Var2 = this.f348606q;
            if (s0Var2 != null) {
                e18 += b36.f.i(11, s0Var2.computeSize());
            }
            return e18 + b36.f.g(12, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ot0.n0 n0Var = (ot0.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n0Var.f348596d = aVar2.i(intValue);
                return 0;
            case 2:
                n0Var.f348597e = aVar2.i(intValue);
                return 0;
            case 3:
                n0Var.f348598f = aVar2.k(intValue);
                return 0;
            case 4:
                n0Var.f348599g = aVar2.g(intValue);
                return 0;
            case 5:
                n0Var.f348600h = aVar2.g(intValue);
                return 0;
            case 6:
                n0Var.f348601i = aVar2.k(intValue);
                return 0;
            case 7:
                n0Var.f348602m = aVar2.k(intValue);
                return 0;
            case 8:
                n0Var.f348603n = aVar2.k(intValue);
                return 0;
            case 9:
                n0Var.f348604o = aVar2.k(intValue);
                return 0;
            case 10:
                n0Var.f348605p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ot0.s0 s0Var3 = new ot0.s0();
                    if (bArr2 != null && bArr2.length > 0) {
                        s0Var3.parseFrom(bArr2);
                    }
                    n0Var.f348606q = s0Var3;
                }
                return 0;
            case 12:
                n0Var.f348607r.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
