package r45;

/* loaded from: classes4.dex */
public class p96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382891d;

    /* renamed from: f, reason: collision with root package name */
    public int f382893f;

    /* renamed from: h, reason: collision with root package name */
    public int f382895h;

    /* renamed from: m, reason: collision with root package name */
    public int f382897m;

    /* renamed from: o, reason: collision with root package name */
    public int f382899o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382892e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f382894g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f382896i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f382898n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p96)) {
            return false;
        }
        r45.p96 p96Var = (r45.p96) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382891d), java.lang.Integer.valueOf(p96Var.f382891d)) && n51.f.a(this.f382892e, p96Var.f382892e) && n51.f.a(java.lang.Integer.valueOf(this.f382893f), java.lang.Integer.valueOf(p96Var.f382893f)) && n51.f.a(this.f382894g, p96Var.f382894g) && n51.f.a(java.lang.Integer.valueOf(this.f382895h), java.lang.Integer.valueOf(p96Var.f382895h)) && n51.f.a(this.f382896i, p96Var.f382896i) && n51.f.a(java.lang.Integer.valueOf(this.f382897m), java.lang.Integer.valueOf(p96Var.f382897m)) && n51.f.a(this.f382898n, p96Var.f382898n) && n51.f.a(java.lang.Integer.valueOf(this.f382899o), java.lang.Integer.valueOf(p96Var.f382899o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382896i;
        java.util.LinkedList linkedList2 = this.f382892e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382891d);
            fVar.g(2, 8, linkedList2);
            fVar.e(3, this.f382893f);
            fVar.k(4, 2, this.f382894g);
            fVar.e(5, this.f382895h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f382897m);
            fVar.k(8, 2, this.f382898n);
            fVar.e(9, this.f382899o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f382891d) + 0 + b36.f.g(2, 8, linkedList2) + b36.f.e(3, this.f382893f) + b36.f.k(4, 2, this.f382894g) + b36.f.e(5, this.f382895h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f382897m) + b36.f.k(8, 2, this.f382898n) + b36.f.e(9, this.f382899o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            this.f382894g.clear();
            linkedList.clear();
            this.f382898n.clear();
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
        r45.p96 p96Var = (r45.p96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p96Var.f382891d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var.b(bArr2);
                    }
                    p96Var.f382892e.add(du5Var);
                }
                return 0;
            case 3:
                p96Var.f382893f = aVar2.g(intValue);
                return 0;
            case 4:
                byte[] bArr3 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList3.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                p96Var.f382894g = linkedList3;
                return 0;
            case 5:
                p96Var.f382895h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr4 = (byte[]) j18.get(i19);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var2.b(bArr4);
                    }
                    p96Var.f382896i.add(du5Var2);
                }
                return 0;
            case 7:
                p96Var.f382897m = aVar2.g(intValue);
                return 0;
            case 8:
                byte[] bArr5 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList4.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                p96Var.f382898n = linkedList4;
                return 0;
            case 9:
                p96Var.f382899o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
