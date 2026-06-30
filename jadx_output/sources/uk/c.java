package uk;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f428483d;

    /* renamed from: e, reason: collision with root package name */
    public int f428484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f428485f;

    /* renamed from: g, reason: collision with root package name */
    public int f428486g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f428487h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f428488i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f428489m;

    /* renamed from: n, reason: collision with root package name */
    public int f428490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f428491o;

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f428483d;
            if (str == null) {
                throw new b36.g("Not all required fields were included: apkMd5");
            }
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f428484e);
            java.lang.String str2 = this.f428485f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f428486g);
            java.lang.String str3 = this.f428487h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f428488i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f428489m);
            fVar.e(8, this.f428490n);
            fVar.a(9, this.f428491o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f428483d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f428484e);
            java.lang.String str6 = this.f428485f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f428486g);
            java.lang.String str7 = this.f428487h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f428488i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.a(7, this.f428489m) + b36.f.e(8, this.f428490n) + b36.f.a(9, this.f428491o);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            if (this.f428483d != null) {
                return 0;
            }
            throw new b36.g("Not all required fields were included: apkMd5");
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        uk.c cVar = (uk.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f428483d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f428484e = aVar2.g(intValue);
                return 0;
            case 3:
                cVar.f428485f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f428486g = aVar2.g(intValue);
                return 0;
            case 5:
                cVar.f428487h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f428488i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f428489m = aVar2.c(intValue);
                return 0;
            case 8:
                cVar.f428490n = aVar2.g(intValue);
                return 0;
            case 9:
                cVar.f428491o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
