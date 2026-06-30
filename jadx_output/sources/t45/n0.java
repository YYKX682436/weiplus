package t45;

/* loaded from: classes10.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f415615d;

    /* renamed from: e, reason: collision with root package name */
    public t45.f0 f415616e;

    /* renamed from: f, reason: collision with root package name */
    public t45.g f415617f;

    /* renamed from: g, reason: collision with root package name */
    public int f415618g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f415619h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f415620i;

    /* renamed from: m, reason: collision with root package name */
    public t45.e1 f415621m;

    /* renamed from: n, reason: collision with root package name */
    public t45.o0 f415622n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.n0)) {
            return false;
        }
        t45.n0 n0Var = (t45.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f415615d), java.lang.Integer.valueOf(n0Var.f415615d)) && n51.f.a(this.f415616e, n0Var.f415616e) && n51.f.a(this.f415617f, n0Var.f415617f) && n51.f.a(java.lang.Integer.valueOf(this.f415618g), java.lang.Integer.valueOf(n0Var.f415618g)) && n51.f.a(java.lang.Boolean.valueOf(this.f415619h), java.lang.Boolean.valueOf(n0Var.f415619h)) && n51.f.a(this.f415620i, n0Var.f415620i) && n51.f.a(this.f415621m, n0Var.f415621m) && n51.f.a(this.f415622n, n0Var.f415622n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f415615d);
            t45.f0 f0Var = this.f415616e;
            if (f0Var != null) {
                fVar.i(2, f0Var.computeSize());
                this.f415616e.writeFields(fVar);
            }
            t45.g gVar = this.f415617f;
            if (gVar != null) {
                fVar.i(3, gVar.computeSize());
                this.f415617f.writeFields(fVar);
            }
            fVar.e(4, this.f415618g);
            fVar.a(5, this.f415619h);
            java.lang.String str = this.f415620i;
            if (str != null) {
                fVar.j(6, str);
            }
            t45.e1 e1Var = this.f415621m;
            if (e1Var != null) {
                fVar.i(7, e1Var.computeSize());
                this.f415621m.writeFields(fVar);
            }
            t45.o0 o0Var = this.f415622n;
            if (o0Var != null) {
                fVar.i(8, o0Var.computeSize());
                this.f415622n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f415615d) + 0;
            t45.f0 f0Var2 = this.f415616e;
            if (f0Var2 != null) {
                e17 += b36.f.i(2, f0Var2.computeSize());
            }
            t45.g gVar2 = this.f415617f;
            if (gVar2 != null) {
                e17 += b36.f.i(3, gVar2.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f415618g) + b36.f.a(5, this.f415619h);
            java.lang.String str2 = this.f415620i;
            if (str2 != null) {
                e18 += b36.f.j(6, str2);
            }
            t45.e1 e1Var2 = this.f415621m;
            if (e1Var2 != null) {
                e18 += b36.f.i(7, e1Var2.computeSize());
            }
            t45.o0 o0Var2 = this.f415622n;
            return o0Var2 != null ? e18 + b36.f.i(8, o0Var2.computeSize()) : e18;
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
        t45.n0 n0Var = (t45.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n0Var.f415615d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    t45.f0 f0Var3 = new t45.f0();
                    if (bArr != null && bArr.length > 0) {
                        f0Var3.parseFrom(bArr);
                    }
                    n0Var.f415616e = f0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    t45.g gVar3 = new t45.g();
                    if (bArr2 != null && bArr2.length > 0) {
                        gVar3.parseFrom(bArr2);
                    }
                    n0Var.f415617f = gVar3;
                }
                return 0;
            case 4:
                n0Var.f415618g = aVar2.g(intValue);
                return 0;
            case 5:
                n0Var.f415619h = aVar2.c(intValue);
                return 0;
            case 6:
                n0Var.f415620i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    t45.e1 e1Var3 = new t45.e1();
                    if (bArr3 != null && bArr3.length > 0) {
                        e1Var3.parseFrom(bArr3);
                    }
                    n0Var.f415621m = e1Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    t45.o0 o0Var3 = new t45.o0();
                    if (bArr4 != null && bArr4.length > 0) {
                        o0Var3.parseFrom(bArr4);
                    }
                    n0Var.f415622n = o0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
