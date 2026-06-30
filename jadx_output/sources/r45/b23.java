package r45;

/* loaded from: classes2.dex */
public class b23 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370450e;

    /* renamed from: f, reason: collision with root package name */
    public int f370451f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sd1 f370452g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b23)) {
            return false;
        }
        r45.b23 b23Var = (r45.b23) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370449d), java.lang.Integer.valueOf(b23Var.f370449d)) && n51.f.a(this.f370450e, b23Var.f370450e) && n51.f.a(java.lang.Integer.valueOf(this.f370451f), java.lang.Integer.valueOf(b23Var.f370451f)) && n51.f.a(this.f370452g, b23Var.f370452g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370449d);
            java.lang.String str = this.f370450e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f370451f);
            r45.sd1 sd1Var = this.f370452g;
            if (sd1Var != null) {
                fVar.i(4, sd1Var.computeSize());
                this.f370452g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370449d) + 0;
            java.lang.String str2 = this.f370450e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.f370451f);
            r45.sd1 sd1Var2 = this.f370452g;
            return sd1Var2 != null ? e18 + b36.f.i(4, sd1Var2.computeSize()) : e18;
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
        r45.b23 b23Var = (r45.b23) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b23Var.f370449d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            b23Var.f370450e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            b23Var.f370451f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.sd1 sd1Var3 = new r45.sd1();
            if (bArr != null && bArr.length > 0) {
                sd1Var3.parseFrom(bArr);
            }
            b23Var.f370452g = sd1Var3;
        }
        return 0;
    }
}
