package m53;

/* loaded from: classes8.dex */
public class r5 extends com.tencent.mm.protobuf.f {
    public m53.o5 A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324014d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324015e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324016f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324017g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324018h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f324019i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f324020m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f324021n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f324022o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f324023p;

    /* renamed from: q, reason: collision with root package name */
    public int f324024q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f324025r;

    /* renamed from: s, reason: collision with root package name */
    public m53.p5 f324026s;

    /* renamed from: t, reason: collision with root package name */
    public m53.q5 f324027t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f324028u;

    /* renamed from: v, reason: collision with root package name */
    public int f324029v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f324030w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f324031x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f324032y;

    /* renamed from: z, reason: collision with root package name */
    public int f324033z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r5)) {
            return false;
        }
        m53.r5 r5Var = (m53.r5) fVar;
        return n51.f.a(this.f324014d, r5Var.f324014d) && n51.f.a(this.f324015e, r5Var.f324015e) && n51.f.a(this.f324016f, r5Var.f324016f) && n51.f.a(this.f324017g, r5Var.f324017g) && n51.f.a(this.f324018h, r5Var.f324018h) && n51.f.a(this.f324019i, r5Var.f324019i) && n51.f.a(this.f324020m, r5Var.f324020m) && n51.f.a(this.f324021n, r5Var.f324021n) && n51.f.a(this.f324022o, r5Var.f324022o) && n51.f.a(this.f324023p, r5Var.f324023p) && n51.f.a(java.lang.Integer.valueOf(this.f324024q), java.lang.Integer.valueOf(r5Var.f324024q)) && n51.f.a(this.f324025r, r5Var.f324025r) && n51.f.a(this.f324026s, r5Var.f324026s) && n51.f.a(this.f324027t, r5Var.f324027t) && n51.f.a(java.lang.Boolean.valueOf(this.f324028u), java.lang.Boolean.valueOf(r5Var.f324028u)) && n51.f.a(java.lang.Integer.valueOf(this.f324029v), java.lang.Integer.valueOf(r5Var.f324029v)) && n51.f.a(java.lang.Boolean.valueOf(this.f324030w), java.lang.Boolean.valueOf(r5Var.f324030w)) && n51.f.a(this.f324031x, r5Var.f324031x) && n51.f.a(java.lang.Boolean.valueOf(this.f324032y), java.lang.Boolean.valueOf(r5Var.f324032y)) && n51.f.a(java.lang.Integer.valueOf(this.f324033z), java.lang.Integer.valueOf(r5Var.f324033z)) && n51.f.a(this.A, r5Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(r5Var.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324031x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324014d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324015e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324016f;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f324017g;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f324018h;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f324019i;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f324020m;
            if (str7 != null) {
                fVar.j(3, str7);
            }
            java.lang.String str8 = this.f324021n;
            if (str8 != null) {
                fVar.j(4, str8);
            }
            java.lang.String str9 = this.f324022o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f324023p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            fVar.e(5, this.f324024q);
            java.lang.String str11 = this.f324025r;
            if (str11 != null) {
                fVar.j(6, str11);
            }
            m53.p5 p5Var = this.f324026s;
            if (p5Var != null) {
                fVar.i(7, p5Var.computeSize());
                this.f324026s.writeFields(fVar);
            }
            m53.q5 q5Var = this.f324027t;
            if (q5Var != null) {
                fVar.i(8, q5Var.computeSize());
                this.f324027t.writeFields(fVar);
            }
            fVar.a(15, this.f324028u);
            fVar.e(16, this.f324029v);
            fVar.a(17, this.f324030w);
            fVar.g(18, 8, linkedList);
            fVar.a(19, this.f324032y);
            fVar.e(20, this.f324033z);
            m53.o5 o5Var = this.A;
            if (o5Var != null) {
                fVar.i(21, o5Var.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.a(22, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f324014d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f324015e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f324016f;
            if (str14 != null) {
                j17 += b36.f.j(11, str14);
            }
            java.lang.String str15 = this.f324017g;
            if (str15 != null) {
                j17 += b36.f.j(12, str15);
            }
            java.lang.String str16 = this.f324018h;
            if (str16 != null) {
                j17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f324019i;
            if (str17 != null) {
                j17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f324020m;
            if (str18 != null) {
                j17 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f324021n;
            if (str19 != null) {
                j17 += b36.f.j(4, str19);
            }
            java.lang.String str20 = this.f324022o;
            if (str20 != null) {
                j17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f324023p;
            if (str21 != null) {
                j17 += b36.f.j(10, str21);
            }
            int e17 = j17 + b36.f.e(5, this.f324024q);
            java.lang.String str22 = this.f324025r;
            if (str22 != null) {
                e17 += b36.f.j(6, str22);
            }
            m53.p5 p5Var2 = this.f324026s;
            if (p5Var2 != null) {
                e17 += b36.f.i(7, p5Var2.computeSize());
            }
            m53.q5 q5Var2 = this.f324027t;
            if (q5Var2 != null) {
                e17 += b36.f.i(8, q5Var2.computeSize());
            }
            int a17 = e17 + b36.f.a(15, this.f324028u) + b36.f.e(16, this.f324029v) + b36.f.a(17, this.f324030w) + b36.f.g(18, 8, linkedList) + b36.f.a(19, this.f324032y) + b36.f.e(20, this.f324033z);
            m53.o5 o5Var2 = this.A;
            if (o5Var2 != null) {
                a17 += b36.f.i(21, o5Var2.computeSize());
            }
            return a17 + b36.f.a(22, this.B);
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
        m53.r5 r5Var = (m53.r5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r5Var.f324014d = aVar2.k(intValue);
                return 0;
            case 2:
                r5Var.f324015e = aVar2.k(intValue);
                return 0;
            case 3:
                r5Var.f324020m = aVar2.k(intValue);
                return 0;
            case 4:
                r5Var.f324021n = aVar2.k(intValue);
                return 0;
            case 5:
                r5Var.f324024q = aVar2.g(intValue);
                return 0;
            case 6:
                r5Var.f324025r = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.p5 p5Var3 = new m53.p5();
                    if (bArr2 != null && bArr2.length > 0) {
                        p5Var3.parseFrom(bArr2);
                    }
                    r5Var.f324026s = p5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    m53.q5 q5Var3 = new m53.q5();
                    if (bArr3 != null && bArr3.length > 0) {
                        q5Var3.parseFrom(bArr3);
                    }
                    r5Var.f324027t = q5Var3;
                }
                return 0;
            case 9:
                r5Var.f324022o = aVar2.k(intValue);
                return 0;
            case 10:
                r5Var.f324023p = aVar2.k(intValue);
                return 0;
            case 11:
                r5Var.f324016f = aVar2.k(intValue);
                return 0;
            case 12:
                r5Var.f324017g = aVar2.k(intValue);
                return 0;
            case 13:
                r5Var.f324018h = aVar2.k(intValue);
                return 0;
            case 14:
                r5Var.f324019i = aVar2.k(intValue);
                return 0;
            case 15:
                r5Var.f324028u = aVar2.c(intValue);
                return 0;
            case 16:
                r5Var.f324029v = aVar2.g(intValue);
                return 0;
            case 17:
                r5Var.f324030w = aVar2.c(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    m53.m5 m5Var = new m53.m5();
                    if (bArr4 != null && bArr4.length > 0) {
                        m5Var.parseFrom(bArr4);
                    }
                    r5Var.f324031x.add(m5Var);
                }
                return 0;
            case 19:
                r5Var.f324032y = aVar2.c(intValue);
                return 0;
            case 20:
                r5Var.f324033z = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    m53.o5 o5Var3 = new m53.o5();
                    if (bArr5 != null && bArr5.length > 0) {
                        o5Var3.parseFrom(bArr5);
                    }
                    r5Var.A = o5Var3;
                }
                return 0;
            case 22:
                r5Var.B = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
