package m53;

/* loaded from: classes4.dex */
public class v2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.x2 f324124d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof m53.v2) && n51.f.a(this.f324124d, ((m53.v2) fVar).f324124d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.x2 x2Var = this.f324124d;
            if (x2Var != null) {
                fVar.i(1, x2Var.computeSize());
                this.f324124d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.x2 x2Var2 = this.f324124d;
            if (x2Var2 != null) {
                return 0 + b36.f.i(1, x2Var2.computeSize());
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
        m53.v2 v2Var = (m53.v2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.x2 x2Var3 = new m53.x2();
            if (bArr != null && bArr.length > 0) {
                x2Var3.parseFrom(bArr);
            }
            v2Var.f324124d = x2Var3;
        }
        return 0;
    }
}
