package r45;

/* loaded from: classes4.dex */
public class tn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386583e;

    /* renamed from: f, reason: collision with root package name */
    public int f386584f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tn0)) {
            return false;
        }
        r45.tn0 tn0Var = (r45.tn0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386582d), java.lang.Long.valueOf(tn0Var.f386582d)) && n51.f.a(this.f386583e, tn0Var.f386583e) && n51.f.a(java.lang.Integer.valueOf(this.f386584f), java.lang.Integer.valueOf(tn0Var.f386584f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386582d);
            java.lang.String str = this.f386583e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f386584f);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386582d) + 0;
            java.lang.String str2 = this.f386583e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f386584f);
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
        r45.tn0 tn0Var = (r45.tn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tn0Var.f386582d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            tn0Var.f386583e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        tn0Var.f386584f = aVar2.g(intValue);
        return 0;
    }
}
