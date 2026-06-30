package m53;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.o f323567d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof m53.b) && n51.f.a(this.f323567d, ((m53.b) fVar).f323567d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.o oVar = this.f323567d;
            if (oVar != null) {
                fVar.i(2, oVar.computeSize());
                this.f323567d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.o oVar2 = this.f323567d;
            if (oVar2 != null) {
                return 0 + b36.f.i(2, oVar2.computeSize());
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
        m53.b bVar = (m53.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.o oVar3 = new m53.o();
            if (bArr != null && bArr.length > 0) {
                oVar3.parseFrom(bArr);
            }
            bVar.f323567d = oVar3;
        }
        return 0;
    }
}
