package t45;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.d1 f415537d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof t45.d) && n51.f.a(this.f415537d, ((t45.d) fVar).f415537d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.d1 d1Var = this.f415537d;
            if (d1Var != null) {
                fVar.i(1, d1Var.computeSize());
                this.f415537d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            t45.d1 d1Var2 = this.f415537d;
            if (d1Var2 != null) {
                return 0 + b36.f.i(1, d1Var2.computeSize());
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
        t45.d dVar = (t45.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            t45.d1 d1Var3 = new t45.d1();
            if (bArr != null && bArr.length > 0) {
                d1Var3.parseFrom(bArr);
            }
            dVar.f415537d = d1Var3;
        }
        return 0;
    }
}
