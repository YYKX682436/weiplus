package r45;

/* loaded from: classes8.dex */
public class j4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377557d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f377558e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f377559f;

    /* renamed from: g, reason: collision with root package name */
    public int f377560g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f377561h;

    /* renamed from: i, reason: collision with root package name */
    public int f377562i;

    /* renamed from: m, reason: collision with root package name */
    public int f377563m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f377564n;

    /* renamed from: o, reason: collision with root package name */
    public int f377565o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f377566p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f377567q;

    /* renamed from: r, reason: collision with root package name */
    public long f377568r;

    /* renamed from: s, reason: collision with root package name */
    public int f377569s;

    /* renamed from: t, reason: collision with root package name */
    public long f377570t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j4)) {
            return false;
        }
        r45.j4 j4Var = (r45.j4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377557d), java.lang.Integer.valueOf(j4Var.f377557d)) && n51.f.a(this.f377558e, j4Var.f377558e) && n51.f.a(this.f377559f, j4Var.f377559f) && n51.f.a(java.lang.Integer.valueOf(this.f377560g), java.lang.Integer.valueOf(j4Var.f377560g)) && n51.f.a(this.f377561h, j4Var.f377561h) && n51.f.a(java.lang.Integer.valueOf(this.f377562i), java.lang.Integer.valueOf(j4Var.f377562i)) && n51.f.a(java.lang.Integer.valueOf(this.f377563m), java.lang.Integer.valueOf(j4Var.f377563m)) && n51.f.a(this.f377564n, j4Var.f377564n) && n51.f.a(java.lang.Integer.valueOf(this.f377565o), java.lang.Integer.valueOf(j4Var.f377565o)) && n51.f.a(this.f377566p, j4Var.f377566p) && n51.f.a(this.f377567q, j4Var.f377567q) && n51.f.a(java.lang.Long.valueOf(this.f377568r), java.lang.Long.valueOf(j4Var.f377568r)) && n51.f.a(java.lang.Integer.valueOf(this.f377569s), java.lang.Integer.valueOf(j4Var.f377569s)) && n51.f.a(java.lang.Long.valueOf(this.f377570t), java.lang.Long.valueOf(j4Var.f377570t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377557d);
            r45.du5 du5Var = this.f377558e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f377558e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f377559f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f377559f.writeFields(fVar);
            }
            fVar.e(4, this.f377560g);
            r45.du5 du5Var3 = this.f377561h;
            if (du5Var3 != null) {
                fVar.i(5, du5Var3.computeSize());
                this.f377561h.writeFields(fVar);
            }
            fVar.e(6, this.f377562i);
            fVar.e(7, this.f377563m);
            r45.cu5 cu5Var = this.f377564n;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f377564n.writeFields(fVar);
            }
            fVar.e(9, this.f377565o);
            java.lang.String str = this.f377566p;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f377567q;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.h(12, this.f377568r);
            fVar.e(13, this.f377569s);
            fVar.h(15, this.f377570t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377557d) + 0;
            r45.du5 du5Var4 = this.f377558e;
            if (du5Var4 != null) {
                e17 += b36.f.i(2, du5Var4.computeSize());
            }
            r45.du5 du5Var5 = this.f377559f;
            if (du5Var5 != null) {
                e17 += b36.f.i(3, du5Var5.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f377560g);
            r45.du5 du5Var6 = this.f377561h;
            if (du5Var6 != null) {
                e18 += b36.f.i(5, du5Var6.computeSize());
            }
            int e19 = e18 + b36.f.e(6, this.f377562i) + b36.f.e(7, this.f377563m);
            r45.cu5 cu5Var2 = this.f377564n;
            if (cu5Var2 != null) {
                e19 += b36.f.i(8, cu5Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(9, this.f377565o);
            java.lang.String str3 = this.f377566p;
            if (str3 != null) {
                e27 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.f377567q;
            if (str4 != null) {
                e27 += b36.f.j(11, str4);
            }
            return e27 + b36.f.h(12, this.f377568r) + b36.f.e(13, this.f377569s) + b36.f.h(15, this.f377570t);
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
        r45.j4 j4Var = (r45.j4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j4Var.f377557d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var7.b(bArr);
                    }
                    j4Var.f377558e = du5Var7;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var8.b(bArr2);
                    }
                    j4Var.f377559f = du5Var8;
                }
                return 0;
            case 4:
                j4Var.f377560g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var9.b(bArr3);
                    }
                    j4Var.f377561h = du5Var9;
                }
                return 0;
            case 6:
                j4Var.f377562i = aVar2.g(intValue);
                return 0;
            case 7:
                j4Var.f377563m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    j4Var.f377564n = cu5Var3;
                }
                return 0;
            case 9:
                j4Var.f377565o = aVar2.g(intValue);
                return 0;
            case 10:
                j4Var.f377566p = aVar2.k(intValue);
                return 0;
            case 11:
                j4Var.f377567q = aVar2.k(intValue);
                return 0;
            case 12:
                j4Var.f377568r = aVar2.i(intValue);
                return 0;
            case 13:
                j4Var.f377569s = aVar2.g(intValue);
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                j4Var.f377570t = aVar2.i(intValue);
                return 0;
        }
    }
}
