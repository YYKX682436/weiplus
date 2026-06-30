package r45;

/* loaded from: classes12.dex */
public class m35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380115d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380116e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380117f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380118g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380119h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380120i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380121m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380122n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380123o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380124p;

    /* renamed from: q, reason: collision with root package name */
    public long f380125q;

    static {
        new r45.m35();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.m35 parseFrom(byte[] bArr) {
        return (r45.m35) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m35)) {
            return false;
        }
        r45.m35 m35Var = (r45.m35) fVar;
        return n51.f.a(this.f380115d, m35Var.f380115d) && n51.f.a(this.f380116e, m35Var.f380116e) && n51.f.a(this.f380117f, m35Var.f380117f) && n51.f.a(this.f380118g, m35Var.f380118g) && n51.f.a(this.f380119h, m35Var.f380119h) && n51.f.a(this.f380120i, m35Var.f380120i) && n51.f.a(this.f380121m, m35Var.f380121m) && n51.f.a(this.f380122n, m35Var.f380122n) && n51.f.a(this.f380123o, m35Var.f380123o) && n51.f.a(this.f380124p, m35Var.f380124p) && n51.f.a(java.lang.Long.valueOf(this.f380125q), java.lang.Long.valueOf(m35Var.f380125q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.m35();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380115d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380116e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380117f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380118g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f380119h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f380120i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f380121m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f380122n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f380123o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f380124p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            fVar.h(11, this.f380125q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f380115d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f380116e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f380117f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f380118g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f380119h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f380120i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f380121m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f380122n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f380123o;
            if (str19 != null) {
                j17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f380124p;
            if (str20 != null) {
                j17 += b36.f.j(10, str20);
            }
            return j17 + b36.f.h(11, this.f380125q);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f380115d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f380116e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f380117f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f380118g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f380119h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f380120i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f380121m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f380122n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f380123o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f380124p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f380125q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
