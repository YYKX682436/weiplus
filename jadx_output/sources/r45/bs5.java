package r45;

/* loaded from: classes11.dex */
public class bs5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371025d;

    /* renamed from: e, reason: collision with root package name */
    public int f371026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371027f;

    /* renamed from: g, reason: collision with root package name */
    public int f371028g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f371029h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371030i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371031m;

    /* renamed from: n, reason: collision with root package name */
    public int f371032n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bs5)) {
            return false;
        }
        r45.bs5 bs5Var = (r45.bs5) fVar;
        return n51.f.a(this.f371025d, bs5Var.f371025d) && n51.f.a(java.lang.Integer.valueOf(this.f371026e), java.lang.Integer.valueOf(bs5Var.f371026e)) && n51.f.a(this.f371027f, bs5Var.f371027f) && n51.f.a(java.lang.Integer.valueOf(this.f371028g), java.lang.Integer.valueOf(bs5Var.f371028g)) && n51.f.a(this.f371029h, bs5Var.f371029h) && n51.f.a(this.f371030i, bs5Var.f371030i) && n51.f.a(this.f371031m, bs5Var.f371031m) && n51.f.a(java.lang.Integer.valueOf(this.f371032n), java.lang.Integer.valueOf(bs5Var.f371032n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371025d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371026e);
            java.lang.String str2 = this.f371027f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f371028g);
            fVar.g(5, 8, this.f371029h);
            com.tencent.mm.protobuf.g gVar = this.f371030i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str3 = this.f371031m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f371032n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f371025d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f371026e);
            java.lang.String str5 = this.f371027f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f371028g) + b36.f.g(5, 8, this.f371029h);
            com.tencent.mm.protobuf.g gVar2 = this.f371030i;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str6 = this.f371031m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f371032n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371029h.clear();
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
        r45.bs5 bs5Var = (r45.bs5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bs5Var.f371025d = aVar2.k(intValue);
                return 0;
            case 2:
                bs5Var.f371026e = aVar2.g(intValue);
                return 0;
            case 3:
                bs5Var.f371027f = aVar2.k(intValue);
                return 0;
            case 4:
                bs5Var.f371028g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y56 y56Var = new r45.y56();
                    if (bArr2 != null && bArr2.length > 0) {
                        y56Var.parseFrom(bArr2);
                    }
                    bs5Var.f371029h.add(y56Var);
                }
                return 0;
            case 6:
                bs5Var.f371030i = aVar2.d(intValue);
                return 0;
            case 7:
                bs5Var.f371031m = aVar2.k(intValue);
                return 0;
            case 8:
                bs5Var.f371032n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
