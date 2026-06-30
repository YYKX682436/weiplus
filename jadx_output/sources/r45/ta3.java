package r45;

/* loaded from: classes9.dex */
public class ta3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yx3 f386232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386233e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vx3 f386234f;

    /* renamed from: g, reason: collision with root package name */
    public int f386235g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta3)) {
            return false;
        }
        r45.ta3 ta3Var = (r45.ta3) fVar;
        return n51.f.a(this.BaseResponse, ta3Var.BaseResponse) && n51.f.a(this.f386232d, ta3Var.f386232d) && n51.f.a(this.f386233e, ta3Var.f386233e) && n51.f.a(this.f386234f, ta3Var.f386234f) && n51.f.a(java.lang.Integer.valueOf(this.f386235g), java.lang.Integer.valueOf(ta3Var.f386235g));
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
            r45.yx3 yx3Var = this.f386232d;
            if (yx3Var != null) {
                fVar.i(2, yx3Var.computeSize());
                this.f386232d.writeFields(fVar);
            }
            java.lang.String str = this.f386233e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.vx3 vx3Var = this.f386234f;
            if (vx3Var != null) {
                fVar.i(4, vx3Var.computeSize());
                this.f386234f.writeFields(fVar);
            }
            fVar.e(5, this.f386235g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.yx3 yx3Var2 = this.f386232d;
            if (yx3Var2 != null) {
                i18 += b36.f.i(2, yx3Var2.computeSize());
            }
            java.lang.String str2 = this.f386233e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.vx3 vx3Var2 = this.f386234f;
            if (vx3Var2 != null) {
                i18 += b36.f.i(4, vx3Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f386235g);
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
        r45.ta3 ta3Var = (r45.ta3) objArr[1];
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
                ta3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.yx3 yx3Var3 = new r45.yx3();
                if (bArr2 != null && bArr2.length > 0) {
                    yx3Var3.parseFrom(bArr2);
                }
                ta3Var.f386232d = yx3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            ta3Var.f386233e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ta3Var.f386235g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.vx3 vx3Var3 = new r45.vx3();
            if (bArr3 != null && bArr3.length > 0) {
                vx3Var3.parseFrom(bArr3);
            }
            ta3Var.f386234f = vx3Var3;
        }
        return 0;
    }
}
