package r45;

/* loaded from: classes9.dex */
public class xi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390138e;

    /* renamed from: f, reason: collision with root package name */
    public int f390139f;

    /* renamed from: g, reason: collision with root package name */
    public int f390140g;

    /* renamed from: h, reason: collision with root package name */
    public r45.i45 f390141h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j45 f390142i;

    /* renamed from: m, reason: collision with root package name */
    public r45.j45 f390143m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k45 f390144n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi3)) {
            return false;
        }
        r45.xi3 xi3Var = (r45.xi3) fVar;
        return n51.f.a(this.BaseResponse, xi3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390137d), java.lang.Integer.valueOf(xi3Var.f390137d)) && n51.f.a(this.f390138e, xi3Var.f390138e) && n51.f.a(java.lang.Integer.valueOf(this.f390139f), java.lang.Integer.valueOf(xi3Var.f390139f)) && n51.f.a(java.lang.Integer.valueOf(this.f390140g), java.lang.Integer.valueOf(xi3Var.f390140g)) && n51.f.a(this.f390141h, xi3Var.f390141h) && n51.f.a(this.f390142i, xi3Var.f390142i) && n51.f.a(this.f390143m, xi3Var.f390143m) && n51.f.a(this.f390144n, xi3Var.f390144n);
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
            fVar.e(2, this.f390137d);
            java.lang.String str = this.f390138e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f390139f);
            fVar.e(5, this.f390140g);
            r45.i45 i45Var = this.f390141h;
            if (i45Var != null) {
                fVar.i(6, i45Var.computeSize());
                this.f390141h.writeFields(fVar);
            }
            r45.j45 j45Var = this.f390142i;
            if (j45Var != null) {
                fVar.i(7, j45Var.computeSize());
                this.f390142i.writeFields(fVar);
            }
            r45.j45 j45Var2 = this.f390143m;
            if (j45Var2 != null) {
                fVar.i(8, j45Var2.computeSize());
                this.f390143m.writeFields(fVar);
            }
            r45.k45 k45Var = this.f390144n;
            if (k45Var != null) {
                fVar.i(9, k45Var.computeSize());
                this.f390144n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390137d);
            java.lang.String str2 = this.f390138e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f390139f) + b36.f.e(5, this.f390140g);
            r45.i45 i45Var2 = this.f390141h;
            if (i45Var2 != null) {
                e17 += b36.f.i(6, i45Var2.computeSize());
            }
            r45.j45 j45Var3 = this.f390142i;
            if (j45Var3 != null) {
                e17 += b36.f.i(7, j45Var3.computeSize());
            }
            r45.j45 j45Var4 = this.f390143m;
            if (j45Var4 != null) {
                e17 += b36.f.i(8, j45Var4.computeSize());
            }
            r45.k45 k45Var2 = this.f390144n;
            return k45Var2 != null ? e17 + b36.f.i(9, k45Var2.computeSize()) : e17;
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
        r45.xi3 xi3Var = (r45.xi3) objArr[1];
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
                    xi3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xi3Var.f390137d = aVar2.g(intValue);
                return 0;
            case 3:
                xi3Var.f390138e = aVar2.k(intValue);
                return 0;
            case 4:
                xi3Var.f390139f = aVar2.g(intValue);
                return 0;
            case 5:
                xi3Var.f390140g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.i45 i45Var3 = new r45.i45();
                    if (bArr2 != null && bArr2.length > 0) {
                        i45Var3.parseFrom(bArr2);
                    }
                    xi3Var.f390141h = i45Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.j45 j45Var5 = new r45.j45();
                    if (bArr3 != null && bArr3.length > 0) {
                        j45Var5.parseFrom(bArr3);
                    }
                    xi3Var.f390142i = j45Var5;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.j45 j45Var6 = new r45.j45();
                    if (bArr4 != null && bArr4.length > 0) {
                        j45Var6.parseFrom(bArr4);
                    }
                    xi3Var.f390143m = j45Var6;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.k45 k45Var3 = new r45.k45();
                    if (bArr5 != null && bArr5.length > 0) {
                        k45Var3.parseFrom(bArr5);
                    }
                    xi3Var.f390144n = k45Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
