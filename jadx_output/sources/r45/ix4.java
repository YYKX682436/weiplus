package r45;

/* loaded from: classes7.dex */
public class ix4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377391d;

    /* renamed from: e, reason: collision with root package name */
    public int f377392e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f377393f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f377394g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377395h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ix4)) {
            return false;
        }
        r45.ix4 ix4Var = (r45.ix4) fVar;
        return n51.f.a(this.BaseRequest, ix4Var.BaseRequest) && n51.f.a(this.f377391d, ix4Var.f377391d) && n51.f.a(java.lang.Integer.valueOf(this.f377392e), java.lang.Integer.valueOf(ix4Var.f377392e)) && n51.f.a(this.f377393f, ix4Var.f377393f) && n51.f.a(java.lang.Integer.valueOf(this.f377394g), java.lang.Integer.valueOf(ix4Var.f377394g)) && n51.f.a(this.f377395h, ix4Var.f377395h);
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
            java.lang.String str = this.f377391d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f377392e);
            fVar.g(4, 1, this.f377393f);
            fVar.e(5, this.f377394g);
            java.lang.String str2 = this.f377395h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377391d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f377392e) + b36.f.g(4, 1, this.f377393f) + b36.f.e(5, this.f377394g);
            java.lang.String str4 = this.f377395h;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377393f.clear();
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
        r45.ix4 ix4Var = (r45.ix4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ix4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ix4Var.f377391d = aVar2.k(intValue);
                return 0;
            case 3:
                ix4Var.f377392e = aVar2.g(intValue);
                return 0;
            case 4:
                ix4Var.f377393f.add(aVar2.k(intValue));
                return 0;
            case 5:
                ix4Var.f377394g = aVar2.g(intValue);
                return 0;
            case 6:
                ix4Var.f377395h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
