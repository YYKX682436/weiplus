package r45;

/* loaded from: classes2.dex */
public class fs0 extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<r45.xj6> field_info = new java.util.LinkedList<>();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.fs0) && n51.f.a(this.field_info, ((r45.fs0) fVar).field_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.field_info);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.field_info) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.field_info.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.fs0 fs0Var = (r45.fs0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xj6 xj6Var = new r45.xj6();
            if (bArr2 != null && bArr2.length > 0) {
                xj6Var.parseFrom(bArr2);
            }
            fs0Var.field_info.add(xj6Var);
        }
        return 0;
    }
}
