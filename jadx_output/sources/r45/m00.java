package r45;

/* loaded from: classes8.dex */
public class m00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380040d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380041e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380042f;

    /* renamed from: g, reason: collision with root package name */
    public int f380043g;

    /* renamed from: h, reason: collision with root package name */
    public int f380044h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380045i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380046m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m00)) {
            return false;
        }
        r45.m00 m00Var = (r45.m00) fVar;
        return n51.f.a(this.f380040d, m00Var.f380040d) && n51.f.a(this.f380041e, m00Var.f380041e) && n51.f.a(this.f380042f, m00Var.f380042f) && n51.f.a(java.lang.Integer.valueOf(this.f380043g), java.lang.Integer.valueOf(m00Var.f380043g)) && n51.f.a(java.lang.Integer.valueOf(this.f380044h), java.lang.Integer.valueOf(m00Var.f380044h)) && n51.f.a(this.f380045i, m00Var.f380045i) && n51.f.a(this.f380046m, m00Var.f380046m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380040d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380041e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380042f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f380043g);
            fVar.e(5, this.f380044h);
            java.lang.String str4 = this.f380045i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f380046m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f380040d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f380041e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f380042f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f380043g) + b36.f.e(5, this.f380044h);
            java.lang.String str9 = this.f380045i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f380046m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.m00 m00Var = (r45.m00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m00Var.f380040d = aVar2.k(intValue);
                return 0;
            case 2:
                m00Var.f380041e = aVar2.k(intValue);
                return 0;
            case 3:
                m00Var.f380042f = aVar2.k(intValue);
                return 0;
            case 4:
                m00Var.f380043g = aVar2.g(intValue);
                return 0;
            case 5:
                m00Var.f380044h = aVar2.g(intValue);
                return 0;
            case 6:
                m00Var.f380045i = aVar2.k(intValue);
                return 0;
            case 7:
                m00Var.f380046m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
