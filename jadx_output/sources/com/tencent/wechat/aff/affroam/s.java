package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215974d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f215975e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215976f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215977g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f215978h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f215979i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f215980m = 0;

    static {
        new com.tencent.wechat.aff.affroam.s();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.s parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.s) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.s)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.s sVar = (com.tencent.wechat.aff.affroam.s) fVar;
        return n51.f.a(this.f215974d, sVar.f215974d) && n51.f.a(java.lang.Long.valueOf(this.f215975e), java.lang.Long.valueOf(sVar.f215975e)) && n51.f.a(java.lang.Long.valueOf(this.f215976f), java.lang.Long.valueOf(sVar.f215976f)) && n51.f.a(java.lang.Long.valueOf(this.f215977g), java.lang.Long.valueOf(sVar.f215977g)) && n51.f.a(java.lang.Boolean.valueOf(this.f215978h), java.lang.Boolean.valueOf(sVar.f215978h)) && n51.f.a(java.lang.Long.valueOf(this.f215979i), java.lang.Long.valueOf(sVar.f215979i)) && n51.f.a(java.lang.Long.valueOf(this.f215980m), java.lang.Long.valueOf(sVar.f215980m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.s();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215974d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f215975e);
            fVar.h(3, this.f215976f);
            fVar.h(4, this.f215977g);
            fVar.a(5, this.f215978h);
            fVar.h(6, this.f215979i);
            fVar.h(8, this.f215980m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f215974d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f215975e) + b36.f.h(3, this.f215976f) + b36.f.h(4, this.f215977g) + b36.f.a(5, this.f215978h) + b36.f.h(6, this.f215979i) + b36.f.h(8, this.f215980m);
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
                this.f215974d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f215975e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f215976f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f215977g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215978h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f215979i = aVar2.i(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f215980m = aVar2.i(intValue);
                return 0;
        }
    }
}
