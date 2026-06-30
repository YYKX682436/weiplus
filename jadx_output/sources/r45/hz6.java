package r45;

/* loaded from: classes2.dex */
public class hz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376578d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376579e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376580f;

    /* renamed from: g, reason: collision with root package name */
    public int f376581g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hz6)) {
            return false;
        }
        r45.hz6 hz6Var = (r45.hz6) fVar;
        return n51.f.a(this.f376578d, hz6Var.f376578d) && n51.f.a(this.f376579e, hz6Var.f376579e) && n51.f.a(this.f376580f, hz6Var.f376580f) && n51.f.a(java.lang.Integer.valueOf(this.f376581g), java.lang.Integer.valueOf(hz6Var.f376581g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376578d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376579e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376580f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f376581g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376578d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f376579e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f376580f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f376581g);
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
        r45.hz6 hz6Var = (r45.hz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hz6Var.f376578d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hz6Var.f376579e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hz6Var.f376580f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hz6Var.f376581g = aVar2.g(intValue);
        return 0;
    }
}
