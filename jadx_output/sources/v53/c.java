package v53;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f433330d;

    /* renamed from: e, reason: collision with root package name */
    public long f433331e;

    /* renamed from: f, reason: collision with root package name */
    public v53.m f433332f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.c)) {
            return false;
        }
        v53.c cVar = (v53.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f433330d), java.lang.Long.valueOf(cVar.f433330d)) && n51.f.a(java.lang.Long.valueOf(this.f433331e), java.lang.Long.valueOf(cVar.f433331e)) && n51.f.a(this.f433332f, cVar.f433332f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f433330d);
            fVar.h(2, this.f433331e);
            v53.m mVar = this.f433332f;
            if (mVar != null) {
                fVar.i(3, mVar.computeSize());
                this.f433332f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f433330d) + 0 + b36.f.h(2, this.f433331e);
            v53.m mVar2 = this.f433332f;
            return mVar2 != null ? h17 + b36.f.i(3, mVar2.computeSize()) : h17;
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
        v53.c cVar = (v53.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f433330d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            cVar.f433331e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            v53.m mVar3 = new v53.m();
            if (bArr != null && bArr.length > 0) {
                mVar3.parseFrom(bArr);
            }
            cVar.f433332f = mVar3;
        }
        return 0;
    }
}
