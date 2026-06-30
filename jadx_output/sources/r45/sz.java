package r45;

/* loaded from: classes4.dex */
public class sz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386024d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386025e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386026f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386027g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386028h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386029i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e77 f386030m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sz)) {
            return false;
        }
        r45.sz szVar = (r45.sz) fVar;
        return n51.f.a(this.BaseResponse, szVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386024d), java.lang.Integer.valueOf(szVar.f386024d)) && n51.f.a(this.f386025e, szVar.f386025e) && n51.f.a(this.f386026f, szVar.f386026f) && n51.f.a(this.f386027g, szVar.f386027g) && n51.f.a(this.f386028h, szVar.f386028h) && n51.f.a(this.f386029i, szVar.f386029i) && n51.f.a(this.f386030m, szVar.f386030m);
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
            fVar.e(2, this.f386024d);
            java.lang.String str = this.f386025e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386026f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386027g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f386028h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f386029i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.e77 e77Var = this.f386030m;
            if (e77Var != null) {
                fVar.i(8, e77Var.computeSize());
                this.f386030m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f386024d);
            java.lang.String str6 = this.f386025e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386026f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386027g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f386028h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f386029i;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            r45.e77 e77Var2 = this.f386030m;
            return e77Var2 != null ? i18 + b36.f.i(8, e77Var2.computeSize()) : i18;
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
        r45.sz szVar = (r45.sz) objArr[1];
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
                    szVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                szVar.f386024d = aVar2.g(intValue);
                return 0;
            case 3:
                szVar.f386025e = aVar2.k(intValue);
                return 0;
            case 4:
                szVar.f386026f = aVar2.k(intValue);
                return 0;
            case 5:
                szVar.f386027g = aVar2.k(intValue);
                return 0;
            case 6:
                szVar.f386028h = aVar2.k(intValue);
                return 0;
            case 7:
                szVar.f386029i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e77 e77Var3 = new r45.e77();
                    if (bArr2 != null && bArr2.length > 0) {
                        e77Var3.parseFrom(bArr2);
                    }
                    szVar.f386030m = e77Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
