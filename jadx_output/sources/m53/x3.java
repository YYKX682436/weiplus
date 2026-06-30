package m53;

/* loaded from: classes8.dex */
public class x3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324172d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324173e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324174f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.x3)) {
            return false;
        }
        m53.x3 x3Var = (m53.x3) fVar;
        return n51.f.a(this.f324172d, x3Var.f324172d) && n51.f.a(this.f324173e, x3Var.f324173e) && n51.f.a(this.f324174f, x3Var.f324174f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324172d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324173e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324174f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f324172d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f324173e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f324174f;
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
        m53.x3 x3Var = (m53.x3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x3Var.f324172d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x3Var.f324173e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        x3Var.f324174f = aVar2.k(intValue);
        return 0;
    }
}
