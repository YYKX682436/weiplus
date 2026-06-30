package xq3;

/* loaded from: classes15.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456059d;

    /* renamed from: f, reason: collision with root package name */
    public int f456061f;

    /* renamed from: g, reason: collision with root package name */
    public int f456062g;

    /* renamed from: h, reason: collision with root package name */
    public int f456063h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456065m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456066n;

    /* renamed from: r, reason: collision with root package name */
    public int f456070r;

    /* renamed from: s, reason: collision with root package name */
    public int f456071s;

    /* renamed from: u, reason: collision with root package name */
    public int f456073u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f456075w;

    /* renamed from: x, reason: collision with root package name */
    public xq3.k f456076x;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f456060e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f456064i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f456067o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f456068p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f456069q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f456072t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f456074v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.c)) {
            return false;
        }
        xq3.c cVar = (xq3.c) fVar;
        return n51.f.a(this.f456059d, cVar.f456059d) && n51.f.a(this.f456060e, cVar.f456060e) && n51.f.a(java.lang.Integer.valueOf(this.f456061f), java.lang.Integer.valueOf(cVar.f456061f)) && n51.f.a(java.lang.Integer.valueOf(this.f456062g), java.lang.Integer.valueOf(cVar.f456062g)) && n51.f.a(java.lang.Integer.valueOf(this.f456063h), java.lang.Integer.valueOf(cVar.f456063h)) && n51.f.a(this.f456064i, cVar.f456064i) && n51.f.a(this.f456065m, cVar.f456065m) && n51.f.a(this.f456066n, cVar.f456066n) && n51.f.a(this.f456067o, cVar.f456067o) && n51.f.a(this.f456068p, cVar.f456068p) && n51.f.a(this.f456069q, cVar.f456069q) && n51.f.a(java.lang.Integer.valueOf(this.f456070r), java.lang.Integer.valueOf(cVar.f456070r)) && n51.f.a(java.lang.Integer.valueOf(this.f456071s), java.lang.Integer.valueOf(cVar.f456071s)) && n51.f.a(this.f456072t, cVar.f456072t) && n51.f.a(java.lang.Integer.valueOf(this.f456073u), java.lang.Integer.valueOf(cVar.f456073u)) && n51.f.a(this.f456074v, cVar.f456074v) && n51.f.a(this.f456075w, cVar.f456075w) && n51.f.a(this.f456076x, cVar.f456076x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456069q;
        java.util.LinkedList linkedList2 = this.f456068p;
        java.util.LinkedList linkedList3 = this.f456067o;
        java.util.LinkedList linkedList4 = this.f456060e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456059d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList4);
            fVar.e(3, this.f456061f);
            fVar.e(4, this.f456062g);
            fVar.e(5, this.f456063h);
            fVar.g(6, 1, this.f456064i);
            java.lang.String str2 = this.f456065m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f456066n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.g(9, 1, linkedList3);
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            fVar.e(12, this.f456070r);
            fVar.e(13, this.f456071s);
            fVar.g(14, 8, this.f456072t);
            fVar.e(15, this.f456073u);
            fVar.g(16, 8, this.f456074v);
            java.lang.String str4 = this.f456075w;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            xq3.k kVar = this.f456076x;
            if (kVar != null) {
                fVar.i(18, kVar.computeSize());
                this.f456076x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f456059d;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.g(2, 8, linkedList4) + b36.f.e(3, this.f456061f) + b36.f.e(4, this.f456062g) + b36.f.e(5, this.f456063h) + b36.f.g(6, 1, this.f456064i);
            java.lang.String str6 = this.f456065m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f456066n;
            if (str7 != null) {
                j17 += b36.f.j(8, str7);
            }
            int g17 = j17 + b36.f.g(9, 1, linkedList3) + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList) + b36.f.e(12, this.f456070r) + b36.f.e(13, this.f456071s) + b36.f.g(14, 8, this.f456072t) + b36.f.e(15, this.f456073u) + b36.f.g(16, 8, this.f456074v);
            java.lang.String str8 = this.f456075w;
            if (str8 != null) {
                g17 += b36.f.j(17, str8);
            }
            xq3.k kVar2 = this.f456076x;
            return kVar2 != null ? g17 + b36.f.i(18, kVar2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            this.f456064i.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f456072t.clear();
            this.f456074v.clear();
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
        xq3.c cVar = (xq3.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f456059d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    xq3.d dVar = new xq3.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.parseFrom(bArr2);
                    }
                    cVar.f456060e.add(dVar);
                }
                return 0;
            case 3:
                cVar.f456061f = aVar2.g(intValue);
                return 0;
            case 4:
                cVar.f456062g = aVar2.g(intValue);
                return 0;
            case 5:
                cVar.f456063h = aVar2.g(intValue);
                return 0;
            case 6:
                cVar.f456064i.add(aVar2.k(intValue));
                return 0;
            case 7:
                cVar.f456065m = aVar2.k(intValue);
                return 0;
            case 8:
                cVar.f456066n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f456067o.add(aVar2.k(intValue));
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    xq3.b bVar = new xq3.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.parseFrom(bArr3);
                    }
                    cVar.f456068p.add(bVar);
                }
                return 0;
            case 11:
                cVar.f456069q.add(aVar2.k(intValue));
                return 0;
            case 12:
                cVar.f456070r = aVar2.g(intValue);
                return 0;
            case 13:
                cVar.f456071s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    xq3.m mVar = new xq3.m();
                    if (bArr4 != null && bArr4.length > 0) {
                        mVar.parseFrom(bArr4);
                    }
                    cVar.f456072t.add(mVar);
                }
                return 0;
            case 15:
                cVar.f456073u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    xq3.a aVar3 = new xq3.a();
                    if (bArr5 != null && bArr5.length > 0) {
                        aVar3.parseFrom(bArr5);
                    }
                    cVar.f456074v.add(aVar3);
                }
                return 0;
            case 17:
                cVar.f456075w = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    xq3.k kVar3 = new xq3.k();
                    if (bArr6 != null && bArr6.length > 0) {
                        kVar3.parseFrom(bArr6);
                    }
                    cVar.f456076x = kVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
