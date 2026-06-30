package r45;

/* loaded from: classes9.dex */
public class r17 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384439d;

    /* renamed from: e, reason: collision with root package name */
    public int f384440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384441f;

    /* renamed from: g, reason: collision with root package name */
    public int f384442g;

    /* renamed from: h, reason: collision with root package name */
    public int f384443h;

    /* renamed from: i, reason: collision with root package name */
    public int f384444i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384445m;

    /* renamed from: n, reason: collision with root package name */
    public int f384446n;

    /* renamed from: o, reason: collision with root package name */
    public int f384447o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f384448p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384449q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384450r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r17)) {
            return false;
        }
        r45.r17 r17Var = (r45.r17) fVar;
        return n51.f.a(this.BaseResponse, r17Var.BaseResponse) && n51.f.a(this.f384439d, r17Var.f384439d) && n51.f.a(java.lang.Integer.valueOf(this.f384440e), java.lang.Integer.valueOf(r17Var.f384440e)) && n51.f.a(this.f384441f, r17Var.f384441f) && n51.f.a(java.lang.Integer.valueOf(this.f384442g), java.lang.Integer.valueOf(r17Var.f384442g)) && n51.f.a(java.lang.Integer.valueOf(this.f384443h), java.lang.Integer.valueOf(r17Var.f384443h)) && n51.f.a(java.lang.Integer.valueOf(this.f384444i), java.lang.Integer.valueOf(r17Var.f384444i)) && n51.f.a(this.f384445m, r17Var.f384445m) && n51.f.a(java.lang.Integer.valueOf(this.f384446n), java.lang.Integer.valueOf(r17Var.f384446n)) && n51.f.a(java.lang.Integer.valueOf(this.f384447o), java.lang.Integer.valueOf(r17Var.f384447o)) && n51.f.a(java.lang.Boolean.valueOf(this.f384448p), java.lang.Boolean.valueOf(r17Var.f384448p)) && n51.f.a(this.f384449q, r17Var.f384449q) && n51.f.a(this.f384450r, r17Var.f384450r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f384439d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384440e);
            java.lang.String str2 = this.f384441f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f384442g);
            fVar.e(6, this.f384443h);
            fVar.e(7, this.f384444i);
            com.tencent.mm.protobuf.g gVar = this.f384445m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(100, this.f384446n);
            fVar.e(101, this.f384447o);
            fVar.a(200, this.f384448p);
            java.lang.String str3 = this.f384449q;
            if (str3 != null) {
                fVar.j(201, str3);
            }
            java.lang.String str4 = this.f384450r;
            if (str4 == null) {
                return 0;
            }
            fVar.j(202, str4);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f384439d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f384440e);
            java.lang.String str6 = this.f384441f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f384442g) + b36.f.e(6, this.f384443h) + b36.f.e(7, this.f384444i);
            com.tencent.mm.protobuf.g gVar2 = this.f384445m;
            if (gVar2 != null) {
                e18 += b36.f.b(8, gVar2);
            }
            int e19 = e18 + b36.f.e(100, this.f384446n) + b36.f.e(101, this.f384447o) + b36.f.a(200, this.f384448p);
            java.lang.String str7 = this.f384449q;
            if (str7 != null) {
                e19 += b36.f.j(201, str7);
            }
            java.lang.String str8 = this.f384450r;
            return str8 != null ? e19 + b36.f.j(202, str8) : e19;
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
        r45.r17 r17Var = (r45.r17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            r17Var.f384446n = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 101) {
            r17Var.f384447o = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    r17Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r17Var.f384439d = aVar2.k(intValue);
                return 0;
            case 3:
                r17Var.f384440e = aVar2.g(intValue);
                return 0;
            case 4:
                r17Var.f384441f = aVar2.k(intValue);
                return 0;
            case 5:
                r17Var.f384442g = aVar2.g(intValue);
                return 0;
            case 6:
                r17Var.f384443h = aVar2.g(intValue);
                return 0;
            case 7:
                r17Var.f384444i = aVar2.g(intValue);
                return 0;
            case 8:
                r17Var.f384445m = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 200:
                        r17Var.f384448p = aVar2.c(intValue);
                        return 0;
                    case 201:
                        r17Var.f384449q = aVar2.k(intValue);
                        return 0;
                    case 202:
                        r17Var.f384450r = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
