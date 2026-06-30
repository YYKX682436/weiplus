package wn1;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447469d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447470e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447471f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447472g;

    /* renamed from: h, reason: collision with root package name */
    public int f447473h;

    /* renamed from: i, reason: collision with root package name */
    public int f447474i;

    /* renamed from: m, reason: collision with root package name */
    public long f447475m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.s)) {
            return false;
        }
        wn1.s sVar = (wn1.s) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447469d), java.lang.Integer.valueOf(sVar.f447469d)) && n51.f.a(this.f447470e, sVar.f447470e) && n51.f.a(this.f447471f, sVar.f447471f) && n51.f.a(this.f447472g, sVar.f447472g) && n51.f.a(java.lang.Integer.valueOf(this.f447473h), java.lang.Integer.valueOf(sVar.f447473h)) && n51.f.a(java.lang.Integer.valueOf(this.f447474i), java.lang.Integer.valueOf(sVar.f447474i)) && n51.f.a(java.lang.Long.valueOf(this.f447475m), java.lang.Long.valueOf(sVar.f447475m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447469d);
            java.lang.String str = this.f447470e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f447471f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f447472g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f447473h);
            fVar.e(6, this.f447474i);
            fVar.h(7, this.f447475m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f447469d) + 0;
            java.lang.String str4 = this.f447470e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f447471f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f447472g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f447473h) + b36.f.e(6, this.f447474i) + b36.f.h(7, this.f447475m);
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
        wn1.s sVar = (wn1.s) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sVar.f447469d = aVar2.g(intValue);
                return 0;
            case 2:
                sVar.f447470e = aVar2.k(intValue);
                return 0;
            case 3:
                sVar.f447471f = aVar2.k(intValue);
                return 0;
            case 4:
                sVar.f447472g = aVar2.k(intValue);
                return 0;
            case 5:
                sVar.f447473h = aVar2.g(intValue);
                return 0;
            case 6:
                sVar.f447474i = aVar2.g(intValue);
                return 0;
            case 7:
                sVar.f447475m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
