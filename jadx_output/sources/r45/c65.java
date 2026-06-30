package r45;

/* loaded from: classes2.dex */
public class c65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371332f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371333g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371334h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371336m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c65)) {
            return false;
        }
        r45.c65 c65Var = (r45.c65) fVar;
        return n51.f.a(this.BaseRequest, c65Var.BaseRequest) && n51.f.a(this.f371330d, c65Var.f371330d) && n51.f.a(this.f371331e, c65Var.f371331e) && n51.f.a(this.f371332f, c65Var.f371332f) && n51.f.a(this.f371333g, c65Var.f371333g) && n51.f.a(this.f371334h, c65Var.f371334h) && n51.f.a(this.f371335i, c65Var.f371335i) && n51.f.a(this.f371336m, c65Var.f371336m);
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
            java.lang.String str = this.f371330d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371331e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f371332f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f371333g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f371334h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f371335i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f371336m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f371330d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f371331e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f371332f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f371333g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f371334h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f371335i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f371336m;
            return str14 != null ? i18 + b36.f.j(8, str14) : i18;
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
        r45.c65 c65Var = (r45.c65) objArr[1];
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
                    c65Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                c65Var.f371330d = aVar2.k(intValue);
                return 0;
            case 3:
                c65Var.f371331e = aVar2.k(intValue);
                return 0;
            case 4:
                c65Var.f371332f = aVar2.k(intValue);
                return 0;
            case 5:
                c65Var.f371333g = aVar2.k(intValue);
                return 0;
            case 6:
                c65Var.f371334h = aVar2.k(intValue);
                return 0;
            case 7:
                c65Var.f371335i = aVar2.k(intValue);
                return 0;
            case 8:
                c65Var.f371336m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
