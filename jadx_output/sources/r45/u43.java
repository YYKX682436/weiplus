package r45;

/* loaded from: classes8.dex */
public class u43 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387010f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387011g;

    /* renamed from: h, reason: collision with root package name */
    public int f387012h;

    /* renamed from: i, reason: collision with root package name */
    public int f387013i;

    /* renamed from: m, reason: collision with root package name */
    public int f387014m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387015n;

    /* renamed from: o, reason: collision with root package name */
    public int f387016o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387017p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f387018q;

    /* renamed from: d, reason: collision with root package name */
    public int f387008d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387009e = "ok";

    /* renamed from: r, reason: collision with root package name */
    public boolean f387019r = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u43)) {
            return false;
        }
        r45.u43 u43Var = (r45.u43) fVar;
        return n51.f.a(this.BaseResponse, u43Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387008d), java.lang.Integer.valueOf(u43Var.f387008d)) && n51.f.a(this.f387009e, u43Var.f387009e) && n51.f.a(this.f387010f, u43Var.f387010f) && n51.f.a(this.f387011g, u43Var.f387011g) && n51.f.a(java.lang.Integer.valueOf(this.f387012h), java.lang.Integer.valueOf(u43Var.f387012h)) && n51.f.a(java.lang.Integer.valueOf(this.f387013i), java.lang.Integer.valueOf(u43Var.f387013i)) && n51.f.a(java.lang.Integer.valueOf(this.f387014m), java.lang.Integer.valueOf(u43Var.f387014m)) && n51.f.a(this.f387015n, u43Var.f387015n) && n51.f.a(java.lang.Integer.valueOf(this.f387016o), java.lang.Integer.valueOf(u43Var.f387016o)) && n51.f.a(this.f387017p, u43Var.f387017p) && n51.f.a(this.f387018q, u43Var.f387018q) && n51.f.a(java.lang.Boolean.valueOf(this.f387019r), java.lang.Boolean.valueOf(u43Var.f387019r));
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
            fVar.e(2, this.f387008d);
            java.lang.String str = this.f387009e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387010f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387011g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f387012h);
            fVar.e(7, this.f387013i);
            fVar.e(8, this.f387014m);
            java.lang.String str4 = this.f387015n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f387016o);
            java.lang.String str5 = this.f387017p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f387018q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            fVar.a(13, this.f387019r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387008d);
            java.lang.String str7 = this.f387009e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f387010f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f387011g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f387012h) + b36.f.e(7, this.f387013i) + b36.f.e(8, this.f387014m);
            java.lang.String str10 = this.f387015n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f387016o);
            java.lang.String str11 = this.f387017p;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f387018q;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            return e18 + b36.f.a(13, this.f387019r);
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
        r45.u43 u43Var = (r45.u43) objArr[1];
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
                    u43Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                u43Var.f387008d = aVar2.g(intValue);
                return 0;
            case 3:
                u43Var.f387009e = aVar2.k(intValue);
                return 0;
            case 4:
                u43Var.f387010f = aVar2.k(intValue);
                return 0;
            case 5:
                u43Var.f387011g = aVar2.k(intValue);
                return 0;
            case 6:
                u43Var.f387012h = aVar2.g(intValue);
                return 0;
            case 7:
                u43Var.f387013i = aVar2.g(intValue);
                return 0;
            case 8:
                u43Var.f387014m = aVar2.g(intValue);
                return 0;
            case 9:
                u43Var.f387015n = aVar2.k(intValue);
                return 0;
            case 10:
                u43Var.f387016o = aVar2.g(intValue);
                return 0;
            case 11:
                u43Var.f387017p = aVar2.k(intValue);
                return 0;
            case 12:
                u43Var.f387018q = aVar2.k(intValue);
                return 0;
            case 13:
                u43Var.f387019r = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
