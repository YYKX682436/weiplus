package r45;

/* loaded from: classes7.dex */
public class jd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377731d;

    /* renamed from: e, reason: collision with root package name */
    public int f377732e;

    /* renamed from: f, reason: collision with root package name */
    public int f377733f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377734g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377735h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377736i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd7)) {
            return false;
        }
        r45.jd7 jd7Var = (r45.jd7) fVar;
        return n51.f.a(this.f377731d, jd7Var.f377731d) && n51.f.a(java.lang.Integer.valueOf(this.f377732e), java.lang.Integer.valueOf(jd7Var.f377732e)) && n51.f.a(java.lang.Integer.valueOf(this.f377733f), java.lang.Integer.valueOf(jd7Var.f377733f)) && n51.f.a(this.f377734g, jd7Var.f377734g) && n51.f.a(this.f377735h, jd7Var.f377735h) && n51.f.a(this.f377736i, jd7Var.f377736i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377731d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377732e);
            fVar.e(3, this.f377733f);
            java.lang.String str2 = this.f377734g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377735h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377736i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f377731d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f377732e) + b36.f.e(3, this.f377733f);
            java.lang.String str6 = this.f377734g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f377735h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f377736i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.jd7 jd7Var = (r45.jd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jd7Var.f377731d = aVar2.k(intValue);
                return 0;
            case 2:
                jd7Var.f377732e = aVar2.g(intValue);
                return 0;
            case 3:
                jd7Var.f377733f = aVar2.g(intValue);
                return 0;
            case 4:
                jd7Var.f377734g = aVar2.k(intValue);
                return 0;
            case 5:
                jd7Var.f377735h = aVar2.k(intValue);
                return 0;
            case 6:
                jd7Var.f377736i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
