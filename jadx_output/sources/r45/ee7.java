package r45;

/* loaded from: classes2.dex */
public class ee7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373376d;

    /* renamed from: e, reason: collision with root package name */
    public int f373377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373379g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373380h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373381i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee7)) {
            return false;
        }
        r45.ee7 ee7Var = (r45.ee7) fVar;
        return n51.f.a(this.f373376d, ee7Var.f373376d) && n51.f.a(java.lang.Integer.valueOf(this.f373377e), java.lang.Integer.valueOf(ee7Var.f373377e)) && n51.f.a(this.f373378f, ee7Var.f373378f) && n51.f.a(this.f373379g, ee7Var.f373379g) && n51.f.a(this.f373380h, ee7Var.f373380h) && n51.f.a(this.f373381i, ee7Var.f373381i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373376d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f373377e);
            java.lang.String str2 = this.f373378f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f373379g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f373380h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f373381i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f373376d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f373377e);
            java.lang.String str7 = this.f373378f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f373379g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f373380h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f373381i;
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
        r45.ee7 ee7Var = (r45.ee7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ee7Var.f373376d = aVar2.k(intValue);
                return 0;
            case 2:
                ee7Var.f373377e = aVar2.g(intValue);
                return 0;
            case 3:
                ee7Var.f373378f = aVar2.k(intValue);
                return 0;
            case 4:
                ee7Var.f373379g = aVar2.k(intValue);
                return 0;
            case 5:
                ee7Var.f373380h = aVar2.k(intValue);
                return 0;
            case 6:
                ee7Var.f373381i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
