package r45;

/* loaded from: classes9.dex */
public class ug5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387363d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387364e;

    /* renamed from: f, reason: collision with root package name */
    public int f387365f;

    /* renamed from: g, reason: collision with root package name */
    public int f387366g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387367h;

    /* renamed from: i, reason: collision with root package name */
    public int f387368i;

    /* renamed from: m, reason: collision with root package name */
    public int f387369m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387370n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug5)) {
            return false;
        }
        r45.ug5 ug5Var = (r45.ug5) fVar;
        return n51.f.a(this.BaseRequest, ug5Var.BaseRequest) && n51.f.a(this.f387363d, ug5Var.f387363d) && n51.f.a(this.f387364e, ug5Var.f387364e) && n51.f.a(java.lang.Integer.valueOf(this.f387365f), java.lang.Integer.valueOf(ug5Var.f387365f)) && n51.f.a(java.lang.Integer.valueOf(this.f387366g), java.lang.Integer.valueOf(ug5Var.f387366g)) && n51.f.a(this.f387367h, ug5Var.f387367h) && n51.f.a(java.lang.Integer.valueOf(this.f387368i), java.lang.Integer.valueOf(ug5Var.f387368i)) && n51.f.a(java.lang.Integer.valueOf(this.f387369m), java.lang.Integer.valueOf(ug5Var.f387369m)) && n51.f.a(this.f387370n, ug5Var.f387370n);
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
            java.lang.String str = this.f387363d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387364e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387365f);
            fVar.e(5, this.f387366g);
            java.lang.String str3 = this.f387367h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f387368i);
            fVar.e(8, this.f387369m);
            java.lang.String str4 = this.f387370n;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f387363d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f387364e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f387365f) + b36.f.e(5, this.f387366g);
            java.lang.String str7 = this.f387367h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f387368i) + b36.f.e(8, this.f387369m);
            java.lang.String str8 = this.f387370n;
            return str8 != null ? e18 + b36.f.j(100, str8) : e18;
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
        r45.ug5 ug5Var = (r45.ug5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            ug5Var.f387370n = aVar2.k(intValue);
            return 0;
        }
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
                    ug5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ug5Var.f387363d = aVar2.k(intValue);
                return 0;
            case 3:
                ug5Var.f387364e = aVar2.k(intValue);
                return 0;
            case 4:
                ug5Var.f387365f = aVar2.g(intValue);
                return 0;
            case 5:
                ug5Var.f387366g = aVar2.g(intValue);
                return 0;
            case 6:
                ug5Var.f387367h = aVar2.k(intValue);
                return 0;
            case 7:
                ug5Var.f387368i = aVar2.g(intValue);
                return 0;
            case 8:
                ug5Var.f387369m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
