package r45;

/* loaded from: classes4.dex */
public class c67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.e67 f371339d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.c67) && n51.f.a(this.f371339d, ((r45.c67) fVar).f371339d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.e67 e67Var = this.f371339d;
            if (e67Var != null) {
                fVar.i(1, e67Var.computeSize());
                this.f371339d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.e67 e67Var2 = this.f371339d;
            if (e67Var2 != null) {
                return 0 + b36.f.i(1, e67Var2.computeSize());
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
        r45.c67 c67Var = (r45.c67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.e67 e67Var3 = new r45.e67();
            if (bArr != null && bArr.length > 0) {
                e67Var3.parseFrom(bArr);
            }
            c67Var.f371339d = e67Var3;
        }
        return 0;
    }
}
