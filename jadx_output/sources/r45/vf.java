package r45;

/* loaded from: classes4.dex */
public class vf extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.mg f388181d;

    /* renamed from: e, reason: collision with root package name */
    public r45.mg f388182e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vf)) {
            return false;
        }
        r45.vf vfVar = (r45.vf) fVar;
        return n51.f.a(this.BaseResponse, vfVar.BaseResponse) && n51.f.a(this.f388181d, vfVar.f388181d) && n51.f.a(this.f388182e, vfVar.f388182e);
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
            r45.mg mgVar = this.f388181d;
            if (mgVar != null) {
                fVar.i(2, mgVar.computeSize());
                this.f388181d.writeFields(fVar);
            }
            r45.mg mgVar2 = this.f388182e;
            if (mgVar2 != null) {
                fVar.i(3, mgVar2.computeSize());
                this.f388182e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.mg mgVar3 = this.f388181d;
            if (mgVar3 != null) {
                i18 += b36.f.i(2, mgVar3.computeSize());
            }
            r45.mg mgVar4 = this.f388182e;
            return mgVar4 != null ? i18 + b36.f.i(3, mgVar4.computeSize()) : i18;
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
        r45.vf vfVar = (r45.vf) objArr[1];
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
                vfVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.mg mgVar5 = new r45.mg();
                if (bArr2 != null && bArr2.length > 0) {
                    mgVar5.parseFrom(bArr2);
                }
                vfVar.f388181d = mgVar5;
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
            r45.mg mgVar6 = new r45.mg();
            if (bArr3 != null && bArr3.length > 0) {
                mgVar6.parseFrom(bArr3);
            }
            vfVar.f388182e = mgVar6;
        }
        return 0;
    }
}
