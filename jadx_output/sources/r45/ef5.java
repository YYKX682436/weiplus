package r45;

/* loaded from: classes9.dex */
public class ef5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373397d;

    /* renamed from: e, reason: collision with root package name */
    public int f373398e;

    /* renamed from: f, reason: collision with root package name */
    public int f373399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373400g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373401h;

    /* renamed from: i, reason: collision with root package name */
    public int f373402i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373403m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373404n;

    /* renamed from: o, reason: collision with root package name */
    public int f373405o;

    /* renamed from: p, reason: collision with root package name */
    public int f373406p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373407q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef5)) {
            return false;
        }
        r45.ef5 ef5Var = (r45.ef5) fVar;
        return n51.f.a(this.BaseRequest, ef5Var.BaseRequest) && n51.f.a(this.f373397d, ef5Var.f373397d) && n51.f.a(java.lang.Integer.valueOf(this.f373398e), java.lang.Integer.valueOf(ef5Var.f373398e)) && n51.f.a(java.lang.Integer.valueOf(this.f373399f), java.lang.Integer.valueOf(ef5Var.f373399f)) && n51.f.a(this.f373400g, ef5Var.f373400g) && n51.f.a(this.f373401h, ef5Var.f373401h) && n51.f.a(java.lang.Integer.valueOf(this.f373402i), java.lang.Integer.valueOf(ef5Var.f373402i)) && n51.f.a(this.f373403m, ef5Var.f373403m) && n51.f.a(this.f373404n, ef5Var.f373404n) && n51.f.a(java.lang.Integer.valueOf(this.f373405o), java.lang.Integer.valueOf(ef5Var.f373405o)) && n51.f.a(java.lang.Integer.valueOf(this.f373406p), java.lang.Integer.valueOf(ef5Var.f373406p)) && n51.f.a(this.f373407q, ef5Var.f373407q);
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
            java.lang.String str = this.f373397d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373398e);
            fVar.e(4, this.f373399f);
            java.lang.String str2 = this.f373400g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f373401h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f373402i);
            java.lang.String str4 = this.f373403m;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f373404n;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f373405o);
            fVar.e(12, this.f373406p);
            java.lang.String str6 = this.f373407q;
            if (str6 != null) {
                fVar.j(100, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f373397d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f373398e) + b36.f.e(4, this.f373399f);
            java.lang.String str8 = this.f373400g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f373401h;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            int e18 = e17 + b36.f.e(8, this.f373402i);
            java.lang.String str10 = this.f373403m;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f373404n;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            int e19 = e18 + b36.f.e(11, this.f373405o) + b36.f.e(12, this.f373406p);
            java.lang.String str12 = this.f373407q;
            return str12 != null ? e19 + b36.f.j(100, str12) : e19;
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
        r45.ef5 ef5Var = (r45.ef5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                ef5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ef5Var.f373397d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ef5Var.f373398e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ef5Var.f373399f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            ef5Var.f373400g = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 100) {
            ef5Var.f373407q = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 7:
                ef5Var.f373401h = aVar2.k(intValue);
                return 0;
            case 8:
                ef5Var.f373402i = aVar2.g(intValue);
                return 0;
            case 9:
                ef5Var.f373403m = aVar2.k(intValue);
                return 0;
            case 10:
                ef5Var.f373404n = aVar2.k(intValue);
                return 0;
            case 11:
                ef5Var.f373405o = aVar2.g(intValue);
                return 0;
            case 12:
                ef5Var.f373406p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
