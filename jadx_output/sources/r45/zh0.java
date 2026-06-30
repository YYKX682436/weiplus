package r45;

/* loaded from: classes15.dex */
public class zh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392054d;

    /* renamed from: e, reason: collision with root package name */
    public int f392055e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392056f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392057g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392058h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392059i;

    /* renamed from: m, reason: collision with root package name */
    public int f392060m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392061n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zh0)) {
            return false;
        }
        r45.zh0 zh0Var = (r45.zh0) fVar;
        return n51.f.a(this.f392054d, zh0Var.f392054d) && n51.f.a(java.lang.Integer.valueOf(this.f392055e), java.lang.Integer.valueOf(zh0Var.f392055e)) && n51.f.a(this.f392056f, zh0Var.f392056f) && n51.f.a(this.f392057g, zh0Var.f392057g) && n51.f.a(this.f392058h, zh0Var.f392058h) && n51.f.a(this.f392059i, zh0Var.f392059i) && n51.f.a(java.lang.Integer.valueOf(this.f392060m), java.lang.Integer.valueOf(zh0Var.f392060m)) && n51.f.a(this.f392061n, zh0Var.f392061n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392054d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f392055e);
            java.lang.String str2 = this.f392056f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f392057g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f392058h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f392059i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f392060m);
            java.lang.String str6 = this.f392061n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f392054d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f392055e);
            java.lang.String str8 = this.f392056f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f392057g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f392058h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f392059i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            int e17 = j17 + b36.f.e(7, this.f392060m);
            java.lang.String str12 = this.f392061n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.zh0 zh0Var = (r45.zh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zh0Var.f392054d = aVar2.k(intValue);
                return 0;
            case 2:
                zh0Var.f392055e = aVar2.g(intValue);
                return 0;
            case 3:
                zh0Var.f392056f = aVar2.k(intValue);
                return 0;
            case 4:
                zh0Var.f392057g = aVar2.k(intValue);
                return 0;
            case 5:
                zh0Var.f392058h = aVar2.k(intValue);
                return 0;
            case 6:
                zh0Var.f392059i = aVar2.k(intValue);
                return 0;
            case 7:
                zh0Var.f392060m = aVar2.g(intValue);
                return 0;
            case 8:
                zh0Var.f392061n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
