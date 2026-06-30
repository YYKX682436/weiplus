package d02;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.i f225318d;

    /* renamed from: e, reason: collision with root package name */
    public d02.i f225319e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.h)) {
            return false;
        }
        d02.h hVar = (d02.h) fVar;
        return n51.f.a(this.f225318d, hVar.f225318d) && n51.f.a(this.f225319e, hVar.f225319e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.i iVar = this.f225318d;
            if (iVar != null) {
                fVar.i(1, iVar.computeSize());
                this.f225318d.writeFields(fVar);
            }
            d02.i iVar2 = this.f225319e;
            if (iVar2 != null) {
                fVar.i(2, iVar2.computeSize());
                this.f225319e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.i iVar3 = this.f225318d;
            int i18 = iVar3 != null ? 0 + b36.f.i(1, iVar3.computeSize()) : 0;
            d02.i iVar4 = this.f225319e;
            return iVar4 != null ? i18 + b36.f.i(2, iVar4.computeSize()) : i18;
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
        d02.h hVar = (d02.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.i iVar5 = new d02.i();
                if (bArr != null && bArr.length > 0) {
                    iVar5.parseFrom(bArr);
                }
                hVar.f225318d = iVar5;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.i iVar6 = new d02.i();
            if (bArr2 != null && bArr2.length > 0) {
                iVar6.parseFrom(bArr2);
            }
            hVar.f225319e = iVar6;
        }
        return 0;
    }
}
