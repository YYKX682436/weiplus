package p45;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351876d;

    /* renamed from: e, reason: collision with root package name */
    public int f351877e;

    /* renamed from: f, reason: collision with root package name */
    public int f351878f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.a)) {
            return false;
        }
        p45.a aVar = (p45.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351876d), java.lang.Integer.valueOf(aVar.f351876d)) && n51.f.a(java.lang.Integer.valueOf(this.f351877e), java.lang.Integer.valueOf(aVar.f351877e)) && n51.f.a(java.lang.Integer.valueOf(this.f351878f), java.lang.Integer.valueOf(aVar.f351878f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351876d);
            fVar.e(2, this.f351877e);
            fVar.e(3, this.f351878f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f351876d) + 0 + b36.f.e(2, this.f351877e) + b36.f.e(3, this.f351878f);
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
        p45.a aVar3 = (p45.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f351876d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f351877e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aVar3.f351878f = aVar2.g(intValue);
        return 0;
    }
}
