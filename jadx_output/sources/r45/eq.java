package r45;

/* loaded from: classes8.dex */
public class eq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373664g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373665h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373666i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373667m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373668n;

    /* renamed from: o, reason: collision with root package name */
    public int f373669o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eq)) {
            return false;
        }
        r45.eq eqVar = (r45.eq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373661d), java.lang.Integer.valueOf(eqVar.f373661d)) && n51.f.a(this.f373662e, eqVar.f373662e) && n51.f.a(this.f373663f, eqVar.f373663f) && n51.f.a(this.f373664g, eqVar.f373664g) && n51.f.a(this.f373665h, eqVar.f373665h) && n51.f.a(this.f373666i, eqVar.f373666i) && n51.f.a(this.f373667m, eqVar.f373667m) && n51.f.a(this.f373668n, eqVar.f373668n) && n51.f.a(java.lang.Integer.valueOf(this.f373669o), java.lang.Integer.valueOf(eqVar.f373669o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373661d);
            java.lang.String str = this.f373662e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373663f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f373664g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f373665h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f373666i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f373667m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f373668n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f373669o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373661d) + 0;
            java.lang.String str8 = this.f373662e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f373663f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f373664g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f373665h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f373666i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f373667m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f373668n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.e(9, this.f373669o);
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
        r45.eq eqVar = (r45.eq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eqVar.f373661d = aVar2.g(intValue);
                return 0;
            case 2:
                eqVar.f373662e = aVar2.k(intValue);
                return 0;
            case 3:
                eqVar.f373663f = aVar2.k(intValue);
                return 0;
            case 4:
                eqVar.f373664g = aVar2.k(intValue);
                return 0;
            case 5:
                eqVar.f373665h = aVar2.k(intValue);
                return 0;
            case 6:
                eqVar.f373666i = aVar2.k(intValue);
                return 0;
            case 7:
                eqVar.f373667m = aVar2.k(intValue);
                return 0;
            case 8:
                eqVar.f373668n = aVar2.k(intValue);
                return 0;
            case 9:
                eqVar.f373669o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
