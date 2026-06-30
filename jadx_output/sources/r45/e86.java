package r45;

/* loaded from: classes4.dex */
public class e86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373127e;

    /* renamed from: f, reason: collision with root package name */
    public int f373128f;

    /* renamed from: g, reason: collision with root package name */
    public int f373129g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373130h;

    /* renamed from: i, reason: collision with root package name */
    public int f373131i;

    /* renamed from: m, reason: collision with root package name */
    public int f373132m;

    /* renamed from: n, reason: collision with root package name */
    public int f373133n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373134o;

    /* renamed from: p, reason: collision with root package name */
    public int f373135p;

    /* renamed from: q, reason: collision with root package name */
    public long f373136q;

    /* renamed from: r, reason: collision with root package name */
    public long f373137r;

    /* renamed from: s, reason: collision with root package name */
    public int f373138s;

    /* renamed from: t, reason: collision with root package name */
    public int f373139t;

    /* renamed from: v, reason: collision with root package name */
    public int f373141v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f373142w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f373143x;

    /* renamed from: y, reason: collision with root package name */
    public int f373144y;

    /* renamed from: z, reason: collision with root package name */
    public int f373145z;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f373140u = new java.util.LinkedList();
    public java.util.LinkedList A = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e86)) {
            return false;
        }
        r45.e86 e86Var = (r45.e86) fVar;
        return n51.f.a(this.f373126d, e86Var.f373126d) && n51.f.a(this.f373127e, e86Var.f373127e) && n51.f.a(java.lang.Integer.valueOf(this.f373128f), java.lang.Integer.valueOf(e86Var.f373128f)) && n51.f.a(java.lang.Integer.valueOf(this.f373129g), java.lang.Integer.valueOf(e86Var.f373129g)) && n51.f.a(this.f373130h, e86Var.f373130h) && n51.f.a(java.lang.Integer.valueOf(this.f373131i), java.lang.Integer.valueOf(e86Var.f373131i)) && n51.f.a(java.lang.Integer.valueOf(this.f373132m), java.lang.Integer.valueOf(e86Var.f373132m)) && n51.f.a(java.lang.Integer.valueOf(this.f373133n), java.lang.Integer.valueOf(e86Var.f373133n)) && n51.f.a(this.f373134o, e86Var.f373134o) && n51.f.a(java.lang.Integer.valueOf(this.f373135p), java.lang.Integer.valueOf(e86Var.f373135p)) && n51.f.a(java.lang.Long.valueOf(this.f373136q), java.lang.Long.valueOf(e86Var.f373136q)) && n51.f.a(java.lang.Long.valueOf(this.f373137r), java.lang.Long.valueOf(e86Var.f373137r)) && n51.f.a(java.lang.Integer.valueOf(this.f373138s), java.lang.Integer.valueOf(e86Var.f373138s)) && n51.f.a(java.lang.Integer.valueOf(this.f373139t), java.lang.Integer.valueOf(e86Var.f373139t)) && n51.f.a(this.f373140u, e86Var.f373140u) && n51.f.a(java.lang.Integer.valueOf(this.f373141v), java.lang.Integer.valueOf(e86Var.f373141v)) && n51.f.a(this.f373142w, e86Var.f373142w) && n51.f.a(this.f373143x, e86Var.f373143x) && n51.f.a(java.lang.Integer.valueOf(this.f373144y), java.lang.Integer.valueOf(e86Var.f373144y)) && n51.f.a(java.lang.Integer.valueOf(this.f373145z), java.lang.Integer.valueOf(e86Var.f373145z)) && n51.f.a(this.A, e86Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373126d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373127e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f373128f);
            fVar.e(4, this.f373129g);
            java.lang.String str3 = this.f373130h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373131i);
            fVar.e(7, this.f373132m);
            fVar.e(8, this.f373133n);
            java.lang.String str4 = this.f373134o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f373135p);
            fVar.h(11, this.f373136q);
            fVar.h(12, this.f373137r);
            fVar.e(13, this.f373138s);
            fVar.e(14, this.f373139t);
            fVar.g(15, 8, this.f373140u);
            fVar.e(16, this.f373141v);
            r45.cu5 cu5Var = this.f373142w;
            if (cu5Var != null) {
                fVar.i(17, cu5Var.computeSize());
                this.f373142w.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f373143x;
            if (cu5Var2 != null) {
                fVar.i(18, cu5Var2.computeSize());
                this.f373143x.writeFields(fVar);
            }
            fVar.e(19, this.f373144y);
            fVar.e(20, this.f373145z);
            fVar.g(21, 8, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f373126d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f373127e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f373128f) + b36.f.e(4, this.f373129g);
            java.lang.String str7 = this.f373130h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f373131i) + b36.f.e(7, this.f373132m) + b36.f.e(8, this.f373133n);
            java.lang.String str8 = this.f373134o;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            int e19 = e18 + b36.f.e(10, this.f373135p) + b36.f.h(11, this.f373136q) + b36.f.h(12, this.f373137r) + b36.f.e(13, this.f373138s) + b36.f.e(14, this.f373139t) + b36.f.g(15, 8, this.f373140u) + b36.f.e(16, this.f373141v);
            r45.cu5 cu5Var3 = this.f373142w;
            if (cu5Var3 != null) {
                e19 += b36.f.i(17, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f373143x;
            if (cu5Var4 != null) {
                e19 += b36.f.i(18, cu5Var4.computeSize());
            }
            return e19 + b36.f.e(19, this.f373144y) + b36.f.e(20, this.f373145z) + b36.f.g(21, 8, this.A);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373140u.clear();
            this.A.clear();
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
        r45.e86 e86Var = (r45.e86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e86Var.f373126d = aVar2.k(intValue);
                return 0;
            case 2:
                e86Var.f373127e = aVar2.k(intValue);
                return 0;
            case 3:
                e86Var.f373128f = aVar2.g(intValue);
                return 0;
            case 4:
                e86Var.f373129g = aVar2.g(intValue);
                return 0;
            case 5:
                e86Var.f373130h = aVar2.k(intValue);
                return 0;
            case 6:
                e86Var.f373131i = aVar2.g(intValue);
                return 0;
            case 7:
                e86Var.f373132m = aVar2.g(intValue);
                return 0;
            case 8:
                e86Var.f373133n = aVar2.g(intValue);
                return 0;
            case 9:
                e86Var.f373134o = aVar2.k(intValue);
                return 0;
            case 10:
                e86Var.f373135p = aVar2.g(intValue);
                return 0;
            case 11:
                e86Var.f373136q = aVar2.i(intValue);
                return 0;
            case 12:
                e86Var.f373137r = aVar2.i(intValue);
                return 0;
            case 13:
                e86Var.f373138s = aVar2.g(intValue);
                return 0;
            case 14:
                e86Var.f373139t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr2 != null && bArr2.length > 0) {
                        l86Var.parseFrom(bArr2);
                    }
                    e86Var.f373140u.add(l86Var);
                }
                return 0;
            case 16:
                e86Var.f373141v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    e86Var.f373142w = cu5Var5;
                }
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    e86Var.f373143x = cu5Var6;
                }
                return 0;
            case 19:
                e86Var.f373144y = aVar2.g(intValue);
                return 0;
            case 20:
                e86Var.f373145z = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr5 != null && bArr5.length > 0) {
                        d86Var.parseFrom(bArr5);
                    }
                    e86Var.A.add(d86Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
