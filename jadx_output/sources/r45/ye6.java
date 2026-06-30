package r45;

/* loaded from: classes2.dex */
public class ye6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391017d;

    /* renamed from: e, reason: collision with root package name */
    public int f391018e;

    /* renamed from: f, reason: collision with root package name */
    public long f391019f;

    /* renamed from: g, reason: collision with root package name */
    public int f391020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391021h;

    /* renamed from: i, reason: collision with root package name */
    public int f391022i;

    /* renamed from: m, reason: collision with root package name */
    public int f391023m;

    /* renamed from: n, reason: collision with root package name */
    public r45.we6 f391024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391025o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f391026p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f391027q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ye6)) {
            return false;
        }
        r45.ye6 ye6Var = (r45.ye6) fVar;
        return n51.f.a(this.f391017d, ye6Var.f391017d) && n51.f.a(java.lang.Integer.valueOf(this.f391018e), java.lang.Integer.valueOf(ye6Var.f391018e)) && n51.f.a(java.lang.Long.valueOf(this.f391019f), java.lang.Long.valueOf(ye6Var.f391019f)) && n51.f.a(java.lang.Integer.valueOf(this.f391020g), java.lang.Integer.valueOf(ye6Var.f391020g)) && n51.f.a(this.f391021h, ye6Var.f391021h) && n51.f.a(java.lang.Integer.valueOf(this.f391022i), java.lang.Integer.valueOf(ye6Var.f391022i)) && n51.f.a(java.lang.Integer.valueOf(this.f391023m), java.lang.Integer.valueOf(ye6Var.f391023m)) && n51.f.a(this.f391024n, ye6Var.f391024n) && n51.f.a(this.f391025o, ye6Var.f391025o) && n51.f.a(java.lang.Boolean.valueOf(this.f391026p), java.lang.Boolean.valueOf(ye6Var.f391026p)) && n51.f.a(this.f391027q, ye6Var.f391027q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391027q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391017d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391018e);
            fVar.h(3, this.f391019f);
            fVar.e(4, this.f391020g);
            java.lang.String str2 = this.f391021h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f391022i);
            fVar.e(7, this.f391023m);
            r45.we6 we6Var = this.f391024n;
            if (we6Var != null) {
                fVar.i(8, we6Var.computeSize());
                this.f391024n.writeFields(fVar);
            }
            java.lang.String str3 = this.f391025o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f391026p);
            fVar.g(11, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f391017d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f391018e) + b36.f.h(3, this.f391019f) + b36.f.e(4, this.f391020g);
            java.lang.String str5 = this.f391021h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            int e17 = j17 + b36.f.e(6, this.f391022i) + b36.f.e(7, this.f391023m);
            r45.we6 we6Var2 = this.f391024n;
            if (we6Var2 != null) {
                e17 += b36.f.i(8, we6Var2.computeSize());
            }
            java.lang.String str6 = this.f391025o;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.a(10, this.f391026p) + b36.f.g(11, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.ye6 ye6Var = (r45.ye6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ye6Var.f391017d = aVar2.k(intValue);
                return 0;
            case 2:
                ye6Var.f391018e = aVar2.g(intValue);
                return 0;
            case 3:
                ye6Var.f391019f = aVar2.i(intValue);
                return 0;
            case 4:
                ye6Var.f391020g = aVar2.g(intValue);
                return 0;
            case 5:
                ye6Var.f391021h = aVar2.k(intValue);
                return 0;
            case 6:
                ye6Var.f391022i = aVar2.g(intValue);
                return 0;
            case 7:
                ye6Var.f391023m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.we6 we6Var3 = new r45.we6();
                    if (bArr2 != null && bArr2.length > 0) {
                        we6Var3.parseFrom(bArr2);
                    }
                    ye6Var.f391024n = we6Var3;
                }
                return 0;
            case 9:
                ye6Var.f391025o = aVar2.k(intValue);
                return 0;
            case 10:
                ye6Var.f391026p = aVar2.c(intValue);
                return 0;
            case 11:
                ye6Var.f391027q.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
