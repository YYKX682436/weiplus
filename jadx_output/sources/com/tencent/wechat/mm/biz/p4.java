package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class p4 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.p4 f218470g = new com.tencent.wechat.mm.biz.p4();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.t f218471d = new com.tencent.wechat.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218472e = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.q4 f218473f = new com.tencent.wechat.mm.biz.q4();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.p4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.p4 p4Var = (com.tencent.wechat.mm.biz.p4) fVar;
        return n51.f.a(this.f218471d, p4Var.f218471d) && n51.f.a(this.f218472e, p4Var.f218472e) && n51.f.a(this.f218473f, p4Var.f218473f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.p4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.t tVar = this.f218471d;
            if (tVar != null) {
                fVar.i(1, tVar.computeSize());
                this.f218471d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f218472e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.wechat.mm.biz.q4 q4Var = this.f218473f;
            if (q4Var != null) {
                fVar.i(3, q4Var.computeSize());
                this.f218473f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.t tVar2 = this.f218471d;
            int i18 = tVar2 != null ? 0 + b36.f.i(1, tVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f218472e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            com.tencent.wechat.mm.biz.q4 q4Var2 = this.f218473f;
            return q4Var2 != null ? i18 + b36.f.i(3, q4Var2.computeSize()) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.iam.biz.t tVar3 = new com.tencent.wechat.iam.biz.t();
                if (bArr != null && bArr.length > 0) {
                    tVar3.parseFrom(bArr);
                }
                this.f218471d = tVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f218472e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.mm.biz.q4 q4Var3 = new com.tencent.wechat.mm.biz.q4();
            if (bArr2 != null && bArr2.length > 0) {
                q4Var3.parseFrom(bArr2);
            }
            this.f218473f = q4Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.p4) super.parseFrom(bArr);
    }
}
