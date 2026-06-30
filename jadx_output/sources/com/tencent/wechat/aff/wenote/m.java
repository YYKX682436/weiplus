package com.tencent.wechat.aff.wenote;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wechat.aff.wenote.m f217701p = new com.tencent.wechat.aff.wenote.m();

    /* renamed from: d, reason: collision with root package name */
    public long f217702d;

    /* renamed from: e, reason: collision with root package name */
    public long f217703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217704f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217705g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217706h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f217707i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f217708m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f217709n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f217710o = new boolean[9];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.wenote.m)) {
            return false;
        }
        com.tencent.wechat.aff.wenote.m mVar = (com.tencent.wechat.aff.wenote.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217702d), java.lang.Long.valueOf(mVar.f217702d)) && n51.f.a(java.lang.Long.valueOf(this.f217703e), java.lang.Long.valueOf(mVar.f217703e)) && n51.f.a(this.f217704f, mVar.f217704f) && n51.f.a(this.f217705g, mVar.f217705g) && n51.f.a(java.lang.Boolean.valueOf(this.f217706h), java.lang.Boolean.valueOf(mVar.f217706h)) && n51.f.a(java.lang.Boolean.valueOf(this.f217707i), java.lang.Boolean.valueOf(mVar.f217707i)) && n51.f.a(this.f217708m, mVar.f217708m) && n51.f.a(java.lang.Boolean.valueOf(this.f217709n), java.lang.Boolean.valueOf(mVar.f217709n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.wenote.m();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217710o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217702d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217703e);
            }
            java.lang.String str = this.f217704f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f217705g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f217706h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f217707i);
            }
            java.lang.String str3 = this.f217708m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.a(8, this.f217709n);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217702d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f217703e);
            }
            java.lang.String str4 = this.f217704f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f217705g;
            if (str5 != null && zArr[4]) {
                h17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f217706h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f217707i);
            }
            java.lang.String str6 = this.f217708m;
            if (str6 != null && zArr[7]) {
                h17 += b36.f.j(7, str6);
            }
            return zArr[8] ? h17 + b36.f.a(8, this.f217709n) : h17;
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
                this.f217702d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217703e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217704f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217705g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217706h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217707i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217708m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217709n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.wenote.m) super.parseFrom(bArr);
    }
}
