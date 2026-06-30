package r45;

/* loaded from: classes11.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376598f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376599g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376600h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376601i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f376602m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i0)) {
            return false;
        }
        r45.i0 i0Var = (r45.i0) fVar;
        return n51.f.a(this.f376596d, i0Var.f376596d) && n51.f.a(this.f376597e, i0Var.f376597e) && n51.f.a(this.f376598f, i0Var.f376598f) && n51.f.a(this.f376599g, i0Var.f376599g) && n51.f.a(this.f376600h, i0Var.f376600h) && n51.f.a(this.f376601i, i0Var.f376601i) && n51.f.a(this.f376602m, i0Var.f376602m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376602m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376596d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376597e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376598f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f376599g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f376600h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f376601i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(7, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f376596d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f376597e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f376598f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f376599g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f376600h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f376601i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.g(7, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.i0 i0Var = (r45.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i0Var.f376596d = aVar2.k(intValue);
                return 0;
            case 2:
                i0Var.f376597e = aVar2.k(intValue);
                return 0;
            case 3:
                i0Var.f376598f = aVar2.k(intValue);
                return 0;
            case 4:
                i0Var.f376599g = aVar2.k(intValue);
                return 0;
            case 5:
                i0Var.f376600h = aVar2.k(intValue);
                return 0;
            case 6:
                i0Var.f376601i = aVar2.k(intValue);
                return 0;
            case 7:
                i0Var.f376602m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
