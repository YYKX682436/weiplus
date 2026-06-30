package r45;

/* loaded from: classes2.dex */
public class d85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372224e;

    /* renamed from: f, reason: collision with root package name */
    public int f372225f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d85)) {
            return false;
        }
        r45.d85 d85Var = (r45.d85) fVar;
        return n51.f.a(this.f372223d, d85Var.f372223d) && n51.f.a(this.f372224e, d85Var.f372224e) && n51.f.a(java.lang.Integer.valueOf(this.f372225f), java.lang.Integer.valueOf(d85Var.f372225f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372223d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372224e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372225f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f372223d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f372224e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f372225f);
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
        r45.d85 d85Var = (r45.d85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d85Var.f372223d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d85Var.f372224e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        d85Var.f372225f = aVar2.g(intValue);
        return 0;
    }
}
