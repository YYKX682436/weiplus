package com.tencent.wechat.aff.otel;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217414e;

    /* renamed from: f, reason: collision with root package name */
    public long f217415f;

    /* renamed from: g, reason: collision with root package name */
    public double f217416g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217417h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f217418i = new boolean[6];

    static {
        new com.tencent.wechat.aff.otel.b();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.otel.b parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.otel.b) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.otel.b)) {
            return false;
        }
        com.tencent.wechat.aff.otel.b bVar = (com.tencent.wechat.aff.otel.b) fVar;
        return n51.f.a(this.f217413d, bVar.f217413d) && n51.f.a(this.f217414e, bVar.f217414e) && n51.f.a(java.lang.Long.valueOf(this.f217415f), java.lang.Long.valueOf(bVar.f217415f)) && n51.f.a(java.lang.Double.valueOf(this.f217416g), java.lang.Double.valueOf(bVar.f217416g)) && n51.f.a(java.lang.Boolean.valueOf(this.f217417h), java.lang.Boolean.valueOf(bVar.f217417h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.otel.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217418i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217413d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217414e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f217415f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f217416g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f217417h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217413d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f217414e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f217415f);
            }
            if (zArr[4]) {
                i18 += b36.f.c(4, this.f217416g);
            }
            return zArr[5] ? i18 + b36.f.a(5, this.f217417h) : i18;
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
            this.f217413d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217414e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217415f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f217416g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f217417h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
