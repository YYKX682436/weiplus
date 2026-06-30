package r45;

/* loaded from: classes9.dex */
public class qd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383838d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383839e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383840f;

    /* renamed from: g, reason: collision with root package name */
    public int f383841g;

    /* renamed from: h, reason: collision with root package name */
    public int f383842h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f383843i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383844m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383845n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383846o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383847p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383848q;

    /* renamed from: r, reason: collision with root package name */
    public long f383849r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd)) {
            return false;
        }
        r45.qd qdVar = (r45.qd) fVar;
        return n51.f.a(this.f383838d, qdVar.f383838d) && n51.f.a(this.f383839e, qdVar.f383839e) && n51.f.a(this.f383840f, qdVar.f383840f) && n51.f.a(java.lang.Integer.valueOf(this.f383841g), java.lang.Integer.valueOf(qdVar.f383841g)) && n51.f.a(java.lang.Integer.valueOf(this.f383842h), java.lang.Integer.valueOf(qdVar.f383842h)) && n51.f.a(this.f383843i, qdVar.f383843i) && n51.f.a(this.f383844m, qdVar.f383844m) && n51.f.a(this.f383845n, qdVar.f383845n) && n51.f.a(this.f383846o, qdVar.f383846o) && n51.f.a(this.f383847p, qdVar.f383847p) && n51.f.a(this.f383848q, qdVar.f383848q) && n51.f.a(java.lang.Long.valueOf(this.f383849r), java.lang.Long.valueOf(qdVar.f383849r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383843i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383838d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383839e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383840f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f383841g);
            fVar.e(5, this.f383842h);
            fVar.g(6, 8, linkedList);
            java.lang.String str4 = this.f383844m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f383845n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f383846o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f383847p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f383848q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.h(12, this.f383849r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f383838d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f383839e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f383840f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f383841g) + b36.f.e(5, this.f383842h) + b36.f.g(6, 8, linkedList);
            java.lang.String str12 = this.f383844m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f383845n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f383846o;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f383847p;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f383848q;
            if (str16 != null) {
                e17 += b36.f.j(11, str16);
            }
            return e17 + b36.f.h(12, this.f383849r);
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
        r45.qd qdVar = (r45.qd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qdVar.f383838d = aVar2.k(intValue);
                return 0;
            case 2:
                qdVar.f383839e = aVar2.k(intValue);
                return 0;
            case 3:
                qdVar.f383840f = aVar2.k(intValue);
                return 0;
            case 4:
                qdVar.f383841g = aVar2.g(intValue);
                return 0;
            case 5:
                qdVar.f383842h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.dl0 dl0Var = new r45.dl0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dl0Var.parseFrom(bArr2);
                    }
                    qdVar.f383843i.add(dl0Var);
                }
                return 0;
            case 7:
                qdVar.f383844m = aVar2.k(intValue);
                return 0;
            case 8:
                qdVar.f383845n = aVar2.k(intValue);
                return 0;
            case 9:
                qdVar.f383846o = aVar2.k(intValue);
                return 0;
            case 10:
                qdVar.f383847p = aVar2.k(intValue);
                return 0;
            case 11:
                qdVar.f383848q = aVar2.k(intValue);
                return 0;
            case 12:
                qdVar.f383849r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
