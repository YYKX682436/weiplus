package r45;

/* loaded from: classes2.dex */
public class tb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386264d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386265e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386266f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386267g;

    /* renamed from: h, reason: collision with root package name */
    public int f386268h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386269i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tb)) {
            return false;
        }
        r45.tb tbVar = (r45.tb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386264d), java.lang.Integer.valueOf(tbVar.f386264d)) && n51.f.a(this.f386265e, tbVar.f386265e) && n51.f.a(this.f386266f, tbVar.f386266f) && n51.f.a(this.f386267g, tbVar.f386267g) && n51.f.a(java.lang.Integer.valueOf(this.f386268h), java.lang.Integer.valueOf(tbVar.f386268h)) && n51.f.a(this.f386269i, tbVar.f386269i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386264d);
            java.lang.String str = this.f386265e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386266f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386267g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f386268h);
            java.lang.String str4 = this.f386269i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386264d) + 0;
            java.lang.String str5 = this.f386265e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386266f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386267g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f386268h);
            java.lang.String str8 = this.f386269i;
            return str8 != null ? e18 + b36.f.j(6, str8) : e18;
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
        r45.tb tbVar = (r45.tb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tbVar.f386264d = aVar2.g(intValue);
                return 0;
            case 2:
                tbVar.f386265e = aVar2.k(intValue);
                return 0;
            case 3:
                tbVar.f386266f = aVar2.k(intValue);
                return 0;
            case 4:
                tbVar.f386267g = aVar2.k(intValue);
                return 0;
            case 5:
                tbVar.f386268h = aVar2.g(intValue);
                return 0;
            case 6:
                tbVar.f386269i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
