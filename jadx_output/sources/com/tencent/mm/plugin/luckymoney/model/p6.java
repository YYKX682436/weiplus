package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes4.dex */
public class p6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145545d;

    /* renamed from: e, reason: collision with root package name */
    public int f145546e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145547f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.p6)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.p6 p6Var = (com.tencent.mm.plugin.luckymoney.model.p6) fVar;
        return n51.f.a(this.f145545d, p6Var.f145545d) && n51.f.a(java.lang.Integer.valueOf(this.f145546e), java.lang.Integer.valueOf(p6Var.f145546e)) && n51.f.a(this.f145547f, p6Var.f145547f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145545d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f145546e);
            java.lang.String str2 = this.f145547f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f145545d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f145546e);
            java.lang.String str4 = this.f145547f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        com.tencent.mm.plugin.luckymoney.model.p6 p6Var = (com.tencent.mm.plugin.luckymoney.model.p6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p6Var.f145545d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            p6Var.f145546e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p6Var.f145547f = aVar2.k(intValue);
        return 0;
    }
}
