package r45;

/* loaded from: classes15.dex */
public class fd3 extends com.tencent.mm.protobuf.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f374222d;

    /* renamed from: e, reason: collision with root package name */
    public int f374223e;

    /* renamed from: f, reason: collision with root package name */
    public int f374224f;

    /* renamed from: g, reason: collision with root package name */
    public int f374225g;

    /* renamed from: n, reason: collision with root package name */
    public int f374229n;

    /* renamed from: o, reason: collision with root package name */
    public int f374230o;

    /* renamed from: p, reason: collision with root package name */
    public int f374231p;

    /* renamed from: q, reason: collision with root package name */
    public int f374232q;

    /* renamed from: r, reason: collision with root package name */
    public int f374233r;

    /* renamed from: s, reason: collision with root package name */
    public int f374234s;

    /* renamed from: w, reason: collision with root package name */
    public r45.gw3 f374238w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f374226h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f374227i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f374228m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f374235t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f374236u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f374237v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd3)) {
            return false;
        }
        r45.fd3 fd3Var = (r45.fd3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374222d), java.lang.Integer.valueOf(fd3Var.f374222d)) && n51.f.a(java.lang.Integer.valueOf(this.f374223e), java.lang.Integer.valueOf(fd3Var.f374223e)) && n51.f.a(java.lang.Integer.valueOf(this.f374224f), java.lang.Integer.valueOf(fd3Var.f374224f)) && n51.f.a(java.lang.Integer.valueOf(this.f374225g), java.lang.Integer.valueOf(fd3Var.f374225g)) && n51.f.a(this.f374226h, fd3Var.f374226h) && n51.f.a(this.f374227i, fd3Var.f374227i) && n51.f.a(this.f374228m, fd3Var.f374228m) && n51.f.a(java.lang.Integer.valueOf(this.f374229n), java.lang.Integer.valueOf(fd3Var.f374229n)) && n51.f.a(java.lang.Integer.valueOf(this.f374230o), java.lang.Integer.valueOf(fd3Var.f374230o)) && n51.f.a(java.lang.Integer.valueOf(this.f374231p), java.lang.Integer.valueOf(fd3Var.f374231p)) && n51.f.a(java.lang.Integer.valueOf(this.f374232q), java.lang.Integer.valueOf(fd3Var.f374232q)) && n51.f.a(java.lang.Integer.valueOf(this.f374233r), java.lang.Integer.valueOf(fd3Var.f374233r)) && n51.f.a(java.lang.Integer.valueOf(this.f374234s), java.lang.Integer.valueOf(fd3Var.f374234s)) && n51.f.a(this.f374235t, fd3Var.f374235t) && n51.f.a(this.f374236u, fd3Var.f374236u) && n51.f.a(this.f374237v, fd3Var.f374237v) && n51.f.a(this.f374238w, fd3Var.f374238w);
    }

    @Override // r45.k66
    public final int getRet() {
        return this.f374222d;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374237v;
        java.util.LinkedList linkedList2 = this.f374236u;
        java.util.LinkedList linkedList3 = this.f374235t;
        java.util.LinkedList linkedList4 = this.f374228m;
        java.util.LinkedList linkedList5 = this.f374227i;
        java.util.LinkedList linkedList6 = this.f374226h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374222d);
            fVar.e(2, this.f374223e);
            fVar.e(3, this.f374224f);
            fVar.e(4, this.f374225g);
            fVar.g(5, 8, linkedList6);
            fVar.g(6, 8, linkedList5);
            fVar.g(7, 8, linkedList4);
            fVar.e(8, this.f374229n);
            fVar.e(9, this.f374230o);
            fVar.e(10, this.f374231p);
            fVar.e(11, this.f374232q);
            fVar.e(12, this.f374233r);
            fVar.e(13, this.f374234s);
            fVar.g(14, 8, linkedList3);
            fVar.g(15, 8, linkedList2);
            fVar.g(16, 8, linkedList);
            r45.gw3 gw3Var = this.f374238w;
            if (gw3Var != null) {
                fVar.i(17, gw3Var.computeSize());
                this.f374238w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374222d) + 0 + b36.f.e(2, this.f374223e) + b36.f.e(3, this.f374224f) + b36.f.e(4, this.f374225g) + b36.f.g(5, 8, linkedList6) + b36.f.g(6, 8, linkedList5) + b36.f.g(7, 8, linkedList4) + b36.f.e(8, this.f374229n) + b36.f.e(9, this.f374230o) + b36.f.e(10, this.f374231p) + b36.f.e(11, this.f374232q) + b36.f.e(12, this.f374233r) + b36.f.e(13, this.f374234s) + b36.f.g(14, 8, linkedList3) + b36.f.g(15, 8, linkedList2) + b36.f.g(16, 8, linkedList);
            r45.gw3 gw3Var2 = this.f374238w;
            return gw3Var2 != null ? e17 + b36.f.i(17, gw3Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.fd3 fd3Var = (r45.fd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fd3Var.f374222d = aVar2.g(intValue);
                return 0;
            case 2:
                fd3Var.f374223e = aVar2.g(intValue);
                return 0;
            case 3:
                fd3Var.f374224f = aVar2.g(intValue);
                return 0;
            case 4:
                fd3Var.f374225g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nf6 nf6Var = new r45.nf6();
                    if (bArr2 != null && bArr2.length > 0) {
                        nf6Var.parseFrom(bArr2);
                    }
                    fd3Var.f374226h.add(nf6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nf6 nf6Var2 = new r45.nf6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf6Var2.parseFrom(bArr3);
                    }
                    fd3Var.f374227i.add(nf6Var2);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.nf6 nf6Var3 = new r45.nf6();
                    if (bArr4 != null && bArr4.length > 0) {
                        nf6Var3.parseFrom(bArr4);
                    }
                    fd3Var.f374228m.add(nf6Var3);
                }
                return 0;
            case 8:
                fd3Var.f374229n = aVar2.g(intValue);
                return 0;
            case 9:
                fd3Var.f374230o = aVar2.g(intValue);
                return 0;
            case 10:
                fd3Var.f374231p = aVar2.g(intValue);
                return 0;
            case 11:
                fd3Var.f374232q = aVar2.g(intValue);
                return 0;
            case 12:
                fd3Var.f374233r = aVar2.g(intValue);
                return 0;
            case 13:
                fd3Var.f374234s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.nf6 nf6Var4 = new r45.nf6();
                    if (bArr5 != null && bArr5.length > 0) {
                        nf6Var4.parseFrom(bArr5);
                    }
                    fd3Var.f374235t.add(nf6Var4);
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.nf6 nf6Var5 = new r45.nf6();
                    if (bArr6 != null && bArr6.length > 0) {
                        nf6Var5.parseFrom(bArr6);
                    }
                    fd3Var.f374236u.add(nf6Var5);
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.nf6 nf6Var6 = new r45.nf6();
                    if (bArr7 != null && bArr7.length > 0) {
                        nf6Var6.parseFrom(bArr7);
                    }
                    fd3Var.f374237v.add(nf6Var6);
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.gw3 gw3Var3 = new r45.gw3();
                    if (bArr8 != null && bArr8.length > 0) {
                        gw3Var3.parseFrom(bArr8);
                    }
                    fd3Var.f374238w = gw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
