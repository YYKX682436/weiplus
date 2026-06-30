package r45;

/* loaded from: classes4.dex */
public class lc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f379300d;

    /* renamed from: e, reason: collision with root package name */
    public double f379301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379304h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lc3)) {
            return false;
        }
        r45.lc3 lc3Var = (r45.lc3) fVar;
        return n51.f.a(this.BaseRequest, lc3Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f379300d), java.lang.Double.valueOf(lc3Var.f379300d)) && n51.f.a(java.lang.Double.valueOf(this.f379301e), java.lang.Double.valueOf(lc3Var.f379301e)) && n51.f.a(this.f379302f, lc3Var.f379302f) && n51.f.a(this.f379303g, lc3Var.f379303g) && n51.f.a(this.f379304h, lc3Var.f379304h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.c(2, this.f379300d);
            fVar.c(3, this.f379301e);
            java.lang.String str = this.f379302f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f379303g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f379304h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f379300d) + b36.f.c(3, this.f379301e);
            java.lang.String str4 = this.f379302f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f379303g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f379304h;
            return str6 != null ? i18 + b36.f.j(6, str6) : i18;
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
        r45.lc3 lc3Var = (r45.lc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    lc3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                lc3Var.f379300d = aVar2.e(intValue);
                return 0;
            case 3:
                lc3Var.f379301e = aVar2.e(intValue);
                return 0;
            case 4:
                lc3Var.f379302f = aVar2.k(intValue);
                return 0;
            case 5:
                lc3Var.f379303g = aVar2.k(intValue);
                return 0;
            case 6:
                lc3Var.f379304h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
