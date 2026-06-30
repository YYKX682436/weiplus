package r45;

/* loaded from: classes4.dex */
public class df6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f372383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372385f;

    /* renamed from: g, reason: collision with root package name */
    public int f372386g;

    /* renamed from: h, reason: collision with root package name */
    public int f372387h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f372388i;

    /* renamed from: m, reason: collision with root package name */
    public int f372389m;

    /* renamed from: o, reason: collision with root package name */
    public int f372391o;

    /* renamed from: q, reason: collision with root package name */
    public int f372393q;

    /* renamed from: r, reason: collision with root package name */
    public int f372394r;

    /* renamed from: s, reason: collision with root package name */
    public int f372395s;

    /* renamed from: t, reason: collision with root package name */
    public int f372396t;

    /* renamed from: u, reason: collision with root package name */
    public int f372397u;

    /* renamed from: w, reason: collision with root package name */
    public int f372399w;

    /* renamed from: y, reason: collision with root package name */
    public int f372401y;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f372390n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f372392p = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f372398v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f372400x = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f372402z = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df6)) {
            return false;
        }
        r45.df6 df6Var = (r45.df6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f372383d), java.lang.Long.valueOf(df6Var.f372383d)) && n51.f.a(this.f372384e, df6Var.f372384e) && n51.f.a(this.f372385f, df6Var.f372385f) && n51.f.a(java.lang.Integer.valueOf(this.f372386g), java.lang.Integer.valueOf(df6Var.f372386g)) && n51.f.a(java.lang.Integer.valueOf(this.f372387h), java.lang.Integer.valueOf(df6Var.f372387h)) && n51.f.a(this.f372388i, df6Var.f372388i) && n51.f.a(java.lang.Integer.valueOf(this.f372389m), java.lang.Integer.valueOf(df6Var.f372389m)) && n51.f.a(this.f372390n, df6Var.f372390n) && n51.f.a(java.lang.Integer.valueOf(this.f372391o), java.lang.Integer.valueOf(df6Var.f372391o)) && n51.f.a(this.f372392p, df6Var.f372392p) && n51.f.a(java.lang.Integer.valueOf(this.f372393q), java.lang.Integer.valueOf(df6Var.f372393q)) && n51.f.a(java.lang.Integer.valueOf(this.f372394r), java.lang.Integer.valueOf(df6Var.f372394r)) && n51.f.a(java.lang.Integer.valueOf(this.f372395s), java.lang.Integer.valueOf(df6Var.f372395s)) && n51.f.a(java.lang.Integer.valueOf(this.f372396t), java.lang.Integer.valueOf(df6Var.f372396t)) && n51.f.a(java.lang.Integer.valueOf(this.f372397u), java.lang.Integer.valueOf(df6Var.f372397u)) && n51.f.a(this.f372398v, df6Var.f372398v) && n51.f.a(java.lang.Integer.valueOf(this.f372399w), java.lang.Integer.valueOf(df6Var.f372399w)) && n51.f.a(this.f372400x, df6Var.f372400x) && n51.f.a(java.lang.Integer.valueOf(this.f372401y), java.lang.Integer.valueOf(df6Var.f372401y)) && n51.f.a(this.f372402z, df6Var.f372402z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372402z;
        java.util.LinkedList linkedList2 = this.f372400x;
        java.util.LinkedList linkedList3 = this.f372398v;
        java.util.LinkedList linkedList4 = this.f372392p;
        java.util.LinkedList linkedList5 = this.f372390n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f372383d);
            java.lang.String str = this.f372384e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372385f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f372386g);
            fVar.e(5, this.f372387h);
            r45.cu5 cu5Var = this.f372388i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f372388i.writeFields(fVar);
            }
            fVar.e(7, this.f372389m);
            fVar.g(8, 8, linkedList5);
            fVar.e(9, this.f372391o);
            fVar.g(10, 8, linkedList4);
            fVar.e(11, this.f372393q);
            fVar.e(12, this.f372394r);
            fVar.e(13, this.f372395s);
            fVar.e(14, this.f372396t);
            fVar.e(15, this.f372397u);
            fVar.g(16, 8, linkedList3);
            fVar.e(17, this.f372399w);
            fVar.g(18, 8, linkedList2);
            fVar.e(19, this.f372401y);
            fVar.g(20, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f372383d) + 0;
            java.lang.String str3 = this.f372384e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f372385f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int e17 = h17 + b36.f.e(4, this.f372386g) + b36.f.e(5, this.f372387h);
            r45.cu5 cu5Var2 = this.f372388i;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(7, this.f372389m) + b36.f.g(8, 8, linkedList5) + b36.f.e(9, this.f372391o) + b36.f.g(10, 8, linkedList4) + b36.f.e(11, this.f372393q) + b36.f.e(12, this.f372394r) + b36.f.e(13, this.f372395s) + b36.f.e(14, this.f372396t) + b36.f.e(15, this.f372397u) + b36.f.g(16, 8, linkedList3) + b36.f.e(17, this.f372399w) + b36.f.g(18, 8, linkedList2) + b36.f.e(19, this.f372401y) + b36.f.g(20, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        r45.df6 df6Var = (r45.df6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                df6Var.f372383d = aVar2.i(intValue);
                return 0;
            case 2:
                df6Var.f372384e = aVar2.k(intValue);
                return 0;
            case 3:
                df6Var.f372385f = aVar2.k(intValue);
                return 0;
            case 4:
                df6Var.f372386g = aVar2.g(intValue);
                return 0;
            case 5:
                df6Var.f372387h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    df6Var.f372388i = cu5Var3;
                }
                return 0;
            case 7:
                df6Var.f372389m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ke6 ke6Var = new r45.ke6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ke6Var.parseFrom(bArr3);
                    }
                    df6Var.f372390n.add(ke6Var);
                }
                return 0;
            case 9:
                df6Var.f372391o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.ke6 ke6Var2 = new r45.ke6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ke6Var2.parseFrom(bArr4);
                    }
                    df6Var.f372392p.add(ke6Var2);
                }
                return 0;
            case 11:
                df6Var.f372393q = aVar2.g(intValue);
                return 0;
            case 12:
                df6Var.f372394r = aVar2.g(intValue);
                return 0;
            case 13:
                df6Var.f372395s = aVar2.g(intValue);
                return 0;
            case 14:
                df6Var.f372396t = aVar2.g(intValue);
                return 0;
            case 15:
                df6Var.f372397u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var.b(bArr5);
                    }
                    df6Var.f372398v.add(du5Var);
                }
                return 0;
            case 17:
                df6Var.f372399w = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var2.b(bArr6);
                    }
                    df6Var.f372400x.add(du5Var2);
                }
                return 0;
            case 19:
                df6Var.f372401y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.ke6 ke6Var3 = new r45.ke6();
                    if (bArr7 != null && bArr7.length > 0) {
                        ke6Var3.parseFrom(bArr7);
                    }
                    df6Var.f372402z.add(ke6Var3);
                }
                return 0;
            default:
                return -1;
        }
    }
}
