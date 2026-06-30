package wn1;

/* loaded from: classes12.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447446d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447447e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447448f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447449g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f447450h;

    /* renamed from: i, reason: collision with root package name */
    public int f447451i;

    /* renamed from: m, reason: collision with root package name */
    public long f447452m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.p)) {
            return false;
        }
        wn1.p pVar = (wn1.p) fVar;
        return n51.f.a(this.f447446d, pVar.f447446d) && n51.f.a(this.f447447e, pVar.f447447e) && n51.f.a(this.f447448f, pVar.f447448f) && n51.f.a(this.f447449g, pVar.f447449g) && n51.f.a(this.f447450h, pVar.f447450h) && n51.f.a(java.lang.Integer.valueOf(this.f447451i), java.lang.Integer.valueOf(pVar.f447451i)) && n51.f.a(java.lang.Long.valueOf(this.f447452m), java.lang.Long.valueOf(pVar.f447452m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447446d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f447447e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f447448f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f447449g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f447450h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f447451i);
            fVar.h(7, this.f447452m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f447446d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f447447e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f447448f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f447449g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f447450h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f447451i) + b36.f.h(7, this.f447452m);
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
        wn1.p pVar = (wn1.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pVar.f447446d = aVar2.k(intValue);
                return 0;
            case 2:
                pVar.f447447e = aVar2.k(intValue);
                return 0;
            case 3:
                pVar.f447448f = aVar2.k(intValue);
                return 0;
            case 4:
                pVar.f447449g = aVar2.k(intValue);
                return 0;
            case 5:
                pVar.f447450h = aVar2.k(intValue);
                return 0;
            case 6:
                pVar.f447451i = aVar2.g(intValue);
                return 0;
            case 7:
                pVar.f447452m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
