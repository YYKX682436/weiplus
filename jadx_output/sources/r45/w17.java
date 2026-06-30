package r45;

/* loaded from: classes12.dex */
public class w17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f388786d;

    /* renamed from: e, reason: collision with root package name */
    public int f388787e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388788f;

    /* renamed from: g, reason: collision with root package name */
    public int f388789g;

    /* renamed from: h, reason: collision with root package name */
    public int f388790h;

    /* renamed from: i, reason: collision with root package name */
    public int f388791i;

    /* renamed from: m, reason: collision with root package name */
    public int f388792m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f388793n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public r45.du5 f388794o;

    /* renamed from: p, reason: collision with root package name */
    public int f388795p;

    /* renamed from: q, reason: collision with root package name */
    public int f388796q;

    /* renamed from: r, reason: collision with root package name */
    public int f388797r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w17)) {
            return false;
        }
        r45.w17 w17Var = (r45.w17) fVar;
        return n51.f.a(this.BaseRequest, w17Var.BaseRequest) && n51.f.a(this.f388786d, w17Var.f388786d) && n51.f.a(java.lang.Integer.valueOf(this.f388787e), java.lang.Integer.valueOf(w17Var.f388787e)) && n51.f.a(this.f388788f, w17Var.f388788f) && n51.f.a(java.lang.Integer.valueOf(this.f388789g), java.lang.Integer.valueOf(w17Var.f388789g)) && n51.f.a(java.lang.Integer.valueOf(this.f388790h), java.lang.Integer.valueOf(w17Var.f388790h)) && n51.f.a(java.lang.Integer.valueOf(this.f388791i), java.lang.Integer.valueOf(w17Var.f388791i)) && n51.f.a(java.lang.Integer.valueOf(this.f388792m), java.lang.Integer.valueOf(w17Var.f388792m)) && n51.f.a(this.f388793n, w17Var.f388793n) && n51.f.a(this.f388794o, w17Var.f388794o) && n51.f.a(java.lang.Integer.valueOf(this.f388795p), java.lang.Integer.valueOf(w17Var.f388795p)) && n51.f.a(java.lang.Integer.valueOf(this.f388796q), java.lang.Integer.valueOf(w17Var.f388796q)) && n51.f.a(java.lang.Integer.valueOf(this.f388797r), java.lang.Integer.valueOf(w17Var.f388797r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f388786d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f388786d.writeFields(fVar);
            }
            fVar.e(3, this.f388787e);
            java.lang.String str = this.f388788f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f388789g);
            fVar.e(6, this.f388790h);
            fVar.e(7, this.f388791i);
            fVar.e(8, this.f388792m);
            fVar.g(9, 8, this.f388793n);
            r45.du5 du5Var = this.f388794o;
            if (du5Var != null) {
                fVar.i(10, du5Var.computeSize());
                this.f388794o.writeFields(fVar);
            }
            fVar.e(11, this.f388795p);
            fVar.e(12, this.f388796q);
            fVar.e(16, this.f388797r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f388786d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f388787e);
            java.lang.String str2 = this.f388788f;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            int e18 = e17 + b36.f.e(5, this.f388789g) + b36.f.e(6, this.f388790h) + b36.f.e(7, this.f388791i) + b36.f.e(8, this.f388792m) + b36.f.g(9, 8, this.f388793n);
            r45.du5 du5Var2 = this.f388794o;
            if (du5Var2 != null) {
                e18 += b36.f.i(10, du5Var2.computeSize());
            }
            return e18 + b36.f.e(11, this.f388795p) + b36.f.e(12, this.f388796q) + b36.f.e(16, this.f388797r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388793n.clear();
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
        r45.w17 w17Var = (r45.w17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 16) {
            w17Var.f388797r = aVar2.g(intValue);
            return 0;
        }
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
                    w17Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    w17Var.f388786d = cu5Var3;
                }
                return 0;
            case 3:
                w17Var.f388787e = aVar2.g(intValue);
                return 0;
            case 4:
                w17Var.f388788f = aVar2.k(intValue);
                return 0;
            case 5:
                w17Var.f388789g = aVar2.g(intValue);
                return 0;
            case 6:
                w17Var.f388790h = aVar2.g(intValue);
                return 0;
            case 7:
                w17Var.f388791i = aVar2.g(intValue);
                return 0;
            case 8:
                w17Var.f388792m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var3.b(bArr4);
                    }
                    w17Var.f388793n.add(du5Var3);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var4.b(bArr5);
                    }
                    w17Var.f388794o = du5Var4;
                }
                return 0;
            case 11:
                w17Var.f388795p = aVar2.g(intValue);
                return 0;
            case 12:
                w17Var.f388796q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
