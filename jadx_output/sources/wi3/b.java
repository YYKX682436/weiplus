package wi3;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f446167d;

    /* renamed from: e, reason: collision with root package name */
    public int f446168e;

    /* renamed from: f, reason: collision with root package name */
    public int f446169f;

    /* renamed from: g, reason: collision with root package name */
    public long f446170g;

    /* renamed from: h, reason: collision with root package name */
    public long f446171h;

    /* renamed from: i, reason: collision with root package name */
    public double f446172i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f446173m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f446174n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.b)) {
            return false;
        }
        wi3.b bVar = (wi3.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f446167d), java.lang.Integer.valueOf(bVar.f446167d)) && n51.f.a(java.lang.Integer.valueOf(this.f446168e), java.lang.Integer.valueOf(bVar.f446168e)) && n51.f.a(java.lang.Integer.valueOf(this.f446169f), java.lang.Integer.valueOf(bVar.f446169f)) && n51.f.a(java.lang.Long.valueOf(this.f446170g), java.lang.Long.valueOf(bVar.f446170g)) && n51.f.a(java.lang.Long.valueOf(this.f446171h), java.lang.Long.valueOf(bVar.f446171h)) && n51.f.a(java.lang.Double.valueOf(this.f446172i), java.lang.Double.valueOf(bVar.f446172i)) && n51.f.a(this.f446173m, bVar.f446173m) && n51.f.a(this.f446174n, bVar.f446174n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f446167d);
            fVar.e(2, this.f446168e);
            fVar.e(3, this.f446169f);
            fVar.h(4, this.f446170g);
            fVar.h(5, this.f446171h);
            fVar.c(6, this.f446172i);
            java.lang.String str = this.f446173m;
            if (str != null) {
                fVar.j(7, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f446174n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f446167d) + 0 + b36.f.e(2, this.f446168e) + b36.f.e(3, this.f446169f) + b36.f.h(4, this.f446170g) + b36.f.h(5, this.f446171h) + b36.f.c(6, this.f446172i);
            java.lang.String str2 = this.f446173m;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f446174n;
            return gVar2 != null ? e17 + b36.f.b(8, gVar2) : e17;
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
        wi3.b bVar = (wi3.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f446167d = aVar2.g(intValue);
                return 0;
            case 2:
                bVar.f446168e = aVar2.g(intValue);
                return 0;
            case 3:
                bVar.f446169f = aVar2.g(intValue);
                return 0;
            case 4:
                bVar.f446170g = aVar2.i(intValue);
                return 0;
            case 5:
                bVar.f446171h = aVar2.i(intValue);
                return 0;
            case 6:
                bVar.f446172i = aVar2.e(intValue);
                return 0;
            case 7:
                bVar.f446173m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f446174n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
