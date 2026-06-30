package r45;

/* loaded from: classes8.dex */
public class e40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373001d;

    /* renamed from: e, reason: collision with root package name */
    public int f373002e;

    /* renamed from: f, reason: collision with root package name */
    public long f373003f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e40)) {
            return false;
        }
        r45.e40 e40Var = (r45.e40) fVar;
        return n51.f.a(this.f373001d, e40Var.f373001d) && n51.f.a(java.lang.Integer.valueOf(this.f373002e), java.lang.Integer.valueOf(e40Var.f373002e)) && n51.f.a(java.lang.Long.valueOf(this.f373003f), java.lang.Long.valueOf(e40Var.f373003f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373001d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f373002e);
            fVar.h(3, this.f373003f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f373001d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f373002e) + b36.f.h(3, this.f373003f);
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
        r45.e40 e40Var = (r45.e40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e40Var.f373001d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e40Var.f373002e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e40Var.f373003f = aVar2.i(intValue);
        return 0;
    }
}
