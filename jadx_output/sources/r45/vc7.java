package r45;

/* loaded from: classes9.dex */
public class vc7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388113d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388114e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k46 f388115f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f388116g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f388117h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ym6 f388118i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388119m;

    /* renamed from: n, reason: collision with root package name */
    public int f388120n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f388121o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cz f388122p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc7)) {
            return false;
        }
        r45.vc7 vc7Var = (r45.vc7) fVar;
        return n51.f.a(this.f388113d, vc7Var.f388113d) && n51.f.a(this.f388114e, vc7Var.f388114e) && n51.f.a(this.f388115f, vc7Var.f388115f) && n51.f.a(java.lang.Boolean.valueOf(this.f388116g), java.lang.Boolean.valueOf(vc7Var.f388116g)) && n51.f.a(java.lang.Boolean.valueOf(this.f388117h), java.lang.Boolean.valueOf(vc7Var.f388117h)) && n51.f.a(this.f388118i, vc7Var.f388118i) && n51.f.a(java.lang.Boolean.valueOf(this.f388119m), java.lang.Boolean.valueOf(vc7Var.f388119m)) && n51.f.a(java.lang.Integer.valueOf(this.f388120n), java.lang.Integer.valueOf(vc7Var.f388120n)) && n51.f.a(java.lang.Boolean.valueOf(this.f388121o), java.lang.Boolean.valueOf(vc7Var.f388121o)) && n51.f.a(this.f388122p, vc7Var.f388122p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388113d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388114e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.k46 k46Var = this.f388115f;
            if (k46Var != null) {
                fVar.i(3, k46Var.computeSize());
                this.f388115f.writeFields(fVar);
            }
            fVar.a(4, this.f388116g);
            fVar.a(5, this.f388117h);
            r45.ym6 ym6Var = this.f388118i;
            if (ym6Var != null) {
                fVar.i(6, ym6Var.computeSize());
                this.f388118i.writeFields(fVar);
            }
            fVar.a(7, this.f388119m);
            fVar.e(8, this.f388120n);
            fVar.a(9, this.f388121o);
            r45.cz czVar = this.f388122p;
            if (czVar != null) {
                fVar.i(10, czVar.computeSize());
                this.f388122p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f388113d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f388114e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.k46 k46Var2 = this.f388115f;
            if (k46Var2 != null) {
                j17 += b36.f.i(3, k46Var2.computeSize());
            }
            int a17 = j17 + b36.f.a(4, this.f388116g) + b36.f.a(5, this.f388117h);
            r45.ym6 ym6Var2 = this.f388118i;
            if (ym6Var2 != null) {
                a17 += b36.f.i(6, ym6Var2.computeSize());
            }
            int a18 = a17 + b36.f.a(7, this.f388119m) + b36.f.e(8, this.f388120n) + b36.f.a(9, this.f388121o);
            r45.cz czVar2 = this.f388122p;
            return czVar2 != null ? a18 + b36.f.i(10, czVar2.computeSize()) : a18;
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
        r45.vc7 vc7Var = (r45.vc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vc7Var.f388113d = aVar2.k(intValue);
                return 0;
            case 2:
                vc7Var.f388114e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.k46 k46Var3 = new r45.k46();
                    if (bArr != null && bArr.length > 0) {
                        k46Var3.parseFrom(bArr);
                    }
                    vc7Var.f388115f = k46Var3;
                }
                return 0;
            case 4:
                vc7Var.f388116g = aVar2.c(intValue);
                return 0;
            case 5:
                vc7Var.f388117h = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.ym6 ym6Var3 = new r45.ym6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ym6Var3.parseFrom(bArr2);
                    }
                    vc7Var.f388118i = ym6Var3;
                }
                return 0;
            case 7:
                vc7Var.f388119m = aVar2.c(intValue);
                return 0;
            case 8:
                vc7Var.f388120n = aVar2.g(intValue);
                return 0;
            case 9:
                vc7Var.f388121o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.cz czVar3 = new r45.cz();
                    if (bArr3 != null && bArr3.length > 0) {
                        czVar3.parseFrom(bArr3);
                    }
                    vc7Var.f388122p = czVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
