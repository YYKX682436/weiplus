package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217039e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217040f;

    /* renamed from: g, reason: collision with root package name */
    public int f217041g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217042h;

    /* renamed from: i, reason: collision with root package name */
    public int f217043i;

    /* renamed from: m, reason: collision with root package name */
    public int f217044m;

    /* renamed from: n, reason: collision with root package name */
    public int f217045n;

    /* renamed from: o, reason: collision with root package name */
    public int f217046o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f217047p = new boolean[10];

    static {
        new com.tencent.wechat.aff.iam_scan.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.h)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.h hVar = (com.tencent.wechat.aff.iam_scan.h) fVar;
        return n51.f.a(this.f217038d, hVar.f217038d) && n51.f.a(this.f217039e, hVar.f217039e) && n51.f.a(java.lang.Boolean.valueOf(this.f217040f), java.lang.Boolean.valueOf(hVar.f217040f)) && n51.f.a(java.lang.Integer.valueOf(this.f217041g), java.lang.Integer.valueOf(hVar.f217041g)) && n51.f.a(this.f217042h, hVar.f217042h) && n51.f.a(java.lang.Integer.valueOf(this.f217043i), java.lang.Integer.valueOf(hVar.f217043i)) && n51.f.a(java.lang.Integer.valueOf(this.f217044m), java.lang.Integer.valueOf(hVar.f217044m)) && n51.f.a(java.lang.Integer.valueOf(this.f217045n), java.lang.Integer.valueOf(hVar.f217045n)) && n51.f.a(java.lang.Integer.valueOf(this.f217046o), java.lang.Integer.valueOf(hVar.f217046o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217047p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217038d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217039e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.a(3, this.f217040f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f217041g);
            }
            java.lang.String str3 = this.f217042h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217043i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f217044m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217045n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217046o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f217038d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f217039e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f217040f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f217041g);
            }
            java.lang.String str6 = this.f217042h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f217043i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f217044m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f217045n);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f217046o) : i18;
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
                this.f217038d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217039e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217040f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217041g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217042h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217043i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217044m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217045n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217046o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.h) super.parseFrom(bArr);
    }
}
