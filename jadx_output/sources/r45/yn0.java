package r45;

/* loaded from: classes8.dex */
public class yn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391234e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391235f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391236g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391237h;

    /* renamed from: i, reason: collision with root package name */
    public long f391238i;

    /* renamed from: m, reason: collision with root package name */
    public double f391239m;

    /* renamed from: n, reason: collision with root package name */
    public double f391240n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391241o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yn0)) {
            return false;
        }
        r45.yn0 yn0Var = (r45.yn0) fVar;
        return n51.f.a(this.BaseRequest, yn0Var.BaseRequest) && n51.f.a(this.f391233d, yn0Var.f391233d) && n51.f.a(this.f391234e, yn0Var.f391234e) && n51.f.a(this.f391235f, yn0Var.f391235f) && n51.f.a(this.f391236g, yn0Var.f391236g) && n51.f.a(this.f391237h, yn0Var.f391237h) && n51.f.a(java.lang.Long.valueOf(this.f391238i), java.lang.Long.valueOf(yn0Var.f391238i)) && n51.f.a(java.lang.Double.valueOf(this.f391239m), java.lang.Double.valueOf(yn0Var.f391239m)) && n51.f.a(java.lang.Double.valueOf(this.f391240n), java.lang.Double.valueOf(yn0Var.f391240n)) && n51.f.a(this.f391241o, yn0Var.f391241o);
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
            java.lang.String str = this.f391233d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391234e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f391235f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f391236g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f391237h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.h(7, this.f391238i);
            fVar.c(8, this.f391239m);
            fVar.c(9, this.f391240n);
            com.tencent.mm.protobuf.g gVar = this.f391241o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f391233d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f391234e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f391235f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f391236g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f391237h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int h17 = i18 + b36.f.h(7, this.f391238i) + b36.f.c(8, this.f391239m) + b36.f.c(9, this.f391240n);
            com.tencent.mm.protobuf.g gVar2 = this.f391241o;
            return gVar2 != null ? h17 + b36.f.b(10, gVar2) : h17;
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
        r45.yn0 yn0Var = (r45.yn0) objArr[1];
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
                    yn0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yn0Var.f391233d = aVar2.k(intValue);
                return 0;
            case 3:
                yn0Var.f391234e = aVar2.k(intValue);
                return 0;
            case 4:
                yn0Var.f391235f = aVar2.k(intValue);
                return 0;
            case 5:
                yn0Var.f391236g = aVar2.k(intValue);
                return 0;
            case 6:
                yn0Var.f391237h = aVar2.k(intValue);
                return 0;
            case 7:
                yn0Var.f391238i = aVar2.i(intValue);
                return 0;
            case 8:
                yn0Var.f391239m = aVar2.e(intValue);
                return 0;
            case 9:
                yn0Var.f391240n = aVar2.e(intValue);
                return 0;
            case 10:
                yn0Var.f391241o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
