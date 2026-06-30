package m53;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.r f323931d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof m53.o) && n51.f.a(this.f323931d, ((m53.o) fVar).f323931d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.r rVar = this.f323931d;
            if (rVar != null) {
                fVar.i(13, rVar.computeSize());
                this.f323931d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.r rVar2 = this.f323931d;
            if (rVar2 != null) {
                return 0 + b36.f.i(13, rVar2.computeSize());
            }
            return 0;
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
        m53.o oVar = (m53.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 13) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.r rVar3 = new m53.r();
            if (bArr != null && bArr.length > 0) {
                rVar3.parseFrom(bArr);
            }
            oVar.f323931d = rVar3;
        }
        return 0;
    }
}
