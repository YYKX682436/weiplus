package r45;

/* loaded from: classes2.dex */
public class v26 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387827d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387828e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387829f;

    /* renamed from: g, reason: collision with root package name */
    public int f387830g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387831h;

    /* renamed from: i, reason: collision with root package name */
    public int f387832i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387833m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v26)) {
            return false;
        }
        r45.v26 v26Var = (r45.v26) fVar;
        return n51.f.a(this.BaseRequest, v26Var.BaseRequest) && n51.f.a(this.f387827d, v26Var.f387827d) && n51.f.a(this.f387828e, v26Var.f387828e) && n51.f.a(this.f387829f, v26Var.f387829f) && n51.f.a(java.lang.Integer.valueOf(this.f387830g), java.lang.Integer.valueOf(v26Var.f387830g)) && n51.f.a(this.f387831h, v26Var.f387831h) && n51.f.a(java.lang.Integer.valueOf(this.f387832i), java.lang.Integer.valueOf(v26Var.f387832i)) && n51.f.a(this.f387833m, v26Var.f387833m);
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
            com.tencent.mm.protobuf.g gVar = this.f387827d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f387828e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387829f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f387830g);
            java.lang.String str3 = this.f387831h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f387832i);
            java.lang.String str4 = this.f387833m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f387827d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f387828e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387829f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int e17 = i18 + b36.f.e(5, this.f387830g);
            java.lang.String str7 = this.f387831h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f387832i);
            java.lang.String str8 = this.f387833m;
            return str8 != null ? e18 + b36.f.j(8, str8) : e18;
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
        r45.v26 v26Var = (r45.v26) objArr[1];
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
                    v26Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                v26Var.f387827d = aVar2.d(intValue);
                return 0;
            case 3:
                v26Var.f387828e = aVar2.k(intValue);
                return 0;
            case 4:
                v26Var.f387829f = aVar2.k(intValue);
                return 0;
            case 5:
                v26Var.f387830g = aVar2.g(intValue);
                return 0;
            case 6:
                v26Var.f387831h = aVar2.k(intValue);
                return 0;
            case 7:
                v26Var.f387832i = aVar2.g(intValue);
                return 0;
            case 8:
                v26Var.f387833m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
