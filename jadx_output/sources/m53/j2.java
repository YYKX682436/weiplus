package m53;

/* loaded from: classes7.dex */
public class j2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f323811d;

    /* renamed from: e, reason: collision with root package name */
    public int f323812e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323813f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f323814g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323815h;

    /* renamed from: i, reason: collision with root package name */
    public int f323816i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f323817m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j2)) {
            return false;
        }
        m53.j2 j2Var = (m53.j2) fVar;
        return n51.f.a(this.BaseRequest, j2Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f323811d), java.lang.Integer.valueOf(j2Var.f323811d)) && n51.f.a(java.lang.Integer.valueOf(this.f323812e), java.lang.Integer.valueOf(j2Var.f323812e)) && n51.f.a(this.f323813f, j2Var.f323813f) && n51.f.a(this.f323814g, j2Var.f323814g) && n51.f.a(this.f323815h, j2Var.f323815h) && n51.f.a(java.lang.Integer.valueOf(this.f323816i), java.lang.Integer.valueOf(j2Var.f323816i)) && n51.f.a(java.lang.Boolean.valueOf(this.f323817m), java.lang.Boolean.valueOf(j2Var.f323817m));
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
            fVar.e(2, this.f323811d);
            fVar.e(3, this.f323812e);
            java.lang.String str = this.f323813f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, this.f323814g);
            java.lang.String str2 = this.f323815h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f323816i);
            fVar.a(8, this.f323817m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f323811d) + b36.f.e(3, this.f323812e);
            java.lang.String str3 = this.f323813f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int g17 = i18 + b36.f.g(5, 1, this.f323814g);
            java.lang.String str4 = this.f323815h;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            return g17 + b36.f.e(7, this.f323816i) + b36.f.a(8, this.f323817m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f323814g.clear();
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
        m53.j2 j2Var = (m53.j2) objArr[1];
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
                    j2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                j2Var.f323811d = aVar2.g(intValue);
                return 0;
            case 3:
                j2Var.f323812e = aVar2.g(intValue);
                return 0;
            case 4:
                j2Var.f323813f = aVar2.k(intValue);
                return 0;
            case 5:
                j2Var.f323814g.add(aVar2.k(intValue));
                return 0;
            case 6:
                j2Var.f323815h = aVar2.k(intValue);
                return 0;
            case 7:
                j2Var.f323816i = aVar2.g(intValue);
                return 0;
            case 8:
                j2Var.f323817m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
