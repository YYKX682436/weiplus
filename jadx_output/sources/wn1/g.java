package wn1;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447419d;

    /* renamed from: e, reason: collision with root package name */
    public wn1.k f447420e;

    /* renamed from: f, reason: collision with root package name */
    public int f447421f;

    /* renamed from: g, reason: collision with root package name */
    public int f447422g;

    /* renamed from: h, reason: collision with root package name */
    public int f447423h;

    /* renamed from: i, reason: collision with root package name */
    public int f447424i;

    /* renamed from: m, reason: collision with root package name */
    public int f447425m;

    /* renamed from: n, reason: collision with root package name */
    public int f447426n;

    /* renamed from: o, reason: collision with root package name */
    public int f447427o;

    /* renamed from: p, reason: collision with root package name */
    public int f447428p;

    /* renamed from: q, reason: collision with root package name */
    public int f447429q;

    /* renamed from: r, reason: collision with root package name */
    public wn1.a f447430r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.g)) {
            return false;
        }
        wn1.g gVar = (wn1.g) fVar;
        return n51.f.a(this.f447419d, gVar.f447419d) && n51.f.a(this.f447420e, gVar.f447420e) && n51.f.a(java.lang.Integer.valueOf(this.f447421f), java.lang.Integer.valueOf(gVar.f447421f)) && n51.f.a(java.lang.Integer.valueOf(this.f447422g), java.lang.Integer.valueOf(gVar.f447422g)) && n51.f.a(java.lang.Integer.valueOf(this.f447423h), java.lang.Integer.valueOf(gVar.f447423h)) && n51.f.a(java.lang.Integer.valueOf(this.f447424i), java.lang.Integer.valueOf(gVar.f447424i)) && n51.f.a(java.lang.Integer.valueOf(this.f447425m), java.lang.Integer.valueOf(gVar.f447425m)) && n51.f.a(java.lang.Integer.valueOf(this.f447426n), java.lang.Integer.valueOf(gVar.f447426n)) && n51.f.a(java.lang.Integer.valueOf(this.f447427o), java.lang.Integer.valueOf(gVar.f447427o)) && n51.f.a(java.lang.Integer.valueOf(this.f447428p), java.lang.Integer.valueOf(gVar.f447428p)) && n51.f.a(java.lang.Integer.valueOf(this.f447429q), java.lang.Integer.valueOf(gVar.f447429q)) && n51.f.a(this.f447430r, gVar.f447430r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447419d;
            if (str != null) {
                fVar.j(1, str);
            }
            wn1.k kVar = this.f447420e;
            if (kVar != null) {
                fVar.i(2, kVar.computeSize());
                this.f447420e.writeFields(fVar);
            }
            fVar.e(3, this.f447421f);
            fVar.e(4, this.f447422g);
            fVar.e(5, this.f447423h);
            fVar.e(6, this.f447424i);
            fVar.e(7, this.f447425m);
            fVar.e(8, this.f447426n);
            fVar.e(9, this.f447427o);
            fVar.e(10, this.f447428p);
            fVar.e(11, this.f447429q);
            wn1.a aVar = this.f447430r;
            if (aVar != null) {
                fVar.i(12, aVar.computeSize());
                this.f447430r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f447419d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            wn1.k kVar2 = this.f447420e;
            if (kVar2 != null) {
                j17 += b36.f.i(2, kVar2.computeSize());
            }
            int e17 = j17 + b36.f.e(3, this.f447421f) + b36.f.e(4, this.f447422g) + b36.f.e(5, this.f447423h) + b36.f.e(6, this.f447424i) + b36.f.e(7, this.f447425m) + b36.f.e(8, this.f447426n) + b36.f.e(9, this.f447427o) + b36.f.e(10, this.f447428p) + b36.f.e(11, this.f447429q);
            wn1.a aVar2 = this.f447430r;
            return aVar2 != null ? e17 + b36.f.i(12, aVar2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        wn1.g gVar = (wn1.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gVar.f447419d = aVar4.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.k kVar3 = new wn1.k();
                    if (bArr != null && bArr.length > 0) {
                        kVar3.parseFrom(bArr);
                    }
                    gVar.f447420e = kVar3;
                }
                return 0;
            case 3:
                gVar.f447421f = aVar4.g(intValue);
                return 0;
            case 4:
                gVar.f447422g = aVar4.g(intValue);
                return 0;
            case 5:
                gVar.f447423h = aVar4.g(intValue);
                return 0;
            case 6:
                gVar.f447424i = aVar4.g(intValue);
                return 0;
            case 7:
                gVar.f447425m = aVar4.g(intValue);
                return 0;
            case 8:
                gVar.f447426n = aVar4.g(intValue);
                return 0;
            case 9:
                gVar.f447427o = aVar4.g(intValue);
                return 0;
            case 10:
                gVar.f447428p = aVar4.g(intValue);
                return 0;
            case 11:
                gVar.f447429q = aVar4.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    wn1.a aVar5 = new wn1.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.parseFrom(bArr2);
                    }
                    gVar.f447430r = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
