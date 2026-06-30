package r45;

/* loaded from: classes2.dex */
public class bi5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370784d;

    /* renamed from: e, reason: collision with root package name */
    public int f370785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370786f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bi5)) {
            return false;
        }
        r45.bi5 bi5Var = (r45.bi5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370784d), java.lang.Integer.valueOf(bi5Var.f370784d)) && n51.f.a(java.lang.Integer.valueOf(this.f370785e), java.lang.Integer.valueOf(bi5Var.f370785e)) && n51.f.a(this.f370786f, bi5Var.f370786f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370784d);
            fVar.e(2, this.f370785e);
            java.lang.String str = this.f370786f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370784d) + 0 + b36.f.e(2, this.f370785e);
            java.lang.String str2 = this.f370786f;
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
        r45.bi5 bi5Var = (r45.bi5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bi5Var.f370784d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bi5Var.f370785e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bi5Var.f370786f = aVar2.k(intValue);
        return 0;
    }
}
