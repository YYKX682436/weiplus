package r45;

/* loaded from: classes8.dex */
public class mx6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380900d;

    /* renamed from: e, reason: collision with root package name */
    public long f380901e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380902f;

    /* renamed from: g, reason: collision with root package name */
    public int f380903g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx6)) {
            return false;
        }
        r45.mx6 mx6Var = (r45.mx6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380900d), java.lang.Integer.valueOf(mx6Var.f380900d)) && n51.f.a(java.lang.Long.valueOf(this.f380901e), java.lang.Long.valueOf(mx6Var.f380901e)) && n51.f.a(this.f380902f, mx6Var.f380902f) && n51.f.a(java.lang.Integer.valueOf(this.f380903g), java.lang.Integer.valueOf(mx6Var.f380903g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380900d);
            fVar.h(2, this.f380901e);
            java.lang.String str = this.f380902f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f380903g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380900d) + 0 + b36.f.h(2, this.f380901e);
            java.lang.String str2 = this.f380902f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f380903g);
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
        r45.mx6 mx6Var = (r45.mx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mx6Var.f380900d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mx6Var.f380901e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            mx6Var.f380902f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mx6Var.f380903g = aVar2.g(intValue);
        return 0;
    }
}
