package r45;

/* loaded from: classes9.dex */
public class xf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390049d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390050e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390051f;

    /* renamed from: g, reason: collision with root package name */
    public int f390052g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xf4)) {
            return false;
        }
        r45.xf4 xf4Var = (r45.xf4) fVar;
        return n51.f.a(this.f390049d, xf4Var.f390049d) && n51.f.a(this.f390050e, xf4Var.f390050e) && n51.f.a(this.f390051f, xf4Var.f390051f) && n51.f.a(java.lang.Integer.valueOf(this.f390052g), java.lang.Integer.valueOf(xf4Var.f390052g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390049d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390050e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390051f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f390052g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390049d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f390050e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f390051f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f390052g);
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
        r45.xf4 xf4Var = (r45.xf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xf4Var.f390049d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xf4Var.f390050e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            xf4Var.f390051f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        xf4Var.f390052g = aVar2.g(intValue);
        return 0;
    }
}
