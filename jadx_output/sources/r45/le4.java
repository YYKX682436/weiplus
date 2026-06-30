package r45;

/* loaded from: classes7.dex */
public class le4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379377d;

    /* renamed from: e, reason: collision with root package name */
    public long f379378e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379379f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379380g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le4)) {
            return false;
        }
        r45.le4 le4Var = (r45.le4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379377d), java.lang.Long.valueOf(le4Var.f379377d)) && n51.f.a(java.lang.Long.valueOf(this.f379378e), java.lang.Long.valueOf(le4Var.f379378e)) && n51.f.a(this.f379379f, le4Var.f379379f) && n51.f.a(this.f379380g, le4Var.f379380g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379377d);
            fVar.h(2, this.f379378e);
            java.lang.String str = this.f379379f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379380g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f379377d) + 0 + b36.f.h(2, this.f379378e);
            java.lang.String str3 = this.f379379f;
            if (str3 != null) {
                h17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f379380g;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        r45.le4 le4Var = (r45.le4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            le4Var.f379377d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            le4Var.f379378e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            le4Var.f379379f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        le4Var.f379380g = aVar2.k(intValue);
        return 0;
    }
}
