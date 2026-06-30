package r45;

/* loaded from: classes12.dex */
public class si extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385743d;

    /* renamed from: e, reason: collision with root package name */
    public int f385744e;

    /* renamed from: f, reason: collision with root package name */
    public int f385745f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385746g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385747h;

    /* renamed from: i, reason: collision with root package name */
    public int f385748i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385749m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385750n;

    /* renamed from: o, reason: collision with root package name */
    public int f385751o;

    /* renamed from: p, reason: collision with root package name */
    public long f385752p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.si)) {
            return false;
        }
        r45.si siVar = (r45.si) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385743d), java.lang.Integer.valueOf(siVar.f385743d)) && n51.f.a(java.lang.Integer.valueOf(this.f385744e), java.lang.Integer.valueOf(siVar.f385744e)) && n51.f.a(java.lang.Integer.valueOf(this.f385745f), java.lang.Integer.valueOf(siVar.f385745f)) && n51.f.a(this.f385746g, siVar.f385746g) && n51.f.a(this.f385747h, siVar.f385747h) && n51.f.a(java.lang.Integer.valueOf(this.f385748i), java.lang.Integer.valueOf(siVar.f385748i)) && n51.f.a(this.f385749m, siVar.f385749m) && n51.f.a(this.f385750n, siVar.f385750n) && n51.f.a(java.lang.Integer.valueOf(this.f385751o), java.lang.Integer.valueOf(siVar.f385751o)) && n51.f.a(java.lang.Long.valueOf(this.f385752p), java.lang.Long.valueOf(siVar.f385752p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385743d);
            fVar.e(2, this.f385744e);
            fVar.e(3, this.f385745f);
            java.lang.String str = this.f385746g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f385747h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f385748i);
            java.lang.String str3 = this.f385749m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f385750n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f385751o);
            fVar.h(10, this.f385752p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385743d) + 0 + b36.f.e(2, this.f385744e) + b36.f.e(3, this.f385745f);
            java.lang.String str5 = this.f385746g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f385747h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f385748i);
            java.lang.String str7 = this.f385749m;
            if (str7 != null) {
                e18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f385750n;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            return e18 + b36.f.e(9, this.f385751o) + b36.f.h(10, this.f385752p);
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
        r45.si siVar = (r45.si) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                siVar.f385743d = aVar2.g(intValue);
                return 0;
            case 2:
                siVar.f385744e = aVar2.g(intValue);
                return 0;
            case 3:
                siVar.f385745f = aVar2.g(intValue);
                return 0;
            case 4:
                siVar.f385746g = aVar2.k(intValue);
                return 0;
            case 5:
                siVar.f385747h = aVar2.k(intValue);
                return 0;
            case 6:
                siVar.f385748i = aVar2.g(intValue);
                return 0;
            case 7:
                siVar.f385749m = aVar2.k(intValue);
                return 0;
            case 8:
                siVar.f385750n = aVar2.k(intValue);
                return 0;
            case 9:
                siVar.f385751o = aVar2.g(intValue);
                return 0;
            case 10:
                siVar.f385752p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
