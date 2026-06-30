package p45;

/* loaded from: classes11.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351951d;

    /* renamed from: e, reason: collision with root package name */
    public int f351952e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f351953f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.m)) {
            return false;
        }
        p45.m mVar = (p45.m) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351951d), java.lang.Integer.valueOf(mVar.f351951d)) && n51.f.a(java.lang.Integer.valueOf(this.f351952e), java.lang.Integer.valueOf(mVar.f351952e)) && n51.f.a(this.f351953f, mVar.f351953f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351953f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351951d);
            fVar.e(2, this.f351952e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f351951d) + 0 + b36.f.e(2, this.f351952e) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        p45.m mVar = (p45.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f351951d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mVar.f351952e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.n nVar = new p45.n();
            if (bArr2 != null && bArr2.length > 0) {
                nVar.parseFrom(bArr2);
            }
            mVar.f351953f.add(nVar);
        }
        return 0;
    }
}
