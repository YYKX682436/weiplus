package r45;

/* loaded from: classes14.dex */
public class ue0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387280d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387281e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387282f;

    /* renamed from: g, reason: collision with root package name */
    public int f387283g;

    /* renamed from: h, reason: collision with root package name */
    public int f387284h;

    /* renamed from: i, reason: collision with root package name */
    public int f387285i;

    /* renamed from: m, reason: collision with root package name */
    public r45.c27 f387286m;

    /* renamed from: n, reason: collision with root package name */
    public int f387287n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f387288o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f387289p;

    /* renamed from: q, reason: collision with root package name */
    public int f387290q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue0)) {
            return false;
        }
        r45.ue0 ue0Var = (r45.ue0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387280d), java.lang.Integer.valueOf(ue0Var.f387280d)) && n51.f.a(this.f387281e, ue0Var.f387281e) && n51.f.a(this.f387282f, ue0Var.f387282f) && n51.f.a(java.lang.Integer.valueOf(this.f387283g), java.lang.Integer.valueOf(ue0Var.f387283g)) && n51.f.a(java.lang.Integer.valueOf(this.f387284h), java.lang.Integer.valueOf(ue0Var.f387284h)) && n51.f.a(java.lang.Integer.valueOf(this.f387285i), java.lang.Integer.valueOf(ue0Var.f387285i)) && n51.f.a(this.f387286m, ue0Var.f387286m) && n51.f.a(java.lang.Integer.valueOf(this.f387287n), java.lang.Integer.valueOf(ue0Var.f387287n)) && n51.f.a(this.f387288o, ue0Var.f387288o) && n51.f.a(java.lang.Integer.valueOf(this.f387289p), java.lang.Integer.valueOf(ue0Var.f387289p)) && n51.f.a(java.lang.Integer.valueOf(this.f387290q), java.lang.Integer.valueOf(ue0Var.f387290q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387280d);
            java.lang.String str = this.f387281e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387282f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387283g);
            fVar.e(5, this.f387284h);
            fVar.e(6, this.f387285i);
            r45.c27 c27Var = this.f387286m;
            if (c27Var != null) {
                fVar.i(7, c27Var.computeSize());
                this.f387286m.writeFields(fVar);
            }
            fVar.e(8, this.f387287n);
            fVar.g(9, 8, this.f387288o);
            fVar.e(10, this.f387289p);
            fVar.e(11, this.f387290q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387280d) + 0;
            java.lang.String str3 = this.f387281e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f387282f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f387283g) + b36.f.e(5, this.f387284h) + b36.f.e(6, this.f387285i);
            r45.c27 c27Var2 = this.f387286m;
            if (c27Var2 != null) {
                e18 += b36.f.i(7, c27Var2.computeSize());
            }
            return e18 + b36.f.e(8, this.f387287n) + b36.f.g(9, 8, this.f387288o) + b36.f.e(10, this.f387289p) + b36.f.e(11, this.f387290q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f387288o.clear();
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
        r45.ue0 ue0Var = (r45.ue0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ue0Var.f387280d = aVar2.g(intValue);
                return 0;
            case 2:
                ue0Var.f387281e = aVar2.k(intValue);
                return 0;
            case 3:
                ue0Var.f387282f = aVar2.k(intValue);
                return 0;
            case 4:
                ue0Var.f387283g = aVar2.g(intValue);
                return 0;
            case 5:
                ue0Var.f387284h = aVar2.g(intValue);
                return 0;
            case 6:
                ue0Var.f387285i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c27 c27Var3 = new r45.c27();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27Var3.parseFrom(bArr2);
                    }
                    ue0Var.f387286m = c27Var3;
                }
                return 0;
            case 8:
                ue0Var.f387287n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.f37 f37Var = new r45.f37();
                    if (bArr3 != null && bArr3.length > 0) {
                        f37Var.parseFrom(bArr3);
                    }
                    ue0Var.f387288o.add(f37Var);
                }
                return 0;
            case 10:
                ue0Var.f387289p = aVar2.g(intValue);
                return 0;
            case 11:
                ue0Var.f387290q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
