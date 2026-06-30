package r45;

/* loaded from: classes4.dex */
public class l86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379230d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f379231e;

    /* renamed from: f, reason: collision with root package name */
    public int f379232f;

    /* renamed from: g, reason: collision with root package name */
    public int f379233g;

    /* renamed from: h, reason: collision with root package name */
    public int f379234h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379235i;

    /* renamed from: m, reason: collision with root package name */
    public int f379236m;

    /* renamed from: n, reason: collision with root package name */
    public int f379237n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l86)) {
            return false;
        }
        r45.l86 l86Var = (r45.l86) fVar;
        return n51.f.a(this.f379230d, l86Var.f379230d) && n51.f.a(this.f379231e, l86Var.f379231e) && n51.f.a(java.lang.Integer.valueOf(this.f379232f), java.lang.Integer.valueOf(l86Var.f379232f)) && n51.f.a(java.lang.Integer.valueOf(this.f379233g), java.lang.Integer.valueOf(l86Var.f379233g)) && n51.f.a(java.lang.Integer.valueOf(this.f379234h), java.lang.Integer.valueOf(l86Var.f379234h)) && n51.f.a(this.f379235i, l86Var.f379235i) && n51.f.a(java.lang.Integer.valueOf(this.f379236m), java.lang.Integer.valueOf(l86Var.f379236m)) && n51.f.a(java.lang.Integer.valueOf(this.f379237n), java.lang.Integer.valueOf(l86Var.f379237n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379230d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.cu5 cu5Var = this.f379231e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f379231e.writeFields(fVar);
            }
            fVar.e(3, this.f379232f);
            fVar.e(4, this.f379233g);
            fVar.e(5, this.f379234h);
            java.lang.String str2 = this.f379235i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f379236m);
            fVar.e(8, this.f379237n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f379230d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.cu5 cu5Var2 = this.f379231e;
            if (cu5Var2 != null) {
                j17 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(3, this.f379232f) + b36.f.e(4, this.f379233g) + b36.f.e(5, this.f379234h);
            java.lang.String str4 = this.f379235i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f379236m) + b36.f.e(8, this.f379237n);
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
        r45.l86 l86Var = (r45.l86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l86Var.f379230d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    l86Var.f379231e = cu5Var3;
                }
                return 0;
            case 3:
                l86Var.f379232f = aVar2.g(intValue);
                return 0;
            case 4:
                l86Var.f379233g = aVar2.g(intValue);
                return 0;
            case 5:
                l86Var.f379234h = aVar2.g(intValue);
                return 0;
            case 6:
                l86Var.f379235i = aVar2.k(intValue);
                return 0;
            case 7:
                l86Var.f379236m = aVar2.g(intValue);
                return 0;
            case 8:
                l86Var.f379237n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
