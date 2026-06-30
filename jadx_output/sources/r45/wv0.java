package r45;

/* loaded from: classes14.dex */
public class wv0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389481d;

    /* renamed from: e, reason: collision with root package name */
    public int f389482e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389483f;

    /* renamed from: g, reason: collision with root package name */
    public float f389484g;

    /* renamed from: h, reason: collision with root package name */
    public float f389485h;

    /* renamed from: i, reason: collision with root package name */
    public long f389486i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389487m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389489o;

    /* renamed from: p, reason: collision with root package name */
    public int f389490p;

    /* renamed from: q, reason: collision with root package name */
    public int f389491q;

    /* renamed from: r, reason: collision with root package name */
    public int f389492r;

    /* renamed from: s, reason: collision with root package name */
    public int f389493s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389494t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389495u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f389496v;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f389488n = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f389497w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv0)) {
            return false;
        }
        r45.wv0 wv0Var = (r45.wv0) fVar;
        return n51.f.a(this.BaseRequest, wv0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389481d), java.lang.Integer.valueOf(wv0Var.f389481d)) && n51.f.a(java.lang.Integer.valueOf(this.f389482e), java.lang.Integer.valueOf(wv0Var.f389482e)) && n51.f.a(this.f389483f, wv0Var.f389483f) && n51.f.a(java.lang.Float.valueOf(this.f389484g), java.lang.Float.valueOf(wv0Var.f389484g)) && n51.f.a(java.lang.Float.valueOf(this.f389485h), java.lang.Float.valueOf(wv0Var.f389485h)) && n51.f.a(java.lang.Long.valueOf(this.f389486i), java.lang.Long.valueOf(wv0Var.f389486i)) && n51.f.a(this.f389487m, wv0Var.f389487m) && n51.f.a(this.f389488n, wv0Var.f389488n) && n51.f.a(this.f389489o, wv0Var.f389489o) && n51.f.a(java.lang.Integer.valueOf(this.f389490p), java.lang.Integer.valueOf(wv0Var.f389490p)) && n51.f.a(java.lang.Integer.valueOf(this.f389491q), java.lang.Integer.valueOf(wv0Var.f389491q)) && n51.f.a(java.lang.Integer.valueOf(this.f389492r), java.lang.Integer.valueOf(wv0Var.f389492r)) && n51.f.a(java.lang.Integer.valueOf(this.f389493s), java.lang.Integer.valueOf(wv0Var.f389493s)) && n51.f.a(this.f389494t, wv0Var.f389494t) && n51.f.a(this.f389495u, wv0Var.f389495u) && n51.f.a(this.f389496v, wv0Var.f389496v) && n51.f.a(this.f389497w, wv0Var.f389497w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389488n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f389481d);
            fVar.e(3, this.f389482e);
            com.tencent.mm.protobuf.g gVar = this.f389483f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(31, this.f389484g);
            fVar.d(32, this.f389485h);
            fVar.h(33, this.f389486i);
            com.tencent.mm.protobuf.g gVar2 = this.f389487m;
            if (gVar2 != null) {
                fVar.b(34, gVar2);
            }
            fVar.g(35, 1, linkedList);
            java.lang.String str = this.f389489o;
            if (str != null) {
                fVar.j(36, str);
            }
            fVar.e(41, this.f389490p);
            fVar.e(42, this.f389491q);
            fVar.e(43, this.f389492r);
            fVar.e(44, this.f389493s);
            com.tencent.mm.protobuf.g gVar3 = this.f389494t;
            if (gVar3 != null) {
                fVar.b(45, gVar3);
            }
            java.lang.String str2 = this.f389495u;
            if (str2 != null) {
                fVar.j(81, str2);
            }
            java.lang.String str3 = this.f389496v;
            if (str3 != null) {
                fVar.j(82, str3);
            }
            fVar.g(91, 8, this.f389497w);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f389481d) + b36.f.e(3, this.f389482e);
            com.tencent.mm.protobuf.g gVar4 = this.f389483f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            int d17 = i18 + b36.f.d(31, this.f389484g) + b36.f.d(32, this.f389485h) + b36.f.h(33, this.f389486i);
            com.tencent.mm.protobuf.g gVar5 = this.f389487m;
            if (gVar5 != null) {
                d17 += b36.f.b(34, gVar5);
            }
            int g17 = d17 + b36.f.g(35, 1, linkedList);
            java.lang.String str4 = this.f389489o;
            if (str4 != null) {
                g17 += b36.f.j(36, str4);
            }
            int e17 = g17 + b36.f.e(41, this.f389490p) + b36.f.e(42, this.f389491q) + b36.f.e(43, this.f389492r) + b36.f.e(44, this.f389493s);
            com.tencent.mm.protobuf.g gVar6 = this.f389494t;
            if (gVar6 != null) {
                e17 += b36.f.b(45, gVar6);
            }
            java.lang.String str5 = this.f389495u;
            if (str5 != null) {
                e17 += b36.f.j(81, str5);
            }
            java.lang.String str6 = this.f389496v;
            if (str6 != null) {
                e17 += b36.f.j(82, str6);
            }
            return e17 + b36.f.g(91, 8, this.f389497w);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f389497w.clear();
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
        r45.wv0 wv0Var = (r45.wv0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                wv0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wv0Var.f389481d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wv0Var.f389482e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wv0Var.f389483f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 81) {
            wv0Var.f389495u = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 82) {
            wv0Var.f389496v = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.gb gbVar = new r45.gb();
                if (bArr3 != null && bArr3.length > 0) {
                    gbVar.parseFrom(bArr3);
                }
                wv0Var.f389497w.add(gbVar);
            }
            return 0;
        }
        switch (intValue) {
            case 31:
                wv0Var.f389484g = aVar2.f(intValue);
                return 0;
            case 32:
                wv0Var.f389485h = aVar2.f(intValue);
                return 0;
            case 33:
                wv0Var.f389486i = aVar2.i(intValue);
                return 0;
            case 34:
                wv0Var.f389487m = aVar2.d(intValue);
                return 0;
            case 35:
                wv0Var.f389488n.add(aVar2.k(intValue));
                return 0;
            case 36:
                wv0Var.f389489o = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 41:
                        wv0Var.f389490p = aVar2.g(intValue);
                        return 0;
                    case 42:
                        wv0Var.f389491q = aVar2.g(intValue);
                        return 0;
                    case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                        wv0Var.f389492r = aVar2.g(intValue);
                        return 0;
                    case 44:
                        wv0Var.f389493s = aVar2.g(intValue);
                        return 0;
                    case 45:
                        wv0Var.f389494t = aVar2.d(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
