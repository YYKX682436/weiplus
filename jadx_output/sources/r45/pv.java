package r45;

/* loaded from: classes9.dex */
public class pv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383412d;

    /* renamed from: e, reason: collision with root package name */
    public int f383413e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383414f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pv)) {
            return false;
        }
        r45.pv pvVar = (r45.pv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383412d), java.lang.Integer.valueOf(pvVar.f383412d)) && n51.f.a(java.lang.Integer.valueOf(this.f383413e), java.lang.Integer.valueOf(pvVar.f383413e)) && n51.f.a(this.f383414f, pvVar.f383414f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383412d);
            fVar.e(2, this.f383413e);
            java.lang.String str = this.f383414f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383412d) + 0 + b36.f.e(2, this.f383413e);
            java.lang.String str2 = this.f383414f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        r45.pv pvVar = (r45.pv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pvVar.f383412d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pvVar.f383413e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pvVar.f383414f = aVar2.k(intValue);
        return 0;
    }
}
