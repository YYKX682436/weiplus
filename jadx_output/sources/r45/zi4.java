package r45;

/* loaded from: classes2.dex */
public class zi4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f392094d;

    /* renamed from: e, reason: collision with root package name */
    public long f392095e;

    /* renamed from: f, reason: collision with root package name */
    public long f392096f;

    /* renamed from: g, reason: collision with root package name */
    public long f392097g;

    /* renamed from: h, reason: collision with root package name */
    public long f392098h;

    /* renamed from: i, reason: collision with root package name */
    public long f392099i;

    /* renamed from: m, reason: collision with root package name */
    public long f392100m;

    /* renamed from: o, reason: collision with root package name */
    public long f392102o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f392103p;

    /* renamed from: q, reason: collision with root package name */
    public double f392104q;

    /* renamed from: t, reason: collision with root package name */
    public r45.vo6 f392107t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392108u;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f392101n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f392105r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f392106s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi4)) {
            return false;
        }
        r45.zi4 zi4Var = (r45.zi4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f392094d), java.lang.Long.valueOf(zi4Var.f392094d)) && n51.f.a(java.lang.Long.valueOf(this.f392095e), java.lang.Long.valueOf(zi4Var.f392095e)) && n51.f.a(java.lang.Long.valueOf(this.f392096f), java.lang.Long.valueOf(zi4Var.f392096f)) && n51.f.a(java.lang.Long.valueOf(this.f392097g), java.lang.Long.valueOf(zi4Var.f392097g)) && n51.f.a(java.lang.Long.valueOf(this.f392098h), java.lang.Long.valueOf(zi4Var.f392098h)) && n51.f.a(java.lang.Long.valueOf(this.f392099i), java.lang.Long.valueOf(zi4Var.f392099i)) && n51.f.a(java.lang.Long.valueOf(this.f392100m), java.lang.Long.valueOf(zi4Var.f392100m)) && n51.f.a(this.f392101n, zi4Var.f392101n) && n51.f.a(java.lang.Long.valueOf(this.f392102o), java.lang.Long.valueOf(zi4Var.f392102o)) && n51.f.a(java.lang.Boolean.valueOf(this.f392103p), java.lang.Boolean.valueOf(zi4Var.f392103p)) && n51.f.a(java.lang.Double.valueOf(this.f392104q), java.lang.Double.valueOf(zi4Var.f392104q)) && n51.f.a(this.f392105r, zi4Var.f392105r) && n51.f.a(this.f392106s, zi4Var.f392106s) && n51.f.a(this.f392107t, zi4Var.f392107t) && n51.f.a(this.f392108u, zi4Var.f392108u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392106s;
        java.util.LinkedList linkedList2 = this.f392105r;
        java.util.LinkedList linkedList3 = this.f392101n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f392094d);
            fVar.h(2, this.f392095e);
            fVar.h(3, this.f392096f);
            fVar.h(4, this.f392097g);
            fVar.h(5, this.f392098h);
            fVar.h(6, this.f392099i);
            fVar.h(7, this.f392100m);
            fVar.g(8, 8, linkedList3);
            fVar.h(9, this.f392102o);
            fVar.a(10, this.f392103p);
            fVar.c(11, this.f392104q);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            r45.vo6 vo6Var = this.f392107t;
            if (vo6Var != null) {
                fVar.i(14, vo6Var.computeSize());
                this.f392107t.writeFields(fVar);
            }
            java.lang.String str = this.f392108u;
            if (str != null) {
                fVar.j(15, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f392094d) + 0 + b36.f.h(2, this.f392095e) + b36.f.h(3, this.f392096f) + b36.f.h(4, this.f392097g) + b36.f.h(5, this.f392098h) + b36.f.h(6, this.f392099i) + b36.f.h(7, this.f392100m) + b36.f.g(8, 8, linkedList3) + b36.f.h(9, this.f392102o) + b36.f.a(10, this.f392103p) + b36.f.c(11, this.f392104q) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            r45.vo6 vo6Var2 = this.f392107t;
            if (vo6Var2 != null) {
                h17 += b36.f.i(14, vo6Var2.computeSize());
            }
            java.lang.String str2 = this.f392108u;
            return str2 != null ? h17 + b36.f.j(15, str2) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.zi4 zi4Var = (r45.zi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zi4Var.f392094d = aVar2.i(intValue);
                return 0;
            case 2:
                zi4Var.f392095e = aVar2.i(intValue);
                return 0;
            case 3:
                zi4Var.f392096f = aVar2.i(intValue);
                return 0;
            case 4:
                zi4Var.f392097g = aVar2.i(intValue);
                return 0;
            case 5:
                zi4Var.f392098h = aVar2.i(intValue);
                return 0;
            case 6:
                zi4Var.f392099i = aVar2.i(intValue);
                return 0;
            case 7:
                zi4Var.f392100m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.db7 db7Var = new r45.db7();
                    if (bArr2 != null && bArr2.length > 0) {
                        db7Var.parseFrom(bArr2);
                    }
                    zi4Var.f392101n.add(db7Var);
                }
                return 0;
            case 9:
                zi4Var.f392102o = aVar2.i(intValue);
                return 0;
            case 10:
                zi4Var.f392103p = aVar2.c(intValue);
                return 0;
            case 11:
                zi4Var.f392104q = aVar2.e(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.db7 db7Var2 = new r45.db7();
                    if (bArr3 != null && bArr3.length > 0) {
                        db7Var2.parseFrom(bArr3);
                    }
                    zi4Var.f392105r.add(db7Var2);
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.xp6 xp6Var = new r45.xp6();
                    if (bArr4 != null && bArr4.length > 0) {
                        xp6Var.parseFrom(bArr4);
                    }
                    zi4Var.f392106s.add(xp6Var);
                }
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.vo6 vo6Var3 = new r45.vo6();
                    if (bArr5 != null && bArr5.length > 0) {
                        vo6Var3.parseFrom(bArr5);
                    }
                    zi4Var.f392107t = vo6Var3;
                }
                return 0;
            case 15:
                zi4Var.f392108u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
