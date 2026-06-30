package r45;

/* loaded from: classes2.dex */
public class tg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386395d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386396e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386397f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386398g;

    /* renamed from: h, reason: collision with root package name */
    public int f386399h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386400i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386401m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386402n;

    /* renamed from: o, reason: collision with root package name */
    public int f386403o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f386404p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg4)) {
            return false;
        }
        r45.tg4 tg4Var = (r45.tg4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386395d), java.lang.Long.valueOf(tg4Var.f386395d)) && n51.f.a(this.f386396e, tg4Var.f386396e) && n51.f.a(this.f386397f, tg4Var.f386397f) && n51.f.a(this.f386398g, tg4Var.f386398g) && n51.f.a(java.lang.Integer.valueOf(this.f386399h), java.lang.Integer.valueOf(tg4Var.f386399h)) && n51.f.a(this.f386400i, tg4Var.f386400i) && n51.f.a(this.f386401m, tg4Var.f386401m) && n51.f.a(this.f386402n, tg4Var.f386402n) && n51.f.a(java.lang.Integer.valueOf(this.f386403o), java.lang.Integer.valueOf(tg4Var.f386403o)) && n51.f.a(java.lang.Boolean.valueOf(this.f386404p), java.lang.Boolean.valueOf(tg4Var.f386404p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386395d);
            java.lang.String str = this.f386396e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386397f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386398g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f386399h);
            java.lang.String str4 = this.f386400i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f386401m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f386402n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f386403o);
            fVar.a(10, this.f386404p);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386395d) + 0;
            java.lang.String str7 = this.f386396e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f386397f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f386398g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            int e17 = h17 + b36.f.e(5, this.f386399h);
            java.lang.String str10 = this.f386400i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f386401m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f386402n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f386403o) + b36.f.a(10, this.f386404p);
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
        r45.tg4 tg4Var = (r45.tg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tg4Var.f386395d = aVar2.i(intValue);
                return 0;
            case 2:
                tg4Var.f386396e = aVar2.k(intValue);
                return 0;
            case 3:
                tg4Var.f386397f = aVar2.k(intValue);
                return 0;
            case 4:
                tg4Var.f386398g = aVar2.k(intValue);
                return 0;
            case 5:
                tg4Var.f386399h = aVar2.g(intValue);
                return 0;
            case 6:
                tg4Var.f386400i = aVar2.k(intValue);
                return 0;
            case 7:
                tg4Var.f386401m = aVar2.k(intValue);
                return 0;
            case 8:
                tg4Var.f386402n = aVar2.k(intValue);
                return 0;
            case 9:
                tg4Var.f386403o = aVar2.g(intValue);
                return 0;
            case 10:
                tg4Var.f386404p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
