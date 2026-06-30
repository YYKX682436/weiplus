package com.tencent.wechat.iam.biz;

/* loaded from: classes2.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217795d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.q1 f217796e = new com.tencent.wechat.iam.biz.q1();

    static {
        new com.tencent.wechat.iam.biz.u();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.iam.biz.u parseFrom(byte[] bArr) {
        return (com.tencent.wechat.iam.biz.u) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.iam.biz.u)) {
            return false;
        }
        com.tencent.wechat.iam.biz.u uVar = (com.tencent.wechat.iam.biz.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217795d), java.lang.Integer.valueOf(uVar.f217795d)) && n51.f.a(this.f217796e, uVar.f217796e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.iam.biz.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f217795d);
            com.tencent.wechat.iam.biz.q1 q1Var = this.f217796e;
            if (q1Var != null) {
                fVar.i(2, q1Var.computeSize());
                this.f217796e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f217795d) + 0;
            com.tencent.wechat.iam.biz.q1 q1Var2 = this.f217796e;
            return q1Var2 != null ? e17 + b36.f.i(2, q1Var2.computeSize()) : e17;
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
            this.f217795d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.iam.biz.q1 q1Var3 = new com.tencent.wechat.iam.biz.q1();
            if (bArr != null && bArr.length > 0) {
                q1Var3.parseFrom(bArr);
            }
            this.f217796e = q1Var3;
        }
        return 0;
    }
}
