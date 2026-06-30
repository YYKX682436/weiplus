package r45;

/* loaded from: classes7.dex */
public class ge7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f375179d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bl f375180e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ge7)) {
            return false;
        }
        r45.ge7 ge7Var = (r45.ge7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f375179d), java.lang.Boolean.valueOf(ge7Var.f375179d)) && n51.f.a(this.f375180e, ge7Var.f375180e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f375179d);
            r45.bl blVar = this.f375180e;
            if (blVar != null) {
                fVar.i(2, blVar.computeSize());
                this.f375180e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f375179d) + 0;
            r45.bl blVar2 = this.f375180e;
            return blVar2 != null ? a17 + b36.f.i(2, blVar2.computeSize()) : a17;
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
        r45.ge7 ge7Var = (r45.ge7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ge7Var.f375179d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.bl blVar3 = new r45.bl();
            if (bArr != null && bArr.length > 0) {
                blVar3.parseFrom(bArr);
            }
            ge7Var.f375180e = blVar3;
        }
        return 0;
    }
}
