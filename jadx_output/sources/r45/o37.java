package r45;

/* loaded from: classes12.dex */
public class o37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f381885d;

    /* renamed from: e, reason: collision with root package name */
    public long f381886e;

    /* renamed from: f, reason: collision with root package name */
    public int f381887f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f381888g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f381889h;

    /* renamed from: i, reason: collision with root package name */
    public double f381890i;

    /* renamed from: m, reason: collision with root package name */
    public double f381891m;

    /* renamed from: n, reason: collision with root package name */
    public int f381892n;

    /* renamed from: o, reason: collision with root package name */
    public int f381893o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f381894p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o37)) {
            return false;
        }
        r45.o37 o37Var = (r45.o37) fVar;
        return n51.f.a(this.BaseRequest, o37Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f381885d), java.lang.Long.valueOf(o37Var.f381885d)) && n51.f.a(java.lang.Long.valueOf(this.f381886e), java.lang.Long.valueOf(o37Var.f381886e)) && n51.f.a(java.lang.Integer.valueOf(this.f381887f), java.lang.Integer.valueOf(o37Var.f381887f)) && n51.f.a(this.f381888g, o37Var.f381888g) && n51.f.a(this.f381889h, o37Var.f381889h) && n51.f.a(java.lang.Double.valueOf(this.f381890i), java.lang.Double.valueOf(o37Var.f381890i)) && n51.f.a(java.lang.Double.valueOf(this.f381891m), java.lang.Double.valueOf(o37Var.f381891m)) && n51.f.a(java.lang.Integer.valueOf(this.f381892n), java.lang.Integer.valueOf(o37Var.f381892n)) && n51.f.a(java.lang.Integer.valueOf(this.f381893o), java.lang.Integer.valueOf(o37Var.f381893o)) && n51.f.a(this.f381894p, o37Var.f381894p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381894p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.h(2, this.f381885d);
            fVar.h(3, this.f381886e);
            fVar.e(4, this.f381887f);
            r45.du5 du5Var = this.f381888g;
            if (du5Var != null) {
                fVar.i(5, du5Var.computeSize());
                this.f381888g.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f381889h;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.computeSize());
                this.f381889h.writeFields(fVar);
            }
            fVar.c(7, this.f381890i);
            fVar.c(8, this.f381891m);
            fVar.e(9, this.f381892n);
            fVar.e(10, this.f381893o);
            fVar.g(11, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f381885d) + b36.f.h(3, this.f381886e) + b36.f.e(4, this.f381887f);
            r45.du5 du5Var3 = this.f381888g;
            if (du5Var3 != null) {
                i18 += b36.f.i(5, du5Var3.computeSize());
            }
            r45.du5 du5Var4 = this.f381889h;
            if (du5Var4 != null) {
                i18 += b36.f.i(6, du5Var4.computeSize());
            }
            return i18 + b36.f.c(7, this.f381890i) + b36.f.c(8, this.f381891m) + b36.f.e(9, this.f381892n) + b36.f.e(10, this.f381893o) + b36.f.g(11, 8, linkedList);
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
        r45.o37 o37Var = (r45.o37) objArr[1];
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
                    o37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                o37Var.f381885d = aVar2.i(intValue);
                return 0;
            case 3:
                o37Var.f381886e = aVar2.i(intValue);
                return 0;
            case 4:
                o37Var.f381887f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var5.b(bArr3);
                    }
                    o37Var.f381888g = du5Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    o37Var.f381889h = du5Var6;
                }
                return 0;
            case 7:
                o37Var.f381890i = aVar2.e(intValue);
                return 0;
            case 8:
                o37Var.f381891m = aVar2.e(intValue);
                return 0;
            case 9:
                o37Var.f381892n = aVar2.g(intValue);
                return 0;
            case 10:
                o37Var.f381893o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.vc6 vc6Var = new r45.vc6();
                    if (bArr5 != null && bArr5.length > 0) {
                        vc6Var.parseFrom(bArr5);
                    }
                    o37Var.f381894p.add(vc6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
