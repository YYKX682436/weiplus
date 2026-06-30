package com.tencent.wechat.aff.affroam;

/* loaded from: classes2.dex */
public class i1 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.i1 f215861g = new com.tencent.wechat.aff.affroam.i1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215862d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f215863e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215864f = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.i1)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.i1 i1Var = (com.tencent.wechat.aff.affroam.i1) fVar;
        return n51.f.a(this.f215862d, i1Var.f215862d) && n51.f.a(java.lang.Long.valueOf(this.f215863e), java.lang.Long.valueOf(i1Var.f215863e)) && n51.f.a(java.lang.Long.valueOf(this.f215864f), java.lang.Long.valueOf(i1Var.f215864f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.i1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215862d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f215863e);
            fVar.h(3, this.f215864f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f215862d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f215863e) + b36.f.h(3, this.f215864f);
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
            this.f215862d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215863e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f215864f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.i1) super.parseFrom(bArr);
    }
}
