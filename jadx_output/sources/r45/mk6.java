package r45;

/* loaded from: classes8.dex */
public class mk6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380608d;

    /* renamed from: e, reason: collision with root package name */
    public int f380609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380610f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mk6)) {
            return false;
        }
        r45.mk6 mk6Var = (r45.mk6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380608d), java.lang.Integer.valueOf(mk6Var.f380608d)) && n51.f.a(java.lang.Integer.valueOf(this.f380609e), java.lang.Integer.valueOf(mk6Var.f380609e)) && n51.f.a(this.f380610f, mk6Var.f380610f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380608d);
            fVar.e(2, this.f380609e);
            java.lang.String str = this.f380610f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380608d) + 0 + b36.f.e(2, this.f380609e);
            java.lang.String str2 = this.f380610f;
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
        r45.mk6 mk6Var = (r45.mk6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mk6Var.f380608d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mk6Var.f380609e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        mk6Var.f380610f = aVar2.k(intValue);
        return 0;
    }
}
