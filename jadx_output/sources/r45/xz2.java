package r45;

/* loaded from: classes2.dex */
public class xz2 extends r45.mr5 {
    public r45.o72 A;
    public java.lang.String B;
    public java.lang.String C;
    public com.tencent.mm.protobuf.g D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f390610d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390611e;

    /* renamed from: f, reason: collision with root package name */
    public float f390612f;

    /* renamed from: g, reason: collision with root package name */
    public float f390613g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dx0 f390614h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rn1 f390615i;

    /* renamed from: m, reason: collision with root package name */
    public int f390616m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fy2 f390617n;

    /* renamed from: q, reason: collision with root package name */
    public int f390620q;

    /* renamed from: r, reason: collision with root package name */
    public r45.kd1 f390621r;

    /* renamed from: s, reason: collision with root package name */
    public int f390622s;

    /* renamed from: t, reason: collision with root package name */
    public r45.yq2 f390623t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f390624u;

    /* renamed from: v, reason: collision with root package name */
    public r45.om1 f390625v;

    /* renamed from: w, reason: collision with root package name */
    public int f390626w;

    /* renamed from: x, reason: collision with root package name */
    public long f390627x;

    /* renamed from: z, reason: collision with root package name */
    public r45.dd2 f390629z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f390618o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f390619p = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f390628y = new java.util.LinkedList();

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10200;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderthemelivestream";
        lVar.f70664a = this;
        lVar.f70665b = new r45.yz2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz2)) {
            return false;
        }
        r45.xz2 xz2Var = (r45.xz2) fVar;
        return n51.f.a(this.BaseRequest, xz2Var.BaseRequest) && n51.f.a(this.f390610d, xz2Var.f390610d) && n51.f.a(this.f390611e, xz2Var.f390611e) && n51.f.a(java.lang.Float.valueOf(this.f390612f), java.lang.Float.valueOf(xz2Var.f390612f)) && n51.f.a(java.lang.Float.valueOf(this.f390613g), java.lang.Float.valueOf(xz2Var.f390613g)) && n51.f.a(this.f390614h, xz2Var.f390614h) && n51.f.a(this.f390615i, xz2Var.f390615i) && n51.f.a(java.lang.Integer.valueOf(this.f390616m), java.lang.Integer.valueOf(xz2Var.f390616m)) && n51.f.a(this.f390617n, xz2Var.f390617n) && n51.f.a(this.f390618o, xz2Var.f390618o) && n51.f.a(this.f390619p, xz2Var.f390619p) && n51.f.a(java.lang.Integer.valueOf(this.f390620q), java.lang.Integer.valueOf(xz2Var.f390620q)) && n51.f.a(this.f390621r, xz2Var.f390621r) && n51.f.a(java.lang.Integer.valueOf(this.f390622s), java.lang.Integer.valueOf(xz2Var.f390622s)) && n51.f.a(this.f390623t, xz2Var.f390623t) && n51.f.a(this.f390624u, xz2Var.f390624u) && n51.f.a(this.f390625v, xz2Var.f390625v) && n51.f.a(java.lang.Integer.valueOf(this.f390626w), java.lang.Integer.valueOf(xz2Var.f390626w)) && n51.f.a(java.lang.Long.valueOf(this.f390627x), java.lang.Long.valueOf(xz2Var.f390627x)) && n51.f.a(this.f390628y, xz2Var.f390628y) && n51.f.a(this.f390629z, xz2Var.f390629z) && n51.f.a(this.A, xz2Var.A) && n51.f.a(this.B, xz2Var.B) && n51.f.a(this.C, xz2Var.C) && n51.f.a(this.D, xz2Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(xz2Var.E));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390619p;
        java.util.LinkedList linkedList2 = this.f390618o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f390610d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f390610d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f390611e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.d(4, this.f390612f);
            fVar.d(5, this.f390613g);
            r45.dx0 dx0Var = this.f390614h;
            if (dx0Var != null) {
                fVar.i(6, dx0Var.computeSize());
                this.f390614h.writeFields(fVar);
            }
            r45.rn1 rn1Var = this.f390615i;
            if (rn1Var != null) {
                fVar.i(7, rn1Var.computeSize());
                this.f390615i.writeFields(fVar);
            }
            fVar.e(8, this.f390616m);
            r45.fy2 fy2Var = this.f390617n;
            if (fy2Var != null) {
                fVar.i(9, fy2Var.computeSize());
                this.f390617n.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f390620q);
            r45.kd1 kd1Var = this.f390621r;
            if (kd1Var != null) {
                fVar.i(13, kd1Var.computeSize());
                this.f390621r.writeFields(fVar);
            }
            fVar.e(14, this.f390622s);
            r45.yq2 yq2Var = this.f390623t;
            if (yq2Var != null) {
                fVar.i(15, yq2Var.computeSize());
                this.f390623t.writeFields(fVar);
            }
            java.lang.String str = this.f390624u;
            if (str != null) {
                fVar.j(16, str);
            }
            r45.om1 om1Var = this.f390625v;
            if (om1Var != null) {
                fVar.i(17, om1Var.computeSize());
                this.f390625v.writeFields(fVar);
            }
            fVar.e(18, this.f390626w);
            fVar.h(19, this.f390627x);
            fVar.g(20, 8, this.f390628y);
            r45.dd2 dd2Var = this.f390629z;
            if (dd2Var != null) {
                fVar.i(21, dd2Var.computeSize());
                this.f390629z.writeFields(fVar);
            }
            r45.o72 o72Var = this.A;
            if (o72Var != null) {
                fVar.i(22, o72Var.computeSize());
                this.A.writeFields(fVar);
            }
            java.lang.String str2 = this.B;
            if (str2 != null) {
                fVar.j(23, str2);
            }
            java.lang.String str3 = this.C;
            if (str3 != null) {
                fVar.j(24, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.D;
            if (gVar2 != null) {
                fVar.b(25, gVar2);
            }
            fVar.e(26, this.E);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f390610d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f390611e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int d17 = i18 + b36.f.d(4, this.f390612f) + b36.f.d(5, this.f390613g);
            r45.dx0 dx0Var2 = this.f390614h;
            if (dx0Var2 != null) {
                d17 += b36.f.i(6, dx0Var2.computeSize());
            }
            r45.rn1 rn1Var2 = this.f390615i;
            if (rn1Var2 != null) {
                d17 += b36.f.i(7, rn1Var2.computeSize());
            }
            int e17 = d17 + b36.f.e(8, this.f390616m);
            r45.fy2 fy2Var2 = this.f390617n;
            if (fy2Var2 != null) {
                e17 += b36.f.i(9, fy2Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f390620q);
            r45.kd1 kd1Var2 = this.f390621r;
            if (kd1Var2 != null) {
                g17 += b36.f.i(13, kd1Var2.computeSize());
            }
            int e18 = g17 + b36.f.e(14, this.f390622s);
            r45.yq2 yq2Var2 = this.f390623t;
            if (yq2Var2 != null) {
                e18 += b36.f.i(15, yq2Var2.computeSize());
            }
            java.lang.String str4 = this.f390624u;
            if (str4 != null) {
                e18 += b36.f.j(16, str4);
            }
            r45.om1 om1Var2 = this.f390625v;
            if (om1Var2 != null) {
                e18 += b36.f.i(17, om1Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(18, this.f390626w) + b36.f.h(19, this.f390627x) + b36.f.g(20, 8, this.f390628y);
            r45.dd2 dd2Var2 = this.f390629z;
            if (dd2Var2 != null) {
                e19 += b36.f.i(21, dd2Var2.computeSize());
            }
            r45.o72 o72Var2 = this.A;
            if (o72Var2 != null) {
                e19 += b36.f.i(22, o72Var2.computeSize());
            }
            java.lang.String str5 = this.B;
            if (str5 != null) {
                e19 += b36.f.j(23, str5);
            }
            java.lang.String str6 = this.C;
            if (str6 != null) {
                e19 += b36.f.j(24, str6);
            }
            com.tencent.mm.protobuf.g gVar4 = this.D;
            if (gVar4 != null) {
                e19 += b36.f.b(25, gVar4);
            }
            return e19 + b36.f.e(26, this.E);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            this.f390628y.clear();
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
        r45.xz2 xz2Var = (r45.xz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    xz2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.parseFrom(bArr3);
                    }
                    xz2Var.f390610d = kv0Var3;
                }
                return 0;
            case 3:
                xz2Var.f390611e = aVar2.d(intValue);
                return 0;
            case 4:
                xz2Var.f390612f = aVar2.f(intValue);
                return 0;
            case 5:
                xz2Var.f390613g = aVar2.f(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr4 != null && bArr4.length > 0) {
                        dx0Var3.parseFrom(bArr4);
                    }
                    xz2Var.f390614h = dx0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.rn1 rn1Var3 = new r45.rn1();
                    if (bArr5 != null && bArr5.length > 0) {
                        rn1Var3.parseFrom(bArr5);
                    }
                    xz2Var.f390615i = rn1Var3;
                }
                return 0;
            case 8:
                xz2Var.f390616m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.fy2 fy2Var3 = new r45.fy2();
                    if (bArr6 != null && bArr6.length > 0) {
                        fy2Var3.parseFrom(bArr6);
                    }
                    xz2Var.f390617n = fy2Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ni4 ni4Var = new r45.ni4();
                    if (bArr7 != null && bArr7.length > 0) {
                        ni4Var.parseFrom(bArr7);
                    }
                    xz2Var.f390618o.add(ni4Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.e13 e13Var = new r45.e13();
                    if (bArr8 != null && bArr8.length > 0) {
                        e13Var.parseFrom(bArr8);
                    }
                    xz2Var.f390619p.add(e13Var);
                }
                return 0;
            case 12:
                xz2Var.f390620q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.kd1 kd1Var3 = new r45.kd1();
                    if (bArr9 != null && bArr9.length > 0) {
                        kd1Var3.parseFrom(bArr9);
                    }
                    xz2Var.f390621r = kd1Var3;
                }
                return 0;
            case 14:
                xz2Var.f390622s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.yq2 yq2Var3 = new r45.yq2();
                    if (bArr10 != null && bArr10.length > 0) {
                        yq2Var3.parseFrom(bArr10);
                    }
                    xz2Var.f390623t = yq2Var3;
                }
                return 0;
            case 16:
                xz2Var.f390624u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.om1 om1Var3 = new r45.om1();
                    if (bArr11 != null && bArr11.length > 0) {
                        om1Var3.parseFrom(bArr11);
                    }
                    xz2Var.f390625v = om1Var3;
                }
                return 0;
            case 18:
                xz2Var.f390626w = aVar2.g(intValue);
                return 0;
            case 19:
                xz2Var.f390627x = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.u80 u80Var = new r45.u80();
                    if (bArr12 != null && bArr12.length > 0) {
                        u80Var.parseFrom(bArr12);
                    }
                    xz2Var.f390628y.add(u80Var);
                }
                return 0;
            case 21:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.dd2 dd2Var3 = new r45.dd2();
                    if (bArr13 != null && bArr13.length > 0) {
                        dd2Var3.parseFrom(bArr13);
                    }
                    xz2Var.f390629z = dd2Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.o72 o72Var3 = new r45.o72();
                    if (bArr14 != null && bArr14.length > 0) {
                        o72Var3.parseFrom(bArr14);
                    }
                    xz2Var.A = o72Var3;
                }
                return 0;
            case 23:
                xz2Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                xz2Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                xz2Var.D = aVar2.d(intValue);
                return 0;
            case 26:
                xz2Var.E = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
