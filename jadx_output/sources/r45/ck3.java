package r45;

/* loaded from: classes9.dex */
public class ck3 extends com.tencent.mm.protobuf.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f371618d;

    /* renamed from: e, reason: collision with root package name */
    public r45.a05 f371619e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ck3)) {
            return false;
        }
        r45.ck3 ck3Var = (r45.ck3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371618d), java.lang.Integer.valueOf(ck3Var.f371618d)) && n51.f.a(this.f371619e, ck3Var.f371619e);
    }

    @Override // r45.k66
    public final int getRet() {
        return this.f371618d;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371618d);
            r45.a05 a05Var = this.f371619e;
            if (a05Var != null) {
                fVar.i(2, a05Var.computeSize());
                this.f371619e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371618d) + 0;
            r45.a05 a05Var2 = this.f371619e;
            return a05Var2 != null ? e17 + b36.f.i(2, a05Var2.computeSize()) : e17;
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
        r45.ck3 ck3Var = (r45.ck3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ck3Var.f371618d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.a05 a05Var3 = new r45.a05();
            if (bArr != null && bArr.length > 0) {
                a05Var3.parseFrom(bArr);
            }
            ck3Var.f371619e = a05Var3;
        }
        return 0;
    }
}
