package wi3;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f446165d;

    /* renamed from: e, reason: collision with root package name */
    public wi3.b f446166e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.a)) {
            return false;
        }
        wi3.a aVar = (wi3.a) fVar;
        return n51.f.a(this.f446165d, aVar.f446165d) && n51.f.a(this.f446166e, aVar.f446166e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f446165d;
            if (str != null) {
                fVar.j(1, str);
            }
            wi3.b bVar = this.f446166e;
            if (bVar != null) {
                fVar.i(2, bVar.computeSize());
                this.f446166e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f446165d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            wi3.b bVar2 = this.f446166e;
            return bVar2 != null ? j17 + b36.f.i(2, bVar2.computeSize()) : j17;
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
        wi3.a aVar3 = (wi3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f446165d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            wi3.b bVar3 = new wi3.b();
            if (bArr != null && bArr.length > 0) {
                bVar3.parseFrom(bArr);
            }
            aVar3.f446166e = bVar3;
        }
        return 0;
    }
}
