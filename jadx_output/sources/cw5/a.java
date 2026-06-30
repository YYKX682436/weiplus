package cw5;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f224311d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f224312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f224313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224314g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224315h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224316i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224317m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224318n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f224319o;

    /* renamed from: p, reason: collision with root package name */
    public int f224320p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f224321q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f224322r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f224323s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f224324t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f224325u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f224326v = new boolean[35];

    static {
        new cw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.a)) {
            return false;
        }
        cw5.a aVar = (cw5.a) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f224311d), java.lang.Boolean.valueOf(aVar.f224311d)) && n51.f.a(java.lang.Boolean.valueOf(this.f224312e), java.lang.Boolean.valueOf(aVar.f224312e)) && n51.f.a(java.lang.Boolean.valueOf(this.f224313f), java.lang.Boolean.valueOf(aVar.f224313f)) && n51.f.a(java.lang.Boolean.valueOf(this.f224314g), java.lang.Boolean.valueOf(aVar.f224314g)) && n51.f.a(java.lang.Boolean.valueOf(this.f224315h), java.lang.Boolean.valueOf(aVar.f224315h)) && n51.f.a(java.lang.Boolean.valueOf(this.f224316i), java.lang.Boolean.valueOf(aVar.f224316i)) && n51.f.a(java.lang.Boolean.valueOf(this.f224317m), java.lang.Boolean.valueOf(aVar.f224317m)) && n51.f.a(java.lang.Boolean.valueOf(this.f224318n), java.lang.Boolean.valueOf(aVar.f224318n)) && n51.f.a(java.lang.Boolean.valueOf(this.f224319o), java.lang.Boolean.valueOf(aVar.f224319o)) && n51.f.a(java.lang.Integer.valueOf(this.f224320p), java.lang.Integer.valueOf(aVar.f224320p)) && n51.f.a(java.lang.Boolean.valueOf(this.f224321q), java.lang.Boolean.valueOf(aVar.f224321q)) && n51.f.a(this.f224322r, aVar.f224322r) && n51.f.a(java.lang.Boolean.valueOf(this.f224323s), java.lang.Boolean.valueOf(aVar.f224323s)) && n51.f.a(java.lang.Boolean.valueOf(this.f224324t), java.lang.Boolean.valueOf(aVar.f224324t)) && n51.f.a(this.f224325u, aVar.f224325u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new cw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f224326v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f224311d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f224312e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f224313f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f224314g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f224315h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f224316i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f224317m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f224318n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f224319o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f224320p);
            }
            if (zArr[30]) {
                fVar.a(30, this.f224321q);
            }
            java.lang.String str = this.f224322r;
            if (str != null && zArr[31]) {
                fVar.j(31, str);
            }
            if (zArr[32]) {
                fVar.a(32, this.f224323s);
            }
            if (zArr[33]) {
                fVar.a(33, this.f224324t);
            }
            com.tencent.mm.protobuf.g gVar = this.f224325u;
            if (gVar != null && zArr[34]) {
                fVar.b(34, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? b36.f.a(1, this.f224311d) + 0 : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f224312e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f224313f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f224314g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f224315h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f224316i);
            }
            if (zArr[7]) {
                a17 += b36.f.a(7, this.f224317m);
            }
            if (zArr[8]) {
                a17 += b36.f.a(8, this.f224318n);
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f224319o);
            }
            if (zArr[10]) {
                a17 += b36.f.e(10, this.f224320p);
            }
            if (zArr[30]) {
                a17 += b36.f.a(30, this.f224321q);
            }
            java.lang.String str2 = this.f224322r;
            if (str2 != null && zArr[31]) {
                a17 += b36.f.j(31, str2);
            }
            if (zArr[32]) {
                a17 += b36.f.a(32, this.f224323s);
            }
            if (zArr[33]) {
                a17 += b36.f.a(33, this.f224324t);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f224325u;
            return (gVar2 == null || !zArr[34]) ? a17 : a17 + b36.f.b(34, gVar2);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f224311d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f224312e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f224313f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f224314g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f224315h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f224316i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f224317m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f224318n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f224319o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f224320p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                switch (intValue) {
                    case 30:
                        this.f224321q = aVar2.c(intValue);
                        zArr[30] = true;
                        return 0;
                    case 31:
                        this.f224322r = aVar2.k(intValue);
                        zArr[31] = true;
                        return 0;
                    case 32:
                        this.f224323s = aVar2.c(intValue);
                        zArr[32] = true;
                        return 0;
                    case 33:
                        this.f224324t = aVar2.c(intValue);
                        zArr[33] = true;
                        return 0;
                    case 34:
                        this.f224325u = aVar2.d(intValue);
                        zArr[34] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (cw5.a) super.parseFrom(bArr);
    }
}
