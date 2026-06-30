package r45;

/* loaded from: classes8.dex */
public class xg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390076d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390079g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e1 f390080h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bm6 f390081i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ra5 f390082m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390083n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390084o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xg5)) {
            return false;
        }
        r45.xg5 xg5Var = (r45.xg5) fVar;
        return n51.f.a(this.BaseResponse, xg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390076d), java.lang.Integer.valueOf(xg5Var.f390076d)) && n51.f.a(this.f390077e, xg5Var.f390077e) && n51.f.a(this.f390078f, xg5Var.f390078f) && n51.f.a(this.f390079g, xg5Var.f390079g) && n51.f.a(this.f390080h, xg5Var.f390080h) && n51.f.a(this.f390081i, xg5Var.f390081i) && n51.f.a(this.f390082m, xg5Var.f390082m) && n51.f.a(this.f390083n, xg5Var.f390083n) && n51.f.a(this.f390084o, xg5Var.f390084o);
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
            fVar.e(2, this.f390076d);
            java.lang.String str = this.f390077e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390078f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390079g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.e1 e1Var = this.f390080h;
            if (e1Var != null) {
                fVar.i(6, e1Var.computeSize());
                this.f390080h.writeFields(fVar);
            }
            r45.bm6 bm6Var = this.f390081i;
            if (bm6Var != null) {
                fVar.i(7, bm6Var.computeSize());
                this.f390081i.writeFields(fVar);
            }
            r45.ra5 ra5Var = this.f390082m;
            if (ra5Var != null) {
                fVar.i(8, ra5Var.computeSize());
                this.f390082m.writeFields(fVar);
            }
            java.lang.String str4 = this.f390083n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f390084o;
            if (str5 != null) {
                fVar.j(100, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390076d);
            java.lang.String str6 = this.f390077e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f390078f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f390079g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            r45.e1 e1Var2 = this.f390080h;
            if (e1Var2 != null) {
                i18 += b36.f.i(6, e1Var2.computeSize());
            }
            r45.bm6 bm6Var2 = this.f390081i;
            if (bm6Var2 != null) {
                i18 += b36.f.i(7, bm6Var2.computeSize());
            }
            r45.ra5 ra5Var2 = this.f390082m;
            if (ra5Var2 != null) {
                i18 += b36.f.i(8, ra5Var2.computeSize());
            }
            java.lang.String str9 = this.f390083n;
            if (str9 != null) {
                i18 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f390084o;
            return str10 != null ? i18 + b36.f.j(100, str10) : i18;
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
        r45.xg5 xg5Var = (r45.xg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            xg5Var.f390084o = aVar2.k(intValue);
            return 0;
        }
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
                    xg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xg5Var.f390076d = aVar2.g(intValue);
                return 0;
            case 3:
                xg5Var.f390077e = aVar2.k(intValue);
                return 0;
            case 4:
                xg5Var.f390078f = aVar2.k(intValue);
                return 0;
            case 5:
                xg5Var.f390079g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e1 e1Var3 = new r45.e1();
                    if (bArr2 != null && bArr2.length > 0) {
                        e1Var3.parseFrom(bArr2);
                    }
                    xg5Var.f390080h = e1Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bm6 bm6Var3 = new r45.bm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        bm6Var3.parseFrom(bArr3);
                    }
                    xg5Var.f390081i = bm6Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ra5 ra5Var3 = new r45.ra5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ra5Var3.parseFrom(bArr4);
                    }
                    xg5Var.f390082m = ra5Var3;
                }
                return 0;
            case 9:
                xg5Var.f390083n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
