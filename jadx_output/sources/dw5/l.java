package dw5;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f244378d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f244379e;

    /* renamed from: f, reason: collision with root package name */
    public dw5.m f244380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f244381g;

    /* renamed from: h, reason: collision with root package name */
    public int f244382h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f244383i = new boolean[6];

    static {
        new dw5.l();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dw5.l parseFrom(byte[] bArr) {
        return (dw5.l) super.parseFrom(bArr);
    }

    public dw5.l c(int i17) {
        this.f244382h = i17;
        this.f244383i[5] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.l)) {
            return false;
        }
        dw5.l lVar = (dw5.l) fVar;
        return n51.f.a(this.f244378d, lVar.f244378d) && n51.f.a(this.f244379e, lVar.f244379e) && n51.f.a(this.f244380f, lVar.f244380f) && n51.f.a(this.f244381g, lVar.f244381g) && n51.f.a(java.lang.Integer.valueOf(this.f244382h), java.lang.Integer.valueOf(lVar.f244382h));
    }

    public dw5.l d(java.lang.String str) {
        this.f244378d = str;
        this.f244383i[1] = true;
        return this;
    }

    public dw5.l e(java.lang.String str) {
        this.f244381g = str;
        this.f244383i[4] = true;
        return this;
    }

    public dw5.l f(dw5.m mVar) {
        this.f244380f = mVar;
        this.f244383i[3] = true;
        return this;
    }

    public dw5.l g(java.lang.String str) {
        this.f244379e = str;
        this.f244383i[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.l();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f244383i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f244378d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f244379e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            dw5.m mVar = this.f244380f;
            if (mVar != null && zArr[3]) {
                fVar.e(3, mVar.f244389d);
            }
            java.lang.String str3 = this.f244381g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f244382h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f244378d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f244379e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            dw5.m mVar2 = this.f244380f;
            if (mVar2 != null && zArr[3]) {
                i18 += b36.f.e(3, mVar2.f244389d);
            }
            java.lang.String str6 = this.f244381g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f244382h) : i18;
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
        if (intValue == 1) {
            this.f244378d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f244379e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            int g17 = aVar2.g(intValue);
            this.f244380f = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : dw5.m.Fake : dw5.m.Finder : dw5.m.MP : dw5.m.Weixin;
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f244381g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f244382h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
