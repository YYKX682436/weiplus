package r45;

/* loaded from: classes8.dex */
public class ix1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.by1 f377386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377387e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xn1 f377388f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ix1)) {
            return false;
        }
        r45.ix1 ix1Var = (r45.ix1) fVar;
        return n51.f.a(this.BaseResponse, ix1Var.BaseResponse) && n51.f.a(this.f377386d, ix1Var.f377386d) && n51.f.a(this.f377387e, ix1Var.f377387e) && n51.f.a(this.f377388f, ix1Var.f377388f);
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
            r45.by1 by1Var = this.f377386d;
            if (by1Var != null) {
                fVar.i(2, by1Var.computeSize());
                this.f377386d.writeFields(fVar);
            }
            java.lang.String str = this.f377387e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.xn1 xn1Var = this.f377388f;
            if (xn1Var != null) {
                fVar.i(4, xn1Var.computeSize());
                this.f377388f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.by1 by1Var2 = this.f377386d;
            if (by1Var2 != null) {
                i18 += b36.f.i(2, by1Var2.computeSize());
            }
            java.lang.String str2 = this.f377387e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.xn1 xn1Var2 = this.f377388f;
            return xn1Var2 != null ? i18 + b36.f.i(4, xn1Var2.computeSize()) : i18;
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
        r45.ix1 ix1Var = (r45.ix1) objArr[1];
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
                ix1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.by1 by1Var3 = new r45.by1();
                if (bArr2 != null && bArr2.length > 0) {
                    by1Var3.parseFrom(bArr2);
                }
                ix1Var.f377386d = by1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            ix1Var.f377387e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.xn1 xn1Var3 = new r45.xn1();
            if (bArr3 != null && bArr3.length > 0) {
                xn1Var3.parseFrom(bArr3);
            }
            ix1Var.f377388f = xn1Var3;
        }
        return 0;
    }
}
