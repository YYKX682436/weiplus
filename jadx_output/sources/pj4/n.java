package pj4;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355187e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355188f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f355189g;

    /* renamed from: h, reason: collision with root package name */
    public double f355190h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f355191i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f355192m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n)) {
            return false;
        }
        pj4.n nVar = (pj4.n) fVar;
        return n51.f.a(this.f355186d, nVar.f355186d) && n51.f.a(this.f355187e, nVar.f355187e) && n51.f.a(this.f355188f, nVar.f355188f) && n51.f.a(java.lang.Boolean.valueOf(this.f355189g), java.lang.Boolean.valueOf(nVar.f355189g)) && n51.f.a(java.lang.Double.valueOf(this.f355190h), java.lang.Double.valueOf(nVar.f355190h)) && n51.f.a(java.lang.Boolean.valueOf(this.f355191i), java.lang.Boolean.valueOf(nVar.f355191i)) && n51.f.a(this.f355192m, nVar.f355192m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355186d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355187e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355188f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f355189g);
            fVar.c(5, this.f355190h);
            fVar.a(6, this.f355191i);
            java.lang.String str4 = this.f355192m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f355186d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f355187e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f355188f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f355189g) + b36.f.c(5, this.f355190h) + b36.f.a(6, this.f355191i);
            java.lang.String str8 = this.f355192m;
            return str8 != null ? a17 + b36.f.j(7, str8) : a17;
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
        pj4.n nVar = (pj4.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f355186d = aVar2.k(intValue);
                return 0;
            case 2:
                nVar.f355187e = aVar2.k(intValue);
                return 0;
            case 3:
                nVar.f355188f = aVar2.k(intValue);
                return 0;
            case 4:
                nVar.f355189g = aVar2.c(intValue);
                return 0;
            case 5:
                nVar.f355190h = aVar2.e(intValue);
                return 0;
            case 6:
                nVar.f355191i = aVar2.c(intValue);
                return 0;
            case 7:
                nVar.f355192m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
