package r45;

/* loaded from: classes2.dex */
public class g07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374789d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j32 f374790e;

    /* renamed from: f, reason: collision with root package name */
    public int f374791f;

    /* renamed from: g, reason: collision with root package name */
    public int f374792g;

    /* renamed from: h, reason: collision with root package name */
    public int f374793h;

    /* renamed from: i, reason: collision with root package name */
    public int f374794i;

    /* renamed from: m, reason: collision with root package name */
    public int f374795m;

    /* renamed from: n, reason: collision with root package name */
    public int f374796n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g07)) {
            return false;
        }
        r45.g07 g07Var = (r45.g07) fVar;
        return n51.f.a(this.f374789d, g07Var.f374789d) && n51.f.a(this.f374790e, g07Var.f374790e) && n51.f.a(java.lang.Integer.valueOf(this.f374791f), java.lang.Integer.valueOf(g07Var.f374791f)) && n51.f.a(java.lang.Integer.valueOf(this.f374792g), java.lang.Integer.valueOf(g07Var.f374792g)) && n51.f.a(java.lang.Integer.valueOf(this.f374793h), java.lang.Integer.valueOf(g07Var.f374793h)) && n51.f.a(java.lang.Integer.valueOf(this.f374794i), java.lang.Integer.valueOf(g07Var.f374794i)) && n51.f.a(java.lang.Integer.valueOf(this.f374795m), java.lang.Integer.valueOf(g07Var.f374795m)) && n51.f.a(java.lang.Integer.valueOf(this.f374796n), java.lang.Integer.valueOf(g07Var.f374796n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374789d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.j32 j32Var = this.f374790e;
            if (j32Var != null) {
                fVar.i(2, j32Var.computeSize());
                this.f374790e.writeFields(fVar);
            }
            fVar.e(3, this.f374791f);
            fVar.e(4, this.f374792g);
            fVar.e(5, this.f374793h);
            fVar.e(6, this.f374794i);
            fVar.e(7, this.f374795m);
            fVar.e(8, this.f374796n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374789d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.j32 j32Var2 = this.f374790e;
            if (j32Var2 != null) {
                j17 += b36.f.i(2, j32Var2.computeSize());
            }
            return j17 + b36.f.e(3, this.f374791f) + b36.f.e(4, this.f374792g) + b36.f.e(5, this.f374793h) + b36.f.e(6, this.f374794i) + b36.f.e(7, this.f374795m) + b36.f.e(8, this.f374796n);
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
        r45.g07 g07Var = (r45.g07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g07Var.f374789d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr != null && bArr.length > 0) {
                        j32Var3.parseFrom(bArr);
                    }
                    g07Var.f374790e = j32Var3;
                }
                return 0;
            case 3:
                g07Var.f374791f = aVar2.g(intValue);
                return 0;
            case 4:
                g07Var.f374792g = aVar2.g(intValue);
                return 0;
            case 5:
                g07Var.f374793h = aVar2.g(intValue);
                return 0;
            case 6:
                g07Var.f374794i = aVar2.g(intValue);
                return 0;
            case 7:
                g07Var.f374795m = aVar2.g(intValue);
                return 0;
            case 8:
                g07Var.f374796n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
