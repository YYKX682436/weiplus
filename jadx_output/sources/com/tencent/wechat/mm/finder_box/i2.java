package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class i2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219505d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219506e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219507f = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f219508g = false;

    static {
        new com.tencent.wechat.mm.finder_box.i2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.i2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.i2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.i2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.i2 i2Var = (com.tencent.wechat.mm.finder_box.i2) fVar;
        return n51.f.a(this.f219505d, i2Var.f219505d) && n51.f.a(this.f219506e, i2Var.f219506e) && n51.f.a(this.f219507f, i2Var.f219507f) && n51.f.a(java.lang.Boolean.valueOf(this.f219508g), java.lang.Boolean.valueOf(i2Var.f219508g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.i2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219505d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219506e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f219507f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f219508g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219505d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f219506e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219507f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.a(4, this.f219508g);
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
            this.f219505d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f219506e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f219507f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f219508g = aVar2.c(intValue);
        return 0;
    }
}
