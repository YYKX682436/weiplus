package r45;

/* loaded from: classes9.dex */
public class f32 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373980d;

    /* renamed from: e, reason: collision with root package name */
    public int f373981e;

    /* renamed from: f, reason: collision with root package name */
    public int f373982f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f32)) {
            return false;
        }
        r45.f32 f32Var = (r45.f32) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373980d), java.lang.Integer.valueOf(f32Var.f373980d)) && n51.f.a(java.lang.Integer.valueOf(this.f373981e), java.lang.Integer.valueOf(f32Var.f373981e)) && n51.f.a(java.lang.Integer.valueOf(this.f373982f), java.lang.Integer.valueOf(f32Var.f373982f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373980d);
            fVar.e(2, this.f373981e);
            fVar.e(3, this.f373982f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373980d) + 0 + b36.f.e(2, this.f373981e) + b36.f.e(3, this.f373982f);
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
        r45.f32 f32Var = (r45.f32) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f32Var.f373980d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f32Var.f373981e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        f32Var.f373982f = aVar2.g(intValue);
        return 0;
    }
}
