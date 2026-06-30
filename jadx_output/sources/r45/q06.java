package r45;

/* loaded from: classes2.dex */
public class q06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383538e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383539f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383540g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q06)) {
            return false;
        }
        r45.q06 q06Var = (r45.q06) fVar;
        return n51.f.a(this.f383537d, q06Var.f383537d) && n51.f.a(java.lang.Boolean.valueOf(this.f383538e), java.lang.Boolean.valueOf(q06Var.f383538e)) && n51.f.a(this.f383539f, q06Var.f383539f) && n51.f.a(this.f383540g, q06Var.f383540g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383537d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f383538e);
            java.lang.String str2 = this.f383539f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383540g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f383537d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.a(2, this.f383538e);
            java.lang.String str5 = this.f383539f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383540g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        r45.q06 q06Var = (r45.q06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q06Var.f383537d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q06Var.f383538e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            q06Var.f383539f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        q06Var.f383540g = aVar2.k(intValue);
        return 0;
    }
}
