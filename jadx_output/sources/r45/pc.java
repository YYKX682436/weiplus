package r45;

/* loaded from: classes9.dex */
public class pc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f382935d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f382936e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pc)) {
            return false;
        }
        r45.pc pcVar = (r45.pc) fVar;
        return n51.f.a(this.f382935d, pcVar.f382935d) && n51.f.a(this.f382936e, pcVar.f382936e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f382935d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f382935d.writeFields(fVar);
            }
            r45.ig0 ig0Var = this.f382936e;
            if (ig0Var != null) {
                fVar.i(3, ig0Var.computeSize());
                this.f382936e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f382935d;
            int i18 = cu5Var2 != null ? 0 + b36.f.i(2, cu5Var2.computeSize()) : 0;
            r45.ig0 ig0Var2 = this.f382936e;
            return ig0Var2 != null ? i18 + b36.f.i(3, ig0Var2.computeSize()) : i18;
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
        r45.pc pcVar = (r45.pc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var3.b(bArr);
                }
                pcVar.f382935d = cu5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ig0 ig0Var3 = new r45.ig0();
            if (bArr2 != null && bArr2.length > 0) {
                ig0Var3.parseFrom(bArr2);
            }
            pcVar.f382936e = ig0Var3;
        }
        return 0;
    }
}
