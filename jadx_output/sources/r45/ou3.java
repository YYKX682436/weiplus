package r45;

/* loaded from: classes14.dex */
public class ou3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.y24 f382519d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382520e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f382521f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382522g;

    /* renamed from: h, reason: collision with root package name */
    public int f382523h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382524i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382525m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382526n;

    /* renamed from: o, reason: collision with root package name */
    public int f382527o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382528p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ou3)) {
            return false;
        }
        r45.ou3 ou3Var = (r45.ou3) fVar;
        return n51.f.a(this.BaseRequest, ou3Var.BaseRequest) && n51.f.a(this.f382519d, ou3Var.f382519d) && n51.f.a(this.f382520e, ou3Var.f382520e) && n51.f.a(this.f382521f, ou3Var.f382521f) && n51.f.a(this.f382522g, ou3Var.f382522g) && n51.f.a(java.lang.Integer.valueOf(this.f382523h), java.lang.Integer.valueOf(ou3Var.f382523h)) && n51.f.a(this.f382524i, ou3Var.f382524i) && n51.f.a(this.f382525m, ou3Var.f382525m) && n51.f.a(this.f382526n, ou3Var.f382526n) && n51.f.a(java.lang.Integer.valueOf(this.f382527o), java.lang.Integer.valueOf(ou3Var.f382527o)) && n51.f.a(this.f382528p, ou3Var.f382528p);
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
            r45.y24 y24Var = this.f382519d;
            if (y24Var != null) {
                fVar.i(2, y24Var.computeSize());
                this.f382519d.writeFields(fVar);
            }
            java.lang.String str = this.f382520e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f382521f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f382521f.writeFields(fVar);
            }
            java.lang.String str2 = this.f382522g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f382523h);
            java.lang.String str3 = this.f382524i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f382525m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f382526n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f382527o);
            java.lang.String str6 = this.f382528p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.y24 y24Var2 = this.f382519d;
            if (y24Var2 != null) {
                i18 += b36.f.i(2, y24Var2.computeSize());
            }
            java.lang.String str7 = this.f382520e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            r45.cu5 cu5Var2 = this.f382521f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            java.lang.String str8 = this.f382522g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f382523h);
            java.lang.String str9 = this.f382524i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f382525m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f382526n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            int e18 = e17 + b36.f.e(10, this.f382527o);
            java.lang.String str12 = this.f382528p;
            return str12 != null ? e18 + b36.f.j(11, str12) : e18;
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
        r45.ou3 ou3Var = (r45.ou3) objArr[1];
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
                    ou3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y24 y24Var3 = new r45.y24();
                    if (bArr2 != null && bArr2.length > 0) {
                        y24Var3.parseFrom(bArr2);
                    }
                    ou3Var.f382519d = y24Var3;
                }
                return 0;
            case 3:
                ou3Var.f382520e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    ou3Var.f382521f = cu5Var3;
                }
                return 0;
            case 5:
                ou3Var.f382522g = aVar2.k(intValue);
                return 0;
            case 6:
                ou3Var.f382523h = aVar2.g(intValue);
                return 0;
            case 7:
                ou3Var.f382524i = aVar2.k(intValue);
                return 0;
            case 8:
                ou3Var.f382525m = aVar2.k(intValue);
                return 0;
            case 9:
                ou3Var.f382526n = aVar2.k(intValue);
                return 0;
            case 10:
                ou3Var.f382527o = aVar2.g(intValue);
                return 0;
            case 11:
                ou3Var.f382528p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
