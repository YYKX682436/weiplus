package r45;

/* loaded from: classes4.dex */
public class ym extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nm f391208d;

    /* renamed from: e, reason: collision with root package name */
    public int f391209e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ym)) {
            return false;
        }
        r45.ym ymVar = (r45.ym) fVar;
        return n51.f.a(this.f391208d, ymVar.f391208d) && n51.f.a(java.lang.Integer.valueOf(this.f391209e), java.lang.Integer.valueOf(ymVar.f391209e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nm nmVar = this.f391208d;
            if (nmVar != null) {
                fVar.i(1, nmVar.computeSize());
                this.f391208d.writeFields(fVar);
            }
            fVar.e(2, this.f391209e);
            return 0;
        }
        if (i17 == 1) {
            r45.nm nmVar2 = this.f391208d;
            return (nmVar2 != null ? 0 + b36.f.i(1, nmVar2.computeSize()) : 0) + b36.f.e(2, this.f391209e);
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
        r45.ym ymVar = (r45.ym) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            ymVar.f391209e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.nm nmVar3 = new r45.nm();
            if (bArr != null && bArr.length > 0) {
                nmVar3.parseFrom(bArr);
            }
            ymVar.f391208d = nmVar3;
        }
        return 0;
    }
}
