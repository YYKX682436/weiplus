package r45;

/* loaded from: classes7.dex */
public class os3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382481e;

    /* renamed from: f, reason: collision with root package name */
    public int f382482f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382483g;

    /* renamed from: h, reason: collision with root package name */
    public int f382484h;

    /* renamed from: i, reason: collision with root package name */
    public int f382485i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382486m;

    /* renamed from: n, reason: collision with root package name */
    public r45.q35 f382487n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f382488o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f382489p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f382490q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f382491r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f382492s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f382493t;

    /* renamed from: u, reason: collision with root package name */
    public int f382494u;

    /* renamed from: v, reason: collision with root package name */
    public r45.y50 f382495v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.os3)) {
            return false;
        }
        r45.os3 os3Var = (r45.os3) fVar;
        return n51.f.a(this.BaseRequest, os3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382480d), java.lang.Integer.valueOf(os3Var.f382480d)) && n51.f.a(this.f382481e, os3Var.f382481e) && n51.f.a(java.lang.Integer.valueOf(this.f382482f), java.lang.Integer.valueOf(os3Var.f382482f)) && n51.f.a(this.f382483g, os3Var.f382483g) && n51.f.a(java.lang.Integer.valueOf(this.f382484h), java.lang.Integer.valueOf(os3Var.f382484h)) && n51.f.a(java.lang.Integer.valueOf(this.f382485i), java.lang.Integer.valueOf(os3Var.f382485i)) && n51.f.a(this.f382486m, os3Var.f382486m) && n51.f.a(this.f382487n, os3Var.f382487n) && n51.f.a(this.f382488o, os3Var.f382488o) && n51.f.a(java.lang.Integer.valueOf(this.f382489p), java.lang.Integer.valueOf(os3Var.f382489p)) && n51.f.a(this.f382490q, os3Var.f382490q) && n51.f.a(this.f382491r, os3Var.f382491r) && n51.f.a(java.lang.Boolean.valueOf(this.f382492s), java.lang.Boolean.valueOf(os3Var.f382492s)) && n51.f.a(java.lang.Boolean.valueOf(this.f382493t), java.lang.Boolean.valueOf(os3Var.f382493t)) && n51.f.a(java.lang.Integer.valueOf(this.f382494u), java.lang.Integer.valueOf(os3Var.f382494u)) && n51.f.a(this.f382495v, os3Var.f382495v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382488o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f382480d);
            java.lang.String str = this.f382481e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382482f);
            java.lang.String str2 = this.f382483g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f382484h);
            fVar.e(7, this.f382485i);
            java.lang.String str3 = this.f382486m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.q35 q35Var = this.f382487n;
            if (q35Var != null) {
                fVar.i(10, q35Var.computeSize());
                this.f382487n.writeFields(fVar);
            }
            fVar.g(12, 8, linkedList);
            fVar.e(13, this.f382489p);
            java.lang.String str4 = this.f382490q;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f382491r;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.a(16, this.f382492s);
            fVar.a(17, this.f382493t);
            fVar.e(18, this.f382494u);
            r45.y50 y50Var = this.f382495v;
            if (y50Var != null) {
                fVar.i(19, y50Var.computeSize());
                this.f382495v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f382480d);
            java.lang.String str6 = this.f382481e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f382482f);
            java.lang.String str7 = this.f382483g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f382484h) + b36.f.e(7, this.f382485i);
            java.lang.String str8 = this.f382486m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            r45.q35 q35Var2 = this.f382487n;
            if (q35Var2 != null) {
                e18 += b36.f.i(10, q35Var2.computeSize());
            }
            int g17 = e18 + b36.f.g(12, 8, linkedList) + b36.f.e(13, this.f382489p);
            java.lang.String str9 = this.f382490q;
            if (str9 != null) {
                g17 += b36.f.j(14, str9);
            }
            java.lang.String str10 = this.f382491r;
            if (str10 != null) {
                g17 += b36.f.j(15, str10);
            }
            int a17 = g17 + b36.f.a(16, this.f382492s) + b36.f.a(17, this.f382493t) + b36.f.e(18, this.f382494u);
            r45.y50 y50Var2 = this.f382495v;
            return y50Var2 != null ? a17 + b36.f.i(19, y50Var2.computeSize()) : a17;
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
        r45.os3 os3Var = (r45.os3) objArr[1];
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
                    os3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                os3Var.f382480d = aVar2.g(intValue);
                return 0;
            case 3:
                os3Var.f382481e = aVar2.k(intValue);
                return 0;
            case 4:
                os3Var.f382482f = aVar2.g(intValue);
                return 0;
            case 5:
                os3Var.f382483g = aVar2.k(intValue);
                return 0;
            case 6:
                os3Var.f382484h = aVar2.g(intValue);
                return 0;
            case 7:
                os3Var.f382485i = aVar2.g(intValue);
                return 0;
            case 8:
                os3Var.f382486m = aVar2.k(intValue);
                return 0;
            case 9:
            case 11:
            default:
                return -1;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q35 q35Var3 = new r45.q35();
                    if (bArr3 != null && bArr3.length > 0) {
                        q35Var3.parseFrom(bArr3);
                    }
                    os3Var.f382487n = q35Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yp4 yp4Var = new r45.yp4();
                    if (bArr4 != null && bArr4.length > 0) {
                        yp4Var.parseFrom(bArr4);
                    }
                    os3Var.f382488o.add(yp4Var);
                }
                return 0;
            case 13:
                os3Var.f382489p = aVar2.g(intValue);
                return 0;
            case 14:
                os3Var.f382490q = aVar2.k(intValue);
                return 0;
            case 15:
                os3Var.f382491r = aVar2.k(intValue);
                return 0;
            case 16:
                os3Var.f382492s = aVar2.c(intValue);
                return 0;
            case 17:
                os3Var.f382493t = aVar2.c(intValue);
                return 0;
            case 18:
                os3Var.f382494u = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.y50 y50Var3 = new r45.y50();
                    if (bArr5 != null && bArr5.length > 0) {
                        y50Var3.parseFrom(bArr5);
                    }
                    os3Var.f382495v = y50Var3;
                }
                return 0;
        }
    }
}
