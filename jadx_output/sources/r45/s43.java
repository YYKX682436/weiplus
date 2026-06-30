package r45;

/* loaded from: classes9.dex */
public class s43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385493d;

    /* renamed from: e, reason: collision with root package name */
    public int f385494e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385495f;

    /* renamed from: g, reason: collision with root package name */
    public int f385496g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385497h;

    /* renamed from: i, reason: collision with root package name */
    public int f385498i;

    /* renamed from: m, reason: collision with root package name */
    public int f385499m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s43)) {
            return false;
        }
        r45.s43 s43Var = (r45.s43) fVar;
        return n51.f.a(this.f385493d, s43Var.f385493d) && n51.f.a(java.lang.Integer.valueOf(this.f385494e), java.lang.Integer.valueOf(s43Var.f385494e)) && n51.f.a(this.f385495f, s43Var.f385495f) && n51.f.a(java.lang.Integer.valueOf(this.f385496g), java.lang.Integer.valueOf(s43Var.f385496g)) && n51.f.a(this.f385497h, s43Var.f385497h) && n51.f.a(java.lang.Integer.valueOf(this.f385498i), java.lang.Integer.valueOf(s43Var.f385498i)) && n51.f.a(java.lang.Integer.valueOf(this.f385499m), java.lang.Integer.valueOf(s43Var.f385499m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385493d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f385494e);
            java.lang.String str2 = this.f385495f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f385496g);
            java.lang.String str3 = this.f385497h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f385498i);
            fVar.e(7, this.f385499m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385493d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f385494e);
            java.lang.String str5 = this.f385495f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f385496g);
            java.lang.String str6 = this.f385497h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f385498i) + b36.f.e(7, this.f385499m);
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
        r45.s43 s43Var = (r45.s43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s43Var.f385493d = aVar2.k(intValue);
                return 0;
            case 2:
                s43Var.f385494e = aVar2.g(intValue);
                return 0;
            case 3:
                s43Var.f385495f = aVar2.k(intValue);
                return 0;
            case 4:
                s43Var.f385496g = aVar2.g(intValue);
                return 0;
            case 5:
                s43Var.f385497h = aVar2.k(intValue);
                return 0;
            case 6:
                s43Var.f385498i = aVar2.g(intValue);
                return 0;
            case 7:
                s43Var.f385499m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
