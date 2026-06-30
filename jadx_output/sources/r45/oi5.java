package r45;

/* loaded from: classes8.dex */
public class oi5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382283d;

    /* renamed from: e, reason: collision with root package name */
    public int f382284e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382288i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oi5)) {
            return false;
        }
        r45.oi5 oi5Var = (r45.oi5) fVar;
        return n51.f.a(this.f382283d, oi5Var.f382283d) && n51.f.a(java.lang.Integer.valueOf(this.f382284e), java.lang.Integer.valueOf(oi5Var.f382284e)) && n51.f.a(this.f382285f, oi5Var.f382285f) && n51.f.a(this.f382286g, oi5Var.f382286g) && n51.f.a(this.f382287h, oi5Var.f382287h) && n51.f.a(this.f382288i, oi5Var.f382288i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382283d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382284e);
            java.lang.String str2 = this.f382285f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382286g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382287h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f382288i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f382283d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f382284e);
            java.lang.String str7 = this.f382285f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f382286g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f382287h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f382288i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.oi5 oi5Var = (r45.oi5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oi5Var.f382283d = aVar2.k(intValue);
                return 0;
            case 2:
                oi5Var.f382284e = aVar2.g(intValue);
                return 0;
            case 3:
                oi5Var.f382285f = aVar2.k(intValue);
                return 0;
            case 4:
                oi5Var.f382286g = aVar2.k(intValue);
                return 0;
            case 5:
                oi5Var.f382287h = aVar2.k(intValue);
                return 0;
            case 6:
                oi5Var.f382288i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
