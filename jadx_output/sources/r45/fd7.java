package r45;

/* loaded from: classes7.dex */
public class fd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374246d;

    /* renamed from: e, reason: collision with root package name */
    public int f374247e;

    /* renamed from: f, reason: collision with root package name */
    public int f374248f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd7)) {
            return false;
        }
        r45.fd7 fd7Var = (r45.fd7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374246d), java.lang.Integer.valueOf(fd7Var.f374246d)) && n51.f.a(java.lang.Integer.valueOf(this.f374247e), java.lang.Integer.valueOf(fd7Var.f374247e)) && n51.f.a(java.lang.Integer.valueOf(this.f374248f), java.lang.Integer.valueOf(fd7Var.f374248f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374246d);
            fVar.e(2, this.f374247e);
            fVar.e(3, this.f374248f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f374246d) + 0 + b36.f.e(2, this.f374247e) + b36.f.e(3, this.f374248f);
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
        r45.fd7 fd7Var = (r45.fd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fd7Var.f374246d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fd7Var.f374247e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        fd7Var.f374248f = aVar2.g(intValue);
        return 0;
    }
}
