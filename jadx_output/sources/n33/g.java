package n33;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f334513e;

    /* renamed from: f, reason: collision with root package name */
    public int f334514f;

    /* renamed from: g, reason: collision with root package name */
    public int f334515g;

    /* renamed from: h, reason: collision with root package name */
    public int f334516h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334517i;

    /* renamed from: m, reason: collision with root package name */
    public long f334518m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.g)) {
            return false;
        }
        n33.g gVar = (n33.g) fVar;
        return n51.f.a(this.f334512d, gVar.f334512d) && n51.f.a(this.f334513e, gVar.f334513e) && n51.f.a(java.lang.Integer.valueOf(this.f334514f), java.lang.Integer.valueOf(gVar.f334514f)) && n51.f.a(java.lang.Integer.valueOf(this.f334515g), java.lang.Integer.valueOf(gVar.f334515g)) && n51.f.a(java.lang.Integer.valueOf(this.f334516h), java.lang.Integer.valueOf(gVar.f334516h)) && n51.f.a(this.f334517i, gVar.f334517i) && n51.f.a(java.lang.Long.valueOf(this.f334518m), java.lang.Long.valueOf(gVar.f334518m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f334512d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f334513e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f334514f);
            fVar.e(4, this.f334515g);
            fVar.e(5, this.f334516h);
            java.lang.String str3 = this.f334517i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f334518m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f334512d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f334513e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f334514f) + b36.f.e(4, this.f334515g) + b36.f.e(5, this.f334516h);
            java.lang.String str6 = this.f334517i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.h(7, this.f334518m);
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
        n33.g gVar = (n33.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gVar.f334512d = aVar2.k(intValue);
                return 0;
            case 2:
                gVar.f334513e = aVar2.k(intValue);
                return 0;
            case 3:
                gVar.f334514f = aVar2.g(intValue);
                return 0;
            case 4:
                gVar.f334515g = aVar2.g(intValue);
                return 0;
            case 5:
                gVar.f334516h = aVar2.g(intValue);
                return 0;
            case 6:
                gVar.f334517i = aVar2.k(intValue);
                return 0;
            case 7:
                gVar.f334518m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
