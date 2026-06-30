package r45;

/* loaded from: classes11.dex */
public class tj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f386508d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gl f386509e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vm f386510f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tj6)) {
            return false;
        }
        r45.tj6 tj6Var = (r45.tj6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f386508d), java.lang.Boolean.valueOf(tj6Var.f386508d)) && n51.f.a(this.f386509e, tj6Var.f386509e) && n51.f.a(this.f386510f, tj6Var.f386510f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f386508d);
            r45.gl glVar = this.f386509e;
            if (glVar != null) {
                fVar.i(2, glVar.computeSize());
                this.f386509e.writeFields(fVar);
            }
            r45.vm vmVar = this.f386510f;
            if (vmVar != null) {
                fVar.i(3, vmVar.computeSize());
                this.f386510f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f386508d) + 0;
            r45.gl glVar2 = this.f386509e;
            if (glVar2 != null) {
                a17 += b36.f.i(2, glVar2.computeSize());
            }
            r45.vm vmVar2 = this.f386510f;
            return vmVar2 != null ? a17 + b36.f.i(3, vmVar2.computeSize()) : a17;
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
        r45.tj6 tj6Var = (r45.tj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tj6Var.f386508d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.gl glVar3 = new r45.gl();
                if (bArr != null && bArr.length > 0) {
                    glVar3.parseFrom(bArr);
                }
                tj6Var.f386509e = glVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.vm vmVar3 = new r45.vm();
            if (bArr2 != null && bArr2.length > 0) {
                vmVar3.parseFrom(bArr2);
            }
            tj6Var.f386510f = vmVar3;
        }
        return 0;
    }
}
