package com.tencent.wechat.mm.biz;

/* loaded from: classes4.dex */
public class j3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.t2 f218227d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f218228e = new boolean[2];

    static {
        new com.tencent.wechat.mm.biz.j3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.j3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.j3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.mm.biz.j3) && n51.f.a(this.f218227d, ((com.tencent.wechat.mm.biz.j3) fVar).f218227d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.j3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218228e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.biz.t2 t2Var = this.f218227d;
            if (t2Var != null && zArr[1]) {
                fVar.i(1, t2Var.computeSize());
                this.f218227d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.biz.t2 t2Var2 = this.f218227d;
            if (t2Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, t2Var2.computeSize());
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.t2 t2Var3 = new com.tencent.wechat.mm.biz.t2();
            if (bArr != null && bArr.length > 0) {
                t2Var3.parseFrom(bArr);
            }
            this.f218227d = t2Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
