package r45;

/* loaded from: classes9.dex */
public class k46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378366d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378368f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378369g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378370h;

    /* renamed from: i, reason: collision with root package name */
    public int f378371i;

    /* renamed from: m, reason: collision with root package name */
    public int f378372m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378373n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k46)) {
            return false;
        }
        r45.k46 k46Var = (r45.k46) fVar;
        return n51.f.a(this.f378366d, k46Var.f378366d) && n51.f.a(this.f378367e, k46Var.f378367e) && n51.f.a(this.f378368f, k46Var.f378368f) && n51.f.a(this.f378369g, k46Var.f378369g) && n51.f.a(this.f378370h, k46Var.f378370h) && n51.f.a(java.lang.Integer.valueOf(this.f378371i), java.lang.Integer.valueOf(k46Var.f378371i)) && n51.f.a(java.lang.Integer.valueOf(this.f378372m), java.lang.Integer.valueOf(k46Var.f378372m)) && n51.f.a(this.f378373n, k46Var.f378373n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378366d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378367e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378368f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378369g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f378370h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f378371i);
            fVar.e(7, this.f378372m);
            java.lang.String str6 = this.f378373n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f378366d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f378367e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f378368f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f378369g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f378370h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f378371i) + b36.f.e(7, this.f378372m);
            java.lang.String str12 = this.f378373n;
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
        r45.k46 k46Var = (r45.k46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k46Var.f378366d = aVar2.k(intValue);
                return 0;
            case 2:
                k46Var.f378367e = aVar2.k(intValue);
                return 0;
            case 3:
                k46Var.f378368f = aVar2.k(intValue);
                return 0;
            case 4:
                k46Var.f378369g = aVar2.k(intValue);
                return 0;
            case 5:
                k46Var.f378370h = aVar2.k(intValue);
                return 0;
            case 6:
                k46Var.f378371i = aVar2.g(intValue);
                return 0;
            case 7:
                k46Var.f378372m = aVar2.g(intValue);
                return 0;
            case 8:
                k46Var.f378373n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
