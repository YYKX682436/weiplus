package r45;

/* loaded from: classes8.dex */
public class pv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383420d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383421e;

    /* renamed from: f, reason: collision with root package name */
    public int f383422f;

    /* renamed from: g, reason: collision with root package name */
    public int f383423g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pv6)) {
            return false;
        }
        r45.pv6 pv6Var = (r45.pv6) fVar;
        return n51.f.a(this.f383420d, pv6Var.f383420d) && n51.f.a(this.f383421e, pv6Var.f383421e) && n51.f.a(java.lang.Integer.valueOf(this.f383422f), java.lang.Integer.valueOf(pv6Var.f383422f)) && n51.f.a(java.lang.Integer.valueOf(this.f383423g), java.lang.Integer.valueOf(pv6Var.f383423g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383420d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383421e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f383422f);
            fVar.e(4, this.f383423g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383420d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f383421e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f383422f) + b36.f.e(4, this.f383423g);
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
        r45.pv6 pv6Var = (r45.pv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pv6Var.f383420d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pv6Var.f383421e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pv6Var.f383422f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        pv6Var.f383423g = aVar2.g(intValue);
        return 0;
    }
}
