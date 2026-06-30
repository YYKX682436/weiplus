package r45;

/* loaded from: classes7.dex */
public class o06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381800d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f381801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381802f;

    /* renamed from: g, reason: collision with root package name */
    public r45.t06 f381803g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381804h;

    /* renamed from: i, reason: collision with root package name */
    public int f381805i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o06)) {
            return false;
        }
        r45.o06 o06Var = (r45.o06) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381800d), java.lang.Integer.valueOf(o06Var.f381800d)) && n51.f.a(java.lang.Boolean.valueOf(this.f381801e), java.lang.Boolean.valueOf(o06Var.f381801e)) && n51.f.a(this.f381802f, o06Var.f381802f) && n51.f.a(this.f381803g, o06Var.f381803g) && n51.f.a(this.f381804h, o06Var.f381804h) && n51.f.a(java.lang.Integer.valueOf(this.f381805i), java.lang.Integer.valueOf(o06Var.f381805i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381800d);
            fVar.a(2, this.f381801e);
            java.lang.String str = this.f381802f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.t06 t06Var = this.f381803g;
            if (t06Var != null) {
                fVar.i(4, t06Var.computeSize());
                this.f381803g.writeFields(fVar);
            }
            java.lang.String str2 = this.f381804h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f381805i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381800d) + 0 + b36.f.a(2, this.f381801e);
            java.lang.String str3 = this.f381802f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            r45.t06 t06Var2 = this.f381803g;
            if (t06Var2 != null) {
                e17 += b36.f.i(4, t06Var2.computeSize());
            }
            java.lang.String str4 = this.f381804h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f381805i);
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
        r45.o06 o06Var = (r45.o06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o06Var.f381800d = aVar2.g(intValue);
                return 0;
            case 2:
                o06Var.f381801e = aVar2.c(intValue);
                return 0;
            case 3:
                o06Var.f381802f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.t06 t06Var3 = new r45.t06();
                    if (bArr != null && bArr.length > 0) {
                        t06Var3.parseFrom(bArr);
                    }
                    o06Var.f381803g = t06Var3;
                }
                return 0;
            case 5:
                o06Var.f381804h = aVar2.k(intValue);
                return 0;
            case 6:
                o06Var.f381805i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
