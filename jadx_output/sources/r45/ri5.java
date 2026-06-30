package r45;

/* loaded from: classes8.dex */
public class ri5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.za7 f384938d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.ri5) && n51.f.a(this.f384938d, ((r45.ri5) fVar).f384938d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.za7 za7Var = this.f384938d;
            if (za7Var != null) {
                fVar.i(1, za7Var.computeSize());
                this.f384938d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.za7 za7Var2 = this.f384938d;
            if (za7Var2 != null) {
                return 0 + b36.f.i(1, za7Var2.computeSize());
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
        r45.ri5 ri5Var = (r45.ri5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.za7 za7Var3 = new r45.za7();
            if (bArr != null && bArr.length > 0) {
                za7Var3.parseFrom(bArr);
            }
            ri5Var.f384938d = za7Var3;
        }
        return 0;
    }
}
