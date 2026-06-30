package r45;

/* loaded from: classes4.dex */
public class fo3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374481d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374482e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374483f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374484g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374485h;

    /* renamed from: i, reason: collision with root package name */
    public int f374486i;

    /* renamed from: m, reason: collision with root package name */
    public int f374487m;

    /* renamed from: n, reason: collision with root package name */
    public int f374488n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo3)) {
            return false;
        }
        r45.fo3 fo3Var = (r45.fo3) fVar;
        return n51.f.a(this.BaseRequest, fo3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374481d), java.lang.Integer.valueOf(fo3Var.f374481d)) && n51.f.a(this.f374482e, fo3Var.f374482e) && n51.f.a(this.f374483f, fo3Var.f374483f) && n51.f.a(this.f374484g, fo3Var.f374484g) && n51.f.a(this.f374485h, fo3Var.f374485h) && n51.f.a(java.lang.Integer.valueOf(this.f374486i), java.lang.Integer.valueOf(fo3Var.f374486i)) && n51.f.a(java.lang.Integer.valueOf(this.f374487m), java.lang.Integer.valueOf(fo3Var.f374487m)) && n51.f.a(java.lang.Integer.valueOf(this.f374488n), java.lang.Integer.valueOf(fo3Var.f374488n));
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
            fVar.e(2, this.f374481d);
            java.lang.String str = this.f374482e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f374483f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374484g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f374485h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f374486i);
            fVar.e(8, this.f374487m);
            fVar.e(9, this.f374488n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374481d);
            java.lang.String str5 = this.f374482e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f374483f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f374484g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f374485h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            return i18 + b36.f.e(7, this.f374486i) + b36.f.e(8, this.f374487m) + b36.f.e(9, this.f374488n);
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
        r45.fo3 fo3Var = (r45.fo3) objArr[1];
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
                    fo3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fo3Var.f374481d = aVar2.g(intValue);
                return 0;
            case 3:
                fo3Var.f374482e = aVar2.k(intValue);
                return 0;
            case 4:
                fo3Var.f374483f = aVar2.k(intValue);
                return 0;
            case 5:
                fo3Var.f374484g = aVar2.k(intValue);
                return 0;
            case 6:
                fo3Var.f374485h = aVar2.k(intValue);
                return 0;
            case 7:
                fo3Var.f374486i = aVar2.g(intValue);
                return 0;
            case 8:
                fo3Var.f374487m = aVar2.g(intValue);
                return 0;
            case 9:
                fo3Var.f374488n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
