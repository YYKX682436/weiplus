package m53;

/* loaded from: classes4.dex */
public class v1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f324120f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324121g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f324122h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f324123i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.v1)) {
            return false;
        }
        m53.v1 v1Var = (m53.v1) fVar;
        return n51.f.a(this.BaseRequest, v1Var.BaseRequest) && n51.f.a(this.f324118d, v1Var.f324118d) && n51.f.a(this.f324119e, v1Var.f324119e) && n51.f.a(java.lang.Boolean.valueOf(this.f324120f), java.lang.Boolean.valueOf(v1Var.f324120f)) && n51.f.a(this.f324121g, v1Var.f324121g) && n51.f.a(java.lang.Boolean.valueOf(this.f324122h), java.lang.Boolean.valueOf(v1Var.f324122h)) && n51.f.a(java.lang.Boolean.valueOf(this.f324123i), java.lang.Boolean.valueOf(v1Var.f324123i));
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
            java.lang.String str = this.f324118d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f324119e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f324120f);
            java.lang.String str3 = this.f324121g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.a(6, this.f324122h);
            fVar.a(7, this.f324123i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f324118d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f324119e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(4, this.f324120f);
            java.lang.String str6 = this.f324121g;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.a(6, this.f324122h) + b36.f.a(7, this.f324123i);
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
        m53.v1 v1Var = (m53.v1) objArr[1];
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
                    v1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                v1Var.f324118d = aVar2.k(intValue);
                return 0;
            case 3:
                v1Var.f324119e = aVar2.k(intValue);
                return 0;
            case 4:
                v1Var.f324120f = aVar2.c(intValue);
                return 0;
            case 5:
                v1Var.f324121g = aVar2.k(intValue);
                return 0;
            case 6:
                v1Var.f324122h = aVar2.c(intValue);
                return 0;
            case 7:
                v1Var.f324123i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
