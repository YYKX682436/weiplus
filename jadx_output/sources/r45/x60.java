package r45;

/* loaded from: classes2.dex */
public class x60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389814e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389816g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x60)) {
            return false;
        }
        r45.x60 x60Var = (r45.x60) fVar;
        return n51.f.a(this.f389813d, x60Var.f389813d) && n51.f.a(this.f389814e, x60Var.f389814e) && n51.f.a(this.f389815f, x60Var.f389815f) && n51.f.a(this.f389816g, x60Var.f389816g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389813d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389814e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f389815f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str3 = this.f389816g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f389813d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f389814e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389815f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            java.lang.String str6 = this.f389816g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        r45.x60 x60Var = (r45.x60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x60Var.f389813d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x60Var.f389814e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            x60Var.f389815f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x60Var.f389816g = aVar2.k(intValue);
        return 0;
    }
}
