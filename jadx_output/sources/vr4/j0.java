package vr4;

/* loaded from: classes9.dex */
public class j0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f439753d;

    /* renamed from: e, reason: collision with root package name */
    public double f439754e;

    /* renamed from: f, reason: collision with root package name */
    public double f439755f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439756g;

    /* renamed from: i, reason: collision with root package name */
    public vr4.k0 f439758i;

    /* renamed from: m, reason: collision with root package name */
    public int f439759m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f439760n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f439761o;

    /* renamed from: p, reason: collision with root package name */
    public double f439762p;

    /* renamed from: q, reason: collision with root package name */
    public double f439763q;

    /* renamed from: r, reason: collision with root package name */
    public int f439764r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f439765s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f439766t;

    /* renamed from: u, reason: collision with root package name */
    public vr4.a f439767u;

    /* renamed from: w, reason: collision with root package name */
    public vr4.b f439769w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f439757h = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f439768v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.j0)) {
            return false;
        }
        vr4.j0 j0Var = (vr4.j0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f439753d), java.lang.Double.valueOf(j0Var.f439753d)) && n51.f.a(java.lang.Double.valueOf(this.f439754e), java.lang.Double.valueOf(j0Var.f439754e)) && n51.f.a(java.lang.Double.valueOf(this.f439755f), java.lang.Double.valueOf(j0Var.f439755f)) && n51.f.a(this.f439756g, j0Var.f439756g) && n51.f.a(this.f439757h, j0Var.f439757h) && n51.f.a(this.f439758i, j0Var.f439758i) && n51.f.a(java.lang.Integer.valueOf(this.f439759m), java.lang.Integer.valueOf(j0Var.f439759m)) && n51.f.a(this.f439760n, j0Var.f439760n) && n51.f.a(this.f439761o, j0Var.f439761o) && n51.f.a(java.lang.Double.valueOf(this.f439762p), java.lang.Double.valueOf(j0Var.f439762p)) && n51.f.a(java.lang.Double.valueOf(this.f439763q), java.lang.Double.valueOf(j0Var.f439763q)) && n51.f.a(java.lang.Integer.valueOf(this.f439764r), java.lang.Integer.valueOf(j0Var.f439764r)) && n51.f.a(this.f439765s, j0Var.f439765s) && n51.f.a(this.f439766t, j0Var.f439766t) && n51.f.a(this.f439767u, j0Var.f439767u) && n51.f.a(this.f439768v, j0Var.f439768v) && n51.f.a(this.f439769w, j0Var.f439769w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f439768v;
        java.util.LinkedList linkedList2 = this.f439757h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f439753d);
            fVar.c(2, this.f439754e);
            fVar.c(3, this.f439755f);
            java.lang.String str = this.f439756g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, linkedList2);
            vr4.k0 k0Var = this.f439758i;
            if (k0Var != null) {
                fVar.i(6, k0Var.computeSize());
                this.f439758i.writeFields(fVar);
            }
            fVar.e(7, this.f439759m);
            java.lang.String str2 = this.f439760n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f439761o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.c(10, this.f439762p);
            fVar.c(11, this.f439763q);
            fVar.e(12, this.f439764r);
            java.lang.String str4 = this.f439765s;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            java.lang.String str5 = this.f439766t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            vr4.a aVar = this.f439767u;
            if (aVar != null) {
                fVar.i(15, aVar.computeSize());
                this.f439767u.writeFields(fVar);
            }
            fVar.g(16, 8, linkedList);
            vr4.b bVar = this.f439769w;
            if (bVar != null) {
                fVar.i(17, bVar.computeSize());
                this.f439769w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f439753d) + 0 + b36.f.c(2, this.f439754e) + b36.f.c(3, this.f439755f);
            java.lang.String str6 = this.f439756g;
            if (str6 != null) {
                c17 += b36.f.j(4, str6);
            }
            int g17 = c17 + b36.f.g(5, 8, linkedList2);
            vr4.k0 k0Var2 = this.f439758i;
            if (k0Var2 != null) {
                g17 += b36.f.i(6, k0Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(7, this.f439759m);
            java.lang.String str7 = this.f439760n;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f439761o;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            int c18 = e17 + b36.f.c(10, this.f439762p) + b36.f.c(11, this.f439763q) + b36.f.e(12, this.f439764r);
            java.lang.String str9 = this.f439765s;
            if (str9 != null) {
                c18 += b36.f.j(13, str9);
            }
            java.lang.String str10 = this.f439766t;
            if (str10 != null) {
                c18 += b36.f.j(14, str10);
            }
            vr4.a aVar2 = this.f439767u;
            if (aVar2 != null) {
                c18 += b36.f.i(15, aVar2.computeSize());
            }
            int g18 = c18 + b36.f.g(16, 8, linkedList);
            vr4.b bVar2 = this.f439769w;
            return bVar2 != null ? g18 + b36.f.i(17, bVar2.computeSize()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        vr4.j0 j0Var = (vr4.j0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j0Var.f439753d = aVar4.e(intValue);
                return 0;
            case 2:
                j0Var.f439754e = aVar4.e(intValue);
                return 0;
            case 3:
                j0Var.f439755f = aVar4.e(intValue);
                return 0;
            case 4:
                j0Var.f439756g = aVar4.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    vr4.i1 i1Var = new vr4.i1();
                    if (bArr2 != null && bArr2.length > 0) {
                        i1Var.parseFrom(bArr2);
                    }
                    j0Var.f439757h.add(i1Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    vr4.k0 k0Var3 = new vr4.k0();
                    if (bArr3 != null && bArr3.length > 0) {
                        k0Var3.parseFrom(bArr3);
                    }
                    j0Var.f439758i = k0Var3;
                }
                return 0;
            case 7:
                j0Var.f439759m = aVar4.g(intValue);
                return 0;
            case 8:
                j0Var.f439760n = aVar4.k(intValue);
                return 0;
            case 9:
                j0Var.f439761o = aVar4.k(intValue);
                return 0;
            case 10:
                j0Var.f439762p = aVar4.e(intValue);
                return 0;
            case 11:
                j0Var.f439763q = aVar4.e(intValue);
                return 0;
            case 12:
                j0Var.f439764r = aVar4.g(intValue);
                return 0;
            case 13:
                j0Var.f439765s = aVar4.k(intValue);
                return 0;
            case 14:
                j0Var.f439766t = aVar4.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    vr4.a aVar5 = new vr4.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.parseFrom(bArr4);
                    }
                    j0Var.f439767u = aVar5;
                }
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    vr4.i0 i0Var = new vr4.i0();
                    if (bArr5 != null && bArr5.length > 0) {
                        i0Var.parseFrom(bArr5);
                    }
                    j0Var.f439768v.add(i0Var);
                }
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    vr4.b bVar3 = new vr4.b();
                    if (bArr6 != null && bArr6.length > 0) {
                        bVar3.parseFrom(bArr6);
                    }
                    j0Var.f439769w = bVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
