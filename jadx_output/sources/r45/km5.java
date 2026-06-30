package r45;

/* loaded from: classes9.dex */
public class km5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378832e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378835h;

    /* renamed from: i, reason: collision with root package name */
    public int f378836i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f378837m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km5)) {
            return false;
        }
        r45.km5 km5Var = (r45.km5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378831d), java.lang.Integer.valueOf(km5Var.f378831d)) && n51.f.a(this.f378832e, km5Var.f378832e) && n51.f.a(this.f378833f, km5Var.f378833f) && n51.f.a(this.f378834g, km5Var.f378834g) && n51.f.a(this.f378835h, km5Var.f378835h) && n51.f.a(java.lang.Integer.valueOf(this.f378836i), java.lang.Integer.valueOf(km5Var.f378836i)) && n51.f.a(java.lang.Boolean.valueOf(this.f378837m), java.lang.Boolean.valueOf(km5Var.f378837m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378831d);
            java.lang.String str = this.f378832e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378833f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378834g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378835h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f378836i);
            fVar.a(7, this.f378837m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378831d) + 0;
            java.lang.String str5 = this.f378832e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f378833f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f378834g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f378835h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f378836i) + b36.f.a(7, this.f378837m);
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
        r45.km5 km5Var = (r45.km5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                km5Var.f378831d = aVar2.g(intValue);
                return 0;
            case 2:
                km5Var.f378832e = aVar2.k(intValue);
                return 0;
            case 3:
                km5Var.f378833f = aVar2.k(intValue);
                return 0;
            case 4:
                km5Var.f378834g = aVar2.k(intValue);
                return 0;
            case 5:
                km5Var.f378835h = aVar2.k(intValue);
                return 0;
            case 6:
                km5Var.f378836i = aVar2.g(intValue);
                return 0;
            case 7:
                km5Var.f378837m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
