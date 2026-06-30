package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class i3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f219509d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219510e = com.tencent.mm.protobuf.g.f192155b;

    static {
        new com.tencent.wechat.mm.finder_box.i3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.i3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.i3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.i3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.i3 i3Var = (com.tencent.wechat.mm.finder_box.i3) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f219509d), java.lang.Boolean.valueOf(i3Var.f219509d)) && n51.f.a(this.f219510e, i3Var.f219510e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.i3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f219509d);
            com.tencent.mm.protobuf.g gVar = this.f219510e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f219509d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f219510e;
            return gVar2 != null ? a17 + b36.f.b(2, gVar2) : a17;
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
            this.f219509d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f219510e = aVar2.d(intValue);
        return 0;
    }
}
