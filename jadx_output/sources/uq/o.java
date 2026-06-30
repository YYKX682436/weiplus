package uq;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public uq.q f430179d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof uq.o) && n51.f.a(this.f430179d, ((uq.o) fVar).f430179d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            uq.q qVar = this.f430179d;
            if (qVar != null) {
                fVar.i(1, qVar.computeSize());
                this.f430179d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            uq.q qVar2 = this.f430179d;
            if (qVar2 != null) {
                return 0 + b36.f.i(1, qVar2.computeSize());
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
        uq.o oVar = (uq.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            uq.q qVar3 = new uq.q();
            if (bArr != null && bArr.length > 0) {
                qVar3.parseFrom(bArr);
            }
            oVar.f430179d = qVar3;
        }
        return 0;
    }
}
