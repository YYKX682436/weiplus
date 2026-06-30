package er4;

/* loaded from: classes14.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final er4.x f256195n = new er4.x();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f256196d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256197e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f256198f;

    /* renamed from: g, reason: collision with root package name */
    public er4.i f256199g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f256200h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f256201i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f256202m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.x)) {
            return false;
        }
        er4.x xVar = (er4.x) fVar;
        return n51.f.a(this.f256196d, xVar.f256196d) && n51.f.a(this.f256197e, xVar.f256197e) && n51.f.a(this.f256198f, xVar.f256198f) && n51.f.a(this.f256199g, xVar.f256199g) && n51.f.a(java.lang.Boolean.valueOf(this.f256200h), java.lang.Boolean.valueOf(xVar.f256200h)) && n51.f.a(this.f256201i, xVar.f256201i);
    }

    public java.lang.String getName() {
        return this.f256202m[1] ? this.f256196d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f256202m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f256196d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f256197e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f256198f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            er4.i iVar = this.f256199g;
            if (iVar != null && zArr[4]) {
                fVar.e(4, iVar.f256103d);
            }
            if (zArr[5]) {
                fVar.a(5, this.f256200h);
            }
            java.lang.String str4 = this.f256201i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f256196d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f256197e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f256198f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            er4.i iVar2 = this.f256199g;
            if (iVar2 != null && zArr[4]) {
                i18 += b36.f.e(4, iVar2.f256103d);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f256200h);
            }
            java.lang.String str8 = this.f256201i;
            return (str8 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str8);
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
                this.f256196d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f256197e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256198f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f256199g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : er4.i.MP_UNKOWN : er4.i.MP_FEMALE : er4.i.MP_MALE;
                zArr[4] = true;
                return 0;
            case 5:
                this.f256200h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f256201i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.x) super.parseFrom(bArr);
    }
}
