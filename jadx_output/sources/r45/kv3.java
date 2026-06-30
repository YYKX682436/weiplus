package r45;

/* loaded from: classes2.dex */
public class kv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f378978d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.kv3) && n51.f.a(this.f378978d, ((r45.kv3) fVar).f378978d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f378978d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f378978d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f378978d;
            if (rl6Var2 != null) {
                return 0 + b36.f.i(1, rl6Var2.computeSize());
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
        r45.kv3 kv3Var = (r45.kv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr != null && bArr.length > 0) {
                rl6Var3.parseFrom(bArr);
            }
            kv3Var.f378978d = rl6Var3;
        }
        return 0;
    }
}
