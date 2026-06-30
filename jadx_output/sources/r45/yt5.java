package r45;

/* loaded from: classes2.dex */
public class yt5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391355e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm6 f391356f;

    /* renamed from: g, reason: collision with root package name */
    public r45.me0 f391357g;

    /* renamed from: h, reason: collision with root package name */
    public int f391358h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f391359i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f391360m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public r45.ra0 f391361n;

    /* renamed from: o, reason: collision with root package name */
    public r45.v1 f391362o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ms5 f391363p;

    /* renamed from: q, reason: collision with root package name */
    public r45.mv3 f391364q;

    /* renamed from: r, reason: collision with root package name */
    public r45.e90 f391365r;

    /* renamed from: s, reason: collision with root package name */
    public r45.o13 f391366s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f391367t;

    /* renamed from: u, reason: collision with root package name */
    public r45.q74 f391368u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yt5)) {
            return false;
        }
        r45.yt5 yt5Var = (r45.yt5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391354d), java.lang.Integer.valueOf(yt5Var.f391354d)) && n51.f.a(this.f391355e, yt5Var.f391355e) && n51.f.a(this.f391356f, yt5Var.f391356f) && n51.f.a(this.f391357g, yt5Var.f391357g) && n51.f.a(java.lang.Integer.valueOf(this.f391358h), java.lang.Integer.valueOf(yt5Var.f391358h)) && n51.f.a(java.lang.Boolean.valueOf(this.f391359i), java.lang.Boolean.valueOf(yt5Var.f391359i)) && n51.f.a(this.f391360m, yt5Var.f391360m) && n51.f.a(this.f391361n, yt5Var.f391361n) && n51.f.a(this.f391362o, yt5Var.f391362o) && n51.f.a(this.f391363p, yt5Var.f391363p) && n51.f.a(this.f391364q, yt5Var.f391364q) && n51.f.a(this.f391365r, yt5Var.f391365r) && n51.f.a(this.f391366s, yt5Var.f391366s) && n51.f.a(this.f391367t, yt5Var.f391367t) && n51.f.a(this.f391368u, yt5Var.f391368u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391360m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391354d);
            java.lang.String str = this.f391355e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.nm6 nm6Var = this.f391356f;
            if (nm6Var != null) {
                fVar.i(3, nm6Var.computeSize());
                this.f391356f.writeFields(fVar);
            }
            r45.me0 me0Var = this.f391357g;
            if (me0Var != null) {
                fVar.i(4, me0Var.computeSize());
                this.f391357g.writeFields(fVar);
            }
            fVar.e(5, this.f391358h);
            fVar.a(6, this.f391359i);
            fVar.g(7, 8, linkedList);
            r45.ra0 ra0Var = this.f391361n;
            if (ra0Var != null) {
                fVar.i(8, ra0Var.computeSize());
                this.f391361n.writeFields(fVar);
            }
            r45.v1 v1Var = this.f391362o;
            if (v1Var != null) {
                fVar.i(9, v1Var.computeSize());
                this.f391362o.writeFields(fVar);
            }
            r45.ms5 ms5Var = this.f391363p;
            if (ms5Var != null) {
                fVar.i(10, ms5Var.computeSize());
                this.f391363p.writeFields(fVar);
            }
            r45.mv3 mv3Var = this.f391364q;
            if (mv3Var != null) {
                fVar.i(11, mv3Var.computeSize());
                this.f391364q.writeFields(fVar);
            }
            r45.e90 e90Var = this.f391365r;
            if (e90Var != null) {
                fVar.i(12, e90Var.computeSize());
                this.f391365r.writeFields(fVar);
            }
            r45.o13 o13Var = this.f391366s;
            if (o13Var != null) {
                fVar.i(13, o13Var.computeSize());
                this.f391366s.writeFields(fVar);
            }
            java.lang.String str2 = this.f391367t;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            r45.q74 q74Var = this.f391368u;
            if (q74Var != null) {
                fVar.i(15, q74Var.computeSize());
                this.f391368u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391354d) + 0;
            java.lang.String str3 = this.f391355e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.nm6 nm6Var2 = this.f391356f;
            if (nm6Var2 != null) {
                e17 += b36.f.i(3, nm6Var2.computeSize());
            }
            r45.me0 me0Var2 = this.f391357g;
            if (me0Var2 != null) {
                e17 += b36.f.i(4, me0Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f391358h) + b36.f.a(6, this.f391359i) + b36.f.g(7, 8, linkedList);
            r45.ra0 ra0Var2 = this.f391361n;
            if (ra0Var2 != null) {
                e18 += b36.f.i(8, ra0Var2.computeSize());
            }
            r45.v1 v1Var2 = this.f391362o;
            if (v1Var2 != null) {
                e18 += b36.f.i(9, v1Var2.computeSize());
            }
            r45.ms5 ms5Var2 = this.f391363p;
            if (ms5Var2 != null) {
                e18 += b36.f.i(10, ms5Var2.computeSize());
            }
            r45.mv3 mv3Var2 = this.f391364q;
            if (mv3Var2 != null) {
                e18 += b36.f.i(11, mv3Var2.computeSize());
            }
            r45.e90 e90Var2 = this.f391365r;
            if (e90Var2 != null) {
                e18 += b36.f.i(12, e90Var2.computeSize());
            }
            r45.o13 o13Var2 = this.f391366s;
            if (o13Var2 != null) {
                e18 += b36.f.i(13, o13Var2.computeSize());
            }
            java.lang.String str4 = this.f391367t;
            if (str4 != null) {
                e18 += b36.f.j(14, str4);
            }
            r45.q74 q74Var2 = this.f391368u;
            return q74Var2 != null ? e18 + b36.f.i(15, q74Var2.computeSize()) : e18;
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
        r45.yt5 yt5Var = (r45.yt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yt5Var.f391354d = aVar2.g(intValue);
                return 0;
            case 2:
                yt5Var.f391355e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nm6 nm6Var3 = new r45.nm6();
                    if (bArr2 != null && bArr2.length > 0) {
                        nm6Var3.parseFrom(bArr2);
                    }
                    yt5Var.f391356f = nm6Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.me0 me0Var3 = new r45.me0();
                    if (bArr3 != null && bArr3.length > 0) {
                        me0Var3.parseFrom(bArr3);
                    }
                    yt5Var.f391357g = me0Var3;
                }
                return 0;
            case 5:
                yt5Var.f391358h = aVar2.g(intValue);
                return 0;
            case 6:
                yt5Var.f391359i = aVar2.c(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.ne0 ne0Var = new r45.ne0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ne0Var.parseFrom(bArr4);
                    }
                    yt5Var.f391360m.add(ne0Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ra0 ra0Var3 = new r45.ra0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ra0Var3.parseFrom(bArr5);
                    }
                    yt5Var.f391361n = ra0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.v1 v1Var3 = new r45.v1();
                    if (bArr6 != null && bArr6.length > 0) {
                        v1Var3.parseFrom(bArr6);
                    }
                    yt5Var.f391362o = v1Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.ms5 ms5Var3 = new r45.ms5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ms5Var3.parseFrom(bArr7);
                    }
                    yt5Var.f391363p = ms5Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.mv3 mv3Var3 = new r45.mv3();
                    if (bArr8 != null && bArr8.length > 0) {
                        mv3Var3.parseFrom(bArr8);
                    }
                    yt5Var.f391364q = mv3Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.e90 e90Var3 = new r45.e90();
                    if (bArr9 != null && bArr9.length > 0) {
                        e90Var3.parseFrom(bArr9);
                    }
                    yt5Var.f391365r = e90Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.o13 o13Var3 = new r45.o13();
                    if (bArr10 != null && bArr10.length > 0) {
                        o13Var3.parseFrom(bArr10);
                    }
                    yt5Var.f391366s = o13Var3;
                }
                return 0;
            case 14:
                yt5Var.f391367t = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.q74 q74Var3 = new r45.q74();
                    if (bArr11 != null && bArr11.length > 0) {
                        q74Var3.parseFrom(bArr11);
                    }
                    yt5Var.f391368u = q74Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
