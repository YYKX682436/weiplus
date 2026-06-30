package t45;

/* loaded from: classes2.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f415608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f415609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f415610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f415611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f415612h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.m0)) {
            return false;
        }
        t45.m0 m0Var = (t45.m0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f415608d), java.lang.Boolean.valueOf(m0Var.f415608d)) && n51.f.a(this.f415609e, m0Var.f415609e) && n51.f.a(this.f415610f, m0Var.f415610f) && n51.f.a(this.f415611g, m0Var.f415611g) && n51.f.a(this.f415612h, m0Var.f415612h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f415608d);
            java.lang.String str = this.f415609e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f415610f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f415611g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f415612h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f415608d) + 0;
            java.lang.String str5 = this.f415609e;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f415610f;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f415611g;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f415612h;
            return str8 != null ? a17 + b36.f.j(5, str8) : a17;
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
        t45.m0 m0Var = (t45.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m0Var.f415608d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            m0Var.f415609e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            m0Var.f415610f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            m0Var.f415611g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        m0Var.f415612h = aVar2.k(intValue);
        return 0;
    }
}
