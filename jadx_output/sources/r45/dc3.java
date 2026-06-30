package r45;

/* loaded from: classes14.dex */
public class dc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372299d;

    /* renamed from: e, reason: collision with root package name */
    public int f372300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372301f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372302g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372303h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372304i;

    /* renamed from: m, reason: collision with root package name */
    public int f372305m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372306n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pd6 f372307o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc3)) {
            return false;
        }
        r45.dc3 dc3Var = (r45.dc3) fVar;
        return n51.f.a(this.BaseRequest, dc3Var.BaseRequest) && n51.f.a(this.f372299d, dc3Var.f372299d) && n51.f.a(java.lang.Integer.valueOf(this.f372300e), java.lang.Integer.valueOf(dc3Var.f372300e)) && n51.f.a(this.f372301f, dc3Var.f372301f) && n51.f.a(this.f372302g, dc3Var.f372302g) && n51.f.a(this.f372303h, dc3Var.f372303h) && n51.f.a(this.f372304i, dc3Var.f372304i) && n51.f.a(java.lang.Integer.valueOf(this.f372305m), java.lang.Integer.valueOf(dc3Var.f372305m)) && n51.f.a(this.f372306n, dc3Var.f372306n) && n51.f.a(this.f372307o, dc3Var.f372307o);
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
            java.lang.String str = this.f372299d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372300e);
            java.lang.String str2 = this.f372301f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f372302g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f372303h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f372304i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f372305m);
            java.lang.String str6 = this.f372306n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.pd6 pd6Var = this.f372307o;
            if (pd6Var != null) {
                fVar.i(10, pd6Var.computeSize());
                this.f372307o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f372299d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f372300e);
            java.lang.String str8 = this.f372301f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f372302g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f372303h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f372304i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f372305m);
            java.lang.String str12 = this.f372306n;
            if (str12 != null) {
                e18 += b36.f.j(9, str12);
            }
            r45.pd6 pd6Var2 = this.f372307o;
            return pd6Var2 != null ? e18 + b36.f.i(10, pd6Var2.computeSize()) : e18;
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
        r45.dc3 dc3Var = (r45.dc3) objArr[1];
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
                    dc3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                dc3Var.f372299d = aVar2.k(intValue);
                return 0;
            case 3:
                dc3Var.f372300e = aVar2.g(intValue);
                return 0;
            case 4:
                dc3Var.f372301f = aVar2.k(intValue);
                return 0;
            case 5:
                dc3Var.f372302g = aVar2.k(intValue);
                return 0;
            case 6:
                dc3Var.f372303h = aVar2.k(intValue);
                return 0;
            case 7:
                dc3Var.f372304i = aVar2.k(intValue);
                return 0;
            case 8:
                dc3Var.f372305m = aVar2.g(intValue);
                return 0;
            case 9:
                dc3Var.f372306n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.pd6 pd6Var3 = new r45.pd6();
                    if (bArr2 != null && bArr2.length > 0) {
                        pd6Var3.parseFrom(bArr2);
                    }
                    dc3Var.f372307o = pd6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
