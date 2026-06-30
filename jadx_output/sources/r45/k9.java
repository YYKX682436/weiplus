package r45;

/* loaded from: classes9.dex */
public class k9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378498d;

    /* renamed from: e, reason: collision with root package name */
    public int f378499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378500f;

    /* renamed from: g, reason: collision with root package name */
    public int f378501g;

    /* renamed from: h, reason: collision with root package name */
    public int f378502h;

    /* renamed from: i, reason: collision with root package name */
    public int f378503i;

    /* renamed from: m, reason: collision with root package name */
    public int f378504m;

    /* renamed from: n, reason: collision with root package name */
    public int f378505n;

    /* renamed from: o, reason: collision with root package name */
    public int f378506o;

    /* renamed from: p, reason: collision with root package name */
    public int f378507p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378508q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k9)) {
            return false;
        }
        r45.k9 k9Var = (r45.k9) fVar;
        return n51.f.a(this.BaseRequest, k9Var.BaseRequest) && n51.f.a(this.f378498d, k9Var.f378498d) && n51.f.a(java.lang.Integer.valueOf(this.f378499e), java.lang.Integer.valueOf(k9Var.f378499e)) && n51.f.a(this.f378500f, k9Var.f378500f) && n51.f.a(java.lang.Integer.valueOf(this.f378501g), java.lang.Integer.valueOf(k9Var.f378501g)) && n51.f.a(java.lang.Integer.valueOf(this.f378502h), java.lang.Integer.valueOf(k9Var.f378502h)) && n51.f.a(java.lang.Integer.valueOf(this.f378503i), java.lang.Integer.valueOf(k9Var.f378503i)) && n51.f.a(java.lang.Integer.valueOf(this.f378504m), java.lang.Integer.valueOf(k9Var.f378504m)) && n51.f.a(java.lang.Integer.valueOf(this.f378505n), java.lang.Integer.valueOf(k9Var.f378505n)) && n51.f.a(java.lang.Integer.valueOf(this.f378506o), java.lang.Integer.valueOf(k9Var.f378506o)) && n51.f.a(java.lang.Integer.valueOf(this.f378507p), java.lang.Integer.valueOf(k9Var.f378507p)) && n51.f.a(this.f378508q, k9Var.f378508q);
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
            java.lang.String str = this.f378498d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(5, this.f378499e);
            java.lang.String str2 = this.f378500f;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f378501g);
            fVar.e(8, this.f378502h);
            fVar.e(9, this.f378503i);
            fVar.e(10, this.f378504m);
            fVar.e(11, this.f378505n);
            fVar.e(12, this.f378506o);
            fVar.e(13, this.f378507p);
            java.lang.String str3 = this.f378508q;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f378498d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(5, this.f378499e);
            java.lang.String str5 = this.f378500f;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f378501g) + b36.f.e(8, this.f378502h) + b36.f.e(9, this.f378503i) + b36.f.e(10, this.f378504m) + b36.f.e(11, this.f378505n) + b36.f.e(12, this.f378506o) + b36.f.e(13, this.f378507p);
            java.lang.String str6 = this.f378508q;
            return str6 != null ? e18 + b36.f.j(14, str6) : e18;
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
        r45.k9 k9Var = (r45.k9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                k9Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            k9Var.f378498d = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                k9Var.f378499e = aVar2.g(intValue);
                return 0;
            case 6:
                k9Var.f378500f = aVar2.k(intValue);
                return 0;
            case 7:
                k9Var.f378501g = aVar2.g(intValue);
                return 0;
            case 8:
                k9Var.f378502h = aVar2.g(intValue);
                return 0;
            case 9:
                k9Var.f378503i = aVar2.g(intValue);
                return 0;
            case 10:
                k9Var.f378504m = aVar2.g(intValue);
                return 0;
            case 11:
                k9Var.f378505n = aVar2.g(intValue);
                return 0;
            case 12:
                k9Var.f378506o = aVar2.g(intValue);
                return 0;
            case 13:
                k9Var.f378507p = aVar2.g(intValue);
                return 0;
            case 14:
                k9Var.f378508q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
