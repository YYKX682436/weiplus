package r45;

/* loaded from: classes4.dex */
public class g7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f374934d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374935e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374936f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374937g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g7)) {
            return false;
        }
        r45.g7 g7Var = (r45.g7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f374934d), java.lang.Boolean.valueOf(g7Var.f374934d)) && n51.f.a(this.f374935e, g7Var.f374935e) && n51.f.a(this.f374936f, g7Var.f374936f) && n51.f.a(this.f374937g, g7Var.f374937g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f374934d);
            java.lang.String str = this.f374935e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374936f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374937g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f374934d) + 0;
            java.lang.String str4 = this.f374935e;
            if (str4 != null) {
                a17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f374936f;
            if (str5 != null) {
                a17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f374937g;
            return str6 != null ? a17 + b36.f.j(4, str6) : a17;
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
        r45.g7 g7Var = (r45.g7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g7Var.f374934d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            g7Var.f374935e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g7Var.f374936f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g7Var.f374937g = aVar2.k(intValue);
        return 0;
    }
}
