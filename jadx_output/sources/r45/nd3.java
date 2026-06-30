package r45;

/* loaded from: classes9.dex */
public class nd3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381262d;

    /* renamed from: f, reason: collision with root package name */
    public int f381264f;

    /* renamed from: h, reason: collision with root package name */
    public int f381266h;

    /* renamed from: m, reason: collision with root package name */
    public int f381268m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f381269n;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f381263e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f381265g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f381267i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nd3)) {
            return false;
        }
        r45.nd3 nd3Var = (r45.nd3) fVar;
        return n51.f.a(this.BaseRequest, nd3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f381262d), java.lang.Integer.valueOf(nd3Var.f381262d)) && n51.f.a(this.f381263e, nd3Var.f381263e) && n51.f.a(java.lang.Integer.valueOf(this.f381264f), java.lang.Integer.valueOf(nd3Var.f381264f)) && n51.f.a(this.f381265g, nd3Var.f381265g) && n51.f.a(java.lang.Integer.valueOf(this.f381266h), java.lang.Integer.valueOf(nd3Var.f381266h)) && n51.f.a(this.f381267i, nd3Var.f381267i) && n51.f.a(java.lang.Integer.valueOf(this.f381268m), java.lang.Integer.valueOf(nd3Var.f381268m)) && n51.f.a(this.f381269n, nd3Var.f381269n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381265g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f381262d);
            fVar.g(3, 8, this.f381263e);
            fVar.e(4, this.f381264f);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f381266h);
            fVar.g(7, 8, this.f381267i);
            fVar.e(8, this.f381268m);
            r45.du5 du5Var = this.f381269n;
            if (du5Var != null) {
                fVar.i(9, du5Var.computeSize());
                this.f381269n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f381262d) + b36.f.g(3, 8, this.f381263e) + b36.f.e(4, this.f381264f) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f381266h) + b36.f.g(7, 8, this.f381267i) + b36.f.e(8, this.f381268m);
            r45.du5 du5Var2 = this.f381269n;
            return du5Var2 != null ? i18 + b36.f.i(9, du5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381263e.clear();
            linkedList.clear();
            this.f381267i.clear();
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
        r45.nd3 nd3Var = (r45.nd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    nd3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nd3Var.f381262d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    nd3Var.f381263e.add(du5Var3);
                }
                return 0;
            case 4:
                nd3Var.f381264f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var4.b(bArr4);
                    }
                    nd3Var.f381265g.add(du5Var4);
                }
                return 0;
            case 6:
                nd3Var.f381266h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var5.b(bArr5);
                    }
                    nd3Var.f381267i.add(du5Var5);
                }
                return 0;
            case 8:
                nd3Var.f381268m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var6.b(bArr6);
                    }
                    nd3Var.f381269n = du5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
