package r45;

/* loaded from: classes4.dex */
public class gb3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gi5 f375070d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hk f375071e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gb3)) {
            return false;
        }
        r45.gb3 gb3Var = (r45.gb3) fVar;
        return n51.f.a(this.BaseResponse, gb3Var.BaseResponse) && n51.f.a(this.f375070d, gb3Var.f375070d) && n51.f.a(this.f375071e, gb3Var.f375071e);
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
            r45.gi5 gi5Var = this.f375070d;
            if (gi5Var != null) {
                fVar.i(2, gi5Var.computeSize());
                this.f375070d.writeFields(fVar);
            }
            r45.hk hkVar = this.f375071e;
            if (hkVar != null) {
                fVar.i(3, hkVar.computeSize());
                this.f375071e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.gi5 gi5Var2 = this.f375070d;
            if (gi5Var2 != null) {
                i18 += b36.f.i(2, gi5Var2.computeSize());
            }
            r45.hk hkVar2 = this.f375071e;
            return hkVar2 != null ? i18 + b36.f.i(3, hkVar2.computeSize()) : i18;
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
        r45.gb3 gb3Var = (r45.gb3) objArr[1];
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
                gb3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.gi5 gi5Var3 = new r45.gi5();
                if (bArr2 != null && bArr2.length > 0) {
                    gi5Var3.parseFrom(bArr2);
                }
                gb3Var.f375070d = gi5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.hk hkVar3 = new r45.hk();
            if (bArr3 != null && bArr3.length > 0) {
                hkVar3.parseFrom(bArr3);
            }
            gb3Var.f375071e = hkVar3;
        }
        return 0;
    }
}
