package r45;

/* loaded from: classes9.dex */
public class vu3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f388578d;

    /* renamed from: e, reason: collision with root package name */
    public long f388579e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388580f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388581g;

    /* renamed from: h, reason: collision with root package name */
    public int f388582h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388583i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388584m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vu3)) {
            return false;
        }
        r45.vu3 vu3Var = (r45.vu3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f388578d), java.lang.Long.valueOf(vu3Var.f388578d)) && n51.f.a(java.lang.Long.valueOf(this.f388579e), java.lang.Long.valueOf(vu3Var.f388579e)) && n51.f.a(this.f388580f, vu3Var.f388580f) && n51.f.a(this.f388581g, vu3Var.f388581g) && n51.f.a(java.lang.Integer.valueOf(this.f388582h), java.lang.Integer.valueOf(vu3Var.f388582h)) && n51.f.a(this.f388583i, vu3Var.f388583i) && n51.f.a(this.f388584m, vu3Var.f388584m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f388578d);
            fVar.h(2, this.f388579e);
            java.lang.String str = this.f388580f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388581g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f388582h);
            java.lang.String str3 = this.f388583i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f388584m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f388578d) + 0 + b36.f.h(2, this.f388579e);
            java.lang.String str5 = this.f388580f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388581g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            int e17 = h17 + b36.f.e(5, this.f388582h);
            java.lang.String str7 = this.f388583i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f388584m;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.vu3 vu3Var = (r45.vu3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vu3Var.f388578d = aVar2.i(intValue);
                return 0;
            case 2:
                vu3Var.f388579e = aVar2.i(intValue);
                return 0;
            case 3:
                vu3Var.f388580f = aVar2.k(intValue);
                return 0;
            case 4:
                vu3Var.f388581g = aVar2.k(intValue);
                return 0;
            case 5:
                vu3Var.f388582h = aVar2.g(intValue);
                return 0;
            case 6:
                vu3Var.f388583i = aVar2.k(intValue);
                return 0;
            case 7:
                vu3Var.f388584m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
