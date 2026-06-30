package r45;

/* loaded from: classes12.dex */
public class lp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379694e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379695f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379696g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379697h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379698i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f379699m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f379700n;

    /* renamed from: o, reason: collision with root package name */
    public r45.bq0 f379701o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp0)) {
            return false;
        }
        r45.lp0 lp0Var = (r45.lp0) fVar;
        return n51.f.a(this.f379693d, lp0Var.f379693d) && n51.f.a(this.f379694e, lp0Var.f379694e) && n51.f.a(this.f379695f, lp0Var.f379695f) && n51.f.a(this.f379696g, lp0Var.f379696g) && n51.f.a(this.f379697h, lp0Var.f379697h) && n51.f.a(this.f379698i, lp0Var.f379698i) && n51.f.a(this.f379699m, lp0Var.f379699m) && n51.f.a(java.lang.Integer.valueOf(this.f379700n), java.lang.Integer.valueOf(lp0Var.f379700n)) && n51.f.a(this.f379701o, lp0Var.f379701o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379699m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379693d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379694e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379695f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379696g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f379697h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f379698i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.g(7, 1, linkedList);
            fVar.e(8, this.f379700n);
            r45.bq0 bq0Var = this.f379701o;
            if (bq0Var != null) {
                fVar.i(9, bq0Var.computeSize());
                this.f379701o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f379693d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f379694e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f379695f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f379696g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f379697h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f379698i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            int g17 = j17 + b36.f.g(7, 1, linkedList) + b36.f.e(8, this.f379700n);
            r45.bq0 bq0Var2 = this.f379701o;
            return bq0Var2 != null ? g17 + b36.f.i(9, bq0Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.lp0 lp0Var = (r45.lp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lp0Var.f379693d = aVar2.k(intValue);
                return 0;
            case 2:
                lp0Var.f379694e = aVar2.k(intValue);
                return 0;
            case 3:
                lp0Var.f379695f = aVar2.k(intValue);
                return 0;
            case 4:
                lp0Var.f379696g = aVar2.k(intValue);
                return 0;
            case 5:
                lp0Var.f379697h = aVar2.k(intValue);
                return 0;
            case 6:
                lp0Var.f379698i = aVar2.k(intValue);
                return 0;
            case 7:
                lp0Var.f379699m.add(aVar2.k(intValue));
                return 0;
            case 8:
                lp0Var.f379700n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.bq0 bq0Var3 = new r45.bq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bq0Var3.parseFrom(bArr2);
                    }
                    lp0Var.f379701o = bq0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
