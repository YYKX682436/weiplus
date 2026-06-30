package r45;

/* loaded from: classes9.dex */
public class xj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f390166d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390167e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390168f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.bz3 f390169g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bm5 f390170h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390171i;

    /* renamed from: m, reason: collision with root package name */
    public r45.t35 f390172m;

    /* renamed from: n, reason: collision with root package name */
    public r45.yt5 f390173n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xt5 f390174o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xj6)) {
            return false;
        }
        r45.xj6 xj6Var = (r45.xj6) fVar;
        return n51.f.a(this.f390166d, xj6Var.f390166d) && n51.f.a(this.f390167e, xj6Var.f390167e) && n51.f.a(this.f390168f, xj6Var.f390168f) && n51.f.a(this.f390169g, xj6Var.f390169g) && n51.f.a(this.f390170h, xj6Var.f390170h) && n51.f.a(this.f390171i, xj6Var.f390171i) && n51.f.a(this.f390172m, xj6Var.f390172m) && n51.f.a(this.f390173n, xj6Var.f390173n) && n51.f.a(this.f390174o, xj6Var.f390174o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390168f;
        java.util.LinkedList linkedList2 = this.f390167e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f390166d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.computeSize());
                this.f390166d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            r45.bz3 bz3Var2 = this.f390169g;
            if (bz3Var2 != null) {
                fVar.i(4, bz3Var2.computeSize());
                this.f390169g.writeFields(fVar);
            }
            r45.bm5 bm5Var = this.f390170h;
            if (bm5Var != null) {
                fVar.i(5, bm5Var.computeSize());
                this.f390170h.writeFields(fVar);
            }
            java.lang.String str = this.f390171i;
            if (str != null) {
                fVar.j(6, str);
            }
            r45.t35 t35Var = this.f390172m;
            if (t35Var != null) {
                fVar.i(7, t35Var.computeSize());
                this.f390172m.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f390173n;
            if (yt5Var != null) {
                fVar.i(8, yt5Var.computeSize());
                this.f390173n.writeFields(fVar);
            }
            r45.xt5 xt5Var = this.f390174o;
            if (xt5Var != null) {
                fVar.i(9, xt5Var.computeSize());
                this.f390174o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var3 = this.f390166d;
            int i18 = (bz3Var3 != null ? 0 + b36.f.i(1, bz3Var3.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            r45.bz3 bz3Var4 = this.f390169g;
            if (bz3Var4 != null) {
                i18 += b36.f.i(4, bz3Var4.computeSize());
            }
            r45.bm5 bm5Var2 = this.f390170h;
            if (bm5Var2 != null) {
                i18 += b36.f.i(5, bm5Var2.computeSize());
            }
            java.lang.String str2 = this.f390171i;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            r45.t35 t35Var2 = this.f390172m;
            if (t35Var2 != null) {
                i18 += b36.f.i(7, t35Var2.computeSize());
            }
            r45.yt5 yt5Var2 = this.f390173n;
            if (yt5Var2 != null) {
                i18 += b36.f.i(8, yt5Var2.computeSize());
            }
            r45.xt5 xt5Var2 = this.f390174o;
            return xt5Var2 != null ? i18 + b36.f.i(9, xt5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.xj6 xj6Var = (r45.xj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.bz3 bz3Var5 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var5.parseFrom(bArr2);
                    }
                    xj6Var.f390166d = bz3Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var.parseFrom(bArr3);
                    }
                    xj6Var.f390167e.add(rl6Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var2 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var2.parseFrom(bArr4);
                    }
                    xj6Var.f390168f.add(rl6Var2);
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bz3 bz3Var6 = new r45.bz3();
                    if (bArr5 != null && bArr5.length > 0) {
                        bz3Var6.parseFrom(bArr5);
                    }
                    xj6Var.f390169g = bz3Var6;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.bm5 bm5Var3 = new r45.bm5();
                    if (bArr6 != null && bArr6.length > 0) {
                        bm5Var3.parseFrom(bArr6);
                    }
                    xj6Var.f390170h = bm5Var3;
                }
                return 0;
            case 6:
                xj6Var.f390171i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.t35 t35Var3 = new r45.t35();
                    if (bArr7 != null && bArr7.length > 0) {
                        t35Var3.parseFrom(bArr7);
                    }
                    xj6Var.f390172m = t35Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr8 != null && bArr8.length > 0) {
                        yt5Var3.parseFrom(bArr8);
                    }
                    xj6Var.f390173n = yt5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.xt5 xt5Var3 = new r45.xt5();
                    if (bArr9 != null && bArr9.length > 0) {
                        xt5Var3.parseFrom(bArr9);
                    }
                    xj6Var.f390174o = xt5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
