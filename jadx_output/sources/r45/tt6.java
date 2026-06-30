package r45;

/* loaded from: classes2.dex */
public class tt6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386791d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386792e;

    /* renamed from: f, reason: collision with root package name */
    public int f386793f;

    /* renamed from: g, reason: collision with root package name */
    public int f386794g;

    /* renamed from: h, reason: collision with root package name */
    public int f386795h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386796i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386797m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386798n;

    /* renamed from: o, reason: collision with root package name */
    public int f386799o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386800p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f386801q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public int f386802r;

    /* renamed from: s, reason: collision with root package name */
    public int f386803s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tt6)) {
            return false;
        }
        r45.tt6 tt6Var = (r45.tt6) fVar;
        return n51.f.a(this.BaseRequest, tt6Var.BaseRequest) && n51.f.a(this.f386791d, tt6Var.f386791d) && n51.f.a(this.f386792e, tt6Var.f386792e) && n51.f.a(java.lang.Integer.valueOf(this.f386793f), java.lang.Integer.valueOf(tt6Var.f386793f)) && n51.f.a(java.lang.Integer.valueOf(this.f386794g), java.lang.Integer.valueOf(tt6Var.f386794g)) && n51.f.a(java.lang.Integer.valueOf(this.f386795h), java.lang.Integer.valueOf(tt6Var.f386795h)) && n51.f.a(this.f386796i, tt6Var.f386796i) && n51.f.a(this.f386797m, tt6Var.f386797m) && n51.f.a(this.f386798n, tt6Var.f386798n) && n51.f.a(java.lang.Integer.valueOf(this.f386799o), java.lang.Integer.valueOf(tt6Var.f386799o)) && n51.f.a(this.f386800p, tt6Var.f386800p) && n51.f.a(this.f386801q, tt6Var.f386801q) && n51.f.a(java.lang.Integer.valueOf(this.f386802r), java.lang.Integer.valueOf(tt6Var.f386802r)) && n51.f.a(java.lang.Integer.valueOf(this.f386803s), java.lang.Integer.valueOf(tt6Var.f386803s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386801q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f386791d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386792e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f386793f);
            fVar.e(5, this.f386794g);
            fVar.e(6, this.f386795h);
            java.lang.String str3 = this.f386796i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f386797m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f386798n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f386799o);
            java.lang.String str6 = this.f386800p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.e(13, this.f386802r);
            fVar.e(14, this.f386803s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f386791d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f386792e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int e17 = i18 + b36.f.e(4, this.f386793f) + b36.f.e(5, this.f386794g) + b36.f.e(6, this.f386795h);
            java.lang.String str9 = this.f386796i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f386797m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f386798n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            int e18 = e17 + b36.f.e(10, this.f386799o);
            java.lang.String str12 = this.f386800p;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            return e18 + b36.f.g(12, 8, linkedList) + b36.f.e(13, this.f386802r) + b36.f.e(14, this.f386803s);
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
        r45.tt6 tt6Var = (r45.tt6) objArr[1];
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
                    tt6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                tt6Var.f386791d = aVar2.k(intValue);
                return 0;
            case 3:
                tt6Var.f386792e = aVar2.k(intValue);
                return 0;
            case 4:
                tt6Var.f386793f = aVar2.g(intValue);
                return 0;
            case 5:
                tt6Var.f386794g = aVar2.g(intValue);
                return 0;
            case 6:
                tt6Var.f386795h = aVar2.g(intValue);
                return 0;
            case 7:
                tt6Var.f386796i = aVar2.k(intValue);
                return 0;
            case 8:
                tt6Var.f386797m = aVar2.k(intValue);
                return 0;
            case 9:
                tt6Var.f386798n = aVar2.k(intValue);
                return 0;
            case 10:
                tt6Var.f386799o = aVar2.g(intValue);
                return 0;
            case 11:
                tt6Var.f386800p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cd6 cd6Var = new r45.cd6();
                    if (bArr3 != null && bArr3.length > 0) {
                        cd6Var.parseFrom(bArr3);
                    }
                    tt6Var.f386801q.add(cd6Var);
                }
                return 0;
            case 13:
                tt6Var.f386802r = aVar2.g(intValue);
                return 0;
            case 14:
                tt6Var.f386803s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
