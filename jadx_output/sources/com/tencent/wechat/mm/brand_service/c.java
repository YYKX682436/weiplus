package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218857d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218858e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f218859f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218860g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218861h = false;

    static {
        new com.tencent.wechat.mm.brand_service.c();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.c parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.c) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.c)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.c cVar = (com.tencent.wechat.mm.brand_service.c) fVar;
        return n51.f.a(this.f218857d, cVar.f218857d) && n51.f.a(this.f218858e, cVar.f218858e) && n51.f.a(java.lang.Boolean.valueOf(this.f218859f), java.lang.Boolean.valueOf(cVar.f218859f)) && n51.f.a(java.lang.Boolean.valueOf(this.f218860g), java.lang.Boolean.valueOf(cVar.f218860g)) && n51.f.a(java.lang.Boolean.valueOf(this.f218861h), java.lang.Boolean.valueOf(cVar.f218861h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218857d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218858e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f218859f);
            fVar.a(4, this.f218860g);
            fVar.a(5, this.f218861h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f218857d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f218858e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f218859f) + b36.f.a(4, this.f218860g) + b36.f.a(5, this.f218861h);
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
            this.f218857d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218858e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f218859f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f218860g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f218861h = aVar2.c(intValue);
        return 0;
    }
}
