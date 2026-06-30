package r45;

/* loaded from: classes12.dex */
public class fr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374558g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374559h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374561m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jr f374562n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dr f374563o;

    /* renamed from: p, reason: collision with root package name */
    public r45.lr f374564p;

    /* renamed from: q, reason: collision with root package name */
    public r45.zq f374565q;

    /* renamed from: r, reason: collision with root package name */
    public r45.mr f374566r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ir f374567s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ar f374568t;

    /* renamed from: u, reason: collision with root package name */
    public r45.hr f374569u;

    /* renamed from: v, reason: collision with root package name */
    public r45.er f374570v;

    /* renamed from: w, reason: collision with root package name */
    public r45.gr f374571w;

    /* renamed from: x, reason: collision with root package name */
    public r45.kr f374572x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fr)) {
            return false;
        }
        r45.fr frVar = (r45.fr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374555d), java.lang.Integer.valueOf(frVar.f374555d)) && n51.f.a(this.f374556e, frVar.f374556e) && n51.f.a(this.f374557f, frVar.f374557f) && n51.f.a(this.f374558g, frVar.f374558g) && n51.f.a(this.f374559h, frVar.f374559h) && n51.f.a(this.f374560i, frVar.f374560i) && n51.f.a(this.f374561m, frVar.f374561m) && n51.f.a(this.f374562n, frVar.f374562n) && n51.f.a(this.f374563o, frVar.f374563o) && n51.f.a(this.f374564p, frVar.f374564p) && n51.f.a(this.f374565q, frVar.f374565q) && n51.f.a(this.f374566r, frVar.f374566r) && n51.f.a(this.f374567s, frVar.f374567s) && n51.f.a(this.f374568t, frVar.f374568t) && n51.f.a(this.f374569u, frVar.f374569u) && n51.f.a(this.f374570v, frVar.f374570v) && n51.f.a(this.f374571w, frVar.f374571w) && n51.f.a(this.f374572x, frVar.f374572x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374555d);
            java.lang.String str = this.f374556e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374557f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374558g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374559h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f374560i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str5 = this.f374561m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.jr jrVar = this.f374562n;
            if (jrVar != null) {
                fVar.i(101, jrVar.computeSize());
                this.f374562n.writeFields(fVar);
            }
            r45.dr drVar = this.f374563o;
            if (drVar != null) {
                fVar.i(102, drVar.computeSize());
                this.f374563o.writeFields(fVar);
            }
            r45.lr lrVar = this.f374564p;
            if (lrVar != null) {
                fVar.i(103, lrVar.computeSize());
                this.f374564p.writeFields(fVar);
            }
            r45.zq zqVar = this.f374565q;
            if (zqVar != null) {
                fVar.i(104, zqVar.computeSize());
                this.f374565q.writeFields(fVar);
            }
            r45.mr mrVar = this.f374566r;
            if (mrVar != null) {
                fVar.i(109, mrVar.computeSize());
                this.f374566r.writeFields(fVar);
            }
            r45.ir irVar = this.f374567s;
            if (irVar != null) {
                fVar.i(106, irVar.computeSize());
                this.f374567s.writeFields(fVar);
            }
            r45.ar arVar = this.f374568t;
            if (arVar != null) {
                fVar.i(107, arVar.computeSize());
                this.f374568t.writeFields(fVar);
            }
            r45.hr hrVar = this.f374569u;
            if (hrVar != null) {
                fVar.i(108, hrVar.computeSize());
                this.f374569u.writeFields(fVar);
            }
            r45.er erVar = this.f374570v;
            if (erVar != null) {
                fVar.i(110, erVar.computeSize());
                this.f374570v.writeFields(fVar);
            }
            r45.gr grVar = this.f374571w;
            if (grVar != null) {
                fVar.i(111, grVar.computeSize());
                this.f374571w.writeFields(fVar);
            }
            r45.kr krVar = this.f374572x;
            if (krVar != null) {
                fVar.i(112, krVar.computeSize());
                this.f374572x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374555d) + 0;
            java.lang.String str6 = this.f374556e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f374557f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f374558g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f374559h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374560i;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str10 = this.f374561m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.jr jrVar2 = this.f374562n;
            if (jrVar2 != null) {
                e17 += b36.f.i(101, jrVar2.computeSize());
            }
            r45.dr drVar2 = this.f374563o;
            if (drVar2 != null) {
                e17 += b36.f.i(102, drVar2.computeSize());
            }
            r45.lr lrVar2 = this.f374564p;
            if (lrVar2 != null) {
                e17 += b36.f.i(103, lrVar2.computeSize());
            }
            r45.zq zqVar2 = this.f374565q;
            if (zqVar2 != null) {
                e17 += b36.f.i(104, zqVar2.computeSize());
            }
            r45.mr mrVar2 = this.f374566r;
            if (mrVar2 != null) {
                e17 += b36.f.i(109, mrVar2.computeSize());
            }
            r45.ir irVar2 = this.f374567s;
            if (irVar2 != null) {
                e17 += b36.f.i(106, irVar2.computeSize());
            }
            r45.ar arVar2 = this.f374568t;
            if (arVar2 != null) {
                e17 += b36.f.i(107, arVar2.computeSize());
            }
            r45.hr hrVar2 = this.f374569u;
            if (hrVar2 != null) {
                e17 += b36.f.i(108, hrVar2.computeSize());
            }
            r45.er erVar2 = this.f374570v;
            if (erVar2 != null) {
                e17 += b36.f.i(110, erVar2.computeSize());
            }
            r45.gr grVar2 = this.f374571w;
            if (grVar2 != null) {
                e17 += b36.f.i(111, grVar2.computeSize());
            }
            r45.kr krVar2 = this.f374572x;
            return krVar2 != null ? e17 + b36.f.i(112, krVar2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.fr frVar = (r45.fr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                frVar.f374555d = aVar2.g(intValue);
                return 0;
            case 2:
                frVar.f374556e = aVar2.k(intValue);
                return 0;
            case 3:
                frVar.f374557f = aVar2.k(intValue);
                return 0;
            case 4:
                frVar.f374558g = aVar2.k(intValue);
                return 0;
            case 5:
                frVar.f374559h = aVar2.k(intValue);
                return 0;
            case 6:
                frVar.f374560i = aVar2.d(intValue);
                return 0;
            case 7:
                frVar.f374561m = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j17.get(i18);
                            r45.jr jrVar3 = new r45.jr();
                            if (bArr != null && bArr.length > 0) {
                                jrVar3.parseFrom(bArr);
                            }
                            frVar.f374562n = jrVar3;
                        }
                        return 0;
                    case 102:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr2 = (byte[]) j18.get(i19);
                            r45.dr drVar3 = new r45.dr();
                            if (bArr2 != null && bArr2.length > 0) {
                                drVar3.parseFrom(bArr2);
                            }
                            frVar.f374563o = drVar3;
                        }
                        return 0;
                    case 103:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i27 = 0; i27 < size3; i27++) {
                            byte[] bArr3 = (byte[]) j19.get(i27);
                            r45.lr lrVar3 = new r45.lr();
                            if (bArr3 != null && bArr3.length > 0) {
                                lrVar3.parseFrom(bArr3);
                            }
                            frVar.f374564p = lrVar3;
                        }
                        return 0;
                    case 104:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            byte[] bArr4 = (byte[]) j27.get(i28);
                            r45.zq zqVar3 = new r45.zq();
                            if (bArr4 != null && bArr4.length > 0) {
                                zqVar3.parseFrom(bArr4);
                            }
                            frVar.f374565q = zqVar3;
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 106:
                                java.util.LinkedList j28 = aVar2.j(intValue);
                                int size5 = j28.size();
                                for (int i29 = 0; i29 < size5; i29++) {
                                    byte[] bArr5 = (byte[]) j28.get(i29);
                                    r45.ir irVar3 = new r45.ir();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        irVar3.parseFrom(bArr5);
                                    }
                                    frVar.f374567s = irVar3;
                                }
                                return 0;
                            case 107:
                                java.util.LinkedList j29 = aVar2.j(intValue);
                                int size6 = j29.size();
                                for (int i37 = 0; i37 < size6; i37++) {
                                    byte[] bArr6 = (byte[]) j29.get(i37);
                                    r45.ar arVar3 = new r45.ar();
                                    if (bArr6 != null && bArr6.length > 0) {
                                        arVar3.parseFrom(bArr6);
                                    }
                                    frVar.f374568t = arVar3;
                                }
                                return 0;
                            case 108:
                                java.util.LinkedList j37 = aVar2.j(intValue);
                                int size7 = j37.size();
                                for (int i38 = 0; i38 < size7; i38++) {
                                    byte[] bArr7 = (byte[]) j37.get(i38);
                                    r45.hr hrVar3 = new r45.hr();
                                    if (bArr7 != null && bArr7.length > 0) {
                                        hrVar3.parseFrom(bArr7);
                                    }
                                    frVar.f374569u = hrVar3;
                                }
                                return 0;
                            case 109:
                                java.util.LinkedList j38 = aVar2.j(intValue);
                                int size8 = j38.size();
                                for (int i39 = 0; i39 < size8; i39++) {
                                    byte[] bArr8 = (byte[]) j38.get(i39);
                                    r45.mr mrVar3 = new r45.mr();
                                    if (bArr8 != null && bArr8.length > 0) {
                                        mrVar3.parseFrom(bArr8);
                                    }
                                    frVar.f374566r = mrVar3;
                                }
                                return 0;
                            case 110:
                                java.util.LinkedList j39 = aVar2.j(intValue);
                                int size9 = j39.size();
                                for (int i47 = 0; i47 < size9; i47++) {
                                    byte[] bArr9 = (byte[]) j39.get(i47);
                                    r45.er erVar3 = new r45.er();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        erVar3.parseFrom(bArr9);
                                    }
                                    frVar.f374570v = erVar3;
                                }
                                return 0;
                            case 111:
                                java.util.LinkedList j47 = aVar2.j(intValue);
                                int size10 = j47.size();
                                for (int i48 = 0; i48 < size10; i48++) {
                                    byte[] bArr10 = (byte[]) j47.get(i48);
                                    r45.gr grVar3 = new r45.gr();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        grVar3.parseFrom(bArr10);
                                    }
                                    frVar.f374571w = grVar3;
                                }
                                return 0;
                            case 112:
                                java.util.LinkedList j48 = aVar2.j(intValue);
                                int size11 = j48.size();
                                for (int i49 = 0; i49 < size11; i49++) {
                                    byte[] bArr11 = (byte[]) j48.get(i49);
                                    r45.kr krVar3 = new r45.kr();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        krVar3.parseFrom(bArr11);
                                    }
                                    frVar.f374572x = krVar3;
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }
}
