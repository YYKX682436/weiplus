package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class v4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f196277d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f196278e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f196279f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f196280g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f196281h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f196282i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f196283m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.v4)) {
            return false;
        }
        com.tencent.mm.storage.v4 v4Var = (com.tencent.mm.storage.v4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f196277d), java.lang.Integer.valueOf(v4Var.f196277d)) && n51.f.a(this.f196278e, v4Var.f196278e) && n51.f.a(this.f196279f, v4Var.f196279f) && n51.f.a(this.f196280g, v4Var.f196280g) && n51.f.a(this.f196281h, v4Var.f196281h) && n51.f.a(this.f196282i, v4Var.f196282i) && n51.f.a(this.f196283m, v4Var.f196283m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f196281h;
        java.util.LinkedList linkedList2 = this.f196280g;
        java.util.LinkedList linkedList3 = this.f196279f;
        java.util.LinkedList linkedList4 = this.f196278e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f196277d);
            fVar.g(2, 2, linkedList4);
            fVar.g(3, 2, linkedList3);
            fVar.g(4, 2, linkedList2);
            fVar.g(5, 3, linkedList);
            fVar.g(6, 3, this.f196282i);
            fVar.g(7, 3, this.f196283m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f196277d) + 0 + b36.f.g(2, 2, linkedList4) + b36.f.g(3, 2, linkedList3) + b36.f.g(4, 2, linkedList2) + b36.f.g(5, 3, linkedList) + b36.f.g(6, 3, this.f196282i) + b36.f.g(7, 3, this.f196283m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f196282i.clear();
            this.f196283m.clear();
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
        com.tencent.mm.storage.v4 v4Var = (com.tencent.mm.storage.v4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v4Var.f196277d = aVar2.g(intValue);
                return 0;
            case 2:
                v4Var.f196278e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                v4Var.f196279f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                v4Var.f196280g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                v4Var.f196281h.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 6:
                v4Var.f196282i.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 7:
                v4Var.f196283m.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
