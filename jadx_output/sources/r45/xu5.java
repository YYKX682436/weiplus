package r45;

/* loaded from: classes12.dex */
public class xu5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390426d;

    /* renamed from: e, reason: collision with root package name */
    public int f390427e;

    /* renamed from: f, reason: collision with root package name */
    public int f390428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390429g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390430h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390431i;

    /* renamed from: m, reason: collision with root package name */
    public int f390432m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390433n;

    /* renamed from: o, reason: collision with root package name */
    public int f390434o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f390435p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xu5)) {
            return false;
        }
        r45.xu5 xu5Var = (r45.xu5) fVar;
        return n51.f.a(this.BaseRequest, xu5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f390426d), java.lang.Integer.valueOf(xu5Var.f390426d)) && n51.f.a(java.lang.Integer.valueOf(this.f390427e), java.lang.Integer.valueOf(xu5Var.f390427e)) && n51.f.a(java.lang.Integer.valueOf(this.f390428f), java.lang.Integer.valueOf(xu5Var.f390428f)) && n51.f.a(this.f390429g, xu5Var.f390429g) && n51.f.a(this.f390430h, xu5Var.f390430h) && n51.f.a(this.f390431i, xu5Var.f390431i) && n51.f.a(java.lang.Integer.valueOf(this.f390432m), java.lang.Integer.valueOf(xu5Var.f390432m)) && n51.f.a(this.f390433n, xu5Var.f390433n) && n51.f.a(java.lang.Integer.valueOf(this.f390434o), java.lang.Integer.valueOf(xu5Var.f390434o)) && n51.f.a(this.f390435p, xu5Var.f390435p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f390426d);
            fVar.e(3, this.f390427e);
            fVar.e(4, this.f390428f);
            java.lang.String str = this.f390429g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f390430h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f390431i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f390432m);
            java.lang.String str4 = this.f390433n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f390434o);
            java.lang.String str5 = this.f390435p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f390426d) + b36.f.e(3, this.f390427e) + b36.f.e(4, this.f390428f);
            java.lang.String str6 = this.f390429g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f390430h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f390431i;
            if (str8 != null) {
                i18 += b36.f.j(7, str8);
            }
            int e17 = i18 + b36.f.e(8, this.f390432m);
            java.lang.String str9 = this.f390433n;
            if (str9 != null) {
                e17 += b36.f.j(9, str9);
            }
            int e18 = e17 + b36.f.e(10, this.f390434o);
            java.lang.String str10 = this.f390435p;
            return str10 != null ? e18 + b36.f.j(11, str10) : e18;
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
        r45.xu5 xu5Var = (r45.xu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    xu5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                xu5Var.f390426d = aVar2.g(intValue);
                return 0;
            case 3:
                xu5Var.f390427e = aVar2.g(intValue);
                return 0;
            case 4:
                xu5Var.f390428f = aVar2.g(intValue);
                return 0;
            case 5:
                xu5Var.f390429g = aVar2.k(intValue);
                return 0;
            case 6:
                xu5Var.f390430h = aVar2.k(intValue);
                return 0;
            case 7:
                xu5Var.f390431i = aVar2.k(intValue);
                return 0;
            case 8:
                xu5Var.f390432m = aVar2.g(intValue);
                return 0;
            case 9:
                xu5Var.f390433n = aVar2.k(intValue);
                return 0;
            case 10:
                xu5Var.f390434o = aVar2.g(intValue);
                return 0;
            case 11:
                xu5Var.f390435p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
