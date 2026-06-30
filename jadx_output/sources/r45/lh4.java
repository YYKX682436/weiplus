package r45;

/* loaded from: classes7.dex */
public class lh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379480d;

    /* renamed from: e, reason: collision with root package name */
    public int f379481e;

    /* renamed from: f, reason: collision with root package name */
    public int f379482f;

    /* renamed from: g, reason: collision with root package name */
    public int f379483g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh4)) {
            return false;
        }
        r45.lh4 lh4Var = (r45.lh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379480d), java.lang.Integer.valueOf(lh4Var.f379480d)) && n51.f.a(java.lang.Integer.valueOf(this.f379481e), java.lang.Integer.valueOf(lh4Var.f379481e)) && n51.f.a(java.lang.Integer.valueOf(this.f379482f), java.lang.Integer.valueOf(lh4Var.f379482f)) && n51.f.a(java.lang.Integer.valueOf(this.f379483g), java.lang.Integer.valueOf(lh4Var.f379483g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379480d);
            fVar.e(2, this.f379481e);
            fVar.e(3, this.f379482f);
            fVar.e(4, this.f379483g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379480d) + 0 + b36.f.e(2, this.f379481e) + b36.f.e(3, this.f379482f) + b36.f.e(4, this.f379483g);
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
        r45.lh4 lh4Var = (r45.lh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lh4Var.f379480d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lh4Var.f379481e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lh4Var.f379482f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        lh4Var.f379483g = aVar2.g(intValue);
        return 0;
    }
}
