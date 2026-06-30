package r45;

/* loaded from: classes8.dex */
public class qa7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ta7 f383795d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.qa7) && n51.f.a(this.f383795d, ((r45.qa7) fVar).f383795d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ta7 ta7Var = this.f383795d;
            if (ta7Var != null) {
                fVar.i(4, ta7Var.computeSize());
                this.f383795d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ta7 ta7Var2 = this.f383795d;
            if (ta7Var2 != null) {
                return 0 + b36.f.i(4, ta7Var2.computeSize());
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
        r45.qa7 qa7Var = (r45.qa7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ta7 ta7Var3 = new r45.ta7();
            if (bArr != null && bArr.length > 0) {
                ta7Var3.parseFrom(bArr);
            }
            qa7Var.f383795d = ta7Var3;
        }
        return 0;
    }
}
