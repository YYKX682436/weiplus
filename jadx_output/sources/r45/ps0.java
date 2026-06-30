package r45;

/* loaded from: classes8.dex */
public class ps0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383367d;

    /* renamed from: e, reason: collision with root package name */
    public long f383368e;

    /* renamed from: f, reason: collision with root package name */
    public int f383369f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383370g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f383371h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public r45.p63 f383372i;

    /* renamed from: m, reason: collision with root package name */
    public int f383373m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps0)) {
            return false;
        }
        r45.ps0 ps0Var = (r45.ps0) fVar;
        return n51.f.a(this.f383367d, ps0Var.f383367d) && n51.f.a(java.lang.Long.valueOf(this.f383368e), java.lang.Long.valueOf(ps0Var.f383368e)) && n51.f.a(java.lang.Integer.valueOf(this.f383369f), java.lang.Integer.valueOf(ps0Var.f383369f)) && n51.f.a(this.f383370g, ps0Var.f383370g) && n51.f.a(this.f383371h, ps0Var.f383371h) && n51.f.a(this.f383372i, ps0Var.f383372i) && n51.f.a(java.lang.Integer.valueOf(this.f383373m), java.lang.Integer.valueOf(ps0Var.f383373m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383371h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383367d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f383368e);
            fVar.e(3, this.f383369f);
            java.lang.String str2 = this.f383370g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            r45.p63 p63Var = this.f383372i;
            if (p63Var != null) {
                fVar.i(6, p63Var.computeSize());
                this.f383372i.writeFields(fVar);
            }
            fVar.e(7, this.f383373m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383367d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f383368e) + b36.f.e(3, this.f383369f);
            java.lang.String str4 = this.f383370g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            int g17 = j17 + b36.f.g(5, 8, linkedList);
            r45.p63 p63Var2 = this.f383372i;
            if (p63Var2 != null) {
                g17 += b36.f.i(6, p63Var2.computeSize());
            }
            return g17 + b36.f.e(7, this.f383373m);
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
        r45.ps0 ps0Var = (r45.ps0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ps0Var.f383367d = aVar2.k(intValue);
                return 0;
            case 2:
                ps0Var.f383368e = aVar2.i(intValue);
                return 0;
            case 3:
                ps0Var.f383369f = aVar2.g(intValue);
                return 0;
            case 4:
                ps0Var.f383370g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.js0 js0Var = new r45.js0();
                    if (bArr2 != null && bArr2.length > 0) {
                        js0Var.parseFrom(bArr2);
                    }
                    ps0Var.f383371h.add(js0Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.p63 p63Var3 = new r45.p63();
                    if (bArr3 != null && bArr3.length > 0) {
                        p63Var3.parseFrom(bArr3);
                    }
                    ps0Var.f383372i = p63Var3;
                }
                return 0;
            case 7:
                ps0Var.f383373m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
