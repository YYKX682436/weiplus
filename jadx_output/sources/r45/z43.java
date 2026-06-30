package r45;

/* loaded from: classes9.dex */
public class z43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f391687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391688e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f391689f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f391690g = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z43)) {
            return false;
        }
        r45.z43 z43Var = (r45.z43) fVar;
        return n51.f.a(this.f391687d, z43Var.f391687d) && n51.f.a(this.f391688e, z43Var.f391688e) && n51.f.a(java.lang.Long.valueOf(this.f391689f), java.lang.Long.valueOf(z43Var.f391689f)) && n51.f.a(java.lang.Integer.valueOf(this.f391690g), java.lang.Integer.valueOf(z43Var.f391690g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f391687d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f391687d.writeFields(fVar);
            }
            java.lang.String str = this.f391688e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f391689f);
            fVar.e(4, this.f391690g);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f391687d;
            int i18 = bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0;
            java.lang.String str2 = this.f391688e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.f391689f) + b36.f.e(4, this.f391690g);
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
        r45.z43 z43Var = (r45.z43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                z43Var.f391688e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                z43Var.f391689f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            z43Var.f391690g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.parseFrom(bArr);
            }
            z43Var.f391687d = bn6Var3;
        }
        return 0;
    }
}
