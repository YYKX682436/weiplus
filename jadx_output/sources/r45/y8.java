package r45;

/* loaded from: classes4.dex */
public class y8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390846d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390847e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390848f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390849g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390850h;

    /* renamed from: i, reason: collision with root package name */
    public int f390851i;

    /* renamed from: m, reason: collision with root package name */
    public int f390852m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y8)) {
            return false;
        }
        r45.y8 y8Var = (r45.y8) fVar;
        return n51.f.a(this.f390846d, y8Var.f390846d) && n51.f.a(this.f390847e, y8Var.f390847e) && n51.f.a(this.f390848f, y8Var.f390848f) && n51.f.a(this.f390849g, y8Var.f390849g) && n51.f.a(this.f390850h, y8Var.f390850h) && n51.f.a(java.lang.Integer.valueOf(this.f390851i), java.lang.Integer.valueOf(y8Var.f390851i)) && n51.f.a(java.lang.Integer.valueOf(this.f390852m), java.lang.Integer.valueOf(y8Var.f390852m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390846d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390847e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390848f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390849g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f390850h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f390851i);
            fVar.e(7, this.f390852m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f390846d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f390847e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f390848f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f390849g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f390850h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f390851i) + b36.f.e(7, this.f390852m);
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
        r45.y8 y8Var = (r45.y8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y8Var.f390846d = aVar2.k(intValue);
                return 0;
            case 2:
                y8Var.f390847e = aVar2.k(intValue);
                return 0;
            case 3:
                y8Var.f390848f = aVar2.k(intValue);
                return 0;
            case 4:
                y8Var.f390849g = aVar2.k(intValue);
                return 0;
            case 5:
                y8Var.f390850h = aVar2.k(intValue);
                return 0;
            case 6:
                y8Var.f390851i = aVar2.g(intValue);
                return 0;
            case 7:
                y8Var.f390852m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
