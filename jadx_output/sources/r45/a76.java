package r45;

/* loaded from: classes15.dex */
public class a76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369802d;

    /* renamed from: f, reason: collision with root package name */
    public r45.gm0 f369804f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d5 f369805g;

    /* renamed from: i, reason: collision with root package name */
    public int f369807i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369808m;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f369803e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f369806h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a76)) {
            return false;
        }
        r45.a76 a76Var = (r45.a76) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369802d), java.lang.Integer.valueOf(a76Var.f369802d)) && n51.f.a(this.f369803e, a76Var.f369803e) && n51.f.a(this.f369804f, a76Var.f369804f) && n51.f.a(this.f369805g, a76Var.f369805g) && n51.f.a(this.f369806h, a76Var.f369806h) && n51.f.a(java.lang.Integer.valueOf(this.f369807i), java.lang.Integer.valueOf(a76Var.f369807i)) && n51.f.a(this.f369808m, a76Var.f369808m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369802d);
            fVar.g(2, 8, this.f369803e);
            r45.gm0 gm0Var = this.f369804f;
            if (gm0Var != null) {
                fVar.i(3, gm0Var.computeSize());
                this.f369804f.writeFields(fVar);
            }
            r45.d5 d5Var = this.f369805g;
            if (d5Var != null) {
                fVar.i(4, d5Var.computeSize());
                this.f369805g.writeFields(fVar);
            }
            fVar.g(5, 8, this.f369806h);
            fVar.e(6, this.f369807i);
            java.lang.String str = this.f369808m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369802d) + 0 + b36.f.g(2, 8, this.f369803e);
            r45.gm0 gm0Var2 = this.f369804f;
            if (gm0Var2 != null) {
                e17 += b36.f.i(3, gm0Var2.computeSize());
            }
            r45.d5 d5Var2 = this.f369805g;
            if (d5Var2 != null) {
                e17 += b36.f.i(4, d5Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f369806h) + b36.f.e(6, this.f369807i);
            java.lang.String str2 = this.f369808m;
            return str2 != null ? g17 + b36.f.j(7, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f369803e.clear();
            this.f369806h.clear();
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
        r45.a76 a76Var = (r45.a76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a76Var.f369802d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nd5 nd5Var = new r45.nd5();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd5Var.parseFrom(bArr2);
                    }
                    a76Var.f369803e.add(nd5Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.gm0 gm0Var3 = new r45.gm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gm0Var3.parseFrom(bArr3);
                    }
                    a76Var.f369804f = gm0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.d5 d5Var3 = new r45.d5();
                    if (bArr4 != null && bArr4.length > 0) {
                        d5Var3.parseFrom(bArr4);
                    }
                    a76Var.f369805g = d5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ek5 ek5Var = new r45.ek5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ek5Var.parseFrom(bArr5);
                    }
                    a76Var.f369806h.add(ek5Var);
                }
                return 0;
            case 6:
                a76Var.f369807i = aVar2.g(intValue);
                return 0;
            case 7:
                a76Var.f369808m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
