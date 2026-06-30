package r45;

/* loaded from: classes7.dex */
public class dm3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f372560d;

    /* renamed from: e, reason: collision with root package name */
    public int f372561e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372562f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372564h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372565i;

    /* renamed from: m, reason: collision with root package name */
    public int f372566m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f372567n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f372568o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm3)) {
            return false;
        }
        r45.dm3 dm3Var = (r45.dm3) fVar;
        return n51.f.a(this.BaseResponse, dm3Var.BaseResponse) && n51.f.a(this.f372560d, dm3Var.f372560d) && n51.f.a(java.lang.Integer.valueOf(this.f372561e), java.lang.Integer.valueOf(dm3Var.f372561e)) && n51.f.a(this.f372562f, dm3Var.f372562f) && n51.f.a(this.f372563g, dm3Var.f372563g) && n51.f.a(this.f372564h, dm3Var.f372564h) && n51.f.a(this.f372565i, dm3Var.f372565i) && n51.f.a(java.lang.Integer.valueOf(this.f372566m), java.lang.Integer.valueOf(dm3Var.f372566m)) && n51.f.a(this.f372567n, dm3Var.f372567n) && n51.f.a(java.lang.Integer.valueOf(this.f372568o), java.lang.Integer.valueOf(dm3Var.f372568o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372567n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f372560d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f372560d.writeFields(fVar);
            }
            fVar.e(5, this.f372561e);
            java.lang.String str = this.f372562f;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f372563g;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f372564h;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f372565i;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f372566m);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f372568o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f372560d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f372561e);
            java.lang.String str5 = this.f372562f;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f372563g;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f372564h;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f372565i;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            return e17 + b36.f.e(10, this.f372566m) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f372568o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.dm3 dm3Var = (r45.dm3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                dm3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var3.b(bArr3);
                }
                dm3Var.f372560d = cu5Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 5:
                dm3Var.f372561e = aVar2.g(intValue);
                return 0;
            case 6:
                dm3Var.f372562f = aVar2.k(intValue);
                return 0;
            case 7:
                dm3Var.f372563g = aVar2.k(intValue);
                return 0;
            case 8:
                dm3Var.f372564h = aVar2.k(intValue);
                return 0;
            case 9:
                dm3Var.f372565i = aVar2.k(intValue);
                return 0;
            case 10:
                dm3Var.f372566m = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xf5 xf5Var = new r45.xf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        xf5Var.parseFrom(bArr4);
                    }
                    dm3Var.f372567n.add(xf5Var);
                }
                return 0;
            case 12:
                dm3Var.f372568o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
