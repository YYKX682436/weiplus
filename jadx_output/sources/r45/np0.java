package r45;

/* loaded from: classes8.dex */
public class np0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381565e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381566f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.np0)) {
            return false;
        }
        r45.np0 np0Var = (r45.np0) fVar;
        return n51.f.a(this.f381564d, np0Var.f381564d) && n51.f.a(this.f381565e, np0Var.f381565e) && n51.f.a(this.f381566f, np0Var.f381566f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381564d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381565e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381566f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f381564d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f381565e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f381566f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.np0 np0Var = (r45.np0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            np0Var.f381564d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            np0Var.f381565e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        np0Var.f381566f = aVar2.k(intValue);
        return 0;
    }
}
