package r45;

/* loaded from: classes2.dex */
public class cz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371949d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gz6 f371950e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ez6 f371951f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cz6)) {
            return false;
        }
        r45.cz6 cz6Var = (r45.cz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371949d), java.lang.Integer.valueOf(cz6Var.f371949d)) && n51.f.a(this.f371950e, cz6Var.f371950e) && n51.f.a(this.f371951f, cz6Var.f371951f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371949d);
            r45.gz6 gz6Var = this.f371950e;
            if (gz6Var != null) {
                fVar.i(2, gz6Var.computeSize());
                this.f371950e.writeFields(fVar);
            }
            r45.ez6 ez6Var = this.f371951f;
            if (ez6Var != null) {
                fVar.i(3, ez6Var.computeSize());
                this.f371951f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371949d) + 0;
            r45.gz6 gz6Var2 = this.f371950e;
            if (gz6Var2 != null) {
                e17 += b36.f.i(2, gz6Var2.computeSize());
            }
            r45.ez6 ez6Var2 = this.f371951f;
            return ez6Var2 != null ? e17 + b36.f.i(3, ez6Var2.computeSize()) : e17;
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
        r45.cz6 cz6Var = (r45.cz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cz6Var.f371949d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.gz6 gz6Var3 = new r45.gz6();
                if (bArr != null && bArr.length > 0) {
                    gz6Var3.parseFrom(bArr);
                }
                cz6Var.f371950e = gz6Var3;
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
            r45.ez6 ez6Var3 = new r45.ez6();
            if (bArr2 != null && bArr2.length > 0) {
                ez6Var3.parseFrom(bArr2);
            }
            cz6Var.f371951f = ez6Var3;
        }
        return 0;
    }
}
