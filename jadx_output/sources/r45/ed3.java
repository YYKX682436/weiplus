package r45;

/* loaded from: classes12.dex */
public class ed3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373303d;

    /* renamed from: e, reason: collision with root package name */
    public int f373304e;

    /* renamed from: f, reason: collision with root package name */
    public int f373305f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373306g;

    /* renamed from: h, reason: collision with root package name */
    public int f373307h;

    /* renamed from: i, reason: collision with root package name */
    public int f373308i;

    /* renamed from: m, reason: collision with root package name */
    public int f373309m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fw3 f373310n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed3)) {
            return false;
        }
        r45.ed3 ed3Var = (r45.ed3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373303d), java.lang.Integer.valueOf(ed3Var.f373303d)) && n51.f.a(java.lang.Integer.valueOf(this.f373304e), java.lang.Integer.valueOf(ed3Var.f373304e)) && n51.f.a(java.lang.Integer.valueOf(this.f373305f), java.lang.Integer.valueOf(ed3Var.f373305f)) && n51.f.a(this.f373306g, ed3Var.f373306g) && n51.f.a(java.lang.Integer.valueOf(this.f373307h), java.lang.Integer.valueOf(ed3Var.f373307h)) && n51.f.a(java.lang.Integer.valueOf(this.f373308i), java.lang.Integer.valueOf(ed3Var.f373308i)) && n51.f.a(java.lang.Integer.valueOf(this.f373309m), java.lang.Integer.valueOf(ed3Var.f373309m)) && n51.f.a(this.f373310n, ed3Var.f373310n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373303d);
            fVar.e(2, this.f373304e);
            fVar.e(3, this.f373305f);
            com.tencent.mm.protobuf.g gVar = this.f373306g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f373307h);
            fVar.e(6, this.f373308i);
            fVar.e(7, this.f373309m);
            r45.fw3 fw3Var = this.f373310n;
            if (fw3Var != null) {
                fVar.i(8, fw3Var.computeSize());
                this.f373310n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373303d) + 0 + b36.f.e(2, this.f373304e) + b36.f.e(3, this.f373305f);
            com.tencent.mm.protobuf.g gVar2 = this.f373306g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f373307h) + b36.f.e(6, this.f373308i) + b36.f.e(7, this.f373309m);
            r45.fw3 fw3Var2 = this.f373310n;
            return fw3Var2 != null ? e18 + b36.f.i(8, fw3Var2.computeSize()) : e18;
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
        r45.ed3 ed3Var = (r45.ed3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed3Var.f373303d = aVar2.g(intValue);
                return 0;
            case 2:
                ed3Var.f373304e = aVar2.g(intValue);
                return 0;
            case 3:
                ed3Var.f373305f = aVar2.g(intValue);
                return 0;
            case 4:
                ed3Var.f373306g = aVar2.d(intValue);
                return 0;
            case 5:
                ed3Var.f373307h = aVar2.g(intValue);
                return 0;
            case 6:
                ed3Var.f373308i = aVar2.g(intValue);
                return 0;
            case 7:
                ed3Var.f373309m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.fw3 fw3Var3 = new r45.fw3();
                    if (bArr != null && bArr.length > 0) {
                        fw3Var3.parseFrom(bArr);
                    }
                    ed3Var.f373310n = fw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
