package r45;

/* loaded from: classes8.dex */
public class a85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369819e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f369820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f369821g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369822h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369823i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369824m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369825n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a85)) {
            return false;
        }
        r45.a85 a85Var = (r45.a85) fVar;
        return n51.f.a(this.f369818d, a85Var.f369818d) && n51.f.a(this.f369819e, a85Var.f369819e) && n51.f.a(java.lang.Boolean.valueOf(this.f369820f), java.lang.Boolean.valueOf(a85Var.f369820f)) && n51.f.a(java.lang.Boolean.valueOf(this.f369821g), java.lang.Boolean.valueOf(a85Var.f369821g)) && n51.f.a(this.f369822h, a85Var.f369822h) && n51.f.a(this.f369823i, a85Var.f369823i) && n51.f.a(this.f369824m, a85Var.f369824m) && n51.f.a(this.f369825n, a85Var.f369825n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369818d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369819e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f369820f);
            fVar.a(4, this.f369821g);
            java.lang.String str3 = this.f369822h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f369823i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f369824m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f369825n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f369818d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f369819e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int a17 = j17 + b36.f.a(3, this.f369820f) + b36.f.a(4, this.f369821g);
            java.lang.String str9 = this.f369822h;
            if (str9 != null) {
                a17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f369823i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f369824m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f369825n;
            return str12 != null ? a17 + b36.f.j(8, str12) : a17;
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
        r45.a85 a85Var = (r45.a85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a85Var.f369818d = aVar2.k(intValue);
                return 0;
            case 2:
                a85Var.f369819e = aVar2.k(intValue);
                return 0;
            case 3:
                a85Var.f369820f = aVar2.c(intValue);
                return 0;
            case 4:
                a85Var.f369821g = aVar2.c(intValue);
                return 0;
            case 5:
                a85Var.f369822h = aVar2.k(intValue);
                return 0;
            case 6:
                a85Var.f369823i = aVar2.k(intValue);
                return 0;
            case 7:
                a85Var.f369824m = aVar2.k(intValue);
                return 0;
            case 8:
                a85Var.f369825n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
