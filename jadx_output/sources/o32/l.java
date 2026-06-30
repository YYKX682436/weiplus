package o32;

/* loaded from: classes9.dex */
public class l extends o32.j {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342717e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.l)) {
            return false;
        }
        o32.l lVar = (o32.l) fVar;
        return n51.f.a(this.f342714d, lVar.f342714d) && n51.f.a(this.f342717e, lVar.f342717e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.e eVar = this.f342714d;
            if (eVar != null) {
                fVar.i(1, eVar.computeSize());
                this.f342714d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f342717e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            o32.e eVar2 = this.f342714d;
            int i18 = eVar2 != null ? 0 + b36.f.i(1, eVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f342717e;
            return gVar2 != null ? i18 + b36.f.b(2, gVar2) : i18;
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
        o32.l lVar = (o32.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            lVar.f342717e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            o32.e eVar3 = new o32.e();
            if (bArr != null && bArr.length > 0) {
                eVar3.parseFrom(bArr);
            }
            lVar.f342714d = eVar3;
        }
        return 0;
    }
}
