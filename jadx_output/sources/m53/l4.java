package m53;

/* loaded from: classes2.dex */
public class l4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.g6 f323882d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof m53.l4) && n51.f.a(this.f323882d, ((m53.l4) fVar).f323882d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.g6 g6Var = this.f323882d;
            if (g6Var != null) {
                fVar.i(1, g6Var.computeSize());
                this.f323882d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.g6 g6Var2 = this.f323882d;
            if (g6Var2 != null) {
                return 0 + b36.f.i(1, g6Var2.computeSize());
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
        m53.l4 l4Var = (m53.l4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.g6 g6Var3 = new m53.g6();
            if (bArr != null && bArr.length > 0) {
                g6Var3.parseFrom(bArr);
            }
            l4Var.f323882d = g6Var3;
        }
        return 0;
    }
}
