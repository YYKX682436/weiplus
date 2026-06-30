package r45;

/* loaded from: classes2.dex */
public class dr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372691e;

    /* renamed from: f, reason: collision with root package name */
    public long f372692f;

    /* renamed from: g, reason: collision with root package name */
    public float f372693g;

    /* renamed from: h, reason: collision with root package name */
    public float f372694h;

    /* renamed from: i, reason: collision with root package name */
    public int f372695i;

    /* renamed from: m, reason: collision with root package name */
    public int f372696m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372697n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372698o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dr0)) {
            return false;
        }
        r45.dr0 dr0Var = (r45.dr0) fVar;
        return n51.f.a(this.f372690d, dr0Var.f372690d) && n51.f.a(this.f372691e, dr0Var.f372691e) && n51.f.a(java.lang.Long.valueOf(this.f372692f), java.lang.Long.valueOf(dr0Var.f372692f)) && n51.f.a(java.lang.Float.valueOf(this.f372693g), java.lang.Float.valueOf(dr0Var.f372693g)) && n51.f.a(java.lang.Float.valueOf(this.f372694h), java.lang.Float.valueOf(dr0Var.f372694h)) && n51.f.a(java.lang.Integer.valueOf(this.f372695i), java.lang.Integer.valueOf(dr0Var.f372695i)) && n51.f.a(java.lang.Integer.valueOf(this.f372696m), java.lang.Integer.valueOf(dr0Var.f372696m)) && n51.f.a(this.f372697n, dr0Var.f372697n) && n51.f.a(this.f372698o, dr0Var.f372698o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372690d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372691e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f372692f);
            fVar.d(4, this.f372693g);
            fVar.d(5, this.f372694h);
            fVar.e(6, this.f372695i);
            fVar.e(7, this.f372696m);
            java.lang.String str3 = this.f372697n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f372698o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372690d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f372691e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int h17 = j17 + b36.f.h(3, this.f372692f) + b36.f.d(4, this.f372693g) + b36.f.d(5, this.f372694h) + b36.f.e(6, this.f372695i) + b36.f.e(7, this.f372696m);
            java.lang.String str7 = this.f372697n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f372698o;
            return str8 != null ? h17 + b36.f.j(9, str8) : h17;
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
        r45.dr0 dr0Var = (r45.dr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dr0Var.f372690d = aVar2.k(intValue);
                return 0;
            case 2:
                dr0Var.f372691e = aVar2.k(intValue);
                return 0;
            case 3:
                dr0Var.f372692f = aVar2.i(intValue);
                return 0;
            case 4:
                dr0Var.f372693g = aVar2.f(intValue);
                return 0;
            case 5:
                dr0Var.f372694h = aVar2.f(intValue);
                return 0;
            case 6:
                dr0Var.f372695i = aVar2.g(intValue);
                return 0;
            case 7:
                dr0Var.f372696m = aVar2.g(intValue);
                return 0;
            case 8:
                dr0Var.f372697n = aVar2.k(intValue);
                return 0;
            case 9:
                dr0Var.f372698o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
