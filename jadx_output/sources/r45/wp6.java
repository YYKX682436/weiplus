package r45;

/* loaded from: classes9.dex */
public class wp6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389379d;

    /* renamed from: e, reason: collision with root package name */
    public long f389380e;

    /* renamed from: f, reason: collision with root package name */
    public long f389381f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp6)) {
            return false;
        }
        r45.wp6 wp6Var = (r45.wp6) fVar;
        return n51.f.a(this.f389379d, wp6Var.f389379d) && n51.f.a(java.lang.Long.valueOf(this.f389380e), java.lang.Long.valueOf(wp6Var.f389380e)) && n51.f.a(java.lang.Long.valueOf(this.f389381f), java.lang.Long.valueOf(wp6Var.f389381f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389379d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f389380e);
            fVar.h(3, this.f389381f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f389379d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f389380e) + b36.f.h(3, this.f389381f);
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
        r45.wp6 wp6Var = (r45.wp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wp6Var.f389379d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wp6Var.f389380e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wp6Var.f389381f = aVar2.i(intValue);
        return 0;
    }
}
