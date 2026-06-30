package r45;

/* loaded from: classes9.dex */
public class yv extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391385d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391386e;

    /* renamed from: f, reason: collision with root package name */
    public int f391387f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391388g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391389h;

    /* renamed from: i, reason: collision with root package name */
    public int f391390i;

    /* renamed from: m, reason: collision with root package name */
    public int f391391m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391392n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391393o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yv)) {
            return false;
        }
        r45.yv yvVar = (r45.yv) fVar;
        return n51.f.a(this.BaseRequest, yvVar.BaseRequest) && n51.f.a(this.f391385d, yvVar.f391385d) && n51.f.a(this.f391386e, yvVar.f391386e) && n51.f.a(java.lang.Integer.valueOf(this.f391387f), java.lang.Integer.valueOf(yvVar.f391387f)) && n51.f.a(this.f391388g, yvVar.f391388g) && n51.f.a(this.f391389h, yvVar.f391389h) && n51.f.a(java.lang.Integer.valueOf(this.f391390i), java.lang.Integer.valueOf(yvVar.f391390i)) && n51.f.a(java.lang.Integer.valueOf(this.f391391m), java.lang.Integer.valueOf(yvVar.f391391m)) && n51.f.a(this.f391392n, yvVar.f391392n) && n51.f.a(this.f391393o, yvVar.f391393o);
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
            java.lang.String str = this.f391385d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391386e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f391387f);
            java.lang.String str3 = this.f391388g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f391389h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f391390i);
            fVar.e(8, this.f391391m);
            java.lang.String str5 = this.f391392n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f391393o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f391385d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f391386e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int e17 = i18 + b36.f.e(4, this.f391387f);
            java.lang.String str9 = this.f391388g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f391389h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            int e18 = e17 + b36.f.e(7, this.f391390i) + b36.f.e(8, this.f391391m);
            java.lang.String str11 = this.f391392n;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f391393o;
            return str12 != null ? e18 + b36.f.j(10, str12) : e18;
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
        r45.yv yvVar = (r45.yv) objArr[1];
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
                    yvVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yvVar.f391385d = aVar2.k(intValue);
                return 0;
            case 3:
                yvVar.f391386e = aVar2.k(intValue);
                return 0;
            case 4:
                yvVar.f391387f = aVar2.g(intValue);
                return 0;
            case 5:
                yvVar.f391388g = aVar2.k(intValue);
                return 0;
            case 6:
                yvVar.f391389h = aVar2.k(intValue);
                return 0;
            case 7:
                yvVar.f391390i = aVar2.g(intValue);
                return 0;
            case 8:
                yvVar.f391391m = aVar2.g(intValue);
                return 0;
            case 9:
                yvVar.f391392n = aVar2.k(intValue);
                return 0;
            case 10:
                yvVar.f391393o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
