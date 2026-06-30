package r45;

/* loaded from: classes7.dex */
public class i9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376822d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376823e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376825g;

    /* renamed from: h, reason: collision with root package name */
    public int f376826h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f376827i;

    /* renamed from: m, reason: collision with root package name */
    public int f376828m;

    /* renamed from: n, reason: collision with root package name */
    public int f376829n;

    /* renamed from: o, reason: collision with root package name */
    public int f376830o;

    /* renamed from: p, reason: collision with root package name */
    public int f376831p;

    /* renamed from: q, reason: collision with root package name */
    public int f376832q;

    /* renamed from: f, reason: collision with root package name */
    public int f376824f = 600;

    /* renamed from: r, reason: collision with root package name */
    public int f376833r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f376834s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f376835t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f376836u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i9)) {
            return false;
        }
        r45.i9 i9Var = (r45.i9) fVar;
        return n51.f.a(this.f376822d, i9Var.f376822d) && n51.f.a(this.f376823e, i9Var.f376823e) && n51.f.a(java.lang.Integer.valueOf(this.f376824f), java.lang.Integer.valueOf(i9Var.f376824f)) && n51.f.a(this.f376825g, i9Var.f376825g) && n51.f.a(java.lang.Integer.valueOf(this.f376826h), java.lang.Integer.valueOf(i9Var.f376826h)) && n51.f.a(java.lang.Boolean.valueOf(this.f376827i), java.lang.Boolean.valueOf(i9Var.f376827i)) && n51.f.a(java.lang.Integer.valueOf(this.f376828m), java.lang.Integer.valueOf(i9Var.f376828m)) && n51.f.a(java.lang.Integer.valueOf(this.f376829n), java.lang.Integer.valueOf(i9Var.f376829n)) && n51.f.a(java.lang.Integer.valueOf(this.f376830o), java.lang.Integer.valueOf(i9Var.f376830o)) && n51.f.a(java.lang.Integer.valueOf(this.f376831p), java.lang.Integer.valueOf(i9Var.f376831p)) && n51.f.a(java.lang.Integer.valueOf(this.f376832q), java.lang.Integer.valueOf(i9Var.f376832q)) && n51.f.a(java.lang.Integer.valueOf(this.f376833r), java.lang.Integer.valueOf(i9Var.f376833r)) && n51.f.a(java.lang.Boolean.valueOf(this.f376834s), java.lang.Boolean.valueOf(i9Var.f376834s)) && n51.f.a(this.f376835t, i9Var.f376835t) && n51.f.a(this.f376836u, i9Var.f376836u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376836u;
        java.util.LinkedList linkedList2 = this.f376835t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376822d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376823e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f376824f);
            java.lang.String str3 = this.f376825g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f376826h);
            fVar.a(6, this.f376827i);
            fVar.e(7, this.f376828m);
            fVar.e(8, this.f376829n);
            fVar.e(9, this.f376830o);
            fVar.e(10, this.f376831p);
            fVar.e(11, this.f376832q);
            fVar.e(12, this.f376833r);
            fVar.a(13, this.f376834s);
            fVar.g(14, 8, linkedList2);
            fVar.g(16, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376822d;
            int j17 = str4 != null ? b36.f.j(1, str4) + 0 : 0;
            java.lang.String str5 = this.f376823e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f376824f);
            java.lang.String str6 = this.f376825g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f376826h) + b36.f.a(6, this.f376827i) + b36.f.e(7, this.f376828m) + b36.f.e(8, this.f376829n) + b36.f.e(9, this.f376830o) + b36.f.e(10, this.f376831p) + b36.f.e(11, this.f376832q) + b36.f.e(12, this.f376833r) + b36.f.a(13, this.f376834s) + b36.f.g(14, 8, linkedList2) + b36.f.g(16, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.i9 i9Var = (r45.i9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i9Var.f376822d = aVar2.k(intValue);
                return 0;
            case 2:
                i9Var.f376823e = aVar2.k(intValue);
                return 0;
            case 3:
                i9Var.f376824f = aVar2.g(intValue);
                return 0;
            case 4:
                i9Var.f376825g = aVar2.k(intValue);
                return 0;
            case 5:
                i9Var.f376826h = aVar2.g(intValue);
                return 0;
            case 6:
                i9Var.f376827i = aVar2.c(intValue);
                return 0;
            case 7:
                i9Var.f376828m = aVar2.g(intValue);
                return 0;
            case 8:
                i9Var.f376829n = aVar2.g(intValue);
                return 0;
            case 9:
                i9Var.f376830o = aVar2.g(intValue);
                return 0;
            case 10:
                i9Var.f376831p = aVar2.g(intValue);
                return 0;
            case 11:
                i9Var.f376832q = aVar2.g(intValue);
                return 0;
            case 12:
                i9Var.f376833r = aVar2.g(intValue);
                return 0;
            case 13:
                i9Var.f376834s = aVar2.c(intValue);
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vm6 vm6Var = new r45.vm6();
                    if (bArr2 != null && bArr2.length > 0) {
                        vm6Var.parseFrom(bArr2);
                    }
                    i9Var.f376835t.add(vm6Var);
                }
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                i9Var.f376836u.add(aVar2.k(intValue));
                return 0;
        }
    }
}
