package r45;

/* loaded from: classes15.dex */
public class f83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374085d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374087f;

    /* renamed from: g, reason: collision with root package name */
    public int f374088g;

    /* renamed from: h, reason: collision with root package name */
    public int f374089h;

    /* renamed from: i, reason: collision with root package name */
    public int f374090i;

    /* renamed from: m, reason: collision with root package name */
    public int f374091m;

    /* renamed from: n, reason: collision with root package name */
    public long f374092n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f374093o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f374094p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374095q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f374096r;

    /* renamed from: s, reason: collision with root package name */
    public int f374097s;

    /* renamed from: t, reason: collision with root package name */
    public int f374098t;

    /* renamed from: u, reason: collision with root package name */
    public int f374099u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f83)) {
            return false;
        }
        r45.f83 f83Var = (r45.f83) fVar;
        return n51.f.a(this.f374085d, f83Var.f374085d) && n51.f.a(this.f374086e, f83Var.f374086e) && n51.f.a(this.f374087f, f83Var.f374087f) && n51.f.a(java.lang.Integer.valueOf(this.f374088g), java.lang.Integer.valueOf(f83Var.f374088g)) && n51.f.a(java.lang.Integer.valueOf(this.f374089h), java.lang.Integer.valueOf(f83Var.f374089h)) && n51.f.a(java.lang.Integer.valueOf(this.f374090i), java.lang.Integer.valueOf(f83Var.f374090i)) && n51.f.a(java.lang.Integer.valueOf(this.f374091m), java.lang.Integer.valueOf(f83Var.f374091m)) && n51.f.a(java.lang.Long.valueOf(this.f374092n), java.lang.Long.valueOf(f83Var.f374092n)) && n51.f.a(java.lang.Boolean.valueOf(this.f374093o), java.lang.Boolean.valueOf(f83Var.f374093o)) && n51.f.a(this.f374094p, f83Var.f374094p) && n51.f.a(this.f374095q, f83Var.f374095q) && n51.f.a(this.f374096r, f83Var.f374096r) && n51.f.a(java.lang.Integer.valueOf(this.f374097s), java.lang.Integer.valueOf(f83Var.f374097s)) && n51.f.a(java.lang.Integer.valueOf(this.f374098t), java.lang.Integer.valueOf(f83Var.f374098t)) && n51.f.a(java.lang.Integer.valueOf(this.f374099u), java.lang.Integer.valueOf(f83Var.f374099u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374094p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374085d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374086e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374087f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f374088g);
            fVar.e(5, this.f374089h);
            fVar.e(6, this.f374090i);
            fVar.e(7, this.f374091m);
            fVar.h(8, this.f374092n);
            fVar.a(9, this.f374093o);
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f374095q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f374096r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(13, this.f374097s);
            fVar.e(14, this.f374098t);
            fVar.e(15, this.f374099u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f374085d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f374086e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f374087f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f374088g) + b36.f.e(5, this.f374089h) + b36.f.e(6, this.f374090i) + b36.f.e(7, this.f374091m) + b36.f.h(8, this.f374092n) + b36.f.a(9, this.f374093o) + b36.f.g(10, 8, linkedList);
            java.lang.String str9 = this.f374095q;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f374096r;
            if (str10 != null) {
                e17 += b36.f.j(12, str10);
            }
            return e17 + b36.f.e(13, this.f374097s) + b36.f.e(14, this.f374098t) + b36.f.e(15, this.f374099u);
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
        r45.f83 f83Var = (r45.f83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f83Var.f374085d = aVar2.k(intValue);
                return 0;
            case 2:
                f83Var.f374086e = aVar2.k(intValue);
                return 0;
            case 3:
                f83Var.f374087f = aVar2.k(intValue);
                return 0;
            case 4:
                f83Var.f374088g = aVar2.g(intValue);
                return 0;
            case 5:
                f83Var.f374089h = aVar2.g(intValue);
                return 0;
            case 6:
                f83Var.f374090i = aVar2.g(intValue);
                return 0;
            case 7:
                f83Var.f374091m = aVar2.g(intValue);
                return 0;
            case 8:
                f83Var.f374092n = aVar2.i(intValue);
                return 0;
            case 9:
                f83Var.f374093o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.g83 g83Var = new r45.g83();
                    if (bArr2 != null && bArr2.length > 0) {
                        g83Var.parseFrom(bArr2);
                    }
                    f83Var.f374094p.add(g83Var);
                }
                return 0;
            case 11:
                f83Var.f374095q = aVar2.k(intValue);
                return 0;
            case 12:
                f83Var.f374096r = aVar2.k(intValue);
                return 0;
            case 13:
                f83Var.f374097s = aVar2.g(intValue);
                return 0;
            case 14:
                f83Var.f374098t = aVar2.g(intValue);
                return 0;
            case 15:
                f83Var.f374099u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
