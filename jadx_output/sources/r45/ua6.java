package r45;

/* loaded from: classes4.dex */
public class ua6 extends r45.js5 {
    public long A;
    public int B;
    public r45.cu5 C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387168d;

    /* renamed from: e, reason: collision with root package name */
    public int f387169e;

    /* renamed from: g, reason: collision with root package name */
    public int f387171g;

    /* renamed from: h, reason: collision with root package name */
    public int f387172h;

    /* renamed from: i, reason: collision with root package name */
    public int f387173i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ga6 f387174m;

    /* renamed from: n, reason: collision with root package name */
    public int f387175n;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f387177p;

    /* renamed from: q, reason: collision with root package name */
    public int f387178q;

    /* renamed from: s, reason: collision with root package name */
    public int f387180s;

    /* renamed from: u, reason: collision with root package name */
    public int f387182u;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f387185x;

    /* renamed from: y, reason: collision with root package name */
    public int f387186y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387170f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f387176o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f387179r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f387181t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f387183v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f387184w = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f387187z = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ua6)) {
            return false;
        }
        r45.ua6 ua6Var = (r45.ua6) fVar;
        return n51.f.a(this.BaseResponse, ua6Var.BaseResponse) && n51.f.a(this.f387168d, ua6Var.f387168d) && n51.f.a(java.lang.Integer.valueOf(this.f387169e), java.lang.Integer.valueOf(ua6Var.f387169e)) && n51.f.a(this.f387170f, ua6Var.f387170f) && n51.f.a(java.lang.Integer.valueOf(this.f387171g), java.lang.Integer.valueOf(ua6Var.f387171g)) && n51.f.a(java.lang.Integer.valueOf(this.f387172h), java.lang.Integer.valueOf(ua6Var.f387172h)) && n51.f.a(java.lang.Integer.valueOf(this.f387173i), java.lang.Integer.valueOf(ua6Var.f387173i)) && n51.f.a(this.f387174m, ua6Var.f387174m) && n51.f.a(java.lang.Integer.valueOf(this.f387175n), java.lang.Integer.valueOf(ua6Var.f387175n)) && n51.f.a(this.f387176o, ua6Var.f387176o) && n51.f.a(this.f387177p, ua6Var.f387177p) && n51.f.a(java.lang.Integer.valueOf(this.f387178q), java.lang.Integer.valueOf(ua6Var.f387178q)) && n51.f.a(this.f387179r, ua6Var.f387179r) && n51.f.a(java.lang.Integer.valueOf(this.f387180s), java.lang.Integer.valueOf(ua6Var.f387180s)) && n51.f.a(this.f387181t, ua6Var.f387181t) && n51.f.a(java.lang.Integer.valueOf(this.f387182u), java.lang.Integer.valueOf(ua6Var.f387182u)) && n51.f.a(this.f387183v, ua6Var.f387183v) && n51.f.a(this.f387184w, ua6Var.f387184w) && n51.f.a(this.f387185x, ua6Var.f387185x) && n51.f.a(java.lang.Integer.valueOf(this.f387186y), java.lang.Integer.valueOf(ua6Var.f387186y)) && n51.f.a(this.f387187z, ua6Var.f387187z) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(ua6Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ua6Var.B)) && n51.f.a(this.C, ua6Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387187z;
        java.util.LinkedList linkedList2 = this.f387181t;
        java.util.LinkedList linkedList3 = this.f387179r;
        java.util.LinkedList linkedList4 = this.f387176o;
        java.util.LinkedList linkedList5 = this.f387170f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f387168d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387169e);
            fVar.g(4, 8, linkedList5);
            fVar.e(5, this.f387171g);
            fVar.e(6, this.f387172h);
            fVar.e(7, this.f387173i);
            r45.ga6 ga6Var = this.f387174m;
            if (ga6Var != null) {
                fVar.i(8, ga6Var.computeSize());
                this.f387174m.writeFields(fVar);
            }
            fVar.e(9, this.f387175n);
            fVar.g(10, 8, linkedList4);
            r45.cu5 cu5Var = this.f387177p;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.computeSize());
                this.f387177p.writeFields(fVar);
            }
            fVar.e(12, this.f387178q);
            fVar.g(13, 8, linkedList3);
            fVar.e(14, this.f387180s);
            fVar.g(15, 8, linkedList2);
            fVar.e(16, this.f387182u);
            fVar.k(17, 3, this.f387183v);
            fVar.k(18, 2, this.f387184w);
            r45.cu5 cu5Var2 = this.f387185x;
            if (cu5Var2 != null) {
                fVar.i(19, cu5Var2.computeSize());
                this.f387185x.writeFields(fVar);
            }
            fVar.e(20, this.f387186y);
            fVar.g(21, 8, linkedList);
            fVar.h(22, this.A);
            fVar.e(24, this.B);
            r45.cu5 cu5Var3 = this.C;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(25, cu5Var3.computeSize());
            this.C.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f387168d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f387169e) + b36.f.g(4, 8, linkedList5) + b36.f.e(5, this.f387171g) + b36.f.e(6, this.f387172h) + b36.f.e(7, this.f387173i);
            r45.ga6 ga6Var2 = this.f387174m;
            if (ga6Var2 != null) {
                e17 += b36.f.i(8, ga6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(9, this.f387175n) + b36.f.g(10, 8, linkedList4);
            r45.cu5 cu5Var4 = this.f387177p;
            if (cu5Var4 != null) {
                e18 += b36.f.i(11, cu5Var4.computeSize());
            }
            int e19 = e18 + b36.f.e(12, this.f387178q) + b36.f.g(13, 8, linkedList3) + b36.f.e(14, this.f387180s) + b36.f.g(15, 8, linkedList2) + b36.f.e(16, this.f387182u) + b36.f.k(17, 3, this.f387183v) + b36.f.k(18, 2, this.f387184w);
            r45.cu5 cu5Var5 = this.f387185x;
            if (cu5Var5 != null) {
                e19 += b36.f.i(19, cu5Var5.computeSize());
            }
            int e27 = e19 + b36.f.e(20, this.f387186y) + b36.f.g(21, 8, linkedList) + b36.f.h(22, this.A) + b36.f.e(24, this.B);
            r45.cu5 cu5Var6 = this.C;
            return cu5Var6 != null ? e27 + b36.f.i(25, cu5Var6.computeSize()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            this.f387183v.clear();
            this.f387184w.clear();
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
        r45.ua6 ua6Var = (r45.ua6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    ua6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ua6Var.f387168d = aVar2.k(intValue);
                return 0;
            case 3:
                ua6Var.f387169e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsObject.parseFrom(bArr3);
                    }
                    ua6Var.f387170f.add(snsObject);
                }
                return 0;
            case 5:
                ua6Var.f387171g = aVar2.g(intValue);
                return 0;
            case 6:
                ua6Var.f387172h = aVar2.g(intValue);
                return 0;
            case 7:
                ua6Var.f387173i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga6Var3.parseFrom(bArr4);
                    }
                    ua6Var.f387174m = ga6Var3;
                }
                return 0;
            case 9:
                ua6Var.f387175n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.g5 g5Var = new r45.g5();
                    if (bArr5 != null && bArr5.length > 0) {
                        g5Var.parseFrom(bArr5);
                    }
                    ua6Var.f387176o.add(g5Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var7.b(bArr6);
                    }
                    ua6Var.f387177p = cu5Var7;
                }
                return 0;
            case 12:
                ua6Var.f387178q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ck5 ck5Var = new r45.ck5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ck5Var.parseFrom(bArr7);
                    }
                    ua6Var.f387179r.add(ck5Var);
                }
                return 0;
            case 14:
                ua6Var.f387180s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.pb0 pb0Var = new r45.pb0();
                    if (bArr8 != null && bArr8.length > 0) {
                        pb0Var.parseFrom(bArr8);
                    }
                    ua6Var.f387181t.add(pb0Var);
                }
                return 0;
            case 16:
                ua6Var.f387182u = aVar2.g(intValue);
                return 0;
            case 17:
                byte[] bArr9 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr9, 0, bArr9.length);
                java.util.LinkedList linkedList6 = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList6.add(java.lang.Long.valueOf(aVar3.g()));
                }
                ua6Var.f387183v = linkedList6;
                return 0;
            case 18:
                byte[] bArr10 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr10, 0, bArr10.length);
                java.util.LinkedList linkedList7 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList7.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                ua6Var.f387184w = linkedList7;
                return 0;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr11 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var8.b(bArr11);
                    }
                    ua6Var.f387185x = cu5Var8;
                }
                return 0;
            case 20:
                ua6Var.f387186y = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr12 = (byte[]) j39.get(i48);
                    r45.i5 i5Var = new r45.i5();
                    if (bArr12 != null && bArr12.length > 0) {
                        i5Var.parseFrom(bArr12);
                    }
                    ua6Var.f387187z.add(i5Var);
                }
                return 0;
            case 22:
                ua6Var.A = aVar2.i(intValue);
                return 0;
            case 23:
            default:
                return -1;
            case 24:
                ua6Var.B = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr13 = (byte[]) j47.get(i49);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr13 != null && bArr13.length > 0) {
                        cu5Var9.b(bArr13);
                    }
                    ua6Var.C = cu5Var9;
                }
                return 0;
        }
    }
}
