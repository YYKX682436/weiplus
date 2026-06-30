package r45;

/* loaded from: classes12.dex */
public class ez extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373832d;

    /* renamed from: e, reason: collision with root package name */
    public double f373833e;

    /* renamed from: f, reason: collision with root package name */
    public double f373834f;

    /* renamed from: g, reason: collision with root package name */
    public double f373835g;

    /* renamed from: h, reason: collision with root package name */
    public double f373836h;

    /* renamed from: i, reason: collision with root package name */
    public double f373837i;

    /* renamed from: m, reason: collision with root package name */
    public int f373838m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez)) {
            return false;
        }
        r45.ez ezVar = (r45.ez) fVar;
        return n51.f.a(this.f373832d, ezVar.f373832d) && n51.f.a(java.lang.Double.valueOf(this.f373833e), java.lang.Double.valueOf(ezVar.f373833e)) && n51.f.a(java.lang.Double.valueOf(this.f373834f), java.lang.Double.valueOf(ezVar.f373834f)) && n51.f.a(java.lang.Double.valueOf(this.f373835g), java.lang.Double.valueOf(ezVar.f373835g)) && n51.f.a(java.lang.Double.valueOf(this.f373836h), java.lang.Double.valueOf(ezVar.f373836h)) && n51.f.a(java.lang.Double.valueOf(this.f373837i), java.lang.Double.valueOf(ezVar.f373837i)) && n51.f.a(java.lang.Integer.valueOf(this.f373838m), java.lang.Integer.valueOf(ezVar.f373838m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373832d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f373833e);
            fVar.c(3, this.f373834f);
            fVar.c(4, this.f373835g);
            fVar.c(5, this.f373836h);
            fVar.c(6, this.f373837i);
            fVar.e(7, this.f373838m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f373832d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.c(2, this.f373833e) + b36.f.c(3, this.f373834f) + b36.f.c(4, this.f373835g) + b36.f.c(5, this.f373836h) + b36.f.c(6, this.f373837i) + b36.f.e(7, this.f373838m);
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
        r45.ez ezVar = (r45.ez) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ezVar.f373832d = aVar2.k(intValue);
                return 0;
            case 2:
                ezVar.f373833e = aVar2.e(intValue);
                return 0;
            case 3:
                ezVar.f373834f = aVar2.e(intValue);
                return 0;
            case 4:
                ezVar.f373835g = aVar2.e(intValue);
                return 0;
            case 5:
                ezVar.f373836h = aVar2.e(intValue);
                return 0;
            case 6:
                ezVar.f373837i = aVar2.e(intValue);
                return 0;
            case 7:
                ezVar.f373838m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
