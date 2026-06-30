package r45;

/* loaded from: classes4.dex */
public class sv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.xy0 f385983d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.sv5) && n51.f.a(this.f385983d, ((r45.sv5) fVar).f385983d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.xy0 xy0Var = this.f385983d;
            if (xy0Var != null) {
                fVar.i(1, xy0Var.computeSize());
                this.f385983d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.xy0 xy0Var2 = this.f385983d;
            if (xy0Var2 != null) {
                return 0 + b36.f.i(1, xy0Var2.computeSize());
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
        r45.sv5 sv5Var = (r45.sv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.xy0 xy0Var3 = new r45.xy0();
            if (bArr != null && bArr.length > 0) {
                xy0Var3.parseFrom(bArr);
            }
            sv5Var.f385983d = xy0Var3;
        }
        return 0;
    }
}
