package r45;

/* loaded from: classes8.dex */
public class l97 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379260e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379261f;

    /* renamed from: g, reason: collision with root package name */
    public int f379262g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379263h;

    /* renamed from: i, reason: collision with root package name */
    public int f379264i;

    /* renamed from: m, reason: collision with root package name */
    public int f379265m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l97)) {
            return false;
        }
        r45.l97 l97Var = (r45.l97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379259d), java.lang.Integer.valueOf(l97Var.f379259d)) && n51.f.a(this.f379260e, l97Var.f379260e) && n51.f.a(this.f379261f, l97Var.f379261f) && n51.f.a(java.lang.Integer.valueOf(this.f379262g), java.lang.Integer.valueOf(l97Var.f379262g)) && n51.f.a(this.f379263h, l97Var.f379263h) && n51.f.a(java.lang.Integer.valueOf(this.f379264i), java.lang.Integer.valueOf(l97Var.f379264i)) && n51.f.a(java.lang.Integer.valueOf(this.f379265m), java.lang.Integer.valueOf(l97Var.f379265m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379259d);
            java.lang.String str = this.f379260e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379261f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f379262g);
            java.lang.String str3 = this.f379263h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f379264i);
            fVar.e(7, this.f379265m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379259d) + 0;
            java.lang.String str4 = this.f379260e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f379261f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f379262g);
            java.lang.String str6 = this.f379263h;
            if (str6 != null) {
                e18 += b36.f.j(5, str6);
            }
            return e18 + b36.f.e(6, this.f379264i) + b36.f.e(7, this.f379265m);
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
        r45.l97 l97Var = (r45.l97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l97Var.f379259d = aVar2.g(intValue);
                return 0;
            case 2:
                l97Var.f379260e = aVar2.k(intValue);
                return 0;
            case 3:
                l97Var.f379261f = aVar2.k(intValue);
                return 0;
            case 4:
                l97Var.f379262g = aVar2.g(intValue);
                return 0;
            case 5:
                l97Var.f379263h = aVar2.k(intValue);
                return 0;
            case 6:
                l97Var.f379264i = aVar2.g(intValue);
                return 0;
            case 7:
                l97Var.f379265m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
