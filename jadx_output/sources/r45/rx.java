package r45;

/* loaded from: classes4.dex */
public class rx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385255d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385256e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385257f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385258g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f385259h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385260i;

    /* renamed from: m, reason: collision with root package name */
    public int f385261m;

    /* renamed from: n, reason: collision with root package name */
    public r45.e77 f385262n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f385263o;

    /* renamed from: p, reason: collision with root package name */
    public r45.yt5 f385264p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rx)) {
            return false;
        }
        r45.rx rxVar = (r45.rx) fVar;
        return n51.f.a(this.BaseResponse, rxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385255d), java.lang.Integer.valueOf(rxVar.f385255d)) && n51.f.a(this.f385256e, rxVar.f385256e) && n51.f.a(this.f385257f, rxVar.f385257f) && n51.f.a(this.f385258g, rxVar.f385258g) && n51.f.a(java.lang.Boolean.valueOf(this.f385259h), java.lang.Boolean.valueOf(rxVar.f385259h)) && n51.f.a(this.f385260i, rxVar.f385260i) && n51.f.a(java.lang.Integer.valueOf(this.f385261m), java.lang.Integer.valueOf(rxVar.f385261m)) && n51.f.a(this.f385262n, rxVar.f385262n) && n51.f.a(java.lang.Boolean.valueOf(this.f385263o), java.lang.Boolean.valueOf(rxVar.f385263o)) && n51.f.a(this.f385264p, rxVar.f385264p);
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
            fVar.e(2, this.f385255d);
            java.lang.String str = this.f385256e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f385257f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f385258g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.a(6, this.f385259h);
            java.lang.String str4 = this.f385260i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f385261m);
            r45.e77 e77Var = this.f385262n;
            if (e77Var != null) {
                fVar.i(9, e77Var.computeSize());
                this.f385262n.writeFields(fVar);
            }
            fVar.a(10, this.f385263o);
            r45.yt5 yt5Var = this.f385264p;
            if (yt5Var != null) {
                fVar.i(11, yt5Var.computeSize());
                this.f385264p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385255d);
            java.lang.String str5 = this.f385256e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f385257f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f385258g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int a17 = i18 + b36.f.a(6, this.f385259h);
            java.lang.String str8 = this.f385260i;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            int e17 = a17 + b36.f.e(8, this.f385261m);
            r45.e77 e77Var2 = this.f385262n;
            if (e77Var2 != null) {
                e17 += b36.f.i(9, e77Var2.computeSize());
            }
            int a18 = e17 + b36.f.a(10, this.f385263o);
            r45.yt5 yt5Var2 = this.f385264p;
            return yt5Var2 != null ? a18 + b36.f.i(11, yt5Var2.computeSize()) : a18;
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
        r45.rx rxVar = (r45.rx) objArr[1];
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
                    rxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rxVar.f385255d = aVar2.g(intValue);
                return 0;
            case 3:
                rxVar.f385256e = aVar2.k(intValue);
                return 0;
            case 4:
                rxVar.f385257f = aVar2.k(intValue);
                return 0;
            case 5:
                rxVar.f385258g = aVar2.k(intValue);
                return 0;
            case 6:
                rxVar.f385259h = aVar2.c(intValue);
                return 0;
            case 7:
                rxVar.f385260i = aVar2.k(intValue);
                return 0;
            case 8:
                rxVar.f385261m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e77 e77Var3 = new r45.e77();
                    if (bArr2 != null && bArr2.length > 0) {
                        e77Var3.parseFrom(bArr2);
                    }
                    rxVar.f385262n = e77Var3;
                }
                return 0;
            case 10:
                rxVar.f385263o = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr3 != null && bArr3.length > 0) {
                        yt5Var3.parseFrom(bArr3);
                    }
                    rxVar.f385264p = yt5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
