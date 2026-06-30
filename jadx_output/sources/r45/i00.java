package r45;

/* loaded from: classes7.dex */
public class i00 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc7 f376603d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f376604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376606g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f376607h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376608i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376609m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376610n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376611o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i00)) {
            return false;
        }
        r45.i00 i00Var = (r45.i00) fVar;
        return n51.f.a(this.BaseResponse, i00Var.BaseResponse) && n51.f.a(this.f376603d, i00Var.f376603d) && n51.f.a(java.lang.Boolean.valueOf(this.f376604e), java.lang.Boolean.valueOf(i00Var.f376604e)) && n51.f.a(this.f376605f, i00Var.f376605f) && n51.f.a(this.f376606g, i00Var.f376606g) && n51.f.a(java.lang.Boolean.valueOf(this.f376607h), java.lang.Boolean.valueOf(i00Var.f376607h)) && n51.f.a(this.f376608i, i00Var.f376608i) && n51.f.a(this.f376609m, i00Var.f376609m) && n51.f.a(this.f376610n, i00Var.f376610n) && n51.f.a(this.f376611o, i00Var.f376611o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.bc7 bc7Var = this.f376603d;
            if (bc7Var != null) {
                fVar.i(2, bc7Var.computeSize());
                this.f376603d.writeFields(fVar);
            }
            fVar.a(3, this.f376604e);
            java.lang.String str = this.f376605f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f376606g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f376607h);
            java.lang.String str3 = this.f376608i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f376609m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f376610n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f376611o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.bc7 bc7Var2 = this.f376603d;
            if (bc7Var2 != null) {
                i18 += b36.f.i(2, bc7Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(3, this.f376604e);
            java.lang.String str7 = this.f376605f;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f376606g;
            if (str8 != null) {
                a17 += b36.f.j(5, str8);
            }
            int a18 = a17 + b36.f.a(6, this.f376607h);
            java.lang.String str9 = this.f376608i;
            if (str9 != null) {
                a18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f376609m;
            if (str10 != null) {
                a18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f376610n;
            if (str11 != null) {
                a18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f376611o;
            return str12 != null ? a18 + b36.f.j(10, str12) : a18;
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
        r45.i00 i00Var = (r45.i00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    i00Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.bc7 bc7Var3 = new r45.bc7();
                    if (bArr2 != null && bArr2.length > 0) {
                        bc7Var3.parseFrom(bArr2);
                    }
                    i00Var.f376603d = bc7Var3;
                }
                return 0;
            case 3:
                i00Var.f376604e = aVar2.c(intValue);
                return 0;
            case 4:
                i00Var.f376605f = aVar2.k(intValue);
                return 0;
            case 5:
                i00Var.f376606g = aVar2.k(intValue);
                return 0;
            case 6:
                i00Var.f376607h = aVar2.c(intValue);
                return 0;
            case 7:
                i00Var.f376608i = aVar2.k(intValue);
                return 0;
            case 8:
                i00Var.f376609m = aVar2.k(intValue);
                return 0;
            case 9:
                i00Var.f376610n = aVar2.k(intValue);
                return 0;
            case 10:
                i00Var.f376611o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
