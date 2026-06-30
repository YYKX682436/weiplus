package com.tencent.wechat.aff.favorites;

/* loaded from: classes12.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.j f216798t = new com.tencent.wechat.aff.favorites.j();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216799d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216800e;

    /* renamed from: f, reason: collision with root package name */
    public int f216801f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216802g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216803h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216804i;

    /* renamed from: m, reason: collision with root package name */
    public int f216805m;

    /* renamed from: n, reason: collision with root package name */
    public int f216806n;

    /* renamed from: o, reason: collision with root package name */
    public int f216807o;

    /* renamed from: p, reason: collision with root package name */
    public int f216808p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216809q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f216810r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f216811s = new boolean[13];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.j parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.j) super.parseFrom(bArr);
    }

    public com.tencent.wechat.aff.favorites.j c(java.lang.String str) {
        this.f216802g = str;
        this.f216811s[4] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.j)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.j jVar = (com.tencent.wechat.aff.favorites.j) fVar;
        return n51.f.a(this.f216799d, jVar.f216799d) && n51.f.a(java.lang.Boolean.valueOf(this.f216800e), java.lang.Boolean.valueOf(jVar.f216800e)) && n51.f.a(java.lang.Integer.valueOf(this.f216801f), java.lang.Integer.valueOf(jVar.f216801f)) && n51.f.a(this.f216802g, jVar.f216802g) && n51.f.a(java.lang.Boolean.valueOf(this.f216803h), java.lang.Boolean.valueOf(jVar.f216803h)) && n51.f.a(this.f216804i, jVar.f216804i) && n51.f.a(java.lang.Integer.valueOf(this.f216805m), java.lang.Integer.valueOf(jVar.f216805m)) && n51.f.a(java.lang.Integer.valueOf(this.f216806n), java.lang.Integer.valueOf(jVar.f216806n)) && n51.f.a(java.lang.Integer.valueOf(this.f216807o), java.lang.Integer.valueOf(jVar.f216807o)) && n51.f.a(java.lang.Integer.valueOf(this.f216808p), java.lang.Integer.valueOf(jVar.f216808p)) && n51.f.a(this.f216809q, jVar.f216809q) && n51.f.a(java.lang.Boolean.valueOf(this.f216810r), java.lang.Boolean.valueOf(jVar.f216810r));
    }

    public com.tencent.wechat.aff.favorites.j d(int i17) {
        this.f216808p = i17;
        this.f216811s[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j e(boolean z17) {
        this.f216803h = z17;
        this.f216811s[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j f(boolean z17) {
        this.f216800e = z17;
        this.f216811s[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j g(java.lang.String str) {
        this.f216799d = str;
        this.f216811s[1] = true;
        return this;
    }

    public java.lang.String getMediaPath() {
        return this.f216811s[1] ? this.f216799d : "";
    }

    public java.lang.String getThumbPath() {
        return this.f216811s[6] ? this.f216804i : "";
    }

    public com.tencent.wechat.aff.favorites.j i(int i17) {
        this.f216801f = i17;
        this.f216811s[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j j(int i17) {
        this.f216806n = i17;
        this.f216811s[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j k(java.lang.String str) {
        this.f216804i = str;
        this.f216811s[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j l(int i17) {
        this.f216807o = i17;
        this.f216811s[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.favorites.j n(int i17) {
        this.f216805m = i17;
        this.f216811s[7] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216811s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216799d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f216800e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216801f);
            }
            java.lang.String str2 = this.f216802g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f216803h);
            }
            java.lang.String str3 = this.f216804i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f216805m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f216806n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f216807o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f216808p);
            }
            java.lang.String str4 = this.f216809q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.a(12, this.f216810r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f216799d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            if (zArr[2]) {
                j17 += b36.f.a(2, this.f216800e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f216801f);
            }
            java.lang.String str6 = this.f216802g;
            if (str6 != null && zArr[4]) {
                j17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                j17 += b36.f.a(5, this.f216803h);
            }
            java.lang.String str7 = this.f216804i;
            if (str7 != null && zArr[6]) {
                j17 += b36.f.j(6, str7);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f216805m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f216806n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f216807o);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f216808p);
            }
            java.lang.String str8 = this.f216809q;
            if (str8 != null && zArr[11]) {
                j17 += b36.f.j(11, str8);
            }
            return zArr[12] ? j17 + b36.f.a(12, this.f216810r) : j17;
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
                this.f216799d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216800e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216801f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216802g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216803h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216804i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216805m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216806n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216807o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216808p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216809q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f216810r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
