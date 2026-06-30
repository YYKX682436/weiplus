package r45;

/* loaded from: classes15.dex */
public class hw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.bn6 f376496e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bn6 f376497f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376499h;

    /* renamed from: i, reason: collision with root package name */
    public int f376500i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376501m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376502n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376503o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f376505q;

    /* renamed from: s, reason: collision with root package name */
    public r45.kw3 f376507s;

    /* renamed from: u, reason: collision with root package name */
    public r45.a07 f376509u;

    /* renamed from: v, reason: collision with root package name */
    public int f376510v;

    /* renamed from: d, reason: collision with root package name */
    public int f376495d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f376498g = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f376504p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f376506r = false;

    /* renamed from: t, reason: collision with root package name */
    public long f376508t = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw3)) {
            return false;
        }
        r45.hw3 hw3Var = (r45.hw3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376495d), java.lang.Integer.valueOf(hw3Var.f376495d)) && n51.f.a(this.f376496e, hw3Var.f376496e) && n51.f.a(this.f376497f, hw3Var.f376497f) && n51.f.a(java.lang.Boolean.valueOf(this.f376498g), java.lang.Boolean.valueOf(hw3Var.f376498g)) && n51.f.a(this.f376499h, hw3Var.f376499h) && n51.f.a(java.lang.Integer.valueOf(this.f376500i), java.lang.Integer.valueOf(hw3Var.f376500i)) && n51.f.a(this.f376501m, hw3Var.f376501m) && n51.f.a(this.f376502n, hw3Var.f376502n) && n51.f.a(this.f376503o, hw3Var.f376503o) && n51.f.a(java.lang.Boolean.valueOf(this.f376504p), java.lang.Boolean.valueOf(hw3Var.f376504p)) && n51.f.a(java.lang.Boolean.valueOf(this.f376505q), java.lang.Boolean.valueOf(hw3Var.f376505q)) && n51.f.a(java.lang.Boolean.valueOf(this.f376506r), java.lang.Boolean.valueOf(hw3Var.f376506r)) && n51.f.a(this.f376507s, hw3Var.f376507s) && n51.f.a(java.lang.Long.valueOf(this.f376508t), java.lang.Long.valueOf(hw3Var.f376508t)) && n51.f.a(this.f376509u, hw3Var.f376509u) && n51.f.a(java.lang.Integer.valueOf(this.f376510v), java.lang.Integer.valueOf(hw3Var.f376510v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376495d);
            r45.bn6 bn6Var = this.f376496e;
            if (bn6Var != null) {
                fVar.i(2, bn6Var.computeSize());
                this.f376496e.writeFields(fVar);
            }
            r45.bn6 bn6Var2 = this.f376497f;
            if (bn6Var2 != null) {
                fVar.i(3, bn6Var2.computeSize());
                this.f376497f.writeFields(fVar);
            }
            fVar.a(4, this.f376498g);
            java.lang.String str = this.f376499h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f376500i);
            java.lang.String str2 = this.f376501m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f376502n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f376503o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.a(10, this.f376504p);
            fVar.a(11, this.f376505q);
            fVar.a(12, this.f376506r);
            r45.kw3 kw3Var = this.f376507s;
            if (kw3Var != null) {
                fVar.i(13, kw3Var.computeSize());
                this.f376507s.writeFields(fVar);
            }
            fVar.h(14, this.f376508t);
            r45.a07 a07Var = this.f376509u;
            if (a07Var != null) {
                fVar.i(15, a07Var.computeSize());
                this.f376509u.writeFields(fVar);
            }
            fVar.e(16, this.f376510v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376495d) + 0;
            r45.bn6 bn6Var3 = this.f376496e;
            if (bn6Var3 != null) {
                e17 += b36.f.i(2, bn6Var3.computeSize());
            }
            r45.bn6 bn6Var4 = this.f376497f;
            if (bn6Var4 != null) {
                e17 += b36.f.i(3, bn6Var4.computeSize());
            }
            int a17 = e17 + b36.f.a(4, this.f376498g);
            java.lang.String str5 = this.f376499h;
            if (str5 != null) {
                a17 += b36.f.j(5, str5);
            }
            int e18 = a17 + b36.f.e(6, this.f376500i);
            java.lang.String str6 = this.f376501m;
            if (str6 != null) {
                e18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f376502n;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f376503o;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            int a18 = e18 + b36.f.a(10, this.f376504p) + b36.f.a(11, this.f376505q) + b36.f.a(12, this.f376506r);
            r45.kw3 kw3Var2 = this.f376507s;
            if (kw3Var2 != null) {
                a18 += b36.f.i(13, kw3Var2.computeSize());
            }
            int h17 = a18 + b36.f.h(14, this.f376508t);
            r45.a07 a07Var2 = this.f376509u;
            if (a07Var2 != null) {
                h17 += b36.f.i(15, a07Var2.computeSize());
            }
            return h17 + b36.f.e(16, this.f376510v);
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
        r45.hw3 hw3Var = (r45.hw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hw3Var.f376495d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bn6 bn6Var5 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var5.parseFrom(bArr);
                    }
                    hw3Var.f376496e = bn6Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.bn6 bn6Var6 = new r45.bn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn6Var6.parseFrom(bArr2);
                    }
                    hw3Var.f376497f = bn6Var6;
                }
                return 0;
            case 4:
                hw3Var.f376498g = aVar2.c(intValue);
                return 0;
            case 5:
                hw3Var.f376499h = aVar2.k(intValue);
                return 0;
            case 6:
                hw3Var.f376500i = aVar2.g(intValue);
                return 0;
            case 7:
                hw3Var.f376501m = aVar2.k(intValue);
                return 0;
            case 8:
                hw3Var.f376502n = aVar2.k(intValue);
                return 0;
            case 9:
                hw3Var.f376503o = aVar2.k(intValue);
                return 0;
            case 10:
                hw3Var.f376504p = aVar2.c(intValue);
                return 0;
            case 11:
                hw3Var.f376505q = aVar2.c(intValue);
                return 0;
            case 12:
                hw3Var.f376506r = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.kw3 kw3Var3 = new r45.kw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        kw3Var3.parseFrom(bArr3);
                    }
                    hw3Var.f376507s = kw3Var3;
                }
                return 0;
            case 14:
                hw3Var.f376508t = aVar2.i(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.a07 a07Var3 = new r45.a07();
                    if (bArr4 != null && bArr4.length > 0) {
                        a07Var3.parseFrom(bArr4);
                    }
                    hw3Var.f376509u = a07Var3;
                }
                return 0;
            case 16:
                hw3Var.f376510v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
