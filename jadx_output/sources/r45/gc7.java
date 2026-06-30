package r45;

/* loaded from: classes9.dex */
public class gc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375099d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f375100e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f375101f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375102g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f375103h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375104i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f375105m;

    /* renamed from: n, reason: collision with root package name */
    public int f375106n;

    /* renamed from: o, reason: collision with root package name */
    public r45.wc7 f375107o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f375108p;

    /* renamed from: q, reason: collision with root package name */
    public r45.bz f375109q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gc7)) {
            return false;
        }
        r45.gc7 gc7Var = (r45.gc7) fVar;
        return n51.f.a(this.BaseRequest, gc7Var.BaseRequest) && n51.f.a(this.f375099d, gc7Var.f375099d) && n51.f.a(this.f375100e, gc7Var.f375100e) && n51.f.a(java.lang.Boolean.valueOf(this.f375101f), java.lang.Boolean.valueOf(gc7Var.f375101f)) && n51.f.a(this.f375102g, gc7Var.f375102g) && n51.f.a(java.lang.Boolean.valueOf(this.f375103h), java.lang.Boolean.valueOf(gc7Var.f375103h)) && n51.f.a(this.f375104i, gc7Var.f375104i) && n51.f.a(java.lang.Boolean.valueOf(this.f375105m), java.lang.Boolean.valueOf(gc7Var.f375105m)) && n51.f.a(java.lang.Integer.valueOf(this.f375106n), java.lang.Integer.valueOf(gc7Var.f375106n)) && n51.f.a(this.f375107o, gc7Var.f375107o) && n51.f.a(java.lang.Boolean.valueOf(this.f375108p), java.lang.Boolean.valueOf(gc7Var.f375108p)) && n51.f.a(this.f375109q, gc7Var.f375109q);
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
            java.lang.String str = this.f375099d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f375100e);
            fVar.a(4, this.f375101f);
            java.lang.String str2 = this.f375102g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f375103h);
            java.lang.String str3 = this.f375104i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(8, this.f375105m);
            fVar.e(9, this.f375106n);
            r45.wc7 wc7Var = this.f375107o;
            if (wc7Var != null) {
                fVar.i(10, wc7Var.computeSize());
                this.f375107o.writeFields(fVar);
            }
            fVar.a(11, this.f375108p);
            r45.bz bzVar = this.f375109q;
            if (bzVar != null) {
                fVar.i(12, bzVar.computeSize());
                this.f375109q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f375099d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f375100e) + b36.f.a(4, this.f375101f);
            java.lang.String str5 = this.f375102g;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            int a17 = g17 + b36.f.a(6, this.f375103h);
            java.lang.String str6 = this.f375104i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            int a18 = a17 + b36.f.a(8, this.f375105m) + b36.f.e(9, this.f375106n);
            r45.wc7 wc7Var2 = this.f375107o;
            if (wc7Var2 != null) {
                a18 += b36.f.i(10, wc7Var2.computeSize());
            }
            int a19 = a18 + b36.f.a(11, this.f375108p);
            r45.bz bzVar2 = this.f375109q;
            return bzVar2 != null ? a19 + b36.f.i(12, bzVar2.computeSize()) : a19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f375100e.clear();
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
        r45.gc7 gc7Var = (r45.gc7) objArr[1];
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
                    gc7Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gc7Var.f375099d = aVar2.k(intValue);
                return 0;
            case 3:
                gc7Var.f375100e.add(aVar2.k(intValue));
                return 0;
            case 4:
                gc7Var.f375101f = aVar2.c(intValue);
                return 0;
            case 5:
                gc7Var.f375102g = aVar2.k(intValue);
                return 0;
            case 6:
                gc7Var.f375103h = aVar2.c(intValue);
                return 0;
            case 7:
                gc7Var.f375104i = aVar2.k(intValue);
                return 0;
            case 8:
                gc7Var.f375105m = aVar2.c(intValue);
                return 0;
            case 9:
                gc7Var.f375106n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.wc7 wc7Var3 = new r45.wc7();
                    if (bArr3 != null && bArr3.length > 0) {
                        wc7Var3.parseFrom(bArr3);
                    }
                    gc7Var.f375107o = wc7Var3;
                }
                return 0;
            case 11:
                gc7Var.f375108p = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bz bzVar3 = new r45.bz();
                    if (bArr4 != null && bArr4.length > 0) {
                        bzVar3.parseFrom(bArr4);
                    }
                    gc7Var.f375109q = bzVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
