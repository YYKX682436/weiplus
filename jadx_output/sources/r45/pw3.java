package r45;

/* loaded from: classes11.dex */
public class pw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f383425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f383427f;

    /* renamed from: g, reason: collision with root package name */
    public long f383428g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383429h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383430i;

    /* renamed from: m, reason: collision with root package name */
    public int f383431m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pw3)) {
            return false;
        }
        r45.pw3 pw3Var = (r45.pw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f383425d), java.lang.Long.valueOf(pw3Var.f383425d)) && n51.f.a(this.f383426e, pw3Var.f383426e) && n51.f.a(java.lang.Boolean.valueOf(this.f383427f), java.lang.Boolean.valueOf(pw3Var.f383427f)) && n51.f.a(java.lang.Long.valueOf(this.f383428g), java.lang.Long.valueOf(pw3Var.f383428g)) && n51.f.a(this.f383429h, pw3Var.f383429h) && n51.f.a(this.f383430i, pw3Var.f383430i) && n51.f.a(java.lang.Integer.valueOf(this.f383431m), java.lang.Integer.valueOf(pw3Var.f383431m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f383425d);
            java.lang.String str = this.f383426e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f383427f);
            fVar.h(4, this.f383428g);
            java.lang.String str2 = this.f383429h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f383430i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f383431m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f383425d) + 0;
            java.lang.String str4 = this.f383426e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int a17 = h17 + b36.f.a(3, this.f383427f) + b36.f.h(4, this.f383428g);
            java.lang.String str5 = this.f383429h;
            if (str5 != null) {
                a17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f383430i;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            return a17 + b36.f.e(7, this.f383431m);
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
        r45.pw3 pw3Var = (r45.pw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pw3Var.f383425d = aVar2.i(intValue);
                return 0;
            case 2:
                pw3Var.f383426e = aVar2.k(intValue);
                return 0;
            case 3:
                pw3Var.f383427f = aVar2.c(intValue);
                return 0;
            case 4:
                pw3Var.f383428g = aVar2.i(intValue);
                return 0;
            case 5:
                pw3Var.f383429h = aVar2.k(intValue);
                return 0;
            case 6:
                pw3Var.f383430i = aVar2.k(intValue);
                return 0;
            case 7:
                pw3Var.f383431m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
