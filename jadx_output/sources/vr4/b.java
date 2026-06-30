package vr4;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public vr4.u0 f439680d;

    /* renamed from: e, reason: collision with root package name */
    public int f439681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439683g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439684h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f439685i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f439686m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f439687n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f439688o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.b)) {
            return false;
        }
        vr4.b bVar = (vr4.b) fVar;
        return n51.f.a(this.f439680d, bVar.f439680d) && n51.f.a(java.lang.Integer.valueOf(this.f439681e), java.lang.Integer.valueOf(bVar.f439681e)) && n51.f.a(this.f439682f, bVar.f439682f) && n51.f.a(this.f439683g, bVar.f439683g) && n51.f.a(this.f439684h, bVar.f439684h) && n51.f.a(this.f439685i, bVar.f439685i) && n51.f.a(this.f439686m, bVar.f439686m) && n51.f.a(this.f439687n, bVar.f439687n) && n51.f.a(this.f439688o, bVar.f439688o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            vr4.u0 u0Var = this.f439680d;
            if (u0Var != null) {
                fVar.i(1, u0Var.computeSize());
                this.f439680d.writeFields(fVar);
            }
            fVar.e(2, this.f439681e);
            java.lang.String str = this.f439682f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f439683g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f439684h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f439685i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f439686m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f439687n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f439688o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            vr4.u0 u0Var2 = this.f439680d;
            int i18 = (u0Var2 != null ? 0 + b36.f.i(1, u0Var2.computeSize()) : 0) + b36.f.e(2, this.f439681e);
            java.lang.String str8 = this.f439682f;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f439683g;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f439684h;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f439685i;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f439686m;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f439687n;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f439688o;
            return str14 != null ? i18 + b36.f.j(9, str14) : i18;
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
        vr4.b bVar = (vr4.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    vr4.u0 u0Var3 = new vr4.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.parseFrom(bArr);
                    }
                    bVar.f439680d = u0Var3;
                }
                return 0;
            case 2:
                bVar.f439681e = aVar2.g(intValue);
                return 0;
            case 3:
                bVar.f439682f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f439683g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f439684h = aVar2.k(intValue);
                return 0;
            case 6:
                bVar.f439685i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f439686m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f439687n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f439688o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
