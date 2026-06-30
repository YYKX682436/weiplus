package r45;

/* loaded from: classes4.dex */
public class zp4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392273d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392274e;

    /* renamed from: f, reason: collision with root package name */
    public double f392275f;

    /* renamed from: g, reason: collision with root package name */
    public double f392276g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp4)) {
            return false;
        }
        r45.zp4 zp4Var = (r45.zp4) fVar;
        return n51.f.a(this.f392273d, zp4Var.f392273d) && n51.f.a(this.f392274e, zp4Var.f392274e) && n51.f.a(java.lang.Double.valueOf(this.f392275f), java.lang.Double.valueOf(zp4Var.f392275f)) && n51.f.a(java.lang.Double.valueOf(this.f392276g), java.lang.Double.valueOf(zp4Var.f392276g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392273d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392274e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.c(2, this.f392275f);
            fVar.c(3, this.f392276g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f392273d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f392274e;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.c(2, this.f392275f) + b36.f.c(3, this.f392276g);
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
        r45.zp4 zp4Var = (r45.zp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zp4Var.f392273d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zp4Var.f392275f = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            zp4Var.f392276g = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zp4Var.f392274e = aVar2.k(intValue);
        return 0;
    }
}
