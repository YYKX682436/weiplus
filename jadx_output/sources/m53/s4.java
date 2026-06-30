package m53;

/* loaded from: classes2.dex */
public class s4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324053d;

    /* renamed from: e, reason: collision with root package name */
    public int f324054e;

    /* renamed from: f, reason: collision with root package name */
    public long f324055f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324056g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f324057h;

    /* renamed from: i, reason: collision with root package name */
    public int f324058i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f324059m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s4)) {
            return false;
        }
        m53.s4 s4Var = (m53.s4) fVar;
        return n51.f.a(this.f324053d, s4Var.f324053d) && n51.f.a(java.lang.Integer.valueOf(this.f324054e), java.lang.Integer.valueOf(s4Var.f324054e)) && n51.f.a(java.lang.Long.valueOf(this.f324055f), java.lang.Long.valueOf(s4Var.f324055f)) && n51.f.a(this.f324056g, s4Var.f324056g) && n51.f.a(java.lang.Boolean.valueOf(this.f324057h), java.lang.Boolean.valueOf(s4Var.f324057h)) && n51.f.a(java.lang.Integer.valueOf(this.f324058i), java.lang.Integer.valueOf(s4Var.f324058i)) && n51.f.a(this.f324059m, s4Var.f324059m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324053d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f324054e);
            fVar.h(3, this.f324055f);
            java.lang.String str2 = this.f324056g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f324057h);
            fVar.e(6, this.f324058i);
            java.lang.String str3 = this.f324059m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f324053d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f324054e) + b36.f.h(3, this.f324055f);
            java.lang.String str5 = this.f324056g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            int a17 = j17 + b36.f.a(5, this.f324057h) + b36.f.e(6, this.f324058i);
            java.lang.String str6 = this.f324059m;
            return str6 != null ? a17 + b36.f.j(7, str6) : a17;
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
        m53.s4 s4Var = (m53.s4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s4Var.f324053d = aVar2.k(intValue);
                return 0;
            case 2:
                s4Var.f324054e = aVar2.g(intValue);
                return 0;
            case 3:
                s4Var.f324055f = aVar2.i(intValue);
                return 0;
            case 4:
                s4Var.f324056g = aVar2.k(intValue);
                return 0;
            case 5:
                s4Var.f324057h = aVar2.c(intValue);
                return 0;
            case 6:
                s4Var.f324058i = aVar2.g(intValue);
                return 0;
            case 7:
                s4Var.f324059m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
