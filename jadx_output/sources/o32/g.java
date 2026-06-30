package o32;

/* loaded from: classes9.dex */
public class g extends o32.j {

    /* renamed from: e, reason: collision with root package name */
    public int f342698e;

    /* renamed from: f, reason: collision with root package name */
    public int f342699f;

    /* renamed from: g, reason: collision with root package name */
    public int f342700g;

    /* renamed from: h, reason: collision with root package name */
    public int f342701h;

    /* renamed from: i, reason: collision with root package name */
    public int f342702i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f342703m;

    /* renamed from: n, reason: collision with root package name */
    public int f342704n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f342705o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f342706p;

    /* renamed from: q, reason: collision with root package name */
    public int f342707q;

    /* renamed from: r, reason: collision with root package name */
    public int f342708r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f342709s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.g)) {
            return false;
        }
        o32.g gVar = (o32.g) fVar;
        return n51.f.a(this.f342714d, gVar.f342714d) && n51.f.a(java.lang.Integer.valueOf(this.f342698e), java.lang.Integer.valueOf(gVar.f342698e)) && n51.f.a(java.lang.Integer.valueOf(this.f342699f), java.lang.Integer.valueOf(gVar.f342699f)) && n51.f.a(java.lang.Integer.valueOf(this.f342700g), java.lang.Integer.valueOf(gVar.f342700g)) && n51.f.a(java.lang.Integer.valueOf(this.f342701h), java.lang.Integer.valueOf(gVar.f342701h)) && n51.f.a(java.lang.Integer.valueOf(this.f342702i), java.lang.Integer.valueOf(gVar.f342702i)) && n51.f.a(this.f342703m, gVar.f342703m) && n51.f.a(java.lang.Integer.valueOf(this.f342704n), java.lang.Integer.valueOf(gVar.f342704n)) && n51.f.a(this.f342705o, gVar.f342705o) && n51.f.a(this.f342706p, gVar.f342706p) && n51.f.a(java.lang.Integer.valueOf(this.f342707q), java.lang.Integer.valueOf(gVar.f342707q)) && n51.f.a(java.lang.Integer.valueOf(this.f342708r), java.lang.Integer.valueOf(gVar.f342708r)) && n51.f.a(this.f342709s, gVar.f342709s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.e eVar = this.f342714d;
            if (eVar != null) {
                fVar.i(1, eVar.computeSize());
                this.f342714d.writeFields(fVar);
            }
            fVar.e(2, this.f342698e);
            fVar.e(3, this.f342699f);
            fVar.e(4, this.f342700g);
            fVar.e(5, this.f342701h);
            fVar.e(6, this.f342702i);
            java.lang.String str = this.f342703m;
            if (str != null) {
                fVar.j(11, str);
            }
            fVar.e(12, this.f342704n);
            java.lang.String str2 = this.f342705o;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f342706p;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            fVar.e(15, this.f342707q);
            fVar.e(16, this.f342708r);
            java.lang.String str4 = this.f342709s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(17, str4);
            return 0;
        }
        if (i17 == 1) {
            o32.e eVar2 = this.f342714d;
            int i18 = (eVar2 != null ? 0 + b36.f.i(1, eVar2.computeSize()) : 0) + b36.f.e(2, this.f342698e) + b36.f.e(3, this.f342699f) + b36.f.e(4, this.f342700g) + b36.f.e(5, this.f342701h) + b36.f.e(6, this.f342702i);
            java.lang.String str5 = this.f342703m;
            if (str5 != null) {
                i18 += b36.f.j(11, str5);
            }
            int e17 = i18 + b36.f.e(12, this.f342704n);
            java.lang.String str6 = this.f342705o;
            if (str6 != null) {
                e17 += b36.f.j(13, str6);
            }
            java.lang.String str7 = this.f342706p;
            if (str7 != null) {
                e17 += b36.f.j(14, str7);
            }
            int e18 = e17 + b36.f.e(15, this.f342707q) + b36.f.e(16, this.f342708r);
            java.lang.String str8 = this.f342709s;
            return str8 != null ? e18 + b36.f.j(17, str8) : e18;
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
        o32.g gVar = (o32.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    o32.e eVar3 = new o32.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    gVar.f342714d = eVar3;
                }
                return 0;
            case 2:
                gVar.f342698e = aVar2.g(intValue);
                return 0;
            case 3:
                gVar.f342699f = aVar2.g(intValue);
                return 0;
            case 4:
                gVar.f342700g = aVar2.g(intValue);
                return 0;
            case 5:
                gVar.f342701h = aVar2.g(intValue);
                return 0;
            case 6:
                gVar.f342702i = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                gVar.f342703m = aVar2.k(intValue);
                return 0;
            case 12:
                gVar.f342704n = aVar2.g(intValue);
                return 0;
            case 13:
                gVar.f342705o = aVar2.k(intValue);
                return 0;
            case 14:
                gVar.f342706p = aVar2.k(intValue);
                return 0;
            case 15:
                gVar.f342707q = aVar2.g(intValue);
                return 0;
            case 16:
                gVar.f342708r = aVar2.g(intValue);
                return 0;
            case 17:
                gVar.f342709s = aVar2.k(intValue);
                return 0;
        }
    }
}
