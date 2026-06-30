package r45;

/* loaded from: classes11.dex */
public class hk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376221d;

    /* renamed from: e, reason: collision with root package name */
    public int f376222e;

    /* renamed from: f, reason: collision with root package name */
    public int f376223f;

    /* renamed from: g, reason: collision with root package name */
    public int f376224g;

    /* renamed from: h, reason: collision with root package name */
    public int f376225h;

    /* renamed from: i, reason: collision with root package name */
    public long f376226i;

    /* renamed from: m, reason: collision with root package name */
    public long f376227m;

    /* renamed from: n, reason: collision with root package name */
    public int f376228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376229o;

    /* renamed from: p, reason: collision with root package name */
    public int f376230p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f376231q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ud f376232r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f376233s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ry f376234t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f376236v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f376238x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f376239y;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f376235u = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f376237w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hk)) {
            return false;
        }
        r45.hk hkVar = (r45.hk) fVar;
        return n51.f.a(this.f376221d, hkVar.f376221d) && n51.f.a(java.lang.Integer.valueOf(this.f376222e), java.lang.Integer.valueOf(hkVar.f376222e)) && n51.f.a(java.lang.Integer.valueOf(this.f376223f), java.lang.Integer.valueOf(hkVar.f376223f)) && n51.f.a(java.lang.Integer.valueOf(this.f376224g), java.lang.Integer.valueOf(hkVar.f376224g)) && n51.f.a(java.lang.Integer.valueOf(this.f376225h), java.lang.Integer.valueOf(hkVar.f376225h)) && n51.f.a(java.lang.Long.valueOf(this.f376226i), java.lang.Long.valueOf(hkVar.f376226i)) && n51.f.a(java.lang.Long.valueOf(this.f376227m), java.lang.Long.valueOf(hkVar.f376227m)) && n51.f.a(java.lang.Integer.valueOf(this.f376228n), java.lang.Integer.valueOf(hkVar.f376228n)) && n51.f.a(java.lang.Boolean.valueOf(this.f376229o), java.lang.Boolean.valueOf(hkVar.f376229o)) && n51.f.a(java.lang.Integer.valueOf(this.f376230p), java.lang.Integer.valueOf(hkVar.f376230p)) && n51.f.a(java.lang.Boolean.valueOf(this.f376231q), java.lang.Boolean.valueOf(hkVar.f376231q)) && n51.f.a(this.f376232r, hkVar.f376232r) && n51.f.a(java.lang.Boolean.valueOf(this.f376233s), java.lang.Boolean.valueOf(hkVar.f376233s)) && n51.f.a(this.f376234t, hkVar.f376234t) && n51.f.a(this.f376235u, hkVar.f376235u) && n51.f.a(java.lang.Boolean.valueOf(this.f376236v), java.lang.Boolean.valueOf(hkVar.f376236v)) && n51.f.a(this.f376237w, hkVar.f376237w) && n51.f.a(this.f376238x, hkVar.f376238x) && n51.f.a(this.f376239y, hkVar.f376239y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376237w;
        java.util.LinkedList linkedList2 = this.f376235u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376221d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376222e);
            fVar.e(3, this.f376223f);
            fVar.e(4, this.f376224g);
            fVar.e(5, this.f376225h);
            fVar.h(6, this.f376226i);
            fVar.h(7, this.f376227m);
            fVar.e(8, this.f376228n);
            fVar.a(9, this.f376229o);
            fVar.e(10, this.f376230p);
            fVar.a(11, this.f376231q);
            r45.ud udVar = this.f376232r;
            if (udVar != null) {
                fVar.i(12, udVar.computeSize());
                this.f376232r.writeFields(fVar);
            }
            fVar.a(13, this.f376233s);
            r45.ry ryVar = this.f376234t;
            if (ryVar != null) {
                fVar.i(14, ryVar.computeSize());
                this.f376234t.writeFields(fVar);
            }
            fVar.g(15, 8, linkedList2);
            fVar.a(16, this.f376236v);
            fVar.g(17, 1, linkedList);
            java.lang.String str2 = this.f376238x;
            if (str2 != null) {
                fVar.j(18, str2);
            }
            java.lang.String str3 = this.f376239y;
            if (str3 != null) {
                fVar.j(19, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376221d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f376222e) + b36.f.e(3, this.f376223f) + b36.f.e(4, this.f376224g) + b36.f.e(5, this.f376225h) + b36.f.h(6, this.f376226i) + b36.f.h(7, this.f376227m) + b36.f.e(8, this.f376228n) + b36.f.a(9, this.f376229o) + b36.f.e(10, this.f376230p) + b36.f.a(11, this.f376231q);
            r45.ud udVar2 = this.f376232r;
            if (udVar2 != null) {
                j17 += b36.f.i(12, udVar2.computeSize());
            }
            int a17 = j17 + b36.f.a(13, this.f376233s);
            r45.ry ryVar2 = this.f376234t;
            if (ryVar2 != null) {
                a17 += b36.f.i(14, ryVar2.computeSize());
            }
            int g17 = a17 + b36.f.g(15, 8, linkedList2) + b36.f.a(16, this.f376236v) + b36.f.g(17, 1, linkedList);
            java.lang.String str5 = this.f376238x;
            if (str5 != null) {
                g17 += b36.f.j(18, str5);
            }
            java.lang.String str6 = this.f376239y;
            return str6 != null ? g17 + b36.f.j(19, str6) : g17;
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
        r45.hk hkVar = (r45.hk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hkVar.f376221d = aVar2.k(intValue);
                return 0;
            case 2:
                hkVar.f376222e = aVar2.g(intValue);
                return 0;
            case 3:
                hkVar.f376223f = aVar2.g(intValue);
                return 0;
            case 4:
                hkVar.f376224g = aVar2.g(intValue);
                return 0;
            case 5:
                hkVar.f376225h = aVar2.g(intValue);
                return 0;
            case 6:
                hkVar.f376226i = aVar2.i(intValue);
                return 0;
            case 7:
                hkVar.f376227m = aVar2.i(intValue);
                return 0;
            case 8:
                hkVar.f376228n = aVar2.g(intValue);
                return 0;
            case 9:
                hkVar.f376229o = aVar2.c(intValue);
                return 0;
            case 10:
                hkVar.f376230p = aVar2.g(intValue);
                return 0;
            case 11:
                hkVar.f376231q = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ud udVar3 = new r45.ud();
                    if (bArr2 != null && bArr2.length > 0) {
                        udVar3.parseFrom(bArr2);
                    }
                    hkVar.f376232r = udVar3;
                }
                return 0;
            case 13:
                hkVar.f376233s = aVar2.c(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.ry ryVar3 = new r45.ry();
                    if (bArr3 != null && bArr3.length > 0) {
                        ryVar3.parseFrom(bArr3);
                    }
                    hkVar.f376234t = ryVar3;
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.d67 d67Var = new r45.d67();
                    if (bArr4 != null && bArr4.length > 0) {
                        d67Var.parseFrom(bArr4);
                    }
                    hkVar.f376235u.add(d67Var);
                }
                return 0;
            case 16:
                hkVar.f376236v = aVar2.c(intValue);
                return 0;
            case 17:
                hkVar.f376237w.add(aVar2.k(intValue));
                return 0;
            case 18:
                hkVar.f376238x = aVar2.k(intValue);
                return 0;
            case 19:
                hkVar.f376239y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
