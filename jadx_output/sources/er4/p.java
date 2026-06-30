package er4;

/* loaded from: classes14.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final er4.p f256147n = new er4.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f256148d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256149e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f256150f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f256151g;

    /* renamed from: h, reason: collision with root package name */
    public long f256152h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f256153i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f256154m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.p)) {
            return false;
        }
        er4.p pVar = (er4.p) fVar;
        return n51.f.a(this.f256148d, pVar.f256148d) && n51.f.a(this.f256149e, pVar.f256149e) && n51.f.a(this.f256150f, pVar.f256150f) && n51.f.a(this.f256151g, pVar.f256151g) && n51.f.a(java.lang.Long.valueOf(this.f256152h), java.lang.Long.valueOf(pVar.f256152h)) && n51.f.a(this.f256153i, pVar.f256153i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f256154m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f256148d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f256149e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f256150f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f256151g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f256152h);
            }
            java.lang.String str5 = this.f256153i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f256148d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f256149e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f256150f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f256151g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f256152h);
            }
            java.lang.String str10 = this.f256153i;
            return (str10 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str10);
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
                this.f256148d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f256149e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256150f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f256151g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f256152h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f256153i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.p) super.parseFrom(bArr);
    }
}
