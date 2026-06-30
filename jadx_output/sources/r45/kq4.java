package r45;

/* loaded from: classes4.dex */
public class kq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378902d;

    /* renamed from: e, reason: collision with root package name */
    public int f378903e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378904f;

    /* renamed from: g, reason: collision with root package name */
    public int f378905g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kq4)) {
            return false;
        }
        r45.kq4 kq4Var = (r45.kq4) fVar;
        return n51.f.a(this.f378902d, kq4Var.f378902d) && n51.f.a(java.lang.Integer.valueOf(this.f378903e), java.lang.Integer.valueOf(kq4Var.f378903e)) && n51.f.a(this.f378904f, kq4Var.f378904f) && n51.f.a(java.lang.Integer.valueOf(this.f378905g), java.lang.Integer.valueOf(kq4Var.f378905g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378902d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378903e);
            java.lang.String str2 = this.f378904f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378905g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f378902d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f378903e);
            java.lang.String str4 = this.f378904f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f378905g);
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
        r45.kq4 kq4Var = (r45.kq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kq4Var.f378902d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kq4Var.f378903e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kq4Var.f378904f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        kq4Var.f378905g = aVar2.g(intValue);
        return 0;
    }
}
