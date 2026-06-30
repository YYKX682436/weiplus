package r45;

/* loaded from: classes4.dex */
public class pa6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382913d;

    /* renamed from: e, reason: collision with root package name */
    public long f382914e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382915f;

    /* renamed from: g, reason: collision with root package name */
    public int f382916g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f382917h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f382918i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pa6)) {
            return false;
        }
        r45.pa6 pa6Var = (r45.pa6) fVar;
        return n51.f.a(this.BaseRequest, pa6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382913d), java.lang.Integer.valueOf(pa6Var.f382913d)) && n51.f.a(java.lang.Long.valueOf(this.f382914e), java.lang.Long.valueOf(pa6Var.f382914e)) && n51.f.a(this.f382915f, pa6Var.f382915f) && n51.f.a(java.lang.Integer.valueOf(this.f382916g), java.lang.Integer.valueOf(pa6Var.f382916g)) && n51.f.a(this.f382917h, pa6Var.f382917h) && n51.f.a(java.lang.Integer.valueOf(this.f382918i), java.lang.Integer.valueOf(pa6Var.f382918i));
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
            fVar.e(2, this.f382913d);
            fVar.h(3, this.f382914e);
            java.lang.String str = this.f382915f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f382916g);
            fVar.g(6, 8, this.f382917h);
            fVar.e(7, this.f382918i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382913d) + b36.f.h(3, this.f382914e);
            java.lang.String str2 = this.f382915f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f382916g) + b36.f.g(6, 8, this.f382917h) + b36.f.e(7, this.f382918i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f382917h.clear();
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
        r45.pa6 pa6Var = (r45.pa6) objArr[1];
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
                    pa6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pa6Var.f382913d = aVar2.g(intValue);
                return 0;
            case 3:
                pa6Var.f382914e = aVar2.i(intValue);
                return 0;
            case 4:
                pa6Var.f382915f = aVar2.k(intValue);
                return 0;
            case 5:
                pa6Var.f382916g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    pa6Var.f382917h.add(du5Var);
                }
                return 0;
            case 7:
                pa6Var.f382918i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
