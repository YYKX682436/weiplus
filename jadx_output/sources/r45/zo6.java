package r45;

/* loaded from: classes9.dex */
public class zo6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f392255d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xf4 f392256e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yf4 f392257f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fu5 f392258g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zo6)) {
            return false;
        }
        r45.zo6 zo6Var = (r45.zo6) fVar;
        return n51.f.a(this.BaseResponse, zo6Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f392255d), java.lang.Boolean.valueOf(zo6Var.f392255d)) && n51.f.a(this.f392256e, zo6Var.f392256e) && n51.f.a(this.f392257f, zo6Var.f392257f) && n51.f.a(this.f392258g, zo6Var.f392258g);
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
            fVar.a(2, this.f392255d);
            r45.xf4 xf4Var = this.f392256e;
            if (xf4Var != null) {
                fVar.i(3, xf4Var.computeSize());
                this.f392256e.writeFields(fVar);
            }
            r45.yf4 yf4Var = this.f392257f;
            if (yf4Var != null) {
                fVar.i(4, yf4Var.computeSize());
                this.f392257f.writeFields(fVar);
            }
            r45.fu5 fu5Var = this.f392258g;
            if (fu5Var != null) {
                fVar.i(5, fu5Var.computeSize());
                this.f392258g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f392255d);
            r45.xf4 xf4Var2 = this.f392256e;
            if (xf4Var2 != null) {
                i18 += b36.f.i(3, xf4Var2.computeSize());
            }
            r45.yf4 yf4Var2 = this.f392257f;
            if (yf4Var2 != null) {
                i18 += b36.f.i(4, yf4Var2.computeSize());
            }
            r45.fu5 fu5Var2 = this.f392258g;
            return fu5Var2 != null ? i18 + b36.f.i(5, fu5Var2.computeSize()) : i18;
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
        r45.zo6 zo6Var = (r45.zo6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                zo6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            zo6Var.f392255d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.xf4 xf4Var3 = new r45.xf4();
                if (bArr2 != null && bArr2.length > 0) {
                    xf4Var3.parseFrom(bArr2);
                }
                zo6Var.f392256e = xf4Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.yf4 yf4Var3 = new r45.yf4();
                if (bArr3 != null && bArr3.length > 0) {
                    yf4Var3.parseFrom(bArr3);
                }
                zo6Var.f392257f = yf4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.fu5 fu5Var3 = new r45.fu5();
            if (bArr4 != null && bArr4.length > 0) {
                fu5Var3.parseFrom(bArr4);
            }
            zo6Var.f392258g = fu5Var3;
        }
        return 0;
    }
}
