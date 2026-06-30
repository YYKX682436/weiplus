package r45;

/* loaded from: classes11.dex */
public class j35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377533d;

    /* renamed from: e, reason: collision with root package name */
    public int f377534e;

    /* renamed from: g, reason: collision with root package name */
    public int f377536g;

    /* renamed from: h, reason: collision with root package name */
    public int f377537h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bs5 f377538i;

    /* renamed from: m, reason: collision with root package name */
    public int f377539m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f377541o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377535f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f377540n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f377542p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j35)) {
            return false;
        }
        r45.j35 j35Var = (r45.j35) fVar;
        return n51.f.a(this.f377533d, j35Var.f377533d) && n51.f.a(java.lang.Integer.valueOf(this.f377534e), java.lang.Integer.valueOf(j35Var.f377534e)) && n51.f.a(this.f377535f, j35Var.f377535f) && n51.f.a(java.lang.Integer.valueOf(this.f377536g), java.lang.Integer.valueOf(j35Var.f377536g)) && n51.f.a(java.lang.Integer.valueOf(this.f377537h), java.lang.Integer.valueOf(j35Var.f377537h)) && n51.f.a(this.f377538i, j35Var.f377538i) && n51.f.a(java.lang.Integer.valueOf(this.f377539m), java.lang.Integer.valueOf(j35Var.f377539m)) && n51.f.a(this.f377540n, j35Var.f377540n) && n51.f.a(java.lang.Boolean.valueOf(this.f377541o), java.lang.Boolean.valueOf(j35Var.f377541o)) && n51.f.a(this.f377542p, j35Var.f377542p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377542p;
        java.util.LinkedList linkedList2 = this.f377540n;
        java.util.LinkedList linkedList3 = this.f377535f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377533d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377534e);
            fVar.g(3, 8, linkedList3);
            fVar.e(4, this.f377536g);
            fVar.e(5, this.f377537h);
            r45.bs5 bs5Var = this.f377538i;
            if (bs5Var != null) {
                fVar.i(6, bs5Var.computeSize());
                this.f377538i.writeFields(fVar);
            }
            fVar.e(7, this.f377539m);
            fVar.g(8, 8, linkedList2);
            fVar.a(9, this.f377541o);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377533d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f377534e) + b36.f.g(3, 8, linkedList3) + b36.f.e(4, this.f377536g) + b36.f.e(5, this.f377537h);
            r45.bs5 bs5Var2 = this.f377538i;
            if (bs5Var2 != null) {
                j17 += b36.f.i(6, bs5Var2.computeSize());
            }
            return j17 + b36.f.e(7, this.f377539m) + b36.f.g(8, 8, linkedList2) + b36.f.a(9, this.f377541o) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.j35 j35Var = (r45.j35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j35Var.f377533d = aVar2.k(intValue);
                return 0;
            case 2:
                j35Var.f377534e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.i35 i35Var = new r45.i35();
                    if (bArr2 != null && bArr2.length > 0) {
                        i35Var.parseFrom(bArr2);
                    }
                    j35Var.f377535f.add(i35Var);
                }
                return 0;
            case 4:
                j35Var.f377536g = aVar2.g(intValue);
                return 0;
            case 5:
                j35Var.f377537h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.bs5 bs5Var3 = new r45.bs5();
                    if (bArr3 != null && bArr3.length > 0) {
                        bs5Var3.parseFrom(bArr3);
                    }
                    j35Var.f377538i = bs5Var3;
                }
                return 0;
            case 7:
                j35Var.f377539m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.h35 h35Var = new r45.h35();
                    if (bArr4 != null && bArr4.length > 0) {
                        h35Var.parseFrom(bArr4);
                    }
                    j35Var.f377540n.add(h35Var);
                }
                return 0;
            case 9:
                j35Var.f377541o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.bs5 bs5Var4 = new r45.bs5();
                    if (bArr5 != null && bArr5.length > 0) {
                        bs5Var4.parseFrom(bArr5);
                    }
                    j35Var.f377542p.add(bs5Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
