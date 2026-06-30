package r45;

/* loaded from: classes9.dex */
public class he6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f376098d;

    /* renamed from: e, reason: collision with root package name */
    public int f376099e;

    /* renamed from: f, reason: collision with root package name */
    public int f376100f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he6)) {
            return false;
        }
        r45.he6 he6Var = (r45.he6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f376098d), java.lang.Boolean.valueOf(he6Var.f376098d)) && n51.f.a(java.lang.Integer.valueOf(this.f376099e), java.lang.Integer.valueOf(he6Var.f376099e)) && n51.f.a(java.lang.Integer.valueOf(this.f376100f), java.lang.Integer.valueOf(he6Var.f376100f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f376098d);
            fVar.e(2, this.f376099e);
            fVar.e(3, this.f376100f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f376098d) + 0 + b36.f.e(2, this.f376099e) + b36.f.e(3, this.f376100f);
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
        r45.he6 he6Var = (r45.he6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            he6Var.f376098d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            he6Var.f376099e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        he6Var.f376100f = aVar2.g(intValue);
        return 0;
    }
}
