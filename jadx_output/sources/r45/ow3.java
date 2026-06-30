package r45;

/* loaded from: classes9.dex */
public class ow3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382575d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382576e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382577f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382578g;

    /* renamed from: h, reason: collision with root package name */
    public long f382579h;

    /* renamed from: i, reason: collision with root package name */
    public int f382580i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ow3)) {
            return false;
        }
        r45.ow3 ow3Var = (r45.ow3) fVar;
        return n51.f.a(this.f382575d, ow3Var.f382575d) && n51.f.a(this.f382576e, ow3Var.f382576e) && n51.f.a(this.f382577f, ow3Var.f382577f) && n51.f.a(this.f382578g, ow3Var.f382578g) && n51.f.a(java.lang.Long.valueOf(this.f382579h), java.lang.Long.valueOf(ow3Var.f382579h)) && n51.f.a(java.lang.Integer.valueOf(this.f382580i), java.lang.Integer.valueOf(ow3Var.f382580i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382575d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382576e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382577f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382578g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(6, this.f382579h);
            fVar.e(5, this.f382580i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f382575d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f382576e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f382577f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f382578g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.h(6, this.f382579h) + b36.f.e(5, this.f382580i);
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
        r45.ow3 ow3Var = (r45.ow3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ow3Var.f382575d = aVar2.k(intValue);
                return 0;
            case 2:
                ow3Var.f382576e = aVar2.k(intValue);
                return 0;
            case 3:
                ow3Var.f382577f = aVar2.k(intValue);
                return 0;
            case 4:
                ow3Var.f382578g = aVar2.k(intValue);
                return 0;
            case 5:
                ow3Var.f382580i = aVar2.g(intValue);
                return 0;
            case 6:
                ow3Var.f382579h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
