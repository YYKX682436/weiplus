package o32;

/* loaded from: classes14.dex */
public class f extends o32.i {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342696e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342697f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.f)) {
            return false;
        }
        o32.f fVar2 = (o32.f) fVar;
        return n51.f.a(this.f342713d, fVar2.f342713d) && n51.f.a(this.f342696e, fVar2.f342696e) && n51.f.a(this.f342697f, fVar2.f342697f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.d dVar = this.f342713d;
            if (dVar != null) {
                fVar.i(1, dVar.computeSize());
                this.f342713d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f342696e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f342697f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            o32.d dVar2 = this.f342713d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f342696e;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f342697f;
            return gVar4 != null ? i18 + b36.f.b(3, gVar4) : i18;
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
        o32.f fVar2 = (o32.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                fVar2.f342696e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            fVar2.f342697f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            o32.d dVar3 = new o32.d();
            if (bArr != null && bArr.length > 0) {
                dVar3.parseFrom(bArr);
            }
            fVar2.f342713d = dVar3;
        }
        return 0;
    }
}
