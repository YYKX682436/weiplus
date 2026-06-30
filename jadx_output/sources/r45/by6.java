package r45;

/* loaded from: classes9.dex */
public class by6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371150d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f371151e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371152f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371153g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371154h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371155i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371156m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371157n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371158o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.by6)) {
            return false;
        }
        r45.by6 by6Var = (r45.by6) fVar;
        return n51.f.a(this.BaseRequest, by6Var.BaseRequest) && n51.f.a(this.f371150d, by6Var.f371150d) && n51.f.a(this.f371151e, by6Var.f371151e) && n51.f.a(this.f371152f, by6Var.f371152f) && n51.f.a(this.f371153g, by6Var.f371153g) && n51.f.a(this.f371154h, by6Var.f371154h) && n51.f.a(this.f371155i, by6Var.f371155i) && n51.f.a(this.f371156m, by6Var.f371156m) && n51.f.a(this.f371157n, by6Var.f371157n) && n51.f.a(this.f371158o, by6Var.f371158o);
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
            java.lang.String str = this.f371150d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, this.f371151e);
            java.lang.String str2 = this.f371152f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371153g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f371154h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f371155i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f371156m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f371157n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f371158o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f371150d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            int g17 = i18 + b36.f.g(3, 2, this.f371151e);
            java.lang.String str10 = this.f371152f;
            if (str10 != null) {
                g17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f371153g;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f371154h;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f371155i;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f371156m;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f371157n;
            if (str15 != null) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f371158o;
            return str16 != null ? g17 + b36.f.j(10, str16) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371151e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.by6 by6Var = (r45.by6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    by6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                by6Var.f371150d = aVar2.k(intValue);
                return 0;
            case 3:
                by6Var.f371151e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                by6Var.f371152f = aVar2.k(intValue);
                return 0;
            case 5:
                by6Var.f371153g = aVar2.k(intValue);
                return 0;
            case 6:
                by6Var.f371154h = aVar2.k(intValue);
                return 0;
            case 7:
                by6Var.f371155i = aVar2.k(intValue);
                return 0;
            case 8:
                by6Var.f371156m = aVar2.k(intValue);
                return 0;
            case 9:
                by6Var.f371157n = aVar2.k(intValue);
                return 0;
            case 10:
                by6Var.f371158o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
