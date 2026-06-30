package r45;

/* loaded from: classes9.dex */
public class ti3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386465e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu f386466f;

    /* renamed from: g, reason: collision with root package name */
    public int f386467g;

    /* renamed from: h, reason: collision with root package name */
    public int f386468h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zt f386469i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xt f386470m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386471n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ti3)) {
            return false;
        }
        r45.ti3 ti3Var = (r45.ti3) fVar;
        return n51.f.a(this.BaseResponse, ti3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386464d), java.lang.Integer.valueOf(ti3Var.f386464d)) && n51.f.a(this.f386465e, ti3Var.f386465e) && n51.f.a(this.f386466f, ti3Var.f386466f) && n51.f.a(java.lang.Integer.valueOf(this.f386467g), java.lang.Integer.valueOf(ti3Var.f386467g)) && n51.f.a(java.lang.Integer.valueOf(this.f386468h), java.lang.Integer.valueOf(ti3Var.f386468h)) && n51.f.a(this.f386469i, ti3Var.f386469i) && n51.f.a(this.f386470m, ti3Var.f386470m) && n51.f.a(this.f386471n, ti3Var.f386471n);
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
            fVar.e(2, this.f386464d);
            java.lang.String str = this.f386465e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu cuVar = this.f386466f;
            if (cuVar != null) {
                fVar.i(4, cuVar.computeSize());
                this.f386466f.writeFields(fVar);
            }
            fVar.e(5, this.f386467g);
            fVar.e(6, this.f386468h);
            r45.zt ztVar = this.f386469i;
            if (ztVar != null) {
                fVar.i(7, ztVar.computeSize());
                this.f386469i.writeFields(fVar);
            }
            r45.xt xtVar = this.f386470m;
            if (xtVar != null) {
                fVar.i(8, xtVar.computeSize());
                this.f386470m.writeFields(fVar);
            }
            java.lang.String str2 = this.f386471n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f386464d);
            java.lang.String str3 = this.f386465e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.cu cuVar2 = this.f386466f;
            if (cuVar2 != null) {
                i18 += b36.f.i(4, cuVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f386467g) + b36.f.e(6, this.f386468h);
            r45.zt ztVar2 = this.f386469i;
            if (ztVar2 != null) {
                e17 += b36.f.i(7, ztVar2.computeSize());
            }
            r45.xt xtVar2 = this.f386470m;
            if (xtVar2 != null) {
                e17 += b36.f.i(8, xtVar2.computeSize());
            }
            java.lang.String str4 = this.f386471n;
            return str4 != null ? e17 + b36.f.j(9, str4) : e17;
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
        r45.ti3 ti3Var = (r45.ti3) objArr[1];
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
                    ti3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ti3Var.f386464d = aVar2.g(intValue);
                return 0;
            case 3:
                ti3Var.f386465e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu cuVar3 = new r45.cu();
                    if (bArr2 != null && bArr2.length > 0) {
                        cuVar3.parseFrom(bArr2);
                    }
                    ti3Var.f386466f = cuVar3;
                }
                return 0;
            case 5:
                ti3Var.f386467g = aVar2.g(intValue);
                return 0;
            case 6:
                ti3Var.f386468h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zt ztVar3 = new r45.zt();
                    if (bArr3 != null && bArr3.length > 0) {
                        ztVar3.parseFrom(bArr3);
                    }
                    ti3Var.f386469i = ztVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.xt xtVar3 = new r45.xt();
                    if (bArr4 != null && bArr4.length > 0) {
                        xtVar3.parseFrom(bArr4);
                    }
                    ti3Var.f386470m = xtVar3;
                }
                return 0;
            case 9:
                ti3Var.f386471n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
