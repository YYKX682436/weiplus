package r45;

/* loaded from: classes4.dex */
public class cm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f371670d;

    /* renamed from: e, reason: collision with root package name */
    public long f371671e;

    /* renamed from: f, reason: collision with root package name */
    public int f371672f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm6)) {
            return false;
        }
        r45.cm6 cm6Var = (r45.cm6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f371670d), java.lang.Long.valueOf(cm6Var.f371670d)) && n51.f.a(java.lang.Long.valueOf(this.f371671e), java.lang.Long.valueOf(cm6Var.f371671e)) && n51.f.a(java.lang.Integer.valueOf(this.f371672f), java.lang.Integer.valueOf(cm6Var.f371672f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f371670d);
            fVar.h(2, this.f371671e);
            fVar.e(3, this.f371672f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f371670d) + 0 + b36.f.h(2, this.f371671e) + b36.f.e(3, this.f371672f);
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
        r45.cm6 cm6Var = (r45.cm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cm6Var.f371670d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            cm6Var.f371671e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cm6Var.f371672f = aVar2.g(intValue);
        return 0;
    }
}
