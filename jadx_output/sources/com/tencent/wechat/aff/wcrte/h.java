package com.tencent.wechat.aff.wcrte;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wechat.aff.wcrte.h f217660p = new com.tencent.wechat.aff.wcrte.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217663f;

    /* renamed from: g, reason: collision with root package name */
    public int f217664g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217665h;

    /* renamed from: i, reason: collision with root package name */
    public float f217666i;

    /* renamed from: m, reason: collision with root package name */
    public float f217667m;

    /* renamed from: n, reason: collision with root package name */
    public int f217668n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f217669o = new boolean[9];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.wcrte.h)) {
            return false;
        }
        com.tencent.wechat.aff.wcrte.h hVar = (com.tencent.wechat.aff.wcrte.h) fVar;
        return n51.f.a(this.f217661d, hVar.f217661d) && n51.f.a(this.f217662e, hVar.f217662e) && n51.f.a(this.f217663f, hVar.f217663f) && n51.f.a(java.lang.Integer.valueOf(this.f217664g), java.lang.Integer.valueOf(hVar.f217664g)) && n51.f.a(this.f217665h, hVar.f217665h) && n51.f.a(java.lang.Float.valueOf(this.f217666i), java.lang.Float.valueOf(hVar.f217666i)) && n51.f.a(java.lang.Float.valueOf(this.f217667m), java.lang.Float.valueOf(hVar.f217667m)) && n51.f.a(java.lang.Integer.valueOf(this.f217668n), java.lang.Integer.valueOf(hVar.f217668n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.wcrte.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217669o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217661d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217662e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f217663f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f217664g);
            }
            java.lang.String str4 = this.f217665h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.d(6, this.f217666i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f217667m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217668n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f217661d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f217662e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f217663f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f217664g);
            }
            java.lang.String str8 = this.f217665h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f217666i);
            }
            if (zArr[7]) {
                i18 += b36.f.d(7, this.f217667m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f217668n) : i18;
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
                this.f217661d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217662e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217663f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217664g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217665h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217666i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217667m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217668n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.wcrte.h) super.parseFrom(bArr);
    }
}
