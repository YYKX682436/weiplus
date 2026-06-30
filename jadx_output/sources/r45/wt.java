package r45;

/* loaded from: classes9.dex */
public class wt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389427d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389428e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389429f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389430g;

    /* renamed from: i, reason: collision with root package name */
    public int f389432i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389433m;

    /* renamed from: n, reason: collision with root package name */
    public r45.iu f389434n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389435o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389437q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f389438r;

    /* renamed from: s, reason: collision with root package name */
    public r45.iu f389439s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ut f389440t;

    /* renamed from: u, reason: collision with root package name */
    public int f389441u;

    /* renamed from: v, reason: collision with root package name */
    public int f389442v;

    /* renamed from: w, reason: collision with root package name */
    public int f389443w;

    /* renamed from: x, reason: collision with root package name */
    public long f389444x;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f389431h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f389436p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt)) {
            return false;
        }
        r45.wt wtVar = (r45.wt) fVar;
        return n51.f.a(this.f389427d, wtVar.f389427d) && n51.f.a(this.f389428e, wtVar.f389428e) && n51.f.a(this.f389429f, wtVar.f389429f) && n51.f.a(this.f389430g, wtVar.f389430g) && n51.f.a(this.f389431h, wtVar.f389431h) && n51.f.a(java.lang.Integer.valueOf(this.f389432i), java.lang.Integer.valueOf(wtVar.f389432i)) && n51.f.a(this.f389433m, wtVar.f389433m) && n51.f.a(this.f389434n, wtVar.f389434n) && n51.f.a(this.f389435o, wtVar.f389435o) && n51.f.a(this.f389436p, wtVar.f389436p) && n51.f.a(this.f389437q, wtVar.f389437q) && n51.f.a(this.f389438r, wtVar.f389438r) && n51.f.a(this.f389439s, wtVar.f389439s) && n51.f.a(this.f389440t, wtVar.f389440t) && n51.f.a(java.lang.Integer.valueOf(this.f389441u), java.lang.Integer.valueOf(wtVar.f389441u)) && n51.f.a(java.lang.Integer.valueOf(this.f389442v), java.lang.Integer.valueOf(wtVar.f389442v)) && n51.f.a(java.lang.Integer.valueOf(this.f389443w), java.lang.Integer.valueOf(wtVar.f389443w)) && n51.f.a(java.lang.Long.valueOf(this.f389444x), java.lang.Long.valueOf(wtVar.f389444x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389436p;
        java.util.LinkedList linkedList2 = this.f389431h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389427d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389428e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389429f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f389430g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f389432i);
            java.lang.String str5 = this.f389433m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.iu iuVar = this.f389434n;
            if (iuVar != null) {
                fVar.i(8, iuVar.computeSize());
                this.f389434n.writeFields(fVar);
            }
            java.lang.String str6 = this.f389435o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str7 = this.f389437q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f389438r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            r45.iu iuVar2 = this.f389439s;
            if (iuVar2 != null) {
                fVar.i(13, iuVar2.computeSize());
                this.f389439s.writeFields(fVar);
            }
            r45.ut utVar = this.f389440t;
            if (utVar != null) {
                fVar.i(14, utVar.computeSize());
                this.f389440t.writeFields(fVar);
            }
            fVar.e(15, this.f389441u);
            fVar.e(16, this.f389442v);
            fVar.e(17, this.f389443w);
            fVar.h(18, this.f389444x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f389427d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f389428e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f389429f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f389430g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int g17 = j17 + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f389432i);
            java.lang.String str13 = this.f389433m;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            r45.iu iuVar3 = this.f389434n;
            if (iuVar3 != null) {
                g17 += b36.f.i(8, iuVar3.computeSize());
            }
            java.lang.String str14 = this.f389435o;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            int g18 = g17 + b36.f.g(10, 8, linkedList);
            java.lang.String str15 = this.f389437q;
            if (str15 != null) {
                g18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f389438r;
            if (str16 != null) {
                g18 += b36.f.j(12, str16);
            }
            r45.iu iuVar4 = this.f389439s;
            if (iuVar4 != null) {
                g18 += b36.f.i(13, iuVar4.computeSize());
            }
            r45.ut utVar2 = this.f389440t;
            if (utVar2 != null) {
                g18 += b36.f.i(14, utVar2.computeSize());
            }
            return g18 + b36.f.e(15, this.f389441u) + b36.f.e(16, this.f389442v) + b36.f.e(17, this.f389443w) + b36.f.h(18, this.f389444x);
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
        r45.wt wtVar = (r45.wt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wtVar.f389427d = aVar2.k(intValue);
                return 0;
            case 2:
                wtVar.f389428e = aVar2.k(intValue);
                return 0;
            case 3:
                wtVar.f389429f = aVar2.k(intValue);
                return 0;
            case 4:
                wtVar.f389430g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ut utVar3 = new r45.ut();
                    if (bArr2 != null && bArr2.length > 0) {
                        utVar3.parseFrom(bArr2);
                    }
                    wtVar.f389431h.add(utVar3);
                }
                return 0;
            case 6:
                wtVar.f389432i = aVar2.g(intValue);
                return 0;
            case 7:
                wtVar.f389433m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.iu iuVar5 = new r45.iu();
                    if (bArr3 != null && bArr3.length > 0) {
                        iuVar5.parseFrom(bArr3);
                    }
                    wtVar.f389434n = iuVar5;
                }
                return 0;
            case 9:
                wtVar.f389435o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.tt ttVar = new r45.tt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ttVar.parseFrom(bArr4);
                    }
                    wtVar.f389436p.add(ttVar);
                }
                return 0;
            case 11:
                wtVar.f389437q = aVar2.k(intValue);
                return 0;
            case 12:
                wtVar.f389438r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.iu iuVar6 = new r45.iu();
                    if (bArr5 != null && bArr5.length > 0) {
                        iuVar6.parseFrom(bArr5);
                    }
                    wtVar.f389439s = iuVar6;
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.ut utVar4 = new r45.ut();
                    if (bArr6 != null && bArr6.length > 0) {
                        utVar4.parseFrom(bArr6);
                    }
                    wtVar.f389440t = utVar4;
                }
                return 0;
            case 15:
                wtVar.f389441u = aVar2.g(intValue);
                return 0;
            case 16:
                wtVar.f389442v = aVar2.g(intValue);
                return 0;
            case 17:
                wtVar.f389443w = aVar2.g(intValue);
                return 0;
            case 18:
                wtVar.f389444x = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
