package r45;

/* loaded from: classes2.dex */
public class v31 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387847d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387848e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f387849f;

    /* renamed from: g, reason: collision with root package name */
    public long f387850g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v31)) {
            return false;
        }
        r45.v31 v31Var = (r45.v31) fVar;
        return n51.f.a(this.f387847d, v31Var.f387847d) && n51.f.a(this.f387848e, v31Var.f387848e) && n51.f.a(java.lang.Boolean.valueOf(this.f387849f), java.lang.Boolean.valueOf(v31Var.f387849f)) && n51.f.a(java.lang.Long.valueOf(this.f387850g), java.lang.Long.valueOf(v31Var.f387850g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387847d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387848e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f387849f);
            fVar.h(4, this.f387850g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387847d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f387848e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f387849f) + b36.f.h(4, this.f387850g);
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
        r45.v31 v31Var = (r45.v31) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v31Var.f387847d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v31Var.f387848e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v31Var.f387849f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        v31Var.f387850g = aVar2.i(intValue);
        return 0;
    }
}
