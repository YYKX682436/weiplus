package r45;

/* loaded from: classes4.dex */
public class vb7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388085d;

    /* renamed from: e, reason: collision with root package name */
    public int f388086e;

    /* renamed from: f, reason: collision with root package name */
    public int f388087f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb7)) {
            return false;
        }
        r45.vb7 vb7Var = (r45.vb7) fVar;
        return n51.f.a(this.f388085d, vb7Var.f388085d) && n51.f.a(java.lang.Integer.valueOf(this.f388086e), java.lang.Integer.valueOf(vb7Var.f388086e)) && n51.f.a(java.lang.Integer.valueOf(this.f388087f), java.lang.Integer.valueOf(vb7Var.f388087f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388085d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f388086e);
            fVar.e(3, this.f388087f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388085d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f388086e) + b36.f.e(3, this.f388087f);
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
        r45.vb7 vb7Var = (r45.vb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vb7Var.f388085d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            vb7Var.f388086e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        vb7Var.f388087f = aVar2.g(intValue);
        return 0;
    }
}
