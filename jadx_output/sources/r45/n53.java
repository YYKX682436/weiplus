package r45;

/* loaded from: classes8.dex */
public class n53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.o67 f381082d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l67 f381083e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n67 f381084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f381085g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f381086h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381087i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381088m;

    /* renamed from: n, reason: collision with root package name */
    public int f381089n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n53)) {
            return false;
        }
        r45.n53 n53Var = (r45.n53) fVar;
        return n51.f.a(this.f381082d, n53Var.f381082d) && n51.f.a(this.f381083e, n53Var.f381083e) && n51.f.a(this.f381084f, n53Var.f381084f) && n51.f.a(java.lang.Boolean.valueOf(this.f381085g), java.lang.Boolean.valueOf(n53Var.f381085g)) && n51.f.a(java.lang.Boolean.valueOf(this.f381086h), java.lang.Boolean.valueOf(n53Var.f381086h)) && n51.f.a(this.f381087i, n53Var.f381087i) && n51.f.a(this.f381088m, n53Var.f381088m) && n51.f.a(java.lang.Integer.valueOf(this.f381089n), java.lang.Integer.valueOf(n53Var.f381089n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.o67 o67Var = this.f381082d;
            if (o67Var != null) {
                fVar.i(1, o67Var.computeSize());
                this.f381082d.writeFields(fVar);
            }
            r45.l67 l67Var = this.f381083e;
            if (l67Var != null) {
                fVar.i(2, l67Var.computeSize());
                this.f381083e.writeFields(fVar);
            }
            r45.n67 n67Var = this.f381084f;
            if (n67Var != null) {
                fVar.i(3, n67Var.computeSize());
                this.f381084f.writeFields(fVar);
            }
            fVar.a(4, this.f381085g);
            fVar.a(5, this.f381086h);
            java.lang.String str = this.f381087i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f381088m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(99, this.f381089n);
            return 0;
        }
        if (i17 == 1) {
            r45.o67 o67Var2 = this.f381082d;
            int i18 = o67Var2 != null ? 0 + b36.f.i(1, o67Var2.computeSize()) : 0;
            r45.l67 l67Var2 = this.f381083e;
            if (l67Var2 != null) {
                i18 += b36.f.i(2, l67Var2.computeSize());
            }
            r45.n67 n67Var2 = this.f381084f;
            if (n67Var2 != null) {
                i18 += b36.f.i(3, n67Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(4, this.f381085g) + b36.f.a(5, this.f381086h);
            java.lang.String str3 = this.f381087i;
            if (str3 != null) {
                a17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f381088m;
            if (str4 != null) {
                a17 += b36.f.j(7, str4);
            }
            return a17 + b36.f.e(99, this.f381089n);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.n53 n53Var = (r45.n53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            n53Var.f381089n = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.o67 o67Var3 = new r45.o67();
                    if (bArr != null && bArr.length > 0) {
                        o67Var3.parseFrom(bArr);
                    }
                    n53Var.f381082d = o67Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l67 l67Var3 = new r45.l67();
                    if (bArr2 != null && bArr2.length > 0) {
                        l67Var3.parseFrom(bArr2);
                    }
                    n53Var.f381083e = l67Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.n67 n67Var3 = new r45.n67();
                    if (bArr3 != null && bArr3.length > 0) {
                        n67Var3.parseFrom(bArr3);
                    }
                    n53Var.f381084f = n67Var3;
                }
                return 0;
            case 4:
                n53Var.f381085g = aVar2.c(intValue);
                return 0;
            case 5:
                n53Var.f381086h = aVar2.c(intValue);
                return 0;
            case 6:
                n53Var.f381087i = aVar2.k(intValue);
                return 0;
            case 7:
                n53Var.f381088m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
