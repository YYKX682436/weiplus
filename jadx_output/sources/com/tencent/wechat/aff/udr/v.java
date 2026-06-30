package com.tencent.wechat.aff.udr;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217578d;

    /* renamed from: e, reason: collision with root package name */
    public int f217579e;

    /* renamed from: f, reason: collision with root package name */
    public int f217580f;

    /* renamed from: g, reason: collision with root package name */
    public long f217581g;

    /* renamed from: h, reason: collision with root package name */
    public double f217582h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217583i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f217584m = new boolean[7];

    static {
        new com.tencent.wechat.aff.udr.v();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.udr.v parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.udr.v) super.parseFrom(bArr);
    }

    public com.tencent.wechat.aff.udr.v c(int i17) {
        this.f217580f = i17;
        this.f217584m[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.udr.v)) {
            return false;
        }
        com.tencent.wechat.aff.udr.v vVar = (com.tencent.wechat.aff.udr.v) fVar;
        return n51.f.a(this.f217578d, vVar.f217578d) && n51.f.a(java.lang.Integer.valueOf(this.f217579e), java.lang.Integer.valueOf(vVar.f217579e)) && n51.f.a(java.lang.Integer.valueOf(this.f217580f), java.lang.Integer.valueOf(vVar.f217580f)) && n51.f.a(java.lang.Long.valueOf(this.f217581g), java.lang.Long.valueOf(vVar.f217581g)) && n51.f.a(java.lang.Double.valueOf(this.f217582h), java.lang.Double.valueOf(vVar.f217582h)) && n51.f.a(this.f217583i, vVar.f217583i);
    }

    public com.tencent.wechat.aff.udr.v d(java.lang.String str) {
        this.f217578d = str;
        this.f217584m[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.udr.v e(int i17) {
        this.f217579e = i17;
        this.f217584m[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.udr.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217584m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217578d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f217579e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f217580f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217581g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f217582h);
            }
            java.lang.String str2 = this.f217583i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217578d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f217579e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f217580f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f217581g);
            }
            if (zArr[5]) {
                i18 += b36.f.c(5, this.f217582h);
            }
            java.lang.String str4 = this.f217583i;
            return (str4 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str4);
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
                this.f217578d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217579e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217580f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217581g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217582h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217583i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
