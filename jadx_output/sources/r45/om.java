package r45;

/* loaded from: classes8.dex */
public class om extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f382348d;

    /* renamed from: e, reason: collision with root package name */
    public long f382349e;

    /* renamed from: f, reason: collision with root package name */
    public int f382350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382351g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382352h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382353i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382354m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382355n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382356o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.om)) {
            return false;
        }
        r45.om omVar = (r45.om) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f382348d), java.lang.Long.valueOf(omVar.f382348d)) && n51.f.a(java.lang.Long.valueOf(this.f382349e), java.lang.Long.valueOf(omVar.f382349e)) && n51.f.a(java.lang.Integer.valueOf(this.f382350f), java.lang.Integer.valueOf(omVar.f382350f)) && n51.f.a(this.f382351g, omVar.f382351g) && n51.f.a(this.f382352h, omVar.f382352h) && n51.f.a(this.f382353i, omVar.f382353i) && n51.f.a(this.f382354m, omVar.f382354m) && n51.f.a(this.f382355n, omVar.f382355n) && n51.f.a(this.f382356o, omVar.f382356o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f382348d);
            fVar.h(2, this.f382349e);
            fVar.e(3, this.f382350f);
            java.lang.String str = this.f382351g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f382352h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f382353i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f382354m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f382355n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f382356o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f382348d) + 0 + b36.f.h(2, this.f382349e) + b36.f.e(3, this.f382350f);
            java.lang.String str7 = this.f382351g;
            if (str7 != null) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f382352h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f382353i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f382354m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f382355n;
            if (str11 != null) {
                h17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f382356o;
            return str12 != null ? h17 + b36.f.j(9, str12) : h17;
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
        r45.om omVar = (r45.om) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                omVar.f382348d = aVar2.i(intValue);
                return 0;
            case 2:
                omVar.f382349e = aVar2.i(intValue);
                return 0;
            case 3:
                omVar.f382350f = aVar2.g(intValue);
                return 0;
            case 4:
                omVar.f382351g = aVar2.k(intValue);
                return 0;
            case 5:
                omVar.f382352h = aVar2.k(intValue);
                return 0;
            case 6:
                omVar.f382353i = aVar2.k(intValue);
                return 0;
            case 7:
                omVar.f382354m = aVar2.k(intValue);
                return 0;
            case 8:
                omVar.f382355n = aVar2.k(intValue);
                return 0;
            case 9:
                omVar.f382356o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
