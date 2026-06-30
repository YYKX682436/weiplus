package r45;

/* loaded from: classes2.dex */
public class pr0 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383323e;

    /* renamed from: f, reason: collision with root package name */
    public int f383324f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383322d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f383325g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr0)) {
            return false;
        }
        r45.pr0 pr0Var = (r45.pr0) fVar;
        return n51.f.a(this.BaseResponse, pr0Var.BaseResponse) && n51.f.a(this.f383322d, pr0Var.f383322d) && n51.f.a(this.f383323e, pr0Var.f383323e) && n51.f.a(java.lang.Integer.valueOf(this.f383324f), java.lang.Integer.valueOf(pr0Var.f383324f)) && n51.f.a(this.f383325g, pr0Var.f383325g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383325g;
        java.util.LinkedList linkedList2 = this.f383322d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f383323e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f383324f);
            fVar.g(5, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar2 = this.f383323e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f383324f) + b36.f.g(5, 3, linkedList);
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
        r45.pr0 pr0Var = (r45.pr0) objArr[1];
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
                pr0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                pr0Var.f383323e = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                pr0Var.f383324f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            pr0Var.f383325g.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr3 != null && bArr3.length > 0) {
                finderObject.parseFrom(bArr3);
            }
            pr0Var.f383322d.add(finderObject);
        }
        return 0;
    }
}
