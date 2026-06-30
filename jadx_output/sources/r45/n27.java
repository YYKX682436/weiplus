package r45;

/* loaded from: classes9.dex */
public class n27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381033d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381034e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381035f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381036g;

    /* renamed from: h, reason: collision with root package name */
    public int f381037h;

    /* renamed from: i, reason: collision with root package name */
    public int f381038i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f381039m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public long f381040n;

    /* renamed from: o, reason: collision with root package name */
    public long f381041o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n27)) {
            return false;
        }
        r45.n27 n27Var = (r45.n27) fVar;
        return n51.f.a(this.f381033d, n27Var.f381033d) && n51.f.a(this.f381034e, n27Var.f381034e) && n51.f.a(this.f381035f, n27Var.f381035f) && n51.f.a(this.f381036g, n27Var.f381036g) && n51.f.a(java.lang.Integer.valueOf(this.f381037h), java.lang.Integer.valueOf(n27Var.f381037h)) && n51.f.a(java.lang.Integer.valueOf(this.f381038i), java.lang.Integer.valueOf(n27Var.f381038i)) && n51.f.a(this.f381039m, n27Var.f381039m) && n51.f.a(java.lang.Long.valueOf(this.f381040n), java.lang.Long.valueOf(n27Var.f381040n)) && n51.f.a(java.lang.Long.valueOf(this.f381041o), java.lang.Long.valueOf(n27Var.f381041o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381033d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381034e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381035f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381036g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f381037h);
            fVar.e(7, this.f381038i);
            fVar.g(8, 8, this.f381039m);
            fVar.h(9, this.f381040n);
            fVar.h(10, this.f381041o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f381033d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f381034e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f381035f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f381036g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f381037h) + b36.f.e(7, this.f381038i) + b36.f.g(8, 8, this.f381039m) + b36.f.h(9, this.f381040n) + b36.f.h(10, this.f381041o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381039m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.n27 n27Var = (r45.n27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n27Var.f381033d = aVar2.k(intValue);
                return 0;
            case 2:
                n27Var.f381034e = aVar2.k(intValue);
                return 0;
            case 3:
                n27Var.f381035f = aVar2.k(intValue);
                return 0;
            case 4:
                n27Var.f381036g = aVar2.k(intValue);
                return 0;
            case 5:
                n27Var.f381037h = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                n27Var.f381038i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ev3 ev3Var = new r45.ev3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ev3Var.parseFrom(bArr2);
                    }
                    n27Var.f381039m.add(ev3Var);
                }
                return 0;
            case 9:
                n27Var.f381040n = aVar2.i(intValue);
                return 0;
            case 10:
                n27Var.f381041o = aVar2.i(intValue);
                return 0;
        }
    }
}
