package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class n4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f145471d;

    /* renamed from: e, reason: collision with root package name */
    public long f145472e;

    /* renamed from: f, reason: collision with root package name */
    public int f145473f;

    /* renamed from: g, reason: collision with root package name */
    public long f145474g;

    /* renamed from: h, reason: collision with root package name */
    public int f145475h;

    /* renamed from: i, reason: collision with root package name */
    public int f145476i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f145477m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.n4)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.n4 n4Var = (com.tencent.mm.plugin.luckymoney.model.n4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f145471d), java.lang.Integer.valueOf(n4Var.f145471d)) && n51.f.a(java.lang.Long.valueOf(this.f145472e), java.lang.Long.valueOf(n4Var.f145472e)) && n51.f.a(java.lang.Integer.valueOf(this.f145473f), java.lang.Integer.valueOf(n4Var.f145473f)) && n51.f.a(java.lang.Long.valueOf(this.f145474g), java.lang.Long.valueOf(n4Var.f145474g)) && n51.f.a(java.lang.Integer.valueOf(this.f145475h), java.lang.Integer.valueOf(n4Var.f145475h)) && n51.f.a(java.lang.Integer.valueOf(this.f145476i), java.lang.Integer.valueOf(n4Var.f145476i)) && n51.f.a(this.f145477m, n4Var.f145477m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f145471d);
            fVar.h(2, this.f145472e);
            fVar.e(3, this.f145473f);
            fVar.h(4, this.f145474g);
            fVar.e(5, this.f145475h);
            fVar.e(6, this.f145476i);
            fVar.g(7, 8, this.f145477m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f145471d) + 0 + b36.f.h(2, this.f145472e) + b36.f.e(3, this.f145473f) + b36.f.h(4, this.f145474g) + b36.f.e(5, this.f145475h) + b36.f.e(6, this.f145476i) + b36.f.g(7, 8, this.f145477m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f145477m.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.luckymoney.model.n4 n4Var = (com.tencent.mm.plugin.luckymoney.model.n4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n4Var.f145471d = aVar2.g(intValue);
                return 0;
            case 2:
                n4Var.f145472e = aVar2.i(intValue);
                return 0;
            case 3:
                n4Var.f145473f = aVar2.g(intValue);
                return 0;
            case 4:
                n4Var.f145474g = aVar2.i(intValue);
                return 0;
            case 5:
                n4Var.f145475h = aVar2.g(intValue);
                return 0;
            case 6:
                n4Var.f145476i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.luckymoney.model.o4 o4Var = new com.tencent.mm.plugin.luckymoney.model.o4();
                    if (bArr2 != null && bArr2.length > 0) {
                        o4Var.parseFrom(bArr2);
                    }
                    n4Var.f145477m.add(o4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
