package r45;

/* loaded from: classes2.dex */
public class qj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384029d;

    /* renamed from: e, reason: collision with root package name */
    public int f384030e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qj)) {
            return false;
        }
        r45.qj qjVar = (r45.qj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384029d), java.lang.Integer.valueOf(qjVar.f384029d)) && n51.f.a(java.lang.Integer.valueOf(this.f384030e), java.lang.Integer.valueOf(qjVar.f384030e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384029d);
            fVar.e(2, this.f384030e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f384029d) + 0 + b36.f.e(2, this.f384030e);
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
        r45.qj qjVar = (r45.qj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qjVar.f384029d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        qjVar.f384030e = aVar2.g(intValue);
        return 0;
    }
}
