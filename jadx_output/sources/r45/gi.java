package r45;

/* loaded from: classes11.dex */
public class gi extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375255d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f375256e;

    /* renamed from: f, reason: collision with root package name */
    public int f375257f;

    /* renamed from: g, reason: collision with root package name */
    public int f375258g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375259h;

    /* renamed from: i, reason: collision with root package name */
    public int f375260i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375261m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f375262n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f375263o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f375264p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hu5 f375265q;

    /* renamed from: r, reason: collision with root package name */
    public int f375266r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f375267s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi)) {
            return false;
        }
        r45.gi giVar = (r45.gi) fVar;
        return n51.f.a(this.BaseResponse, giVar.BaseResponse) && n51.f.a(this.f375255d, giVar.f375255d) && n51.f.a(this.f375256e, giVar.f375256e) && n51.f.a(java.lang.Integer.valueOf(this.f375257f), java.lang.Integer.valueOf(giVar.f375257f)) && n51.f.a(java.lang.Integer.valueOf(this.f375258g), java.lang.Integer.valueOf(giVar.f375258g)) && n51.f.a(this.f375259h, giVar.f375259h) && n51.f.a(java.lang.Integer.valueOf(this.f375260i), java.lang.Integer.valueOf(giVar.f375260i)) && n51.f.a(this.f375261m, giVar.f375261m) && n51.f.a(this.f375262n, giVar.f375262n) && n51.f.a(this.f375263o, giVar.f375263o) && n51.f.a(this.f375264p, giVar.f375264p) && n51.f.a(this.f375265q, giVar.f375265q) && n51.f.a(java.lang.Integer.valueOf(this.f375266r), java.lang.Integer.valueOf(giVar.f375266r)) && n51.f.a(this.f375267s, giVar.f375267s);
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
            java.lang.String str = this.f375255d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f375256e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f375256e.writeFields(fVar);
            }
            fVar.e(4, this.f375257f);
            fVar.e(5, this.f375258g);
            java.lang.String str2 = this.f375259h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f375260i);
            java.lang.String str3 = this.f375261m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.du5 du5Var = this.f375262n;
            if (du5Var != null) {
                fVar.i(9, du5Var.computeSize());
                this.f375262n.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f375263o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.computeSize());
                this.f375263o.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f375264p;
            if (cu5Var3 != null) {
                fVar.i(11, cu5Var3.computeSize());
                this.f375264p.writeFields(fVar);
            }
            r45.hu5 hu5Var = this.f375265q;
            if (hu5Var != null) {
                fVar.i(12, hu5Var.computeSize());
                this.f375265q.writeFields(fVar);
            }
            fVar.e(13, this.f375266r);
            r45.cu5 cu5Var4 = this.f375267s;
            if (cu5Var4 != null) {
                fVar.i(14, cu5Var4.computeSize());
                this.f375267s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str4 = this.f375255d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.cu5 cu5Var5 = this.f375256e;
            if (cu5Var5 != null) {
                i18 += b36.f.i(3, cu5Var5.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f375257f) + b36.f.e(5, this.f375258g);
            java.lang.String str5 = this.f375259h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f375260i);
            java.lang.String str6 = this.f375261m;
            if (str6 != null) {
                e18 += b36.f.j(8, str6);
            }
            r45.du5 du5Var2 = this.f375262n;
            if (du5Var2 != null) {
                e18 += b36.f.i(9, du5Var2.computeSize());
            }
            r45.cu5 cu5Var6 = this.f375263o;
            if (cu5Var6 != null) {
                e18 += b36.f.i(10, cu5Var6.computeSize());
            }
            r45.cu5 cu5Var7 = this.f375264p;
            if (cu5Var7 != null) {
                e18 += b36.f.i(11, cu5Var7.computeSize());
            }
            r45.hu5 hu5Var2 = this.f375265q;
            if (hu5Var2 != null) {
                e18 += b36.f.i(12, hu5Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(13, this.f375266r);
            r45.cu5 cu5Var8 = this.f375267s;
            return cu5Var8 != null ? e19 + b36.f.i(14, cu5Var8.computeSize()) : e19;
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
        r45.gi giVar = (r45.gi) objArr[1];
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
                    giVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                giVar.f375255d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var9.b(bArr2);
                    }
                    giVar.f375256e = cu5Var9;
                }
                return 0;
            case 4:
                giVar.f375257f = aVar2.g(intValue);
                return 0;
            case 5:
                giVar.f375258g = aVar2.g(intValue);
                return 0;
            case 6:
                giVar.f375259h = aVar2.k(intValue);
                return 0;
            case 7:
                giVar.f375260i = aVar2.g(intValue);
                return 0;
            case 8:
                giVar.f375261m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    giVar.f375262n = du5Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var10.b(bArr4);
                    }
                    giVar.f375263o = cu5Var10;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var11.b(bArr5);
                    }
                    giVar.f375264p = cu5Var11;
                }
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.hu5 hu5Var3 = new r45.hu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        hu5Var3.parseFrom(bArr6);
                    }
                    giVar.f375265q = hu5Var3;
                }
                return 0;
            case 13:
                giVar.f375266r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var12.b(bArr7);
                    }
                    giVar.f375267s = cu5Var12;
                }
                return 0;
            default:
                return -1;
        }
    }
}
