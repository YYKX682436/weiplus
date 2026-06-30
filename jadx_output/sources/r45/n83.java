package r45;

/* loaded from: classes7.dex */
public class n83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381153e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381154f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381155g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381156h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381157i;

    /* renamed from: m, reason: collision with root package name */
    public int f381158m;

    /* renamed from: n, reason: collision with root package name */
    public int f381159n;

    /* renamed from: o, reason: collision with root package name */
    public int f381160o;

    /* renamed from: p, reason: collision with root package name */
    public int f381161p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f381162q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n83)) {
            return false;
        }
        r45.n83 n83Var = (r45.n83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381152d), java.lang.Integer.valueOf(n83Var.f381152d)) && n51.f.a(this.f381153e, n83Var.f381153e) && n51.f.a(this.f381154f, n83Var.f381154f) && n51.f.a(this.f381155g, n83Var.f381155g) && n51.f.a(this.f381156h, n83Var.f381156h) && n51.f.a(this.f381157i, n83Var.f381157i) && n51.f.a(java.lang.Integer.valueOf(this.f381158m), java.lang.Integer.valueOf(n83Var.f381158m)) && n51.f.a(java.lang.Integer.valueOf(this.f381159n), java.lang.Integer.valueOf(n83Var.f381159n)) && n51.f.a(java.lang.Integer.valueOf(this.f381160o), java.lang.Integer.valueOf(n83Var.f381160o)) && n51.f.a(java.lang.Integer.valueOf(this.f381161p), java.lang.Integer.valueOf(n83Var.f381161p)) && n51.f.a(this.f381162q, n83Var.f381162q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381152d);
            java.lang.String str = this.f381153e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381154f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381155g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f381156h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f381157i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f381158m);
            fVar.e(9, this.f381159n);
            fVar.e(11, this.f381160o);
            fVar.e(12, this.f381161p);
            r45.cu5 cu5Var = this.f381162q;
            if (cu5Var != null) {
                fVar.i(13, cu5Var.computeSize());
                this.f381162q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381152d) + 0;
            java.lang.String str6 = this.f381153e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f381154f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f381155g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f381156h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f381157i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f381158m) + b36.f.e(9, this.f381159n) + b36.f.e(11, this.f381160o) + b36.f.e(12, this.f381161p);
            r45.cu5 cu5Var2 = this.f381162q;
            return cu5Var2 != null ? e18 + b36.f.i(13, cu5Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.n83 n83Var = (r45.n83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n83Var.f381152d = aVar2.g(intValue);
                return 0;
            case 2:
                n83Var.f381153e = aVar2.k(intValue);
                return 0;
            case 3:
                n83Var.f381154f = aVar2.k(intValue);
                return 0;
            case 4:
                n83Var.f381155g = aVar2.k(intValue);
                return 0;
            case 5:
                n83Var.f381156h = aVar2.k(intValue);
                return 0;
            case 6:
            case 10:
            default:
                return -1;
            case 7:
                n83Var.f381157i = aVar2.k(intValue);
                return 0;
            case 8:
                n83Var.f381158m = aVar2.g(intValue);
                return 0;
            case 9:
                n83Var.f381159n = aVar2.g(intValue);
                return 0;
            case 11:
                n83Var.f381160o = aVar2.g(intValue);
                return 0;
            case 12:
                n83Var.f381161p = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    n83Var.f381162q = cu5Var3;
                }
                return 0;
        }
    }
}
