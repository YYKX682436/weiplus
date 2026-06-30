package r45;

/* loaded from: classes9.dex */
public class zq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392300d;

    /* renamed from: e, reason: collision with root package name */
    public int f392301e;

    /* renamed from: f, reason: collision with root package name */
    public long f392302f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zq)) {
            return false;
        }
        r45.zq zqVar = (r45.zq) fVar;
        return n51.f.a(this.f392300d, zqVar.f392300d) && n51.f.a(java.lang.Integer.valueOf(this.f392301e), java.lang.Integer.valueOf(zqVar.f392301e)) && n51.f.a(java.lang.Long.valueOf(this.f392302f), java.lang.Long.valueOf(zqVar.f392302f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392300d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f392301e);
            fVar.h(3, this.f392302f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f392300d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f392301e) + b36.f.h(3, this.f392302f);
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
        r45.zq zqVar = (r45.zq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zqVar.f392300d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zqVar.f392301e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        zqVar.f392302f = aVar2.i(intValue);
        return 0;
    }
}
