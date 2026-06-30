package o32;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f342718d;

    /* renamed from: e, reason: collision with root package name */
    public int f342719e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.m)) {
            return false;
        }
        o32.m mVar = (o32.m) fVar;
        return n51.f.a(this.f342718d, mVar.f342718d) && n51.f.a(java.lang.Integer.valueOf(this.f342719e), java.lang.Integer.valueOf(mVar.f342719e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f342718d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f342718d.writeFields(fVar);
            }
            fVar.e(2, this.f342719e);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f342718d;
            return (cVar2 != null ? 0 + b36.f.i(1, cVar2.computeSize()) : 0) + b36.f.e(2, this.f342719e);
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
        o32.m mVar = (o32.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            mVar.f342719e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            o32.c cVar3 = new o32.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.parseFrom(bArr);
            }
            mVar.f342718d = cVar3;
        }
        return 0;
    }
}
