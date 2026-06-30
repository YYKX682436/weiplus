package r45;

/* loaded from: classes9.dex */
public class n43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f381068d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381069e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381070f;

    /* renamed from: g, reason: collision with root package name */
    public int f381071g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381072h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381073i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381074m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n43)) {
            return false;
        }
        r45.n43 n43Var = (r45.n43) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f381068d), java.lang.Long.valueOf(n43Var.f381068d)) && n51.f.a(this.f381069e, n43Var.f381069e) && n51.f.a(this.f381070f, n43Var.f381070f) && n51.f.a(java.lang.Integer.valueOf(this.f381071g), java.lang.Integer.valueOf(n43Var.f381071g)) && n51.f.a(this.f381072h, n43Var.f381072h) && n51.f.a(this.f381073i, n43Var.f381073i) && n51.f.a(this.f381074m, n43Var.f381074m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f381068d);
            java.lang.String str = this.f381069e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381070f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f381071g);
            java.lang.String str3 = this.f381072h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f381073i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f381074m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f381068d) + 0;
            java.lang.String str6 = this.f381069e;
            if (str6 != null) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f381070f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            int e17 = h17 + b36.f.e(4, this.f381071g);
            java.lang.String str8 = this.f381072h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f381073i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f381074m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.n43 n43Var = (r45.n43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n43Var.f381068d = aVar2.i(intValue);
                return 0;
            case 2:
                n43Var.f381069e = aVar2.k(intValue);
                return 0;
            case 3:
                n43Var.f381070f = aVar2.k(intValue);
                return 0;
            case 4:
                n43Var.f381071g = aVar2.g(intValue);
                return 0;
            case 5:
                n43Var.f381072h = aVar2.k(intValue);
                return 0;
            case 6:
                n43Var.f381073i = aVar2.k(intValue);
                return 0;
            case 7:
                n43Var.f381074m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
