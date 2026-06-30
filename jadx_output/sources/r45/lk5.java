package r45;

/* loaded from: classes4.dex */
public class lk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379560d;

    /* renamed from: e, reason: collision with root package name */
    public long f379561e;

    /* renamed from: f, reason: collision with root package name */
    public long f379562f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lk5)) {
            return false;
        }
        r45.lk5 lk5Var = (r45.lk5) fVar;
        return n51.f.a(this.f379560d, lk5Var.f379560d) && n51.f.a(java.lang.Long.valueOf(this.f379561e), java.lang.Long.valueOf(lk5Var.f379561e)) && n51.f.a(java.lang.Long.valueOf(this.f379562f), java.lang.Long.valueOf(lk5Var.f379562f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379560d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f379561e);
            fVar.h(3, this.f379562f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f379560d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f379561e) + b36.f.h(3, this.f379562f);
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
        r45.lk5 lk5Var = (r45.lk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lk5Var.f379560d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lk5Var.f379561e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        lk5Var.f379562f = aVar2.i(intValue);
        return 0;
    }
}
