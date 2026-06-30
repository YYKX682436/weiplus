package m53;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323568d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323570f;

    /* renamed from: g, reason: collision with root package name */
    public m53.i6 f323571g;

    /* renamed from: h, reason: collision with root package name */
    public int f323572h;

    /* renamed from: i, reason: collision with root package name */
    public int f323573i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323574m;

    /* renamed from: n, reason: collision with root package name */
    public int f323575n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.b0)) {
            return false;
        }
        m53.b0 b0Var = (m53.b0) fVar;
        return n51.f.a(this.f323568d, b0Var.f323568d) && n51.f.a(this.f323569e, b0Var.f323569e) && n51.f.a(this.f323570f, b0Var.f323570f) && n51.f.a(this.f323571g, b0Var.f323571g) && n51.f.a(java.lang.Integer.valueOf(this.f323572h), java.lang.Integer.valueOf(b0Var.f323572h)) && n51.f.a(java.lang.Integer.valueOf(this.f323573i), java.lang.Integer.valueOf(b0Var.f323573i)) && n51.f.a(this.f323574m, b0Var.f323574m) && n51.f.a(java.lang.Integer.valueOf(this.f323575n), java.lang.Integer.valueOf(b0Var.f323575n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323568d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323569e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323570f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            m53.i6 i6Var = this.f323571g;
            if (i6Var != null) {
                fVar.i(5, i6Var.computeSize());
                this.f323571g.writeFields(fVar);
            }
            fVar.e(6, this.f323572h);
            fVar.e(7, this.f323573i);
            java.lang.String str4 = this.f323574m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f323575n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f323568d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f323569e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f323570f;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            m53.i6 i6Var2 = this.f323571g;
            if (i6Var2 != null) {
                j17 += b36.f.i(5, i6Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(6, this.f323572h) + b36.f.e(7, this.f323573i);
            java.lang.String str8 = this.f323574m;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f323575n);
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
        m53.b0 b0Var = (m53.b0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b0Var.f323568d = aVar2.k(intValue);
                return 0;
            case 2:
                b0Var.f323569e = aVar2.k(intValue);
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                b0Var.f323570f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.i6 i6Var3 = new m53.i6();
                    if (bArr != null && bArr.length > 0) {
                        i6Var3.parseFrom(bArr);
                    }
                    b0Var.f323571g = i6Var3;
                }
                return 0;
            case 6:
                b0Var.f323572h = aVar2.g(intValue);
                return 0;
            case 7:
                b0Var.f323573i = aVar2.g(intValue);
                return 0;
            case 8:
                b0Var.f323574m = aVar2.k(intValue);
                return 0;
            case 9:
                b0Var.f323575n = aVar2.g(intValue);
                return 0;
        }
    }
}
