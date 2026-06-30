package r45;

/* loaded from: classes4.dex */
public class mm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f380645d;

    /* renamed from: e, reason: collision with root package name */
    public int f380646e;

    /* renamed from: f, reason: collision with root package name */
    public int f380647f;

    /* renamed from: g, reason: collision with root package name */
    public int f380648g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380649h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380650i;

    /* renamed from: m, reason: collision with root package name */
    public int f380651m;

    /* renamed from: n, reason: collision with root package name */
    public int f380652n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380653o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380654p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380655q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380656r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f380657s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm0)) {
            return false;
        }
        r45.mm0 mm0Var = (r45.mm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f380645d), java.lang.Boolean.valueOf(mm0Var.f380645d)) && n51.f.a(java.lang.Integer.valueOf(this.f380646e), java.lang.Integer.valueOf(mm0Var.f380646e)) && n51.f.a(java.lang.Integer.valueOf(this.f380647f), java.lang.Integer.valueOf(mm0Var.f380647f)) && n51.f.a(java.lang.Integer.valueOf(this.f380648g), java.lang.Integer.valueOf(mm0Var.f380648g)) && n51.f.a(java.lang.Boolean.valueOf(this.f380649h), java.lang.Boolean.valueOf(mm0Var.f380649h)) && n51.f.a(this.f380650i, mm0Var.f380650i) && n51.f.a(java.lang.Integer.valueOf(this.f380651m), java.lang.Integer.valueOf(mm0Var.f380651m)) && n51.f.a(java.lang.Integer.valueOf(this.f380652n), java.lang.Integer.valueOf(mm0Var.f380652n)) && n51.f.a(this.f380653o, mm0Var.f380653o) && n51.f.a(this.f380654p, mm0Var.f380654p) && n51.f.a(this.f380655q, mm0Var.f380655q) && n51.f.a(this.f380656r, mm0Var.f380656r) && n51.f.a(this.f380657s, mm0Var.f380657s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f380645d);
            fVar.e(2, this.f380646e);
            fVar.e(3, this.f380647f);
            fVar.e(4, this.f380648g);
            fVar.a(5, this.f380649h);
            java.lang.String str = this.f380650i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f380651m);
            fVar.e(8, this.f380652n);
            java.lang.String str2 = this.f380653o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f380654p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f380655q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f380656r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f380657s;
            if (str6 == null) {
                return 0;
            }
            fVar.j(13, str6);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f380645d) + 0 + b36.f.e(2, this.f380646e) + b36.f.e(3, this.f380647f) + b36.f.e(4, this.f380648g) + b36.f.a(5, this.f380649h);
            java.lang.String str7 = this.f380650i;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            int e17 = a17 + b36.f.e(7, this.f380651m) + b36.f.e(8, this.f380652n);
            java.lang.String str8 = this.f380653o;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f380654p;
            if (str9 != null) {
                e17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f380655q;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f380656r;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f380657s;
            return str12 != null ? e17 + b36.f.j(13, str12) : e17;
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
        r45.mm0 mm0Var = (r45.mm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mm0Var.f380645d = aVar2.c(intValue);
                return 0;
            case 2:
                mm0Var.f380646e = aVar2.g(intValue);
                return 0;
            case 3:
                mm0Var.f380647f = aVar2.g(intValue);
                return 0;
            case 4:
                mm0Var.f380648g = aVar2.g(intValue);
                return 0;
            case 5:
                mm0Var.f380649h = aVar2.c(intValue);
                return 0;
            case 6:
                mm0Var.f380650i = aVar2.k(intValue);
                return 0;
            case 7:
                mm0Var.f380651m = aVar2.g(intValue);
                return 0;
            case 8:
                mm0Var.f380652n = aVar2.g(intValue);
                return 0;
            case 9:
                mm0Var.f380653o = aVar2.k(intValue);
                return 0;
            case 10:
                mm0Var.f380654p = aVar2.k(intValue);
                return 0;
            case 11:
                mm0Var.f380655q = aVar2.k(intValue);
                return 0;
            case 12:
                mm0Var.f380656r = aVar2.k(intValue);
                return 0;
            case 13:
                mm0Var.f380657s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
