package r45;

/* loaded from: classes11.dex */
public class cz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371938d;

    /* renamed from: e, reason: collision with root package name */
    public int f371939e;

    /* renamed from: f, reason: collision with root package name */
    public int f371940f;

    /* renamed from: g, reason: collision with root package name */
    public int f371941g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371942h;

    /* renamed from: i, reason: collision with root package name */
    public int f371943i;

    /* renamed from: m, reason: collision with root package name */
    public int f371944m;

    /* renamed from: n, reason: collision with root package name */
    public int f371945n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371946o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cz4)) {
            return false;
        }
        r45.cz4 cz4Var = (r45.cz4) fVar;
        return n51.f.a(this.f371938d, cz4Var.f371938d) && n51.f.a(java.lang.Integer.valueOf(this.f371939e), java.lang.Integer.valueOf(cz4Var.f371939e)) && n51.f.a(java.lang.Integer.valueOf(this.f371940f), java.lang.Integer.valueOf(cz4Var.f371940f)) && n51.f.a(java.lang.Integer.valueOf(this.f371941g), java.lang.Integer.valueOf(cz4Var.f371941g)) && n51.f.a(this.f371942h, cz4Var.f371942h) && n51.f.a(java.lang.Integer.valueOf(this.f371943i), java.lang.Integer.valueOf(cz4Var.f371943i)) && n51.f.a(java.lang.Integer.valueOf(this.f371944m), java.lang.Integer.valueOf(cz4Var.f371944m)) && n51.f.a(java.lang.Integer.valueOf(this.f371945n), java.lang.Integer.valueOf(cz4Var.f371945n)) && n51.f.a(this.f371946o, cz4Var.f371946o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371938d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371939e);
            fVar.e(3, this.f371940f);
            fVar.e(4, this.f371941g);
            java.lang.String str2 = this.f371942h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f371943i);
            fVar.e(7, this.f371944m);
            fVar.e(8, this.f371945n);
            java.lang.String str3 = this.f371946o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f371938d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f371939e) + b36.f.e(3, this.f371940f) + b36.f.e(4, this.f371941g);
            java.lang.String str5 = this.f371942h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            int e17 = j17 + b36.f.e(6, this.f371943i) + b36.f.e(7, this.f371944m) + b36.f.e(8, this.f371945n);
            java.lang.String str6 = this.f371946o;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.cz4 cz4Var = (r45.cz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cz4Var.f371938d = aVar2.k(intValue);
                return 0;
            case 2:
                cz4Var.f371939e = aVar2.g(intValue);
                return 0;
            case 3:
                cz4Var.f371940f = aVar2.g(intValue);
                return 0;
            case 4:
                cz4Var.f371941g = aVar2.g(intValue);
                return 0;
            case 5:
                cz4Var.f371942h = aVar2.k(intValue);
                return 0;
            case 6:
                cz4Var.f371943i = aVar2.g(intValue);
                return 0;
            case 7:
                cz4Var.f371944m = aVar2.g(intValue);
                return 0;
            case 8:
                cz4Var.f371945n = aVar2.g(intValue);
                return 0;
            case 9:
                cz4Var.f371946o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
