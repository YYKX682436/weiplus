package r45;

/* loaded from: classes9.dex */
public class fs extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374578e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q34 f374579f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374580g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374581h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374582i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374583m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374584n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fs)) {
            return false;
        }
        r45.fs fsVar = (r45.fs) fVar;
        return n51.f.a(this.BaseResponse, fsVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374577d), java.lang.Integer.valueOf(fsVar.f374577d)) && n51.f.a(this.f374578e, fsVar.f374578e) && n51.f.a(this.f374579f, fsVar.f374579f) && n51.f.a(this.f374580g, fsVar.f374580g) && n51.f.a(this.f374581h, fsVar.f374581h) && n51.f.a(this.f374582i, fsVar.f374582i) && n51.f.a(this.f374583m, fsVar.f374583m) && n51.f.a(this.f374584n, fsVar.f374584n);
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
            fVar.e(2, this.f374577d);
            java.lang.String str = this.f374578e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.q34 q34Var = this.f374579f;
            if (q34Var != null) {
                fVar.i(4, q34Var.computeSize());
                this.f374579f.writeFields(fVar);
            }
            java.lang.String str2 = this.f374580g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f374581h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f374582i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f374583m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f374584n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374577d);
            java.lang.String str7 = this.f374578e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            r45.q34 q34Var2 = this.f374579f;
            if (q34Var2 != null) {
                i18 += b36.f.i(4, q34Var2.computeSize());
            }
            java.lang.String str8 = this.f374580g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f374581h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f374582i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f374583m;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f374584n;
            return str12 != null ? i18 + b36.f.j(9, str12) : i18;
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
        r45.fs fsVar = (r45.fs) objArr[1];
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
                    fsVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fsVar.f374577d = aVar2.g(intValue);
                return 0;
            case 3:
                fsVar.f374578e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.q34 q34Var3 = new r45.q34();
                    if (bArr2 != null && bArr2.length > 0) {
                        q34Var3.parseFrom(bArr2);
                    }
                    fsVar.f374579f = q34Var3;
                }
                return 0;
            case 5:
                fsVar.f374580g = aVar2.k(intValue);
                return 0;
            case 6:
                fsVar.f374581h = aVar2.k(intValue);
                return 0;
            case 7:
                fsVar.f374582i = aVar2.k(intValue);
                return 0;
            case 8:
                fsVar.f374583m = aVar2.k(intValue);
                return 0;
            case 9:
                fsVar.f374584n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
