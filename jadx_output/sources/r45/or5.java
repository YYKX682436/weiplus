package r45;

/* loaded from: classes9.dex */
public class or5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382465e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382466f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382467g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382468h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382469i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382470m;

    /* renamed from: n, reason: collision with root package name */
    public r45.h7 f382471n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.or5)) {
            return false;
        }
        r45.or5 or5Var = (r45.or5) fVar;
        return n51.f.a(this.BaseResponse, or5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382464d), java.lang.Integer.valueOf(or5Var.f382464d)) && n51.f.a(this.f382465e, or5Var.f382465e) && n51.f.a(this.f382466f, or5Var.f382466f) && n51.f.a(this.f382467g, or5Var.f382467g) && n51.f.a(this.f382468h, or5Var.f382468h) && n51.f.a(this.f382469i, or5Var.f382469i) && n51.f.a(this.f382470m, or5Var.f382470m) && n51.f.a(this.f382471n, or5Var.f382471n);
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
            fVar.e(2, this.f382464d);
            java.lang.String str = this.f382465e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f382466f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f382467g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f382468h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f382469i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f382470m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            r45.h7 h7Var = this.f382471n;
            if (h7Var != null) {
                fVar.i(9, h7Var.computeSize());
                this.f382471n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382464d);
            java.lang.String str7 = this.f382465e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f382466f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f382467g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f382468h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f382469i;
            if (str11 != null) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f382470m;
            if (str12 != null) {
                i18 += b36.f.j(8, str12);
            }
            r45.h7 h7Var2 = this.f382471n;
            return h7Var2 != null ? i18 + b36.f.i(9, h7Var2.computeSize()) : i18;
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
        r45.or5 or5Var = (r45.or5) objArr[1];
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
                    or5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                or5Var.f382464d = aVar2.g(intValue);
                return 0;
            case 3:
                or5Var.f382465e = aVar2.k(intValue);
                return 0;
            case 4:
                or5Var.f382466f = aVar2.k(intValue);
                return 0;
            case 5:
                or5Var.f382467g = aVar2.k(intValue);
                return 0;
            case 6:
                or5Var.f382468h = aVar2.k(intValue);
                return 0;
            case 7:
                or5Var.f382469i = aVar2.k(intValue);
                return 0;
            case 8:
                or5Var.f382470m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.h7 h7Var3 = new r45.h7();
                    if (bArr2 != null && bArr2.length > 0) {
                        h7Var3.parseFrom(bArr2);
                    }
                    or5Var.f382471n = h7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
