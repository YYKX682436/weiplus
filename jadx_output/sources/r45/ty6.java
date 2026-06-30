package r45;

/* loaded from: classes14.dex */
public class ty6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386867f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386868g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386869h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386870i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ty6)) {
            return false;
        }
        r45.ty6 ty6Var = (r45.ty6) fVar;
        return n51.f.a(this.f386865d, ty6Var.f386865d) && n51.f.a(this.f386866e, ty6Var.f386866e) && n51.f.a(this.f386867f, ty6Var.f386867f) && n51.f.a(this.f386868g, ty6Var.f386868g) && n51.f.a(this.f386869h, ty6Var.f386869h) && n51.f.a(this.f386870i, ty6Var.f386870i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386865d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386866e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386867f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f386868g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f386869h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f386870i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f386865d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f386866e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f386867f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f386868g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f386869h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f386870i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.ty6 ty6Var = (r45.ty6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ty6Var.f386865d = aVar2.k(intValue);
                return 0;
            case 2:
                ty6Var.f386866e = aVar2.k(intValue);
                return 0;
            case 3:
                ty6Var.f386867f = aVar2.k(intValue);
                return 0;
            case 4:
                ty6Var.f386868g = aVar2.k(intValue);
                return 0;
            case 5:
                ty6Var.f386869h = aVar2.k(intValue);
                return 0;
            case 6:
                ty6Var.f386870i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
