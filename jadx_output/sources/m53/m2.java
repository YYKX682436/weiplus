package m53;

/* loaded from: classes7.dex */
public class m2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f323896d;

    /* renamed from: e, reason: collision with root package name */
    public int f323897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323898f;

    /* renamed from: g, reason: collision with root package name */
    public int f323899g;

    /* renamed from: h, reason: collision with root package name */
    public int f323900h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323901i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m2)) {
            return false;
        }
        m53.m2 m2Var = (m53.m2) fVar;
        return n51.f.a(this.BaseRequest, m2Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f323896d), java.lang.Integer.valueOf(m2Var.f323896d)) && n51.f.a(java.lang.Integer.valueOf(this.f323897e), java.lang.Integer.valueOf(m2Var.f323897e)) && n51.f.a(this.f323898f, m2Var.f323898f) && n51.f.a(java.lang.Integer.valueOf(this.f323899g), java.lang.Integer.valueOf(m2Var.f323899g)) && n51.f.a(java.lang.Integer.valueOf(this.f323900h), java.lang.Integer.valueOf(m2Var.f323900h)) && n51.f.a(this.f323901i, m2Var.f323901i);
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
            fVar.e(2, this.f323896d);
            fVar.e(3, this.f323897e);
            java.lang.String str = this.f323898f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f323899g);
            fVar.e(6, this.f323900h);
            java.lang.String str2 = this.f323901i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f323896d) + b36.f.e(3, this.f323897e);
            java.lang.String str3 = this.f323898f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f323899g) + b36.f.e(6, this.f323900h);
            java.lang.String str4 = this.f323901i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        m53.m2 m2Var = (m53.m2) objArr[1];
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
                    m2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m2Var.f323896d = aVar2.g(intValue);
                return 0;
            case 3:
                m2Var.f323897e = aVar2.g(intValue);
                return 0;
            case 4:
                m2Var.f323898f = aVar2.k(intValue);
                return 0;
            case 5:
                m2Var.f323899g = aVar2.g(intValue);
                return 0;
            case 6:
                m2Var.f323900h = aVar2.g(intValue);
                return 0;
            case 7:
                m2Var.f323901i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
