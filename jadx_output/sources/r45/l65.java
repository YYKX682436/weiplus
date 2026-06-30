package r45;

/* loaded from: classes9.dex */
public class l65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379180e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379181f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379182g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379183h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379184i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379185m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l65)) {
            return false;
        }
        r45.l65 l65Var = (r45.l65) fVar;
        return n51.f.a(this.BaseRequest, l65Var.BaseRequest) && n51.f.a(this.f379179d, l65Var.f379179d) && n51.f.a(this.f379180e, l65Var.f379180e) && n51.f.a(this.f379181f, l65Var.f379181f) && n51.f.a(this.f379182g, l65Var.f379182g) && n51.f.a(this.f379183h, l65Var.f379183h) && n51.f.a(this.f379184i, l65Var.f379184i) && n51.f.a(this.f379185m, l65Var.f379185m);
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
            java.lang.String str = this.f379179d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379180e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379181f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379182g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379183h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379184i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379185m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f379179d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f379180e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f379181f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f379182g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f379183h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f379184i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f379185m;
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
        r45.l65 l65Var = (r45.l65) objArr[1];
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
                    l65Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                l65Var.f379179d = aVar2.k(intValue);
                return 0;
            case 3:
                l65Var.f379180e = aVar2.k(intValue);
                return 0;
            case 4:
                l65Var.f379181f = aVar2.k(intValue);
                return 0;
            case 5:
                l65Var.f379182g = aVar2.k(intValue);
                return 0;
            case 6:
                l65Var.f379183h = aVar2.k(intValue);
                return 0;
            case 7:
                l65Var.f379184i = aVar2.k(intValue);
                return 0;
            case 8:
                l65Var.f379185m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
