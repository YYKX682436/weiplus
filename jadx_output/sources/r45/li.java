package r45;

/* loaded from: classes2.dex */
public class li extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f379496d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov3 f379497e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.li)) {
            return false;
        }
        r45.li liVar = (r45.li) fVar;
        return n51.f.a(this.BaseResponse, liVar.BaseResponse) && n51.f.a(this.f379496d, liVar.f379496d) && n51.f.a(this.f379497e, liVar.f379497e);
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
            r45.nv3 nv3Var = this.f379496d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f379496d.writeFields(fVar);
            }
            r45.ov3 ov3Var = this.f379497e;
            if (ov3Var != null) {
                fVar.i(3, ov3Var.computeSize());
                this.f379497e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f379496d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            r45.ov3 ov3Var2 = this.f379497e;
            return ov3Var2 != null ? i18 + b36.f.i(3, ov3Var2.computeSize()) : i18;
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
        r45.li liVar = (r45.li) objArr[1];
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
                liVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.parseFrom(bArr2);
                }
                liVar.f379496d = nv3Var3;
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
            r45.ov3 ov3Var3 = new r45.ov3();
            if (bArr3 != null && bArr3.length > 0) {
                ov3Var3.parseFrom(bArr3);
            }
            liVar.f379497e = ov3Var3;
        }
        return 0;
    }
}
