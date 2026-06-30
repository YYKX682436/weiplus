package r45;

/* loaded from: classes2.dex */
public class mg3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380469d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380470e;

    /* renamed from: f, reason: collision with root package name */
    public int f380471f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380472g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380473h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380474i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mg3)) {
            return false;
        }
        r45.mg3 mg3Var = (r45.mg3) fVar;
        return n51.f.a(this.f380469d, mg3Var.f380469d) && n51.f.a(this.f380470e, mg3Var.f380470e) && n51.f.a(java.lang.Integer.valueOf(this.f380471f), java.lang.Integer.valueOf(mg3Var.f380471f)) && n51.f.a(this.f380472g, mg3Var.f380472g) && n51.f.a(this.f380473h, mg3Var.f380473h) && n51.f.a(this.f380474i, mg3Var.f380474i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380469d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380470e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380471f);
            java.lang.String str3 = this.f380472g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380473h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f380474i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f380469d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f380470e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f380471f);
            java.lang.String str8 = this.f380472g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f380473h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f380474i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.mg3 mg3Var = (r45.mg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mg3Var.f380469d = aVar2.k(intValue);
                return 0;
            case 2:
                mg3Var.f380470e = aVar2.k(intValue);
                return 0;
            case 3:
                mg3Var.f380471f = aVar2.g(intValue);
                return 0;
            case 4:
                mg3Var.f380472g = aVar2.k(intValue);
                return 0;
            case 5:
                mg3Var.f380473h = aVar2.k(intValue);
                return 0;
            case 6:
                mg3Var.f380474i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
