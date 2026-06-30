package r45;

/* loaded from: classes12.dex */
public class m87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380250d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380251e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380252f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380253g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380254h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380255i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380256m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380257n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380258o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m87)) {
            return false;
        }
        r45.m87 m87Var = (r45.m87) fVar;
        return n51.f.a(this.f380250d, m87Var.f380250d) && n51.f.a(this.f380251e, m87Var.f380251e) && n51.f.a(this.f380252f, m87Var.f380252f) && n51.f.a(this.f380253g, m87Var.f380253g) && n51.f.a(this.f380254h, m87Var.f380254h) && n51.f.a(this.f380255i, m87Var.f380255i) && n51.f.a(this.f380256m, m87Var.f380256m) && n51.f.a(this.f380257n, m87Var.f380257n) && n51.f.a(this.f380258o, m87Var.f380258o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380250d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380251e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380252f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380253g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f380254h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f380255i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f380256m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f380257n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f380258o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f380250d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f380251e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f380252f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f380253g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f380254h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f380255i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f380256m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f380257n;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f380258o;
            return str18 != null ? j17 + b36.f.j(9, str18) : j17;
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
        r45.m87 m87Var = (r45.m87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m87Var.f380250d = aVar2.k(intValue);
                return 0;
            case 2:
                m87Var.f380251e = aVar2.k(intValue);
                return 0;
            case 3:
                m87Var.f380252f = aVar2.k(intValue);
                return 0;
            case 4:
                m87Var.f380253g = aVar2.k(intValue);
                return 0;
            case 5:
                m87Var.f380254h = aVar2.k(intValue);
                return 0;
            case 6:
                m87Var.f380255i = aVar2.k(intValue);
                return 0;
            case 7:
                m87Var.f380256m = aVar2.k(intValue);
                return 0;
            case 8:
                m87Var.f380257n = aVar2.k(intValue);
                return 0;
            case 9:
                m87Var.f380258o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
