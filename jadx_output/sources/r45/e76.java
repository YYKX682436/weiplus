package r45;

/* loaded from: classes4.dex */
public class e76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f373078d;

    /* renamed from: e, reason: collision with root package name */
    public int f373079e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f373080f;

    /* renamed from: g, reason: collision with root package name */
    public int f373081g;

    /* renamed from: h, reason: collision with root package name */
    public int f373082h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f373083i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e76)) {
            return false;
        }
        r45.e76 e76Var = (r45.e76) fVar;
        return n51.f.a(this.f373078d, e76Var.f373078d) && n51.f.a(java.lang.Integer.valueOf(this.f373079e), java.lang.Integer.valueOf(e76Var.f373079e)) && n51.f.a(this.f373080f, e76Var.f373080f) && n51.f.a(java.lang.Integer.valueOf(this.f373081g), java.lang.Integer.valueOf(e76Var.f373081g)) && n51.f.a(java.lang.Integer.valueOf(this.f373082h), java.lang.Integer.valueOf(e76Var.f373082h)) && n51.f.a(this.f373083i, e76Var.f373083i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f373078d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f373078d.writeFields(fVar);
            }
            fVar.e(2, this.f373079e);
            r45.du5 du5Var2 = this.f373080f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f373080f.writeFields(fVar);
            }
            fVar.e(4, this.f373081g);
            fVar.e(5, this.f373082h);
            fVar.k(6, 2, this.f373083i);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f373078d;
            int i18 = (du5Var3 != null ? 0 + b36.f.i(1, du5Var3.computeSize()) : 0) + b36.f.e(2, this.f373079e);
            r45.du5 du5Var4 = this.f373080f;
            if (du5Var4 != null) {
                i18 += b36.f.i(3, du5Var4.computeSize());
            }
            return i18 + b36.f.e(4, this.f373081g) + b36.f.e(5, this.f373082h) + b36.f.k(6, 2, this.f373083i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373083i.clear();
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
        r45.e76 e76Var = (r45.e76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    e76Var.f373078d = du5Var5;
                }
                return 0;
            case 2:
                e76Var.f373079e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    e76Var.f373080f = du5Var6;
                }
                return 0;
            case 4:
                e76Var.f373081g = aVar2.g(intValue);
                return 0;
            case 5:
                e76Var.f373082h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                e76Var.f373083i = linkedList;
                return 0;
            default:
                return -1;
        }
    }
}
