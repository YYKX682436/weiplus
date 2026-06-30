package r45;

/* loaded from: classes7.dex */
public class ut4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ab7 f387641d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.ut4) && n51.f.a(this.f387641d, ((r45.ut4) fVar).f387641d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ab7 ab7Var = this.f387641d;
            if (ab7Var != null) {
                fVar.i(1, ab7Var.computeSize());
                this.f387641d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ab7 ab7Var2 = this.f387641d;
            if (ab7Var2 != null) {
                return 0 + b36.f.i(1, ab7Var2.computeSize());
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
        r45.ut4 ut4Var = (r45.ut4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ab7 ab7Var3 = new r45.ab7();
            if (bArr != null && bArr.length > 0) {
                ab7Var3.parseFrom(bArr);
            }
            ut4Var.f387641d = ab7Var3;
        }
        return 0;
    }
}
