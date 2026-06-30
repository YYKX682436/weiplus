package r45;

/* loaded from: classes2.dex */
public class mi4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f380544d;

    /* renamed from: e, reason: collision with root package name */
    public float f380545e;

    /* renamed from: f, reason: collision with root package name */
    public float f380546f;

    /* renamed from: g, reason: collision with root package name */
    public float f380547g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mi4)) {
            return false;
        }
        r45.mi4 mi4Var = (r45.mi4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f380544d), java.lang.Float.valueOf(mi4Var.f380544d)) && n51.f.a(java.lang.Float.valueOf(this.f380545e), java.lang.Float.valueOf(mi4Var.f380545e)) && n51.f.a(java.lang.Float.valueOf(this.f380546f), java.lang.Float.valueOf(mi4Var.f380546f)) && n51.f.a(java.lang.Float.valueOf(this.f380547g), java.lang.Float.valueOf(mi4Var.f380547g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f380544d);
            fVar.d(2, this.f380545e);
            fVar.d(3, this.f380546f);
            fVar.d(4, this.f380547g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f380544d) + 0 + b36.f.d(2, this.f380545e) + b36.f.d(3, this.f380546f) + b36.f.d(4, this.f380547g);
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
        r45.mi4 mi4Var = (r45.mi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mi4Var.f380544d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            mi4Var.f380545e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            mi4Var.f380546f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mi4Var.f380547g = aVar2.f(intValue);
        return 0;
    }
}
