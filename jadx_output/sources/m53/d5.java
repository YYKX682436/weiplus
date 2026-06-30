package m53;

/* loaded from: classes2.dex */
public class d5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323633h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323634i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f323635m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.d5)) {
            return false;
        }
        m53.d5 d5Var = (m53.d5) fVar;
        return n51.f.a(this.f323629d, d5Var.f323629d) && n51.f.a(this.f323630e, d5Var.f323630e) && n51.f.a(this.f323631f, d5Var.f323631f) && n51.f.a(this.f323632g, d5Var.f323632g) && n51.f.a(this.f323633h, d5Var.f323633h) && n51.f.a(java.lang.Boolean.valueOf(this.f323634i), java.lang.Boolean.valueOf(d5Var.f323634i)) && n51.f.a(java.lang.Boolean.valueOf(this.f323635m), java.lang.Boolean.valueOf(d5Var.f323635m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323629d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323630e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323631f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323632g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323633h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.a(6, this.f323634i);
            fVar.a(7, this.f323635m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f323629d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f323630e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f323631f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f323632g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f323633h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.a(6, this.f323634i) + b36.f.a(7, this.f323635m);
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
        m53.d5 d5Var = (m53.d5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d5Var.f323629d = aVar2.k(intValue);
                return 0;
            case 2:
                d5Var.f323630e = aVar2.k(intValue);
                return 0;
            case 3:
                d5Var.f323631f = aVar2.k(intValue);
                return 0;
            case 4:
                d5Var.f323632g = aVar2.k(intValue);
                return 0;
            case 5:
                d5Var.f323633h = aVar2.k(intValue);
                return 0;
            case 6:
                d5Var.f323634i = aVar2.c(intValue);
                return 0;
            case 7:
                d5Var.f323635m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
