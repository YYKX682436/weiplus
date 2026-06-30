package r45;

/* loaded from: classes4.dex */
public class vv4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388606d;

    /* renamed from: e, reason: collision with root package name */
    public long f388607e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv4)) {
            return false;
        }
        r45.vv4 vv4Var = (r45.vv4) fVar;
        return n51.f.a(this.f388606d, vv4Var.f388606d) && n51.f.a(java.lang.Long.valueOf(this.f388607e), java.lang.Long.valueOf(vv4Var.f388607e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388606d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f388607e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388606d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f388607e);
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
        r45.vv4 vv4Var = (r45.vv4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vv4Var.f388606d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        vv4Var.f388607e = aVar2.i(intValue);
        return 0;
    }
}
