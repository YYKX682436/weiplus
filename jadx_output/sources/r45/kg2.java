package r45;

/* loaded from: classes4.dex */
public class kg2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378672e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378673f;

    /* renamed from: g, reason: collision with root package name */
    public int f378674g;

    /* renamed from: h, reason: collision with root package name */
    public long f378675h;

    /* renamed from: i, reason: collision with root package name */
    public long f378676i;

    /* renamed from: m, reason: collision with root package name */
    public int f378677m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kg2)) {
            return false;
        }
        r45.kg2 kg2Var = (r45.kg2) fVar;
        return n51.f.a(this.f378671d, kg2Var.f378671d) && n51.f.a(this.f378672e, kg2Var.f378672e) && n51.f.a(this.f378673f, kg2Var.f378673f) && n51.f.a(java.lang.Integer.valueOf(this.f378674g), java.lang.Integer.valueOf(kg2Var.f378674g)) && n51.f.a(java.lang.Long.valueOf(this.f378675h), java.lang.Long.valueOf(kg2Var.f378675h)) && n51.f.a(java.lang.Long.valueOf(this.f378676i), java.lang.Long.valueOf(kg2Var.f378676i)) && n51.f.a(java.lang.Integer.valueOf(this.f378677m), java.lang.Integer.valueOf(kg2Var.f378677m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378671d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378672e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378673f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f378674g);
            fVar.h(5, this.f378675h);
            fVar.h(6, this.f378676i);
            fVar.e(7, this.f378677m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378671d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f378672e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378673f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f378674g) + b36.f.h(5, this.f378675h) + b36.f.h(6, this.f378676i) + b36.f.e(7, this.f378677m);
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
        r45.kg2 kg2Var = (r45.kg2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kg2Var.f378671d = aVar2.k(intValue);
                return 0;
            case 2:
                kg2Var.f378672e = aVar2.k(intValue);
                return 0;
            case 3:
                kg2Var.f378673f = aVar2.k(intValue);
                return 0;
            case 4:
                kg2Var.f378674g = aVar2.g(intValue);
                return 0;
            case 5:
                kg2Var.f378675h = aVar2.i(intValue);
                return 0;
            case 6:
                kg2Var.f378676i = aVar2.i(intValue);
                return 0;
            case 7:
                kg2Var.f378677m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
