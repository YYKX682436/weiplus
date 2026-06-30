package com.tencent.wechat.iam.biz;

/* loaded from: classes2.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217786d;

    /* renamed from: e, reason: collision with root package name */
    public int f217787e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217788f;

    /* renamed from: g, reason: collision with root package name */
    public int f217789g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217790h;

    /* renamed from: i, reason: collision with root package name */
    public int f217791i;

    static {
        new com.tencent.wechat.iam.biz.t();
    }

    public t() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.f217786d = gVar;
        this.f217787e = 0;
        this.f217788f = gVar;
        this.f217789g = 0;
        this.f217790h = gVar;
        this.f217791i = 0;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.iam.biz.t parseFrom(byte[] bArr) {
        return (com.tencent.wechat.iam.biz.t) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.iam.biz.t)) {
            return false;
        }
        com.tencent.wechat.iam.biz.t tVar = (com.tencent.wechat.iam.biz.t) fVar;
        return n51.f.a(this.f217786d, tVar.f217786d) && n51.f.a(java.lang.Integer.valueOf(this.f217787e), java.lang.Integer.valueOf(tVar.f217787e)) && n51.f.a(this.f217788f, tVar.f217788f) && n51.f.a(java.lang.Integer.valueOf(this.f217789g), java.lang.Integer.valueOf(tVar.f217789g)) && n51.f.a(this.f217790h, tVar.f217790h) && n51.f.a(java.lang.Integer.valueOf(this.f217791i), java.lang.Integer.valueOf(tVar.f217791i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.iam.biz.t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f217786d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f217787e);
            com.tencent.mm.protobuf.g gVar2 = this.f217788f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f217789g);
            com.tencent.mm.protobuf.g gVar3 = this.f217790h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f217791i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f217786d;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.f217787e);
            com.tencent.mm.protobuf.g gVar5 = this.f217788f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f217789g);
            com.tencent.mm.protobuf.g gVar6 = this.f217790h;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f217791i);
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
                this.f217786d = aVar2.d(intValue);
                return 0;
            case 2:
                this.f217787e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f217788f = aVar2.d(intValue);
                return 0;
            case 4:
                this.f217789g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f217790h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f217791i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
