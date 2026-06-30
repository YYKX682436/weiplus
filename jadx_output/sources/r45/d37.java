package r45;

/* loaded from: classes14.dex */
public class d37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.do5 f372052d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ve0 f372053e;

    /* renamed from: f, reason: collision with root package name */
    public int f372054f;

    /* renamed from: h, reason: collision with root package name */
    public int f372056h;

    /* renamed from: m, reason: collision with root package name */
    public int f372058m;

    /* renamed from: n, reason: collision with root package name */
    public r45.do5 f372059n;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f372055g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f372057i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d37)) {
            return false;
        }
        r45.d37 d37Var = (r45.d37) fVar;
        return n51.f.a(this.f372052d, d37Var.f372052d) && n51.f.a(this.f372053e, d37Var.f372053e) && n51.f.a(java.lang.Integer.valueOf(this.f372054f), java.lang.Integer.valueOf(d37Var.f372054f)) && n51.f.a(this.f372055g, d37Var.f372055g) && n51.f.a(java.lang.Integer.valueOf(this.f372056h), java.lang.Integer.valueOf(d37Var.f372056h)) && n51.f.a(this.f372057i, d37Var.f372057i) && n51.f.a(java.lang.Integer.valueOf(this.f372058m), java.lang.Integer.valueOf(d37Var.f372058m)) && n51.f.a(this.f372059n, d37Var.f372059n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.do5 do5Var = this.f372052d;
            if (do5Var != null) {
                fVar.i(1, do5Var.computeSize());
                this.f372052d.writeFields(fVar);
            }
            r45.ve0 ve0Var = this.f372053e;
            if (ve0Var != null) {
                fVar.i(2, ve0Var.computeSize());
                this.f372053e.writeFields(fVar);
            }
            fVar.e(3, this.f372054f);
            fVar.k(4, 2, this.f372055g);
            fVar.e(5, this.f372056h);
            fVar.k(6, 2, this.f372057i);
            fVar.e(7, this.f372058m);
            r45.do5 do5Var2 = this.f372059n;
            if (do5Var2 != null) {
                fVar.i(8, do5Var2.computeSize());
                this.f372059n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.do5 do5Var3 = this.f372052d;
            int i18 = do5Var3 != null ? 0 + b36.f.i(1, do5Var3.computeSize()) : 0;
            r45.ve0 ve0Var2 = this.f372053e;
            if (ve0Var2 != null) {
                i18 += b36.f.i(2, ve0Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f372054f) + b36.f.k(4, 2, this.f372055g) + b36.f.e(5, this.f372056h) + b36.f.k(6, 2, this.f372057i) + b36.f.e(7, this.f372058m);
            r45.do5 do5Var4 = this.f372059n;
            return do5Var4 != null ? e17 + b36.f.i(8, do5Var4.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372055g.clear();
            this.f372057i.clear();
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
        r45.d37 d37Var = (r45.d37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.do5 do5Var5 = new r45.do5();
                    if (bArr2 != null && bArr2.length > 0) {
                        do5Var5.parseFrom(bArr2);
                    }
                    d37Var.f372052d = do5Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ve0 ve0Var3 = new r45.ve0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ve0Var3.parseFrom(bArr3);
                    }
                    d37Var.f372053e = ve0Var3;
                }
                return 0;
            case 3:
                d37Var.f372054f = aVar2.g(intValue);
                return 0;
            case 4:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                d37Var.f372055g = linkedList;
                return 0;
            case 5:
                d37Var.f372056h = aVar2.g(intValue);
                return 0;
            case 6:
                byte[] bArr5 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                d37Var.f372057i = linkedList2;
                return 0;
            case 7:
                d37Var.f372058m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr6 = (byte[]) j19.get(i28);
                    r45.do5 do5Var6 = new r45.do5();
                    if (bArr6 != null && bArr6.length > 0) {
                        do5Var6.parseFrom(bArr6);
                    }
                    d37Var.f372059n = do5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
