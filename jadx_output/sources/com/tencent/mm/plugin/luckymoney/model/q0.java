package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f145550d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145551e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145552f;

    /* renamed from: g, reason: collision with root package name */
    public int f145553g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145554h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145555i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.q0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.q0 q0Var = (com.tencent.mm.plugin.luckymoney.model.q0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f145550d), java.lang.Boolean.valueOf(q0Var.f145550d)) && n51.f.a(this.f145551e, q0Var.f145551e) && n51.f.a(this.f145552f, q0Var.f145552f) && n51.f.a(java.lang.Integer.valueOf(this.f145553g), java.lang.Integer.valueOf(q0Var.f145553g)) && n51.f.a(this.f145554h, q0Var.f145554h) && n51.f.a(this.f145555i, q0Var.f145555i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f145550d);
            java.lang.String str = this.f145551e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f145552f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f145553g);
            java.lang.String str3 = this.f145554h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f145555i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f145550d) + 0;
            java.lang.String str5 = this.f145551e;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f145552f;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            int e17 = a17 + b36.f.e(4, this.f145553g);
            java.lang.String str7 = this.f145554h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f145555i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        com.tencent.mm.plugin.luckymoney.model.q0 q0Var = (com.tencent.mm.plugin.luckymoney.model.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f145550d = aVar2.c(intValue);
                return 0;
            case 2:
                q0Var.f145551e = aVar2.k(intValue);
                return 0;
            case 3:
                q0Var.f145552f = aVar2.k(intValue);
                return 0;
            case 4:
                q0Var.f145553g = aVar2.g(intValue);
                return 0;
            case 5:
                q0Var.f145554h = aVar2.k(intValue);
                return 0;
            case 6:
                q0Var.f145555i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
