package ks3;

/* loaded from: classes4.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f311773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311774e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311775f;

    /* renamed from: g, reason: collision with root package name */
    public ks3.x0 f311776g;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f311780n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f311781o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f311782p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f311783q;

    /* renamed from: t, reason: collision with root package name */
    public ks3.h1 f311786t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f311777h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f311778i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f311779m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f311784r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f311785s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.y0)) {
            return false;
        }
        ks3.y0 y0Var = (ks3.y0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f311773d), java.lang.Integer.valueOf(y0Var.f311773d)) && n51.f.a(this.f311774e, y0Var.f311774e) && n51.f.a(this.f311775f, y0Var.f311775f) && n51.f.a(this.f311776g, y0Var.f311776g) && n51.f.a(this.f311777h, y0Var.f311777h) && n51.f.a(this.f311778i, y0Var.f311778i) && n51.f.a(this.f311779m, y0Var.f311779m) && n51.f.a(this.f311780n, y0Var.f311780n) && n51.f.a(this.f311781o, y0Var.f311781o) && n51.f.a(this.f311782p, y0Var.f311782p) && n51.f.a(this.f311783q, y0Var.f311783q) && n51.f.a(this.f311784r, y0Var.f311784r) && n51.f.a(this.f311785s, y0Var.f311785s) && n51.f.a(this.f311786t, y0Var.f311786t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f311785s;
        java.util.LinkedList linkedList2 = this.f311784r;
        java.util.LinkedList linkedList3 = this.f311779m;
        java.util.LinkedList linkedList4 = this.f311778i;
        java.util.LinkedList linkedList5 = this.f311777h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f311773d);
            java.lang.String str = this.f311774e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f311775f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            ks3.x0 x0Var = this.f311776g;
            if (x0Var != null) {
                fVar.i(4, x0Var.computeSize());
                this.f311776g.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList5);
            fVar.g(6, 8, linkedList4);
            fVar.g(7, 8, linkedList3);
            java.lang.String str3 = this.f311780n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f311781o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f311782p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f311783q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            ks3.h1 h1Var = this.f311786t;
            if (h1Var != null) {
                fVar.i(14, h1Var.computeSize());
                this.f311786t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f311773d) + 0;
            java.lang.String str7 = this.f311774e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f311775f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            ks3.x0 x0Var2 = this.f311776g;
            if (x0Var2 != null) {
                e17 += b36.f.i(4, x0Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(5, 8, linkedList5) + b36.f.g(6, 8, linkedList4) + b36.f.g(7, 8, linkedList3);
            java.lang.String str9 = this.f311780n;
            if (str9 != null) {
                g17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f311781o;
            if (str10 != null) {
                g17 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f311782p;
            if (str11 != null) {
                g17 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f311783q;
            if (str12 != null) {
                g17 += b36.f.j(11, str12);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            ks3.h1 h1Var2 = this.f311786t;
            return h1Var2 != null ? g18 + b36.f.i(14, h1Var2.computeSize()) : g18;
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
        ks3.y0 y0Var = (ks3.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y0Var.f311773d = aVar2.g(intValue);
                return 0;
            case 2:
                y0Var.f311774e = aVar2.k(intValue);
                return 0;
            case 3:
                y0Var.f311775f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.x0 x0Var3 = new ks3.x0();
                    if (bArr2 != null && bArr2.length > 0) {
                        x0Var3.parseFrom(bArr2);
                    }
                    y0Var.f311776g = x0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.x0 x0Var4 = new ks3.x0();
                    if (bArr3 != null && bArr3.length > 0) {
                        x0Var4.parseFrom(bArr3);
                    }
                    y0Var.f311777h.add(x0Var4);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.x0 x0Var5 = new ks3.x0();
                    if (bArr4 != null && bArr4.length > 0) {
                        x0Var5.parseFrom(bArr4);
                    }
                    y0Var.f311778i.add(x0Var5);
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.x0 x0Var6 = new ks3.x0();
                    if (bArr5 != null && bArr5.length > 0) {
                        x0Var6.parseFrom(bArr5);
                    }
                    y0Var.f311779m.add(x0Var6);
                }
                return 0;
            case 8:
                y0Var.f311780n = aVar2.k(intValue);
                return 0;
            case 9:
                y0Var.f311781o = aVar2.k(intValue);
                return 0;
            case 10:
                y0Var.f311782p = aVar2.k(intValue);
                return 0;
            case 11:
                y0Var.f311783q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    ks3.w0 w0Var = new ks3.w0();
                    if (bArr6 != null && bArr6.length > 0) {
                        w0Var.parseFrom(bArr6);
                    }
                    y0Var.f311784r.add(w0Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    ks3.w0 w0Var2 = new ks3.w0();
                    if (bArr7 != null && bArr7.length > 0) {
                        w0Var2.parseFrom(bArr7);
                    }
                    y0Var.f311785s.add(w0Var2);
                }
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    ks3.h1 h1Var3 = new ks3.h1();
                    if (bArr8 != null && bArr8.length > 0) {
                        h1Var3.parseFrom(bArr8);
                    }
                    y0Var.f311786t = h1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
