package r45;

/* loaded from: classes2.dex */
public class tc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386315d;

    /* renamed from: e, reason: collision with root package name */
    public int f386316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f386317f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tc6)) {
            return false;
        }
        r45.tc6 tc6Var = (r45.tc6) fVar;
        return n51.f.a(this.f386315d, tc6Var.f386315d) && n51.f.a(java.lang.Integer.valueOf(this.f386316e), java.lang.Integer.valueOf(tc6Var.f386316e)) && n51.f.a(java.lang.Boolean.valueOf(this.f386317f), java.lang.Boolean.valueOf(tc6Var.f386317f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386315d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f386316e);
            fVar.a(3, this.f386317f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f386315d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f386316e) + b36.f.a(3, this.f386317f);
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
        r45.tc6 tc6Var = (r45.tc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tc6Var.f386315d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tc6Var.f386316e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        tc6Var.f386317f = aVar2.c(intValue);
        return 0;
    }
}
