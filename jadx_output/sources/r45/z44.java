package r45;

/* loaded from: classes4.dex */
public class z44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391691d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391692e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391693f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f391694g;

    /* renamed from: h, reason: collision with root package name */
    public int f391695h;

    /* renamed from: i, reason: collision with root package name */
    public r45.u44 f391696i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f391697m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z44)) {
            return false;
        }
        r45.z44 z44Var = (r45.z44) fVar;
        return n51.f.a(this.f391691d, z44Var.f391691d) && n51.f.a(this.f391692e, z44Var.f391692e) && n51.f.a(this.f391693f, z44Var.f391693f) && n51.f.a(java.lang.Boolean.valueOf(this.f391694g), java.lang.Boolean.valueOf(z44Var.f391694g)) && n51.f.a(java.lang.Integer.valueOf(this.f391695h), java.lang.Integer.valueOf(z44Var.f391695h)) && n51.f.a(this.f391696i, z44Var.f391696i) && n51.f.a(java.lang.Boolean.valueOf(this.f391697m), java.lang.Boolean.valueOf(z44Var.f391697m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391693f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391691d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391692e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.a(4, this.f391694g);
            fVar.e(5, this.f391695h);
            r45.u44 u44Var = this.f391696i;
            if (u44Var != null) {
                fVar.i(6, u44Var.computeSize());
                this.f391696i.writeFields(fVar);
            }
            fVar.a(7, this.f391697m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f391691d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f391692e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList) + b36.f.a(4, this.f391694g) + b36.f.e(5, this.f391695h);
            r45.u44 u44Var2 = this.f391696i;
            if (u44Var2 != null) {
                g17 += b36.f.i(6, u44Var2.computeSize());
            }
            return g17 + b36.f.a(7, this.f391697m);
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
        r45.z44 z44Var = (r45.z44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z44Var.f391691d = aVar2.k(intValue);
                return 0;
            case 2:
                z44Var.f391692e = aVar2.k(intValue);
                return 0;
            case 3:
                z44Var.f391693f.add(aVar2.k(intValue));
                return 0;
            case 4:
                z44Var.f391694g = aVar2.c(intValue);
                return 0;
            case 5:
                z44Var.f391695h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.u44 u44Var3 = new r45.u44();
                    if (bArr2 != null && bArr2.length > 0) {
                        u44Var3.parseFrom(bArr2);
                    }
                    z44Var.f391696i = u44Var3;
                }
                return 0;
            case 7:
                z44Var.f391697m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
