package r45;

/* loaded from: classes4.dex */
public class xz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390605f;

    /* renamed from: g, reason: collision with root package name */
    public int f390606g;

    /* renamed from: h, reason: collision with root package name */
    public int f390607h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390608i;

    /* renamed from: m, reason: collision with root package name */
    public int f390609m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz)) {
            return false;
        }
        r45.xz xzVar = (r45.xz) fVar;
        return n51.f.a(this.f390603d, xzVar.f390603d) && n51.f.a(this.f390604e, xzVar.f390604e) && n51.f.a(this.f390605f, xzVar.f390605f) && n51.f.a(java.lang.Integer.valueOf(this.f390606g), java.lang.Integer.valueOf(xzVar.f390606g)) && n51.f.a(java.lang.Integer.valueOf(this.f390607h), java.lang.Integer.valueOf(xzVar.f390607h)) && n51.f.a(this.f390608i, xzVar.f390608i) && n51.f.a(java.lang.Integer.valueOf(this.f390609m), java.lang.Integer.valueOf(xzVar.f390609m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390603d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390604e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390605f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f390606g);
            fVar.e(5, this.f390607h);
            java.lang.String str4 = this.f390608i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f390609m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f390603d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f390604e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f390605f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f390606g) + b36.f.e(5, this.f390607h);
            java.lang.String str8 = this.f390608i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f390609m);
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
        r45.xz xzVar = (r45.xz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xzVar.f390603d = aVar2.k(intValue);
                return 0;
            case 2:
                xzVar.f390604e = aVar2.k(intValue);
                return 0;
            case 3:
                xzVar.f390605f = aVar2.k(intValue);
                return 0;
            case 4:
                xzVar.f390606g = aVar2.g(intValue);
                return 0;
            case 5:
                xzVar.f390607h = aVar2.g(intValue);
                return 0;
            case 6:
                xzVar.f390608i = aVar2.k(intValue);
                return 0;
            case 7:
                xzVar.f390609m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
