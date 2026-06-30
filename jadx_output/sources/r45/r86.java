package r45;

/* loaded from: classes4.dex */
public class r86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384638f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384639g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384640h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384641i;

    /* renamed from: m, reason: collision with root package name */
    public int f384642m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384643n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r86)) {
            return false;
        }
        r45.r86 r86Var = (r45.r86) fVar;
        return n51.f.a(this.f384636d, r86Var.f384636d) && n51.f.a(this.f384637e, r86Var.f384637e) && n51.f.a(this.f384638f, r86Var.f384638f) && n51.f.a(this.f384639g, r86Var.f384639g) && n51.f.a(this.f384640h, r86Var.f384640h) && n51.f.a(this.f384641i, r86Var.f384641i) && n51.f.a(java.lang.Integer.valueOf(this.f384642m), java.lang.Integer.valueOf(r86Var.f384642m)) && n51.f.a(this.f384643n, r86Var.f384643n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384636d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384637e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384638f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384639g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f384640h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f384641i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f384642m);
            java.lang.String str7 = this.f384643n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f384636d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f384637e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f384638f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f384639g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f384640h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f384641i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f384642m);
            java.lang.String str14 = this.f384643n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        r45.r86 r86Var = (r45.r86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r86Var.f384636d = aVar2.k(intValue);
                return 0;
            case 2:
                r86Var.f384637e = aVar2.k(intValue);
                return 0;
            case 3:
                r86Var.f384638f = aVar2.k(intValue);
                return 0;
            case 4:
                r86Var.f384639g = aVar2.k(intValue);
                return 0;
            case 5:
                r86Var.f384640h = aVar2.k(intValue);
                return 0;
            case 6:
                r86Var.f384641i = aVar2.k(intValue);
                return 0;
            case 7:
                r86Var.f384642m = aVar2.g(intValue);
                return 0;
            case 8:
                r86Var.f384643n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
