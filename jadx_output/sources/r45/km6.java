package r45;

/* loaded from: classes4.dex */
public class km6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378838d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378839e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378840f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km6)) {
            return false;
        }
        r45.km6 km6Var = (r45.km6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378838d), java.lang.Integer.valueOf(km6Var.f378838d)) && n51.f.a(this.f378839e, km6Var.f378839e) && n51.f.a(this.f378840f, km6Var.f378840f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378838d);
            java.lang.String str = this.f378839e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378840f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378838d) + 0;
            java.lang.String str3 = this.f378839e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f378840f;
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
        r45.km6 km6Var = (r45.km6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            km6Var.f378838d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            km6Var.f378839e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        km6Var.f378840f = aVar2.k(intValue);
        return 0;
    }
}
