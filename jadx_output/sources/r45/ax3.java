package r45;

/* loaded from: classes9.dex */
public class ax3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370331d;

    /* renamed from: e, reason: collision with root package name */
    public long f370332e;

    /* renamed from: f, reason: collision with root package name */
    public int f370333f;

    /* renamed from: g, reason: collision with root package name */
    public long f370334g;

    /* renamed from: h, reason: collision with root package name */
    public long f370335h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370336i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370337m;

    /* renamed from: n, reason: collision with root package name */
    public int f370338n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f370339o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ax3)) {
            return false;
        }
        r45.ax3 ax3Var = (r45.ax3) fVar;
        return n51.f.a(this.f370331d, ax3Var.f370331d) && n51.f.a(java.lang.Long.valueOf(this.f370332e), java.lang.Long.valueOf(ax3Var.f370332e)) && n51.f.a(java.lang.Integer.valueOf(this.f370333f), java.lang.Integer.valueOf(ax3Var.f370333f)) && n51.f.a(java.lang.Long.valueOf(this.f370334g), java.lang.Long.valueOf(ax3Var.f370334g)) && n51.f.a(java.lang.Long.valueOf(this.f370335h), java.lang.Long.valueOf(ax3Var.f370335h)) && n51.f.a(this.f370336i, ax3Var.f370336i) && n51.f.a(this.f370337m, ax3Var.f370337m) && n51.f.a(java.lang.Integer.valueOf(this.f370338n), java.lang.Integer.valueOf(ax3Var.f370338n)) && n51.f.a(this.f370339o, ax3Var.f370339o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370331d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f370332e);
            fVar.e(3, this.f370333f);
            fVar.h(4, this.f370334g);
            fVar.h(5, this.f370335h);
            java.lang.String str2 = this.f370336i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f370337m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f370338n);
            java.lang.String str4 = this.f370339o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370331d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.h(2, this.f370332e) + b36.f.e(3, this.f370333f) + b36.f.h(4, this.f370334g) + b36.f.h(5, this.f370335h);
            java.lang.String str6 = this.f370336i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f370337m;
            if (str7 != null) {
                j17 += b36.f.j(7, str7);
            }
            int e17 = j17 + b36.f.e(8, this.f370338n);
            java.lang.String str8 = this.f370339o;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
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
        r45.ax3 ax3Var = (r45.ax3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ax3Var.f370331d = aVar2.k(intValue);
                return 0;
            case 2:
                ax3Var.f370332e = aVar2.i(intValue);
                return 0;
            case 3:
                ax3Var.f370333f = aVar2.g(intValue);
                return 0;
            case 4:
                ax3Var.f370334g = aVar2.i(intValue);
                return 0;
            case 5:
                ax3Var.f370335h = aVar2.i(intValue);
                return 0;
            case 6:
                ax3Var.f370336i = aVar2.k(intValue);
                return 0;
            case 7:
                ax3Var.f370337m = aVar2.k(intValue);
                return 0;
            case 8:
                ax3Var.f370338n = aVar2.g(intValue);
                return 0;
            case 9:
                ax3Var.f370339o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
