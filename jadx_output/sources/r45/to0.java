package r45;

/* loaded from: classes2.dex */
public class to0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386623d;

    /* renamed from: e, reason: collision with root package name */
    public int f386624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386625f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386626g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.to0)) {
            return false;
        }
        r45.to0 to0Var = (r45.to0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386623d), java.lang.Integer.valueOf(to0Var.f386623d)) && n51.f.a(java.lang.Integer.valueOf(this.f386624e), java.lang.Integer.valueOf(to0Var.f386624e)) && n51.f.a(this.f386625f, to0Var.f386625f) && n51.f.a(this.f386626g, to0Var.f386626g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386623d);
            fVar.e(2, this.f386624e);
            java.lang.String str = this.f386625f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386626g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386623d) + 0 + b36.f.e(2, this.f386624e);
            java.lang.String str3 = this.f386625f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f386626g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.to0 to0Var = (r45.to0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            to0Var.f386623d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            to0Var.f386624e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            to0Var.f386625f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        to0Var.f386626g = aVar2.k(intValue);
        return 0;
    }
}
