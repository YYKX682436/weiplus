package s45;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402966d;

    /* renamed from: e, reason: collision with root package name */
    public int f402967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402968f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f402969g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f402970h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f402971i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof s45.b)) {
            return false;
        }
        s45.b bVar = (s45.b) fVar;
        return n51.f.a(this.f402966d, bVar.f402966d) && n51.f.a(java.lang.Integer.valueOf(this.f402967e), java.lang.Integer.valueOf(bVar.f402967e)) && n51.f.a(this.f402968f, bVar.f402968f) && n51.f.a(java.lang.Boolean.valueOf(this.f402969g), java.lang.Boolean.valueOf(bVar.f402969g)) && n51.f.a(java.lang.Boolean.valueOf(this.f402970h), java.lang.Boolean.valueOf(bVar.f402970h)) && n51.f.a(java.lang.Boolean.valueOf(this.f402971i), java.lang.Boolean.valueOf(bVar.f402971i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f402966d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f402967e);
            java.lang.String str2 = this.f402968f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(5, this.f402969g);
            fVar.a(11, this.f402970h);
            fVar.a(12, this.f402971i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f402966d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f402967e);
            java.lang.String str4 = this.f402968f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.a(5, this.f402969g) + b36.f.a(11, this.f402970h) + b36.f.a(12, this.f402971i);
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
        s45.b bVar = (s45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f402966d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f402967e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f402968f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            bVar.f402969g = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 11) {
            bVar.f402970h = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 12) {
            return -1;
        }
        bVar.f402971i = aVar2.c(intValue);
        return 0;
    }
}
