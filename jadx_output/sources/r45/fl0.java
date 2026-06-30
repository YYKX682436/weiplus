package r45;

/* loaded from: classes7.dex */
public class fl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374418d;

    /* renamed from: e, reason: collision with root package name */
    public int f374419e;

    /* renamed from: f, reason: collision with root package name */
    public int f374420f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374421g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374422h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374423i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fl0)) {
            return false;
        }
        r45.fl0 fl0Var = (r45.fl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374418d), java.lang.Integer.valueOf(fl0Var.f374418d)) && n51.f.a(java.lang.Integer.valueOf(this.f374419e), java.lang.Integer.valueOf(fl0Var.f374419e)) && n51.f.a(java.lang.Integer.valueOf(this.f374420f), java.lang.Integer.valueOf(fl0Var.f374420f)) && n51.f.a(this.f374421g, fl0Var.f374421g) && n51.f.a(this.f374422h, fl0Var.f374422h) && n51.f.a(this.f374423i, fl0Var.f374423i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374418d);
            fVar.e(2, this.f374419e);
            fVar.e(3, this.f374420f);
            java.lang.String str = this.f374421g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374422h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f374423i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374418d) + 0 + b36.f.e(2, this.f374419e) + b36.f.e(3, this.f374420f);
            java.lang.String str4 = this.f374421g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f374422h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f374423i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.fl0 fl0Var = (r45.fl0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fl0Var.f374418d = aVar2.g(intValue);
                return 0;
            case 2:
                fl0Var.f374419e = aVar2.g(intValue);
                return 0;
            case 3:
                fl0Var.f374420f = aVar2.g(intValue);
                return 0;
            case 4:
                fl0Var.f374421g = aVar2.k(intValue);
                return 0;
            case 5:
                fl0Var.f374422h = aVar2.k(intValue);
                return 0;
            case 6:
                fl0Var.f374423i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
