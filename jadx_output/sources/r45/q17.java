package r45;

/* loaded from: classes11.dex */
public class q17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383573d;

    /* renamed from: e, reason: collision with root package name */
    public int f383574e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383575f;

    /* renamed from: g, reason: collision with root package name */
    public int f383576g;

    /* renamed from: h, reason: collision with root package name */
    public int f383577h;

    /* renamed from: i, reason: collision with root package name */
    public int f383578i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383579m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q17)) {
            return false;
        }
        r45.q17 q17Var = (r45.q17) fVar;
        return n51.f.a(this.f383573d, q17Var.f383573d) && n51.f.a(java.lang.Integer.valueOf(this.f383574e), java.lang.Integer.valueOf(q17Var.f383574e)) && n51.f.a(this.f383575f, q17Var.f383575f) && n51.f.a(java.lang.Integer.valueOf(this.f383576g), java.lang.Integer.valueOf(q17Var.f383576g)) && n51.f.a(java.lang.Integer.valueOf(this.f383577h), java.lang.Integer.valueOf(q17Var.f383577h)) && n51.f.a(java.lang.Integer.valueOf(this.f383578i), java.lang.Integer.valueOf(q17Var.f383578i)) && n51.f.a(this.f383579m, q17Var.f383579m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383573d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383574e);
            java.lang.String str2 = this.f383575f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383576g);
            fVar.e(5, this.f383577h);
            fVar.e(6, this.f383578i);
            com.tencent.mm.protobuf.g gVar = this.f383579m;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383573d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f383574e);
            java.lang.String str4 = this.f383575f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            int e17 = j17 + b36.f.e(4, this.f383576g) + b36.f.e(5, this.f383577h) + b36.f.e(6, this.f383578i);
            com.tencent.mm.protobuf.g gVar2 = this.f383579m;
            return gVar2 != null ? e17 + b36.f.b(100, gVar2) : e17;
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
        r45.q17 q17Var = (r45.q17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            q17Var.f383579m = aVar2.d(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                q17Var.f383573d = aVar2.k(intValue);
                return 0;
            case 2:
                q17Var.f383574e = aVar2.g(intValue);
                return 0;
            case 3:
                q17Var.f383575f = aVar2.k(intValue);
                return 0;
            case 4:
                q17Var.f383576g = aVar2.g(intValue);
                return 0;
            case 5:
                q17Var.f383577h = aVar2.g(intValue);
                return 0;
            case 6:
                q17Var.f383578i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
