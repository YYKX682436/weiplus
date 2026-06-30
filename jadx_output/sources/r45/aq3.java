package r45;

/* loaded from: classes8.dex */
public class aq3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370198d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370199e;

    /* renamed from: f, reason: collision with root package name */
    public int f370200f;

    /* renamed from: g, reason: collision with root package name */
    public int f370201g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370202h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370203i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370204m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370205n;

    /* renamed from: o, reason: collision with root package name */
    public int f370206o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq3)) {
            return false;
        }
        r45.aq3 aq3Var = (r45.aq3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370198d), java.lang.Integer.valueOf(aq3Var.f370198d)) && n51.f.a(this.f370199e, aq3Var.f370199e) && n51.f.a(java.lang.Integer.valueOf(this.f370200f), java.lang.Integer.valueOf(aq3Var.f370200f)) && n51.f.a(java.lang.Integer.valueOf(this.f370201g), java.lang.Integer.valueOf(aq3Var.f370201g)) && n51.f.a(this.f370202h, aq3Var.f370202h) && n51.f.a(this.f370203i, aq3Var.f370203i) && n51.f.a(this.f370204m, aq3Var.f370204m) && n51.f.a(this.f370205n, aq3Var.f370205n) && n51.f.a(java.lang.Integer.valueOf(this.f370206o), java.lang.Integer.valueOf(aq3Var.f370206o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370198d);
            java.lang.String str = this.f370199e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f370200f);
            fVar.e(4, this.f370201g);
            java.lang.String str2 = this.f370202h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f370203i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f370204m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f370205n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f370206o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370198d) + 0;
            java.lang.String str6 = this.f370199e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f370200f) + b36.f.e(4, this.f370201g);
            java.lang.String str7 = this.f370202h;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f370203i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f370204m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f370205n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            return e18 + b36.f.e(9, this.f370206o);
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
        r45.aq3 aq3Var = (r45.aq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aq3Var.f370198d = aVar2.g(intValue);
                return 0;
            case 2:
                aq3Var.f370199e = aVar2.k(intValue);
                return 0;
            case 3:
                aq3Var.f370200f = aVar2.g(intValue);
                return 0;
            case 4:
                aq3Var.f370201g = aVar2.g(intValue);
                return 0;
            case 5:
                aq3Var.f370202h = aVar2.k(intValue);
                return 0;
            case 6:
                aq3Var.f370203i = aVar2.k(intValue);
                return 0;
            case 7:
                aq3Var.f370204m = aVar2.k(intValue);
                return 0;
            case 8:
                aq3Var.f370205n = aVar2.k(intValue);
                return 0;
            case 9:
                aq3Var.f370206o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
