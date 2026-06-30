package r45;

/* loaded from: classes14.dex */
public class pk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383128d;

    /* renamed from: e, reason: collision with root package name */
    public int f383129e;

    /* renamed from: f, reason: collision with root package name */
    public int f383130f;

    /* renamed from: g, reason: collision with root package name */
    public int f383131g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pk4)) {
            return false;
        }
        r45.pk4 pk4Var = (r45.pk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383128d), java.lang.Integer.valueOf(pk4Var.f383128d)) && n51.f.a(java.lang.Integer.valueOf(this.f383129e), java.lang.Integer.valueOf(pk4Var.f383129e)) && n51.f.a(java.lang.Integer.valueOf(this.f383130f), java.lang.Integer.valueOf(pk4Var.f383130f)) && n51.f.a(java.lang.Integer.valueOf(this.f383131g), java.lang.Integer.valueOf(pk4Var.f383131g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383128d);
            fVar.e(2, this.f383129e);
            fVar.e(3, this.f383130f);
            fVar.e(4, this.f383131g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f383128d) + 0 + b36.f.e(2, this.f383129e) + b36.f.e(3, this.f383130f) + b36.f.e(4, this.f383131g);
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
        r45.pk4 pk4Var = (r45.pk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pk4Var.f383128d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pk4Var.f383129e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            pk4Var.f383130f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        pk4Var.f383131g = aVar2.g(intValue);
        return 0;
    }
}
