package r45;

/* loaded from: classes4.dex */
public class pq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383297d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383298e;

    /* renamed from: f, reason: collision with root package name */
    public long f383299f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq)) {
            return false;
        }
        r45.pq pqVar = (r45.pq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383297d), java.lang.Integer.valueOf(pqVar.f383297d)) && n51.f.a(this.f383298e, pqVar.f383298e) && n51.f.a(java.lang.Long.valueOf(this.f383299f), java.lang.Long.valueOf(pqVar.f383299f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383297d);
            com.tencent.mm.protobuf.g gVar = this.f383298e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f383299f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383297d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f383298e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.h(3, this.f383299f);
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
        r45.pq pqVar = (r45.pq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pqVar.f383297d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pqVar.f383298e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pqVar.f383299f = aVar2.i(intValue);
        return 0;
    }
}
