package r45;

/* loaded from: classes4.dex */
public class xr extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public r45.ur f390349e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390348d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390350f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xr)) {
            return false;
        }
        r45.xr xrVar = (r45.xr) fVar;
        return n51.f.a(this.BaseResponse, xrVar.BaseResponse) && n51.f.a(this.f390348d, xrVar.f390348d) && n51.f.a(this.f390349e, xrVar.f390349e) && n51.f.a(this.f390350f, xrVar.f390350f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390350f;
        java.util.LinkedList linkedList2 = this.f390348d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 2, linkedList2);
            r45.ur urVar = this.f390349e;
            if (urVar != null) {
                fVar.i(3, urVar.computeSize());
                this.f390349e.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 2, linkedList2);
            r45.ur urVar2 = this.f390349e;
            if (urVar2 != null) {
                i18 += b36.f.i(3, urVar2.computeSize());
            }
            return i18 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.xr xrVar = (r45.xr) objArr[1];
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
                xrVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            xrVar.f390348d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ur urVar3 = new r45.ur();
                if (bArr3 != null && bArr3.length > 0) {
                    urVar3.parseFrom(bArr3);
                }
                xrVar.f390349e = urVar3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.tr trVar = new r45.tr();
            if (bArr4 != null && bArr4.length > 0) {
                trVar.parseFrom(bArr4);
            }
            xrVar.f390350f.add(trVar);
        }
        return 0;
    }
}
