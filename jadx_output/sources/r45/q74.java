package r45;

/* loaded from: classes9.dex */
public class q74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383734d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383735e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383736f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383737g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f383738h;

    /* renamed from: i, reason: collision with root package name */
    public float f383739i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f383740m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383741n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383742o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383743p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q74)) {
            return false;
        }
        r45.q74 q74Var = (r45.q74) fVar;
        return n51.f.a(this.f383734d, q74Var.f383734d) && n51.f.a(this.f383735e, q74Var.f383735e) && n51.f.a(this.f383736f, q74Var.f383736f) && n51.f.a(this.f383737g, q74Var.f383737g) && n51.f.a(java.lang.Boolean.valueOf(this.f383738h), java.lang.Boolean.valueOf(q74Var.f383738h)) && n51.f.a(java.lang.Float.valueOf(this.f383739i), java.lang.Float.valueOf(q74Var.f383739i)) && n51.f.a(java.lang.Boolean.valueOf(this.f383740m), java.lang.Boolean.valueOf(q74Var.f383740m)) && n51.f.a(this.f383741n, q74Var.f383741n) && n51.f.a(this.f383742o, q74Var.f383742o) && n51.f.a(this.f383743p, q74Var.f383743p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383734d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383735e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383736f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f383737g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.a(5, this.f383738h);
            fVar.d(6, this.f383739i);
            fVar.a(7, this.f383740m);
            java.lang.String str5 = this.f383741n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f383742o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f383743p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f383734d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f383735e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f383736f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f383737g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int a17 = j17 + b36.f.a(5, this.f383738h) + b36.f.d(6, this.f383739i) + b36.f.a(7, this.f383740m);
            java.lang.String str12 = this.f383741n;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f383742o;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f383743p;
            return str14 != null ? a17 + b36.f.j(10, str14) : a17;
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
        r45.q74 q74Var = (r45.q74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q74Var.f383734d = aVar2.k(intValue);
                return 0;
            case 2:
                q74Var.f383735e = aVar2.k(intValue);
                return 0;
            case 3:
                q74Var.f383736f = aVar2.k(intValue);
                return 0;
            case 4:
                q74Var.f383737g = aVar2.k(intValue);
                return 0;
            case 5:
                q74Var.f383738h = aVar2.c(intValue);
                return 0;
            case 6:
                q74Var.f383739i = aVar2.f(intValue);
                return 0;
            case 7:
                q74Var.f383740m = aVar2.c(intValue);
                return 0;
            case 8:
                q74Var.f383741n = aVar2.k(intValue);
                return 0;
            case 9:
                q74Var.f383742o = aVar2.k(intValue);
                return 0;
            case 10:
                q74Var.f383743p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
