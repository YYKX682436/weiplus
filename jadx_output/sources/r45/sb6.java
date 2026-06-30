package r45;

/* loaded from: classes4.dex */
public class sb6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385617d;

    /* renamed from: e, reason: collision with root package name */
    public long f385618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f385619f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sb6)) {
            return false;
        }
        r45.sb6 sb6Var = (r45.sb6) fVar;
        return n51.f.a(this.f385617d, sb6Var.f385617d) && n51.f.a(java.lang.Long.valueOf(this.f385618e), java.lang.Long.valueOf(sb6Var.f385618e)) && n51.f.a(java.lang.Boolean.valueOf(this.f385619f), java.lang.Boolean.valueOf(sb6Var.f385619f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385617d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f385618e);
            fVar.a(3, this.f385619f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f385617d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f385618e) + b36.f.a(3, this.f385619f);
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
        r45.sb6 sb6Var = (r45.sb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sb6Var.f385617d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sb6Var.f385618e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sb6Var.f385619f = aVar2.c(intValue);
        return 0;
    }
}
