package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145568e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.r0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.r0 r0Var = (com.tencent.mm.plugin.luckymoney.model.r0) fVar;
        return n51.f.a(this.f145567d, r0Var.f145567d) && n51.f.a(this.f145568e, r0Var.f145568e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145567d;
            if (str != null) {
                fVar.j(46, str);
            }
            java.lang.String str2 = this.f145568e;
            if (str2 != null) {
                fVar.j(47, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f145567d;
            int j17 = str3 != null ? 0 + b36.f.j(46, str3) : 0;
            java.lang.String str4 = this.f145568e;
            return str4 != null ? j17 + b36.f.j(47, str4) : j17;
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
        com.tencent.mm.plugin.luckymoney.model.r0 r0Var = (com.tencent.mm.plugin.luckymoney.model.r0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 46) {
            r0Var.f145567d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 47) {
            return -1;
        }
        r0Var.f145568e = aVar2.k(intValue);
        return 0;
    }
}
