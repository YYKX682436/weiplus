package r45;

/* loaded from: classes7.dex */
public class m83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380230d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380231e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380232f;

    /* renamed from: g, reason: collision with root package name */
    public int f380233g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380234h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380235i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380236m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380237n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m83)) {
            return false;
        }
        r45.m83 m83Var = (r45.m83) fVar;
        return n51.f.a(this.f380230d, m83Var.f380230d) && n51.f.a(this.f380231e, m83Var.f380231e) && n51.f.a(this.f380232f, m83Var.f380232f) && n51.f.a(java.lang.Integer.valueOf(this.f380233g), java.lang.Integer.valueOf(m83Var.f380233g)) && n51.f.a(this.f380234h, m83Var.f380234h) && n51.f.a(this.f380235i, m83Var.f380235i) && n51.f.a(this.f380236m, m83Var.f380236m) && n51.f.a(this.f380237n, m83Var.f380237n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380230d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380231e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380232f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f380233g);
            com.tencent.mm.protobuf.g gVar = this.f380234h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f380235i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f380236m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f380237n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f380230d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f380231e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f380232f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f380233g);
            com.tencent.mm.protobuf.g gVar3 = this.f380234h;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            java.lang.String str9 = this.f380235i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f380236m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f380237n;
            return gVar4 != null ? e17 + b36.f.b(9, gVar4) : e17;
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
        r45.m83 m83Var = (r45.m83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m83Var.f380230d = aVar2.k(intValue);
                return 0;
            case 2:
                m83Var.f380231e = aVar2.k(intValue);
                return 0;
            case 3:
                m83Var.f380232f = aVar2.k(intValue);
                return 0;
            case 4:
                m83Var.f380233g = aVar2.g(intValue);
                return 0;
            case 5:
                m83Var.f380234h = aVar2.d(intValue);
                return 0;
            case 6:
                m83Var.f380235i = aVar2.k(intValue);
                return 0;
            case 7:
                m83Var.f380236m = aVar2.k(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                m83Var.f380237n = aVar2.d(intValue);
                return 0;
        }
    }
}
