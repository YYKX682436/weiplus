package r45;

/* loaded from: classes9.dex */
public class l7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379190f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l7)) {
            return false;
        }
        r45.l7 l7Var = (r45.l7) fVar;
        return n51.f.a(this.f379188d, l7Var.f379188d) && n51.f.a(this.f379189e, l7Var.f379189e) && n51.f.a(this.f379190f, l7Var.f379190f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379188d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379189e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379190f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f379188d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f379189e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f379190f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.l7 l7Var = (r45.l7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l7Var.f379188d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l7Var.f379189e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l7Var.f379190f = aVar2.k(intValue);
        return 0;
    }
}
