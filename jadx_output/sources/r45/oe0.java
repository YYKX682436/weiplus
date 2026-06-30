package r45;

/* loaded from: classes2.dex */
public class oe0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f382183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382184e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bz3 f382185f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f382186g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f382187h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f382188i;

    /* renamed from: m, reason: collision with root package name */
    public int f382189m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gq f382190n;

    /* renamed from: o, reason: collision with root package name */
    public r45.gq f382191o;

    /* renamed from: p, reason: collision with root package name */
    public r45.rl6 f382192p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oe0)) {
            return false;
        }
        r45.oe0 oe0Var = (r45.oe0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f382183d), java.lang.Boolean.valueOf(oe0Var.f382183d)) && n51.f.a(this.f382184e, oe0Var.f382184e) && n51.f.a(this.f382185f, oe0Var.f382185f) && n51.f.a(this.f382186g, oe0Var.f382186g) && n51.f.a(this.f382187h, oe0Var.f382187h) && n51.f.a(java.lang.Boolean.valueOf(this.f382188i), java.lang.Boolean.valueOf(oe0Var.f382188i)) && n51.f.a(java.lang.Integer.valueOf(this.f382189m), java.lang.Integer.valueOf(oe0Var.f382189m)) && n51.f.a(this.f382190n, oe0Var.f382190n) && n51.f.a(this.f382191o, oe0Var.f382191o) && n51.f.a(this.f382192p, oe0Var.f382192p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382187h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f382183d);
            java.lang.String str = this.f382184e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.bz3 bz3Var = this.f382185f;
            if (bz3Var != null) {
                fVar.i(3, bz3Var.computeSize());
                this.f382185f.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f382186g;
            if (rl6Var != null) {
                fVar.i(4, rl6Var.computeSize());
                this.f382186g.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            fVar.a(6, this.f382188i);
            fVar.e(7, this.f382189m);
            r45.gq gqVar = this.f382190n;
            if (gqVar != null) {
                fVar.i(8, gqVar.computeSize());
                this.f382190n.writeFields(fVar);
            }
            r45.gq gqVar2 = this.f382191o;
            if (gqVar2 != null) {
                fVar.i(9, gqVar2.computeSize());
                this.f382191o.writeFields(fVar);
            }
            r45.rl6 rl6Var2 = this.f382192p;
            if (rl6Var2 != null) {
                fVar.i(10, rl6Var2.computeSize());
                this.f382192p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f382183d) + 0;
            java.lang.String str2 = this.f382184e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            r45.bz3 bz3Var2 = this.f382185f;
            if (bz3Var2 != null) {
                a17 += b36.f.i(3, bz3Var2.computeSize());
            }
            r45.rl6 rl6Var3 = this.f382186g;
            if (rl6Var3 != null) {
                a17 += b36.f.i(4, rl6Var3.computeSize());
            }
            int g17 = a17 + b36.f.g(5, 8, linkedList) + b36.f.a(6, this.f382188i) + b36.f.e(7, this.f382189m);
            r45.gq gqVar3 = this.f382190n;
            if (gqVar3 != null) {
                g17 += b36.f.i(8, gqVar3.computeSize());
            }
            r45.gq gqVar4 = this.f382191o;
            if (gqVar4 != null) {
                g17 += b36.f.i(9, gqVar4.computeSize());
            }
            r45.rl6 rl6Var4 = this.f382192p;
            return rl6Var4 != null ? g17 + b36.f.i(10, rl6Var4.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.oe0 oe0Var = (r45.oe0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oe0Var.f382183d = aVar2.c(intValue);
                return 0;
            case 2:
                oe0Var.f382184e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.parseFrom(bArr2);
                    }
                    oe0Var.f382185f = bz3Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var5.parseFrom(bArr3);
                    }
                    oe0Var.f382186g = rl6Var5;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.rl6 rl6Var6 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var6.parseFrom(bArr4);
                    }
                    oe0Var.f382187h.add(rl6Var6);
                }
                return 0;
            case 6:
                oe0Var.f382188i = aVar2.c(intValue);
                return 0;
            case 7:
                oe0Var.f382189m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.gq gqVar5 = new r45.gq();
                    if (bArr5 != null && bArr5.length > 0) {
                        gqVar5.parseFrom(bArr5);
                    }
                    oe0Var.f382190n = gqVar5;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.gq gqVar6 = new r45.gq();
                    if (bArr6 != null && bArr6.length > 0) {
                        gqVar6.parseFrom(bArr6);
                    }
                    oe0Var.f382191o = gqVar6;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.rl6 rl6Var7 = new r45.rl6();
                    if (bArr7 != null && bArr7.length > 0) {
                        rl6Var7.parseFrom(bArr7);
                    }
                    oe0Var.f382192p = rl6Var7;
                }
                return 0;
            default:
                return -1;
        }
    }
}
