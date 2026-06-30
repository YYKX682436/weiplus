package r45;

/* loaded from: classes2.dex */
public class n1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380984e;

    /* renamed from: f, reason: collision with root package name */
    public int f380985f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380986g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380987h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n1)) {
            return false;
        }
        r45.n1 n1Var = (r45.n1) fVar;
        return n51.f.a(this.f380983d, n1Var.f380983d) && n51.f.a(this.f380984e, n1Var.f380984e) && n51.f.a(java.lang.Integer.valueOf(this.f380985f), java.lang.Integer.valueOf(n1Var.f380985f)) && n51.f.a(this.f380986g, n1Var.f380986g) && n51.f.a(this.f380987h, n1Var.f380987h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380983d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380984e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380985f);
            java.lang.String str3 = this.f380986g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380987h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f380983d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f380984e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f380985f);
            java.lang.String str7 = this.f380986g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f380987h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.n1 n1Var = (r45.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n1Var.f380983d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n1Var.f380984e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            n1Var.f380985f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            n1Var.f380986g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        n1Var.f380987h = aVar2.k(intValue);
        return 0;
    }
}
