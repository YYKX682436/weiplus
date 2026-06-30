package r45;

/* loaded from: classes4.dex */
public class o86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382033d;

    /* renamed from: e, reason: collision with root package name */
    public int f382034e;

    /* renamed from: f, reason: collision with root package name */
    public int f382035f;

    /* renamed from: g, reason: collision with root package name */
    public int f382036g;

    /* renamed from: h, reason: collision with root package name */
    public int f382037h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f382038i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o86)) {
            return false;
        }
        r45.o86 o86Var = (r45.o86) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382033d), java.lang.Integer.valueOf(o86Var.f382033d)) && n51.f.a(java.lang.Integer.valueOf(this.f382034e), java.lang.Integer.valueOf(o86Var.f382034e)) && n51.f.a(java.lang.Integer.valueOf(this.f382035f), java.lang.Integer.valueOf(o86Var.f382035f)) && n51.f.a(java.lang.Integer.valueOf(this.f382036g), java.lang.Integer.valueOf(o86Var.f382036g)) && n51.f.a(java.lang.Integer.valueOf(this.f382037h), java.lang.Integer.valueOf(o86Var.f382037h)) && n51.f.a(this.f382038i, o86Var.f382038i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382033d);
            fVar.e(2, this.f382034e);
            fVar.e(3, this.f382035f);
            fVar.e(4, this.f382036g);
            fVar.e(5, this.f382037h);
            fVar.k(6, 2, this.f382038i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f382033d) + 0 + b36.f.e(2, this.f382034e) + b36.f.e(3, this.f382035f) + b36.f.e(4, this.f382036g) + b36.f.e(5, this.f382037h) + b36.f.k(6, 2, this.f382038i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f382038i.clear();
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
        r45.o86 o86Var = (r45.o86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o86Var.f382033d = aVar2.g(intValue);
                return 0;
            case 2:
                o86Var.f382034e = aVar2.g(intValue);
                return 0;
            case 3:
                o86Var.f382035f = aVar2.g(intValue);
                return 0;
            case 4:
                o86Var.f382036g = aVar2.g(intValue);
                return 0;
            case 5:
                o86Var.f382037h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr2 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                o86Var.f382038i = linkedList;
                return 0;
            default:
                return -1;
        }
    }
}
