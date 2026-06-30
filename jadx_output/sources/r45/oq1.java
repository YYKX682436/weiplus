package r45;

/* loaded from: classes4.dex */
public class oq1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382442e;

    /* renamed from: f, reason: collision with root package name */
    public long f382443f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oq1)) {
            return false;
        }
        r45.oq1 oq1Var = (r45.oq1) fVar;
        return n51.f.a(this.f382441d, oq1Var.f382441d) && n51.f.a(this.f382442e, oq1Var.f382442e) && n51.f.a(java.lang.Long.valueOf(this.f382443f), java.lang.Long.valueOf(oq1Var.f382443f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382441d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382442e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f382443f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f382441d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f382442e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f382443f);
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
        r45.oq1 oq1Var = (r45.oq1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oq1Var.f382441d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            oq1Var.f382442e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        oq1Var.f382443f = aVar2.i(intValue);
        return 0;
    }
}
