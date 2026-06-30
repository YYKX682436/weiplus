package r45;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383519d;

    /* renamed from: e, reason: collision with root package name */
    public int f383520e;

    /* renamed from: f, reason: collision with root package name */
    public int f383521f;

    /* renamed from: g, reason: collision with root package name */
    public long f383522g;

    /* renamed from: h, reason: collision with root package name */
    public long f383523h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383524i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383525m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q)) {
            return false;
        }
        r45.q qVar = (r45.q) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383519d), java.lang.Integer.valueOf(qVar.f383519d)) && n51.f.a(java.lang.Integer.valueOf(this.f383520e), java.lang.Integer.valueOf(qVar.f383520e)) && n51.f.a(java.lang.Integer.valueOf(this.f383521f), java.lang.Integer.valueOf(qVar.f383521f)) && n51.f.a(java.lang.Long.valueOf(this.f383522g), java.lang.Long.valueOf(qVar.f383522g)) && n51.f.a(java.lang.Long.valueOf(this.f383523h), java.lang.Long.valueOf(qVar.f383523h)) && n51.f.a(this.f383524i, qVar.f383524i) && n51.f.a(this.f383525m, qVar.f383525m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383519d);
            fVar.e(2, this.f383520e);
            fVar.e(3, this.f383521f);
            fVar.h(4, this.f383522g);
            fVar.h(5, this.f383523h);
            java.lang.String str = this.f383524i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f383525m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383519d) + 0 + b36.f.e(2, this.f383520e) + b36.f.e(3, this.f383521f) + b36.f.h(4, this.f383522g) + b36.f.h(5, this.f383523h);
            java.lang.String str3 = this.f383524i;
            if (str3 != null) {
                e17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f383525m;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.q qVar = (r45.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qVar.f383519d = aVar2.g(intValue);
                return 0;
            case 2:
                qVar.f383520e = aVar2.g(intValue);
                return 0;
            case 3:
                qVar.f383521f = aVar2.g(intValue);
                return 0;
            case 4:
                qVar.f383522g = aVar2.i(intValue);
                return 0;
            case 5:
                qVar.f383523h = aVar2.i(intValue);
                return 0;
            case 6:
                qVar.f383524i = aVar2.k(intValue);
                return 0;
            case 7:
                qVar.f383525m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
