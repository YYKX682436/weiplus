package r45;

/* loaded from: classes4.dex */
public class cj4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371595d;

    /* renamed from: e, reason: collision with root package name */
    public int f371596e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371597f;

    /* renamed from: g, reason: collision with root package name */
    public r45.lj4 f371598g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cj4)) {
            return false;
        }
        r45.cj4 cj4Var = (r45.cj4) fVar;
        return n51.f.a(this.f371595d, cj4Var.f371595d) && n51.f.a(java.lang.Integer.valueOf(this.f371596e), java.lang.Integer.valueOf(cj4Var.f371596e)) && n51.f.a(this.f371597f, cj4Var.f371597f) && n51.f.a(this.f371598g, cj4Var.f371598g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371595d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371596e);
            java.lang.String str2 = this.f371597f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.lj4 lj4Var = this.f371598g;
            if (lj4Var != null) {
                fVar.i(4, lj4Var.computeSize());
                this.f371598g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f371595d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f371596e);
            java.lang.String str4 = this.f371597f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.lj4 lj4Var2 = this.f371598g;
            return lj4Var2 != null ? j17 + b36.f.i(4, lj4Var2.computeSize()) : j17;
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
        r45.cj4 cj4Var = (r45.cj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cj4Var.f371595d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cj4Var.f371596e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cj4Var.f371597f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.lj4 lj4Var3 = new r45.lj4();
            if (bArr != null && bArr.length > 0) {
                lj4Var3.parseFrom(bArr);
            }
            cj4Var.f371598g = lj4Var3;
        }
        return 0;
    }
}
