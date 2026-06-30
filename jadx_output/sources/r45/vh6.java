package r45;

/* loaded from: classes9.dex */
public class vh6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388256d;

    /* renamed from: e, reason: collision with root package name */
    public int f388257e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388259g;

    /* renamed from: h, reason: collision with root package name */
    public int f388260h;

    /* renamed from: i, reason: collision with root package name */
    public int f388261i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388262m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388263n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ta5 f388264o;

    /* renamed from: p, reason: collision with root package name */
    public int f388265p;

    /* renamed from: q, reason: collision with root package name */
    public int f388266q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f388267r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f388268s;

    /* renamed from: u, reason: collision with root package name */
    public int f388270u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388258f = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f388269t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh6)) {
            return false;
        }
        r45.vh6 vh6Var = (r45.vh6) fVar;
        return n51.f.a(this.BaseRequest, vh6Var.BaseRequest) && n51.f.a(this.f388256d, vh6Var.f388256d) && n51.f.a(java.lang.Integer.valueOf(this.f388257e), java.lang.Integer.valueOf(vh6Var.f388257e)) && n51.f.a(this.f388258f, vh6Var.f388258f) && n51.f.a(this.f388259g, vh6Var.f388259g) && n51.f.a(java.lang.Integer.valueOf(this.f388260h), java.lang.Integer.valueOf(vh6Var.f388260h)) && n51.f.a(java.lang.Integer.valueOf(this.f388261i), java.lang.Integer.valueOf(vh6Var.f388261i)) && n51.f.a(this.f388262m, vh6Var.f388262m) && n51.f.a(this.f388263n, vh6Var.f388263n) && n51.f.a(this.f388264o, vh6Var.f388264o) && n51.f.a(java.lang.Integer.valueOf(this.f388265p), java.lang.Integer.valueOf(vh6Var.f388265p)) && n51.f.a(java.lang.Integer.valueOf(this.f388266q), java.lang.Integer.valueOf(vh6Var.f388266q)) && n51.f.a(this.f388267r, vh6Var.f388267r) && n51.f.a(this.f388268s, vh6Var.f388268s) && n51.f.a(this.f388269t, vh6Var.f388269t) && n51.f.a(java.lang.Integer.valueOf(this.f388270u), java.lang.Integer.valueOf(vh6Var.f388270u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388269t;
        java.util.LinkedList linkedList2 = this.f388258f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f388256d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388257e);
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f388259g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f388260h);
            fVar.e(8, this.f388261i);
            java.lang.String str3 = this.f388262m;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f388263n;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            r45.ta5 ta5Var = this.f388264o;
            if (ta5Var != null) {
                fVar.i(11, ta5Var.computeSize());
                this.f388264o.writeFields(fVar);
            }
            fVar.e(12, this.f388265p);
            fVar.e(13, this.f388266q);
            java.lang.String str4 = this.f388267r;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f388268s;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.g(18, 1, linkedList);
            fVar.e(19, this.f388270u);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f388256d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f388257e) + b36.f.g(4, 8, linkedList2);
            java.lang.String str7 = this.f388259g;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f388260h) + b36.f.e(8, this.f388261i);
            java.lang.String str8 = this.f388262m;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388263n;
            if (gVar2 != null) {
                e18 += b36.f.b(10, gVar2);
            }
            r45.ta5 ta5Var2 = this.f388264o;
            if (ta5Var2 != null) {
                e18 += b36.f.i(11, ta5Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(12, this.f388265p) + b36.f.e(13, this.f388266q);
            java.lang.String str9 = this.f388267r;
            if (str9 != null) {
                e19 += b36.f.j(14, str9);
            }
            java.lang.String str10 = this.f388268s;
            if (str10 != null) {
                e19 += b36.f.j(15, str10);
            }
            return e19 + b36.f.g(18, 1, linkedList) + b36.f.e(19, this.f388270u);
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
        r45.vh6 vh6Var = (r45.vh6) objArr[1];
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
                    vh6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vh6Var.f388256d = aVar2.k(intValue);
                return 0;
            case 3:
                vh6Var.f388257e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.th6 th6Var = new r45.th6();
                    if (bArr3 != null && bArr3.length > 0) {
                        th6Var.parseFrom(bArr3);
                    }
                    vh6Var.f388258f.add(th6Var);
                }
                return 0;
            case 5:
            case 16:
            case 17:
            default:
                return -1;
            case 6:
                vh6Var.f388259g = aVar2.k(intValue);
                return 0;
            case 7:
                vh6Var.f388260h = aVar2.g(intValue);
                return 0;
            case 8:
                vh6Var.f388261i = aVar2.g(intValue);
                return 0;
            case 9:
                vh6Var.f388262m = aVar2.k(intValue);
                return 0;
            case 10:
                vh6Var.f388263n = aVar2.d(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ta5 ta5Var3 = new r45.ta5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ta5Var3.parseFrom(bArr4);
                    }
                    vh6Var.f388264o = ta5Var3;
                }
                return 0;
            case 12:
                vh6Var.f388265p = aVar2.g(intValue);
                return 0;
            case 13:
                vh6Var.f388266q = aVar2.g(intValue);
                return 0;
            case 14:
                vh6Var.f388267r = aVar2.k(intValue);
                return 0;
            case 15:
                vh6Var.f388268s = aVar2.k(intValue);
                return 0;
            case 18:
                vh6Var.f388269t.add(aVar2.k(intValue));
                return 0;
            case 19:
                vh6Var.f388270u = aVar2.g(intValue);
                return 0;
        }
    }
}
