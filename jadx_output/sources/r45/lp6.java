package r45;

/* loaded from: classes9.dex */
public class lp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379704d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379705e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f379706f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f379707g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379708h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379709i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f379710m;

    /* renamed from: n, reason: collision with root package name */
    public r45.d70 f379711n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp6)) {
            return false;
        }
        r45.lp6 lp6Var = (r45.lp6) fVar;
        return n51.f.a(this.BaseResponse, lp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379704d), java.lang.Integer.valueOf(lp6Var.f379704d)) && n51.f.a(this.f379705e, lp6Var.f379705e) && n51.f.a(java.lang.Boolean.valueOf(this.f379706f), java.lang.Boolean.valueOf(lp6Var.f379706f)) && n51.f.a(java.lang.Boolean.valueOf(this.f379707g), java.lang.Boolean.valueOf(lp6Var.f379707g)) && n51.f.a(this.f379708h, lp6Var.f379708h) && n51.f.a(this.f379709i, lp6Var.f379709i) && n51.f.a(java.lang.Boolean.valueOf(this.f379710m), java.lang.Boolean.valueOf(lp6Var.f379710m)) && n51.f.a(this.f379711n, lp6Var.f379711n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379704d);
            java.lang.String str = this.f379705e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f379706f);
            fVar.a(5, this.f379707g);
            java.lang.String str2 = this.f379708h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f379709i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(11, this.f379710m);
            r45.d70 d70Var = this.f379711n;
            if (d70Var != null) {
                fVar.i(12, d70Var.computeSize());
                this.f379711n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379704d);
            java.lang.String str4 = this.f379705e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int a17 = i18 + b36.f.a(4, this.f379706f) + b36.f.a(5, this.f379707g);
            java.lang.String str5 = this.f379708h;
            if (str5 != null) {
                a17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f379709i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            int a18 = a17 + b36.f.a(11, this.f379710m);
            r45.d70 d70Var2 = this.f379711n;
            return d70Var2 != null ? a18 + b36.f.i(12, d70Var2.computeSize()) : a18;
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
        r45.lp6 lp6Var = (r45.lp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 11) {
            lp6Var.f379710m = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 12) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.d70 d70Var3 = new r45.d70();
                if (bArr != null && bArr.length > 0) {
                    d70Var3.parseFrom(bArr);
                }
                lp6Var.f379711n = d70Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    lp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lp6Var.f379704d = aVar2.g(intValue);
                return 0;
            case 3:
                lp6Var.f379705e = aVar2.k(intValue);
                return 0;
            case 4:
                lp6Var.f379706f = aVar2.c(intValue);
                return 0;
            case 5:
                lp6Var.f379707g = aVar2.c(intValue);
                return 0;
            case 6:
                lp6Var.f379708h = aVar2.k(intValue);
                return 0;
            case 7:
                lp6Var.f379709i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
