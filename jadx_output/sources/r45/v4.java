package r45;

/* loaded from: classes8.dex */
public class v4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f387859d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387860e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387861f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387862g;

    /* renamed from: h, reason: collision with root package name */
    public int f387863h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387864i;

    /* renamed from: m, reason: collision with root package name */
    public int f387865m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v4)) {
            return false;
        }
        r45.v4 v4Var = (r45.v4) fVar;
        return n51.f.a(this.BaseRequest, v4Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f387859d), java.lang.Long.valueOf(v4Var.f387859d)) && n51.f.a(this.f387860e, v4Var.f387860e) && n51.f.a(this.f387861f, v4Var.f387861f) && n51.f.a(this.f387862g, v4Var.f387862g) && n51.f.a(java.lang.Integer.valueOf(this.f387863h), java.lang.Integer.valueOf(v4Var.f387863h)) && n51.f.a(this.f387864i, v4Var.f387864i) && n51.f.a(java.lang.Integer.valueOf(this.f387865m), java.lang.Integer.valueOf(v4Var.f387865m));
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
            fVar.h(2, this.f387859d);
            java.lang.String str = this.f387860e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387861f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387862g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f387863h);
            java.lang.String str4 = this.f387864i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f387865m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f387859d);
            java.lang.String str5 = this.f387860e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387861f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f387862g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f387863h);
            java.lang.String str8 = this.f387864i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.e(8, this.f387865m);
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
        r45.v4 v4Var = (r45.v4) objArr[1];
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
                    v4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                v4Var.f387859d = aVar2.i(intValue);
                return 0;
            case 3:
                v4Var.f387860e = aVar2.k(intValue);
                return 0;
            case 4:
                v4Var.f387861f = aVar2.k(intValue);
                return 0;
            case 5:
                v4Var.f387862g = aVar2.k(intValue);
                return 0;
            case 6:
                v4Var.f387863h = aVar2.g(intValue);
                return 0;
            case 7:
                v4Var.f387864i = aVar2.k(intValue);
                return 0;
            case 8:
                v4Var.f387865m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
