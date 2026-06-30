package r45;

/* loaded from: classes12.dex */
public class ep0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373641d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373642e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373643f;

    /* renamed from: g, reason: collision with root package name */
    public int f373644g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373645h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373646i;

    /* renamed from: m, reason: collision with root package name */
    public int f373647m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373648n;

    /* renamed from: o, reason: collision with root package name */
    public int f373649o;

    /* renamed from: p, reason: collision with root package name */
    public int f373650p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep0)) {
            return false;
        }
        r45.ep0 ep0Var = (r45.ep0) fVar;
        return n51.f.a(this.f373641d, ep0Var.f373641d) && n51.f.a(this.f373642e, ep0Var.f373642e) && n51.f.a(this.f373643f, ep0Var.f373643f) && n51.f.a(java.lang.Integer.valueOf(this.f373644g), java.lang.Integer.valueOf(ep0Var.f373644g)) && n51.f.a(this.f373645h, ep0Var.f373645h) && n51.f.a(this.f373646i, ep0Var.f373646i) && n51.f.a(java.lang.Integer.valueOf(this.f373647m), java.lang.Integer.valueOf(ep0Var.f373647m)) && n51.f.a(this.f373648n, ep0Var.f373648n) && n51.f.a(java.lang.Integer.valueOf(this.f373649o), java.lang.Integer.valueOf(ep0Var.f373649o)) && n51.f.a(java.lang.Integer.valueOf(this.f373650p), java.lang.Integer.valueOf(ep0Var.f373650p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373641d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373642e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f373643f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f373644g);
            java.lang.String str4 = this.f373645h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f373646i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f373647m);
            java.lang.String str6 = this.f373648n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f373649o);
            fVar.e(10, this.f373650p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f373641d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f373642e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f373643f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int e17 = j17 + b36.f.e(4, this.f373644g);
            java.lang.String str10 = this.f373645h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f373646i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f373647m);
            java.lang.String str12 = this.f373648n;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            return e18 + b36.f.e(9, this.f373649o) + b36.f.e(10, this.f373650p);
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
        r45.ep0 ep0Var = (r45.ep0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ep0Var.f373641d = aVar2.k(intValue);
                return 0;
            case 2:
                ep0Var.f373642e = aVar2.k(intValue);
                return 0;
            case 3:
                ep0Var.f373643f = aVar2.k(intValue);
                return 0;
            case 4:
                ep0Var.f373644g = aVar2.g(intValue);
                return 0;
            case 5:
                ep0Var.f373645h = aVar2.k(intValue);
                return 0;
            case 6:
                ep0Var.f373646i = aVar2.k(intValue);
                return 0;
            case 7:
                ep0Var.f373647m = aVar2.g(intValue);
                return 0;
            case 8:
                ep0Var.f373648n = aVar2.k(intValue);
                return 0;
            case 9:
                ep0Var.f373649o = aVar2.g(intValue);
                return 0;
            case 10:
                ep0Var.f373650p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
