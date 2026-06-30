package r45;

/* loaded from: classes9.dex */
public class kw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379001d;

    /* renamed from: e, reason: collision with root package name */
    public long f379002e;

    /* renamed from: f, reason: collision with root package name */
    public int f379003f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kw4)) {
            return false;
        }
        r45.kw4 kw4Var = (r45.kw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379001d), java.lang.Integer.valueOf(kw4Var.f379001d)) && n51.f.a(java.lang.Long.valueOf(this.f379002e), java.lang.Long.valueOf(kw4Var.f379002e)) && n51.f.a(java.lang.Integer.valueOf(this.f379003f), java.lang.Integer.valueOf(kw4Var.f379003f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379001d);
            fVar.h(2, this.f379002e);
            fVar.e(3, this.f379003f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379001d) + 0 + b36.f.h(2, this.f379002e) + b36.f.e(3, this.f379003f);
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
        r45.kw4 kw4Var = (r45.kw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kw4Var.f379001d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            kw4Var.f379002e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        kw4Var.f379003f = aVar2.g(intValue);
        return 0;
    }
}
