package r45;

/* loaded from: classes8.dex */
public class yu6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391374d;

    /* renamed from: e, reason: collision with root package name */
    public int f391375e;

    /* renamed from: f, reason: collision with root package name */
    public int f391376f;

    /* renamed from: g, reason: collision with root package name */
    public int f391377g;

    /* renamed from: h, reason: collision with root package name */
    public long f391378h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391379i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391380m;

    /* renamed from: n, reason: collision with root package name */
    public int f391381n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f391382o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f391383p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f391384q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yu6)) {
            return false;
        }
        r45.yu6 yu6Var = (r45.yu6) fVar;
        return n51.f.a(this.BaseResponse, yu6Var.BaseResponse) && n51.f.a(this.f391374d, yu6Var.f391374d) && n51.f.a(java.lang.Integer.valueOf(this.f391375e), java.lang.Integer.valueOf(yu6Var.f391375e)) && n51.f.a(java.lang.Integer.valueOf(this.f391376f), java.lang.Integer.valueOf(yu6Var.f391376f)) && n51.f.a(java.lang.Integer.valueOf(this.f391377g), java.lang.Integer.valueOf(yu6Var.f391377g)) && n51.f.a(java.lang.Long.valueOf(this.f391378h), java.lang.Long.valueOf(yu6Var.f391378h)) && n51.f.a(this.f391379i, yu6Var.f391379i) && n51.f.a(this.f391380m, yu6Var.f391380m) && n51.f.a(java.lang.Integer.valueOf(this.f391381n), java.lang.Integer.valueOf(yu6Var.f391381n)) && n51.f.a(java.lang.Boolean.valueOf(this.f391382o), java.lang.Boolean.valueOf(yu6Var.f391382o)) && n51.f.a(java.lang.Boolean.valueOf(this.f391383p), java.lang.Boolean.valueOf(yu6Var.f391383p)) && n51.f.a(this.f391384q, yu6Var.f391384q);
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
            java.lang.String str = this.f391374d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391375e);
            fVar.e(4, this.f391376f);
            fVar.e(5, this.f391377g);
            fVar.h(6, this.f391378h);
            java.lang.String str2 = this.f391379i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f391380m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f391381n);
            fVar.a(10, this.f391382o);
            fVar.a(11, this.f391383p);
            java.lang.String str4 = this.f391384q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f391374d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f391375e) + b36.f.e(4, this.f391376f) + b36.f.e(5, this.f391377g) + b36.f.h(6, this.f391378h);
            java.lang.String str6 = this.f391379i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f391380m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            int e18 = e17 + b36.f.e(9, this.f391381n) + b36.f.a(10, this.f391382o) + b36.f.a(11, this.f391383p);
            java.lang.String str8 = this.f391384q;
            return str8 != null ? e18 + b36.f.j(12, str8) : e18;
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
        r45.yu6 yu6Var = (r45.yu6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    yu6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                yu6Var.f391374d = aVar2.k(intValue);
                return 0;
            case 3:
                yu6Var.f391375e = aVar2.g(intValue);
                return 0;
            case 4:
                yu6Var.f391376f = aVar2.g(intValue);
                return 0;
            case 5:
                yu6Var.f391377g = aVar2.g(intValue);
                return 0;
            case 6:
                yu6Var.f391378h = aVar2.i(intValue);
                return 0;
            case 7:
                yu6Var.f391379i = aVar2.k(intValue);
                return 0;
            case 8:
                yu6Var.f391380m = aVar2.k(intValue);
                return 0;
            case 9:
                yu6Var.f391381n = aVar2.g(intValue);
                return 0;
            case 10:
                yu6Var.f391382o = aVar2.c(intValue);
                return 0;
            case 11:
                yu6Var.f391383p = aVar2.c(intValue);
                return 0;
            case 12:
                yu6Var.f391384q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
