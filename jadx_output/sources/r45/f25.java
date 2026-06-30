package r45;

/* loaded from: classes9.dex */
public class f25 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373944e;

    /* renamed from: f, reason: collision with root package name */
    public int f373945f;

    /* renamed from: g, reason: collision with root package name */
    public int f373946g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373947h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373948i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373949m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373950n;

    /* renamed from: o, reason: collision with root package name */
    public int f373951o;

    /* renamed from: p, reason: collision with root package name */
    public int f373952p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f373953q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f25)) {
            return false;
        }
        r45.f25 f25Var = (r45.f25) fVar;
        return n51.f.a(this.BaseResponse, f25Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f373943d), java.lang.Integer.valueOf(f25Var.f373943d)) && n51.f.a(this.f373944e, f25Var.f373944e) && n51.f.a(java.lang.Integer.valueOf(this.f373945f), java.lang.Integer.valueOf(f25Var.f373945f)) && n51.f.a(java.lang.Integer.valueOf(this.f373946g), java.lang.Integer.valueOf(f25Var.f373946g)) && n51.f.a(this.f373947h, f25Var.f373947h) && n51.f.a(this.f373948i, f25Var.f373948i) && n51.f.a(this.f373949m, f25Var.f373949m) && n51.f.a(this.f373950n, f25Var.f373950n) && n51.f.a(java.lang.Integer.valueOf(this.f373951o), java.lang.Integer.valueOf(f25Var.f373951o)) && n51.f.a(java.lang.Integer.valueOf(this.f373952p), java.lang.Integer.valueOf(f25Var.f373952p)) && n51.f.a(this.f373953q, f25Var.f373953q);
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
            fVar.e(2, this.f373943d);
            java.lang.String str = this.f373944e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f373945f);
            fVar.e(5, this.f373946g);
            java.lang.String str2 = this.f373947h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f373948i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f373949m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f373950n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f373951o);
            fVar.e(11, this.f373952p);
            r45.tw4 tw4Var = this.f373953q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.computeSize());
                this.f373953q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f373943d);
            java.lang.String str6 = this.f373944e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f373945f) + b36.f.e(5, this.f373946g);
            java.lang.String str7 = this.f373947h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f373948i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f373949m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f373950n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f373951o) + b36.f.e(11, this.f373952p);
            r45.tw4 tw4Var2 = this.f373953q;
            return tw4Var2 != null ? e18 + b36.f.i(12, tw4Var2.computeSize()) : e18;
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
        r45.f25 f25Var = (r45.f25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    f25Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                f25Var.f373943d = aVar2.g(intValue);
                return 0;
            case 3:
                f25Var.f373944e = aVar2.k(intValue);
                return 0;
            case 4:
                f25Var.f373945f = aVar2.g(intValue);
                return 0;
            case 5:
                f25Var.f373946g = aVar2.g(intValue);
                return 0;
            case 6:
                f25Var.f373947h = aVar2.k(intValue);
                return 0;
            case 7:
                f25Var.f373948i = aVar2.k(intValue);
                return 0;
            case 8:
                f25Var.f373949m = aVar2.k(intValue);
                return 0;
            case 9:
                f25Var.f373950n = aVar2.k(intValue);
                return 0;
            case 10:
                f25Var.f373951o = aVar2.g(intValue);
                return 0;
            case 11:
                f25Var.f373952p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.parseFrom(bArr2);
                    }
                    f25Var.f373953q = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
