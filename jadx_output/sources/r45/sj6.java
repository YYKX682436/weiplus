package r45;

/* loaded from: classes2.dex */
public class sj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.oj6 f385786d;

    /* renamed from: e, reason: collision with root package name */
    public long f385787e;

    /* renamed from: f, reason: collision with root package name */
    public int f385788f;

    /* renamed from: g, reason: collision with root package name */
    public int f385789g;

    /* renamed from: h, reason: collision with root package name */
    public long f385790h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385791i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f385792m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385793n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pn0 f385794o;

    /* renamed from: p, reason: collision with root package name */
    public int f385795p;

    /* renamed from: q, reason: collision with root package name */
    public r45.uk5 f385796q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f385797r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385798s;

    /* renamed from: t, reason: collision with root package name */
    public int f385799t;

    /* renamed from: u, reason: collision with root package name */
    public r45.lt4 f385800u;

    /* renamed from: v, reason: collision with root package name */
    public int f385801v;

    /* renamed from: w, reason: collision with root package name */
    public r45.zl f385802w;

    /* renamed from: x, reason: collision with root package name */
    public r45.ym4 f385803x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj6)) {
            return false;
        }
        r45.sj6 sj6Var = (r45.sj6) fVar;
        return n51.f.a(this.f385786d, sj6Var.f385786d) && n51.f.a(java.lang.Long.valueOf(this.f385787e), java.lang.Long.valueOf(sj6Var.f385787e)) && n51.f.a(java.lang.Integer.valueOf(this.f385788f), java.lang.Integer.valueOf(sj6Var.f385788f)) && n51.f.a(java.lang.Integer.valueOf(this.f385789g), java.lang.Integer.valueOf(sj6Var.f385789g)) && n51.f.a(java.lang.Long.valueOf(this.f385790h), java.lang.Long.valueOf(sj6Var.f385790h)) && n51.f.a(this.f385791i, sj6Var.f385791i) && n51.f.a(java.lang.Integer.valueOf(this.f385792m), java.lang.Integer.valueOf(sj6Var.f385792m)) && n51.f.a(this.f385793n, sj6Var.f385793n) && n51.f.a(this.f385794o, sj6Var.f385794o) && n51.f.a(java.lang.Integer.valueOf(this.f385795p), java.lang.Integer.valueOf(sj6Var.f385795p)) && n51.f.a(this.f385796q, sj6Var.f385796q) && n51.f.a(this.f385797r, sj6Var.f385797r) && n51.f.a(this.f385798s, sj6Var.f385798s) && n51.f.a(java.lang.Integer.valueOf(this.f385799t), java.lang.Integer.valueOf(sj6Var.f385799t)) && n51.f.a(this.f385800u, sj6Var.f385800u) && n51.f.a(java.lang.Integer.valueOf(this.f385801v), java.lang.Integer.valueOf(sj6Var.f385801v)) && n51.f.a(this.f385802w, sj6Var.f385802w) && n51.f.a(this.f385803x, sj6Var.f385803x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385791i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.oj6 oj6Var = this.f385786d;
            if (oj6Var != null) {
                fVar.i(1, oj6Var.computeSize());
                this.f385786d.writeFields(fVar);
            }
            fVar.h(2, this.f385787e);
            fVar.e(3, this.f385788f);
            fVar.e(4, this.f385789g);
            fVar.h(5, this.f385790h);
            fVar.g(6, 1, linkedList);
            fVar.e(7, this.f385792m);
            java.lang.String str = this.f385793n;
            if (str != null) {
                fVar.j(8, str);
            }
            r45.pn0 pn0Var = this.f385794o;
            if (pn0Var != null) {
                fVar.i(9, pn0Var.computeSize());
                this.f385794o.writeFields(fVar);
            }
            fVar.e(10, this.f385795p);
            r45.uk5 uk5Var = this.f385796q;
            if (uk5Var != null) {
                fVar.i(11, uk5Var.computeSize());
                this.f385796q.writeFields(fVar);
            }
            java.lang.String str2 = this.f385797r;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f385798s;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(14, this.f385799t);
            r45.lt4 lt4Var = this.f385800u;
            if (lt4Var != null) {
                fVar.i(15, lt4Var.computeSize());
                this.f385800u.writeFields(fVar);
            }
            fVar.e(16, this.f385801v);
            r45.zl zlVar = this.f385802w;
            if (zlVar != null) {
                fVar.i(17, zlVar.computeSize());
                this.f385802w.writeFields(fVar);
            }
            r45.ym4 ym4Var = this.f385803x;
            if (ym4Var != null) {
                fVar.i(18, ym4Var.computeSize());
                this.f385803x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.oj6 oj6Var2 = this.f385786d;
            int i18 = (oj6Var2 != null ? b36.f.i(1, oj6Var2.computeSize()) + 0 : 0) + b36.f.h(2, this.f385787e) + b36.f.e(3, this.f385788f) + b36.f.e(4, this.f385789g) + b36.f.h(5, this.f385790h) + b36.f.g(6, 1, linkedList) + b36.f.e(7, this.f385792m);
            java.lang.String str4 = this.f385793n;
            if (str4 != null) {
                i18 += b36.f.j(8, str4);
            }
            r45.pn0 pn0Var2 = this.f385794o;
            if (pn0Var2 != null) {
                i18 += b36.f.i(9, pn0Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(10, this.f385795p);
            r45.uk5 uk5Var2 = this.f385796q;
            if (uk5Var2 != null) {
                e17 += b36.f.i(11, uk5Var2.computeSize());
            }
            java.lang.String str5 = this.f385797r;
            if (str5 != null) {
                e17 += b36.f.j(12, str5);
            }
            java.lang.String str6 = this.f385798s;
            if (str6 != null) {
                e17 += b36.f.j(13, str6);
            }
            int e18 = e17 + b36.f.e(14, this.f385799t);
            r45.lt4 lt4Var2 = this.f385800u;
            if (lt4Var2 != null) {
                e18 += b36.f.i(15, lt4Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(16, this.f385801v);
            r45.zl zlVar2 = this.f385802w;
            if (zlVar2 != null) {
                e19 += b36.f.i(17, zlVar2.computeSize());
            }
            r45.ym4 ym4Var2 = this.f385803x;
            return ym4Var2 != null ? e19 + b36.f.i(18, ym4Var2.computeSize()) : e19;
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
        r45.sj6 sj6Var = (r45.sj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.oj6 oj6Var3 = new r45.oj6();
                    if (bArr2 != null && bArr2.length > 0) {
                        oj6Var3.parseFrom(bArr2);
                    }
                    sj6Var.f385786d = oj6Var3;
                }
                return 0;
            case 2:
                sj6Var.f385787e = aVar2.i(intValue);
                return 0;
            case 3:
                sj6Var.f385788f = aVar2.g(intValue);
                return 0;
            case 4:
                sj6Var.f385789g = aVar2.g(intValue);
                return 0;
            case 5:
                sj6Var.f385790h = aVar2.i(intValue);
                return 0;
            case 6:
                sj6Var.f385791i.add(aVar2.k(intValue));
                return 0;
            case 7:
                sj6Var.f385792m = aVar2.g(intValue);
                return 0;
            case 8:
                sj6Var.f385793n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.pn0 pn0Var3 = new r45.pn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        pn0Var3.parseFrom(bArr3);
                    }
                    sj6Var.f385794o = pn0Var3;
                }
                return 0;
            case 10:
                sj6Var.f385795p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.uk5 uk5Var3 = new r45.uk5();
                    if (bArr4 != null && bArr4.length > 0) {
                        uk5Var3.parseFrom(bArr4);
                    }
                    sj6Var.f385796q = uk5Var3;
                }
                return 0;
            case 12:
                sj6Var.f385797r = aVar2.k(intValue);
                return 0;
            case 13:
                sj6Var.f385798s = aVar2.k(intValue);
                return 0;
            case 14:
                sj6Var.f385799t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lt4 lt4Var3 = new r45.lt4();
                    if (bArr5 != null && bArr5.length > 0) {
                        lt4Var3.parseFrom(bArr5);
                    }
                    sj6Var.f385800u = lt4Var3;
                }
                return 0;
            case 16:
                sj6Var.f385801v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.zl zlVar3 = new r45.zl();
                    if (bArr6 != null && bArr6.length > 0) {
                        zlVar3.parseFrom(bArr6);
                    }
                    sj6Var.f385802w = zlVar3;
                }
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ym4 ym4Var3 = new r45.ym4();
                    if (bArr7 != null && bArr7.length > 0) {
                        ym4Var3.parseFrom(bArr7);
                    }
                    sj6Var.f385803x = ym4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
