package r45;

/* loaded from: classes12.dex */
public class ji4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ki4 f377838d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ii4 f377839e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ji4)) {
            return false;
        }
        r45.ji4 ji4Var = (r45.ji4) fVar;
        return n51.f.a(this.f377838d, ji4Var.f377838d) && n51.f.a(this.f377839e, ji4Var.f377839e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ki4 ki4Var = this.f377838d;
            if (ki4Var != null) {
                fVar.i(1, ki4Var.computeSize());
                this.f377838d.writeFields(fVar);
            }
            r45.ii4 ii4Var = this.f377839e;
            if (ii4Var != null) {
                fVar.i(2, ii4Var.computeSize());
                this.f377839e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ki4 ki4Var2 = this.f377838d;
            int i18 = ki4Var2 != null ? 0 + b36.f.i(1, ki4Var2.computeSize()) : 0;
            r45.ii4 ii4Var2 = this.f377839e;
            return ii4Var2 != null ? i18 + b36.f.i(2, ii4Var2.computeSize()) : i18;
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
        r45.ji4 ji4Var = (r45.ji4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ki4 ki4Var3 = new r45.ki4();
                if (bArr != null && bArr.length > 0) {
                    ki4Var3.parseFrom(bArr);
                }
                ji4Var.f377838d = ki4Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ii4 ii4Var3 = new r45.ii4();
            if (bArr2 != null && bArr2.length > 0) {
                ii4Var3.parseFrom(bArr2);
            }
            ji4Var.f377839e = ii4Var3;
        }
        return 0;
    }
}
