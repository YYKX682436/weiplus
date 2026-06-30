package r45;

/* loaded from: classes4.dex */
public class o76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382007d;

    /* renamed from: e, reason: collision with root package name */
    public int f382008e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382009f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382010g;

    /* renamed from: h, reason: collision with root package name */
    public int f382011h;

    /* renamed from: i, reason: collision with root package name */
    public int f382012i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o76)) {
            return false;
        }
        r45.o76 o76Var = (r45.o76) fVar;
        return n51.f.a(this.f382007d, o76Var.f382007d) && n51.f.a(java.lang.Integer.valueOf(this.f382008e), java.lang.Integer.valueOf(o76Var.f382008e)) && n51.f.a(this.f382009f, o76Var.f382009f) && n51.f.a(this.f382010g, o76Var.f382010g) && n51.f.a(java.lang.Integer.valueOf(this.f382011h), java.lang.Integer.valueOf(o76Var.f382011h)) && n51.f.a(java.lang.Integer.valueOf(this.f382012i), java.lang.Integer.valueOf(o76Var.f382012i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382007d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382008e);
            java.lang.String str2 = this.f382009f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382010g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f382011h);
            fVar.e(6, this.f382012i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382007d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f382008e);
            java.lang.String str5 = this.f382009f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f382010g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            return j17 + b36.f.e(5, this.f382011h) + b36.f.e(6, this.f382012i);
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
        r45.o76 o76Var = (r45.o76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o76Var.f382007d = aVar2.k(intValue);
                return 0;
            case 2:
                o76Var.f382008e = aVar2.g(intValue);
                return 0;
            case 3:
                o76Var.f382009f = aVar2.k(intValue);
                return 0;
            case 4:
                o76Var.f382010g = aVar2.k(intValue);
                return 0;
            case 5:
                o76Var.f382011h = aVar2.g(intValue);
                return 0;
            case 6:
                o76Var.f382012i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
