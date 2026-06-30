package ks3;

/* loaded from: classes8.dex */
public class z0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f311793d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.x0 f311794e;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f311798i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f311799m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f311802p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311803q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f311795f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f311796g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f311797h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f311800n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f311801o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.z0)) {
            return false;
        }
        ks3.z0 z0Var = (ks3.z0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f311793d), java.lang.Integer.valueOf(z0Var.f311793d)) && n51.f.a(this.f311794e, z0Var.f311794e) && n51.f.a(this.f311795f, z0Var.f311795f) && n51.f.a(this.f311796g, z0Var.f311796g) && n51.f.a(this.f311797h, z0Var.f311797h) && n51.f.a(this.f311798i, z0Var.f311798i) && n51.f.a(this.f311799m, z0Var.f311799m) && n51.f.a(this.f311800n, z0Var.f311800n) && n51.f.a(this.f311801o, z0Var.f311801o) && n51.f.a(this.f311802p, z0Var.f311802p) && n51.f.a(java.lang.Boolean.valueOf(this.f311803q), java.lang.Boolean.valueOf(z0Var.f311803q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f311801o;
        java.util.LinkedList linkedList2 = this.f311800n;
        java.util.LinkedList linkedList3 = this.f311797h;
        java.util.LinkedList linkedList4 = this.f311796g;
        java.util.LinkedList linkedList5 = this.f311795f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f311793d);
            ks3.x0 x0Var = this.f311794e;
            if (x0Var != null) {
                fVar.i(2, x0Var.computeSize());
                this.f311794e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList5);
            fVar.g(4, 8, linkedList4);
            fVar.g(5, 8, linkedList3);
            java.lang.String str = this.f311798i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f311799m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 8, linkedList);
            java.lang.String str3 = this.f311802p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.a(11, this.f311803q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f311793d) + 0;
            ks3.x0 x0Var2 = this.f311794e;
            if (x0Var2 != null) {
                e17 += b36.f.i(2, x0Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList5) + b36.f.g(4, 8, linkedList4) + b36.f.g(5, 8, linkedList3);
            java.lang.String str4 = this.f311798i;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f311799m;
            if (str5 != null) {
                g17 += b36.f.j(7, str5);
            }
            int g18 = g17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 8, linkedList);
            java.lang.String str6 = this.f311802p;
            if (str6 != null) {
                g18 += b36.f.j(10, str6);
            }
            return g18 + b36.f.a(11, this.f311803q);
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
        ks3.z0 z0Var = (ks3.z0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z0Var.f311793d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.x0 x0Var3 = new ks3.x0();
                    if (bArr2 != null && bArr2.length > 0) {
                        x0Var3.parseFrom(bArr2);
                    }
                    z0Var.f311794e = x0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.x0 x0Var4 = new ks3.x0();
                    if (bArr3 != null && bArr3.length > 0) {
                        x0Var4.parseFrom(bArr3);
                    }
                    z0Var.f311795f.add(x0Var4);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.x0 x0Var5 = new ks3.x0();
                    if (bArr4 != null && bArr4.length > 0) {
                        x0Var5.parseFrom(bArr4);
                    }
                    z0Var.f311796g.add(x0Var5);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.x0 x0Var6 = new ks3.x0();
                    if (bArr5 != null && bArr5.length > 0) {
                        x0Var6.parseFrom(bArr5);
                    }
                    z0Var.f311797h.add(x0Var6);
                }
                return 0;
            case 6:
                z0Var.f311798i = aVar2.k(intValue);
                return 0;
            case 7:
                z0Var.f311799m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    ks3.w0 w0Var = new ks3.w0();
                    if (bArr6 != null && bArr6.length > 0) {
                        w0Var.parseFrom(bArr6);
                    }
                    z0Var.f311800n.add(w0Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    ks3.w0 w0Var2 = new ks3.w0();
                    if (bArr7 != null && bArr7.length > 0) {
                        w0Var2.parseFrom(bArr7);
                    }
                    z0Var.f311801o.add(w0Var2);
                }
                return 0;
            case 10:
                z0Var.f311802p = aVar2.k(intValue);
                return 0;
            case 11:
                z0Var.f311803q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
