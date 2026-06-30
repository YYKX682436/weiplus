package f21;

/* loaded from: classes15.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258872e;

    /* renamed from: f, reason: collision with root package name */
    public int f258873f;

    /* renamed from: g, reason: collision with root package name */
    public int f258874g;

    /* renamed from: h, reason: collision with root package name */
    public int f258875h;

    /* renamed from: i, reason: collision with root package name */
    public int f258876i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f258877m;

    /* renamed from: n, reason: collision with root package name */
    public int f258878n;

    /* renamed from: o, reason: collision with root package name */
    public f21.d0 f258879o;

    /* renamed from: q, reason: collision with root package name */
    public int f258881q;

    /* renamed from: r, reason: collision with root package name */
    public f21.d f258882r;

    /* renamed from: s, reason: collision with root package name */
    public f21.i f258883s;

    /* renamed from: t, reason: collision with root package name */
    public int f258884t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f258885u;

    /* renamed from: v, reason: collision with root package name */
    public f21.h f258886v;

    /* renamed from: w, reason: collision with root package name */
    public f21.l f258887w;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f258871d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f258880p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.e)) {
            return false;
        }
        f21.e eVar = (f21.e) fVar;
        return n51.f.a(this.f258871d, eVar.f258871d) && n51.f.a(this.f258872e, eVar.f258872e) && n51.f.a(java.lang.Integer.valueOf(this.f258873f), java.lang.Integer.valueOf(eVar.f258873f)) && n51.f.a(java.lang.Integer.valueOf(this.f258874g), java.lang.Integer.valueOf(eVar.f258874g)) && n51.f.a(java.lang.Integer.valueOf(this.f258875h), java.lang.Integer.valueOf(eVar.f258875h)) && n51.f.a(java.lang.Integer.valueOf(this.f258876i), java.lang.Integer.valueOf(eVar.f258876i)) && n51.f.a(this.f258877m, eVar.f258877m) && n51.f.a(java.lang.Integer.valueOf(this.f258878n), java.lang.Integer.valueOf(eVar.f258878n)) && n51.f.a(this.f258879o, eVar.f258879o) && n51.f.a(this.f258880p, eVar.f258880p) && n51.f.a(java.lang.Integer.valueOf(this.f258881q), java.lang.Integer.valueOf(eVar.f258881q)) && n51.f.a(this.f258882r, eVar.f258882r) && n51.f.a(this.f258883s, eVar.f258883s) && n51.f.a(java.lang.Integer.valueOf(this.f258884t), java.lang.Integer.valueOf(eVar.f258884t)) && n51.f.a(this.f258885u, eVar.f258885u) && n51.f.a(this.f258886v, eVar.f258886v) && n51.f.a(this.f258887w, eVar.f258887w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f258880p;
        java.util.LinkedList linkedList2 = this.f258871d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            java.lang.String str = this.f258872e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f258873f);
            fVar.e(4, this.f258874g);
            fVar.e(5, this.f258875h);
            fVar.e(6, this.f258876i);
            java.lang.String str2 = this.f258877m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f258878n);
            f21.d0 d0Var = this.f258879o;
            if (d0Var != null) {
                fVar.i(9, d0Var.computeSize());
                this.f258879o.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f258881q);
            f21.d dVar = this.f258882r;
            if (dVar != null) {
                fVar.i(12, dVar.computeSize());
                this.f258882r.writeFields(fVar);
            }
            f21.i iVar = this.f258883s;
            if (iVar != null) {
                fVar.i(13, iVar.computeSize());
                this.f258883s.writeFields(fVar);
            }
            fVar.e(14, this.f258884t);
            java.lang.String str3 = this.f258885u;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            f21.h hVar = this.f258886v;
            if (hVar != null) {
                fVar.i(16, hVar.computeSize());
                this.f258886v.writeFields(fVar);
            }
            f21.l lVar = this.f258887w;
            if (lVar != null) {
                fVar.i(17, lVar.computeSize());
                this.f258887w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            java.lang.String str4 = this.f258872e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            int e17 = g17 + b36.f.e(3, this.f258873f) + b36.f.e(4, this.f258874g) + b36.f.e(5, this.f258875h) + b36.f.e(6, this.f258876i);
            java.lang.String str5 = this.f258877m;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            int e18 = e17 + b36.f.e(8, this.f258878n);
            f21.d0 d0Var2 = this.f258879o;
            if (d0Var2 != null) {
                e18 += b36.f.i(9, d0Var2.computeSize());
            }
            int g18 = e18 + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f258881q);
            f21.d dVar2 = this.f258882r;
            if (dVar2 != null) {
                g18 += b36.f.i(12, dVar2.computeSize());
            }
            f21.i iVar2 = this.f258883s;
            if (iVar2 != null) {
                g18 += b36.f.i(13, iVar2.computeSize());
            }
            int e19 = g18 + b36.f.e(14, this.f258884t);
            java.lang.String str6 = this.f258885u;
            if (str6 != null) {
                e19 += b36.f.j(15, str6);
            }
            f21.h hVar2 = this.f258886v;
            if (hVar2 != null) {
                e19 += b36.f.i(16, hVar2.computeSize());
            }
            f21.l lVar2 = this.f258887w;
            return lVar2 != null ? e19 + b36.f.i(17, lVar2.computeSize()) : e19;
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
        f21.e eVar = (f21.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    f21.f fVar2 = new f21.f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar2.parseFrom(bArr2);
                    }
                    eVar.f258871d.add(fVar2);
                }
                return 0;
            case 2:
                eVar.f258872e = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f258873f = aVar2.g(intValue);
                return 0;
            case 4:
                eVar.f258874g = aVar2.g(intValue);
                return 0;
            case 5:
                eVar.f258875h = aVar2.g(intValue);
                return 0;
            case 6:
                eVar.f258876i = aVar2.g(intValue);
                return 0;
            case 7:
                eVar.f258877m = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f258878n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    f21.d0 d0Var3 = new f21.d0();
                    if (bArr3 != null && bArr3.length > 0) {
                        d0Var3.parseFrom(bArr3);
                    }
                    eVar.f258879o = d0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    f21.h0 h0Var = new f21.h0();
                    if (bArr4 != null && bArr4.length > 0) {
                        h0Var.parseFrom(bArr4);
                    }
                    eVar.f258880p.add(h0Var);
                }
                return 0;
            case 11:
                eVar.f258881q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    f21.d dVar3 = new f21.d();
                    if (bArr5 != null && bArr5.length > 0) {
                        dVar3.parseFrom(bArr5);
                    }
                    eVar.f258882r = dVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    f21.i iVar3 = new f21.i();
                    if (bArr6 != null && bArr6.length > 0) {
                        iVar3.parseFrom(bArr6);
                    }
                    eVar.f258883s = iVar3;
                }
                return 0;
            case 14:
                eVar.f258884t = aVar2.g(intValue);
                return 0;
            case 15:
                eVar.f258885u = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    f21.h hVar3 = new f21.h();
                    if (bArr7 != null && bArr7.length > 0) {
                        hVar3.parseFrom(bArr7);
                    }
                    eVar.f258886v = hVar3;
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    f21.l lVar3 = new f21.l();
                    if (bArr8 != null && bArr8.length > 0) {
                        lVar3.parseFrom(bArr8);
                    }
                    eVar.f258887w = lVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
