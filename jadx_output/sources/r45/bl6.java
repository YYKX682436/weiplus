package r45;

/* loaded from: classes7.dex */
public class bl6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370858d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370859e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370860f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl6)) {
            return false;
        }
        r45.bl6 bl6Var = (r45.bl6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370858d), java.lang.Integer.valueOf(bl6Var.f370858d)) && n51.f.a(this.f370859e, bl6Var.f370859e) && n51.f.a(this.f370860f, bl6Var.f370860f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370858d);
            java.lang.String str = this.f370859e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370860f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370858d) + 0;
            java.lang.String str3 = this.f370859e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f370860f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.bl6 bl6Var = (r45.bl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bl6Var.f370858d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bl6Var.f370859e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bl6Var.f370860f = aVar2.k(intValue);
        return 0;
    }
}
