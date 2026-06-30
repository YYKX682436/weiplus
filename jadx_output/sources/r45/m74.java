package r45;

/* loaded from: classes9.dex */
public class m74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380181d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380184g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380185h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380186i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380187m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380188n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m74)) {
            return false;
        }
        r45.m74 m74Var = (r45.m74) fVar;
        return n51.f.a(this.f380181d, m74Var.f380181d) && n51.f.a(this.f380182e, m74Var.f380182e) && n51.f.a(this.f380183f, m74Var.f380183f) && n51.f.a(this.f380184g, m74Var.f380184g) && n51.f.a(this.f380185h, m74Var.f380185h) && n51.f.a(this.f380186i, m74Var.f380186i) && n51.f.a(this.f380187m, m74Var.f380187m) && n51.f.a(this.f380188n, m74Var.f380188n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380181d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380182e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380183f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380184g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f380185h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f380186i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f380187m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f380188n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f380181d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f380182e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f380183f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f380184g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f380185h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f380186i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f380187m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f380188n;
            return str16 != null ? j17 + b36.f.j(8, str16) : j17;
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
        r45.m74 m74Var = (r45.m74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m74Var.f380181d = aVar2.k(intValue);
                return 0;
            case 2:
                m74Var.f380182e = aVar2.k(intValue);
                return 0;
            case 3:
                m74Var.f380183f = aVar2.k(intValue);
                return 0;
            case 4:
                m74Var.f380184g = aVar2.k(intValue);
                return 0;
            case 5:
                m74Var.f380185h = aVar2.k(intValue);
                return 0;
            case 6:
                m74Var.f380186i = aVar2.k(intValue);
                return 0;
            case 7:
                m74Var.f380187m = aVar2.k(intValue);
                return 0;
            case 8:
                m74Var.f380188n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
