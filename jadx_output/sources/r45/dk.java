package r45;

/* loaded from: classes4.dex */
public class dk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372533d;

    /* renamed from: e, reason: collision with root package name */
    public int f372534e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dk)) {
            return false;
        }
        r45.dk dkVar = (r45.dk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372533d), java.lang.Integer.valueOf(dkVar.f372533d)) && n51.f.a(java.lang.Integer.valueOf(this.f372534e), java.lang.Integer.valueOf(dkVar.f372534e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372533d);
            fVar.e(2, this.f372534e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372533d) + 0 + b36.f.e(2, this.f372534e);
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
        r45.dk dkVar = (r45.dk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dkVar.f372533d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        dkVar.f372534e = aVar2.g(intValue);
        return 0;
    }
}
