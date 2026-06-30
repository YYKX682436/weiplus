package r45;

/* loaded from: classes9.dex */
public class ry4 extends r45.js5 {
    public r45.ce4 B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public int f385284d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385285e;

    /* renamed from: f, reason: collision with root package name */
    public int f385286f;

    /* renamed from: g, reason: collision with root package name */
    public int f385287g;

    /* renamed from: h, reason: collision with root package name */
    public int f385288h;

    /* renamed from: m, reason: collision with root package name */
    public r45.be4 f385290m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f385293p;

    /* renamed from: q, reason: collision with root package name */
    public r45.oa5 f385294q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f385295r;

    /* renamed from: s, reason: collision with root package name */
    public r45.bp0 f385296s;

    /* renamed from: t, reason: collision with root package name */
    public int f385297t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f385298u;

    /* renamed from: v, reason: collision with root package name */
    public r45.na5 f385299v;

    /* renamed from: w, reason: collision with root package name */
    public r45.na5 f385300w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f385301x;

    /* renamed from: y, reason: collision with root package name */
    public r45.c70 f385302y;

    /* renamed from: z, reason: collision with root package name */
    public r45.na5 f385303z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385289i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f385291n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f385292o = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ry4)) {
            return false;
        }
        r45.ry4 ry4Var = (r45.ry4) fVar;
        return n51.f.a(this.BaseResponse, ry4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385284d), java.lang.Integer.valueOf(ry4Var.f385284d)) && n51.f.a(this.f385285e, ry4Var.f385285e) && n51.f.a(java.lang.Integer.valueOf(this.f385286f), java.lang.Integer.valueOf(ry4Var.f385286f)) && n51.f.a(java.lang.Integer.valueOf(this.f385287g), java.lang.Integer.valueOf(ry4Var.f385287g)) && n51.f.a(java.lang.Integer.valueOf(this.f385288h), java.lang.Integer.valueOf(ry4Var.f385288h)) && n51.f.a(this.f385289i, ry4Var.f385289i) && n51.f.a(this.f385290m, ry4Var.f385290m) && n51.f.a(this.f385291n, ry4Var.f385291n) && n51.f.a(this.f385292o, ry4Var.f385292o) && n51.f.a(java.lang.Boolean.valueOf(this.f385293p), java.lang.Boolean.valueOf(ry4Var.f385293p)) && n51.f.a(this.f385294q, ry4Var.f385294q) && n51.f.a(this.f385295r, ry4Var.f385295r) && n51.f.a(this.f385296s, ry4Var.f385296s) && n51.f.a(java.lang.Integer.valueOf(this.f385297t), java.lang.Integer.valueOf(ry4Var.f385297t)) && n51.f.a(this.f385298u, ry4Var.f385298u) && n51.f.a(this.f385299v, ry4Var.f385299v) && n51.f.a(this.f385300w, ry4Var.f385300w) && n51.f.a(this.f385301x, ry4Var.f385301x) && n51.f.a(this.f385302y, ry4Var.f385302y) && n51.f.a(this.f385303z, ry4Var.f385303z) && n51.f.a(this.A, ry4Var.A) && n51.f.a(this.B, ry4Var.B) && n51.f.a(this.C, ry4Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.A;
        java.util.LinkedList linkedList2 = this.f385292o;
        java.util.LinkedList linkedList3 = this.f385291n;
        java.util.LinkedList linkedList4 = this.f385289i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385284d);
            java.lang.String str = this.f385285e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f385286f);
            fVar.e(5, this.f385287g);
            fVar.e(6, this.f385288h);
            fVar.g(8, 8, linkedList4);
            r45.be4 be4Var = this.f385290m;
            if (be4Var != null) {
                fVar.i(9, be4Var.computeSize());
                this.f385290m.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList3);
            fVar.g(11, 8, linkedList2);
            fVar.a(12, this.f385293p);
            r45.oa5 oa5Var = this.f385294q;
            if (oa5Var != null) {
                fVar.i(13, oa5Var.computeSize());
                this.f385294q.writeFields(fVar);
            }
            java.lang.String str2 = this.f385295r;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            r45.bp0 bp0Var = this.f385296s;
            if (bp0Var != null) {
                fVar.i(15, bp0Var.computeSize());
                this.f385296s.writeFields(fVar);
            }
            fVar.e(16, this.f385297t);
            java.lang.String str3 = this.f385298u;
            if (str3 != null) {
                fVar.j(17, str3);
            }
            r45.na5 na5Var = this.f385299v;
            if (na5Var != null) {
                fVar.i(18, na5Var.computeSize());
                this.f385299v.writeFields(fVar);
            }
            r45.na5 na5Var2 = this.f385300w;
            if (na5Var2 != null) {
                fVar.i(19, na5Var2.computeSize());
                this.f385300w.writeFields(fVar);
            }
            java.lang.String str4 = this.f385301x;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            r45.c70 c70Var = this.f385302y;
            if (c70Var != null) {
                fVar.i(21, c70Var.computeSize());
                this.f385302y.writeFields(fVar);
            }
            r45.na5 na5Var3 = this.f385303z;
            if (na5Var3 != null) {
                fVar.i(22, na5Var3.computeSize());
                this.f385303z.writeFields(fVar);
            }
            fVar.g(23, 8, linkedList);
            r45.ce4 ce4Var = this.B;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str5 = this.C;
            if (str5 != null) {
                fVar.j(100, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f385284d);
            java.lang.String str6 = this.f385285e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f385286f) + b36.f.e(5, this.f385287g) + b36.f.e(6, this.f385288h) + b36.f.g(8, 8, linkedList4);
            r45.be4 be4Var2 = this.f385290m;
            if (be4Var2 != null) {
                e17 += b36.f.i(9, be4Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList3) + b36.f.g(11, 8, linkedList2) + b36.f.a(12, this.f385293p);
            r45.oa5 oa5Var2 = this.f385294q;
            if (oa5Var2 != null) {
                g17 += b36.f.i(13, oa5Var2.computeSize());
            }
            java.lang.String str7 = this.f385295r;
            if (str7 != null) {
                g17 += b36.f.j(14, str7);
            }
            r45.bp0 bp0Var2 = this.f385296s;
            if (bp0Var2 != null) {
                g17 += b36.f.i(15, bp0Var2.computeSize());
            }
            int e18 = g17 + b36.f.e(16, this.f385297t);
            java.lang.String str8 = this.f385298u;
            if (str8 != null) {
                e18 += b36.f.j(17, str8);
            }
            r45.na5 na5Var4 = this.f385299v;
            if (na5Var4 != null) {
                e18 += b36.f.i(18, na5Var4.computeSize());
            }
            r45.na5 na5Var5 = this.f385300w;
            if (na5Var5 != null) {
                e18 += b36.f.i(19, na5Var5.computeSize());
            }
            java.lang.String str9 = this.f385301x;
            if (str9 != null) {
                e18 += b36.f.j(20, str9);
            }
            r45.c70 c70Var2 = this.f385302y;
            if (c70Var2 != null) {
                e18 += b36.f.i(21, c70Var2.computeSize());
            }
            r45.na5 na5Var6 = this.f385303z;
            if (na5Var6 != null) {
                e18 += b36.f.i(22, na5Var6.computeSize());
            }
            int g18 = e18 + b36.f.g(23, 8, linkedList);
            r45.ce4 ce4Var2 = this.B;
            if (ce4Var2 != null) {
                g18 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str10 = this.C;
            return str10 != null ? g18 + b36.f.j(100, str10) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.ry4 ry4Var = (r45.ry4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ce4 ce4Var3 = new r45.ce4();
                if (bArr2 != null && bArr2.length > 0) {
                    ce4Var3.parseFrom(bArr2);
                }
                ry4Var.B = ce4Var3;
            }
            return 0;
        }
        if (intValue == 100) {
            ry4Var.C = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr3 != null && bArr3.length > 0) {
                        ieVar3.parseFrom(bArr3);
                    }
                    ry4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ry4Var.f385284d = aVar2.g(intValue);
                return 0;
            case 3:
                ry4Var.f385285e = aVar2.k(intValue);
                return 0;
            case 4:
                ry4Var.f385286f = aVar2.g(intValue);
                return 0;
            case 5:
                ry4Var.f385287g = aVar2.g(intValue);
                return 0;
            case 6:
                ry4Var.f385288h = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 8:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr4 = (byte[]) j19.get(i28);
                            r45.if0 if0Var = new r45.if0();
                            if (bArr4 != null && bArr4.length > 0) {
                                if0Var.parseFrom(bArr4);
                            }
                            ry4Var.f385289i.add(if0Var);
                        }
                        return 0;
                    case 9:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.be4 be4Var3 = new r45.be4();
                            if (bArr5 != null && bArr5.length > 0) {
                                be4Var3.parseFrom(bArr5);
                            }
                            ry4Var.f385290m = be4Var3;
                        }
                        return 0;
                    case 10:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.bn5 bn5Var = new r45.bn5();
                            if (bArr6 != null && bArr6.length > 0) {
                                bn5Var.parseFrom(bArr6);
                            }
                            ry4Var.f385291n.add(bn5Var);
                        }
                        return 0;
                    case 11:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size6 = j29.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            byte[] bArr7 = (byte[]) j29.get(i38);
                            r45.pd pdVar = new r45.pd();
                            if (bArr7 != null && bArr7.length > 0) {
                                pdVar.parseFrom(bArr7);
                            }
                            ry4Var.f385292o.add(pdVar);
                        }
                        return 0;
                    case 12:
                        ry4Var.f385293p = aVar2.c(intValue);
                        return 0;
                    case 13:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.oa5 oa5Var3 = new r45.oa5();
                            if (bArr8 != null && bArr8.length > 0) {
                                oa5Var3.parseFrom(bArr8);
                            }
                            ry4Var.f385294q = oa5Var3;
                        }
                        return 0;
                    case 14:
                        ry4Var.f385295r = aVar2.k(intValue);
                        return 0;
                    case 15:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.bp0 bp0Var3 = new r45.bp0();
                            if (bArr9 != null && bArr9.length > 0) {
                                bp0Var3.parseFrom(bArr9);
                            }
                            ry4Var.f385296s = bp0Var3;
                        }
                        return 0;
                    case 16:
                        ry4Var.f385297t = aVar2.g(intValue);
                        return 0;
                    case 17:
                        ry4Var.f385298u = aVar2.k(intValue);
                        return 0;
                    case 18:
                        java.util.LinkedList j39 = aVar2.j(intValue);
                        int size9 = j39.size();
                        for (int i48 = 0; i48 < size9; i48++) {
                            byte[] bArr10 = (byte[]) j39.get(i48);
                            r45.na5 na5Var7 = new r45.na5();
                            if (bArr10 != null && bArr10.length > 0) {
                                na5Var7.parseFrom(bArr10);
                            }
                            ry4Var.f385299v = na5Var7;
                        }
                        return 0;
                    case 19:
                        java.util.LinkedList j47 = aVar2.j(intValue);
                        int size10 = j47.size();
                        for (int i49 = 0; i49 < size10; i49++) {
                            byte[] bArr11 = (byte[]) j47.get(i49);
                            r45.na5 na5Var8 = new r45.na5();
                            if (bArr11 != null && bArr11.length > 0) {
                                na5Var8.parseFrom(bArr11);
                            }
                            ry4Var.f385300w = na5Var8;
                        }
                        return 0;
                    case 20:
                        ry4Var.f385301x = aVar2.k(intValue);
                        return 0;
                    case 21:
                        java.util.LinkedList j48 = aVar2.j(intValue);
                        int size11 = j48.size();
                        for (int i57 = 0; i57 < size11; i57++) {
                            byte[] bArr12 = (byte[]) j48.get(i57);
                            r45.c70 c70Var3 = new r45.c70();
                            if (bArr12 != null && bArr12.length > 0) {
                                c70Var3.parseFrom(bArr12);
                            }
                            ry4Var.f385302y = c70Var3;
                        }
                        return 0;
                    case 22:
                        java.util.LinkedList j49 = aVar2.j(intValue);
                        int size12 = j49.size();
                        for (int i58 = 0; i58 < size12; i58++) {
                            byte[] bArr13 = (byte[]) j49.get(i58);
                            r45.na5 na5Var9 = new r45.na5();
                            if (bArr13 != null && bArr13.length > 0) {
                                na5Var9.parseFrom(bArr13);
                            }
                            ry4Var.f385303z = na5Var9;
                        }
                        return 0;
                    case 23:
                        java.util.LinkedList j57 = aVar2.j(intValue);
                        int size13 = j57.size();
                        for (int i59 = 0; i59 < size13; i59++) {
                            byte[] bArr14 = (byte[]) j57.get(i59);
                            r45.c70 c70Var4 = new r45.c70();
                            if (bArr14 != null && bArr14.length > 0) {
                                c70Var4.parseFrom(bArr14);
                            }
                            ry4Var.A.add(c70Var4);
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
