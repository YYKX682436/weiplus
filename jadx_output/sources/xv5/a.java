package xv5;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final xv5.a f457438n = new xv5.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457439d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457441f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f457442g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457443h;

    /* renamed from: i, reason: collision with root package name */
    public int f457444i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f457445m = new boolean[15];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.a)) {
            return false;
        }
        xv5.a aVar = (xv5.a) fVar;
        return n51.f.a(this.f457439d, aVar.f457439d) && n51.f.a(this.f457440e, aVar.f457440e) && n51.f.a(this.f457441f, aVar.f457441f) && n51.f.a(java.lang.Boolean.valueOf(this.f457442g), java.lang.Boolean.valueOf(aVar.f457442g)) && n51.f.a(this.f457443h, aVar.f457443h) && n51.f.a(java.lang.Integer.valueOf(this.f457444i), java.lang.Integer.valueOf(aVar.f457444i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f457445m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457439d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457440e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f457441f;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.a(12, this.f457442g);
            }
            java.lang.String str4 = this.f457443h;
            if (str4 != null && zArr[13]) {
                fVar.j(13, str4);
            }
            if (zArr[14]) {
                fVar.e(14, this.f457444i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f457439d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f457440e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f457441f;
            if (str7 != null && zArr[11]) {
                i18 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f457442g);
            }
            java.lang.String str8 = this.f457443h;
            if (str8 != null && zArr[13]) {
                i18 += b36.f.j(13, str8);
            }
            return zArr[14] ? i18 + b36.f.e(14, this.f457444i) : i18;
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
        if (intValue == 1) {
            this.f457439d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f457440e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        switch (intValue) {
            case 11:
                this.f457441f = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f457442g = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f457443h = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f457444i = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (xv5.a) super.parseFrom(bArr);
    }
}
