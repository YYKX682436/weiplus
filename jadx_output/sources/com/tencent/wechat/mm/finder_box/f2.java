package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class f2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219415d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219416e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f219417f = new boolean[3];

    static {
        new com.tencent.wechat.mm.finder_box.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.f2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.f2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.f2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.f2 f2Var = (com.tencent.wechat.mm.finder_box.f2) fVar;
        return n51.f.a(this.f219415d, f2Var.f219415d) && n51.f.a(this.f219416e, f2Var.f219416e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219417f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f219415d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219416e;
            if (gVar2 != null && zArr[2]) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f219415d;
            if (gVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f219416e;
            return (gVar4 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar4);
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
            this.f219415d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f219416e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
