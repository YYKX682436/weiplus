package r45;

/* loaded from: classes8.dex */
public class u14 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386942d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386943e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386944f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386945g;

    /* renamed from: h, reason: collision with root package name */
    public int f386946h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u14)) {
            return false;
        }
        r45.u14 u14Var = (r45.u14) fVar;
        return n51.f.a(this.BaseRequest, u14Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386942d), java.lang.Integer.valueOf(u14Var.f386942d)) && n51.f.a(this.f386943e, u14Var.f386943e) && n51.f.a(this.f386944f, u14Var.f386944f) && n51.f.a(this.f386945g, u14Var.f386945g) && n51.f.a(java.lang.Integer.valueOf(this.f386946h), java.lang.Integer.valueOf(u14Var.f386946h));
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
            fVar.e(2, this.f386942d);
            java.lang.String str = this.f386943e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386944f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386945g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f386946h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386942d);
            java.lang.String str4 = this.f386943e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f386944f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f386945g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f386946h);
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
        r45.u14 u14Var = (r45.u14) objArr[1];
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
                    u14Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u14Var.f386942d = aVar2.g(intValue);
                return 0;
            case 3:
                u14Var.f386943e = aVar2.k(intValue);
                return 0;
            case 4:
                u14Var.f386944f = aVar2.k(intValue);
                return 0;
            case 5:
                u14Var.f386945g = aVar2.k(intValue);
                return 0;
            case 6:
                u14Var.f386946h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
