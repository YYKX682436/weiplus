package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes4.dex */
public class m0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f145439d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f145440e;

    /* renamed from: f, reason: collision with root package name */
    public long f145441f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145442g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.m0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.m0 m0Var = (com.tencent.mm.plugin.luckymoney.model.m0) fVar;
        return n51.f.a(this.BaseResponse, m0Var.BaseResponse) && n51.f.a(this.f145439d, m0Var.f145439d) && n51.f.a(java.lang.Integer.valueOf(this.f145440e), java.lang.Integer.valueOf(m0Var.f145440e)) && n51.f.a(java.lang.Long.valueOf(this.f145441f), java.lang.Long.valueOf(m0Var.f145441f)) && n51.f.a(this.f145442g, m0Var.f145442g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f145439d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f145440e);
            fVar.h(4, this.f145441f);
            java.lang.String str = this.f145442g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f145440e) + b36.f.h(4, this.f145441f);
            java.lang.String str2 = this.f145442g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        com.tencent.mm.plugin.luckymoney.model.m0 m0Var = (com.tencent.mm.plugin.luckymoney.model.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                m0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                m0Var.f145440e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                m0Var.f145441f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            m0Var.f145442g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            com.tencent.mm.plugin.luckymoney.model.p6 p6Var = new com.tencent.mm.plugin.luckymoney.model.p6();
            if (bArr3 != null && bArr3.length > 0) {
                p6Var.parseFrom(bArr3);
            }
            m0Var.f145439d.add(p6Var);
        }
        return 0;
    }
}
