package r45;

/* loaded from: classes7.dex */
public class gy5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375643e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375644f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375645g;

    /* renamed from: h, reason: collision with root package name */
    public int f375646h;

    /* renamed from: i, reason: collision with root package name */
    public int f375647i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375648m;

    /* renamed from: n, reason: collision with root package name */
    public int f375649n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gy5)) {
            return false;
        }
        r45.gy5 gy5Var = (r45.gy5) fVar;
        return n51.f.a(this.BaseRequest, gy5Var.BaseRequest) && n51.f.a(this.f375642d, gy5Var.f375642d) && n51.f.a(this.f375643e, gy5Var.f375643e) && n51.f.a(this.f375644f, gy5Var.f375644f) && n51.f.a(this.f375645g, gy5Var.f375645g) && n51.f.a(java.lang.Integer.valueOf(this.f375646h), java.lang.Integer.valueOf(gy5Var.f375646h)) && n51.f.a(java.lang.Integer.valueOf(this.f375647i), java.lang.Integer.valueOf(gy5Var.f375647i)) && n51.f.a(this.f375648m, gy5Var.f375648m) && n51.f.a(java.lang.Integer.valueOf(this.f375649n), java.lang.Integer.valueOf(gy5Var.f375649n));
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
            java.lang.String str = this.f375642d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375643e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375644f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375645g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f375646h);
            fVar.e(7, this.f375647i);
            java.lang.String str5 = this.f375648m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f375649n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f375642d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f375643e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f375644f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f375645g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f375646h) + b36.f.e(7, this.f375647i);
            java.lang.String str10 = this.f375648m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f375649n);
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
        r45.gy5 gy5Var = (r45.gy5) objArr[1];
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
                    gy5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gy5Var.f375642d = aVar2.k(intValue);
                return 0;
            case 3:
                gy5Var.f375643e = aVar2.k(intValue);
                return 0;
            case 4:
                gy5Var.f375644f = aVar2.k(intValue);
                return 0;
            case 5:
                gy5Var.f375645g = aVar2.k(intValue);
                return 0;
            case 6:
                gy5Var.f375646h = aVar2.g(intValue);
                return 0;
            case 7:
                gy5Var.f375647i = aVar2.g(intValue);
                return 0;
            case 8:
                gy5Var.f375648m = aVar2.k(intValue);
                return 0;
            case 9:
                gy5Var.f375649n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
