package r45;

/* loaded from: classes4.dex */
public class j86 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377648d;

    /* renamed from: e, reason: collision with root package name */
    public int f377649e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f377650f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377651g;

    /* renamed from: h, reason: collision with root package name */
    public int f377652h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j86)) {
            return false;
        }
        r45.j86 j86Var = (r45.j86) fVar;
        return n51.f.a(this.BaseResponse, j86Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f377648d), java.lang.Integer.valueOf(j86Var.f377648d)) && n51.f.a(java.lang.Integer.valueOf(this.f377649e), java.lang.Integer.valueOf(j86Var.f377649e)) && n51.f.a(this.f377650f, j86Var.f377650f) && n51.f.a(this.f377651g, j86Var.f377651g) && n51.f.a(java.lang.Integer.valueOf(this.f377652h), java.lang.Integer.valueOf(j86Var.f377652h));
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
            fVar.e(2, this.f377648d);
            fVar.e(3, this.f377649e);
            r45.cu5 cu5Var = this.f377650f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f377650f.writeFields(fVar);
            }
            java.lang.String str = this.f377651g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f377652h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f377648d) + b36.f.e(3, this.f377649e);
            r45.cu5 cu5Var2 = this.f377650f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            java.lang.String str2 = this.f377651g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f377652h);
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
        r45.j86 j86Var = (r45.j86) objArr[1];
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
                    j86Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                j86Var.f377648d = aVar2.g(intValue);
                return 0;
            case 3:
                j86Var.f377649e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    j86Var.f377650f = cu5Var3;
                }
                return 0;
            case 5:
                j86Var.f377651g = aVar2.k(intValue);
                return 0;
            case 6:
                j86Var.f377652h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
