package com.tencent.wechat.iam.finder_box;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217838d;

    /* renamed from: e, reason: collision with root package name */
    public int f217839e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217840f;

    /* renamed from: g, reason: collision with root package name */
    public int f217841g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217842h;

    /* renamed from: i, reason: collision with root package name */
    public int f217843i;

    static {
        new com.tencent.wechat.iam.finder_box.h();
    }

    public h() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.f217838d = gVar;
        this.f217839e = 0;
        this.f217840f = gVar;
        this.f217841g = 0;
        this.f217842h = gVar;
        this.f217843i = 0;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.iam.finder_box.h parseFrom(byte[] bArr) {
        return (com.tencent.wechat.iam.finder_box.h) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.iam.finder_box.h)) {
            return false;
        }
        com.tencent.wechat.iam.finder_box.h hVar = (com.tencent.wechat.iam.finder_box.h) fVar;
        return n51.f.a(this.f217838d, hVar.f217838d) && n51.f.a(java.lang.Integer.valueOf(this.f217839e), java.lang.Integer.valueOf(hVar.f217839e)) && n51.f.a(this.f217840f, hVar.f217840f) && n51.f.a(java.lang.Integer.valueOf(this.f217841g), java.lang.Integer.valueOf(hVar.f217841g)) && n51.f.a(this.f217842h, hVar.f217842h) && n51.f.a(java.lang.Integer.valueOf(this.f217843i), java.lang.Integer.valueOf(hVar.f217843i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.iam.finder_box.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f217838d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f217839e);
            com.tencent.mm.protobuf.g gVar2 = this.f217840f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f217841g);
            com.tencent.mm.protobuf.g gVar3 = this.f217842h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f217843i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f217838d;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.f217839e);
            com.tencent.mm.protobuf.g gVar5 = this.f217840f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f217841g);
            com.tencent.mm.protobuf.g gVar6 = this.f217842h;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f217843i);
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
                this.f217838d = aVar2.d(intValue);
                return 0;
            case 2:
                this.f217839e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f217840f = aVar2.d(intValue);
                return 0;
            case 4:
                this.f217841g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f217842h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f217843i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
