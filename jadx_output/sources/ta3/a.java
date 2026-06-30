package ta3;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f416697e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f416698f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f416699g;

    /* renamed from: h, reason: collision with root package name */
    public double f416700h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f416701i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f416702m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ta3.a)) {
            return false;
        }
        ta3.a aVar = (ta3.a) fVar;
        return n51.f.a(this.f416696d, aVar.f416696d) && n51.f.a(this.f416697e, aVar.f416697e) && n51.f.a(this.f416698f, aVar.f416698f) && n51.f.a(java.lang.Boolean.valueOf(this.f416699g), java.lang.Boolean.valueOf(aVar.f416699g)) && n51.f.a(java.lang.Double.valueOf(this.f416700h), java.lang.Double.valueOf(aVar.f416700h)) && n51.f.a(java.lang.Boolean.valueOf(this.f416701i), java.lang.Boolean.valueOf(aVar.f416701i)) && n51.f.a(this.f416702m, aVar.f416702m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f416696d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f416697e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f416698f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f416699g);
            fVar.c(5, this.f416700h);
            fVar.a(6, this.f416701i);
            java.lang.String str4 = this.f416702m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f416696d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f416697e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f416698f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f416699g) + b36.f.c(5, this.f416700h) + b36.f.a(6, this.f416701i);
            java.lang.String str8 = this.f416702m;
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
        ta3.a aVar3 = (ta3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f416696d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f416697e = aVar2.k(intValue);
                return 0;
            case 3:
                aVar3.f416698f = aVar2.k(intValue);
                return 0;
            case 4:
                aVar3.f416699g = aVar2.c(intValue);
                return 0;
            case 5:
                aVar3.f416700h = aVar2.e(intValue);
                return 0;
            case 6:
                aVar3.f416701i = aVar2.c(intValue);
                return 0;
            case 7:
                aVar3.f416702m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
