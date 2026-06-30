package r45;

/* loaded from: classes4.dex */
public class jt5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378099d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378100e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378101f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jt5)) {
            return false;
        }
        r45.jt5 jt5Var = (r45.jt5) fVar;
        return n51.f.a(this.f378099d, jt5Var.f378099d) && n51.f.a(this.f378100e, jt5Var.f378100e) && n51.f.a(this.f378101f, jt5Var.f378101f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378099d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378100e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378101f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378099d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f378100e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378101f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.jt5 jt5Var = (r45.jt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jt5Var.f378099d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jt5Var.f378100e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jt5Var.f378101f = aVar2.k(intValue);
        return 0;
    }
}
