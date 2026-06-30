package r45;

/* loaded from: classes8.dex */
public class x6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389807d;

    /* renamed from: e, reason: collision with root package name */
    public int f389808e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389809f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389810g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389811h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389812i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x6)) {
            return false;
        }
        r45.x6 x6Var = (r45.x6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389807d), java.lang.Integer.valueOf(x6Var.f389807d)) && n51.f.a(java.lang.Integer.valueOf(this.f389808e), java.lang.Integer.valueOf(x6Var.f389808e)) && n51.f.a(this.f389809f, x6Var.f389809f) && n51.f.a(this.f389810g, x6Var.f389810g) && n51.f.a(this.f389811h, x6Var.f389811h) && n51.f.a(this.f389812i, x6Var.f389812i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389807d);
            fVar.e(2, this.f389808e);
            java.lang.String str = this.f389809f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389810g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389811h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389812i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389807d) + 0 + b36.f.e(2, this.f389808e);
            java.lang.String str5 = this.f389809f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f389810g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f389811h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f389812i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.x6 x6Var = (r45.x6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x6Var.f389807d = aVar2.g(intValue);
                return 0;
            case 2:
                x6Var.f389808e = aVar2.g(intValue);
                return 0;
            case 3:
                x6Var.f389809f = aVar2.k(intValue);
                return 0;
            case 4:
                x6Var.f389810g = aVar2.k(intValue);
                return 0;
            case 5:
                x6Var.f389811h = aVar2.k(intValue);
                return 0;
            case 6:
                x6Var.f389812i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
